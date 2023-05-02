package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.lang.ref.SoftReference;

/* renamed from: X.3Lx  reason: invalid class name and case insensitive filesystem */
public final class C63893Lx extends Handler {
    public final Context A00;
    public final /* synthetic */ AnonymousClass2Ur A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63893Lx(Context context, Looper looper, AnonymousClass2Ur r3) {
        super(looper);
        this.A01 = r3;
        AnonymousClass00B.A06(looper);
        this.A00 = context;
    }

    public void handleMessage(Message message) {
        AnonymousClass2Ur r5 = this.A01;
        String A02 = AnonymousClass2Ur.A02(message.getData());
        AnonymousClass4IG A012 = AnonymousClass2Ur.A01(this.A00, r5, A02);
        if (A012 != null) {
            r5.A0e.put(A02, new SoftReference(A012));
            View view = (View) message.obj;
            if (view != null) {
                view.setTag(A012);
                Message obtain = Message.obtain(r5.A0K, 0, 0, 0, view);
                obtain.setData(AnonymousClass2Ur.A00(A02));
                obtain.sendToTarget();
            }
        }
    }
}
