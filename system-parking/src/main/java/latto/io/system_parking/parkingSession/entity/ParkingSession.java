package latto.io.system_parking.parkingSession.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "parkingSessions")
public class ParkingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String plate;

    @CreationTimestamp
    private Instant creationTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    private BigDecimal totalPayable;

    private Boolean paid;

    private TypeVehicleEnum typeVehicle;

    private Integer chosenHours;

    private Integer additionalHours;

    public ParkingSession(){}

    public ParkingSession(String plate, Instant creationTimestamp, Instant updateTimestamp, BigDecimal totalPayable, Boolean paid, TypeVehicleEnum typeVehicle, Integer chosenHours, Integer additionalHours) {
        this.plate = plate;
        this.creationTimestamp = creationTimestamp;
        this.updateTimestamp = updateTimestamp;
        this.totalPayable = totalPayable;
        this.paid = paid;
        this.typeVehicle = typeVehicle;
        this.chosenHours = chosenHours;
        this.additionalHours = additionalHours;
    }
}
