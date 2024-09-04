package com.busvoyage.busvoyage.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ReservationApiException extends RuntimeException {

    private final HttpStatus status;

    private final String message;

    public ReservationApiException(HttpStatus status, String message) {
        this.message = message;
        this.status = status;
    }

}
