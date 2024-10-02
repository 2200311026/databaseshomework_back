package com.wei.furn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class adminRequest {
    private int requestId;
    private String mobile;
    private int isbn;
    private int borrowState;
    private String bookname;
    private String name;//用户名字
    private String bookNumber;
}
