package com.labs.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String getAlbums(Model model){
        Album NightVisions=new Album("Night Visions","Imagine Dragons","https://upload.wikimedia.org/wikipedia/en/3/3f/Night_Visions_Album_Cover.jpeg",11,43.51);
        Album Reckless=new Album("Reckless ","Bryan Adams","https://upload.wikimedia.org/wikipedia/en/5/56/Bryan_Adams_-_Reckless.jpg",8,37.58);
        Album Falling=new Album("Falling into You","Celine Dion","https://upload.wikimedia.org/wikipedia/en/2/29/FallingIntoYouAlbum.jpg",12,67);
        List<Album>albums=new ArrayList<Album>();
        albums.add(NightVisions);
        albums.add(Reckless);
        albums.add(Falling);
        model.addAttribute("albums",albums);
        return "albums.html";
    }

}
