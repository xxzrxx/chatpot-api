package org.example.chatbot.api.domain.zsxq.model.vo;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 17:05
 * @Description: org.example.chatbot.api.domain.zsxq.model.vo
 * @version: 1.0
 */
public class OwnerDetail {

    private int questions_count;

    private String join_time;

    public void setQuestions_count(int questions_count){
        this.questions_count = questions_count;
    }
    public int getQuestions_count(){
        return this.questions_count;
    }
    public void setJoin_time(String join_time){
        this.join_time = join_time;
    }
    public String getJoin_time(){
        return this.join_time;
    }

}
