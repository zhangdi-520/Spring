package com.spring.concert;

public class Dance implements Performance {
    @Override
    public void perform() {
        System.out.println("开始跳舞咯");
    }
}
