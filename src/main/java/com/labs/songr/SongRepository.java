package com.labs.songr;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Integer> {
}