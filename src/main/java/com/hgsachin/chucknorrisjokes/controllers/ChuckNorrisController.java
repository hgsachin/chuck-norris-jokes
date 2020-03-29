package com.hgsachin.chucknorrisjokes.controllers;

import com.hgsachin.chucknorrisjokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {

    private JokesService jokesService;

    public ChuckNorrisController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getRandomCNQuotes(Model model) {
        String quote = jokesService.getJokes();
        model.addAttribute("quote", quote);
        return "chuckNorris";
    }
}
