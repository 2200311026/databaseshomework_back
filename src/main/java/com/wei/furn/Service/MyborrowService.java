package com.wei.furn.Service;

import com.wei.furn.bean.Myborrow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MyborrowService {
    public List<Myborrow> getMyborrow(int id);
}
