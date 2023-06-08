package com.example.LamTranKimYen_2011061354;
import com.example.LamTranKimYen_2011061354.entity.NhanVien;
import com.example.LamTranKimYen_2011061354.services.NhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanvienService;


    @GetMapping
    public String showAllNhanViens(Model model){
        List<NhanVien> nhanviens = nhanvienService.getAllNHANVIENs();
        model.addAttribute("nhanviens",nhanviens);
        return "nhanvien/list";
    }
}
