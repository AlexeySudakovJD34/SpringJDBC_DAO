package com.example.springjdbcdao.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.springjdbcdao.utils.SqlUtils.read;

@Repository
@RequiredArgsConstructor
public class MyOrderDAO implements OrderDAO {

    private final NamedParameterJdbcTemplate template;
    private final String sqlScript = read("select_product.sql");

    @Override
    public List<String> getProductNameByCustomerName(String name) {

        MapSqlParameterSource param = new MapSqlParameterSource("name", name);

        return template.queryForList(sqlScript, param, String.class);
    }
}
