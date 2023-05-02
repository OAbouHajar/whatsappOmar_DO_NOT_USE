package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3ym  reason: invalid class name and case insensitive filesystem */
public class C78843ym extends C16690tT {
    public final AnonymousClass160 A00;
    public final UserJid A01;
    public final AnonymousClass4NP A02;

    public C78843ym(AnonymousClass160 r1, UserJid userJid, AnonymousClass4NP r3) {
        this.A00 = r1;
        this.A01 = userJid;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A05(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C35511m3 r11 = (C35511m3) obj;
        AnonymousClass4NP r0 = this.A02;
        C87324Wh r7 = r0.A03;
        AnonymousClass5S3 r9 = r0.A02;
        C47372Ir r8 = r0.A01;
        UserJid userJid = r0.A00;
        String str = r0.A04;
        if (r9 != null) {
            r9.ASL();
        }
        if (!(r11 == null || r11.A05 == null || TextUtils.isEmpty(r11.A07()))) {
            C47372Ir AEf = r7.A03.A03().AEf();
            if (AEf != null && AEf.A5x(userJid)) {
                int i2 = (int) ((r11.A06().A00 >> 12) & 15);
                if (i2 != 0) {
                    if (i2 == 1) {
                        r7.A02.A0H(r7.A00.getString(R.string.str102e), 1);
                        return;
                    } else if (i2 == 2) {
                        r7.A00(userJid, r8, str, false);
                        return;
                    } else if (i2 != 3) {
                        Log.e("PAY: conversation/startPaymentInviteFlow/invalid consumer status");
                        return;
                    }
                }
            }
            Runnable runnable = r7.A06;
            if (runnable != null) {
                if (r9 != null) {
                    r9.AeJ(r11.A07());
                }
                runnable.run();
                return;
            }
            return;
        }
        r7.A00(userJid, r8, str, true);
    }
}
