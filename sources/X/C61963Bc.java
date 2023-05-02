package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.3Bc  reason: invalid class name and case insensitive filesystem */
public class C61963Bc {
    public static C15830rv A00(C16040sK r3, C16010sH r4, C16740tZ r5) {
        if (r5 == null || r5.A0C == 6 || (!r4.A0J() && !C16030sJ.A0G(r4.A0E))) {
            return null;
        }
        if (r5.A11.A02) {
            r3.A0B();
            return r3.A05;
        }
        C15830rv A0B = r5.A0B();
        if (A0B != null) {
            return A0B;
        }
        Log.e(AnonymousClass000.A0h(C38621r6.A0J(r5), AnonymousClass000.A0r("conversations_row/missing_rmt_src:")));
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r0 = r6.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A01(android.content.Context r2, X.C16040sK r3, X.C16080sP r4, X.AnonymousClass013 r5, X.C16010sH r6, boolean r7) {
        /*
            java.lang.String r1 = ""
            if (r7 != 0) goto L_0x0048
            if (r6 == 0) goto L_0x0046
            X.0rv r0 = r6.A0E
            if (r0 == 0) goto L_0x0046
            boolean r0 = r3.A0I(r0)
            if (r0 != 0) goto L_0x0046
            java.lang.String r2 = r4.A0C(r6)
        L_0x0014:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r1.append(r2)
            java.lang.String r0 = ": "
            java.lang.String r6 = X.AnonymousClass000.A0h(r0, r1)
            boolean r5 = X.C13680ns.A1Z(r5)
            r4 = 2
            r3 = 1
            r2 = 0
            r0 = 3
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            r0 = 8207(0x200f, float:1.15E-41)
            if (r5 == 0) goto L_0x0037
            r0 = 8206(0x200e, float:1.1499E-41)
        L_0x0037:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1[r2] = r0
            r1[r3] = r6
            r1[r4] = r0
            java.lang.CharSequence r1 = android.text.TextUtils.concat(r1)
        L_0x0045:
            return r1
        L_0x0046:
            r2 = r1
            goto L_0x0014
        L_0x0048:
            r0 = 2131888915(0x7f120b13, float:1.9412479E38)
            java.lang.String r2 = r2.getString(r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61963Bc.A01(android.content.Context, X.0sK, X.0sP, X.013, X.0sH, boolean):java.lang.CharSequence");
    }

    public static CharSequence A02(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        boolean A0G = C45902Bo.A0G(charSequence2);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = charSequence;
        char c2 = 8207;
        if (A0G) {
            c2 = 8206;
        }
        String valueOf = String.valueOf(c2);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = charSequence2;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }
}
