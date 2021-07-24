package com.riying.springcloud.controller;


import com.riying.springcloud.entity.CommonResult;
import com.riying.springcloud.entity.Payment;
import com.riying.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Mirai Zhao
 * @create 2021-06-24
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverport;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create (@RequestBody Payment payment){
        int result=paymentService.create(payment);
        if (result>0){
            return new CommonResult(200,"插入数据成功,serverport: "+serverport,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById (@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        if (payment!=null){
            return new CommonResult(200,"查询成功,serverport: "+serverport,payment);
        }else {
            return new CommonResult(444,"没有对应结果记录，查询ID："+id,null);
        }
    }

    /**
     * 发现服务
     * @return
     */
    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element :
                services) {
            log.info("*****element"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance :
                instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri()+"\t");
        }
        return this.discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverport;
    }
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() throws InterruptedException {
         try {
             TimeUnit.SECONDS.sleep(3);
         }catch (InterruptedException e){
             e.printStackTrace();
         }
         return serverport;
    }
}
