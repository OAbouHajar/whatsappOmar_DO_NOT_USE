package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;

/* renamed from: X.2Bw  reason: invalid class name and case insensitive filesystem */
public class C45982Bw extends C37871ps implements C45972Bv {
    public C441623a A00;
    public final C16980tz A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C45982Bw(X.C16300so r14, X.C16040sK r15, X.C15900s5 r16, X.C16000sG r17, X.C16080sP r18, X.AnonymousClass01V r19, X.C16980tz r20, X.AnonymousClass013 r21, X.C16500tA r22, X.C218415q r23, X.C441623a r24) {
        /*
            r13 = this;
            r0 = r24
            X.1qx r12 = r0.A02
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r21
            r10 = r22
            r11 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r20
            r13.A01 = r1
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45982Bw.<init>(X.0so, X.0sK, X.0s5, X.0sG, X.0sP, X.01V, X.0tz, X.013, X.0tA, X.15q, X.23a):void");
    }

    public final CharSequence A08(String str) {
        int i2 = this.A00.A00 - 1;
        if (i2 == 0) {
            return str;
        }
        return this.A01.A00.getResources().getQuantityString(R.plurals.plurals0124, i2, new Object[]{str, Integer.valueOf(i2)});
    }

    public final String A09() {
        C16980tz r0 = this.A01;
        C218415q r2 = this.A09;
        C441623a r1 = this.A00;
        int i2 = r1.A00 - 1;
        Context context = r0.A00;
        CharSequence A0G = r2.A0G(r1.A01);
        String str = ((C39101rv) r1.A02).A01;
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass00B.A06(str);
            if (!C37941pz.A02(str)) {
                str = "□";
            }
        }
        if (i2 != 0) {
            return context.getString(R.string.str134a, new Object[]{str, String.valueOf(i2), A0G});
        }
        return context.getString(R.string.str134c, new Object[]{str, A0G});
    }

    public C28381Vw AEH() {
        return this.A00.A01.A11;
    }
}
