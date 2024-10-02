package com.wei.furn.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userr implements Serializable {

    private int id;
    private String name;
    private String email;
    private String pwd;
    private String mobile;
    private String addr;
    private int gender;
    private int admin;
    private long money;
}
