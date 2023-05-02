package X;

import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4VB  reason: invalid class name */
public final class AnonymousClass4VB {
    public int A00;
    public Looper A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass5L9 A06;
    public final C108215Nc A07;
    public final Timeline A08;
    public final AnonymousClass5TU A09;

    public AnonymousClass4VB(Looper looper, AnonymousClass5L9 r2, C108215Nc r3, Timeline timeline, AnonymousClass5TU r5) {
        this.A06 = r2;
        this.A07 = r3;
        this.A08 = timeline;
        this.A01 = looper;
        this.A09 = r5;
    }

    public void A00() {
        C90524eJ.A04(!this.A05);
        this.A05 = true;
        C97274pg r2 = (C97274pg) this.A06;
        synchronized (r2) {
            if (r2.A0F || !r2.A0K.isAlive()) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A01(false);
            } else {
                C97684qO.A00(r2.A0Y, 14, this);
            }
        }
    }

    public synchronized void A01(boolean z2) {
        this.A03 = z2 | this.A03;
        this.A04 = true;
        notifyAll();
    }
}
