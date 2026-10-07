package de.htwberlin.webtech.boxofficed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WatchlistController {

    @GetMapping("/")
    public List<WatchlistEntry> index() {
        return List.of(new WatchlistEntry("M1"), new WatchlistEntry("M2"),new WatchlistEntry("M3"),new WatchlistEntry("M4"));
    }

}
