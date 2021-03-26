package pl.kalinowski.jakub.PortalAukcyjny.model;


import java.time.LocalDateTime;

public class AuctionDto {

    private int id;
    private String title;
    private Category category;
    private double bid;
    private String description;
    private boolean comleted;

    public AuctionDto(int id, String title, Category category, double bid, String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.bid = bid;
        this.description = description;
        this.comleted = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
