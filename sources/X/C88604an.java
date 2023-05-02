package X;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4an  reason: invalid class name and case insensitive filesystem */
public class C88604an {
    public final AnonymousClass4RV A00;
    public final Object A01;

    public C88604an(AnonymousClass4RV r2, Object obj) {
        C90264dr.A03(obj, "json can not be null");
        C90264dr.A03(r2, "configuration can not be null");
        this.A00 = r2;
        this.A01 = obj;
    }

    public static final C89844d1 A00(String str, AnonymousClass5OQ[] r7) {
        String A02;
        ReentrantLock reentrantLock;
        AnonymousClass5MO r3 = AnonymousClass49F.A00;
        if (r7.length == 0) {
            A02 = str;
        } else {
            A02 = C90264dr.A02(str, Arrays.toString(r7));
        }
        C99714uT r32 = (C99714uT) r3;
        Map map = r32.A01;
        C89844d1 r2 = (C89844d1) map.get(A02);
        if (r2 != null) {
            r32.A00(A02);
        } else if (str.length() != 0) {
            r2 = new C89844d1(str, r7);
            if (map.put(A02, r2) != null) {
                r32.A00(A02);
            } else {
                reentrantLock = r32.A02;
                reentrantLock.lock();
                try {
                    r32.A00.addFirst(A02);
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (map.size() > 400) {
                reentrantLock = r32.A02;
                reentrantLock.lock();
                String str2 = (String) r32.A00.removeLast();
                reentrantLock.unlock();
                map.remove(str2);
                return r2;
            }
        } else {
            throw AnonymousClass000.A0T("json can not be null or empty");
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        if (r7 != false) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.String r12, X.AnonymousClass5OQ... r13) {
        /*
            r11 = this;
            java.lang.String r1 = "path can not be null or empty"
            if (r12 == 0) goto L_0x00ea
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00ea
            X.4d1 r4 = A00(r12, r13)
            java.lang.String r0 = "path can not be null"
            X.C90264dr.A03(r4, r0)
            java.lang.Object r10 = r11.A01
            X.4RV r5 = r11.A00
            X.420 r9 = X.AnonymousClass420.AS_PATH_LIST
            java.util.Set r1 = r5.A03
            boolean r8 = r1.contains(r9)
            X.420 r3 = X.AnonymousClass420.ALWAYS_RETURN_LIST
            boolean r7 = r1.contains(r3)
            X.420 r0 = X.AnonymousClass420.SUPPRESS_EXCEPTIONS
            boolean r2 = r1.contains(r0)
            X.4TN r1 = r4.A00
            X.3gR r6 = r1.A00
            X.4XQ r0 = r6.A01
            boolean r0 = r0 instanceof X.C70293gQ
            r4 = 0
            if (r0 == 0) goto L_0x007a
            if (r8 != 0) goto L_0x005b
            if (r7 != 0) goto L_0x005b
            X.4bx r1 = r1.A00(r5, r10, r10)
            if (r2 == 0) goto L_0x00c2
            java.util.List r0 = r1.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c2
        L_0x004a:
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x005a
            X.5Tl r0 = r5.A00
            X.4uU r0 = (X.C99724uU) r0
            X.4XH r0 = r0.A00
            java.lang.Object r4 = r0.A01()
        L_0x005a:
            return r4
        L_0x005b:
            if (r2 != 0) goto L_0x004a
            java.lang.String r0 = "Options "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r9)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " are not allowed when using path functions!"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.5Ar r1 = new X.5Ar
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x007a:
            X.4bx r3 = r1.A00(r5, r10, r10)
            if (r8 == 0) goto L_0x0097
            if (r2 == 0) goto L_0x00c7
            java.util.List r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00c7
        L_0x008c:
            X.5Tl r0 = r5.A00
            X.4uU r0 = (X.C99724uU) r0
            X.4XH r0 = r0.A00
            java.lang.Object r3 = r0.A01()
        L_0x0096:
            return r3
        L_0x0097:
            if (r2 == 0) goto L_0x00a6
            java.util.List r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a6
            if (r7 == 0) goto L_0x004a
            goto L_0x008c
        L_0x00a6:
            r2 = 0
            java.lang.Object r3 = r3.A00()
            if (r7 == 0) goto L_0x0096
            boolean r0 = r6.A05()
            if (r0 == 0) goto L_0x0096
            X.5Tl r1 = r5.A00
            r0 = r1
            X.4uU r0 = (X.C99724uU) r0
            X.4XH r0 = r0.A00
            java.lang.Object r4 = r0.A01()
            r1.AdY(r4, r2, r3)
            return r4
        L_0x00c2:
            java.lang.Object r3 = r1.A00()
            return r3
        L_0x00c7:
            int r0 = r3.A00
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00d1
            r3 = 0
            return r3
        L_0x00d1:
            java.lang.String r0 = "No results for path: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.4TN r0 = r3.A02
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.3ft r1 = new X.3ft
            r1.<init>(r0)
            throw r1
        L_0x00e7:
            java.lang.Object r3 = r3.A03
            return r3
        L_0x00ea:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88604an.A01(java.lang.String, X.5OQ[]):java.lang.Object");
    }
}
