package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.*;

import javax.print.attribute.standard.RequestingUserName;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MyModule());
        MyMath myMath = injector.getInstance(MyMath.class);
        //MyMath myMath = new MyMath(new User("Jan"));
        System.out.format("Hello World");
        System.out.format("2^4 is %d", myMath.power(4));
        //System.out.format()
    }
}
