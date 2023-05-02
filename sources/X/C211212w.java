package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.R;

/* renamed from: X.12w  reason: invalid class name and case insensitive filesystem */
public class C211212w {
    public String A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C16300so A03;
    public final C16040sK A04;
    public final C33401iW A05 = new C33401iW();
    public final C16600tK A06;
    public final C16980tz A07;
    public final C15860rz A08;
    public final AnonymousClass12C A09;
    public final C17190ug A0A;

    public C211212w(C16300so r3, C16040sK r4, C16600tK r5, C16980tz r6, C15860rz r7, AnonymousClass12C r8, C17190ug r9) {
        this.A07 = r6;
        this.A03 = r3;
        this.A04 = r4;
        this.A0A = r9;
        this.A06 = r5;
        this.A08 = r7;
        this.A09 = r8;
    }

    public String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        A01((C34571kU) null);
        String string = ((SharedPreferences) this.A08.A01.get()).getString("my_current_status", (String) null);
        return string == null ? this.A07.A00.getString(R.string.str0b73) : string;
    }

    public void A01(C34571kU r10) {
        if (!this.A01) {
            C16980tz r5 = this.A07;
            C34591kW r3 = new C34591kW(this.A03, r5, this.A09, this.A0A, new C34581kV(this, r10));
            C16040sK r0 = this.A04;
            r0.A0B();
            AnonymousClass1ZT r2 = r0.A05;
            AnonymousClass00B.A06(r2);
            r3.A00(r2, 0);
            this.A01 = true;
        }
    }

    public void A02(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A08.A17(str, str2);
        this.A02.post(new RunnableRunnableShape2S0100000_I0_1(this.A05, 9));
    }
}
