package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import java.util.concurrent.Callable;

/* renamed from: X.3IZ  reason: invalid class name */
public class AnonymousClass3IZ implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C613538o A01;
    public final /* synthetic */ C15780rq A02;
    public final /* synthetic */ Object A03;

    public AnonymousClass3IZ(Context context, C613538o r2, C15780rq r3, Object obj) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = r3;
        this.A03 = obj;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C31201dg r2;
        Object obj;
        AnonymousClass4G0 r1;
        C89994dK A002;
        Context context = this.A00;
        C15780rq r11 = this.A02;
        Object obj2 = this.A03;
        C613538o r0 = this.A01;
        C89994dK r6 = r0.A05;
        int i2 = r0.A01;
        int i3 = r0.A02;
        int i4 = r0.A00;
        if (r6 != null) {
            r2 = r6.A03;
            obj = r6.A04;
        } else {
            r2 = null;
            obj = null;
        }
        C89644cb.A01("RC Create Tree");
        Pair AcU = (r6 == null || r11 != r6.A01) ? r11.AcU() : C13690nt.A0I(r2, obj);
        Object obj3 = AcU.first;
        if (r6 != null) {
            AnonymousClass3AI r22 = r6.A02;
            if (obj3 == r6.A03) {
                int i5 = r22.A01;
                Rect rect = r22.A03.A04;
                if (AnonymousClass4Xc.A01(i5, i3, rect.width()) && AnonymousClass4Xc.A01(r22.A00, i4, rect.height())) {
                    A002 = new C89994dK(r6.A00, r11, r22, (C31201dg) AcU.first, AcU.second);
                    C89644cb.A00();
                    return A002;
                }
            }
        }
        C89644cb.A01("RC Layout");
        if (r6 == null || (r1 = r6.A00) == null) {
            r1 = null;
        }
        C86794Ue r9 = new C86794Ue(context, new AnonymousClass4ZW(r1), obj2, i2);
        AnonymousClass5TP A0D = ((C31201dg) AcU.first).A0D(r9, i3, i4);
        C89644cb.A00();
        C89644cb.A01("RC Reduce");
        A002 = C89994dK.A00(r9, A0D, r11, (C31201dg) AcU.first, AcU.second, i3, i4);
        C89644cb.A00();
        r9.A00 = null;
        C89644cb.A00();
        return A002;
    }
}
