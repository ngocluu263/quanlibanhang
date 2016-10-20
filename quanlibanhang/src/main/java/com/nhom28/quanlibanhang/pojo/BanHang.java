package com.nhom28.quanlibanhang.pojo;

// default package
// Generated Oct 20, 2016 11:10:20 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BanHang generated by hbm2java
 */
public class BanHang implements java.io.Serializable {

	private Integer id;
	private int idKhachHang;
	private String ghiChu;
	private Double tienKhauTru;
	private Date ngay;
	private double tongTien;
	private double tienConNo;
	private double tienTra;
	private double tienConLai;
	private Date ngayGiao;
	private Set<PhieuBanHang> phieuBanHangs = new HashSet<PhieuBanHang>(0);
	private Set<PhieuThu> phieuThus = new HashSet<PhieuThu>(0);
	private Set<ChiTietBanHang> chiTietBanHangs = new HashSet<ChiTietBanHang>(0);

	public BanHang() {
	}

	public BanHang(int idKhachHang, Date ngay, double tongTien,
			double tienConNo, double tienTra, double tienConLai, Date ngayGiao) {
		this.idKhachHang = idKhachHang;
		this.ngay = ngay;
		this.tongTien = tongTien;
		this.tienConNo = tienConNo;
		this.tienTra = tienTra;
		this.tienConLai = tienConLai;
		this.ngayGiao = ngayGiao;
	}

	public BanHang(int idKhachHang, String ghiChu, Double tienKhauTru,
			Date ngay, double tongTien, double tienConNo, double tienTra,
			double tienConLai, Date ngayGiao, Set<PhieuBanHang> phieuBanHangs,
			Set<PhieuThu> phieuThus, Set<ChiTietBanHang> chiTietBanHangs) {
		this.idKhachHang = idKhachHang;
		this.ghiChu = ghiChu;
		this.tienKhauTru = tienKhauTru;
		this.ngay = ngay;
		this.tongTien = tongTien;
		this.tienConNo = tienConNo;
		this.tienTra = tienTra;
		this.tienConLai = tienConLai;
		this.ngayGiao = ngayGiao;
		this.phieuBanHangs = phieuBanHangs;
		this.phieuThus = phieuThus;
		this.chiTietBanHangs = chiTietBanHangs;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getIdKhachHang() {
		return this.idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Double getTienKhauTru() {
		return this.tienKhauTru;
	}

	public void setTienKhauTru(Double tienKhauTru) {
		this.tienKhauTru = tienKhauTru;
	}

	public Date getNgay() {
		return this.ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public double getTongTien() {
		return this.tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public double getTienConNo() {
		return this.tienConNo;
	}

	public void setTienConNo(double tienConNo) {
		this.tienConNo = tienConNo;
	}

	public double getTienTra() {
		return this.tienTra;
	}

	public void setTienTra(double tienTra) {
		this.tienTra = tienTra;
	}

	public double getTienConLai() {
		return this.tienConLai;
	}

	public void setTienConLai(double tienConLai) {
		this.tienConLai = tienConLai;
	}

	public Date getNgayGiao() {
		return this.ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public Set<PhieuBanHang> getPhieuBanHangs() {
		return this.phieuBanHangs;
	}

	public void setPhieuBanHangs(Set<PhieuBanHang> phieuBanHangs) {
		this.phieuBanHangs = phieuBanHangs;
	}

	public Set<PhieuThu> getPhieuThus() {
		return this.phieuThus;
	}

	public void setPhieuThus(Set<PhieuThu> phieuThus) {
		this.phieuThus = phieuThus;
	}

	public Set<ChiTietBanHang> getChiTietBanHangs() {
		return this.chiTietBanHangs;
	}

	public void setChiTietBanHangs(Set<ChiTietBanHang> chiTietBanHangs) {
		this.chiTietBanHangs = chiTietBanHangs;
	}

}
