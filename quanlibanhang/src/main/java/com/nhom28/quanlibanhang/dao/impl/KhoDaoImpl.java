package com.nhom28.quanlibanhang.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nhom28.quanlibanhang.dao.KhoDao;
import com.nhom28.quanlibanhang.pojo.Kho;
import com.nhom28.quanlibanhang.pojo.NhanVien;
import com.nhom28.quanlibanhang.pojo.TyGia;

public class KhoDaoImpl extends AbstractGenericDao<Kho> implements KhoDao {

	@Override	
	public Serializable save(Kho entity) {
		Transaction tx = getSession().beginTransaction();
		NhanVien nv = new NhanVien();
		Serializable serial = getSession().save(entity);
		tx.commit();
		return serial;
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public void delete(Integer id) throws SQLException {
		Transaction tx = getSession().beginTransaction();
		try {
			Query query = getSession().createQuery("delete from Kho where id = :id");
			query.setInteger("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			System.out.println("erorr" + e);
		} finally {
			tx.commit();
		}
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	@Override
	public void update(Integer id, Kho kho) throws SQLException {
		Transaction tx = getSession().beginTransaction();
		try {
			String str = "update Kho set maKho = :maKho, tenKho = :tenKho, idNguoiLienHe = :idNguoiLienHe,"
					+ " nguoiLienHe = :nguoiLienHe, diaChi = :diaChi, dienThoai = :dienThoai, diDong = :diDong,"
					+ " fax = :fax, email = :email, dienGiai = :dienGiai, conQuanLy = :conQuanLy where id = :id";
			Query query = getSession().createQuery(str);
			query.setInteger("id", id);
			query.setString("maKho", kho.getMaKho());
			query.setString("tenKho", kho.getTenKho());
			query.setInteger("idNguoiLienHe", kho.getIdNguoiLienHe());
			query.setString("nguoiLienHe", kho.getNguoiLienHe());
			query.setString("diaChi", kho.getDiaChi());
			query.setString("dienThoai", kho.getDienThoai());
			query.setString("diDong", kho.getDiDong());
			query.setString("fax", kho.getFax());
			query.setString("email", kho.getEmail());
			query.setString("dienGiai", kho.getDienGiai());
			query.setByte("conQuanLy", kho.getConQuanLy());
			query.executeUpdate();
		} catch (Exception e) {
			System.out.println("erorr" + e);
		} finally {
			tx.commit();
		}
	}
	
	@Override
	public NhanVien getNhanVien(Integer id) throws SQLException{
		Transaction tx = getSession().beginTransaction();
		Query query = getSession().createQuery("from NhanVien where id = :id");
		query.setInteger("id", id);
		NhanVien nhanVien = (NhanVien)query.list().get(0);
		tx.commit();
		return nhanVien;
	}
}
