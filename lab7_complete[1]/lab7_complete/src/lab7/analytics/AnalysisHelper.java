/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.toMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;
import lab7.utilities.MapSorter;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    
    
    
    
    /**
     * Top 5 proactive users overall (sum of comments, posts and likes)
     * @author Sumesh
     */
    public void getFiveInactiveUsersByOverall(){
        Map<Integer,Integer> userProactiveCount = generateUsersProactiveMap();
       
        List<Map.Entry<Integer,Integer>> sortedMapList = MapSorter.sortMapByValueAscending(userProactiveCount);
        System.out.println("Top 5 Inactive users overall:");
        for(int i = 0;i<5;i++){
            Integer userID = sortedMapList.get(i).getKey();
            Integer proactiveCount = sortedMapList.get(i).getValue();
            System.out.printf("%d. user ID: %d ; active count: %d \n",i+1,userID,proactiveCount);
        }
    }
    
    /**
     * Top 5 proactive users overall (sum of comments, posts and likes)
     * @author Sumesh
     */
    public void getFiveProactiveUsersByOverall(){
       Map<Integer,Integer> userProactiveCount = generateUsersProactiveMap();
       
       List<Map.Entry<Integer,Integer>> sortedMapList = MapSorter.sortMapByValueDescend(userProactiveCount);
       System.out.println("Top 5 proactive users overall:");
       for(int i = 0;i<5;i++){
           Integer userID = sortedMapList.get(i).getKey();
           Integer proactiveCount = sortedMapList.get(i).getValue();
           System.out.printf("%d. user ID: %d ; active count: %d \n",i+1,userID,proactiveCount);
       }
       
    }
    
    /**
     * generate a map of user and his corresponding posts count, by post map provided by data store
     * @return
     * @author Sumesh
     */
    private Map<Integer,Integer> generateUserPostCount(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Integer> userPostCount = new HashMap<>();
        for(Post post:posts.values()){
            if(!userPostCount.containsKey(post.getUserId()))
                userPostCount.put(post.getUserId(),1);
            else
                userPostCount.put(post.getUserId(),userPostCount.get(post.getUserId()).intValue()+1);
        }
        return userPostCount;
    }
    
    private Map generateUsersProactiveMap(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,User> users = DataStore.getInstance().getUsers();
       
        Map<Integer,Integer> userProactiveCount = new LinkedHashMap<>();
        for(User user : users.values()){
            int comments_num = user.getCommentsNum();
            int likes_num = user.getLikesNum();
            Map<Integer,Integer> userPostCount = generateUserPostCount();
            int posts_num = userPostCount.get(user.getId());
           
            int proactiveCount = comments_num + likes_num + posts_num;
            userProactiveCount.put(user.getId(), proactiveCount);
       }
        
        return userProactiveCount;
    }
}
