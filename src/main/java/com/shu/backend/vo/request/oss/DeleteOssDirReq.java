package com.shu.backend.vo.request.oss;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DeleteOssDirReq {

    @NotBlank(message = "dirName不能为空")
    private String dirName;
}
