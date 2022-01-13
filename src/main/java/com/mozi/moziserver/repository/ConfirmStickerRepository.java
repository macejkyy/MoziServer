package com.mozi.moziserver.repository;

import com.mozi.moziserver.model.entity.ConfirmSticker;
import com.mozi.moziserver.model.entity.StickerImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmStickerRepository  extends JpaRepository<ConfirmSticker, StickerImg>, ConfirmStickerRepositorySupport{
}
