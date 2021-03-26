package pl.kalinowski.jakub.PortalAukcyjny.mapper;

import pl.kalinowski.jakub.PortalAukcyjny.entity.AuctionEntity;
import pl.kalinowski.jakub.PortalAukcyjny.model.AuctionDto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AuctionMapper {
    public static List<AuctionDto> mapEntityListToDtoList(List<AuctionEntity> entities) {

        List<AuctionDto> result = new ArrayList<>();

        for (AuctionEntity entity : entities) {
            AuctionDto dto = mapeEntityToDto(entity);
            result.add(dto);
        }

        return result;
}
    public static AuctionDto mapeEntityToDto(AuctionEntity entity) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return new AuctionDto(
                entity.getId(),
                entity.getTitle(),
                entity.getCategory(),
                entity.getBid(),
                entity.getDescription(),
                entity.getEndingTime()
                );
    }
}
