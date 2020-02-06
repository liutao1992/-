package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    // 查询所有上架的商品
    List<ProductInfo> findUpAll();

    // Pageable 表示分页
    Page<ProductInfo> findAll(Pageable pageable);

    // 保存
    ProductInfo save(ProductInfo productInfo);

    // 增加库存

    // 减库存


}
