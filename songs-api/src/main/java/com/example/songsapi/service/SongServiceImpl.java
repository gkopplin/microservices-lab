package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import com.example.songsapi.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public Iterable<Song> getSongs() {
        return songRepository.findAll();
    }

    @Override
    public Song getSong(Long songId) {
        return findSong(songId);
    }

    @Override
    public HttpStatus deleteSong(Long songId) {
        Song song = findSong(songId);
        songRepository.delete(song);
        return HttpStatus.OK;
    }

    @Override
    public Song updateSong(Long songId, Song song) {
        Song updatedSong = songRepository.save(song);
        return updatedSong;
    }

    private Song findSong(Long songId) {
        return songRepository.findById(songId).get();
    }
}
