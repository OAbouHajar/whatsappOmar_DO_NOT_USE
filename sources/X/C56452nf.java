package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2nf  reason: invalid class name and case insensitive filesystem */
public final class C56452nf extends Handler {
    public final Context A00;
    public final C17250um A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56452nf(Context context, Looper looper, C17250um r4) {
        super(looper);
        AnonymousClass00B.A06(looper);
        this.A00 = context.getApplicationContext();
        this.A01 = r4;
    }

    public void handleMessage(Message message) {
        long j2;
        C56562nu r2;
        Message obtain;
        C84664Lk r0 = (C84664Lk) message.obj;
        C434520b r5 = null;
        if (r0 != null) {
            r2 = r0.A01;
            r5 = r0.A02;
            j2 = r0.A00;
        } else {
            j2 = -1;
            r2 = null;
        }
        C17250um r3 = this.A01;
        Resources resources = this.A00.getResources();
        AnonymousClass00B.A06(r5);
        Drawable A04 = r3.A04(resources, r5, 0.6f, j2);
        if (r2 != null) {
            r2.setTag(A04);
            obtain = Message.obtain(AnonymousClass3BH.A0U, 0, 0, 0, C13690nt.A0I(Long.valueOf(j2), r2));
        } else {
            obtain = Message.obtain(AnonymousClass3BH.A0U, 1, 0, 0, C13690nt.A0I(Long.valueOf(j2), A04));
        }
        obtain.sendToTarget();
    }
}
