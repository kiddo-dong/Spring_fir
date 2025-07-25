package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {

        // 스프링 컨텍스트의 인스턴스를 생성한다.
            var context = new AnnotationConfigApplicationContext();
            Parrot p = new Parrot();
        }
    }