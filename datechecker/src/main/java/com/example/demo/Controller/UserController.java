package com.example.demo.Controller;

import com.example.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

    @Controller
    public class UserController {

        @GetMapping("/addDate")
        public String sendForm(User user) {

            return "addDate";
        }

        @PostMapping("/addDate")
        public String processForm(User user) {
            if(user.getEndDate().before(user.getStartDate())){
                return "showError";
            }
            return "showMessage";
        }
    }