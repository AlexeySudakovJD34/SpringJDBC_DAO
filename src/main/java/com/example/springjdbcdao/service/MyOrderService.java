package com.example.springjdbcdao.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.springjdbcdao.repository.OrderDAO;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MyOrderService implements OrderService {

    private final OrderDAO orderDao;

    @Override
    public String getProductNameByCustomerName(String name) {
        return String.join(", ", orderDao.getProductNameByCustomerName(name));
    }
}
