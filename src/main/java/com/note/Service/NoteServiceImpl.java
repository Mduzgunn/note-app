package com.note.Service;

import com.note.Entity.Category;
import com.note.Repository.CategoryRepository;
import com.note.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.note.Entity.Note;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    /**************** EKSİK KALDI KALANI YARINA İNŞ **********************/

    @Override
    public Note addNote(Note note, long id){
        Category category = categoryRepository.findById(id).orElse(null);
        category.addNote(note);
        return noteRepository.save(note);
    }

    @Override
    public Note editNote(Note note, long id) {
        Note existingNote = noteRepository.findById(id).orElse(null);
        existingNote.setTitle(note.getTitle());
        existingNote.setContent(note.getContent());
        return noteRepository.save(existingNote);
    }

    @Override
    public void deleteNote(long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Note findNote(long id) {
        return noteRepository.findById(id).orElse(null);
    }
}
