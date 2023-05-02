package X;

/* renamed from: X.0bs  reason: invalid class name */
public class AnonymousClass0bs implements AnonymousClass023 {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass026 A01;

    public AnonymousClass0bs(AnonymousClass026 r2) {
        this.A01 = r2;
    }

    public void AOH(Object obj) {
        AnonymousClass026 r2 = this.A01;
        Object A012 = r2.A01();
        if (!this.A00) {
            if (A012 == null) {
                if (obj == null) {
                    return;
                }
            } else if (A012.equals(obj)) {
                return;
            }
        }
        this.A00 = false;
        r2.A0B(obj);
    }
}
