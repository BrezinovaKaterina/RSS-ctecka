package com.engeto.RSSctecka.controller;
import com.engeto.RSSctecka.File;
import com.engeto.RSSctecka.FileException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class RSSController {

//    @GetMapping ("/scifi") // test pro mne
//    public String scifi(){
//        return "Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí.\n" +
//                "Síť propojených myslí ovládala každodenní život.\n" +
//                "Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly.\n" +
//                "Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům.\n" +
//                "Otázka zní: Kdo skutečně vládne?";
//    }

    @GetMapping("/scifi")
    public static void textScifi() {
        getText("scifi");
    }

    @GetMapping("/historic")
    public static void textHistoric() {
        getText("historic");
    }

    @GetMapping("/romantic")
    public static void textRomantic() {
        getText("romantic");
    }


    private static String getText(String fileName) {
        File text = null;
        try {
            text = File.loadFromFile("/src/main/java/com/engeto/RSSctecka/"+fileName+".txt");
            return text.toString();
        } catch (FileException eFileName) {
            System.err.println("Chyba při čtení ze souboru:" +eFileName.getLocalizedMessage());
        }
        return fileName;
    }
}
