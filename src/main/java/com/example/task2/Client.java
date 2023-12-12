package com.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor 
public class Client {
    private static int count = 0;
    private int id = ++count;
    private String name;
    private int age;
    private String sex;
    private String mail;
}
