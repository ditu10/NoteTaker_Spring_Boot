package com.boot.firstdemo.controller;

import com.boot.firstdemo.dao.NoteRepository;
import com.boot.firstdemo.model.Note;
import com.boot.firstdemo.service.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NoteController {
    @Autowired
    private NoteServiceImpl noteService;

    @RequestMapping("/addNote")
    public String showForm(){
        return "addNoteForm";
    }

    @PostMapping("/saveNote")
    public String saveNote(@ModelAttribute Note note, Model model){
        System.out.println(note);
        Note note1 = noteService.save(note);
        System.out.println(note1);
        return "redirect:/notes";
    }

    @GetMapping("/note/{noteId}")
    @ResponseBody
    public String getNote(@PathVariable("noteId") int id){
        Note note = noteService.get(id);
        return note.toString();
    }

    @RequestMapping("/notes")
    public String getAllNotes(Model model){
        List<Note> notes = noteService.getAll();
        model.addAttribute("notes", notes);
        return "viewAllNotes";
    }

    @RequestMapping("/DeleteNote")
    public String deleteNote(@RequestParam("note_id") int id){
        noteService.delete(id);
        return "redirect:/notes";
    }
    @RequestMapping("/EditNote")
    public String editNote(@RequestParam("note_id") int id, Model model){
        Note note = noteService.get(id);
        model.addAttribute("note", note);
        return "editNoteForm";
    }

    @PostMapping("/EditNote")
    public String handleEditNote(@ModelAttribute Note note, Model model){
//        System.out.println(note);
        noteService.edit(note);
        return "redirect:/notes";
    }

}
