package com.example.be.repository;

import com.example.be.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, String> {
    // US06: Lấy việc đánh dấu sao
    List<Task> findByUserIdAndIsStarredTrue(Long userId);

    // Dùng cho US02 & US05: Lọc việc theo khoảng thời gian (Hiệu quả cao với Index)
    @Query("SELECT t FROM Task t WHERE t.user.id = :userId AND t.startTime BETWEEN :startTime AND :endTime ORDER BY t.startTime ASC")
    List<Task> findByUserIdAndTimeRange(@Param("userId") Long userId,
                                        @Param("startTime") LocalDateTime startTime,
                                        @Param("endTime") LocalDateTime endTime);
}
