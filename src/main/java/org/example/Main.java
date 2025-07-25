package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {

        // spring 에서 bean 추가를 가장 먼저 학습하는 이유
        // 스프링이 bean 일부인 객체만 관리가 가능.

        // 스프링 컨텍스트의 인스턴스를 생성한다.
            var context = new AnnotationConfigApplicationContext();
            Parrot p = new Parrot();

        }
    }