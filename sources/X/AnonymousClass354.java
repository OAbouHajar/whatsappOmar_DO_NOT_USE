package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.354  reason: invalid class name */
public class AnonymousClass354 extends C38401qj implements C109565Sq {
    public final C15860rz A00;
    public final C41791wf A01;
    public final boolean A02;
    public volatile int A03;
    public volatile int A04;
    public volatile List A05 = C13690nt.A0i(0);
    public volatile List A06 = C13690nt.A0i(0);

    public AnonymousClass354(C15860rz r3, AnonymousClass1CX r4, C41791wf r5, boolean z2) {
        super(r4);
        this.A01 = r5;
        this.A00 = r3;
        this.A00 = this;
        this.A02 = z2;
    }

    public Void A0B(Void... voidArr) {
        C41791wf r3 = this.A01;
        List A09 = r3.A0B.A09(0);
        this.A04 = A09.size();
        C212613k r1 = r3.A08;
        this.A03 = r1.A02().size();
        if (this.A02) {
            this.A05 = r1.A0C();
            this.A06 = A09;
        }
        return super.A08(voidArr);
    }

    public void AUI(C37771pi r5) {
        C41791wf r3 = this.A01;
        HashSet hashSet = r3.A0F;
        String str = r5.A0F;
        hashSet.remove(str);
        if (r3.A04 != null) {
            for (int i2 = 0; i2 < r3.A04.size(); i2++) {
                if (C37771pi.A00(str, r3.A04, i2)) {
                    r3.A04.set(i2, r5);
                    r3.A04(r3.A04);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r1 >= 3) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUJ(java.util.List r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            r7 = 1
            r6 = 0
            boolean r5 = X.AnonymousClass000.A1Q(r0)
            int r0 = r10.A04
            if (r0 > 0) goto L_0x000d
            r7 = 0
        L_0x000d:
            X.1wf r3 = r10.A01
            r3.A05 = r5
            r3.A06 = r7
            X.0rz r4 = r10.A00
            int r2 = r10.A04
            r9 = r11
            int r1 = r11.size()
            X.C18450wi.A0H(r4, r6)
            r0 = 50
            if (r2 >= r0) goto L_0x0027
            r0 = 3
            r2 = 0
            if (r1 < r0) goto L_0x0028
        L_0x0027:
            r2 = 1
        L_0x0028:
            android.content.SharedPreferences$Editor r1 = r4.A0K()
            java.lang.String r0 = "sticker_contextual_suggestion_eligibility"
            X.C13680ns.A0z(r1, r0, r2)
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = "recents"
        L_0x0036:
            java.util.HashSet r8 = r3.A0F
            r8.clear()
            java.util.Iterator r2 = r11.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r1 = r2.next()
            X.1pi r1 = (X.C37771pi) r1
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r1.A0F
            r8.add(r0)
            goto L_0x003f
        L_0x0055:
            if (r7 == 0) goto L_0x005b
            java.lang.String r5 = "starred"
            goto L_0x0036
        L_0x005b:
            int r0 = r11.size()
            if (r0 <= 0) goto L_0x006a
            java.lang.Object r0 = r11.get(r6)
            X.1pi r0 = (X.C37771pi) r0
            java.lang.String r5 = r0.A0F
            goto L_0x0036
        L_0x006a:
            r5 = 0
            goto L_0x0036
        L_0x006c:
            if (r5 != 0) goto L_0x0085
            r3.A04(r11)
        L_0x0071:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0084
            java.util.List r2 = r10.A05
            java.util.List r0 = r10.A06
            X.3H7 r1 = r3.A00
            if (r1 == 0) goto L_0x0084
            java.util.List r0 = r3.A00(r2, r0)
            r1.A03(r0)
        L_0x0084:
            return
        L_0x0085:
            r3.A04 = r11
            X.1wg r4 = r3.A03
            if (r4 == 0) goto L_0x0071
            java.util.HashMap r6 = r3.A0E
            java.util.HashMap r7 = r3.A0D
            r4.Aei(r5, r6, r7, r8, r9)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass354.AUJ(java.util.List):void");
    }

    public void AUK() {
        this.A01.A02 = null;
    }

    public void AUL(String str) {
        C41791wf r2 = this.A01;
        r2.A0F.remove(str);
        if (r2.A04 != null) {
            for (int i2 = 0; i2 < r2.A04.size(); i2++) {
                if (C37771pi.A00(str, r2.A04, i2)) {
                    r2.A04.remove(i2);
                    r2.A04(r2.A04);
                    return;
                }
            }
        }
    }
}
