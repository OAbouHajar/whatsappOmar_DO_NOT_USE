package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0WM  reason: invalid class name */
public class AnonymousClass0WM {
    public static final AnonymousClass0WM A02 = new AnonymousClass0WM("COMPOSITION");
    public C13160lZ A00;
    public final List A01;

    public AnonymousClass0WM(AnonymousClass0WM r3) {
        this.A01 = new ArrayList(r3.A01);
        this.A00 = r3.A00;
    }

    public AnonymousClass0WM(String... strArr) {
        this.A01 = Arrays.asList(strArr);
    }

    public int A00(String str, int i2) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (!AnonymousClass000.A0n(list, i2).equals("**")) {
                return 1;
            }
            return (i2 == list.size() - 1 || !AnonymousClass000.A0n(list, i2 + 1).equals(str)) ? 0 : 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r0 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r4 = r7.A01
            int r0 = r4.size()
            r6 = 0
            if (r9 >= r0) goto L_0x004c
            int r0 = r4.size()
            r5 = 1
            int r0 = r0 - r5
            boolean r2 = X.AnonymousClass000.A1R(r9, r0)
            java.lang.String r1 = X.AnonymousClass000.A0n(r4, r9)
            java.lang.String r3 = "**"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x004d
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "*"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            if (r2 != 0) goto L_0x0049
            int r0 = r4.size()
            int r0 = r0 + -2
            if (r9 != r0) goto L_0x004c
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004c
        L_0x0049:
            if (r1 == 0) goto L_0x004c
        L_0x004b:
            r6 = 1
        L_0x004c:
            return r6
        L_0x004d:
            if (r2 != 0) goto L_0x0086
            int r2 = r9 + 1
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r2)
            boolean r1 = r0.equals(r8)
            int r0 = r4.size()
            if (r1 == 0) goto L_0x007a
            int r0 = r0 + -2
            if (r9 == r0) goto L_0x004b
            int r0 = r4.size()
            int r0 = r0 + -3
            if (r9 != r0) goto L_0x004c
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r0)
            boolean r1 = r0.equals(r3)
            goto L_0x0049
        L_0x007a:
            int r0 = r0 - r5
            if (r2 < r0) goto L_0x004c
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r2)
            boolean r0 = r0.equals(r8)
            return r0
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WM.A01(java.lang.String, int):boolean");
    }

    public boolean A02(String str, int i2) {
        if (!"__container".equals(str)) {
            List list = this.A01;
            if (i2 >= list.size() || (!AnonymousClass000.A0n(list, i2).equals(str) && !AnonymousClass000.A0n(list, i2).equals("**") && !AnonymousClass000.A0n(list, i2).equals("*"))) {
                return false;
            }
        }
        return true;
    }

    public boolean A03(String str, int i2) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.A01;
        return i2 < list.size() - 1 || AnonymousClass000.A0n(list, i2).equals("**");
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("KeyPath{keys=");
        A0r.append(this.A01);
        A0r.append(",resolved=");
        A0r.append(AnonymousClass000.A1V(this.A00));
        return AnonymousClass000.A0k(A0r);
    }
}
