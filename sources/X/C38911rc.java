package X;

import android.text.TextUtils;

/* renamed from: X.1rc  reason: invalid class name and case insensitive filesystem */
public class C38911rc extends C38631rA implements C30591cd, C16850tk, C30081bi {
    public C30611cf A00;

    public C38911rc(C16750ta r10, C28381Vw r11, C38911rc r12, long j2) {
        super(r10, r11, r12, r12.A10, j2, true);
        this.A00 = r12.A00.A00();
    }

    public C38911rc(C28381Vw r2, long j2) {
        super(r2, (byte) 26, j2);
    }

    public String ACS() {
        String str;
        if (!TextUtils.isEmpty(this.A00.A03)) {
            StringBuilder sb = new StringBuilder();
            C30611cf r1 = this.A00;
            sb.append(r1.A02);
            sb.append(" ");
            sb.append(r1.A03);
            str = sb.toString();
        } else {
            str = this.A00.A02;
        }
        String A19 = A19();
        if (TextUtils.isEmpty(A19)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A19);
        sb2.append(" ");
        sb2.append(str);
        return sb2.toString();
    }

    public String ADz(AnonymousClass013 r3) {
        StringBuilder sb = new StringBuilder("📄 ");
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
