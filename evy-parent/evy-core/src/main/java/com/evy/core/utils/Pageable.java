package com.evy.core.utils;

import lombok.Getter;
import lombok.ToString;

/**
 * @author Jonny
 * @Description:分页参数对象(前端传递), 需要分页继承此类
 * @date 2018/4/6上午8:34
 */
@ToString
@Getter
public abstract class Pageable {

    public static final int DEFAULT_PAGE_SIZE = 20;

    protected int currentPage = 1;

    protected int pageSize = DEFAULT_PAGE_SIZE;

    public Pageable() {
    }

    public Pageable(int currentPage, int pageSize) {
        if (currentPage > 0) { // 从1页开始算
            this.currentPage = currentPage;
        }
        if (pageSize > 0) {
            this.pageSize = pageSize;
        }
    }

    public void setCurrentPage(int currentPage) {
        if (currentPage > 0) {
            this.currentPage = currentPage;
        }
    }

    public void setPageSize(int pageSize) {
        if (pageSize > 0) {
            this.pageSize = pageSize;
        }
    }
}

