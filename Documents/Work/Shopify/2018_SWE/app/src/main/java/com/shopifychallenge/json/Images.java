package com.shopifychallenge.json;

public class Images
{
    private String position;

    private String id;

    private String height;

    private String updated_at;

    private String product_id;

    private String width;

    private String created_at;

    private String src;

    private String[] variant_ids;

    public String getPosition ()
    {
        return position;
    }

    public void setPosition (String position)
    {
        this.position = position;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getProduct_id ()
    {
        return product_id;
    }

    public void setProduct_id (String product_id)
    {
        this.product_id = product_id;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getSrc ()
    {
        return src;
    }

    public void setSrc (String src)
    {
        this.src = src;
    }

    public String[] getVariant_ids ()
    {
        return variant_ids;
    }

    public void setVariant_ids (String[] variant_ids)
    {
        this.variant_ids = variant_ids;
    }

    @Override
    public String toString()
    {
        return "ShopifyAPI [position = "+position+", id = "+id+", height = "+height+", updated_at = "+updated_at+", product_id = "+product_id+", width = "+width+", created_at = "+created_at+", src = "+src+", variant_ids = "+variant_ids+"]";
    }
}


