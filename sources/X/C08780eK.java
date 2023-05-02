package X;

import android.util.Log;

/* renamed from: X.0eK  reason: invalid class name and case insensitive filesystem */
public class C08780eK implements C13370lv {
    public static final C08780eK A01 = new C08780eK();
    public int A00;

    public void A8J(String str, String str2) {
        Log.e(str, str2);
    }

    public void A8K(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void AHr(String str, String str2) {
        Log.i("OpticE2EConfig", str2);
    }

    public boolean AJ7(int i2) {
        return this.A00 <= i2;
    }

    public void Ahh(String str, String str2) {
        Log.v(str, str2);
    }

    public void Ai1(String str, String str2) {
        Log.w(str, str2);
    }

    public void Ai2(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void AiK(String str, String str2) {
        Log.e(str, str2);
    }

    public void AiL(String str, String str2, Throwable th) {
        Log.e("FixedOrientationCompat", str2, th);
    }
}
