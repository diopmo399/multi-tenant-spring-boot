package com.amran.dynamic.multitenant.controller;

import com.amran.dynamic.multitenant.mastertenant.entity.User;
import com.amran.dynamic.multitenant.tenant.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/signup")
public class SignupController {
    @Autowired
    SignupService signupService;

    @PostMapping
    public User singnupUser(@RequestBody @Valid User user) {
        signupService.saveUser(user);
        return user;
    }


}
