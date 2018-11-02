package com.evy.core.utils;

import com.github.pagehelper.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jonny
 * @Description:分页基础对象，带分页的结果统一构造此对象返回
 * @date 2018/4/6上午8:34
 */
@Getter
@Setter
@ToString
public class Pagenation<T> implements Serializable {

    private long totalCount;
    private int currentPage;
    private int pageSize;
    private long totalPage;
    private List<T> items;

    public Pagenation(List<T> items, long totalCount, int pageSize, int currentPage) {
        this.items = items;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalPage = totalCount / (long) pageSize;
        if (totalCount % (long) pageSize > 0L) {
            ++this.totalPage;
        }
    }

    public Pagenation(Page page){
        totalCount = page.getTotal();
        pageSize = page.getPageSize();
        currentPage = page.getPageNum();
        items = page.getResult();
        this.totalPage = totalCount / (long) pageSize;
        if (totalCount % (long) pageSize > 0L) {
            ++this.totalPage;
        }
    }

    public Pagenation() {
        this.pageSize = Pageable.DEFAULT_PAGE_SIZE;
        this.items = new ArrayList<>();
    }
}