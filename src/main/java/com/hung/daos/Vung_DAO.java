package com.hung.daos;

import com.hung.daos.config.Config;
import com.hung.entities.Vung;
//import org.testng.Assert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Vung_DAO {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection conn;

    public Vung_DAO() {
        conn = Config.getConnection();
    }

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
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
