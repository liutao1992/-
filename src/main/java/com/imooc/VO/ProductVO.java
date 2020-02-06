package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 商品包含类目
 */
public class ProductVO {

    // @JsonProperty("name") 对应接口name字段
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private String categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ProductInfoVO> getProductInfoVOList() {
        return productInfoVOList;
    }

    public void setProductInfoVOList(List<ProductInfoVO> productInfoVOList) {
        this.productInfoVOList = productInfoVOList;
    }

    public void setCategoryType(Integer categoryType) {
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }
}
