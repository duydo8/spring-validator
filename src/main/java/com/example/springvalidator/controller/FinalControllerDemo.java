package com.example.springvalidator.controller;

import com.example.springvalidator.entities.FinalEntityDemo;
import com.example.springvalidator.entities.InheritFinal;

import java.lang.reflect.Field;

public class FinalControllerDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FinalEntityDemo pf = new FinalEntityDemo();
        System.out.println(pf);
        Field f = pf.getClass().getDeclaredField("name");
        f.setAccessible(true);
        System.out.println("f.get(pf): " + f.get(pf));
        f.set(pf, "it will be replace");
        System.out.println(pf);
        System.out.println("f.get(pf): " + f.get(pf));

    }
}
