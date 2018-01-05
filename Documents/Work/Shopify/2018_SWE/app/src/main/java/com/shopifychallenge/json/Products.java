package com.shopifychallenge.json;

public class Products
{
    private String tags;

    private String handle;

    private String published_scope;

    private String vendor;

    private String body_html;

    private Image image;

    private String product_type;

    private String published_at;

    //private null template_suffix;

    private String id;

    private String title;

    private String updated_at;

    private Images[] images;

    private Variants[] variants;

    private String created_at;

    private Options[] options;

    public String getTags ()
    {
        return tags;
    }

    public void setTags (String tags)
    {
        this.tags = tags;
    }

    public String getHandle ()
    {
        return handle;
    }

    public void setHandle (String handle)
    {
        this.handle = handle;
    }

    public String getPublished_scope ()
    {
        return published_scope;
    }

    public void setPublished_scope (String published_scope)
    {
        this.published_scope = published_scope;
    }

    public String getVendor ()
    {
        return vendor;
    }

    public void setVendor (String vendor)
    {
        this.vendor = vendor;
    }

    public String getBody_html ()
    {
        return body_html;
    }

    public void setBody_html (String body_html)
    {
        this.body_html = body_html;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getProduct_type ()
    {
        return product_type;
    }

    public void setProduct_type (String product_type)
    {
        this.product_type = product_type;
    }

    public String getPublished_at ()
    {
        return published_at;
    }

    public void setPublished_at (String published_at)
    {
        this.published_at = published_at;
    }

   // public null getTemplate_suffix ()
{
   // return template_suffix;
}

   // public void setTemplate_suffix (null template_suffix)
   // {
   //     this.template_suffix = template_suffix;
   // }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public Images[] getImages ()
    {
        return images;
    }

    public void setImages (Images[] images)
    {
        this.images = images;
    }

    public Variants[] getVariants ()
    {
        return variants;
    }

    public void setVariants (Variants[] variants)
    {
        this.variants = variants;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }


    public Options[] getOptions ()
    {
        return options;
    }

    public void setOptions (Options[] options)
    {
        this.options = options;
    }


    @Override
    public String toString()
    {
        // took out template suffix, variants and options
        //return "ClassPojo [tags = "+tags+", handle = "+handle+", published_scope = "+published_scope+", vendor = "+vendor+", body_html = "+body_html+", image = "+image+", product_type = "+product_type+", published_at = "+published_at+", template_suffix = "+template_suffix+", id = "+id+", title = "+title+", updated_at = "+updated_at+", images = "+images+", variants = "+variants+", created_at = "+created_at+", options = "+options+"]";
        return "ShopifyAPI [tags = "+tags+", handle = "+handle+", published_scope = "+published_scope+", vendor = "+vendor+", body_html = "+body_html+", image = "+image+", product_type = "+product_type+", published_at = "+published_at+", id = "+id+", title = "+title+", updated_at = "+updated_at+", images = "+images+", created_at = "+created_at+"]";

    }
}

