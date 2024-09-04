package com.busvoyage.busvoyage.repository;

import com.busvoyage.busvoyage.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
