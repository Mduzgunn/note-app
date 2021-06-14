package com.note.Entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    List<Note> notes;

    public Category(){
        super();
    }

    public Category(@NotNull String name, List<Note> notes){
        super();
        this.name=name;
        this.notes=notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }



    public void addNote(Note note) {
        if (getNotes() == null) {
            this.notes = new ArrayList<>();
        }
        getNotes().add(note);
        note.setCategory(this);
    }

}
