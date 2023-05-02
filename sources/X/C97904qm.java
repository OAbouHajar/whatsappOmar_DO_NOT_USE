package X;

import android.os.Handler;

/* renamed from: X.4qm  reason: invalid class name and case insensitive filesystem */
public final class C97904qm implements C13880oE {
    public final /* synthetic */ AnonymousClass3CL A00;

    public C97904qm(AnonymousClass3CL r1) {
        this.A00 = r1;
    }

    public final void ANB(boolean z2) {
        Handler handler = this.A00.A06;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z2)));
    }
}
