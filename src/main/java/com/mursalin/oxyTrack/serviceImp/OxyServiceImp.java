package com.mursalin.oxyTrack.serviceImp;

import com.mursalin.oxyTrack.model.OxySensorData;
import com.mursalin.oxyTrack.service.OxyService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OxyServiceImp implements OxyService {
    @Override
    public OxySensorData getData() {
        return new OxySensorData("arduino_mkr_1010_001", LocalDateTime.now(), 0.72, "voltage");
    }

    @Override
    public double getPercentage() {
        OxySensorData data = new OxySensorData("arduino_mkr_1010_001", LocalDateTime.now(), 0.72, "voltage");
        return data.getOxygenLevel() * 100;
    }


}
