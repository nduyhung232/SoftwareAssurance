package com.hung.entities;

import java.util.Date;

public class MucDongBHXH {
    private String mamucdong;
    private String mota;
    private Double huutri_tutuat;
    private Double omdau_thaisan;
    private Double tainanLD_nghenghiep;
    private Double yte;
    private String ngaybatdau;
    private String trangthai;


    public MucDongBHXH() {
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public MucDongBHXH(String mamucdong, String mota, Double huutri_tutuat, Double omdau_thaisan, Double tainanLD_nghenghiep, Double yte, String ngaybatdau, String trangthai) {
        this.mamucdong = mamucdong;
        this.mota = mota;
        this.huutri_tutuat = huutri_tutuat;
        this.omdau_thaisan = omdau_thaisan;
        this.tainanLD_nghenghiep = tainanLD_nghenghiep;
        this.yte = yte;
        this.ngaybatdau = ngaybatdau;
        this.trangthai = trangthai;
    }

    public String getMamucdong() {
        return mamucdong;
    }

    public void setMamucdong(String mamucdong) {
        this.mamucdong = mamucdong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Double getHuutri_tutuat() {
        return huutri_tutuat;
    }

    public void setHuutri_tutuat(Double huutri_tutuat) {
        this.huutri_tutuat = huutri_tutuat;
    }

    public Double getOmdau_thaisan() {
        return omdau_thaisan;
    }

    public void setOmdau_thaisan(Double omdau_thaisan) {
        this.omdau_thaisan = omdau_thaisan;
    }

    public Double getTainanLD_nghenghiep() {
        return tainanLD_nghenghiep;
    }

    public void setTainanLD_nghenghiep(Double tainanLD_nghenghiep) {
        this.tainanLD_nghenghiep = tainanLD_nghenghiep;
    }

    public Double getYte() {
        return yte;
    }

    public void setYte(Double yte) {
        this.yte = yte;
    }


    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return mamucdong + ";"
                + mota + ";"
                + huutri_tutuat + ";"
                + omdau_thaisan + ";"
                + tainanLD_nghenghiep + ";"
                + yte + ";"
                + ngaybatdau + ";"
                + trangthai;
    }
}
