package com.shu.backend.vo.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DeleteDocReq {

    @NotNull(message = "docId不能为空")
    private Long docId;
}
