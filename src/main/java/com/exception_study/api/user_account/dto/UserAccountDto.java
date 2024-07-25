package com.exception_study.api.user_account.dto;

import com.exception_study.api.user_account.entity.UserAccount;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserAccountDto {
    private String userId;
    private String password;
    private String userName;



    public static UserAccountDto of(String userId, String password, String userName){
        return new UserAccountDto(userId,password,userName);
    }
    public static UserAccountDto from(UserAccount entity){
        return UserAccountDto.of(
                entity.getUserId(),
                "",
                entity.getUserName()
        );
    }
}
