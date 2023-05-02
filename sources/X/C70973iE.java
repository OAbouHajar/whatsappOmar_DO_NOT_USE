package X;

import java.io.File;

/* renamed from: X.3iE  reason: invalid class name and case insensitive filesystem */
public class C70973iE extends C70983iF {
    public int A00 = 0;
    public final /* synthetic */ C108465Oc A01;
    public final /* synthetic */ AnonymousClass2GJ A02;
    public final /* synthetic */ AnonymousClass2GM A03;
    public final /* synthetic */ C61743Ad A04;
    public final /* synthetic */ File A05;

    public C70973iE(C108465Oc r2, AnonymousClass2GJ r3, AnonymousClass2GM r4, C61743Ad r5, File file) {
        this.A03 = r4;
        this.A05 = file;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object A00(int i2) {
        try {
            AnonymousClass2GM r4 = this.A03;
            File file = this.A05;
            if (r4.A0C(this.A01, this.A02, this.A04, file)) {
                return Boolean.TRUE;
            }
        } catch (C71123iW | C71133iX e2) {
            int i3 = this.A00;
            if (i3 <= 5) {
                this.A00 = i3 + 1;
            } else {
                throw new C71173ib("Having problems with local storage", e2);
            }
        }
        return null;
    }
}
