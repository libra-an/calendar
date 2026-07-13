package com.example.be.entity;

import com.example.be.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "reminders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reminder extends PrimaryEntity implements Serializable {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id", nullable = false)
    private Task task;

    @Column(name = "remind_at", nullable = false)
    private LocalDateTime remindAt;

    @Column(name = "notification_status", nullable = false, length = 20)
    private String notificationStatus = "PENDING"; // PENDING, SENT, FAILED


}