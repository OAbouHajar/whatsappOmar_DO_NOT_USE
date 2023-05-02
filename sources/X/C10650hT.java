package X;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: X.0hT  reason: invalid class name and case insensitive filesystem */
public class C10650hT implements Runnable {
    public static final String A06 = C06530Wm.A01("WorkForegroundRunnable");
    public final Context A00;
    public final C12570kc A01;
    public final AnonymousClass02O A02;
    public final C007303i A03;
    public final AnonymousClass0H9 A04 = AnonymousClass0H9.A00();
    public final AnonymousClass04d A05;

    public C10650hT(Context context, C12570kc r3, AnonymousClass02O r4, C007303i r5, AnonymousClass04d r6) {
        this.A00 = context;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r6;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A01(AnonymousClass0H9 r2) {
        if (!this.A04.isCancelled()) {
            r2.A08(this.A02.A00());
        } else {
            r2.cancel(true);
        }
    }

    public C29981bY A02() {
        return this.A04;
    }

    public void run() {
        if (!this.A03.A0H || Build.VERSION.SDK_INT >= 31) {
            this.A04.A09((Object) null);
            return;
        }
        AnonymousClass0H9 A002 = AnonymousClass0H9.A00();
        Executor executor = ((C08190dE) this.A05).A02;
        executor.execute(new C10040gU(this, A002));
        A002.A4b(new C10050gV(this, A002), executor);
    }
}
