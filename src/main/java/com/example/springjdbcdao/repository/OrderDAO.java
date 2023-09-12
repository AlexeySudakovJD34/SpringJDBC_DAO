package com.example.springjdbcdao.repository;

import java.util.List;

public interface OrderDAO {
    List<String> getProductNameByCustomerName(String name);
}
