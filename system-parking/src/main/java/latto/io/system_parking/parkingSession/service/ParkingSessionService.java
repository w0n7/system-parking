package latto.io.system_parking.parkingSession.service;

import latto.io.system_parking.parkingSession.repository.ParkingSessionRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSessionService {
    private  final ParkingSessionRepository parkingSessionRepository;

    public ParkingSessionService(ParkingSessionRepository parkingSessionRepository) {
        this.parkingSessionRepository = parkingSessionRepository;
    }

    public void createParkingSession() {

    }
}
