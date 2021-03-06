package com.nhom28.quanlibanhang.dao;

import java.sql.SQLException;
import java.util.List;

import com.nhom28.quanlibanhang.pojo.Kho;
import com.nhom28.quanlibanhang.pojo.NhanVien;

public interface KhoDao extends GenericDao<Kho> {

	/**
	 * @return ResultSet
	 */
	public void delete(Integer id) throws SQLException;

	public void update(Integer id, Kho kho) throws SQLException;

	public NhanVien getNhanVien(Integer id) throws SQLException;
}
