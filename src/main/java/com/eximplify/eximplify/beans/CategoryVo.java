package com.eximplify.eximplify.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CategoryVo {
    private String label;
    private String title;
    private List<CategoryItemVo> itemVos;
}
