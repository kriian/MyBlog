package ru.hehnev.myblog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.hehnev.myblog.model.Note;
import ru.hehnev.myblog.service.NoteService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/notes")
public class NoteController {

    private final NoteService noteService;

    @GetMapping
    public List<Note> findAllNote() {
        return noteService.getAllNote();
    }

    @PostMapping(value = "/add")
    public void save(@RequestBody Note note) {
        noteService.save(note);
    }

    @GetMapping(value = "/{title}")
    public Note findNoteByTitle(@PathVariable String title) {
        return noteService.findNoteByTitle(title);
    }

}
