package com.wei.furn.Service;

import com.wei.furn.bean.Request;
import com.wei.furn.dao.RequestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public interface RequestService {

    public void getRequest(Request request);

    public void DeleteRequest(long requestId);

    public void updataBorrowState(long requestId);
}
