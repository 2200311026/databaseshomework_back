package com.wei.furn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class records implements Serializable {

    private long recordId;
    private String returnTime;
    private String borrowTime;
    private long id;
    private long isbn;
    private long requestId;
    private long returnState;
    private long isTimeOut;
    private long penalty;
    private String bookNumber;//书号 每本书的书号是唯一标识的

}
