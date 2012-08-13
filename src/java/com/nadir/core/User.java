package com.nadir.core;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
    
    private String name;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void check(){
        if(name.equals("java")){
            msg="Valid user , Access granted!";
        }else{
            msg="Invalid user ,Please try again!";
        }
    }
}
