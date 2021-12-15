package com.mozi.moziserver.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mozi.moziserver.model.mappedenum.ChallengeTagType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "current_tag_list")
public class CurrentTagList extends AbstractTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    private Integer turn;

}
