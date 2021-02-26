package com.lj.learning.proxyDemo;

/**
 * @author Jie.LJ.Liu
 * @date 2021/2/26 17:28
 */
public class Main {
    public static void main(String[] args) {
        MapperProxy mapperProxy = new MapperProxy();

        UserMapper userMapper = mapperProxy.newInstance(UserMapper.class);

        User user = userMapper.getUserById(1);

        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());

        System.out.println(userMapper);
    }
}
