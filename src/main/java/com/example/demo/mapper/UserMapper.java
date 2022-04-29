package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Update("INSERT INTO `user` (`username`, `nickname`, `password`) VALUES (#{username},#{nickname},#{password});")
    @Transactional
    void save(User user);

    @Update("update user set username=#{username},nickname=#{nickname} where id=#{id}")
    @Transactional
    void updateById(User user);

    @Delete("delete from user where id=#{id}")
    void deleteById(long id);

    @Select("select * from user where id =#{id}")
    User findById(long id);
}
