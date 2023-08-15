package org.example;

import static org.example.utils.GetFriendsBirthYear.getFriendsBirthYear;

public class Solution {
    public static void main(String[] args) {
        String name = "Amigo";
        int age = 8;
        String city = "Mars";
        System.out.println("My friend " + name + " from " + city + " is born in " + getFriendsBirthYear(3126, age) + " and he is " + age + " years old.");
    }
}