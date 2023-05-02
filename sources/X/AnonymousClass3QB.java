package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.3QB  reason: invalid class name */
public class AnonymousClass3QB extends C003401n implements AnonymousClass2VG {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public AnonymousClass027 A01 = C13690nt.A0O();
    public HashSet A02;
    public final AnonymousClass1BQ A03;

    public AnonymousClass3QB(AnonymousClass1BQ r4) {
        this.A03 = r4;
        this.A00.A0B(C13690nt.A0i(0));
        this.A01.A0B(C13690nt.A0i(0));
    }

    public void A05() {
        this.A01.A0B(C89674ci.A01(this.A02, (List) this.A00.A01()));
    }

    public void AWX(AnonymousClass2X4 r5) {
        List list = r5.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashSet.add(list.get(i2));
        }
        this.A02 = hashSet;
        A05();
    }
}
