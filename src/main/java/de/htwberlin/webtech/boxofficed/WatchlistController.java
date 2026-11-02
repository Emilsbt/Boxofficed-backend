package de.htwberlin.webtech.boxofficed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WatchlistController {

    @Autowired
    WatchlistService service;

    @GetMapping("/watchlist")
    public List<WatchlistEntry> getAllEntries() {
        return service.getAll();
    }

    @GetMapping("/watchlist/{id}")
    public WatchlistEntry getEntry(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping("/watchlist")
    public WatchlistEntry createEntry(@RequestBody WatchlistEntry entry) {
        return service.save(entry);
    }
}