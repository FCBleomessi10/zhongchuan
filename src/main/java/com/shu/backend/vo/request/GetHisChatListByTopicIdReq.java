package com.shu.backend.vo.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class GetHisChatListByTopicIdReq {

    @NotNull(message = "topicId不能为空")
    private Long topicId;
}