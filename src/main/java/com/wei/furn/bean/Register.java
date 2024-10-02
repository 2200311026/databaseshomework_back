package com.wei.furn.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register implements Serializable {

    private String name;
    private String email;
    private String pwd;
    private String mobile;
    private int gender;
    private long money;

}
