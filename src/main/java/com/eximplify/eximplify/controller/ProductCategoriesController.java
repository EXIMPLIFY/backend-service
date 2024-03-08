package com.eximplify.eximplify.controller;

import com.eximplify.eximplify.beans.ProductCategoriesVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoriesController {
    @GetMapping("/api/v1/getProductCategories")
    public ProductCategoriesVo getProductCategories(){
        return new ProductCategoriesVo();
    }
}
