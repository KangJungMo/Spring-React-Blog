package com.kang.boardback.dto.request.board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import java.util.List;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class PatchBoardRequestDto {
    
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NonNull
    private List<String> boardImageList;
}
