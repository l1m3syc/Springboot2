package com.springboot.chapter3.pojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component("user")
public class User {
    @Value("1")
    private Long id;
    @Value("user_name_1")
    private String userName;
    @Value("note_1")
    private String note;
    public void setId(Long id){
        this.id = id;
    }
    public Long getId() {
        System.out.println("this is getId()");
        return this.id;
    }
    public String getUserName() {
        System.out.println("this is getUserName()");
        return this.userName;
    }
    public String getNote() {
        System.out.println("this is getNote()");
        return this.note;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setNote(String Note){
        this.note = note;
    }

}
