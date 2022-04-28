package com.mozi.moziserver.model.res;

import com.mozi.moziserver.model.entity.User;
import com.mozi.moziserver.model.entity.UserAuth;
import lombok.Getter;

@Getter
public class ResUserInfo {
    private Long seq;
    private String nickName;
    private String email;

    private ResUserInfo(User user){
        this.seq = user.getSeq();
        this.nickName = user.getNickName();
        this.email = user.getEmail();
    }

    public static ResUserInfo of(User user) {
        return new ResUserInfo(user);
    }
}
