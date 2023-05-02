package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.obwhatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1yJ  reason: invalid class name and case insensitive filesystem */
public abstract class C42711yJ {
    public final int A00;
    public final C19980zJ A01;
    public final C18890xQ A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final C16440t3 A05;
    public final AnonymousClass013 A06;
    public final C14710pd A07;
    public final C218315p A08;

    public C42711yJ(C19980zJ r1, C18890xQ r2, C16000sG r3, C16080sP r4, C16440t3 r5, AnonymousClass013 r6, C14710pd r7, C218315p r8, int i2) {
        this.A05 = r5;
        this.A07 = r7;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A00 = i2;
    }

    public abstract int A00();

    public abstract int A01();

    public abstract int A02();

    public abstract int A03();

    public abstract int A04();

    public abstract int A05();

    public abstract int A06();

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (android.text.TextUtils.equals(r3, (java.lang.String) r0.A00.get(java.lang.Integer.valueOf(r2))) != false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.C35511m3 r8, com.whatsapp.jid.UserJid r9, X.C53302fU r10) {
        /*
            r7 = this;
            X.0sG r0 = r7.A03
            X.0sH r0 = r0.A0A(r9)
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0065
            X.2fm r6 = r10.A0A
            boolean r0 = r6.A01
            r5 = 3
            r4 = 1
            if (r0 == 0) goto L_0x003d
            if (r8 == 0) goto L_0x003e
            X.2fV r0 = r10.A08
            long r0 = r0.A01
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r2 = r7.A00
            X.1tK r0 = r8.A03
            if (r0 != 0) goto L_0x002b
            X.1tK r0 = new X.1tK
            r0.<init>()
            r8.A03 = r0
        L_0x002b:
            java.util.Map r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r5 = 1
        L_0x003e:
            int r3 = r6.A00
            if (r5 != r4) goto L_0x0064
            if (r3 <= 0) goto L_0x0064
            if (r8 == 0) goto L_0x0064
            X.1m2 r2 = r8.A04
            if (r2 == 0) goto L_0x0064
            X.2fV r0 = r10.A08
            long r0 = r0.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.util.HashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0064
            int r0 = r0.size()
            if (r0 < r3) goto L_0x0063
            r4 = 2
        L_0x0063:
            return r4
        L_0x0064:
            return r5
        L_0x0065:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42711yJ.A07(X.1m3, com.whatsapp.jid.UserJid, X.2fU):int");
    }

    public C005702l A08(Context context) {
        C32241fu r3 = new C32241fu(context);
        r3.A02(R.string.str0b46);
        r3.A01(R.string.str0b45);
        r3.setNegativeButton(R.string.str0e1f, (DialogInterface.OnClickListener) null);
        r3.setPositiveButton(R.string.str18b2, new IDxCListenerShape28S0200000_2_I0(this, 10, context));
        return r3.create();
    }

    public abstract String A09();

    public boolean A0A(C53302fU r8, C53292fT r9) {
        if (r8 == null) {
            return false;
        }
        if (r9 != null && r8.A08.A01 == r9.A03) {
            int A032 = this.A07.A03(C16620tM.A02, 988);
            long abs = Math.abs(this.A05.A00() - r9.A02);
            if (A032 < 1 || abs < TimeUnit.HOURS.toMillis((long) A032)) {
                return false;
            }
        }
        return true;
    }
}
