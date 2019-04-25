package com.hung.entities;

import java.util.Date;

public class NguoiDongBHXH {
    private String CMT;
    private String hoten;
    private String ngaysinh;
    private String gioitinh;
    private String quequan;
    private String email;
    private String dienthoai;
    private String ngaythamgia;
    private double tongTien;

    public NguoiDongBHXH() {
        tongTien = 0;
    }


    public NguoiDongBHXH(String CMT, String hoten, String ngaysinh, String gioitinh, String quequan, String email, String dienthoai, String ngaythamgia, double tongTien) {
        this.CMT = CMT;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.email = email;
        this.dienthoai = dienthoai;
        this.ngaythamgia = ngaythamgia;
        this.tongTien = tongTien;
    }

    public NguoiDongBHXH(String CMT, String hoten, String ngaysinh, String gioitinh, String quequan, String email, String dienthoai, String ngaythamgia) {
        this.CMT = CMT;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.email = email;
        this.dienthoai = dienthoai;
        this.ngaythamgia = ngaythamgia;
    }


    @Override
    public String toString() {
        return "NguoiDongBHXH{" +
                "CMT='" + CMT + '\'' +
                ", hoten='" + hoten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", quequan='" + quequan + '\'' +
                ", email='" + email + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                ", ngaythamgia='" + ngaythamgia + '\'' +
                ", tongTien=" + tongTien +
                '}';
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getNgaythamgia() {
        return ngaythamgia;
    }

    public void setNgaythamgia(String ngaythamgia) {
        this.ngaythamgia = ngaythamgia;
    }
}
