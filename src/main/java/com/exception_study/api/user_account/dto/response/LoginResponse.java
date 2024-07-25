package com.exception_study.api.user_account.dto.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class LoginResponse {
    private String token;
    private long expiredTime;

    public static LoginResponse of(String token, long expiredTime){
        return new LoginResponse(token,expiredTime);
    }
}
