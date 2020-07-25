package com.mymall.easymall.product.dao;

import com.mymall.easymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhao
 * @email sunlightcs@gmail.com
 * @date 2020-07-24 23:22:07
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
