package com.mymall.easymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mymall.common.utils.PageUtils;
import com.mymall.easymall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author zhao
 * @email sunlightcs@gmail.com
 * @date 2020-07-24 23:22:06
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

