package com.wei.furn.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data //提供类的get、set、equals、hashCode、canEqual、toString方法。
@AllArgsConstructor
@NoArgsConstructor
public class book implements Serializable {


    private int isbn;
    private String category;
    private String bookname;
    private String author;
    private String publish;
    private String img;
    private String lastnums;//剩余数量
    private String allnums;//总数
    private String borrownums;//借出的数量
//    private String bookNumber;//书号 每本书的书号是唯一标识的
}
