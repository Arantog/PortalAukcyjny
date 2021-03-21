package pl.kalinowski.jakub.PortalAukcyjny.resources;

import org.springframework.data.repository.CrudRepository;
import pl.kalinowski.jakub.PortalAukcyjny.entity.AuctionEntity;

import java.util.List;

public interface AuctionRepository extends CrudRepository<AuctionEntity, Long> {
    List<AuctionEntity> findAuctionsById();
}
