package DAO;

import DAO.impl.MonHocDAO;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        MonHocDAO a = new MonHocDAO();
        a.findAll();
//
//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("mamh","841403");
//        a.findByProperty(map,null,null,null,null,null);

        //HibernateUtil.getSessionFactory();
    }
}
