package com.nhom28.quanlibanhang.pojo;

// default package
// Generated Oct 20, 2016 9:05:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Kho generated by hbm2java
 */
public class Kho implements java.io.Serializable {

	private Integer id;
	private NhanVien nhanVien;
	private String maKho;
	private String tenKho;
	private int idNguoiLienHe;
	private String nguoiLienHe;
	private String diaChi;
	private String dienThoai;
	private String diDong;
	private String fax;
	private String email;
	private String dienGiai;
	private byte conQuanLy;
	private Set<ChiTietBanHang> chiTietBanHangs = new HashSet<ChiTietBanHang>(0);
	private Set<ChiTietMuaHang> chiTietMuaHangs = new HashSet<ChiTietMuaHang>(0);
	private Set<ChuyenKho> chuyenKhosForIdKhoXuat = new HashSet<ChuyenKho>(0);
	private Set<ChuyenKho> chuyenKhosForIdKhoNhap = new HashSet<ChuyenKho>(0);

	public Kho() {
	}

	public Kho(NhanVien nhanVien, String maKho, String tenKho,
			int idNguoiLienHe, String nguoiLienHe, byte conQuanLy) {
		this.nhanVien = nhanVien;
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.idNguoiLienHe = idNguoiLienHe;
		this.nguoiLienHe = nguoiLienHe;
		this.conQuanLy = conQuanLy;
	}

	public Kho(String maKho, String tenKho,
			int idNguoiLienHe, String nguoiLienHe, String diaChi,
			String dienThoai, String diDong, String fax, String email,
			String dienGiai, byte conQuanLy) {
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.idNguoiLienHe = idNguoiLienHe;
		this.nguoiLienHe = nguoiLienHe;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.diDong = diDong;
		this.fax = fax;
		this.email = email;
		this.dienGiai = dienGiai;
		this.conQuanLy = conQuanLy;
	}
	
	public Kho(NhanVien nhanVien, String maKho, String tenKho,
			int idNguoiLienHe, String nguoiLienHe, String diaChi,
			String dienThoai, String diDong, String fax, String email,
			String dienGiai, byte conQuanLy,
			Set<ChiTietBanHang> chiTietBanHangs,
			Set<ChiTietMuaHang> chiTietMuaHangs,
			Set<ChuyenKho> chuyenKhosForIdKhoXuat,
			Set<ChuyenKho> chuyenKhosForIdKhoNhap) {
		this.nhanVien = nhanVien;
		this.maKho = maKho;
		this.tenKho = tenKho;
		this.idNguoiLienHe = idNguoiLienHe;
		this.nguoiLienHe = nguoiLienHe;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.diDong = diDong;
		this.fax = fax;
		this.email = email;
		this.dienGiai = dienGiai;
		this.conQuanLy = conQuanLy;
		this.chiTietBanHangs = chiTietBanHangs;
		this.chiTietMuaHangs = chiTietMuaHangs;
		this.chuyenKhosForIdKhoXuat = chuyenKhosForIdKhoXuat;
		this.chuyenKhosForIdKhoNhap = chuyenKhosForIdKhoNhap;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NhanVien getNhanVien() {
		return this.nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public String getMaKho() {
		return this.maKho;
	}

	public void setMaKho(String maKho) {
		this.maKho = maKho;
	}

	public String getTenKho() {
		return this.tenKho;
	}

	public void setTenKho(String tenKho) {
		this.tenKho = tenKho;
	}

	public int getIdNguoiLienHe() {
		return this.idNguoiLienHe;
	}

	public void setIdNguoiLienHe(int idNguoiLienHe) {
		this.idNguoiLienHe = idNguoiLienHe;
	}

	public String getNguoiLienHe() {
		return this.nguoiLienHe;
	}

	public void setNguoiLienHe(String nguoiLienHe) {
		this.nguoiLienHe = nguoiLienHe;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getDiDong() {
		return this.diDong;
	}

	public void setDiDong(String diDong) {
		this.diDong = diDong;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDienGiai() {
		return this.dienGiai;
	}

	public void setDienGiai(String dienGiai) {
		this.dienGiai = dienGiai;
	}

	public byte getConQuanLy() {
		return this.conQuanLy;
	}

	public void setConQuanLy(byte conQuanLy) {
		this.conQuanLy = conQuanLy;
	}

	public Set<ChiTietBanHang> getChiTietBanHangs() {
		return this.chiTietBanHangs;
	}

	public void setChiTietBanHangs(Set<ChiTietBanHang> chiTietBanHangs) {
		this.chiTietBanHangs = chiTietBanHangs;
	}

	public Set<ChiTietMuaHang> getChiTietMuaHangs() {
		return this.chiTietMuaHangs;
	}

	public void setChiTietMuaHangs(Set<ChiTietMuaHang> chiTietMuaHangs) {
		this.chiTietMuaHangs = chiTietMuaHangs;
	}

	public Set<ChuyenKho> getChuyenKhosForIdKhoXuat() {
		return this.chuyenKhosForIdKhoXuat;
	}

	public void setChuyenKhosForIdKhoXuat(Set<ChuyenKho> chuyenKhosForIdKhoXuat) {
		this.chuyenKhosForIdKhoXuat = chuyenKhosForIdKhoXuat;
	}

	public Set<ChuyenKho> getChuyenKhosForIdKhoNhap() {
		return this.chuyenKhosForIdKhoNhap;
	}

	public void setChuyenKhosForIdKhoNhap(Set<ChuyenKho> chuyenKhosForIdKhoNhap) {
		this.chuyenKhosForIdKhoNhap = chuyenKhosForIdKhoNhap;
	}

}
