package kodlamaio.hrmsdemo.api.controllers;

import kodlamaio.hrmsdemo.business.abstracts.SystemStaffService;
import kodlamaio.hrmsdemo.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/system-staffs")
public class SystemStaffController {
    private SystemStaffService systemStaffService;

    @Autowired
    public SystemStaffController(SystemStaffService systemStaffService) {
        this.systemStaffService = systemStaffService;
    }

    @GetMapping("/getall")
    public List<SystemStaff> getAll() {
        return systemStaffService.getAll();
    }
}
