package com.wei.furn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Myborrow {

    private int isbn;
    private String category;
    private String bookname;
    private String author;
    private String publish;
    private String img;
    private String lastnums;//剩余数量
    private int borrowState;//借阅状态
    private int requestId ;
    private String bookNumber;//书号 每本书的书号是唯一标识的
}
