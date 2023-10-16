package ru.hehnev.myblog.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hehnev.myblog.exception.NotFoundException;
import ru.hehnev.myblog.model.Note;
import ru.hehnev.myblog.repository.NoteRepository;
import ru.hehnev.myblog.service.NoteService;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> getAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note findNoteByTitle(String title) {
        return noteRepository.findNoteByTitle(title)
                .orElseThrow(() -> new NotFoundException("Не удолось найти данную заметку"));
    }

    @Override
    public void save(Note note) {
        note.setCreatedAt(LocalDateTime.now());
        noteRepository.save(note);
    }
}
