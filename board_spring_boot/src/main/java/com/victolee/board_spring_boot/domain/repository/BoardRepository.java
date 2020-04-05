package com.victolee.board_spring_boot.domain.repository;

import com.victolee.board_spring_boot.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
