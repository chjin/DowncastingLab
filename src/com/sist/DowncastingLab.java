package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class DowncastingLab {
    public static void main(String[] args) {
        Person person=new Student("정도전");       //upcasting
        Student student;

        //downcasting
        student=(Student)person;

        System.out.println(student.name);   //다 보임.
        student.grade="A";
    }
}
