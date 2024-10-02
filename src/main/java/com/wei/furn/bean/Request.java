package com.wei.furn.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request implements Serializable {

    private int requestId;
    private int id;
    private int isbn;
    private int borrowState;
    private String bookNumber;//书号 每本书的书号是唯一标识的
}
