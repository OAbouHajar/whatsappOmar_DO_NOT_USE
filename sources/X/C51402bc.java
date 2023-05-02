package X;

import android.util.Base64;
import com.facebook.redex.IDxNFunctionShape136S0100000_2_I0;

/* renamed from: X.2bc  reason: invalid class name and case insensitive filesystem */
public class C51402bc implements C19550yc {
    public final /* synthetic */ C229619y A00;
    public final /* synthetic */ C51392bb A01;
    public final /* synthetic */ String A02;

    public C51402bc(C229619y r1, C51392bb r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void APb(String str) {
        this.A00.A06.compareAndSet((Object) null, this.A02);
    }

    public void AQe(C28371Vv r1, String str) {
    }

    public void AYG(C28371Vv r6, String str) {
        Object obj;
        C51392bb r1 = this.A01;
        C229619y r4 = this.A00;
        C16300so r3 = r4.A00;
        C28371Vv.A06(r6, "iq");
        C32271fx.A03(r6, new AnonymousClass51P(r3, r1.A00), new String[0]);
        try {
            obj = C32271fx.A03(r6, new IDxNFunctionShape136S0100000_2_I0(r3, 1), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        AnonymousClass4U5 r0 = (AnonymousClass4U5) obj;
        if (r0 != null) {
            C15860rz r32 = r4.A03;
            r32.A0K().putString("pref_client_auth_token", Base64.encodeToString(r0.A01, 3)).apply();
            if (r4.A04.A0E(C16620tM.A02, 1689)) {
                r4.A02.A00();
            }
        }
    }
}
