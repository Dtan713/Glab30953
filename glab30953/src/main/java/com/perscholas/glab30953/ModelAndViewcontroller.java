package com.perscholas.glab30953;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    int id;
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';

        @GetMapping("/goToUserViewPage")
        public ModelAndView UserModelAndView() {
            List<User> listUsers = new ArrayList<User>();
            listUsers.add(new User(1,"Haseeb","haseeb@abc.com,"));
            listUsers.add(new User(2,"Shahparan","Shahparan@abc.com,"));
            listUsers.add(new User(3,"James","James@abc.com,"));
            listUsers.add(new User(4,"Joseph","Joseph@abc.com,"));

            ModelAndView modelAndView = new ModelAndView("userdata");
            modelAndView.addObject("userlist", listUsers);
            return modelAndView;
        }
    }
}