package com.example.songsapi.controller;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping("/")
    public Iterable<Song> getSongs() {
        return songService.getSongs();
    }

    @GetMapping("/{songId}")
    public Song getSong(@PathVariable Long songId) {
        return songService.getSong(songId);
    }

    @DeleteMapping("/{songId}")
    public HttpStatus deleteSong(@PathVariable Long songId) {
        return songService.deleteSong(songId);
    }

    @PutMapping("/{songId}")
    public Song updateSong(@PathVariable Long songId, @RequestBody Song song) {
        return songService.updateSong(songId, song);
    }
}
