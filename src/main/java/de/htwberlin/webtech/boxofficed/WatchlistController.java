package de.htwberlin.webtech.boxofficed;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WatchlistController {

    @CrossOrigin
    @GetMapping("/")
    public List<WatchlistEntry> index() {
    WatchlistEntry inception = new WatchlistEntry("Inception");
    inception.setGenre("Sci-Fi");
    inception.setRating(5);
    inception.setWatched(true);

    WatchlistEntry matrix = new WatchlistEntry("The Matrix");
    matrix.setGenre("Action");
    matrix.setRating(4);

    return List.of(inception, matrix);
    }
}