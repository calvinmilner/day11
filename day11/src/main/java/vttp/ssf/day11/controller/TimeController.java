package vttp.ssf.day11.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Make this a request handler
@Controller
// Handles the /time resource
@RequestMapping(path = "/time")
public class TimeController {
    @GetMapping("/gmt")
    public String getTimeGmt(Model model) {
        String currentTime = (new Date()).toString();
        model.addAttribute("time", "this is the GMT time " + currentTime);
        return "time";
    }
    // This method to handle GET /time
    // Inject the model into the handler
    @GetMapping()
    public String getTime(Model model) {
        // Generate some data for your view
        String currentTime = (new Date()).toString();
        // Bind data to the model
        model.addAttribute("time", currentTime);
        // Display the template/view
        return "time";
    }
}
