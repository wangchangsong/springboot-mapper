package com.mapper.example.mapper.BaseMapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wcs on 2017/11/26.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}