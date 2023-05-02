package X;

import android.util.Log;

/* renamed from: X.1b2  reason: invalid class name and case insensitive filesystem */
public class C29691b2 {
    public static void A00(String str, String str2) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        sb.append(str2);
        Log.e("Whatsapp", sb.toString());
        A01(str, str2, (Throwable) null);
    }

    public static void A01(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        Log.e("Whatsapp", sb.toString(), th);
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(str);
        sb2.append("] ");
        Log.e("Whatsapp", sb2.toString(), th);
        C89634ca.A00();
        if (C814548h.A00) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("RenderCore:");
            sb3.append(str);
            Log.e(sb3.toString(), str2, th);
        }
    }

    public static void A02(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("] ");
        sb.append(th);
        Log.e("Whatsapp", sb.toString());
        A01(str, "", th);
    }
}
