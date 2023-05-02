package com.squareup.picasso;

import android.graphics.Bitmap;
import e.j;

/* compiled from: XFMFile */
public interface Cache {
    public static final Cache NONE = new j();

    void clear();

    void clearKeyUri(String str);

    Bitmap get(String str);

    int maxSize();

    void set(String str, Bitmap bitmap);

    int size();
}
