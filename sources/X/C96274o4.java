package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: X.4o4  reason: invalid class name and case insensitive filesystem */
public class C96274o4 implements C108225Nd {
    public boolean A00;
    public final Context A01;

    public C96274o4(Context context, boolean z2) {
        this.A01 = context;
        this.A00 = z2;
    }

    public AnonymousClass5UO[] A7X(Handler handler, AnonymousClass5TI r10, C108295Nk r11, C108335No r12, AnonymousClass5TJ r13) {
        ArrayList A0u = AnonymousClass000.A0u();
        Handler handler2 = handler;
        A0u.add(new C65473Ux(this.A01, handler2, AnonymousClass5TR.A00, new C97104pP(this), r13));
        return (AnonymousClass5UO[]) A0u.toArray(new AnonymousClass5UO[0]);
    }
}
