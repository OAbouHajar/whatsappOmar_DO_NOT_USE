package X;

import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Rt  reason: invalid class name and case insensitive filesystem */
public class C86224Rt {
    public AnonymousClass4RA A00;
    public C82644Dp A01 = new C82644Dp(this);
    public final C16040sK A02;
    public final C14530pL A03;
    public final C87084Vh A04;
    public final AnonymousClass39X A05;

    public C86224Rt(C50732aM r3, C50742aN r4, C16040sK r5, C14530pL r6, C16050sL r7, int i2) {
        AnonymousClass4RA r1 = new AnonymousClass4RA(this);
        this.A00 = r1;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r4.A00(r6, r1, r7);
        this.A04 = new C87084Vh(C16150sX.A0m(r3.A00.A03), i2);
    }

    public void A00(UserJid userJid) {
        if (!this.A05.A02()) {
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("dialog_id", 3);
            C14530pL r3 = this.A03;
            C16040sK r2 = this.A02;
            boolean A0I = r2.A0I(userJid);
            int i2 = R.string.str06be;
            if (A0I) {
                i2 = R.string.str06c0;
            }
            A0D.putString("title", r3.getString(i2));
            boolean A0I2 = r2.A0I(userJid);
            int i3 = R.string.str06bc;
            if (A0I2) {
                i3 = R.string.str06bf;
            }
            A0D.putCharSequence("message", r3.getString(i3));
            A0D.putString("user_jid", userJid.getRawString());
            C82644Dp r22 = this.A01;
            A0D.putString("positive_button", r3.getString(R.string.str0e87));
            A0D.putString("negative_button", r3.getString(R.string.str0394));
            AnonymousClass3K3.A11(A0D, r3, r22);
        }
    }
}
