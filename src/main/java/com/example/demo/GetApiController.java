package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("getApi")
public class GetApiController {

    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")
    public String getRequest(){

        return "this is getRequest";
    }
}
