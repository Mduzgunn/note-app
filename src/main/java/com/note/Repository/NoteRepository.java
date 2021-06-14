package com.note.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.note.Entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{
}
