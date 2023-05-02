package X;

import android.content.Context;
import android.os.Environment;
import com.facebook.redex.IDxSCallbackShape222S0100000_2_I1;

/* renamed from: X.4Oc  reason: invalid class name and case insensitive filesystem */
public final class C85354Oc {
    public long A00;
    public String A01;
    public final Context A02;
    public final C14870pt A03;
    public final C32301g2 A04 = new IDxSCallbackShape222S0100000_2_I1(this, 0);
    public final AnonymousClass12W A05;
    public final C14730pf A06;
    public final C23251Bb A07;
    public final C16320sq A08;

    public C85354Oc(Context context, C14870pt r4, AnonymousClass12W r5, C14730pf r6, C23251Bb r7, C16320sq r8) {
        C18450wi.A0H(r7, 2);
        AnonymousClass3K2.A1I(r8, r4);
        C18450wi.A0H(r5, 5);
        C18450wi.A0H(r6, 6);
        this.A02 = context;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = r4;
        this.A05 = r5;
        this.A06 = r6;
        String externalStorageState = Environment.getExternalStorageState();
        C18450wi.A0B(externalStorageState);
        this.A01 = externalStorageState;
    }
}
