package com.engeto.RSSctecka;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class FileException extends Exception {
    public FileException(String message){
        super(message);
    }
}
