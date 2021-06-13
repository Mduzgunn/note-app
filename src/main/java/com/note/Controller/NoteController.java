package com.note.Controller;

import com.note.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.note.Entity.Note;
@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/addNote/{id}")
    Note addNote(@RequestBody Note note, @PathVariable long id){
        return noteService.addNote(note, id);
    }

    @PutMapping("/editNote/{id}")
    Note editNote(@RequestBody Note note, @PathVariable long id){
        return noteService.editNote(note, id);
    }

    @DeleteMapping("/deleteNote/{id}")
    void deleteNote(@PathVariable long id) {
        noteService.deleteNote(id);
    }

    @GetMapping("/findNote/{id}")
    Note findNote(@PathVariable long id) {
        return noteService.findNote(id);
    }
}
