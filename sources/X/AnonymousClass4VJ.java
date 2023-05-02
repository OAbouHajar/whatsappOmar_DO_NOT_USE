package X;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* renamed from: X.4VJ  reason: invalid class name */
public final class AnonymousClass4VJ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public C87434Wt A0N;
    public Method A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final AnonymousClass5LC A0U;
    public final long[] A0V;

    public AnonymousClass4VJ(AnonymousClass5LC r4) {
        this.A0U = r4;
        if (AnonymousClass3C1.A01 >= 18) {
            try {
                this.A0O = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0V = new long[10];
    }

    public final long A00() {
        AudioTrack audioTrack = this.A0M;
        long j2 = this.A0L;
        if (j2 != -9223372036854775807L) {
            return Math.min(this.A07, this.A0K + AnonymousClass3K3.A0S((SystemClock.elapsedRealtime() * 1000) - j2, (long) this.A04));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.A0S) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.A0F = this.A0C;
            }
            playbackHeadPosition += this.A0F;
        }
        if (AnonymousClass3C1.A01 <= 29) {
            if (playbackHeadPosition == 0) {
                long j3 = this.A0C;
                if (j3 > 0 && playState == 3) {
                    if (this.A08 == -9223372036854775807L) {
                        this.A08 = SystemClock.elapsedRealtime();
                    }
                    return j3;
                }
            }
            this.A08 = -9223372036854775807L;
        }
        if (this.A0C > playbackHeadPosition) {
            this.A0I++;
        }
        this.A0C = playbackHeadPosition;
        return playbackHeadPosition + (this.A0I << 32);
    }
}
