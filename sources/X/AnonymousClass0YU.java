package X;

import android.view.Choreographer;

/* renamed from: X.0YU  reason: invalid class name */
public class AnonymousClass0YU implements Choreographer.FrameCallback {
    public final /* synthetic */ C010004v A00;

    public AnonymousClass0YU(C010004v r1) {
        this.A00 = r1;
    }

    public void doFrame(long j2) {
        C010004v r6 = this.A00;
        if (!r6.A03) {
            r6.A05.removeFrameCallback(this);
            return;
        }
        if (r6.A00 == -1) {
            r6.A00 = j2;
            r6.A01 = j2;
        } else {
            r6.A01 = j2;
            AnonymousClass04u r7 = r6.A02.A00;
            double d2 = r7.A04;
            long max = Math.max(Math.round(((double) (j2 - r6.A01)) / d2), 1);
            long min = Math.min(max - 1, 100);
            double d3 = (double) min;
            r7.A01 += d3;
            if (min > 4) {
                r7.A00 += d3 / 4.0d;
            }
            r7.A02 = (long) (((double) r7.A02) + (d2 * ((double) max)));
        }
        r6.A05.postFrameCallback(this);
    }
}
