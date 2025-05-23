package com.HrProjects.HR.PROJECTS.repository;

import com.HrProjects.HR.PROJECTS.model.HRInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRInfoRepository extends JpaRepository<HRInfo, Long> {
      
}
