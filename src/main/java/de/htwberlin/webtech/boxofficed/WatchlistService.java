package de.htwberlin.webtech.boxofficed;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchlistService {

    @Autowired
    WatchlistRepository repo;

    public WatchlistEntry save(WatchlistEntry entry) {
        return repo.save(entry);
    }

    public WatchlistEntry get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<WatchlistEntry> getAll() {
        Iterable<WatchlistEntry> iterator = repo.findAll();
        List<WatchlistEntry> entries = new ArrayList<>();
        for (WatchlistEntry entry : iterator) entries.add(entry);
        return entries;
    }
}