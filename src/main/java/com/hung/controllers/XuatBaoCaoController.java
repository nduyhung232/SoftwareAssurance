package com.hung.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController

public class XuatBaoCaoController {
    XuatBaoCao xbc = new XuatBaoCao();

    @PostMapping("/xuatdanhsachthamgiabhxh")
    public void print(){
        try {
            xbc.danhsachthamgiabhxh();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/xuatlichsudongbhxh")
    public void print(@RequestBody String cmt){
        try {
            xbc.lichsudongbhxh(cmt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
