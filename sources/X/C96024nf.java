package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* renamed from: X.4nf  reason: invalid class name and case insensitive filesystem */
public class C96024nf implements AnonymousClass5SJ {
    public final /* synthetic */ List A00;

    public C96024nf(List list) {
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        C49842Wd r4 = (C49842Wd) obj;
        r4.setTouchDelegate(new C64013Mk(r4, this.A00));
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setTouchDelegate((TouchDelegate) null);
    }
}
