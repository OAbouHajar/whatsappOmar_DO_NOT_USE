package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape129S0100000_3_I0;
import com.obwhatsapp.R;

/* renamed from: X.5we  reason: invalid class name and case insensitive filesystem */
public class C119165we {
    public C14870pt A00;
    public C18260wP A01;
    public C16460t6 A02;
    public C18340wX A03;
    public C18300wT A04;
    public C18310wU A05;
    public C18320wV A06;
    public C18290wS A07;
    public C118915vc A08;
    public C18280wR A09;
    public C16320sq A0A;
    public final C14710pd A0B;
    public final C1200860g A0C;
    public final C1204661t A0D;
    public final C18090w8 A0E;
    public final C112495ia A0F;
    public final AnonymousClass1Vo A0G = C110105dW.A0Q("BrazilPaymentAccountActionsContainerPresenter", "payment-settings");
    public final AnonymousClass1TR A0H;

    public C119165we(C14870pt r3, C18260wP r4, C16460t6 r5, C14710pd r6, C1200860g r7, C1204661t r8, C18340wX r9, C18300wT r10, C18310wU r11, C18090w8 r12, C18320wV r13, C18290wS r14, C112495ia r15, C118915vc r16, AnonymousClass1TR r17, C18280wR r18, C16320sq r19) {
        this.A00 = r3;
        this.A0A = r19;
        this.A09 = r18;
        this.A07 = r14;
        this.A02 = r5;
        this.A04 = r10;
        this.A05 = r11;
        this.A08 = r16;
        this.A06 = r13;
        this.A01 = r4;
        this.A03 = r9;
        this.A0B = r6;
        this.A0C = r7;
        this.A0E = r12;
        this.A0D = r8;
        this.A0H = r17;
        this.A0F = r15;
    }

    public static /* synthetic */ void A00(C14530pL r4, C49402Ta r5) {
        String string;
        if (r5 == null || r5.A00 == null) {
            string = r4.getString(R.string.str06ae);
        } else {
            string = C13680ns.A0d(r4, r5.A02(), C13680ns.A1b(), 0, R.string.str06af);
        }
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("message", string);
        A0D2.putString("title", r4.getString(R.string.str06ad));
        AnonymousClass29T.A02(r4, A0D2, 101);
    }

    public Dialog A01(Bundle bundle, C14530pL r6, int i2) {
        Context applicationContext = r6.getApplicationContext();
        String str = null;
        switch (i2) {
            case 100:
                C32241fu A002 = C32241fu.A00(r6);
                C110115dX.A0m(applicationContext, A002, R.string.str0f36);
                A002.A09(new IDxCListenerShape129S0100000_3_I0(r6, 1), applicationContext.getString(R.string.str0e87));
                return A002.create();
            case 101:
                String string = r6.getString(R.string.str06b0);
                if (bundle != null) {
                    string = bundle.getString("message");
                    str = bundle.getString("title");
                }
                return A02(r6, string, str, i2);
            case 102:
                return A02(r6, r6.getString(R.string.str1457), r6.getString(R.string.str1458), i2);
            default:
                return null;
        }
    }

    public final C005702l A02(C14530pL r5, CharSequence charSequence, CharSequence charSequence2, int i2) {
        Context applicationContext = r5.getApplicationContext();
        C32241fu r2 = new C32241fu(r5, R.style.style0174);
        r2.A06(charSequence);
        r2.setTitle(charSequence2);
        r2.A07(true);
        r2.A08(new AnonymousClass5xz(r5, i2), applicationContext.getString(R.string.str0394));
        r2.A09(new AnonymousClass5y3(r5, this, i2), applicationContext.getString(R.string.str0472));
        r2.A03(new C119475xw(r5, i2));
        return r2.create();
    }
}
