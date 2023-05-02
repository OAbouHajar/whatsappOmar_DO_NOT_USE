package X;

import android.media.AudioTrack;

/* renamed from: X.5Aw  reason: invalid class name and case insensitive filesystem */
public class C105715Aw extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C96334oA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105715Aw(AudioTrack audioTrack, C96334oA r3) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.A01 = r3;
        this.A00 = audioTrack;
    }

    public void run() {
        try {
            AudioTrack audioTrack = this.A00;
            audioTrack.flush();
            audioTrack.release();
        } finally {
            this.A01.A0b.open();
        }
    }
}
