package X;

import android.opengl.GLES20;
import com.whatsapp.util.Log;

/* renamed from: X.4YC  reason: invalid class name */
public class AnonymousClass4YC {
    public static void A00(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                Log.e(C13680ns.A0i(": glError ", AnonymousClass000.A0q(str), glGetError));
            } else {
                return;
            }
        }
    }

    public static void A01(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw AnonymousClass000.A0a(C13680ns.A0i(": GLES20 error: ", AnonymousClass000.A0q(str), glGetError));
        }
    }
}
