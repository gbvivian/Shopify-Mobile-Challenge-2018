package com.shopifychallenge.json;

public class Variants
{
    private String position;

    private String weight;

    private String product_id;

    private String taxable;

    private String inventory_policy;

    private String weight_unit;

    private String sku;

    private String fulfillment_service;

    private String inventory_item_id;

    private String id;

    private String option1;

    private String title;

    private String updated_at;

    private String price;

    private String requires_shipping;

    private String old_inventory_quantity;

    private String grams;

    private String created_at;

    private String inventory_quantity;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getTaxable ()
    {
        return taxable;
    }

    public void setTaxable (String taxable)
    {
        this.taxable = taxable;
    }

    public String getInventory_policy ()
    {
        return inventory_policy;
    }

    public void setInventory_policy (String inventory_policy)
    {
        this.inventory_policy = inventory_policy;
    }

    public String getWeight_unit ()
    {
        return weight_unit;
    }

    public void setWeight_unit (String weight_unit)
    {
        this.weight_unit = weight_unit;
    }

    public String getSku ()
    {
        return sku;
    }

    public void setSku (String sku)
    {
        this.sku = sku;
    }

    public String getFulfillment_service ()
    {
        return fulfillment_service;
    }

    public void setFulfillment_service (String fulfillment_service)
    {
        this.fulfillment_service = fulfillment_service;
    }

    public String getInventory_item_id ()
    {
        return inventory_item_id;
    }

    public void setInventory_item_id (String inventory_item_id)
    {
        this.inventory_item_id = inventory_item_id;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getOption1 ()
    {
        return option1;
    }

    public void setOption1 (String option1)
    {
        this.option1 = option1;
    }


    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getPrice ()
    {
        return price;
    }

    public void setPrice (String price)
    {
        this.price = price;
    }

    public String getRequires_shipping ()
    {
        return requires_shipping;
    }

    public void setRequires_shipping (String requires_shipping)
    {
        this.requires_shipping = requires_shipping;
    }

    public String getOld_inventory_quantity ()
    {
        return old_inventory_quantity;
    }

    public void setOld_inventory_quantity (String old_inventory_quantity)
    {
        this.old_inventory_quantity = old_inventory_quantity;
    }

    public String getGrams ()
    {
        return grams;
    }

    public void setGrams (String grams)
    {
        this.grams = grams;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getInventory_quantity ()
    {
        return inventory_quantity;
    }

    public void setInventory_quantity (String inventory_quantity)
    {
        this.inventory_quantity = inventory_quantity;
    }

    @Override
    public String toString()
    {
        return "ShopifyAPI [position = "+position+", weight = "+weight+", product_id = "+product_id+", taxable = "+taxable+", inventory_policy = "+inventory_policy+", weight_unit = "+weight_unit+", sku = "+sku+", fulfillment_service = "+fulfillment_service+", inventory_item_id = "+inventory_item_id+", id = "+id+", option1 = "+option1+", title = "+title+", updated_at = "+updated_at+", price = "+price+", requires_shipping = "+requires_shipping+", old_inventory_quantity = "+old_inventory_quantity+", grams = "+grams+", created_at = "+created_at+", inventory_quantity = "+inventory_quantity+"]";
    }
}

