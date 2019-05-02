package com.hung.daos;

import com.hung.controllers.obj.CauHinh;
import com.hung.daos.config.Config;
import com.hung.entities.NguoiDongBHXH;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CauHinh_DAO {
    private PreparedStatement ps;
    private Connection conn;

    public CauHinh_DAO() {
        conn = Config.getConnection();
    }

    public CauHinh getCauHinh() {
        String sql = "SELECT * FROM dbclpm.mucdongbhxh order by id desc LIMIT 1";
        CauHinh cauHinh = new CauHinh();
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            rs.next();
            cauHinh = new CauHinh(
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16),
                    rs.getString(17),
                    rs.getString(18),
                    rs.getString(19),
                    rs.getString(20));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cauHinh;
    }
}
