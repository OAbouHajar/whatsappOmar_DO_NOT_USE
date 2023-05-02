package X;

import android.widget.ImageView;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Yq  reason: invalid class name and case insensitive filesystem */
public class C50262Yq {
    public boolean A00 = false;
    public final C23081Ak A01;
    public final C23091Al A02;
    public final Set A03;

    public C50262Yq(C23081Ak r12, C23091Al r13) {
        this.A01 = r12;
        this.A02 = r13;
        this.A03 = new HashSet();
        if (r12.A00 == 0) {
            File file = new File(r12.A05.A00.getCacheDir(), "product_catalog_images");
            C62703Ep r3 = new C62703Ep(r12.A01);
            C59472yL r0 = new C59472yL(r12.A03, r12.A04, r3, r12.A06, r12.A07, r12.A08, r12.A09, file, "catalog-imager", 4);
            r12.A02 = r0;
            r3.A00 = r0;
        }
        r12.A00++;
    }

    public void A00() {
        C59472yL r1;
        if (!this.A00) {
            Set<C62723Er> set = this.A03;
            for (C62723Er A002 : set) {
                this.A01.A00(A002);
            }
            set.clear();
            C23081Ak r2 = this.A01;
            int i2 = r2.A00 - 1;
            r2.A00 = i2;
            if (i2 == 0 && (r1 = r2.A02) != null) {
                r1.A02(false);
                r2.A02 = null;
            }
            this.A00 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        if (r22 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.widget.ImageView r19, X.C35691mL r20, X.C108515Oh r21, X.AnonymousClass4H5 r22, X.C108525Oi r23, X.C108535Oj r24, int r25) {
        /*
            r18 = this;
            r3 = 0
            r4 = r18
            r5 = r22
            if (r22 == 0) goto L_0x00ae
            X.4D4 r0 = r5.A00
            if (r0 == 0) goto L_0x00ae
            X.1Al r1 = r4.A02
            int r3 = r0.A00
            X.0xA r0 = r1.A00
            int r0 = r0.A00(r3)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r0)
        L_0x0022:
            com.whatsapp.jid.UserJid r3 = r5.A01
        L_0x0024:
            X.4vj r11 = new X.4vj
            r0 = r24
            r11.<init>(r0, r4, r3, r2)
            r0 = 0
            com.facebook.redex.IDxBListenerShape101S0200000_2_I0 r9 = new com.facebook.redex.IDxBListenerShape101S0200000_2_I0
            r1 = r21
            r9.<init>(r1, r0, r4)
            X.4vh r10 = new X.4vh
            r8 = r20
            r5 = r23
            r12 = r10
            r13 = r8
            r14 = r5
            r15 = r4
            r16 = r3
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r14 = 2147483647(0x7fffffff, float:NaN)
            X.3Er r6 = new X.3Er
            r7 = r19
            r12 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r6.AGp()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0070
            if (r23 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            X.1Al r1 = r4.A02
            int r0 = r2.intValue()
            r1.A00(r3, r0)
        L_0x006c:
            r5.ASp(r6)
        L_0x006f:
            return
        L_0x0070:
            X.1Ak r4 = r4.A01
            X.2yL r0 = r4.A02
            if (r0 == 0) goto L_0x006f
            android.widget.ImageView r3 = r6.ACj()
            if (r3 == 0) goto L_0x00a7
            r1 = 2131364088(0x7f0a08f8, float:1.8348003E38)
            X.1mL r0 = r6.A05
            java.lang.String r0 = r0.A04
            r3.setTag(r1, r0)
            r1 = 2131364092(0x7f0a08fc, float:1.8348011E38)
            int r0 = r6.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setTag(r1, r0)
            java.lang.String r2 = r6.AGp()
            r1 = 2131364379(0x7f0a0a1b, float:1.8348593E38)
            java.lang.Object r0 = r3.getTag(r1)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a7
            r0 = 0
            r3.setTag(r1, r0)
        L_0x00a7:
            X.2yL r1 = r4.A02
            r0 = 1
            r1.A01(r6, r0)
            return
        L_0x00ae:
            r2 = r3
            if (r22 == 0) goto L_0x0024
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50262Yq.A01(android.widget.ImageView, X.1mL, X.5Oh, X.4H5, X.5Oi, X.5Oj, int):void");
    }

    public void A02(ImageView imageView, C35691mL r10, C108515Oh r11, C108535Oj r12, int i2) {
        A01(imageView, r10, r11, (AnonymousClass4H5) null, (C108525Oi) null, r12, i2);
    }

    public void finalize() {
        super.finalize();
    }
}
