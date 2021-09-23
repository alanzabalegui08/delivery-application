package com.delivery.application.utils.http;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T> {

    private LocalDateTime timestamp;
    private T data;
    private String message;
    private StatusResponse status;

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.setTimestamp(LocalDateTime.now());
        response.setStatus(StatusResponse.OK);
        return response;
    }

    public static <T> Response<T> badRequest() {
         Response<T> response = new Response<>();
         response.setStatus(StatusResponse.BAD_REQUEST);
         return response;
    }

}
