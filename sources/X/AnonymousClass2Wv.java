package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Wv  reason: invalid class name */
public class AnonymousClass2Wv {
    public int A00;
    public int A01 = -1;
    public final AnonymousClass2OJ A02;
    public final String A03;
    public final /* synthetic */ C55782kM A04;

    public AnonymousClass2Wv(C55782kM r2, String str, List list, int i2) {
        this.A04 = r2;
        this.A00 = i2;
        this.A03 = str;
        this.A02 = new AnonymousClass2OJ(list);
    }

    public boolean A00(C55792kN r9) {
        AnonymousClass2OJ r2 = this.A02;
        int indexOf = ((List) r2.A01()).indexOf(r9);
        if (!((List) r2.A01()).remove(r9)) {
            return false;
        }
        this.A01 = indexOf;
        r2.A0B(r2.A01());
        C55782kM r7 = this.A04;
        if (((List) r2.A01()).size() != 0) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass2OJ r5 = r7.A05;
        int i2 = 1;
        for (AnonymousClass2Wv r22 : (List) r5.A01()) {
            if (this.A03.equals(r22.A03)) {
                r7.A00 = i2;
            } else {
                r22.A00 = i2;
                arrayList.add(r22);
                i2++;
            }
        }
        r5.A0B(arrayList);
        return true;
    }
}
