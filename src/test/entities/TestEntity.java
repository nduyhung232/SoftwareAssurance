package entities;

import com.hung.entities.*;
import org.junit.Assert;
import org.junit.Test;

public class TestEntity {
    @Test
    public void testMucDongBHXH() {
        MucDongBHXH md = new MucDongBHXH("123",
                "demo", 0.7, 0.8,
                0.9, 0.1, "1-1-2019", "enable");
        Assert.assertEquals("123", md.getMamucdong());
        Assert.assertEquals("demo", md.getMota());
        Assert.assertEquals((Double) 0.7, md.getHuutri_tutuat());
        Assert.assertEquals((Double) 0.8, md.getOmdau_thaisan());
        Assert.assertEquals((Double) 0.9, md.getTainanLD_nghenghiep());
        Assert.assertEquals((Double) 0.1, md.getYte());
        Assert.assertEquals("1-1-2019", md.getNgaybatdau());
        Assert.assertEquals("enable", md.getTrangthai());
    }

    @Test
    public void testNguoiDongBHXH() {
        NguoiDongBHXH nguoiDongBHXH = new NguoiDongBHXH("12345567",
                "Hung", "3-2-1997", "Nam", "Phu Tho",
                "hung@gmail.com", "09812345", "1-1-2019");
        Assert.assertEquals("1234567", nguoiDongBHXH.getCMT());
        Assert.assertEquals("Hung", nguoiDongBHXH.getHoten());
        Assert.assertEquals("3-2-1997", nguoiDongBHXH.getNgaysinh());
        Assert.assertEquals("Nam", nguoiDongBHXH.getGioitinh());
        Assert.assertEquals("Phu Tho", nguoiDongBHXH.getQuequan());
        Assert.assertEquals("hung@gmail.com", nguoiDongBHXH.getEmail());
        Assert.assertEquals("09812345", nguoiDongBHXH.getDienthoai());
        Assert.assertEquals("1-1-2019", nguoiDongBHXH.getNgaythamgia());

        nguoiDongBHXH.setTongTien(5000000);
        Assert.assertEquals((double) 5000000, nguoiDongBHXH.getTongTien());
    }

    @Test
    public void testVung() {
        Vung vung = new Vung("123", "Yen Tap", "Cam Khe",
                "Phu Tho", 1, 4000000,
                20, "1-1-2019", "enable");
        Assert.assertEquals("123", vung.getMavung());
        Assert.assertEquals("Yen Tap", vung.getXa_phuong());
        Assert.assertEquals("Cam Khe", vung.getQuan_huyen());
        Assert.assertEquals("Phu Tho", vung.getTinh_tp());
        Assert.assertEquals(1, vung.getKhuvuc());
        Assert.assertEquals((double) 4000000, vung.getSotiendongbh());
        Assert.assertEquals(20, vung.getMucvuotquagioihan());
        Assert.assertEquals("1-1-2019", vung.getNgaybatdau());
        Assert.assertEquals("enable", vung.getTrangthai());
    }

    @Test
    public void testCongViec() {
        CongViec cv = new CongViec("123", "1234",
                "abc", "Ha noi",
                "Nhan vien", "1-1-2019",
                "1-1-2020", 10000000);
        Assert.assertEquals("123", cv.getNguoiDongBHXH_CMT());
        Assert.assertEquals("1234", cv.getMacongty());
        Assert.assertEquals("abc", cv.getTenconty());
        Assert.assertEquals("Ha noi", cv.getDiachi());
        Assert.assertEquals("Nhan vien", cv.getChucvu());
        Assert.assertEquals("1-1-2019", cv.getNgaybatdau());
        Assert.assertEquals("1-1-2020", cv.getNgayketthuc());
        Assert.assertEquals(java.util.Optional.of((double) 10000000), cv.getLuong());
    }

    @Test
    public void testLichSuDongBH() {
        LichSuDongBHXH lichsu = new LichSuDongBHXH("123",
                1, 2019, (double) 700000, "1-1-2019", "enable"
        );
        Assert.assertEquals("123", lichsu.getNguoiDongBHXH_CMT());
        Assert.assertEquals(1, lichsu.getThang());
        Assert.assertEquals(2019, lichsu.getNam());
        Assert.assertEquals(java.util.Optional.of((double) 700000), lichsu.getSotienphaidong());
        Assert.assertEquals("1-1-2019", lichsu.getNgaydong());
        Assert.assertEquals("enable", lichsu.getTrangthai());
    }
}
