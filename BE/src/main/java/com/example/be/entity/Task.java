package com.example.be.entity;

import com.example.be.core.constant.TaskStatus;
import com.example.be.core.constant.TaskType;
import com.example.be.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task extends PrimaryEntity implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "is_all_day")
    private Boolean isAllDay = false;

    // Ánh xạ Enum từ core.constant vào DB
    @Enumerated(EnumType.STRING)
    @Column(name = "task_type")
    private TaskType taskType = TaskType.WORK;

    @Column(name = "is_starred")
    private Boolean isStarred = false; // US06: Đánh dấu sao

    @Column(length = 7)
    private String color = "#3399FF"; // US09: Màu sắc hiển thị

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus = TaskStatus.PENDING;


    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reminder> reminders;

}