package X;

import android.content.SharedPreferences;

/* renamed from: X.15S  reason: invalid class name */
public class AnonymousClass15S {
    public final AnonymousClass15R A00;

    public AnonymousClass15S(AnonymousClass15R r1) {
        this.A00 = r1;
    }

    public synchronized void A00(String str) {
        AnonymousClass15R r0 = this.A00;
        SharedPreferences.Editor edit = r0.A01().edit();
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        edit.putLong(sb.toString(), r0.A00(str) + 1).apply();
    }
}
