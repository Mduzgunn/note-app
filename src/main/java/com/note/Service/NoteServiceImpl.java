package com.note.Service;

import com.note.Entity.Category;
import com.note.Repository.CategoryRepository;
import com.note.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.note.Entity.Note;
@Component
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note addNote(Note note, long id){
        return noteRepository.save(note);
    }

    @Override
    public Note editNote(Note note, long id) {
        return null;
    }

    @Override
    public void deleteNote(long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Note findNote(long id) {
        return null;
    }
}
