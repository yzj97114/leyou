package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * description: CategoryService
 * date: 2020/1/5 20:36
 * version: 1.0
 * @author: 79282
 */
public interface CategoryService {
    List<Category> queryListByParent(Long pid);
}
