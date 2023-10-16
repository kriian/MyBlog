package ru.hehnev.myblog.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class NotFoundException extends ApplicationException {

    public NotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
