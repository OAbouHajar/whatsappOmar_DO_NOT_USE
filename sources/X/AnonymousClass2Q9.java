package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.2Q9  reason: invalid class name */
public abstract class AnonymousClass2Q9 extends C30011bb {
    public AnonymousClass2Q9(Context context, AnonymousClass1YG r2, C16740tZ r3) {
        super(context, r2, r3);
    }

    public void A1M(C33741j5 r4, int i2) {
        Context context = getContext();
        int i3 = R.color.color0541;
        if (i2 == 0) {
            i3 = R.color.color0542;
        }
        int A00 = AnonymousClass00T.A00(context, i3);
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("#updateProgressBarColor");
        r4.A06(new C1037152l(A00), sb.toString());
    }
}
