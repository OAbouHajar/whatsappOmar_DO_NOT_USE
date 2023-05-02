package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.448  reason: invalid class name */
public final class AnonymousClass448 extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public AnonymousClass448(Timeline timeline2, int i2, long j2) {
        this.timeline = timeline2;
        this.windowIndex = i2;
        this.positionMs = j2;
    }
}
