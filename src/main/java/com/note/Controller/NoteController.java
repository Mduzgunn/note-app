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


}
