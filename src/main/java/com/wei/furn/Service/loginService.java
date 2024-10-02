package com.wei.furn.Service;

import org.springframework.stereotype.Service;

@Service
public interface loginService {
    public boolean login(String name, String pwd);

    public long getUserId(String username);

    public long GetAdmin(long id);
}

