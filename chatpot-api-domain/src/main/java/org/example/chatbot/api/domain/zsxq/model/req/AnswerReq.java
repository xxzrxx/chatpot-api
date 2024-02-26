package org.example.chatbot.api.domain.zsxq.model.req;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 18:13
 * @Description: org.example.chatbot.api.domain.zsxq.model.req
 * @version: 1.0
 */
public class AnswerReq {

    private  ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }
}
