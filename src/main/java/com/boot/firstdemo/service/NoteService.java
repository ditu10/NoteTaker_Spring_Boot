package com.boot.firstdemo.service;

import com.boot.firstdemo.model.Note;

import java.util.List;

public interface NoteService {
    public Note save(Note note);
    public Note get(int noteId);
    public List<Note> getAll();
    public void edit(Note note);
    public void delete(int noteId);
}
