package X;

import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.1is  reason: invalid class name and case insensitive filesystem */
public class C33621is extends C20380zx {
    public final AnonymousClass19D A00;
    public final AnonymousClass19E A01;
    public final AnonymousClass17Z A02;
    public final C15800rs A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C16920ts A06;
    public final C15810rt A07;
    public final C16220sf A08;

    public C33621is(AnonymousClass19D r1, AnonymousClass19E r2, AnonymousClass17Z r3, C15800rs r4, C16440t3 r5, C15860rz r6, C16920ts r7, C15810rt r8, C20360zv r9, C16220sf r10) {
        super(r9);
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r10;
        this.A05 = r6;
        this.A03 = r4;
    }

    public final void A0A(C15840rx r7, C37191ol r8) {
        boolean z2 = r7.A0e;
        boolean z3 = r8.A02;
        if (z2 != z3) {
            StringBuilder sb = new StringBuilder("ArchiveChatHandler/setArchive - ");
            sb.append(z3);
            Log.i(sb.toString());
            r7.A0e = z3;
            this.A06.A0A(r7);
            this.A02.A00();
            if (z3) {
                C16220sf r2 = this.A08;
                C15830rv r5 = r8.A01;
                if (r2.A07(r5.getRawString()).A0G) {
                    r2.A08(r5, 0, false);
                    this.A01.A06(1);
                    this.A00.A0F(Collections.singleton(new C37211on(r5, r8.A04, false)));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r1.A04 >= r10.A04) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r1.A04 >= r10.A04) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.C37191ol r10) {
        /*
            r9 = this;
            boolean r3 = r10.A02
            r6 = 0
            if (r3 == 0) goto L_0x005e
            X.0rv r1 = r10.A01
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "pin_v1"
            r2[r6] = r0
            java.lang.String r1 = r1.getRawString()
            r0 = 1
            r2[r0] = r1
            java.lang.String r8 = X.AnonymousClass1WJ.A00(r2)
            X.0zv r7 = r9.A00
            X.1WJ r1 = r7.A06(r8)
            if (r1 == 0) goto L_0x003e
            X.1Wl r0 = r1.A02()
            X.AnonymousClass00B.A06(r0)
            X.1om r0 = r0.A0I
            if (r0 != 0) goto L_0x002e
            X.1om r0 = X.C37201om.A02
        L_0x002e:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x003e
            long r4 = r1.A04
            long r0 = r10.A04
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x003e
        L_0x003a:
            r9.A06(r10)
            return
        L_0x003e:
            X.1WJ r1 = r7.A05(r8)
            if (r1 == 0) goto L_0x005e
            X.1Wl r0 = r1.A02()
            X.AnonymousClass00B.A06(r0)
            X.1om r0 = r0.A0I
            if (r0 != 0) goto L_0x0051
            X.1om r0 = X.C37201om.A02
        L_0x0051:
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x005e
            long r4 = r1.A04
            long r1 = r10.A04
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005e
            goto L_0x003a
        L_0x005e:
            X.0rv r1 = r10.A01
            X.0rt r0 = r9.A07
            X.0rx r2 = r0.A06(r1)
            if (r2 == 0) goto L_0x00c0
            if (r3 != 0) goto L_0x0082
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/setArchivedState - "
        L_0x0071:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0A(r2, r10)
            goto L_0x003a
        L_0x0082:
            X.19D r0 = r9.A00
            X.1o8 r1 = r0.A04(r1, r6)
            X.1o8 r0 = r10.A00
            int r1 = X.C36801o8.A00(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0096
            if (r1 == r0) goto L_0x00ac
            r0 = 2
            if (r1 == r0) goto L_0x00ac
        L_0x0096:
            X.0rz r1 = r9.A05
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1.A1c()
            if (r0 != 0) goto L_0x003a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ArchiveChatHandler/applyMutation/A_ENCLOSES_B/setArchivedState - "
            goto L_0x0071
        L_0x00ac:
            java.lang.String r1 = "ArchiveChatHandler/applyMutation/B_ENCLOSES_A/setArchivedState - "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0A(r2, r10)
        L_0x00c0:
            r9.A07(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33621is.A0B(X.1ol):void");
    }
}
