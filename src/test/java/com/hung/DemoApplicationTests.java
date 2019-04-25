package com.hung;

import com.hung.daos.Config;
import com.hung.daos.Vung_DAO;

public class DemoApplicationTests {
    public static void main(String[] args) {
//        Vung_DAO vd = new Vung_DAO();
//        System.out.println(vd.getVung(1));
        Config cf = new Config();
        System.out.println(cf.getConnection());
    }
}
