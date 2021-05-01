package com.efe;

public class UserManager {

    public void add(User user) {

        System.out.println(user.getFirstName() + " " + user.getLastName()+" isimli kullanıcı sisteme eklendi.");
    }

    public void remove(User user) {

        System.out.println(user.getFirstName() + " " + user.getLastName()+" isimli kullanıcı sistemden silindi.");
    }
    public void addMultiple(User users[]){
        for (User user:users){
            add(user);
        }
    }
}
