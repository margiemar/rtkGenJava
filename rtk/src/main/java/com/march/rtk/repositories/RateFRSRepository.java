package com.march.rtk.repositories;

import com.march.rtk.models.RateFRS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateFRSRepository extends JpaRepository <RateFRS, Integer> {
}
