package com.stackroute.domain;
import org.springframework.beans.factory.annotation.Autowired;
public class Actor  {
    private String name;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private String gender;
    private int age;
    public Actor(){}



    public String getName() {

        return name;
    }

    public String getGender() {

        return gender;
    }

    public int  getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


}
