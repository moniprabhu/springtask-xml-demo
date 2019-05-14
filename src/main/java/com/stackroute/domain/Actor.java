package com.stackroute.domain;

public class Actor  {
    private String name;
    private String gender;
    private String age;

    public String getName() {

        return name;
    }

    public String getGender() {

        return gender;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {

        this.name = name;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAge(String age) {

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
