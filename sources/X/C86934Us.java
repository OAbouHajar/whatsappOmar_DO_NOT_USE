package X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: X.4Us  reason: invalid class name and case insensitive filesystem */
public final class C86934Us {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public C86934Us(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }

    public long A00() {
        return C13690nt.A09(this.A03.nanoTime);
    }

    public boolean A01() {
        AudioTrack audioTrack = this.A04;
        AudioTimestamp audioTimestamp = this.A03;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j2 = audioTimestamp.framePosition;
            if (this.A01 > j2) {
                this.A02++;
            }
            this.A01 = j2;
            this.A00 = j2 + (this.A02 << 32);
        }
        return timestamp;
    }
}
