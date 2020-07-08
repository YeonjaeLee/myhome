package com.yeon.myhome.repository;

import com.yeon.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title, String content);
    List<Board> findByTitleAndContent(String title, String content);
}
