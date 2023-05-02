package com.obwhatsapp;

import X.AnonymousClass2BF;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

public class WaMediaThumbnailView extends WaImageView {
    public Bitmap A00;
    public AnonymousClass2BF A01;

    public WaMediaThumbnailView(Context context) {
        super(context);
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public AnonymousClass2BF getMediaItem() {
        return this.A01;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public void setMediaItem(AnonymousClass2BF r1) {
        this.A01 = r1;
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
        setImageBitmap(bitmap);
    }
}
