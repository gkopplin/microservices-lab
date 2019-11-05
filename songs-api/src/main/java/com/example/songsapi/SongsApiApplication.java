package com.example.songsapi;

import com.example.songsapi.model.Song;
import com.example.songsapi.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SongsApiApplication {

	@Autowired
	SongService songService;

	@RequestMapping("/")
	public String getSongs() {
//		return songService.getSongs();
		return "songs";
	}

	public static void main(String[] args) {
		SpringApplication.run(SongsApiApplication.class, args);
	}

}