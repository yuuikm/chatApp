package com.lab4.chatapplab4.Fragments;

import com.lab4.chatapplab4.Notifications.MyResponse;
import com.lab4.chatapplab4.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAy0PbJ28:APA91bFtR-0MusuM2k_e2SVjrmQqoP5Gzqy2HOMI87FtOAyoU9MPJeePS4RWRGXYiSSdYsXF_tQQ6DaBMvBhcKBP0g1yOmhGoX8clymZM6WU76A_T_vzWwzXKY4vCqkrQ60b260Hpj6u"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
