package uy.ushort.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.ushort.data.LinkRequest;
import uy.ushort.data.LinkResponse;
import uy.ushort.services.IHomeService;

@RestController
public class HomeController {
    @Autowired
    private IHomeService homeService;

    @GetMapping("/")
    public ResponseEntity<?> homeResponse() {
        return ResponseEntity.ok(homeService.homeResponse());
    }

    @GetMapping("/il/{path}")
    public String largeResponse(@PathVariable String path) {
        return homeService.getLargeURL(path);
    }

    @PostMapping("/create")
    public LinkResponse create(@RequestBody LinkRequest url) {
        return homeService.create(url);
    }
}