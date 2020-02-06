package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne(){
        ProductInfo productInfo = productService.findOne("1234");
        System.out.println(productInfo);
        Assert.assertEquals("1234", productInfo.getProductId());
    }

    @Test
    public void findUpAll(){
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0, productInfoList.size());
    }

    @Test
    public void findAll(){
        // 查询第0页
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setGetProductIcon("www.xxxx.jpg");
        productInfo.setProductId("1235");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductDescription("皮皮虾");
        productInfo.setProductPrice(new BigDecimal("3.5"));
        productInfo.setProductStock(100);
        productInfo.setProductStatus(0);
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

}