package com.hung.entities;

import java.util.ArrayList;

public class NguoiDongBH_LichSu {
    private NguoiDongBHXH nguoi;
    private ArrayList<LichSuDongBHXH> list;

    public NguoiDongBHXH getNguoiDongBHXH() {
        return nguoi;
    }

    public void setNguoi(NguoiDongBHXH nguoi) {
        this.nguoi = nguoi;
    }

    public ArrayList<LichSuDongBHXH> getListLichSu() {
        return list;
    }

    public void setList(ArrayList<LichSuDongBHXH> list) {
        this.list = list;
    }

    public NguoiDongBH_LichSu() {
    }

    public NguoiDongBH_LichSu(NguoiDongBHXH nguoi, ArrayList<LichSuDongBHXH> list) {
        this.nguoi = nguoi;
        this.list = list;
    }
}
