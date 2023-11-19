package com.engeto.RSSctecka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;

@RestController
public class ScifiController {

    @GetMapping ("/scifi") // test pro mne
    public String scifi(){
        return "Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí.\n" +
                "Síť propojených myslí ovládala každodenní život.\n" +
                "Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly.\n" +
                "Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům.\n" +
                "Otázka zní: Kdo skutečně vládne?";
    }

}
