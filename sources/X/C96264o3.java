package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.4o3  reason: invalid class name and case insensitive filesystem */
public class C96264o3 implements C108225Nd {
    public final Context A00;

    public C96264o3(Context context) {
        this.A00 = context;
    }

    public AnonymousClass5UO[] A7X(Handler handler, AnonymousClass5TI r18, C108295Nk r19, C108335No r20, AnonymousClass5TJ r21) {
        ArrayList A0u = AnonymousClass000.A0u();
        Context context = this.A00;
        C109725Ti r9 = C109725Ti.A00;
        Handler handler2 = handler;
        A0u.add(new C65473Ux(context, handler2, AnonymousClass5TR.A00, r9, r21));
        A0u.add(new C65483Uy(context, handler2, C90094dU.A00(context), r18, r9, new C109765Tm[0]));
        A0u.add(new AnonymousClass3UJ(handler2.getLooper(), r20));
        return (AnonymousClass5UO[]) A0u.toArray(new AnonymousClass5UO[0]);
    }
}
