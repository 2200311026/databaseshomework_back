package com.wei.furn.Service;

import com.wei.furn.bean.nums;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public interface numsService {

    public nums getNums(long isbn);
}
