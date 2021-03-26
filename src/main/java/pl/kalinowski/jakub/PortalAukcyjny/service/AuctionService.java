package pl.kalinowski.jakub.PortalAukcyjny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kalinowski.jakub.PortalAukcyjny.entity.AuctionEntity;
import pl.kalinowski.jakub.PortalAukcyjny.mapper.AuctionMapper;
import pl.kalinowski.jakub.PortalAukcyjny.model.AuctionDto;
import pl.kalinowski.jakub.PortalAukcyjny.resources.AuctionRepository;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class AuctionService {

    @Autowired
    private AuctionRepository auctionRepository;

    public List<AuctionDto> findAllActive() {

        List<AuctionEntity> todoEntities = auctionRepository.findAuctionsByCompleted(false);

        // jeśli jest konieczna jakaś dodatkowa logika biznesowa to dodajemy ją w tym miejscu

        List<AuctionDto> todoDtos = AuctionMapper.mapEntityListToDtoList(todoEntities);

        return todoDtos;
    }

}
