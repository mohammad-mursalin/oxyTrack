package com.mursalin.oxyTrack.service;

import com.mursalin.oxyTrack.model.OxySensorData;

public interface OxyService {
    OxySensorData getData();

    double getPercentage();

    void saveData(OxySensorData data);
}
