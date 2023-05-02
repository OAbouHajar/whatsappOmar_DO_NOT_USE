package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: X.3gd  reason: invalid class name and case insensitive filesystem */
public final class C70413gd extends AnonymousClass3MG {
    public final C16040sK A00;
    public final C16010sH A01;

    public C70413gd(Context context, C16040sK r2, C16010sH r3, int i2) {
        super(context, i2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void onClick(View view) {
        C16040sK r1 = this.A00;
        C16010sH r3 = this.A01;
        if (!r1.A0I(r3.A07())) {
            Activity A02 = C19980zJ.A02(view);
            A02.startActivity(new C14750ph().A0w(A02, r3, 14));
        }
    }
}
