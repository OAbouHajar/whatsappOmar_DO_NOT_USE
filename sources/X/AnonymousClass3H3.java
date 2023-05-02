package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3H3  reason: invalid class name */
public class AnonymousClass3H3 implements AnonymousClass5QO {
    public final /* synthetic */ C41811wh A00;

    public AnonymousClass3H3(C41811wh r1) {
        this.A00 = r1;
    }

    public void ASe(MotionEvent motionEvent, View view, String str) {
        boolean contains = C812247i.A00(str).contains("…");
        C41811wh r5 = this.A00;
        r5.A0C();
        C16740tZ r2 = ((AnonymousClass2B3) r5).A0B;
        View view2 = r5.A00;
        AnonymousClass00B.A04(view2);
        Context context = view2.getContext();
        String str2 = r2.A11.A01;
        C31021dL.A01(context, r5.A09, r5, str, str2, r5.A0I.A00(r2.A0B(), r2, str), contains);
    }
}
