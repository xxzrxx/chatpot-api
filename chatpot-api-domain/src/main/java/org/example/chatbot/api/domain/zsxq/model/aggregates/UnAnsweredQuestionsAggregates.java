package org.example.chatbot.api.domain.zsxq.model.aggregates;

import org.example.chatbot.api.domain.zsxq.model.res.RespData;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 17:22
 * @Description: org.example.chatbot.api.domain.zsxq.model.aggregates
 * @version: 1.0
 */
public class UnAnsweredQuestionsAggregates {
    private boolean succeeded;
    private RespData resp_data;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getResp_data() {
        return resp_data;
    }

    public void setResp_data(RespData resp_data) {
        this.resp_data = resp_data;
    }
}
