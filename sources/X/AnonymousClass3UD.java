package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.3UD  reason: invalid class name */
public final class AnonymousClass3UD extends AnonymousClass3UQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Timeline A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UD(Timeline timeline, int i2) {
        super(new C97364ps(i2));
        boolean z2 = false;
        this.A03 = timeline;
        int A002 = timeline.A00();
        this.A00 = A002;
        this.A01 = timeline.A01();
        this.A02 = i2;
        if (A002 > 0) {
            C90524eJ.A02("LoopingMediaSource contains too many periods", i2 <= Integer.MAX_VALUE / A002 ? true : z2);
        }
    }
}
