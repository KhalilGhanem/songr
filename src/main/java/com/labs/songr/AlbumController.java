package com.labs.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String getAlbums(Model model){
//        Album NightVisions=new Album("Night Visions","Imagine Dragons","https://upload.wikimedia.org/wikipedia/en/3/3f/Night_Visions_Album_Cover.jpeg",11,43.51);
//        Album Reckless=new Album("Reckless ","Bryan Adams","https://upload.wikimedia.org/wikipedia/en/5/56/Bryan_Adams_-_Reckless.jpg",8,37.58);
//        Album Falling=new Album("Falling into You","Celine Dion","https://upload.wikimedia.org/wikipedia/en/2/29/FallingIntoYouAlbum.jpg",12,67);
//        List<Album>albums=new ArrayList<Album>();
//        albums.add(NightVisions);
//        albums.add(Reckless);
//        albums.add(Falling);
//        model.addAttribute("albums",albums);
        model.addAttribute("albums",albumRepository.findAll());
        return "albums.html";
    }

//    @PostMapping("/addAlbums")
//    @GetMapping("/addAlbums")
//    public RedirectView addAlbums(){
//        Album album=new Album("Freedom","Akon","https://upload.wikimedia.org/wikipedia/en/0/0a/AkonFreedom.PNG",13,48.50);
//        albumRepository.save(album);
//        return new RedirectView("/albums");
//    }
    @GetMapping("/addAlbums")
    public String addAlbums(){
        return "addAlbums.html";
    }

}
