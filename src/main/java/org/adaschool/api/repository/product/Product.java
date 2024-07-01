package org.adaschool.api.repository.product;

import java.util.List;
import java.util.UUID;

public class Product {

    private String id;

    private String name;

    private String description;

    private String category;

    private List<String> tags;

    private double price;

    private String imageUrl;

    public Product() {
        this.id = UUID.randomUUID().toString();
        this.name = "";
        this.description = "";
        this.category = "";
        this.tags = List.of();
        this.price = 0.0;
        this.imageUrl = "";
    }

    public Product(String id, String name, String description, String category, double price) {
        this.id = id != null ? id : UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.category = category;
        this.tags = List.of();
        this.price = price;
        this.imageUrl = "";
    }

    public Product(ProductDto productDto) {
        this.id = UUID.randomUUID().toString();
        this.name = productDto.getName();
        this.description = productDto.getDescription();
        this.category = productDto.getCategory();
        this.tags = productDto.getTags() != null ? productDto.getTags() : List.of();
        this.price = productDto.getPrice();
        this.imageUrl = productDto.getImageUrl();
    }

    public String getId() {

        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void update(ProductDto productDto) {
        this.name = productDto.getName();
        this.description = productDto.getDescription();
        this.category = productDto.getCategory();
        this.tags = productDto.getTags();
        this.price = productDto.getPrice();
        this.imageUrl = productDto.getImageUrl();
    }
}
