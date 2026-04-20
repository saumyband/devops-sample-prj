package com.noteflow.api.controller;

import com.noteflow.api.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return List.of(
                new Note(1L, "Frontend", "Learn ReactJs, SCSS"),
                new Note(2L, "Backend", "Learn SpringBoot, MSSQL"),
                new Note(3L, "DevOps", "Learn Linux, AWS")
        );
    }
}
