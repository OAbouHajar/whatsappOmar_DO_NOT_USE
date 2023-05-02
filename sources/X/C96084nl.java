package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.4nl  reason: invalid class name and case insensitive filesystem */
public class C96084nl implements AnonymousClass5SJ {
    public final C14990q7 A00;
    public final C31201dg A01;
    public final List A02;

    public C96084nl(C14990q7 r1, C31201dg r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C90154da.A00().A08.A02(this.A00, (C31201dg) list.get(i2), this.A01, obj);
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C90154da.A00().A08.A03(this.A00, (C31201dg) list.get(i2), this.A01, obj);
        }
    }
}
