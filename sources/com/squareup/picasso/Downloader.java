package com.squareup.picasso;

import androidx.annotation.NonNull;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: XFMFile */
public interface Downloader {
    @NonNull
    Response load(@NonNull Request request);

    void shutdown();
}
