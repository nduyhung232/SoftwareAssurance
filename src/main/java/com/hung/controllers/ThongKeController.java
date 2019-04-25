package com.hung.controllers;

import com.hung.daos.ThongKe_DAO;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBH_LichSu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThongKeController {
    ThongKe_DAO thongke = new ThongKe_DAO();

    @PostMapping("/getListDetail")
    public NguoiDongBH_LichSu getListDetail(@RequestBody String cmt) {
        return thongke.getListBHXH_Detail(cmt);
    }

    @GetMapping("/getList")
    public ResponseEntity getList() {
        return ResponseEntity.ok(thongke.getListBHXH());
    }

    @PostMapping("/person/add")
    public ResponseEntity add(@RequestBody NguoiDongBHXH nguoiDongBHXH){
        thongke.addPerson(nguoiDongBHXH);
        System.out.println(nguoiDongBHXH);
        return ResponseEntity.ok(nguoiDongBHXH);
    }

}
