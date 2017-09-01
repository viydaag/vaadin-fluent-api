package com.vaadin.fluent.pojo;

import java.time.LocalDate;

public class Person {
    
    private int id;
    
    private String name;
    
    private LocalDate birthday;

    public Person() {

    }

    public Person(int id, String name, LocalDate birthday) {
        super();
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
