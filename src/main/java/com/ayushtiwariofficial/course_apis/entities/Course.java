package com.ayushtiwariofficial.course_apis.entities;

public class Course {
    
    private long id;
    private String name;
    private String description;

    Course(long id, String name, String description){
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }
    Course(){
        super();
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Course [id=" +id+ ", name=" +name+ ", description=" +description+ "]";
    }
}
