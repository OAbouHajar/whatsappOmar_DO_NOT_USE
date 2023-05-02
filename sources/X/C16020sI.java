package X;

import com.facebook.redex.IDxProviderShape34S0000000_2_I0;
import java.util.regex.Pattern;

/* renamed from: X.0sI  reason: invalid class name and case insensitive filesystem */
public class C16020sI {
    public static final AnonymousClass01D A03 = new AnonymousClass01T((Object) null, new IDxProviderShape34S0000000_2_I0(1));
    public final C24561Gk A00;
    public final C16070sO A01;
    public final C15890s4 A02;

    public C16020sI(C24561Gk r1, C16070sO r2, C15890s4 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00(C16010sH r3) {
        String A022 = C24561Gk.A02((C15830rv) r3.A08(C15830rv.class));
        if (A022 == null) {
            return false;
        }
        return ((Pattern) A03.get()).matcher(A022).matches();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C15830rv r5) {
        /*
            r4 = this;
            X.0s4 r0 = r4.A02
            X.0s5 r1 = r0.A00
            X.0tC r0 = X.C15910s6.A1z
            int r2 = r1.A02(r0)
            r1 = 20
            r0 = 0
            if (r2 == r1) goto L_0x0010
            r0 = 1
        L_0x0010:
            r3 = 1
            if (r0 == 0) goto L_0x0073
            boolean r0 = X.C16030sJ.A0L(r5)
            if (r0 == 0) goto L_0x005c
            X.0sL r1 = X.C16050sL.A03(r5)
            X.AnonymousClass00B.A06(r1)
            X.0sO r0 = r4.A01
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r1)
            java.util.Map r0 = r0.A04
            java.util.Set r0 = r0.keySet()
            X.0uz r0 = X.C17380uz.copyOf((java.util.Collection) r0)
            X.1Ub r2 = r0.iterator()
        L_0x0036:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r2.next()
            X.0rv r0 = (X.C15830rv) r0
            java.lang.String r1 = X.C24561Gk.A02(r0)
            if (r1 == 0) goto L_0x005a
            X.01D r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0036
        L_0x005a:
            r0 = 0
            return r0
        L_0x005c:
            java.lang.String r1 = X.C24561Gk.A02(r5)
            if (r1 == 0) goto L_0x005a
            X.01D r0 = A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
        L_0x0073:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16020sI.A01(X.0rv):boolean");
    }
}
