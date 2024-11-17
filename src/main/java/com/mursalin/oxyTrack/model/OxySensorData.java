package com.mursalin.oxyTrack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OxySensorData {

    private String deviceId;
    private LocalDateTime timestamp;
    private double oxygenLevel;
    private String unit;
}
