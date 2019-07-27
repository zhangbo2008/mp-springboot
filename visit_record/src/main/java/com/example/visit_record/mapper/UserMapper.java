package com.example.visit_record.mapper;

import com.example.visit_record.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author CDHong
 * @since 2019-07-27
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
