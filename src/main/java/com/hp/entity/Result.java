package com.hp.entity;

public class Result<T> {

    private String status;
    private String message;
    private T data;

    private Result(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    private Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    private Result(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> Result<T> buildResult(Status status, String message, T data) {
        return new Result<T>(status.getCode(), message, data);
    }

    public static <T> Result<T> buildResult(Status status, String message) {
        return new Result<T>(status.getCode(), message);
    }

    public static <T> Result<T> buildResult(Status status, T data) {
        return new Result<T>(status.getCode(), status.getReason(), data);
    }

    public static <T> Result<T> buildResult(Status status) {
        return new Result<T>(status.getCode(), status.getReason());
    }

}