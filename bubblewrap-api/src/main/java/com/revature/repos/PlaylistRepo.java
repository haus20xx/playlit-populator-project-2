package com.revature.repos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Playlist;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {
	List<Playlist> findByOwnerId(int id);

	List<Playlist> findByOwnerId(int id, Pageable pageabble);

	Page<Playlist> findAll(Pageable pageable);
}
