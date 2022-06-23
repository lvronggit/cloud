package com.lvrong.mongo.bo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class MongoTest {
    private Object id;
    private Integer age;
    private String name;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}