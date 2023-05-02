package X;

import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2ZK  reason: invalid class name */
public class AnonymousClass2ZK {
    public final C18890xQ A00;

    public AnonymousClass2ZK(C18890xQ r1) {
        this.A00 = r1;
    }

    public Intent A00(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.A01() ? "market://details?id=com.obwhatsapp.w4b&utm_source=" : "https://play.google.com/store/apps/details?id=com.obwhatsapp.w4b&utm_source=");
        sb.append(str);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
    }
}
