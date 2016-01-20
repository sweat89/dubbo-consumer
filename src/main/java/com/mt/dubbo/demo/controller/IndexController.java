package com.mt.dubbo.demo.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.rpc.RpcContext;
import com.mt.dubbo.demo.service.DemoService;
import com.mt.dubbo.demo.vo.Result;

@Controller
@RequestMapping("/dubbo")
public class IndexController extends BaseController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public Result index(HttpServletRequest request) throws InterruptedException, ExecutionException {
        String result = demoService.sayHello("aa");
        System.out.println(result + "===");
        Future<String> f = RpcContext.getContext().getFuture();
        System.out.println(f.get());
        return this.result(0, "", "");
    }

}
