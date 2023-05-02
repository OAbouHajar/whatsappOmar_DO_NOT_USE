package X;

import java.util.HashMap;

/* renamed from: X.02z  reason: invalid class name and case insensitive filesystem */
public class C006602z {
    public final AnonymousClass04o A00;
    public final C010505a A01;
    public final C013806q A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C006602z(X.C001500q r4) {
        /*
            r3 = this;
            r0 = 1
            X.C18450wi.A0H(r4, r0)
            X.05a r2 = r4.AGy()
            X.C18450wi.A0B(r2)
            X.04o r1 = A00(r4)
            X.06s r0 = X.C014006s.A00
            r3.<init>(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006602z.<init>(X.00q):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C006602z(X.AnonymousClass04o r3, X.C001500q r4) {
        /*
            r2 = this;
            r0 = 1
            X.C18450wi.A0H(r4, r0)
            X.05a r1 = r4.AGy()
            X.C18450wi.A0B(r1)
            X.06s r0 = X.C014006s.A00
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006602z.<init>(X.04o, X.00q):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C006602z(AnonymousClass04o r2, C010505a r3) {
        this(r2, r3, C014006s.A00);
        C18450wi.A0H(r3, 1);
    }

    public C006602z(AnonymousClass04o r2, C010505a r3, C013806q r4) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final AnonymousClass04o A00(C001500q r1) {
        if (!(r1 instanceof C001900u)) {
            return C014106t.A00();
        }
        AnonymousClass04o ABj = ((C001900u) r1).ABj();
        C18450wi.A0B(ABj);
        return ABj;
    }

    public C003401n A01(Class cls) {
        C18450wi.A0H(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return A02(cls, sb.toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C003401n A02(Class cls, String str) {
        C003401n r1;
        C010805d r12;
        C18450wi.A0H(str, 0);
        HashMap hashMap = this.A01.A00;
        C003401n r2 = (C003401n) hashMap.get(str);
        if (cls.isInstance(r2)) {
            AnonymousClass04o r13 = this.A00;
            if ((r13 instanceof C010805d) && (r12 = (C010805d) r13) != null) {
                C18450wi.A0B(r2);
                r12.A01(r2);
            } else if (r2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            }
            return r2;
        }
        C014306v r22 = new C014306v(this.A02);
        r22.A00.put(C014206u.A01, str);
        try {
            r1 = this.A00.A73(r22, cls);
        } catch (AbstractMethodError unused) {
            r1 = this.A00.A6s(cls);
        }
        C003401n r0 = (C003401n) hashMap.put(str, r1);
        if (r0 != null) {
            r0.A04();
        }
        return r1;
    }
}
