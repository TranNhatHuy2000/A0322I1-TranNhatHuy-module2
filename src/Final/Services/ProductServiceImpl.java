package Final.Services;


import Final.Repository.ProductRepository;
import Final.Repository.ProductRepositotyImpl;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositotyImpl();

    @Override
    public void xemDanhSachSanPham() {
        productRepository.xemDanhSachSanPham();
    }

    @Override
    public void themMoiSanPhamXK() {
        productRepository.themMoiSanPhamXK();
    }

    @Override
    public void themMoiSanPhamNK() {
        productRepository.themMoiSanPhamNK();
    }


    @Override
    public void xoaSanPham() {
        productRepository.xoaSanPham();
    }

    @Override
    public void timKiemSanPham() {
        productRepository.timKiemSanPham();
    }
}
