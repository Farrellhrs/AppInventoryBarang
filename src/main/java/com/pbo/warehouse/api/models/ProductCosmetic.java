package com.pbo.warehouse.api.models;

import java.util.Date;

public class ProductCosmetic extends Product {
    private Date expireDate;

    public ProductCosmetic() {
        super("product_cosmetics");
    }

}
