package com.wei.furn.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface UserImgService {
    String getImgUrl(long id);
    void putImgUrl(long id, String imgUrl);
    Long ifsaveId(Long id);
    void insertId(long id, String img);
}
