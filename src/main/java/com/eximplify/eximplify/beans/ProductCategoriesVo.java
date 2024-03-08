package com.eximplify.eximplify.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ProductCategoriesVo {
    private List<CategoryVo> productCategories;
}
