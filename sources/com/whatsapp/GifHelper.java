package com.whatsapp;

import X.AnonymousClass12W;
import X.AnonymousClass20O;
import X.C17970vw;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class GifHelper {
    public static void A00(AnonymousClass12W r5, File file) {
        AnonymousClass20O r1;
        try {
            File A01 = r5.A01(file);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(file.getAbsolutePath(), A01.getAbsolutePath());
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                r1 = new AnonymousClass20O(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder sb = new StringBuilder();
                sb.append("gif-helper/applyGifTag");
                sb.append(applyGifTag.errorMessage);
                Log.e(sb.toString());
                int i2 = applyGifTag.errorCode;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid result, error_code: ");
                sb2.append(i2);
                r1 = new AnonymousClass20O(i2, sb2.toString());
            } else if (!C17970vw.A0N(r5, A01, file)) {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                r1 = new AnonymousClass20O(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            } else {
                return;
            }
            throw r1;
        } catch (IOException e2) {
            Log.e("Could not access file or failed to move files properly", e2);
            throw new AnonymousClass20O(0, "Could not access file or failed to move files properly");
        }
    }

    public static boolean A01(File file) {
        return file != null && hasGifTag(file.getAbsolutePath());
    }

    public static native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    public static native boolean hasGifTag(String str);
}
