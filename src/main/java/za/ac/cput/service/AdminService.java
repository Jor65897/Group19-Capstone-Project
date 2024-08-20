package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Admin;
import za.ac.cput.repository.AdminRepository;

import java.util.List;

@Service
public class AdminService implements IService<Admin,Long>{

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin read(Long adminId) {
        return adminRepository.findAdminByAdminId(adminId);
    }

    @Override
    public Admin update(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void delete(Long adminId) {
        adminRepository.deleteAdminByAdminId(adminId);
    }

    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }
}