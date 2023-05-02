package X;

import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.1cm  reason: invalid class name and case insensitive filesystem */
public class C30681cm {
    public static final C30681cm A0D;
    public static final C30681cm A0E;
    public static final C30681cm A0F;
    public static final C30681cm[] A0G;
    public final int A00;
    public final int A01;
    public final C28411Vz A02;
    public final String A03;
    public final String A04;
    public final LinkedHashSet A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final int[] A09;
    public final int[] A0A;
    public final C40031tS[] A0B;
    public final C40031tS[] A0C;

    static {
        C28411Vz r15 = C35481m0.A06;
        C30681cm r14 = new C30681cm(r15, "UNSET", "UNSET", new LinkedHashSet(Collections.singletonList(r15)), (int[]) null, (int[]) null, (C40031tS[]) null, (C40031tS[]) null, 0, 0, false, false, false);
        A0F = r14;
        C28411Vz r16 = C35481m0.A05;
        LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singletonList(r16));
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        int[] iArr = {2};
        C30681cm r152 = new C30681cm(r16, "IN", "91", linkedHashSet2, iArr, new int[]{2}, new C40031tS[]{new C40031tS("tos_no_wallet", "1", false), new C40031tS("add_bank", "1", false), new C40031tS("2fa", "1", false)}, new C40031tS[]{new C40031tS("add_payment_service", "1", false)}, 3, 3, true, true, true);
        A0E = r152;
        C28411Vz r17 = C35481m0.A04;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet(Collections.singletonList(r17));
        LinkedHashSet linkedHashSet4 = linkedHashSet3;
        C30681cm r162 = new C30681cm(r17, "BR", "55", linkedHashSet4, new int[]{1, 4, 6}, new int[]{1, 4, 6}, new C40031tS[]{new C40031tS("tos_no_wallet", "1", false), new C40031tS("add_card", "1", false)}, new C40031tS[]{new C40031tS("add_business", "1", false)}, 1, 1, true, true, false);
        A0D = r162;
        A0G = new C30681cm[]{r14, r152, r162};
    }

    public C30681cm(C28411Vz r1, String str, String str2, LinkedHashSet linkedHashSet, int[] iArr, int[] iArr2, C40031tS[] r7, C40031tS[] r8, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        AnonymousClass00B.A05(str);
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = r1;
        this.A05 = linkedHashSet;
        this.A08 = z3;
        this.A09 = iArr;
        this.A0A = iArr2;
        this.A0C = r7;
        this.A0B = r8;
        this.A07 = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C30681cm A00(java.lang.String r6) {
        /*
            if (r6 == 0) goto L_0x0029
            X.1cm[] r5 = A0G
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x0007:
            if (r1 >= r2) goto L_0x0016
            r3 = r5[r1]
            java.lang.String r0 = r3.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0028
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0016:
            X.1cm[] r2 = X.AnonymousClass2NQ.A00
            int r1 = r2.length
        L_0x0019:
            if (r4 >= r1) goto L_0x0029
            r3 = r2[r4]
            java.lang.String r0 = r3.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x0028
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0028:
            return r3
        L_0x0029:
            X.1cm r0 = A0F
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30681cm.A00(java.lang.String):X.1cm");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C30681cm A01(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002d
            X.1cm[] r5 = A0G
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x000b:
            if (r1 >= r2) goto L_0x001a
            r3 = r5[r1]
            java.lang.String r0 = r3.A04
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x002c
            int r1 = r1 + 1
            goto L_0x000b
        L_0x001a:
            X.1cm[] r2 = X.AnonymousClass2NQ.A00
            int r1 = r2.length
        L_0x001d:
            if (r4 >= r1) goto L_0x002d
            r3 = r2[r4]
            java.lang.String r0 = r3.A04
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x002c
            int r4 = r4 + 1
            goto L_0x001d
        L_0x002c:
            return r3
        L_0x002d:
            X.1cm r0 = A0F
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30681cm.A01(java.lang.String):X.1cm");
    }
}
