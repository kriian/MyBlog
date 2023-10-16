package ru.hehnev.myblog.service;

import ru.hehnev.myblog.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNote();
    Note findNoteByTitle(String title);
    void save(Note note);
}
