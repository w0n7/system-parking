package latto.io.system_parking.parkingSession.dto.request;

import jakarta.validation.constraints.NotEmpty;
import latto.io.system_parking.parkingSession.entity.TypeVehicleEnum;

public record CreateParkingSessionRequest(@NotEmpty(message = "The plate is required") String plate,
                                          @NotEmpty(message = "The type of vehicle is required")TypeVehicleEnum typeVehicleEnum
                                          ) {
}
