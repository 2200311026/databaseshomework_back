package com.wei.furn.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class borrow implements Serializable {

    private int borrowId;
    private int id;
    private int isbn;
}
