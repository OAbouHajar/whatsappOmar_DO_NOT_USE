package X;

import android.content.SharedPreferences;

/* renamed from: X.2Zf  reason: invalid class name and case insensitive filesystem */
public final class C50372Zf implements AnonymousClass04N {
    public boolean A00;
    public boolean A01;
    public final C15860rz A02;

    public C50372Zf(C15860rz r4) {
        C18450wi.A0H(r4, 1);
        this.A02 = r4;
        this.A00 = r4.A1e();
        this.A01 = ((SharedPreferences) r4.A01.get()).getBoolean("detect_device_foldable_bookmode", false);
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        C05370Qr r6 = (C05370Qr) obj;
        AnonymousClass0UO r3 = null;
        C13510mV A002 = r6 == null ? null : C810046l.A00(r6);
        if (!this.A00 && A002 != null) {
            this.A00 = true;
            this.A02.A0K().putBoolean("detect_device_foldable", true).apply();
        }
        if (!this.A01) {
            if (A002 != null) {
                AnonymousClass0RQ r32 = ((C07950cl) A002).A00;
                r3 = r32.A02 - r32.A01 > r32.A00 - r32.A03 ? AnonymousClass0UO.A01 : AnonymousClass0UO.A02;
            }
            if (C18450wi.A0R(r3, AnonymousClass0UO.A02)) {
                this.A01 = true;
                this.A02.A0K().putBoolean("detect_device_foldable_bookmode", true).apply();
            }
        }
    }
}
