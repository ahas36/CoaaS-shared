/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaas.helper;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author ali
 */
public class FCM {
    public final static String AUTH_KEY_FCM = "AAAAjQWkans:APA91bFjgk0xZ9dZlzkdo7kOH2QqlnYUEE8ydQHWyyTcFv0YhkLbjAqqtZoIARD9I-RkDBQAprMOkFkvwDS0v-94p8BfTRWkyJUi-nom8XazwCCqdEYq92_4KwzrOuWthgt_0uktUn_sM__bP5sts58Gs3nWpGP78w";
    public final static String API_URL_FCM = "https://fcm.googleapis.com/fcm/send";
    // userDeviceIdKey is the device id you will query from your database
    public static void pushFCMNotification(String userDeviceIdKey,JSONObject msg) throws     Exception{

        String authKey = AUTH_KEY_FCM;   // You FCM AUTH key
        String FMCurl = API_URL_FCM;

        URL url = new URL(FMCurl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization","key="+authKey);
        conn.setRequestProperty("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("to",userDeviceIdKey.trim());
        System.out.println(msg.toString());
        //body.put("")
        json.put("data", msg); // Notification body


        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(json.toString());
        wr.flush();
        conn.getInputStream();
    }
}
