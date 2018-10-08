package com.example.webservice.mapper.employee;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EmployeeMapper {

    List<Map<String, Object>> getEmployee();
}