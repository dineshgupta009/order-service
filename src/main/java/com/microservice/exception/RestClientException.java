package com.microservice.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;


@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class RestClientException extends HttpClientErrorException {

    private String errorCode;
//    private int status;


    public RestClientException(HttpStatus statusCode, String statusText,String errorCode) {
        super(statusCode, statusText);
        this.errorCode = errorCode;
    }
}
