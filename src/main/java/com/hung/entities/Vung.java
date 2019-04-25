package com.hung.entities;

import java.sql.Date;

public class Vung {
    private String mavung;
    private String xa_phuong;
    private String quan_huyen;
    private String tinh_tp;
    private int khuvuc;
    private double sotiendongbh;
    private int mucvuotquagioihan;
    private String ngaybatdau;
    private String trangthai;

    public Vung() {
    }

    public Vung(String mavung, String xa_phuong, String quan_huyen, String tinh_tp, int khuvuc, double sotiendongbh, int mucvuotquagioihan, String ngaybatdau, String trangthai) {
        this.mavung = mavung;
        this.xa_phuong = xa_phuong;
        this.quan_huyen = quan_huyen;
        this.tinh_tp = tinh_tp;
        this.khuvuc = khuvuc;
        this.sotiendongbh = sotiendongbh;
        this.mucvuotquagioihan = mucvuotquagioihan;
        this.ngaybatdau = ngaybatdau;
        this.trangthai = trangthai;
    }

    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getXa_phuong() {
        return xa_phuong;
    }

    public void setXa_phuong(String xa_phuong) {
        this.xa_phuong = xa_phuong;
    }

    public String getQuan_huyen() {
        return quan_huyen;
    }

    public void setQuan_huyen(String quan_huyen) {
        this.quan_huyen = quan_huyen;
    }

    public String getTinh_tp() {
        return tinh_tp;
    }

    public void setTinh_tp(String tinh_tp) {
        this.tinh_tp = tinh_tp;
    }

    public int getKhuvuc() {
        return khuvuc;
    }

    public void setKhuvuc(int khuvuc) {
        this.khuvuc = khuvuc;
    }

    public double getSotiendongbh() {
        return sotiendongbh;
    }

    public void setSotiendongbh(double sotiendongbh) {
        this.sotiendongbh = sotiendongbh;
    }

    public int getMucvuotquagioihan() {
        return mucvuotquagioihan;
    }

    public void setMucvuotquagioihan(int mucvuotquagioihan) {
        this.mucvuotquagioihan = mucvuotquagioihan;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return xa_phuong + ";"
                + quan_huyen + ";"
                + tinh_tp + ";"
                + khuvuc + ";"
                + sotiendongbh + ";"
                + mucvuotquagioihan;
    }
}
