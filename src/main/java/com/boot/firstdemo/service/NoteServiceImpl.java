package com.boot.firstdemo.service;

import com.boot.firstdemo.dao.NoteRepository;
import com.boot.firstdemo.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public Note save(Note note){
        return noteRepository.save(note);
    }
    public Note get(int noteId){
        return noteRepository.findById(noteId).get();
    }

    public List<Note> getAll(){
        List<Note> notes = new ArrayList<>();
        Iterable<Note> noteIterable =  noteRepository.findAll();
        noteIterable.forEach(notes::add);
        return notes;
    }

    public void edit(Note note) {

        Note currentNote = noteRepository.findById(note.getId()).get();
        System.out.println(currentNote);
        System.out.println("--------------");
        currentNote.setTitle(note.getTitle());
        currentNote.setDescription(note.getDescription());
        System.out.println(currentNote);
        noteRepository.save(currentNote);
    }

    public void delete(int noteId) {
        noteRepository.deleteById(noteId);
    }

}
