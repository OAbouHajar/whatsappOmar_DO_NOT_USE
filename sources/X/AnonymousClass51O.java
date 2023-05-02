package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.51O  reason: invalid class name */
public abstract class AnonymousClass51O implements C19550yc {
    public Long A00 = null;
    public final AnonymousClass12C A01;
    public final UserJid A02;
    public final C34571kU A03;

    public AnonymousClass51O(AnonymousClass12C r2, UserJid userJid, C34571kU r4) {
        this.A02 = userJid;
        this.A01 = r2;
        this.A03 = r4;
    }

    public abstract int A00();

    public void A01(C28371Vv r9, int i2) {
        A02(r9, Integer.valueOf(i2), (Integer) null, (String) null, 0, true);
    }

    public void A02(C28371Vv r9, Integer num, Integer num2, String str, long j2, boolean z2) {
        int intValue;
        AnonymousClass12C r2 = this.A01;
        UserJid userJid = this.A02;
        Integer num3 = num;
        Integer num4 = num2;
        r2.A00(userJid, num3, num4, this.A00, A00());
        if (z2) {
            if (num2 == null) {
                intValue = 0;
            } else {
                intValue = num2.intValue();
                if (417 == intValue) {
                    this.A03.AQV(userJid, intValue);
                    return;
                }
            }
            int intValue2 = num.intValue();
            if (intValue2 != 200) {
                this.A03.AQV(userJid, intValue2);
                return;
            } else if (401 == intValue || 403 == intValue || 404 == intValue) {
                this.A03.APU(userJid);
                return;
            }
        } else if (str != null) {
            this.A03.AXe(userJid, str, j2);
            return;
        }
        this.A03.AU1(userJid);
    }

    public void APb(String str) {
        this.A01.A00(this.A02, 500, 500, this.A00, A00());
    }

    public void AQe(C28371Vv r2, String str) {
        A01(r2, C34451kH.A00(r2));
    }
}
