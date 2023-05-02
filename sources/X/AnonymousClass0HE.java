package X;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0HE  reason: invalid class name */
public class AnonymousClass0HE extends AnonymousClass0SI {
    public AnonymousClass0UV A00;
    public AnonymousClass0UV A01;
    public final PointF A02 = new PointF();
    public final PointF A03 = new PointF();
    public final AnonymousClass0SI A04;
    public final AnonymousClass0SI A05;

    public AnonymousClass0HE(AnonymousClass0SI r2, AnonymousClass0SI r3) {
        super(Collections.emptyList());
        this.A04 = r2;
        this.A05 = r3;
        A0C(this.A02);
    }

    public /* bridge */ /* synthetic */ Object A09(C06520Wl r2, float f2) {
        return A08();
    }

    public void A0C(float f2) {
        AnonymousClass0SI r1 = this.A04;
        r1.A0C(f2);
        AnonymousClass0SI r0 = this.A05;
        r0.A0C(f2);
        this.A02.set(AnonymousClass0SI.A02(r1), AnonymousClass0SI.A02(r0));
        int i2 = 0;
        while (true) {
            List list = this.A07;
            if (i2 < list.size()) {
                ((C12650kk) list.get(i2)).AZV();
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: A0E */
    public PointF A08() {
        Number number;
        AnonymousClass0SI r0;
        C06520Wl A002;
        AnonymousClass0SI r02;
        C06520Wl A003;
        Number number2 = null;
        if (this.A00 == null || (A003 = AnonymousClass0NI.A00(r02)) == null) {
            number = null;
        } else {
            (r02 = this.A04).A06();
            Float f2 = A003.A08;
            AnonymousClass0UV r4 = this.A00;
            if (f2 != null) {
                f2.floatValue();
            }
            Object obj = A003.A0F;
            Object obj2 = A003.A09;
            AnonymousClass0OB r03 = r4.A02;
            r03.A01 = obj;
            r03.A00 = obj2;
            number = (Number) r4.A01;
        }
        if (!(this.A01 == null || (A002 = AnonymousClass0NI.A00(r0)) == null)) {
            (r0 = this.A05).A06();
            Float f3 = A002.A08;
            AnonymousClass0UV r3 = this.A01;
            if (f3 != null) {
                f3.floatValue();
            }
            Object obj3 = A002.A0F;
            Object obj4 = A002.A09;
            AnonymousClass0OB r04 = r3.A02;
            r04.A01 = obj3;
            r04.A00 = obj4;
            number2 = (Number) r3.A01;
        }
        PointF pointF = this.A03;
        pointF.set(number == null ? this.A02.x : number.floatValue(), 0.0f);
        pointF.set(pointF.x, number2 == null ? this.A02.y : number2.floatValue());
        return pointF;
    }
}
