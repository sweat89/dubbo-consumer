package com.mt.dubbo.demo.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        SmsSendResult4Ems ss1 = new SmsSendResult4Ems();
        SmsSendResult4Ems ss2 = new SmsSendResult4Ems();
        System.out.println(ss1.equals(ss2));
        Executor e = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
    }
}
