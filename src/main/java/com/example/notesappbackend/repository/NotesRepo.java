package com.example.notesappbackend.repository;

import com.example.notesappbackend.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepo extends JpaRepository<Notes,Long> {
}
