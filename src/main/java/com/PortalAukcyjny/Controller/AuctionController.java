package com.PortalAukcyjny.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {
    @RequestMapping(path = "/auctions")
    public String auctions(){
        return "Siema";
    }
}
