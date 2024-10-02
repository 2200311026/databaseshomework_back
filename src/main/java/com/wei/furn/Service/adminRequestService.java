package com.wei.furn.Service;

import com.wei.furn.bean.adminRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public interface adminRequestService {

    public List<adminRequest> adminRequestservice();
}
