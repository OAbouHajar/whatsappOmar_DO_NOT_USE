package X;

import android.view.ViewGroup;
import com.facebook.redex.IDxICallbackShape4S0000000_2_I1;
import com.obwhatsapp.R;
import java.util.Map;

/* renamed from: X.3Qp  reason: invalid class name and case insensitive filesystem */
public class C64513Qp extends AnonymousClass01W {
    public long A00 = 1;
    public final Map A01 = AnonymousClass000.A0x();

    public C64513Qp() {
        super(new AnonymousClass0US(new IDxICallbackShape4S0000000_2_I1(1)).A00());
        A0B(true);
    }

    public long A0D(int i2) {
        AnonymousClass4TO r1 = (AnonymousClass4TO) A0E(i2);
        Map map = this.A01;
        String str = r1 instanceof C71853l9 ? ((C71853l9) r1).A00 : ((C71843l8) r1).A00.A01;
        Number number = (Number) map.get(str);
        if (number == null) {
            long j2 = this.A00;
            this.A00 = 1 + j2;
            number = Long.valueOf(j2);
            map.put(str, number);
        }
        return number.longValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r7, int r8) {
        /*
            r6 = this;
            X.3Ry r7 = (X.C64863Ry) r7
            java.lang.Object r4 = r6.A0E(r8)
            X.4TO r4 = (X.AnonymousClass4TO) r4
            android.view.View r5 = r7.A0H
            android.content.Context r1 = r5.getContext()
            r0 = 2131887964(0x7f12075c, float:1.941055E38)
            java.lang.String r1 = r1.getString(r0)
            com.obwhatsapp.WaTextView r3 = r7.A01
            boolean r2 = r4.A01
            if (r2 != 0) goto L_0x0061
            boolean r0 = r4 instanceof X.C71853l9
            if (r0 == 0) goto L_0x0059
            r0 = r4
            X.3l9 r0 = (X.C71853l9) r0
            java.lang.String r0 = r0.A00
        L_0x0024:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
            android.content.Context r1 = r5.getContext()
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = X.C87594Xo.A00(r1, r0)
        L_0x0034:
            r3.setMaxWidth(r0)
            r0 = 49
            X.C13680ns.A1A(r3, r4, r0)
            boolean r0 = r4 instanceof X.C71853l9
            if (r0 == 0) goto L_0x0052
            X.3l9 r4 = (X.C71853l9) r4
            java.lang.String r0 = r4.A00
        L_0x0044:
            r3.setText(r0)
            android.widget.ImageView r1 = r7.A00
            r0 = 0
            if (r2 == 0) goto L_0x004e
            r0 = 8
        L_0x004e:
            r1.setVisibility(r0)
            return
        L_0x0052:
            X.3l8 r4 = (X.C71843l8) r4
            X.4Vx r0 = r4.A00
            java.lang.String r0 = r0.A02
            goto L_0x0044
        L_0x0059:
            r0 = r4
            X.3l8 r0 = (X.C71843l8) r0
            X.4Vx r0 = r0.A00
            java.lang.String r0 = r0.A02
            goto L_0x0024
        L_0x0061:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64513Qp.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C64863Ry(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0367));
    }
}
