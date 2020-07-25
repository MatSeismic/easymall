package com.mymall.easymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mymall.common.utils.PageUtils;
import com.mymall.easymall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author zhao
 * @email sunlightcs@gmail.com
 * @date 2020-07-24 23:22:07
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

