package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2Wf  reason: invalid class name and case insensitive filesystem */
public class C49862Wf {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();
    public Map A02 = Collections.emptyMap();
    public Map A03 = Collections.emptyMap();
    public final Context A04;
    public final AnonymousClass2Wa A05;
    public final AnonymousClass22A A06;

    public C49862Wf(Context context, AnonymousClass2Wa r3, AnonymousClass22A r4) {
        this.A04 = context;
        this.A05 = r3;
        this.A06 = r4;
    }

    public C49852We A00() {
        Context context = this.A04;
        AnonymousClass2Wa r3 = this.A05;
        Map map = this.A02;
        Map map2 = this.A03;
        return new C49852We(context, this.A01, r3, this.A06, map, map2, this.A00);
    }

    public void A01(int i2) {
        this.A00 = i2;
    }

    public void A02(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    public void A03(Map map) {
        this.A02 = map;
    }

    public void A04(Map map) {
        this.A03 = map;
    }
}
