package com.exception_study.api.user_account.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginRequest {
    private String userId;
    private String password;

    public static LoginRequest of(String userId, String password){
        return new LoginRequest(userId,password);
    }
}
