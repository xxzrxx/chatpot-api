package org.example.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @Auther: zhangrui
 * @Date: 2024/2/22 - 02 - 22 - 11:48
 * @Description: org.example.chatbot.api.test
 * @version: 1.0
 */
public class ApiTest {
    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885518425541/topics?scope=all&count=20");

        get.addHeader("cookie","tfstk=egWWEp6M-407SklolzZVc1qfLzpQ7awaFDtdjMHrvLp-JDLf4YueaMLCRZ8cL4rutIQfoZbP4MWCivsGxTrkLuvlqpvL7PyNdgjkKYaY_awahLOHmPzaQ-o6-cAU7_-ccoIE_74jDDI4lYkopDx_VXcVzNWXVINVlEFFltx5EFSRcvHLX3OWWgLA4gkw5--iOmOidnTacoGnt_vUkHoYRSu9wnxmboZj_XAJmnTacoGntQKDmRrbcflh.; zsxq_access_token=85DDFBD1-FEB4-A46D-415E-7D21CB4B2631_E7D7B8406C15B9B3; zsxqsessionid=d60d40e4edd2a5126b899cecd59f4e6e; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218dcb473b3d9e2-0c0035f06881ca8-4c657b58-921600-18dcb473b3e2ca%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E5%BC%95%E8%8D%90%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC%22%2C%22%24latest_referrer%22%3A%22https%3A%2F%2Fbugstack.cn%2F%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThkY2I0NzNiM2Q5ZTItMGMwMDM1ZjA2ODgxY2E4LTRjNjU3YjU4LTkyMTYwMC0xOGRjYjQ3M2IzZTJjYSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218dcb473b3d9e2-0c0035f06881ca8-4c657b58-921600-18dcb473b3e2ca%22%7D; abtest_env=beta");
        get.addHeader("Content-Type", "application/json;charset=utf8");

        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/188821188524422/comments");
        post.addHeader("cookie", "tfstk=egWWEp6M-407SklolzZVc1qfLzpQ7awaFDtdjMHrvLp-JDLf4YueaMLCRZ8cL4rutIQfoZbP4MWCivsGxTrkLuvlqpvL7PyNdgjkKYaY_awahLOHmPzaQ-o6-cAU7_-ccoIE_74jDDI4lYkopDx_VXcVzNWXVINVlEFFltx5EFSRcvHLX3OWWgLA4gkw5--iOmOidnTacoGnt_vUkHoYRSu9wnxmboZj_XAJmnTacoGntQKDmRrbcflh.; zsxq_access_token=85DDFBD1-FEB4-A46D-415E-7D21CB4B2631_E7D7B8406C15B9B3; zsxqsessionid=d60d40e4edd2a5126b899cecd59f4e6e; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218dcb473b3d9e2-0c0035f06881ca8-4c657b58-921600-18dcb473b3e2ca%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E5%BC%95%E8%8D%90%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC%22%2C%22%24latest_referrer%22%3A%22https%3A%2F%2Fbugstack.cn%2F%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThkY2I0NzNiM2Q5ZTItMGMwMDM1ZjA2ODgxY2E4LTRjNjU3YjU4LTkyMTYwMC0xOGRjYjQ3M2IzZTJjYSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218dcb473b3d9e2-0c0035f06881ca8-4c657b58-921600-18dcb473b3e2ca%22%7D; abtest_env=beta");
        post.addHeader("Content-Type", "application/json;charset=utf8");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"自己去kan！\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": true\n" +
                "  }\n" +
                "}";


        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }

}
