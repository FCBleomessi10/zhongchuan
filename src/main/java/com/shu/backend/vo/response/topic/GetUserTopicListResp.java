package com.shu.backend.vo.response.topic;

import com.shu.backend.vo.TopicVO;
import lombok.Data;

import java.util.List;

@Data
public class GetUserTopicListResp {

    private List<TopicVO> topicList;
}
