package X;

import com.whatsapp.util.Log;

/* renamed from: X.2c6  reason: invalid class name and case insensitive filesystem */
public class C51692c6 extends AnonymousClass2Qh {
    public final /* synthetic */ C51542bq A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ byte[] A03;

    public C51692c6(C51542bq r1, String str, byte[] bArr, boolean z2) {
        this.A00 = r1;
        this.A02 = z2;
        this.A03 = bArr;
        this.A01 = str;
    }

    public void A02(C28371Vv r5) {
        if (!this.A02) {
            Log.i("app/handle/skip-set-recovery-token");
            C51542bq r3 = this.A00;
            r3.A07.A0K().putBoolean("pref_deprecate_rc", true).apply();
            C004101u.A08(r3.A06.A00);
            return;
        }
        if (!C004101u.A0B(this.A00.A06.A00, this.A01, this.A03)) {
            Log.e("app/set-recovery-token/fail");
        }
    }
}
