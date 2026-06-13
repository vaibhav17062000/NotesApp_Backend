package com.example.notesappbackend.controller;

import com.example.notesappbackend.entity.Notes;
import com.example.notesappbackend.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5174")
public class NotesController {
    @Autowired
    private NotesService notesService;
    @PostMapping("/createnotes")
    public Notes createNotes(@RequestBody Notes notes){
        return notesService.save(notes);
    }
    @PutMapping("/notes/{id}")
    public Notes updateNotes(@PathVariable Long id, @RequestBody Notes notes){
        return notesService.updateNotes(id,notes);
    }
    @DeleteMapping("/notes/{id}")
    public String deleteNotes(@PathVariable Long id) {
        notesService.deleteNotes(id);
        return "Notes deleted";
    }
}

