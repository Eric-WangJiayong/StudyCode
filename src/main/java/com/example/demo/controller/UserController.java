package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//表示会被渲染成json
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;

    @GetMapping
    public List<User> getUser(){
        return userMapper.findAll();
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        userMapper.save(user);
        return "success";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        userMapper.updateById(user);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userMapper.deleteById(id);
        return "success";
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable("id") long id){
        return userMapper.findById(id);

    }
}
