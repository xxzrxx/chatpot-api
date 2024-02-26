package org.example.chatbot.api.domain.zsxq;

import org.example.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;

import java.io.IOException;
import java.security.PrivateKey;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 16:58
 * @Description: org.example.chatbot.api.domain.zsxq
 * @version: 1.0
 */
public interface IZsxqApi {

    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionsTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId,String text, boolean silenced)throws IOException;
}
