package com.example.visit_record;

import com.example.visit_record.entity.Dept;
import com.example.visit_record.service.IDeptService;
import com.example.visit_record.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;
import java.time.LocalDateTime;


@SpringBootApplication
@MapperScan(basePackages = "mapper")
public class VisitRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisitRecordApplication.class, args);



    }









}
