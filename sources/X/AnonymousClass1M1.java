package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.redex.IDxCListenerShape4S0400000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.1M1  reason: invalid class name */
public class AnonymousClass1M1 {
    public final C23241Ba A00;
    public final C16080sP A01;
    public final C14730pf A02;
    public final AnonymousClass1M0 A03;
    public final C16480t8 A04;
    public final C16320sq A05;

    public AnonymousClass1M1(C23241Ba r1, C16080sP r2, C14730pf r3, AnonymousClass1M0 r4, C16480t8 r5, C16320sq r6) {
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public C005702l A00(Activity activity, C14600pS r10, C16010sH r11) {
        Activity activity2 = activity;
        C32241fu r1 = new C32241fu(activity);
        r1.A01(R.string.str08a0);
        C14600pS r4 = r10;
        C16010sH r6 = r11;
        r1.setPositiveButton(R.string.str0b61, new IDxCListenerShape4S0400000_2_I0(activity2, r4, this, r6, 4));
        r1.A0B(new IDxCListenerShape4S0400000_2_I0(activity2, r4, this, r6, 5), R.string.str1ba2);
        return r1.create();
    }

    public final void A01(Context context, C14600pS r13, C16010sH r14, boolean z2) {
        r13.Afr(R.string.str13dc, R.string.str13db);
        C16320sq r1 = this.A05;
        C14730pf r7 = this.A02;
        AnonymousClass1M0 r8 = this.A03;
        Context context2 = context;
        r1.Ack(new AnonymousClass36X(context2, r13, this.A00, this.A01, r7, r8, r14, z2), new Void[0]);
    }
}
