package com.mycompany.Practice7_5;

public class Main {
    public static void main(String[] args) {
        // In thông báo cho Docker
        System.out.println("Hello from Docker!");
        
        // Demo sử dụng class User
        User user = new User("user1", "user1@cmucs246.com");
        System.out.println("Initial email: " + user.getEmail());
        
        user.setEmail("newemail@cmucs246.com");
        System.out.println("After setEmail: " + user.getEmail());
        
        user.updateEmail("updatedemail@cmucs246.com");
        System.out.println("After updateEmail: " + user.getEmail());
    }
}