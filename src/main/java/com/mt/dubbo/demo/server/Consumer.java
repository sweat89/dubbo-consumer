package com.mt.dubbo.demo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mt.dubbo.demo.dto.Person;
import com.mt.dubbo.demo.service.DemoService;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        Person p = new Person(32, "a");
        String hello = demoService.getPersonInfo(p); // 执行远程方法
        System.out.println(hello); // 显示调用结果
    }
}
