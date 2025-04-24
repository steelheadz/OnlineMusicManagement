package com.wll.utils;

import com.wll.enums.HTTPStatus;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class R {

    private int code;

    private String message;


    private Object data;


    private R(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private R() {
    }

    public static R success(String message, Object data) {
        return new R(HTTPStatus.OK.getCode(), message, data);
    }

    public static R unAuthorization(String message, Object data) {
        return new R(HTTPStatus.UNAUTHORIZED.getCode(), message, data);
    }

    public static R notFound(String message, Object data) {
        return new R(HTTPStatus.NOT_FOUND.getCode(), message, data);
    }

    public static R serverError(String message, Object data) {
        return new R(HTTPStatus.SERVER_ERROR.getCode(), message, data);
    }

    public static R other(int code, String message, Object data) {
        return new R(code, message, data);
    }

}
