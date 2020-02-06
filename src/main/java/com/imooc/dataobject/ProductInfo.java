package com.imooc.dataobject;

import javax.persistence.Id;
import java.math.BigDecimal;

public class ProductInfo {

    /**
     * 商品ID(因为商品ID是自己的定义的，所以就不采用自增的注解)
     */
    @Id
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品存储
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 小图
     */





}
