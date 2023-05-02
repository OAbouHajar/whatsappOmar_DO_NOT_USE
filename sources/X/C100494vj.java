package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100494vj implements C108535Oj {
    public final /* synthetic */ C108535Oj A00;
    public final /* synthetic */ C50262Yq A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;

    public /* synthetic */ C100494vj(C108535Oj r1, C50262Yq r2, UserJid userJid, Integer num) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = num;
        this.A00 = r1;
    }

    public final void ASw(Bitmap bitmap, C62723Er r9, boolean z2) {
        C50262Yq r1 = this.A01;
        UserJid userJid = this.A02;
        Integer num = this.A03;
        C108535Oj r5 = this.A00;
        if (!z2) {
            r1.A03.remove(r9);
        }
        if (!(userJid == null || num == null)) {
            C23091Al r12 = r1.A02;
            int intValue = num.intValue();
            Number number = (Number) r12.A01.get(num);
            if (number != null) {
                r12.A00.A02(new AnonymousClass4L0(userJid, (String) null, z2), number.intValue(), intValue);
            }
        }
        r5.ASw(bitmap, r9, z2);
    }
}
