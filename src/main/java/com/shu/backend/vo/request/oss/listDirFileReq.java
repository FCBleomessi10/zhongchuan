package com.shu.backend.vo.request.oss;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class listDirFileReq {

    @NotBlank(message = "dirName不能为空")
    private String dirName;
}
