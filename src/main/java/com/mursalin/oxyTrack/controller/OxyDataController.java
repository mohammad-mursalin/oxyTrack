package com.mursalin.oxyTrack.controller;

import com.mursalin.oxyTrack.model.OxySensorData;
import com.mursalin.oxyTrack.service.OxyService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/oxyTrack")
@CrossOrigin("http://localhost:5173/")
public class OxyDataController {

    private OxyService service;

    public OxyDataController(OxyService service) {
        this.service = service;
    }

    @PostMapping("/data")
    public void receiveData(@RequestBody OxySensorData data) {
        service.saveData(data);
    }

    @GetMapping("/")
    public OxySensorData getData() {
        return service.getData();
    }

    @GetMapping("/oxygen")
    public double getPercentage() {
        return service.getPercentage();
    }

    @GetMapping("/history")
    public List<OxySensorData> getHistory() {
        return new ArrayList<>();
    }
    
}
