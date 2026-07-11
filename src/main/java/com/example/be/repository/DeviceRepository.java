package com.example.be.repository;

import com.example.be.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    // lấy danh sách thiết bị
    List<Device> findByUserId (Long userId);

}
