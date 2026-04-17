package com.friendsworkspace.repository;

import com.friendsworkspace.model.Amenity;
import com.friendsworkspace.model.AmenityStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmenityRepository extends JpaRepository<Amenity, Long> {
    List<Amenity> findByAvailabilityStatus(AmenityStatus status);
}
