package X;

import android.media.AudioManager;

/* renamed from: X.1Az  reason: invalid class name and case insensitive filesystem */
public class C23231Az {
    public long A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public final C14870pt A02;
    public final AnonymousClass01V A03;

    public C23231Az(C14870pt r1, AnonymousClass01V r2) {
        this.A02 = r1;
        this.A03 = r2;
    }

    public void A00() {
        AudioManager A0G = this.A03.A0G();
        if (A0G != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass2e3();
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public void A01() {
        AudioManager A0G = this.A03.A0G();
        if (A0G != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass2e3();
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public final boolean A02(int i2) {
        AudioManager A0G = this.A03.A0G();
        if (A0G == null || A0G.getStreamVolume(3) != 0) {
            return true;
        }
        if (System.currentTimeMillis() - this.A00 <= 2000) {
            return false;
        }
        this.A00 = System.currentTimeMillis();
        this.A02.A09(i2, 0);
        return false;
    }
}
