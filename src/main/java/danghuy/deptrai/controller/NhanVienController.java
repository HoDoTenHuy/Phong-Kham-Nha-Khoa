package danghuy.deptrai.controller;


import danghuy.deptrai.pojo.NhanVienPojo;
import danghuy.deptrai.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/")
public class NhanVienController{

    private final NhanVienService nhanVienService;

    @Autowired
    public NhanVienController(NhanVienService nhanVienService){
        this.nhanVienService = nhanVienService;
    }
    @GetMapping()
    @Transactional
    public String getTrangChu(){
        NhanVienPojo nhanVienPojo = new NhanVienPojo(1,"huy", "04", "113", "Hue",
                "Tong Giam Doc","Dai hoc");
        nhanVienService.saveNhanVien(nhanVienPojo);
        return "trangchu";
    }

}