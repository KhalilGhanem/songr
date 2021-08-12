package com.labs.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getSongs(Model model){
        model.addAttribute("songs",songRepository.findAll());
        return "songs.html";
    }

    @GetMapping("/addSong")
    public RedirectView addSong(){
     //Album album=new Album("Freedom","Akon","https://upload.wikimedia.org/wikipedia/en/0/0a/AkonFreedom.PNG",13,48.50);

        Album album= albumRepository.findById(1).get();
        Song song=new Song("Right now",4.32,1,album);

        songRepository.save(song);

        return new RedirectView("/songs");
    }
}
