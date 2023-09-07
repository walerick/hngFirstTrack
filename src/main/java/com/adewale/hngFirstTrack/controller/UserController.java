package com.adewale.hngFirstTrack.controller;

import com.adewale.hngFirstTrack.helper.UserResponse;
import com.adewale.hngFirstTrack.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping
public class UserController {
        private UserService userService;

        @GetMapping("/api")
        private UserResponse getUser(@RequestParam String slack_name , @RequestParam String track){
            return userService.getUserInfo();
        }

}
