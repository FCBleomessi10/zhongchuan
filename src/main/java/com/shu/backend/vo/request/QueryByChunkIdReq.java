package com.shu.backend.vo.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class QueryByChunkIdReq {

    @NotNull(message = "chunkId不能为空")
    private Long chunkId;
}
