package pl.kalinowski.jakub.PortalAukcyjny.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.kalinowski.jakub.PortalAukcyjny.model.AuctionDto;
import pl.kalinowski.jakub.PortalAukcyjny.service.AuctionService;

import java.util.List;

@Controller
public class AuctionsController {

    @Autowired
    private AuctionService auctionService;

    @RequestMapping(value = "/auctions", method = RequestMethod.GET)
    public String auctions(Model model){
        List<AuctionDto> active = auctionService.findAllActive();
        model.addAttribute("active", active);

        return "auctions";
    }
}
