import com.hung.controllers.obj.CauHinh;
import com.hung.daos.CauHinh_DAO;
import com.hung.entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCauHinh_DAO {
    CauHinh_DAO cauHinh_dao = new CauHinh_DAO();

    @Test
    public void testGetCauHinh() {
        CauHinh cauHinh = cauHinh_dao.getCauHinh();

        Assert.assertEquals("14", cauHinh.getTn_SDLD_HT());
        Assert.assertEquals("3", cauHinh.getTn_SDLD_OD());
        Assert.assertEquals("0.5", cauHinh.getTn_SDLD_TNLD());
        Assert.assertEquals("3", cauHinh.getNn_SDLD_BHYT());
        Assert.assertEquals("1.5", cauHinh.getNn_LD_YT());
        Assert.assertEquals("", cauHinh.getNn_SDLD_BHTN());

    }


}
