package com.mycompany.practice_slide7_5;

import com.cmucs426.model.User;

public class Practice_Slide7_5 {
    public static void main(String[] args) {
        User user = new User("user1", "user1@cmucs246.com");
        System.out.println("User email: " + user.getEmail());
    }
}