package ru.skypro.homework.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.AdDTO;
import ru.skypro.homework.dto.AdsAddReq;
import ru.skypro.homework.dto.AdsGetResp;
import ru.skypro.homework.dto.ExtendedAdDTO;

import java.util.ArrayList;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/ads")
public class AdsController {


    @GetMapping()
    public ResponseEntity<?> getAllAds() {
        AdsGetResp resp = new AdsGetResp();
        resp.setResult(new ArrayList<>());
        return ResponseEntity.ok().body(resp);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getAds(@PathVariable Integer id) {
        ExtendedAdDTO extendedAdDTO = new ExtendedAdDTO();
        return ResponseEntity.ok().body(extendedAdDTO);
    }

    @PostMapping()
    public ResponseEntity<?> addAd(@RequestBody AdsAddReq req) {
        AdDTO adDTO = new AdDTO();
        return ResponseEntity.status(HttpStatus.CREATED).body(adDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> removeAd(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}


