package pl.kalinowski.jakub.PortalAukcyjny.resources;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kalinowski.jakub.PortalAukcyjny.entity.AuctionEntity;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuctionRepository extends CrudRepository<AuctionEntity, Long> {
    List<AuctionEntity> findAuctionsByCompleted(boolean completed);
}
