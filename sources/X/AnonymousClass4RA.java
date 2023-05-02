package X;

import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4RA  reason: invalid class name */
public class AnonymousClass4RA {
    public int A00;
    public int A01;
    public final /* synthetic */ C86224Rt A02;

    public AnonymousClass4RA(C86224Rt r1) {
        this.A02 = r1;
    }

    public void A00(UserJid userJid, Integer num, int i2) {
        if (i2 != 1) {
            this.A01 = 4;
            C86224Rt r2 = this.A02;
            boolean A0I = r2.A02.A0I(userJid);
            int i3 = R.string.str04df;
            if (A0I) {
                i3 = R.string.str04e0;
            }
            this.A00 = i3;
            if (A0I && num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    r2.A04.A02(false);
                } else if (intValue == 4) {
                    C87084Vh r22 = r2.A04;
                    C74803r8 A002 = C74803r8.A00(r22);
                    A002.A02 = C13690nt.A0U();
                    A002.A00 = Boolean.FALSE;
                    r22.A01.A06(A002);
                }
            }
        } else {
            this.A01 = 2;
            this.A00 = R.string.str04e4;
        }
        int i4 = this.A01;
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialog_id", i4);
        C86224Rt r23 = this.A02;
        C14530pL r3 = r23.A03;
        A0D.putCharSequence("message", r3.getString(this.A00));
        A0D.putString("user_jid", userJid.getRawString());
        C82644Dp r24 = r23.A01;
        A0D.putString("positive_button", r3.getString(R.string.str04e5));
        A0D.putString("negative_button", r3.getString(R.string.str0394));
        AnonymousClass3K3.A11(A0D, r3, r24);
    }
}
