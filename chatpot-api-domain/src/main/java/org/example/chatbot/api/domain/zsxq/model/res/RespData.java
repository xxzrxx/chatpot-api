package org.example.chatbot.api.domain.zsxq.model.res;

import org.example.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 17:24
 * @Description: org.example.chatbot.api.domain.zsxq.model.res
 * @version: 1.0
 */
public class RespData {
    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }
}
