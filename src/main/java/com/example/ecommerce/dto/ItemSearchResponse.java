package com.example.ecommerce.dto;

import com.example.ecommerce.model.Item;

import java.util.List;

public class ItemSearchResponse {
    private List<Item> items;
    private Long count;
    private String page;
    private Long totalRecords;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }
}
