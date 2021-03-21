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
    private double buyout;

    @Column
    private String description;

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