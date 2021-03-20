package pl.kalinowski.jakub.PortalAukcyjny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuctionsController {
    @RequestMapping(value = "/auctions", method = RequestMethod.GET)
    public void auctions(){

    }
}
