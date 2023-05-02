package X;

import android.text.TextUtils;

/* renamed from: X.3hS  reason: invalid class name and case insensitive filesystem */
public class C70653hS extends AnonymousClass1ZR {
    public C40531uH A00;
    public boolean A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70653hS(X.C17130ua r2, X.C40531uH r3) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A07
            r1.<init>(r2, r0)
            r1.A0D = r0
            r1.A0L(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70653hS.<init>(X.0ua, X.1uH):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C70653hS(X.C17130ua r2, X.AnonymousClass4NG r3) {
        /*
            r1 = this;
            java.lang.String r0 = r3.A02
            r1.<init>(r2, r0)
            r1.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70653hS.<init>(X.0ua, X.4NG):void");
    }

    public boolean A0F() {
        return true;
    }

    public boolean A0G() {
        return this.A01;
    }

    public void A0L(C40531uH r4) {
        this.A00 = r4;
        this.A0K = r4.A09;
        this.A0H = r4.A02;
        this.A0D = r4.A07;
        this.A0T = r4.A0D;
        byte[] bArr = r4.A00;
        if (bArr == null || bArr.length <= 0) {
            String str = r4.A08;
            if (str != null) {
                this.A0P.add(str);
            }
        } else {
            this.A0T = bArr;
        }
        String str2 = r4.A04;
        if (!TextUtils.isEmpty(str2)) {
            this.A0A = new C76703uY(-1, str2, -1);
        }
    }
}
