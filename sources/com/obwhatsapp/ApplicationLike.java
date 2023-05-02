package com.obwhatsapp;

import android.content.res.Configuration;

public interface ApplicationLike {
    void onConfigurationChanged(Configuration configuration);

    void onCreate();
}
