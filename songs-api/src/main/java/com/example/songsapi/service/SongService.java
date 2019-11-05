package com.example.songsapi.service;

import com.example.songsapi.model.Song;

public interface SongService {
    Iterable<Song> getSongs();
}
