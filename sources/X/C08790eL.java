package X;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.0eL  reason: invalid class name and case insensitive filesystem */
public class C08790eL implements C13370lv {
    public static final C08790eL A00 = new C08790eL();

    public final void A00(int i2, String str, String str2) {
        StringBuilder A0q = AnonymousClass000.A0q("unknown");
        A0q.append(":");
        Log.println(i2, AnonymousClass000.A0h(str, A0q), str2);
    }

    public final void A01(String str, String str2, Throwable th, int i2) {
        StringBuilder A0q = AnonymousClass000.A0q("unknown");
        A0q.append(":");
        String A0h = AnonymousClass000.A0h(str, A0q);
        StringBuilder A0q2 = AnonymousClass000.A0q(str2);
        A0q2.append(10);
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        Log.println(i2, A0h, AnonymousClass000.A0h(stringWriter.toString(), A0q2));
    }

    public void A8J(String str, String str2) {
        A00(6, str, str2);
    }

    public void A8K(String str, String str2, Throwable th) {
        A01(str, str2, th, 6);
    }

    public void AHr(String str, String str2) {
        A00(4, "OpticE2EConfig", str2);
    }

    public boolean AJ7(int i2) {
        return 5 <= i2;
    }

    public void Ahh(String str, String str2) {
        A00(2, str, str2);
    }

    public void Ai1(String str, String str2) {
        A00(5, str, str2);
    }

    public void Ai2(String str, String str2, Throwable th) {
        A01(str, str2, th, 5);
    }

    public void AiK(String str, String str2) {
        A00(6, str, str2);
    }

    public void AiL(String str, String str2, Throwable th) {
        A01("FixedOrientationCompat", str2, th, 6);
    }
}
