package X;

import android.media.AudioManager;

/* renamed from: X.4gR  reason: invalid class name and case insensitive filesystem */
public class C91754gR implements AudioManager.OnAudioFocusChangeListener {
    public final C19610yi A00;

    public C91754gR(C19610yi r1) {
        this.A00 = r1;
    }

    public void onAudioFocusChange(int i2) {
        AnonymousClass2DT A002 = this.A00.A00();
        StringBuilder A0r = AnonymousClass000.A0r("messageaudioplayer/onaudiofocuschanged ");
        A0r.append(i2);
        A0r.append(" current player:");
        A0r.append(AnonymousClass000.A1V(A002));
        C13680ns.A1V(A0r);
        if (AnonymousClass01E.A01() && A002 != null) {
            if (i2 == -2 || i2 == -1) {
                if (A002.A0J()) {
                    A002.A0F(false);
                }
            } else if (i2 == 1 && A002.A0U) {
                A002.A0B(AnonymousClass2DT.A0x, true, false);
            }
        }
    }
}
