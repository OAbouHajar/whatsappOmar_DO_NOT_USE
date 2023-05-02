package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.35y  reason: invalid class name */
public class AnonymousClass35y extends C16690tT {
    public final C49172Rk A00;
    public final C83874Ij A01;

    public AnonymousClass35y(C49172Rk r1, C83874Ij r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass2BF r3 = null;
        AnonymousClass2BC A002 = C16690tT.A00(this.A00, (String) null, 1, false);
        for (int i2 = 0; i2 < A002.getCount() && r3 == null; i2++) {
            r3 = A002.ADR(i2);
        }
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4FA r1;
        int A002;
        AnonymousClass2BF r7 = (AnonymousClass2BF) obj;
        if (r7 == null) {
            C606034k r2 = this.A01.A00;
            r2.A00 = null;
            r1 = r2.A00;
            A002 = r2.A00();
        } else if (!C16690tT.A02(this)) {
            C83874Ij r0 = this.A01;
            C606034k r5 = r0.A00;
            String str = r0.A01;
            Context context = r5.A0H.getContext();
            C102124yR r22 = new C102124yR(r7, r5, C16980tz.A00(r5.A02).getDimensionPixelSize(R.dimen.dimen03f7));
            C102184yX r12 = new C102184yX(context, r22, r5, str);
            r5.A05.setTag(r22);
            r5.A04.A02(r22, r12);
            r1 = r5.A00;
            A002 = r5.A00();
        } else {
            return;
        }
        r1.A00.remove(Integer.valueOf(A002));
    }
}
