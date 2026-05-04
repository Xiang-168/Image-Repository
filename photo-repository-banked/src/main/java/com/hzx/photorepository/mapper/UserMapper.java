package com.hzx.photorepository.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hzx.photorepository.model.entity.User;
import org.apache.ibatis.session.ResultHandler;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
* @author Hzx
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2026-05-04 12:57:18
* @Entity generator.domain.User
*/
public interface UserMapper extends BaseMapper<User> {

}




