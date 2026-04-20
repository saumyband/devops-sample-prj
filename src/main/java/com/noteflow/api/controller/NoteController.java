package com.noteflow.api.controller;

import com.noteflow.api.model.Note;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final List<Note> notes = new ArrayList<>();

    public NoteController() {
        notes.add(new Note(1L, "Frontend", "Learn ReactJs, SCSS"));
        notes.add(new Note(2L, "Backend", "Learn SpringBoot, MSSQL"));
        notes.add(new Note(3L, "DevOps", "Learn Linux, AWS"));
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return notes;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        for (Note note : notes) {
            if (note.getId().equals(id)) {
                return ResponseEntity.ok(note);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        long newId = notes.size() + 1L;
        note.setId(newId);
        notes.add(note);
        return note;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) {
        for (Note note : notes) {
            if (note.getId().equals(id)) {
                notes.remove(note);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }


}
