package com.example.LamTranKimYen_2011061354.services;
import com.example.LamTranKimYen_2011061354.entity.NhanVien;
import com.example.LamTranKimYen_2011061354.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienService {
    @Autowired
    private INhanVienRepository nhanvienRepository;

    public List<NhanVien> getAllNHANVIENs(){
        return nhanvienRepository.findAll();
    }


    public void addNHANVIEN(NhanVien nhanvien){
        nhanvienRepository.save(nhanvien);
    }

    public void updateNHANVIEN(NhanVien nhanvien){
        nhanvienRepository.save(nhanvien);
    }
    public void deleteNHANVIEN(Long Ma_NV){
        nhanvienRepository.deleteById(Ma_NV);
    }
}
