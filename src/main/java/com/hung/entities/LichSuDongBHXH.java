package com.hung.entities;

import java.util.Date;

public class LichSuDongBHXH {
    private String NguoiDongBHXH_CMT;
    private int thang;
    private int nam;
    private Double sotienphaidong;
    private String ngaydong;
    private String trangthai;


    public LichSuDongBHXH() {
    }

    public LichSuDongBHXH(String nguoiDongBHXH_CMT, int thang, int nam, Double sotienphaidong, String ngaydong, String trangthai) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
        this.thang = thang;
        this.nam = nam;
        this.sotienphaidong = sotienphaidong;
        this.ngaydong = ngaydong;
        this.trangthai = trangthai;
    }

    public String getNgaydong() {
        return ngaydong;
    }

    public String getNguoiDongBHXH_CMT() {
        return NguoiDongBHXH_CMT;
    }

    public void setNguoiDongBHXH_CMT(String nguoiDongBHXH_CMT) {
        NguoiDongBHXH_CMT = nguoiDongBHXH_CMT;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public Double getSotienphaidong() {
        return sotienphaidong;
    }

    public void setSotienphaidong(Double sotienphaidong) {
        this.sotienphaidong = sotienphaidong;
    }

    public void setNgaydong(String ngaydong) {
        this.ngaydong = ngaydong;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "LichSuDongBHXH{" +
                "NguoiDongBHXH_CMT='" + NguoiDongBHXH_CMT + '\'' +
                ", thang=" + thang +
                ", nam=" + nam +
                ", sotienphaidong=" + sotienphaidong +
                ", ngaydong='" + ngaydong + '\'' +
                ", trangthai='" + trangthai + '\'' +
                '}';
    }
}
