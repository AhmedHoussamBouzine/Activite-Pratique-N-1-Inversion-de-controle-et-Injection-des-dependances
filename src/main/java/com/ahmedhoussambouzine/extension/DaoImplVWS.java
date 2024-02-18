package com.ahmedhoussambouzine.extension;


import com.ahmedhoussambouzine.dao.IDao;

import java.util.Date;

public class DaoImplVWS implements IDao {
    @Override
    public Date getDate() {
        System.out.println("Version VWS");
        return new Date();
    }
}