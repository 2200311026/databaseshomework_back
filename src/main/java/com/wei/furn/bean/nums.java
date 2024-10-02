package com.wei.furn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class nums implements Serializable {
    private long isbn;
    private long lastnums;
    private long allnums;
    private long borrownums;

}
