package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1oR  reason: invalid class name and case insensitive filesystem */
public class C36991oR extends AnonymousClass1WJ {
    public final AnonymousClass1ZX A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r1[0].equals(r2) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C36991oR(X.C28481Wg r13, X.AnonymousClass1WK r14, X.AnonymousClass1ZX r15, com.whatsapp.jid.UserJid r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, long r20) {
        /*
            r12 = this;
            r2 = r18
            r1 = r19
            r8 = 2
            r11 = 0
            java.lang.String r7 = "critical_unblock_low"
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r17
            r9 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            r0 = r16
            r12.A01 = r0
            r12.A00 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = ""
        L_0x0020:
            r12.A02 = r1
            if (r18 == 0) goto L_0x0038
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0035
            r0 = r1[r11]
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0038
        L_0x0035:
            r12.A03 = r2
            return
        L_0x0038:
            java.lang.String r2 = ""
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36991oR.<init>(X.1Wg, X.1WK, X.1ZX, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public C48232Mj A01() {
        if (this.A05.equals(C28481Wg.A02)) {
            return null;
        }
        C28581Wr A0U = C36981oQ.A04.A0U();
        String str = this.A02;
        A0U.A03();
        C36981oQ r1 = (C36981oQ) A0U.A00;
        r1.A00 |= 1;
        r1.A02 = str;
        String str2 = this.A03;
        if (!TextUtils.isEmpty(str2)) {
            A0U.A03();
            C36981oQ r12 = (C36981oQ) A0U.A00;
            r12.A00 |= 2;
            r12.A01 = str2;
        }
        AnonymousClass1ZX r0 = this.A00;
        if (r0 != null) {
            String rawString = r0.getRawString();
            A0U.A03();
            C36981oQ r13 = (C36981oQ) A0U.A00;
            r13.A00 |= 4;
            r13.A03 = rawString;
        }
        C48232Mj A012 = super.A01();
        AnonymousClass00B.A06(A012);
        A012.A03();
        C28531Wl r14 = (C28531Wl) A012.A00;
        r14.A08 = (C36981oQ) A0U.A02();
        r14.A00 |= 4;
        return A012;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContactMutation{rowId=");
        sb.append(this.A07);
        sb.append(", contactJid=");
        sb.append(this.A01);
        sb.append(", lidJid=");
        sb.append(this.A00);
        sb.append(", givenName=");
        sb.append(this.A03);
        sb.append(", displayName=");
        sb.append(this.A02);
        sb.append(", timestamp=");
        sb.append(this.A04);
        sb.append(", areDependenciesMissing=");
        sb.append(A06());
        sb.append(", operation=");
        sb.append(this.A05);
        sb.append(", collectionName=");
        sb.append(this.A06);
        sb.append(", keyId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
