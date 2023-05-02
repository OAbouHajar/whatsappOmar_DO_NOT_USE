package X;

/* renamed from: X.1t3  reason: invalid class name and case insensitive filesystem */
public class C39781t3 {
    public final AnonymousClass4MC A00;
    public final AnonymousClass4MC A01;
    public final boolean A02;

    public C39781t3(String str, boolean z2) {
        this.A02 = z2;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            AnonymousClass4MC r0 = new AnonymousClass4MC(str, z2);
            this.A00 = r0;
            this.A01 = r0;
            return;
        }
        this.A01 = new AnonymousClass4MC(str.substring(0, indexOf), z2);
        this.A00 = new AnonymousClass4MC(str.substring(indexOf + 1), z2);
    }
}
