package X;

import java.util.List;

/* renamed from: X.0QS  reason: invalid class name */
public class AnonymousClass0QS {
    public C03710Jo A00;
    public String A01;
    public List A02 = null;
    public List A03 = null;

    public AnonymousClass0QS(C03710Jo r2, String str) {
        this.A00 = r2 == null ? C03710Jo.DESCENDANT : r2;
        this.A01 = str;
    }

    public void A00(AnonymousClass0K2 r3, String str, String str2) {
        List list = this.A02;
        if (list == null) {
            list = AnonymousClass000.A0u();
            this.A02 = list;
        }
        list.add(new AnonymousClass0OU(r3, str, str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()
            X.0Jo r1 = r4.A00
            X.0Jo r0 = X.C03710Jo.CHILD
            if (r1 != r0) goto L_0x0059
            java.lang.String r0 = "> "
        L_0x000c:
            r3.append(r0)
        L_0x000f:
            java.lang.String r0 = r4.A01
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "*"
        L_0x0015:
            r3.append(r0)
            java.util.List r0 = r4.A02
            if (r0 == 0) goto L_0x0060
            java.util.Iterator r2 = r0.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r2.next()
            X.0OU r1 = (X.AnonymousClass0OU) r1
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = r1.A01
            r3.append(r0)
            X.0K2 r0 = r1.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x004e;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = 93
            r3.append(r0)
            goto L_0x0020
        L_0x0045:
            java.lang.String r0 = "~="
            goto L_0x0050
        L_0x0048:
            r0 = 61
            r3.append(r0)
            goto L_0x0053
        L_0x004e:
            java.lang.String r0 = "|="
        L_0x0050:
            r3.append(r0)
        L_0x0053:
            java.lang.String r0 = r1.A02
            r3.append(r0)
            goto L_0x003f
        L_0x0059:
            X.0Jo r0 = X.C03710Jo.FOLLOWS
            if (r1 != r0) goto L_0x000f
            java.lang.String r0 = "+ "
            goto L_0x000c
        L_0x0060:
            java.util.List r0 = r4.A03
            if (r0 == 0) goto L_0x007b
            java.util.Iterator r2 = r0.iterator()
        L_0x0068:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r1 = r2.next()
            r0 = 58
            r3.append(r0)
            r3.append(r1)
            goto L_0x0068
        L_0x007b:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QS.toString():java.lang.String");
    }
}
