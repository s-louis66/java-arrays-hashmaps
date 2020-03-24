package com.ttshw;

public class pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    @Override
    public String toString() {
        return (" Name: " + this.getName()+
                " Age: " + this.getAge()+
                " Location: " + this.getLocation()+
                " Type: " + this.getType());
    }

    public pet() {
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getLocation() {
        return location;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setType(String type) {
        this.type = type;
    }
}
