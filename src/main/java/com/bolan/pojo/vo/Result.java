package com.bolan.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    private Integer code;
    private String message;
    private T data;
    private Long count;

    public static Result<Object> success(){
        return new Result<>(0,"success",null,null);
    }

    public static Result<Object> success(String message){
        return new Result<>(0, message,null,null);
    }

    public static Result<Object> success(Object data, Long count){
        return new Result<>(0,"success", data, count);
    }

    public static Result<Object> fail(){
        return new Result<>(-1,"fail",null,null);
    }

    public static Result<Object> fail(String message){
        return new Result<>(-1,message,null,null);
    }

}
