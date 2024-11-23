package com.mursalin.oxyTrack.repository;

import com.mursalin.oxyTrack.model.OxySensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OxyRepository extends JpaRepository<OxySensorData, Long> {

}
