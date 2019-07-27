package com.example.visit_record.service.impl;

import com.example.visit_record.entity.Dept;
import com.example.visit_record.mapper.DeptMapper;
import com.example.visit_record.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author CDHong
 * @since 2019-07-27
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
