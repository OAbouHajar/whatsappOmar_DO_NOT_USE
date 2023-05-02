package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: X.0hj  reason: invalid class name and case insensitive filesystem */
public class C10810hj implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    public C10810hj(Context context, String str, WeakReference weakReference, int i2) {
        this.A03 = weakReference;
        this.A01 = context;
        this.A00 = i2;
        this.A02 = str;
    }

    public /* bridge */ /* synthetic */ Object call() {
        Context context = (Context) this.A03.get();
        if (context == null) {
            context = this.A01;
        }
        return AnonymousClass0XN.A00(context, this.A02, this.A00);
    }
}
