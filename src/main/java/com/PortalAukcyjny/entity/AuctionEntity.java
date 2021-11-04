package com.PortalAukcyjny.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Auction")
public class AuctionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    public AuctionEntity() {
    }

    public AuctionEntity(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionEntity that = (AuctionEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title);
    }

    @Override
    public String toString() {
        return "AuctionEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
