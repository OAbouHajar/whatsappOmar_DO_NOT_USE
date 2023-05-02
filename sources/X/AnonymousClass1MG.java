package X;

import android.content.SharedPreferences;
import org.json.JSONArray;

/* renamed from: X.1MG  reason: invalid class name */
public final class AnonymousClass1MG {
    public JSONArray A00;
    public final C15860rz A01;
    public final C16490t9 A02;
    public final AnonymousClass1M9 A03;

    public AnonymousClass1MG(C15860rz r2, C16490t9 r3, AnonymousClass1M9 r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r4, 3);
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void A00() {
        C15860rz r4 = this.A01;
        synchronized (r4.A04) {
            r4.A0K().putInt("sticker_suggestion_sticker_sent_count", ((SharedPreferences) r4.A01.get()).getInt("sticker_suggestion_sticker_sent_count", 0) + 1).apply();
        }
    }

    public final void A01(int i2, int i3, int i4) {
        C74943rM r2 = new C74943rM();
        r2.A00 = Integer.valueOf(i2);
        r2.A01 = Long.valueOf((long) i3);
        r2.A02 = Long.valueOf((long) i4);
        this.A02.A06(r2);
    }
}
