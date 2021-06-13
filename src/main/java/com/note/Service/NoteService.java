package com.note.Service;
import com.note.Entity.Note;

public interface NoteService {
    Note addNote(Note note, long id);
    Note editNote(Note note, long id);
    void deleteNote(long id);
    Note findNote(long id);




}
