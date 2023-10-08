package com.qf.common.base.utils;

import lombok.Data;

import java.util.List;

@Data
public class PageUtils<T> {

    private Integer currentPage;//当前页

    private Integer pageSize;//页量

    private Integer dataCount;//总数据量

    private Integer pageCount;//总页数

    private List<T> data;//当前页的数据

}
