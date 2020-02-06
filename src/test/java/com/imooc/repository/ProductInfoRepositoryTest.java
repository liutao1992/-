package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setGetProductIcon("www.xxxx.jpg");
        productInfo.setProductId("1234");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductDescription("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal("3.2"));
        productInfo.setProductStock(100);
        productInfo.setProductStatus(0);

        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByProductStatus() {

        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }
}