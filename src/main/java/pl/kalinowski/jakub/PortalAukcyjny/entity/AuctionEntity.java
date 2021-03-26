package pl.kalinowski.jakub.PortalAukcyjny.entity;

import pl.kalinowski.jakub.PortalAukcyjny.model.Category;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Auction")
public class AuctionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Category category;

    @Column
    private double bid;

    @Column
    private String description;

    @Column
    private boolean completed;

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

    public boolean getEndingTime() {
        return completed;
    }

    public void setEndingTime(boolean completed) {
        this.completed = completed;
    }
    //    @Column
//    private int remainingTime(){
//       return LocalDateTime.now().compareTo(finishDate);
//    }
//
//    private LocalDateTime finishDate;
//
//    private boolean completed(){
//        if(finishDate.isBefore(LocalDateTime.now())){
//            return true;
//        }else {
//            return false;
//        }
//
//    };
}