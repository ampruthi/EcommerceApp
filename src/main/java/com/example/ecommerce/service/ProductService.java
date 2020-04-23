package com.example.ecommerce.service;

import com.example.ecommerce.dto.ItemSearchResponse;
import com.example.ecommerce.model.Item;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    public Item addItem(Item item) {

        return null;
    }

    public ItemSearchResponse searchItem(Optional<String> itemName, Optional<String> brand, Optional<Long> minPrice, Optional<Long> maxPrice, Optional<String> color, Optional<String> sku, Optional<String> seller) {

        return null;
    }
}
