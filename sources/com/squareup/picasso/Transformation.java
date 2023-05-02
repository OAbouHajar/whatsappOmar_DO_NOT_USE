package com.squareup.picasso;

import android.graphics.Bitmap;

/* compiled from: XFMFile */
public interface Transformation {
    String key();

    Bitmap transform(Bitmap bitmap);
}
