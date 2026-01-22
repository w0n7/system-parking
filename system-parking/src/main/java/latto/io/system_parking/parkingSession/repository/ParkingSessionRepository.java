package latto.io.system_parking.parkingSession.repository;

import latto.io.system_parking.parkingSession.entity.ParkingSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSessionRepository extends JpaRepository<ParkingSession, UUID> {
}
