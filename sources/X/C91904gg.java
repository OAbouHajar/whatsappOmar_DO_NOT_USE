package X;

import android.media.MediaPlayer;

/* renamed from: X.4gg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91904gg implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ AnonymousClass2PI A00;

    public /* synthetic */ C91904gg(AnonymousClass2PI r1) {
        this.A00 = r1;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        AnonymousClass2PI r6 = this.A00;
        r6.A05 = i2;
        r6.A04 = i3;
        if (!(i2 == 0 || i3 == 0)) {
            int width = r6.getWidth();
            int height = r6.getHeight();
            int i4 = r6.A05;
            int i5 = i4 * height;
            int i6 = r6.A04;
            int i7 = i6 * width;
            if (i5 > i7) {
                height = i7 / i4;
            } else {
                width = i5 / i6;
            }
            int width2 = r6.getWidth();
            r6.setTop((r6.getHeight() - height) >> 1);
            r6.setBottom(r6.getTop() + height);
            r6.setLeft((width2 - width) >> 1);
            r6.setRight(r6.getLeft() + width);
        }
        r6.requestLayout();
    }
}
