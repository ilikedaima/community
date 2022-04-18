package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author cjg
 * @create 2022-04-06 19:03
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
