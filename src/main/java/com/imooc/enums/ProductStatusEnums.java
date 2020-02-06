package com.imooc.enums;

public enum ProductStatusEnums {

    UP(0, "上架"),
    DOWN(1, "下架");

    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    ProductStatusEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
