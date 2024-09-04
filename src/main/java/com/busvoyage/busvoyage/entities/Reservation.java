package com.busvoyage.busvoyage.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bus_reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "bus_schedule_id")
    private BusSchedule busSchedule;

    private Long timestamp;

    private String departureDate;

    private int totalSeatBooked;

    private String seatNumbers;

    private String reservationStatus;

    private int totalPrice;
}
