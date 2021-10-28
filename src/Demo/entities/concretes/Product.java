package Demo.entities.concretes;

import Demo.entities.abstracts.Entity;

public class Product implements Entity {

    private int id;
    private int categoryId;
    private String productName;
    private String detail;
    private int unitsInStock;
    private double price;

    public Product() {

    }

    public Product(int id, int categoryId, String productName, String detail, int unitsInStock, double price) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.detail = detail;
        this.unitsInStock = unitsInStock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
