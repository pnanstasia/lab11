package com.example.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Oles")
                                .age(32)
                                .gender("m")
                                .mark(100)
                                .mark(63)
                                .grades(List.of(99, 98))
                                .build();
        System.out.println(user);
    }
}