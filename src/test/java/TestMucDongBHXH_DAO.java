import com.hung.daos.MucDongBHXH_DAO;
import com.hung.entities.MucDongBHXH;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBH_LichSu;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestMucDongBHXH_DAO {
    MucDongBHXH_DAO mucDongBHXH_dao = new MucDongBHXH_DAO();

    @Test
    public void testGetListNguoiDongBHXH() {
        ArrayList<NguoiDongBHXH> list = mucDongBHXH_dao.getList();

        Assert.assertEquals(10, list.size());
        Assert.assertEquals("Bùi Tiến Dũng", list.get(0).getHoten());
        Assert.assertEquals("Đặng Văn Lâm", list.get(9).getHoten());
        Assert.assertEquals("3", list.get(1).getCMT());
        Assert.assertEquals("Hải Phòng", list.get(9).getQuequan());
        Assert.assertEquals(2.3423423E7, list.get(3).getTongTien(),0);
        Assert.assertEquals(0.0, list.get(9).getTongTien(),0);

    }


}
