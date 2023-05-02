package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.60Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass60Y implements AnonymousClass68L {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C35301lh A01;
    public final /* synthetic */ AnonymousClass5x5 A02;
    public final /* synthetic */ C116345rE A03;

    public /* synthetic */ AnonymousClass60Y(Activity activity, C35301lh r2, AnonymousClass5x5 r3, C116345rE r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = r2;
    }

    public final void AWU(UserJid userJid, C35301lh r13, C35301lh r14, C35301lh r15, AnonymousClass2HJ r16, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str4;
        BigDecimal bigDecimal;
        int i2;
        AnonymousClass5x5 r0 = this.A02;
        C116345rE r3 = this.A03;
        Activity activity = this.A00;
        C35301lh r8 = this.A01;
        AnonymousClass2HJ r2 = r16;
        if (!z2 || r16 != null) {
            C117425sy r1 = new C117425sy(1);
            r1.A01 = r2;
            r3.A00.A01.A0B(r1);
            return;
        }
        boolean z7 = z3;
        if (z4) {
            r0.A00.A00(activity, new C119835zh(r3, z7), userJid, r8, true, false);
            return;
        }
        C110705eh r4 = r3.A00;
        C119395xh A05 = r4.A05();
        A05.A0P = z7;
        A05.A09 = (String) C110105dW.A0d(r13);
        String str5 = str3;
        if (str3 != null) {
            A05.A06 = str5;
        }
        if (!TextUtils.isEmpty(A05.A0A) && (str4 = A05.A02) != null && (str4.contentEquals("DEEP_LINK") || str4.contentEquals("GALLERY_QR_CODE"))) {
            String str6 = A05.A0A;
            C28411Vz r5 = C35481m0.A05;
            C28401Vy A0B = C110115dX.A0B(r5, str6);
            String A002 = r4.A07.A00(A05.A06, A05.A0C, z7);
            if (!AnonymousClass1ZW.A0E(A002)) {
                bigDecimal = new BigDecimal(A002);
                if (A0B != null && A0B.A00.compareTo(bigDecimal) > 0) {
                    i2 = 9;
                    if (z3) {
                        i2 = 8;
                    }
                }
            } else {
                bigDecimal = new BigDecimal(AnonymousClass5xQ.A00(r4.A04, A05));
                if (A0B != null && A0B.A00.compareTo(bigDecimal) > 0) {
                    i2 = 7;
                }
            }
            C117425sy r22 = new C117425sy(i2);
            r22.A02 = r5.A9I(r4.A05, bigDecimal, 0);
            r4.A01.A0B(r22);
            return;
        }
        r4.A00.A0B(A05);
        C110705eh.A01(r4);
    }
}
