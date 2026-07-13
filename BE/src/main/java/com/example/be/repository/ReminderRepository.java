package com.example.be.repository;

import com.example.be.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface ReminderRepository extends JpaRepository<Reminder, String> {
    // US03 & US08: Truy vấn nhanh các thông báo sắp đến giờ và chưa gửi
    @Query("SELECT r FROM Reminder r WHERE r.remindAt <= :now AND r.status = 'PENDING'")
    List<Reminder> findPendingRemindersToSent(@Param("now") LocalDateTime now);
}
