package com.bilitech.yilimusic.vo;

import com.bilitech.yilimusic.enums.GeneralStatus;
import lombok.Data;

import java.util.List;

@Data
public class ArtistVo extends BaseVo {
    private String name;

    private String remark;

    private FileVo photo;

    private List<MusicVo> musicDtoList;

    private GeneralStatus status;

    private Boolean recommended;

    private Integer recommendFactor;
}
