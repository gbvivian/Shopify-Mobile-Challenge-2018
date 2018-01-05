package com.shopifychallenge.json;

public class ShopifyAPI
{
    private Products[] products;

    public Products[] getProducts ()
    {
        return products;
    }

    public void setProducts (Products[] products)
    {
        this.products = products;
    }

    @Override
    public String toString()
    {
        return "ShopifyAPI [products = "+products+"]";
    }
}