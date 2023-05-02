package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.66c  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1215966c implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1221068h A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C1215966c(Context context, C1221068h r2, boolean z2) {
        this.A00 = context;
        this.A02 = z2;
        this.A01 = r2;
    }

    public final void run() {
        Context context = this.A00;
        boolean z2 = this.A02;
        C1221068h r3 = this.A01;
        C32241fu A002 = C32241fu.A00(context);
        int i2 = R.string.str117b;
        if (z2) {
            i2 = R.string.str1055;
        }
        A002.A02(i2);
        int i3 = R.string.str116c;
        if (z2) {
            i3 = R.string.str1054;
        }
        A002.A01(i3);
        C110105dW.A0v(A002, r3, 82, R.string.str0e87);
        C13690nt.A1G(A002);
    }
}
