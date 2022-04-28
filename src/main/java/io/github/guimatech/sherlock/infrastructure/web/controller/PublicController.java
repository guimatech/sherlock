package io.github.guimatech.sherlock.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.Reader;
import java.util.Optional;

@Controller
@RequestMapping(path = "/public")
public class PublicController {

    private static final String MESSAGE = "message";
    private static final String BILLINGS = "media";

    @PostMapping("/upload-media-file")
    public String saveMediaFile(@RequestParam("file") MultipartFile file, Model model) {
        if (file.isEmpty()) {
            model.addAttribute(MESSAGE, "Por favor, Selecione um arquivo de mídia para o upload.");
            return BILLINGS;
        }

        return BILLINGS;
    }

    @GetMapping
    public String index(Model model) {
        return BILLINGS;
    }
}
