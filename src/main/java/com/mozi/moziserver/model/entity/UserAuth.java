package com.mozi.moziserver.model.entity;

/*CREATE TABLE `user_auth` (
        `seq` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
        `type` tinyint(3) unsigned NOT NULL COMMENT '1. id pw\n2. google\n3. naver\n4. kakao',
        `id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
        `pw` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
        `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
        `updated_at` datetime NOT NULL,
        `user_seq` int(10) unsigned NOT NULL,
        PRIMARY KEY (`seq`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
*/

import com.mozi.moziserver.model.mappedenum.UserAuthType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "user_auth")
public class UserAuth extends AbstractTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private UserAuthType type;

    private String id;

    private String pw;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_seq")
    private com.mozi.moziserver.model.entity.User user;
}
