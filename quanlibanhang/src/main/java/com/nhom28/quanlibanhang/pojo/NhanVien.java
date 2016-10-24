package com.nhom28.quanlibanhang.pojo;

// default package
// Generated Oct 20, 2016 9:05:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * NhanVien generated by hbm2java
 */
public class NhanVien implements java.io.Serializable {

	private Integer id;
	private BoPhan boPhan;
	private String maNhanVien;
	private String tenNhanVien;
	private byte gioiTinh;
	private String diaChi;
	private byte conDocThan;
	private String chucVu;
	private String email;
	private String dienThoai;
	private String diDong;
	private String dienGiai;
	private byte conQuanLy;
	private Set<NguoiDung> nguoiDungs = new HashSet<NguoiDung>(0);
	private Set<Kho> khos = new HashSet<Kho>(0);

	public NhanVien() {
	}

	public NhanVien(String maNhanVien, String tenNhanVien,
			byte gioiTinh, String diaChi, byte conDocThan, String chucVu,
			String email, String dienThoai, String diDong, String dienGiai,
			byte conQuanLy) {
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.conDocThan = conDocThan;
		this.chucVu = chucVu;
		this.email = email;
		this.dienThoai = dienThoai;
		this.diDong = diDong;
		this.dienGiai = dienGiai;
		this.conQuanLy = conQuanLy;
	}
	
	public NhanVien(BoPhan boPhan, String maNhanVien, String tenNhanVien,
			byte gioiTinh, byte conDocThan, String chucVu, String dienGiai,
			byte conQuanLy) {
		this.boPhan = boPhan;
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.conDocThan = conDocThan;
		this.chucVu = chucVu;
		this.dienGiai = dienGiai;
		this.conQuanLy = conQuanLy;
	}

	public NhanVien(BoPhan boPhan, String maNhanVien, String tenNhanVien,
			byte gioiTinh, String diaChi, byte conDocThan, String chucVu,
			String email, String dienThoai, String diDong, String dienGiai,
			byte conQuanLy, Set<NguoiDung> nguoiDungs, Set<Kho> khos) {
		this.boPhan = boPhan;
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.conDocThan = conDocThan;
		this.chucVu = chucVu;
		this.email = email;
		this.dienThoai = dienThoai;
		this.diDong = diDong;
		this.dienGiai = dienGiai;
		this.conQuanLy = conQuanLy;
		this.nguoiDungs = nguoiDungs;
		this.khos = khos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BoPhan getBoPhan() {
		return this.boPhan;
	}

	public void setBoPhan(BoPhan boPhan) {
		this.boPhan = boPhan;
	}

	public String getMaNhanVien() {
		return this.maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return this.tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public byte getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(byte gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public byte getConDocThan() {
		return this.conDocThan;
	}

	public void setConDocThan(byte conDocThan) {
		this.conDocThan = conDocThan;
	}

	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Set<NguoiDung> getNguoiDungs() {
		return this.nguoiDungs;
	}

	public void setNguoiDungs(Set<NguoiDung> nguoiDungs) {
		this.nguoiDungs = nguoiDungs;
	}

	public Set<Kho> getKhos() {
		return this.khos;
	}

	public void setKhos(Set<Kho> khos) {
		this.khos = khos;
	}

}
