package com.HrProjects.HR.PROJECTS.controller;

import com.HrProjects.HR.PROJECTS.model.HRInfo;
import com.HrProjects.HR.PROJECTS.service.HRInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hr")
@CrossOrigin(origins = "*") // Allows requests from any frontend (adjust for production)
public class HRInfoController {

      private final HRInfoService hrInfoService;

      @Autowired
      public HRInfoController(HRInfoService hrInfoService) {
            this.hrInfoService = hrInfoService;
      }

      // CREATE
      @PostMapping
      public HRInfo createHRInfo(@RequestBody HRInfo hrInfo) {
            return hrInfoService.saveHRInfo(hrInfo);
      }

      // READ ALL
      @GetMapping
      public List<HRInfo> getAllHRInfo() {
            return hrInfoService.getAllHrInfos();
      }

      // READ ONE BY ID
      @GetMapping("/{id}")
      public Optional<HRInfo> getHRInfoById(@PathVariable Long id) {
            return hrInfoService.getHRInfoById(id);
      }

      // // DELETE
      // @DeleteMapping("/{id}")
      // public void deleteHRInfo(@PathVariable Long id) {
      //       hrInfoService.deleteHRInfo(id);
      // }
}
