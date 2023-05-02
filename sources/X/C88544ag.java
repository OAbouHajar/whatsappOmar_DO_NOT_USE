package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.4ag  reason: invalid class name and case insensitive filesystem */
public class C88544ag {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public InputContentInfoCompat A00;

    public C83474Gu A00(InputContentInfoCompat inputContentInfoCompat, int i2) {
        try {
            InputContentInfoCompat inputContentInfoCompat2 = this.A00;
            if (inputContentInfoCompat2 != null) {
                inputContentInfoCompat2.releasePermission();
            }
        } catch (Exception e2) {
            Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e2);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
        for (String str : A01) {
            if (inputContentInfoCompat.getDescription().hasMimeType(str)) {
                if ((i2 & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                    } catch (Exception e3) {
                        Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e3);
                        return null;
                    }
                }
                Log.i(AnonymousClass000.A0h(inputContentInfoCompat.getContentUri().toString(), AnonymousClass000.A0r("conversation/onCommitContent: ")));
                this.A00 = inputContentInfoCompat;
                return new C83474Gu(str, inputContentInfoCompat.getContentUri());
            }
        }
        return null;
    }
}
