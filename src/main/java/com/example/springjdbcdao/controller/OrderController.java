package com.example.springjdbcdao.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.springjdbcdao.service.OrderService;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/fetch-product")
    @ResponseBody
    public String getProductNameByCustomerName(@RequestParam(value = "name") String name) {
        return orderService.getProductNameByCustomerName(name);
    }

}
