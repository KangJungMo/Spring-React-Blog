package com.kang.boardback.dto.response.board;

import com.kang.boardback.common.ResponseCode;
import com.kang.boardback.common.ResponseMessage;
import com.kang.boardback.dto.object.CommentListItem;
import com.kang.boardback.dto.response.ResponseDto;
import com.kang.boardback.repository.resultSet.GetCommentListResultSet;

import lombok.Getter;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
public class GetCommentListResponseDto extends ResponseDto{
    
    private List<CommentListItem> commentList;

    private GetCommentListResponseDto(List<GetCommentListResultSet> resultSets){

        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.commentList = CommentListItem.copyList(resultSets);

    }

    public static ResponseEntity<GetCommentListResponseDto> success(List<GetCommentListResultSet> resultSets){
        GetCommentListResponseDto result = new GetCommentListResponseDto(resultSets);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    public static ResponseEntity<ResponseDto> noExistBoard(){
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_BOARD, ResponseMessage.NOT_EXISTED_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

}
