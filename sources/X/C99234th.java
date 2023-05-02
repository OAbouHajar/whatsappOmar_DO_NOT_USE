package X;

/* renamed from: X.4th  reason: invalid class name and case insensitive filesystem */
public class C99234th implements AnonymousClass5ON {
    public final /* synthetic */ AnonymousClass4ZW A00;
    public final /* synthetic */ C31201dg A01;

    public C99234th(AnonymousClass4ZW r1, C31201dg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean Ahl(C31201dg r7) {
        Object A04;
        Object obj;
        AnonymousClass4ZW r5 = this.A00;
        AnonymousClass4G0 r4 = r5.A00;
        if (!(r4 == null || (obj = r4.A01.get(r7)) == null)) {
            r5.A01.A01.put(r7, obj);
        }
        long j2 = (long) r7.A00;
        if (r4 == null || (A04 = r4.A00.A04(j2, (Object) null)) == null) {
            return false;
        }
        r5.A01.A00.A09(j2, A04);
        return false;
    }
}
