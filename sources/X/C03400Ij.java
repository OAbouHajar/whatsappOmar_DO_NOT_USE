package X;

import java.util.ArrayList;

/* renamed from: X.0Ij  reason: invalid class name and case insensitive filesystem */
public class C03400Ij extends C10670hV {
    public final /* synthetic */ C03410Ik A00;
    public final /* synthetic */ AnonymousClass0WN A01;
    public final /* synthetic */ boolean A02;

    public C03400Ij(C03410Ik r1, AnonymousClass0WN r2, boolean z2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z2;
    }

    public void run() {
        C03410Ik r6 = this.A00;
        AnonymousClass0IX r5 = r6.A04;
        int i2 = r5.A09.A0R.A0G;
        AnonymousClass0WN r1 = this.A01;
        if (r1 != null) {
            r5.A0A.A02(r1);
            if (!this.A02 && r6.A03 <= i2 + 1) {
                r5.A02();
                ArrayList arrayList = AnonymousClass0IX.A0C;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((AnonymousClass0VB) arrayList.get(i3)).A02();
                    }
                    arrayList.clear();
                    return;
                }
                return;
            }
            return;
        }
        int i4 = r6.A00;
        if (i4 > 0) {
            int i5 = r6.A03;
            if (i5 == -1 || i5 == i2) {
                r5.A0G(r6.A01, r6.A02, i5, i4 - 1);
            }
        }
    }
}
