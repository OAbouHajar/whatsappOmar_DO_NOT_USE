package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* renamed from: X.0rX  reason: invalid class name and case insensitive filesystem */
public final class C15600rX extends C15610rY implements C15650rc, C15670re {
    public static final AnonymousClass3WP A07 = AnonymousClass4BG.A00;
    public C15690rg A00;
    public AnonymousClass5UT A01;
    public final Context A02;
    public final Handler A03;
    public final AnonymousClass3WP A04;
    public final AnonymousClass4O1 A05;
    public final Set A06;

    public C15600rX(Context context, Handler handler, AnonymousClass4O1 r5) {
        AnonymousClass3WP r1 = A07;
        this.A02 = context;
        this.A03 = handler;
        this.A05 = r5;
        this.A06 = r5.A05;
        this.A04 = r1;
    }

    public final void onConnected(Bundle bundle) {
        this.A01.AiV(this);
    }

    public final void onConnectionFailed(C15700rh r2) {
        this.A00.AiY(r2);
    }

    public final void onConnectionSuspended(int i2) {
        this.A01.A80();
    }
}
