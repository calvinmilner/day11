package vttp.ssf.day11.controller;

import java.security.SecureRandom;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Make this a request handler
@Controller
// Handles the /image resource
@RequestMapping(path = {"/", "/index"})
public class ImageController {
    @GetMapping()
    public String getImage(Model model) {
        String[] src = {"/images/image.jpg", "/images/image1.jpg", "/images/image2.jpg", "/images/image3.jpg", "/images/image4.jpg", "/images/image5.jpg"};
        Random rand = new SecureRandom();
        int num = rand.nextInt(6);
        model.addAttribute("index", src[num]);
        return "index";
    }

}