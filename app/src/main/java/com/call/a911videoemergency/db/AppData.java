package com.call.a911videoemergency.db;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by sanniAdewale on 10/07/2017.
 */

public class AppData {

    Context context;
    SharedPreferences prefs;

    public AppData(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences("call_pref", 0);
    }

    public void setCountry(String country) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("country", country);
        editor.apply();
    }

    public String getCountry() {
        return prefs.getString("country", "");
    }
}
