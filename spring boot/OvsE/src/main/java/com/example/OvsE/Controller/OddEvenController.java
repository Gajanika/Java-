package com.example.OvsE.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OvsE.Model.RequestOvsE;
import com.example.OvsE.Model.ResponceOvsE;
import com.example.OvsE.Service.OddEvenService;

@RestController
@RequestMapping("/api")
public class OddEvenController {
    private final OddEvenService oddEvenService;

    public OddEvenController(OddEvenService oddEvenService) {
        this.oddEvenService = oddEvenService;
    }

    @PostMapping("/check")
    public ResponseEntity<ResponceOvsE> checkOddOrEven(@RequestBody RequestOvsE request) {
        ResponceOvsE response = oddEvenService.checkOddOrEven(request.getNumber());
        return ResponseEntity.ok(response);
    }
}
