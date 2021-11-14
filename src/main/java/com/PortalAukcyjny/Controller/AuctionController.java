package com.PortalAukcyjny.Controller;

import com.PortalAukcyjny.entity.AuctionEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuctionController {
    @RequestMapping(path = "/auctions")
    public List<AuctionEntity> auctions(){
        return List.of(new AuctionEntity(1,"Test1"),
                new AuctionEntity(2,"Test2"));
    }
}
