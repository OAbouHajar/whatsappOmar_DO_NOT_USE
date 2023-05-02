package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.38u  reason: invalid class name and case insensitive filesystem */
public class C614138u {
    public RectF A00;
    public C455829l A01;
    public final AnonymousClass4EU A02;
    public final AnonymousClass39P A03;
    public final AnonymousClass397 A04;
    public final AnonymousClass39N A05;
    public final AnonymousClass39G A06;

    public C614138u(AnonymousClass4EU r2, AnonymousClass39P r3, AnonymousClass39N r4, AnonymousClass39G r5) {
        this.A03 = r3;
        this.A04 = new AnonymousClass397(r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = r2;
    }

    public final void A00() {
        AnonymousClass39P r2 = this.A03;
        if (r2.A07 != null) {
            RectF A0K = AnonymousClass000.A0K();
            r2.A09.mapRect(A0K, r2.A07);
            int i2 = r2.A04;
            int i3 = r2.A03;
            float width = A0K.width() / A0K.height();
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (width > f2 / f3) {
                f3 = f2 / width;
            } else {
                f2 = f3 * width;
            }
            float f4 = (float) (i2 >> 1);
            float f5 = (float) (i3 >> 1);
            float f6 = f2 / 2.0f;
            float f7 = f3 / 2.0f;
            RectF rectF = new RectF(f4 - f6, f5 - f7, f4 + f6, f5 + f7);
            RectF rectF2 = this.A00;
            if (rectF2 == null || !rectF2.equals(rectF)) {
                this.A00 = rectF;
                AnonymousClass39N r4 = this.A05;
                RectF rectF3 = r4.A02;
                rectF3.set(rectF);
                Map map = r4.A05;
                Iterator A0q = C13680ns.A0q(map);
                while (A0q.hasNext()) {
                    C615539j r0 = (C615539j) A0q.next();
                    View view = r0.A06;
                    if (view != null) {
                        r0.A07.removeView(view);
                    }
                }
                map.clear();
                Integer A0Y = C13680ns.A0Y();
                Handler handler = r4.A09;
                ViewGroup viewGroup = r4.A0A;
                Vibrator vibrator = r4.A03;
                map.put(A0Y, new C76853un(rectF3, handler, vibrator, viewGroup, 1));
                map.put(C13680ns.A0Z(), new C76853un(rectF3, handler, vibrator, viewGroup, 2));
                map.put(C13680ns.A0a(), new C604932o(rectF3, handler, vibrator, viewGroup));
            }
        }
    }
}
