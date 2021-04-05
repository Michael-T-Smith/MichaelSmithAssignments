package com.michaelsmith.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.michaelsmith.lookify.models.Song;
import com.michaelsmith.lookify.repository.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;
	
	//Intialize songService;
	public SongService(SongRepository songRepo) {
	songRepository = songRepo;
	}
	
	// find all songs
	
	public List<Song> allSongs() {
		return songRepository.findAll();
	}
	
	//find single song
	public Song findSong(Long id) {
		return songRepository.findById(id).orElse(null);
	}
	
	//create a new song
	public Song createSong(Song song) {
		return songRepository.save(song);
	}
	
	//delete a song off the dash-board.
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
}
