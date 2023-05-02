package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.3Vg  reason: invalid class name and case insensitive filesystem */
public class C65563Vg extends C97554qB {
    public final AnonymousClass5LX A00;
    public final AnonymousClass5TU A01;
    public final C34641kb A02;

    public C65563Vg(C93574jQ r2, AnonymousClass5LX r3, AnonymousClass5TU r4, List list, int[] iArr) {
        super(r2, iArr);
        this.A00 = r3;
        this.A02 = C34641kb.copyOf((Collection) list);
        this.A01 = r4;
    }

    public static void A00(List list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            C67763cL r5 = (C67763cL) list.get(i2);
            if (r5 != null) {
                r5.add((Object) new AnonymousClass4TH(j2, jArr[i2]));
            }
        }
    }
}
