package X;

import java.util.Locale;

/* renamed from: X.0eN  reason: invalid class name and case insensitive filesystem */
public final class C08810eN implements C12870l6 {
    public void AcC(C06180Up r7, Throwable th) {
        Class<C09110ev> cls = C09110ev.class;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, System.identityHashCode(this));
        AnonymousClass000.A1L(objArr, System.identityHashCode(r7));
        objArr[2] = AnonymousClass000.A0d(r7.A00());
        C13370lv r2 = AnonymousClass0X1.A00;
        if (r2.AJ7(5)) {
            r2.Ai1(cls.getSimpleName(), String.format((Locale) null, "Finalized without closing: %x %x (type = %s)", objArr));
        }
    }
}
