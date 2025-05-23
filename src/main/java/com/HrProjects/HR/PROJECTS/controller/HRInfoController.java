package com.HrProjects.HR.PROJECTS.controller;

import com.HrProjects.HR.PROJECTS.model.HRInfo;
import com.HrProjects.HR.PROJECTS.service.HRInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hr")
@CrossOrigin(origins = "*") // For dev only; limit origins in production!
public class HRInfoController {

      private final HRInfoService hrInfoService;

      @Autowired
      public HRInfoController(HRInfoService hrInfoService) {
            this.hrInfoService = hrInfoService;
      }

      // CREATE
      @PostMapping
      public ResponseEntity<HRInfo> createHRInfo(@RequestBody HRInfo hrInfo) {
            HRInfo savedHrInfo = hrInfoService.saveHRInfo(hrInfo);
            return ResponseEntity.ok(savedHrInfo);
      }

      // READ ALL
      @GetMapping
      public ResponseEntity<List<HRInfo>> getAllHRInfo() {
            List<HRInfo> hrInfos = hrInfoService.getAllHrInfos();
            return ResponseEntity.ok(hrInfos);
      }

      // READ ONE BY ID
      @GetMapping("/{id}")
      public ResponseEntity<HRInfo> getHRInfoById(@PathVariable Long id) {
            Optional<HRInfo> hrInfoOptional = hrInfoService.getHRInfoById(id);
            return hrInfoOptional
                        .map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
      }

      // DELETE (optional, uncomment if needed)
      /*
       * @DeleteMapping("/{id}")
       * public ResponseEntity<Void> deleteHRInfo(@PathVariable Long id) {
       * hrInfoService.deleteHRInfo(id);
       * return ResponseEntity.noContent().build();
       * }
       */
}
