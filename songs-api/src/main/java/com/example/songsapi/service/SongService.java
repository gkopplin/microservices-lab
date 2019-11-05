package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import org.springframework.http.HttpStatus;

public interface SongService {
    Iterable<Song> getSongs();

    Song getSong(Long songId);

    HttpStatus deleteSong(Long songId);

    Song updateSong(Long songId, Song song);
}
