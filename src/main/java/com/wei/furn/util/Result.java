package com.wei.furn.util;

//自定义泛型类
public class Result <T>{
    private String code;//状态码
    private String msg;//对状态说明
    private T data;//返回时，携带的数据，扩展性好，所以使用泛型

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(T data) {
        this.data = data;
    }

    public Result() {
    }

    //编写方法-返回成功的Result对象
    public static Result success(){
       Result result = new Result<>();
        result.setCode("200");
        result.setMsg("success");
        return result;
    }


    //编写方法-返回成功的Result对象
    public static Result success(String msg){
        Result result = new Result<>();
        result.setCode("200");
        result.setMsg(msg);
        return result;
    }

    //编写方法-返回成功的Result对象同时可以携带数据
    //如果要再static方法上面使用泛型格式如下
    public static<T> Result<T> success(T data){
        Result<T> result = new Result<>(data);//带参构造器已经完成data的赋值
        result.setCode("200");
        result.setMsg("success");
        return result;
    }

    //编写方法-返回失败的Result对象
    public static Result error(String code,String msg){
        Result result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    //编写方法-返回失败的Result对象同时可以携带数据
    //如果要再static方法上面使用泛型格式如下
    public static<T> Result<T> error(String code,String msg,T data){
        Result<T> result = new Result<>(data);//带参构造器已经完成data的赋值
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
