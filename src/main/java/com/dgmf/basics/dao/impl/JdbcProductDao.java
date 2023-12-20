package com.dgmf.basics.dao.impl;

import com.dgmf.basics.dao.ProductDao;

public class JdbcProductDao implements ProductDao {
    @Override
    public long count() {
        return 100;
    }
}
