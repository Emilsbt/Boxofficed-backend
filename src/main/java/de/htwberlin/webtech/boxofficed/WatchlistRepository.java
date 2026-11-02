package de.htwberlin.webtech.boxofficed;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends CrudRepository<WatchlistEntry, Long> { }