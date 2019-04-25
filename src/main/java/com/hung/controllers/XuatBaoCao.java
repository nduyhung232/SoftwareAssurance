package com.hung.controllers;

import com.hung.daos.ThongKe_DAO;
import com.hung.entities.LichSuDongBHXH;
import com.hung.entities.NguoiDongBHXH;
import com.hung.entities.NguoiDongBH_LichSu;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XuatBaoCao {
    public ThongKe_DAO thongke = new ThongKe_DAO();

    private HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public void danhsachthamgiabhxh() throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Danh sách tham gia đóng bảo hiểm xã hội");

        List<NguoiDongBHXH> list = thongke.getListBHXH();
        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // Person
        /*
        *   private String CMT;
            private String hoten;
            private String ngaysinh;
            private String gioitinh;
            private String quequan;
            private String email;
            private String dienthoai;
            private String ngaythamgia;
            private double tongTien;
        * */

        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("CMT");
        cell.setCellStyle(style);

        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Họ tên");
        cell.setCellStyle(style);

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Ngày sinh");
        cell.setCellStyle(style);

        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(style);

        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Quê quán");
        cell.setCellStyle(style);

        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Email");
        cell.setCellStyle(style);

        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Điện thoại");
        cell.setCellStyle(style);

        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Ngày tham gia");
        cell.setCellStyle(style);

        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("Tổng tiền đã đóng");
        cell.setCellStyle(style);

        // Data
        for (NguoiDongBHXH nguoiDongBHXH : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // CMT (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(nguoiDongBHXH.getCMT());
            // Ho ten(B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(nguoiDongBHXH.getHoten());
            // ngay sinh (C)
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getNgaysinh());
            // gioi tinh (D)
            cell = row.createCell(3, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getGioitinh());
            // Que quan (E)
            cell = row.createCell(4, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getQuequan());
            //email
            cell = row.createCell(5, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getEmail());
            //dien thoai
            cell = row.createCell(6, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getDienthoai());
            //ngay tham gia
            cell = row.createCell(7, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getNgaythamgia());
            //tong tien
            cell = row.createCell(8, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getTongTien());

        }
        File file = new File("src/main/resources/data/danhsachdongbh.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());
    }


    public void lichsudongbhxh(String cmt)throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Lịch sử đóng bhxh chi tiết");

        int rownum = 0;
        Cell cell;
        Row row;
        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // Person
        /*
        *   private String CMT;
            private String hoten;
            private String ngaysinh;
            private String gioitinh;
            private String quequan;
            private String email;
            private String dienthoai;
            private String ngaythamgia;
            private double tongTien;
            * ...
        * */

        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("CMT");
        cell.setCellStyle(style);

        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Họ tên");
        cell.setCellStyle(style);

        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Ngày sinh");
        cell.setCellStyle(style);

        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Giới tính");
        cell.setCellStyle(style);

        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Quê quán");
        cell.setCellStyle(style);

        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Email");
        cell.setCellStyle(style);

        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Điện thoại");
        cell.setCellStyle(style);

        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Ngày tham gia");
        cell.setCellStyle(style);

        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("Tháng");
        cell.setCellStyle(style);

        cell = row.createCell(9, CellType.STRING);
        cell.setCellValue("Năm");
        cell.setCellStyle(style);

        cell = row.createCell(10, CellType.STRING);
        cell.setCellValue("Số tiền phải đóng");
        cell.setCellStyle(style);

        cell = row.createCell(11, CellType.STRING);
        cell.setCellValue("Ngày đóng tiền");
        cell.setCellStyle(style);

        NguoiDongBH_LichSu nguoiLS = thongke.getListBHXH_Detail(cmt);
        NguoiDongBHXH nguoiDongBHXH = nguoiLS.getNguoiDongBHXH();
        ArrayList<LichSuDongBHXH> list = nguoiLS.getListLichSu();

        // Data
        for (LichSuDongBHXH lichsu : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // CMT (A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(nguoiDongBHXH.getCMT());
            // Ho ten(B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(nguoiDongBHXH.getHoten());
            // ngay sinh (C)
            cell = row.createCell(2, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getNgaysinh());
            // gioi tinh (D)
            cell = row.createCell(3, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getGioitinh());
            // Que quan (E)
            cell = row.createCell(4, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getQuequan());
            //email
            cell = row.createCell(5, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getEmail());
            //dien thoai
            cell = row.createCell(6, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getDienthoai());
            //ngay tham gia
            cell = row.createCell(7, CellType.NUMERIC);
            cell.setCellValue(nguoiDongBHXH.getNgaythamgia());

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue(lichsu.getThang());

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue(lichsu.getNam());

            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue(lichsu.getSotienphaidong());

            cell = row.createCell(11, CellType.STRING);
            cell.setCellValue(lichsu.getNgaydong());
        }

        File file = new File("src/main/resources/data/danhsachdongbhchitiet.xls");
        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.out.println("Created file: " + file.getAbsolutePath());
    }
}
