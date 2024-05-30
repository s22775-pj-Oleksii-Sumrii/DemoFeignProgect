package org.example.demofeignprogect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
    private final FeignServiceUntil feignServiceUntil;

    public FeignDemoController(FeignServiceUntil feignServiceUntil) {
        this.feignServiceUntil = feignServiceUntil;
    }

    @GetMapping("/username")
    public String getUserName(){
        return feignServiceUntil.getName();
    }

    @GetMapping("/user-address")
    public String getAddressAdd(){
        return feignServiceUntil.getAddress();
    }

    @GetMapping("/user-status")
    public String getStatusAdd(){
        return feignServiceUntil.getStatus();
    }
}
