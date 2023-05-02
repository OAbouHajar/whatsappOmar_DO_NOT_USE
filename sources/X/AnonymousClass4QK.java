package X;

import android.app.Activity;
import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.4QK  reason: invalid class name */
public final class AnonymousClass4QK {
    public final C18890xQ A00;

    public AnonymousClass4QK(C18890xQ r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public final void A00(Activity activity, Context context) {
        C32241fu A002 = C32241fu.A00(context);
        A002.A02(R.string.str18ae);
        A002.A01(R.string.str18ad);
        A002.A07(false);
        AnonymousClass3K4.A0n(A002, context, this, 26, R.string.str18b2);
        C13690nt.A1H(A002, activity, 73, R.string.str0e1f);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
