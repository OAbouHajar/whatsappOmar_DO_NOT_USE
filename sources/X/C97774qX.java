package X;

import android.os.SystemClock;

/* renamed from: X.4qX  reason: invalid class name and case insensitive filesystem */
public final class C97774qX implements AnonymousClass5SP {
    public long A00;
    public long A01;
    public C89214bm A02 = C89214bm.A03;
    public boolean A03;
    public final AnonymousClass5TU A04;

    public C97774qX(AnonymousClass5TU r2) {
        this.A04 = r2;
    }

    public void A00(long j2) {
        this.A01 = j2;
        if (this.A03) {
            this.A00 = SystemClock.elapsedRealtime();
        }
    }

    public C89214bm AF4() {
        return this.A02;
    }

    public long AFA() {
        long j2 = this.A01;
        if (!this.A03) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        C89214bm r4 = this.A02;
        return j2 + (r4.A01 == 1.0f ? C90604eR.A01(elapsedRealtime) : elapsedRealtime * ((long) r4.A02));
    }

    public void AeL(C89214bm r3) {
        if (this.A03) {
            A00(AFA());
        }
        this.A02 = r3;
    }
}
