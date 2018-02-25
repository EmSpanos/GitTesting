package com.java.workproject;




import com.java.workproject.JsonData.TwitchAPI;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static sun.management.snmp.util.JvmContextFactory.getUserData;

public class Main {

    private static OkHttpClient client = new OkHttpClient();
    public static void main(String[] args)
    {
       for(String str : getUserData("CaptainSparkler"))
       {
           System.out.println(str);
       }
    }

public static String getJSON(String url) throws IOException {
    Request request = new Request.Builder()
            .url(url)
            .build();

            Response response = client.newCall (request).execute();
    return response.body().string();

}

public static String() getUserData (String username){

        String json = null;
        try{
            json = getJSON("http://api.wunderground.com/api/61cc984085e36601/history_20171030/q/NY/New_York.json" + username);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        Geon geon = new Geon();

        TwitchAPI twitchAPI = geon.fromJson(json, TwitchAPI.class);

        return new String []{
                "Bio: " + twitchAPI.getBio(),
            "ID: " + twitchAPI.get_id();
        }
    }
}
