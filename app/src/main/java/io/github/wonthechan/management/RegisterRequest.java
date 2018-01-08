package io.github.wonthechan.management;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YeChan on 2018-01-07.
 */

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://211.252.53.222/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userName, int userAge, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userName", userName);
        parameters.put("userAge", userAge+""); // ""을 더함으로서 문자열로 캐스팅
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
