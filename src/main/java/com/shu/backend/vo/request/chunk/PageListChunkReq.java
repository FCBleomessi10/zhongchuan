package com.shu.backend.vo.request.chunk;

import com.shu.backend.vo.request.PageCommonReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageListChunkReq extends PageCommonReq {

    @NotNull(message = "docId不能为空")
    private Long docId;
}
