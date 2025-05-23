package com.HrProjects.HR.PROJECTS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HrProjects.HR.PROJECTS.model.HRInfo;
import com.HrProjects.HR.PROJECTS.repository.HRInfoRepository;

@Service
public class HRInfoService {   
      private final HRInfoRepository hrInfoRepository;

      @Autowired
      public HRInfoService(HRInfoRepository hrInfoRepository){
           this.hrInfoRepository = hrInfoRepository;
      }
      public HRInfo saveHRInfo(HRInfo hrInfo){
            return hrInfoRepository.save(hrInfo);
      }

      public List<HRInfo> getAllHrInfos(){
            return hrInfoRepository.findAll();
      }
      public Optional<HRInfo> getHRInfoById(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getHRInfoById'");
      }

}
