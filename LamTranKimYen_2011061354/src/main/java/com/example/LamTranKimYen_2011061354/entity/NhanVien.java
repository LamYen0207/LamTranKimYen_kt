package com.example.LamTranKimYen_2011061354.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "ma_nv")
    public String ma_nv;


    @Column(name = "ten_nv")
    public String ten_nv;


    @Column(name = "phai")
    public String phai;


    @Column(name = "noi_sinh")
    public String noi_sinh;


    @ManyToOne
    @JoinColumn(name = "phongban_id")
    public PhongBan phongban;


    @Column(name = "luong")
    public int luong;

}
