package com.kang.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kang.boardback.entity.CommentEntity;
import com.kang.boardback.repository.resultSet.GetCommentListResultSet;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer>{
    
    @Query(
        value =
        "SELECT " + 
        "C.content as content, " + 
        "U.nickname as nickname, " + 
        "U.profile_image as profileImage, " +
        "C.write_datetime as writeDatetime " + 
    "FROM comment AS C " + 
    "INNER JOIN user AS U " + 
    "ON C.user_email = U.email " + 
    "WHERE C.board_number = ?1 " + 
    "ORDER BY write_datetime DESC",
    nativeQuery = true
    
    )
    List<GetCommentListResultSet> getCommentList(Integer boardNumber);

    @Transactional
    void deleteByBoardNumber(Integer boardNumber);

}
