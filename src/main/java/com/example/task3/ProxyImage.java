package com.example.task3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage {
    private String filename;

    @Override
    public void display() {
        RealImage img = new RealImage(this.filename);
        img.display();
    }
    
}
