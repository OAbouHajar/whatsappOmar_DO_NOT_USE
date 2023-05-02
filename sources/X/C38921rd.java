package X;

import android.text.TextUtils;

/* renamed from: X.1rd  reason: invalid class name and case insensitive filesystem */
public class C38921rd extends C38711rI implements C30591cd, C16850tk, C30081bi {
    public C30611cf A00;

    public C38921rd(C16750ta r9, C28381Vw r10, C38921rd r11, long j2) {
        super(r9, r10, (C38711rI) r11, j2, true);
        this.A00 = r11.A00.A00();
    }

    public C38921rd(C28381Vw r2, long j2) {
        super(r2, (byte) 28, j2);
    }

    public String ACS() {
        if (TextUtils.isEmpty(this.A00.A03)) {
            return this.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        C30611cf r1 = this.A00;
        sb.append(r1.A02);
        sb.append(" ");
        sb.append(r1.A03);
        return sb.toString();
    }

    public String ADz(AnonymousClass013 r3) {
        StringBuilder sb = new StringBuilder("🎥 ");
        sb.append(this.A00.A02);
        return sb.toString();
    }

    public String AFB() {
        return this.A00.A02;
    }

    public String AFK() {
        return this.A00.A02;
    }

    public C30611cf AGV() {
        return this.A00;
    }

    public void Aep(C30611cf r1) {
        this.A00 = r1;
    }
}
