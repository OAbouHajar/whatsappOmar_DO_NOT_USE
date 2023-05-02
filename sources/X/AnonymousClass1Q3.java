package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1Q3  reason: invalid class name */
public class AnonymousClass1Q3 {
    public final C16300so A00;
    public final C16040sK A01;
    public final C15810rt A02;
    public final C16460t6 A03;
    public final C216314v A04;
    public final C16900tq A05;
    public final C222817i A06;
    public final AnonymousClass1Q2 A07;
    public final C26971Py A08;
    public final AnonymousClass1H2 A09;
    public final JniBridge A0A;
    public final Object A0B = new Object();

    public AnonymousClass1Q3(C16300so r2, C16040sK r3, C15810rt r4, C16460t6 r5, C216314v r6, C16900tq r7, C222817i r8, AnonymousClass1Q2 r9, C26971Py r10, AnonymousClass1H2 r11, JniBridge jniBridge) {
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A0A = jniBridge;
        this.A03 = r5;
        this.A06 = r8;
        this.A08 = r10;
        this.A05 = r7;
        this.A09 = r11;
        this.A07 = r9;
    }

    public static void A00(C39171s2 r9, C39181s3 r10) {
        ArrayList arrayList;
        List<C39631sn> list = r9.A05;
        List list2 = r10.A05;
        if (list2.size() == 0) {
            arrayList = new ArrayList();
        } else {
            HashSet hashSet = new HashSet();
            for (C39631sn r5 : list) {
                if (list2.contains(Long.valueOf(r5.A01)) && r5.A01 != -1) {
                    hashSet.add(r5.A02);
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        r10.A01 = arrayList;
        r10.A04 = r9.A1F;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 149 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r2 = r1.A0C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r2 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r2.equals(r11.A0C()) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1.A00 != r11.A00) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        r4.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        if (r11.A11.A02 != false) goto L_0x0053;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C39171s2 r10, X.C39181s3 r11, X.C39181s3 r12) {
        /*
            r9 = this;
            java.util.List r1 = r10.A04
            X.0tq r0 = r9.A05
            X.0tf r8 = r0.A02()
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x0035
            r1 = 2
            int r0 = r10.A07     // Catch:{ all -> 0x0098 }
            r0 = r0 & 2
            if (r0 == r1) goto L_0x0070
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            r0.add(r12)     // Catch:{ all -> 0x0098 }
            r10.A12(r0)     // Catch:{ all -> 0x0098 }
            int r0 = r10.A07     // Catch:{ all -> 0x0098 }
            r1 = r1 | r0
            r10.A07 = r1     // Catch:{ all -> 0x0098 }
            X.0t6 r1 = r9.A03     // Catch:{ all -> 0x0098 }
            r1.A0Z(r10)     // Catch:{ all -> 0x0098 }
            X.17i r0 = r9.A06     // Catch:{ all -> 0x0098 }
            r0.A03(r10)     // Catch:{ all -> 0x0098 }
            X.17H r0 = r1.A0n     // Catch:{ all -> 0x0098 }
            r0.A02(r10)     // Catch:{ all -> 0x0098 }
            goto L_0x0070
        L_0x0035:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0098 }
            r5.<init>(r1)     // Catch:{ all -> 0x0098 }
            if (r11 == 0) goto L_0x005e
            goto L_0x0074
        L_0x003d:
            X.1Vw r0 = r11.A11     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0078
            com.whatsapp.jid.UserJid r2 = r1.A0C()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0078
            com.whatsapp.jid.UserJid r0 = r11.A0C()     // Catch:{ all -> 0x0098 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0078
        L_0x0053:
            long r2 = r1.A00     // Catch:{ all -> 0x0098 }
            long r0 = r11.A00     // Catch:{ all -> 0x0098 }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0078
            r4.remove()     // Catch:{ all -> 0x0098 }
        L_0x005e:
            r5.add(r12)     // Catch:{ all -> 0x0098 }
            r10.A12(r5)     // Catch:{ all -> 0x0098 }
            X.17i r0 = r9.A06     // Catch:{ all -> 0x0098 }
            r0.A03(r10)     // Catch:{ all -> 0x0098 }
            X.0t6 r0 = r9.A03     // Catch:{ all -> 0x0098 }
            X.17H r0 = r0.A0n     // Catch:{ all -> 0x0098 }
            r0.A02(r10)     // Catch:{ all -> 0x0098 }
        L_0x0070:
            r7.A00()     // Catch:{ all -> 0x0098 }
            goto L_0x0091
        L_0x0074:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0078:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0098 }
            X.1qx r1 = (X.C38541qx) r1     // Catch:{ all -> 0x0098 }
            X.1Vw r0 = r1.A11     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x003d
            X.1Vw r0 = r11.A11     // Catch:{ all -> 0x0098 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0053
            goto L_0x0078
        L_0x0091:
            r7.close()     // Catch:{ all -> 0x009d }
            r8.close()
            return
        L_0x0098:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x009c }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Q3.A01(X.1s2, X.1s3, X.1s3):void");
    }
}
