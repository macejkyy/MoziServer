package com.mozi.moziserver.repository;

import com.mozi.moziserver.model.entity.UserFcm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserFcmRepository extends JpaRepository<UserFcm, Long> {
    Optional<UserFcm> findUserFcmByDeviceId(String deviceId);
}
