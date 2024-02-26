package org.example.chatbot.api.domain.zsxq.model.vo;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 17:06
 * @Description: org.example.chatbot.api.domain.zsxq.model.vo
 * @version: 1.0
 */
public class UserSpecific {

    private boolean liked;

    private boolean subscribed;

    public void setLiked(boolean liked){
        this.liked = liked;
    }
    public boolean getLiked(){
        return this.liked;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }

}
