package com.kang.boardback.service;

import org.springframework.http.ResponseEntity;

import com.kang.boardback.dto.request.auth.SignInRequestDto;
import com.kang.boardback.dto.request.auth.SignUpRequestDto;
import com.kang.boardback.dto.response.auth.SignInResponseDto;
import com.kang.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
