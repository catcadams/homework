package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String skillsList() {
        String html = "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<h2>" +
                    "<ol>" +
                        "<li> Python </li>" +
                         "<li> Java </li>" +
                         "<li> SQL </li>" +
                     "</ol>" +
                "</h2>" +
                "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String favoriteLangForm() {
        String htmlForm = "<html>" +
                "<body>" +
                "<form method= 'post'>" +
                "<label> Name: " +
                "<input type='text' name='name'>" +
                "</label>" +
                "<br>" +
                "<label> My favorite first language: " +
                "<select name='language1'>" +
                "<option value='Python'> Python</option>" +
                "<option value ='Java'> Java </option>"+
                "<option value = 'SQL'> SQL </option>" +
                "</select>" +
                "</label>" +
                 "<br>" +
                "<label> My second favorite language: " +
                "<select name='language2'>" +
                "<option value='Python'> Python</option>" +
                "<option value ='Java'> Java </option>"+
                "<option value = 'SQL'> SQL </option>" +
                "</select>" +
                "</label>" +
                "<br>" +
                "<label> My third favorite language: " +
                "<select name='language3'>" +
                "<option value='Python'> Python</option>" +
                "<option value ='Java'> Java </option>"+
                "<option value = 'SQL'> SQL </option>" +
                "</select>" +
                "</label>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
        return htmlForm;
    }

   @PostMapping("form")
   @ResponseBody
   public String formOutput(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        String output = "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Name</th>" +
                "<th>Preference 1</th>" +
                "<th>Preference 2</th>" +
                "<th>Preference 3</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + name + "</td>" +
                "<td>" + language1 + "</td>" +
                "<td>" + language2 + "</td>" +
                "<td>" + language3 + "</td>"+
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
        return output;
   }
}
