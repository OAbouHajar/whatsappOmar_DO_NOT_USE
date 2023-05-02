package X;

import com.facebook.redex.IDxCallableShape149S0100000_2_I1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.concurrent.Callable;

/* renamed from: X.4af  reason: invalid class name and case insensitive filesystem */
public class C88534af {
    public static AnonymousClass4RL A01;
    public final Callable A00 = new IDxCallableShape149S0100000_2_I1(A01, 0);

    static {
        AnonymousClass4RL r2 = new AnonymousClass4RL();
        A01 = r2;
        AnonymousClass4RL A002 = A00(BigInteger.class, new AnonymousClass5H0(), A00(Date.class, new AnonymousClass5H2(), A00(String.class, new AnonymousClass5H7(), A00(BigDecimal.class, new C107245Gz(), A00(Float.TYPE, new AnonymousClass5H4(), A00(Float.class, new AnonymousClass5H4(), A00(Double.TYPE, new AnonymousClass5H3(), A00(Double.class, new AnonymousClass5H3(), A00(Integer.TYPE, new AnonymousClass5H5(), A00(Integer.class, new AnonymousClass5H5(), A00(Long.TYPE, new AnonymousClass5H6(), A00(Long.class, new AnonymousClass5H6(), r2))))))))))));
        A002.A02.put(Boolean.TYPE, new AnonymousClass5H1());
    }

    public static AnonymousClass4RL A00(Object obj, Object obj2, AnonymousClass4RL r3) {
        r3.A02.put(obj, obj2);
        return A01;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|(3:12|13|14)(1:15)|16|17) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:20|(3:22|23|24)(1:25)|26|27) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0058=Splitter:B:26:0x0058, B:16:0x003a=Splitter:B:16:0x003a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.Class r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Class r2 = r6.getClass()
            boolean r0 = r5.isAssignableFrom(r2)
            if (r0 != 0) goto L_0x008a
            boolean r1 = r6 instanceof java.util.Map     // Catch:{ Exception -> 0x0083 }
            if (r1 != 0) goto L_0x0023
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0083 }
            if (r0 != 0) goto L_0x0023
            java.util.concurrent.Callable r0 = r4.A00     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0083 }
            X.4RL r0 = (X.AnonymousClass4RL) r0     // Catch:{ Exception -> 0x0083 }
            X.4XH r0 = r0.A00(r5)     // Catch:{ Exception -> 0x0083 }
            java.lang.Object r6 = r0.A03(r6)     // Catch:{ Exception -> 0x0083 }
            return r6
        L_0x0023:
            if (r1 == 0) goto L_0x003f
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Exception -> 0x0083 }
            X.4dJ r2 = X.C89984dJ.A04     // Catch:{ Exception -> 0x0083 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0083 }
            if (r6 != 0) goto L_0x0035
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0035:
            X.5R0 r0 = X.C90044dP.A06     // Catch:{ IOException -> 0x003a }
            r0.AiI(r1, r6, r2)     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0083 }
            goto L_0x005c
        L_0x003f:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ Exception -> 0x0083 }
            if (r0 == 0) goto L_0x0070
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x0083 }
            X.4dJ r2 = X.C89984dJ.A04     // Catch:{ Exception -> 0x0083 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0083 }
            if (r6 != 0) goto L_0x0053
            java.lang.String r0 = "null"
            r1.append(r0)     // Catch:{ IOException -> 0x0058 }
            goto L_0x0058
        L_0x0053:
            X.5R0 r0 = X.C90044dP.A03     // Catch:{ IOException -> 0x0058 }
            r0.AiI(r1, r6, r2)     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            java.lang.String r3 = r1.toString()     // Catch:{ Exception -> 0x0083 }
        L_0x005c:
            int r2 = X.AnonymousClass4AF.A00     // Catch:{ Exception -> 0x006e }
            X.4RL r0 = X.C89774ct.A02     // Catch:{ Exception -> 0x006e }
            X.4XH r1 = r0.A00(r5)     // Catch:{ Exception -> 0x006e }
            X.5Gw r0 = new X.5Gw     // Catch:{ Exception -> 0x006e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r6 = r0.A0A(r3, r1)     // Catch:{ Exception -> 0x006e }
            return r6
        L_0x006e:
            r6 = 0
            return r6
        L_0x0070:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0083 }
            X.AnonymousClass3K4.A0v(r2, r1)     // Catch:{ Exception -> 0x0083 }
            java.lang.String r0 = " can not be converted to JSON"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ Exception -> 0x0083 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x0083 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0083 }
            throw r0     // Catch:{ Exception -> 0x0083 }
        L_0x0083:
            r1 = move-exception
            X.3fv r0 = new X.3fv
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x008a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88534af.A01(java.lang.Class, java.lang.Object):java.lang.Object");
    }
}
