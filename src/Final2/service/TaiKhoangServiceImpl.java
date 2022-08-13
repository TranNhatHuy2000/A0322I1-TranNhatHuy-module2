package Final2.service;

import Final.Repository.ProductRepository;
import Final.Repository.ProductRepositotyImpl;
import Final2.repository.TaiKhoangRepository;
import Final2.repository.TaiKhoangRepositoryImpl;

public class TaiKhoangServiceImpl implements TaiKhoangService {
    private TaiKhoangRepository taiKhoangRepository = new TaiKhoangRepositoryImpl();
    @Override
    public void xemDanhSachTK() {
        taiKhoangRepository.xemDanhSachTK();
    }

    @Override
    public void themTaiKhoanTK() {
        taiKhoangRepository.themTaiKhoanTK();
    }

    @Override
    public void themTaiKhoanTT() {
        taiKhoangRepository.themTaiKhoanTT();
    }

    @Override
    public void xoaTaiKhoan() {
        taiKhoangRepository.xoaTaiKhoan();
    }

    @Override
    public void timKiemTaiKhoan() {
        taiKhoangRepository.timKiemTaiKhoan();
    }
}
