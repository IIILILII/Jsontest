package com.example.jsontest;

import android.util.Log;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnector extends Thread{

    @Override
    public void run() {
        try{

            URL url = new URL("https://www.naver.com"); //사용할 서버 주소 변경 필요.
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            if (conn != null){
                conn.setConnectTimeout(10000); // 10초 동안 서버가 연결되지 않으면 통신을 끊음
                conn.setRequestMethod("Get");

                int resCode = conn.getResponseCode();
                int HTTP_OK = HttpURLConnection.HTTP_OK;        //서버와 통신 성공시 응당 코드는 200 이므로 HTTP_OK와 비교
                Log.d("JsonPasing", "resCode : " + resCode);
                Log.d("JsonPasing", "HTTP_OK : " + HTTP_OK);


            }

        }catch (Exception e){

        }
    }
}
