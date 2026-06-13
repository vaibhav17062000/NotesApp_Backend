package com.example.notesappbackend.service;

import com.example.notesappbackend.entity.Notes;
import com.example.notesappbackend.repository.NotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
    @Autowired
    private NotesRepo notesRepo;

    public Notes save(Notes notes) {
        return notesRepo.save(notes);
    }

    public Notes updateNotes(Long id, Notes notes) {
        Notes notes1=notesRepo.findById(id).orElseThrow(()-> new RuntimeException("Notes not found"));
        notes1.setTitle(notes.getTitle());
        notes1.setDescription(notes.getDescription());
        return notesRepo.save(notes1);
    }
    public void deleteNotes(Long id) {
        notesRepo.deleteById(id);
    }
}
