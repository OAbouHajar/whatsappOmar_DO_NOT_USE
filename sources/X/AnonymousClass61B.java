package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.61B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass61B implements AnonymousClass68U {
    public final /* synthetic */ C35391lr A00;
    public final /* synthetic */ C118815vI A01;

    public /* synthetic */ AnonymousClass61B(C35391lr r1, C118815vI r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void AWV(AnonymousClass2HJ r5, String str) {
        C118815vI r3 = this.A01;
        C35391lr r2 = this.A00;
        C111815hS r1 = (C111815hS) r2.A08;
        if (TextUtils.isEmpty(str) || r1 == null) {
            r3.A0B.APf((C35391lr) null, C110115dX.A0N(), (ArrayList) null, false);
            return;
        }
        r1.A06 = str;
        C110115dX.A0z(r3.A0A.A01(), r2, r3, 3);
    }
}
