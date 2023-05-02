package X;

import android.text.TextUtils;

/* renamed from: X.1Kz  reason: invalid class name and case insensitive filesystem */
public class C25751Kz {
    public final AnonymousClass1K8 A00;
    public final C14710pd A01;

    public C25751Kz(AnonymousClass1K8 r1, C14710pd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean A00(C35611mD r4) {
        if (this.A01.A0E(C16620tM.A02, 355) && r4 != null) {
            String str = r4.A0D;
            if (!TextUtils.isEmpty(str)) {
                return this.A00.A01(str);
            }
        }
        return false;
    }

    public boolean A01(C35611mD r4) {
        C14710pd r2 = this.A01;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 355) && r2.A0E(r1, 636) && A00(r4);
    }
}
