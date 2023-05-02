package X;

import android.content.Context;
import android.view.View;
import com.facebook.redex.IDxCListenerShape132S0100000_I1;

/* renamed from: X.0ed  reason: invalid class name and case insensitive filesystem */
public class C08930ed implements AnonymousClass5SJ {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ C31201dg A01;
    public final /* synthetic */ C14930q1 A02;

    public C08930ed(C14990q7 r1, C31201dg r2, C14930q1 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setOnClickListener(new IDxCListenerShape132S0100000_I1(this, 3));
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
    }
}
