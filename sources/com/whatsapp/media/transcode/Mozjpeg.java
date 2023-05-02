package com.whatsapp.media.transcode;

import android.graphics.Bitmap;
import java.io.IOException;

public class Mozjpeg {
    private native boolean compressToFile(Bitmap bitmap, String str, int i2, boolean z2, boolean z3);

    public void A00(Bitmap bitmap, String str, int i2, boolean z2, boolean z3) {
        try {
            compressToFile(bitmap, str, i2, z2, z3);
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }
}
