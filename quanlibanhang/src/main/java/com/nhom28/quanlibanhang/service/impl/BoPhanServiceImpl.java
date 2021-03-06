package com.nhom28.quanlibanhang.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.nhom28.quanlibanhang.dao.BoPhanDao;
import com.nhom28.quanlibanhang.dao.impl.BoPhanDaoImpl;
import com.nhom28.quanlibanhang.dto.BoPhanDto;
import com.nhom28.quanlibanhang.pojo.BoPhan;
import com.nhom28.quanlibanhang.service.BoPhanService;

public class BoPhanServiceImpl implements BoPhanService {

	BoPhanDao boPhanDao = new BoPhanDaoImpl();
	
	@Override
    public List<BoPhanDto> getAll() throws SQLException {
		return boPhanDao.getAll();
    }

	@Override
	public void add(BoPhan boPhan) throws SQLException {
		boPhanDao.save(boPhan);
	}
 
	@Override
	public void delete(Integer id) throws SQLException{
		boPhanDao.delete(id);
	}
	
	@Override
	public void update(Integer id, String tenBoPhan,
			int idNguoiQuanLy, String ghiChu, byte conQuanLy) throws SQLException{
		boPhanDao.update(id, tenBoPhan, idNguoiQuanLy, ghiChu, conQuanLy);
	}
 
	@Override
	public List<String> getListStaffNames() throws SQLException{
		return boPhanDao.getListStaffNames();
	}
	
	@Override
	public Integer getStaffId(String tenNhanVien) throws SQLException{
		return boPhanDao.getStaffId(tenNhanVien);
	}
}
