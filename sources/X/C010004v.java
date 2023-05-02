package X;

import android.view.Choreographer;

/* renamed from: X.04v  reason: invalid class name and case insensitive filesystem */
public class C010004v {
    public long A00 = -1;
    public long A01 = -1;
    public C04690Nn A02;
    public boolean A03 = false;
    public final Choreographer.FrameCallback A04;
    public final Choreographer A05;

    public C010004v(Choreographer choreographer, C04690Nn r4) {
        this.A05 = choreographer;
        this.A02 = r4;
        this.A04 = new AnonymousClass0YU(this);
    }
}
