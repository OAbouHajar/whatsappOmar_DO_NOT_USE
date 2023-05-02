package X;

import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.39v  reason: invalid class name and case insensitive filesystem */
public class C616739v {
    public final C16000sG A00;
    public final C16080sP A01;
    public final C16440t3 A02;
    public final C14710pd A03;
    public final ArrayList A04 = AnonymousClass000.A0u();

    public C616739v(C16000sG r2, C16080sP r3, C16440t3 r4, C14710pd r5) {
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public int A00() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return 3;
        }
        C37831po r1 = (C37831po) arrayList.get(0);
        if (r1.A0G != null) {
            return r1.A00 == 5 ? 4 : 5;
        }
        if (r1.A0C.A03) {
            return 0;
        }
        int i2 = r1.A00;
        return (i2 == 5 || i2 == 6) ? 1 : 2;
    }

    public int A01() {
        int A002 = A00();
        if (A002 == 0) {
            return A08() ? R.string.str0ee3 : R.string.str0ee4;
        }
        if (A002 == 1) {
            return A08() ? R.string.str0b66 : R.string.str0b68;
        }
        if (A002 == 2) {
            return A08() ? R.string.str0d78 : R.string.str0d79;
        }
        if (A002 == 4) {
            return A08() ? R.string.str034f : R.string.str0351;
        }
        if (A002 != 5) {
            return 0;
        }
        return A08() ? R.string.str0350 : R.string.str0352;
    }

    public long A02() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return this.A02.A02(((C37831po) arrayList.get(0)).A0A);
    }

    public C16010sH A03() {
        ArrayList arrayList = this.A04;
        if (!arrayList.isEmpty()) {
            return this.A00.A0A(((C37831po) arrayList.get(0)).A0C.A01);
        }
        return null;
    }

    public C16010sH A04(C16000sG r6, C17240ul r7, C216014s r8, ArrayList arrayList) {
        if (A06()) {
            ArrayList arrayList2 = this.A04;
            C16010sH A022 = C30341cC.A02(r6, r7, ((C37831po) arrayList2.get(0)).A04, r8);
            if (A022 != null && C16080sP.A01(this.A01, A022, arrayList)) {
                return A022;
            }
            ArrayList A0u = AnonymousClass000.A0u();
            if (!arrayList2.isEmpty()) {
                for (C38581r1 r0 : ((C37831po) arrayList2.get(0)).A04()) {
                    A0u.add(this.A00.A0A(r0.A02));
                }
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                C16010sH A0U = C13680ns.A0U(it);
                if (C16080sP.A01(this.A01, A0U, arrayList)) {
                    return A0U;
                }
            }
            return null;
        }
        C16010sH A032 = A03();
        if (C16080sP.A01(this.A01, A032, arrayList)) {
            return A032;
        }
        return null;
    }

    public String A05() {
        StringBuilder A0r;
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return null;
        }
        C37831po r1 = (C37831po) arrayList.get(0);
        if (r1.A0A()) {
            A0r = AnonymousClass000.A0r("G:");
            C35011lE r12 = r1.A0C;
            A0r.append(C16030sJ.A03(r12.A01));
            A0r.append(r12.A03);
            A0r.append(r12.A02);
            A0r.append(r12.A00);
        } else {
            A0r = AnonymousClass000.A0r("O:");
            A0r.append(C16030sJ.A03(r1.A0C.A01));
            A0r.append(r1.A0A);
        }
        return A0r.toString();
    }

    public boolean A06() {
        ArrayList arrayList = this.A04;
        return !arrayList.isEmpty() && ((C37831po) arrayList.get(0)).A0A();
    }

    public boolean A07() {
        ArrayList arrayList = this.A04;
        return !arrayList.isEmpty() && ((C37831po) arrayList.get(0)).A06 != null;
    }

    public boolean A08() {
        ArrayList arrayList = this.A04;
        return !arrayList.isEmpty() && ((C37831po) arrayList.get(0)).A0I;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r1 == 6) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r2 == 6) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(X.C37831po r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r1 = r6.A04
            boolean r0 = r1.isEmpty()
            r5 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r1.size()
            int r0 = r0 - r5
            java.lang.Object r4 = r1.get(r0)
            X.1po r4 = (X.C37831po) r4
            if (r8 != 0) goto L_0x0024
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0022
            boolean r0 = r4.A0A()
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r5 = 0
        L_0x0023:
            return r5
        L_0x0024:
            long r2 = r7.A0A
            long r0 = r4.A0A
            boolean r0 = X.C42681yF.A0A(r2, r0)
            if (r0 == 0) goto L_0x0022
            if (r8 == 0) goto L_0x0083
            com.whatsapp.jid.GroupJid r1 = r7.A04
            com.whatsapp.jid.GroupJid r0 = r4.A04
            boolean r0 = X.C34901l3.A00(r1, r0)
        L_0x0038:
            if (r0 == 0) goto L_0x0022
            X.1r0 r1 = r7.A06
            X.1r0 r0 = r4.A06
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x0022
            X.1lE r0 = r7.A0C
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0053
            int r1 = r7.A00
            r0 = 5
            if (r1 == r0) goto L_0x0053
            r0 = 6
            r3 = 1
            if (r1 != r0) goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            X.1lE r0 = r4.A0C
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0063
            int r2 = r4.A00
            r0 = 5
            if (r2 == r0) goto L_0x0063
            r1 = 6
            r0 = 1
            if (r2 != r1) goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r3 != r0) goto L_0x0022
            boolean r1 = r7.A0I
            boolean r0 = r4.A0I
            if (r1 != r0) goto L_0x0022
            X.0pd r2 = r6.A03
            r1 = 2536(0x9e8, float:3.554E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0023
            boolean r1 = r7.A0C()
            boolean r0 = r4.A0C()
            if (r1 != r0) goto L_0x0022
            return r5
        L_0x0083:
            X.1lE r0 = r7.A0C
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.1lE r0 = r4.A0C
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = X.C34901l3.A00(r1, r0)
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616739v.A09(X.1po, boolean):boolean");
    }

    public String toString() {
        if (this.A04.isEmpty()) {
            return null;
        }
        return this.A01.A08(A03());
    }
}
