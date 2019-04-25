package com.hung.daos;

import com.hung.entities.Vung;
//import org.testng.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Vung_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public Vung_DAO() {
        conn = Config.getConnection();
    }

//    public Vung getVung(int id) {
//        Vung v = null;
//        String sql = "select * from Vung where ID = ?";
//        try {
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                String maapdung = rs.getString("maapdung");
//                String xa_phuong = rs.getString("xa_phuong");
//                String quan_huyen = rs.getString("quan_huyen");
//                String tinh_tp = rs.getString("tinh_tp");
//                int khuvuc = rs.getInt("khuvuc");
//                long sotiendongbh = rs.getLong("sotiendongbh");
//                int vuotmucdongbh = rs.getInt("vuotmucdongbh");
//                String ngaybatdau = rs.getString("ngaybatdau");
//                String trangthai = rs.getString("trangthai");
//
//                v = new Vung(maapdung, xa_phuong, quan_huyen, tinh_tp, khuvuc, sotiendongbh, vuotmucdongbh, ngaybatdau, trangthai);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return v;
//    }

    public void insert(Vung vung) {
        String sql = "insert into Vung values(?,?,?,?,?,?,?,?) ";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,vung.getMavung());
            ps.setString(1, vung.getXa_phuong());
            ps.setString(2, vung.getQuan_huyen());
            ps.setString(3, vung.getTinh_tp());
            ps.setInt(4, vung.getKhuvuc());
            ps.setDouble(5, vung.getSotiendongbh());
            ps.setInt(6, vung.getMucvuotquagioihan());
            ps.setString(7,  vung.getNgaybatdau());
            ps.setString(8,vung.getTrangthai());
            
            boolean check = ps.execute();
//            Assert.assertEquals(true,check);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disableVung(Vung vung) {
        String sql = "alter Vung set trangthai = ? where maapdung = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,"disable");
            ps.setString(2,vung.getMavung());
//            ps.executeUpdate();
            boolean check = ps.execute();
//            Assert.assertEquals(true,check);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
