package com.example.be.repository;

import com.example.be.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {
}
