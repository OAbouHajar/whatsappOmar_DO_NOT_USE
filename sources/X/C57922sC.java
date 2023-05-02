package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2sC  reason: invalid class name and case insensitive filesystem */
public final class C57922sC extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new AnonymousClass3M2(Looper.getMainLooper());
    public final C003001i A01;
    public final C57892s9 A02;
    public final AnonymousClass3CL A03;
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public volatile boolean A05;

    public C57922sC(C57892s9 r3, AnonymousClass3CL r4, C109545So r5) {
        super(r5);
        this.A02 = r3;
        this.A01 = new C003001i(0);
        this.A03 = r4;
        this.A00.A4X(this, "ConnectionlessLifecycleHelper");
    }

    public final void A00() {
        if (!this.A01.isEmpty()) {
            this.A03.A05(this);
        }
    }

    public final void A01() {
        this.A05 = true;
        if (!this.A01.isEmpty()) {
            this.A03.A05(this);
        }
    }

    public final void A02() {
        this.A05 = false;
        AnonymousClass3CL r2 = this.A03;
        synchronized (AnonymousClass3CL.A0I) {
            if (r2.A01 == this) {
                r2.A01 = null;
                r2.A0A.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r4 = r7.A04
            java.lang.Object r5 = r4.get()
            X.4GU r5 = (X.AnonymousClass4GU) r5
            r0 = 1
            if (r8 == r0) goto L_0x002f
            r0 = 2
            if (r8 != r0) goto L_0x0058
            X.2s9 r2 = r7.A02
            X.5So r0 = r7.A00
            android.app.Activity r1 = r0.AD7()
            X.C13710nw.A01(r1)
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.A00(r1, r0)
            if (r2 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x002e
            X.0rh r0 = r5.A01
            int r1 = r0.A01
            r0 = 18
            if (r1 != r0) goto L_0x005a
            if (r2 != r0) goto L_0x005a
        L_0x002e:
            return
        L_0x002f:
            r0 = -1
            if (r9 == r0) goto L_0x0063
            if (r9 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x002e
            r3 = 13
            if (r10 == 0) goto L_0x0040
            java.lang.String r0 = "<<ResolutionFailureErrorDetail>>"
            int r3 = r10.getIntExtra(r0, r3)
        L_0x0040:
            r2 = 0
            X.0rh r0 = r5.A01
            java.lang.String r1 = r0.toString()
            r0 = 1
            X.0rh r6 = new X.0rh
            r6.<init>(r2, r1, r0, r3)
            int r1 = r5.A00
            r4.set(r2)
        L_0x0052:
            X.3CL r0 = r7.A03
            r0.A04(r6, r1)
            return
        L_0x0058:
            if (r5 == 0) goto L_0x002e
        L_0x005a:
            X.0rh r6 = r5.A01
            int r1 = r5.A00
            r0 = 0
            r4.set(r0)
            goto L_0x0052
        L_0x0063:
            r0 = 0
            r4.set(r0)
            X.3CL r0 = r7.A03
            android.os.Handler r1 = r0.A06
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0)
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57922sC.A03(int, int, android.content.Intent):void");
    }

    public final void A04(Bundle bundle) {
        if (bundle != null) {
            this.A04.set(bundle.getBoolean("resolving_error", false) ? new AnonymousClass4GU(new C15700rh(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void A05(Bundle bundle) {
        AnonymousClass4GU r2 = (AnonymousClass4GU) this.A04.get();
        if (r2 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", r2.A00);
            C15700rh r22 = r2.A01;
            bundle.putInt("failed_status", r22.A01);
            bundle.putParcelable("failed_resolution", r22.A02);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C15700rh r3 = new C15700rh(13, (PendingIntent) null);
        AtomicReference atomicReference = this.A04;
        AnonymousClass4GU r0 = (AnonymousClass4GU) atomicReference.get();
        int i2 = r0 == null ? -1 : r0.A00;
        atomicReference.set((Object) null);
        this.A03.A04(r3, i2);
    }
}
