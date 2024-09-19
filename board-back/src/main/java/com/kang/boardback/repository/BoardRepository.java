package com.kang.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kang.boardback.entity.BoardEntity;
import com.kang.boardback.repository.resultSet.GetBoardResultSet;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    
    boolean existsByBoardNumber(Integer boardNumber);

    BoardEntity findByBoardNumber(Integer boardNumber);

    @Query(
        value = 
        "SELECT " + 
        "B.board_number as boardNumber, " +
        "B.title as title, " +
        "B.content as content, " + 
        "B.write_datetime AS writeDatetime, " + 
        "B.writer_email AS writerEmail, " + 
        "U.nickname AS writerNickname, " + 
        "U.profile_image AS writerProfileImage " +
        "FROM board as B " + 
        "INNER JOIN user as U " + 
        "ON B.writer_email = U.email " + 
        "WHERE board_number = ?1 ", 
        nativeQuery = true
    )
    GetBoardResultSet getBoard(Integer boardNumber);

}
