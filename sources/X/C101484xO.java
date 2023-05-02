package X;

import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.voicerecorder.VoiceNoteSeekBar;

/* renamed from: X.4xO  reason: invalid class name and case insensitive filesystem */
public class C101484xO implements C52032cr {
    public final WaImageButton A00;
    public final C38701rH A01;
    public final VoiceNoteSeekBar A02;

    public C101484xO(WaImageButton waImageButton, C38701rH r2, VoiceNoteSeekBar voiceNoteSeekBar) {
        this.A01 = r2;
        this.A00 = waImageButton;
        this.A02 = voiceNoteSeekBar;
    }

    public C38701rH AC8() {
        return this.A01;
    }

    public void AQF(boolean z2) {
    }

    public void AUS(int i2) {
        AnonymousClass2DE.A06(this.A00);
    }

    public void AVL(int i2) {
        this.A02.setProgress(i2);
    }

    public void AWY() {
        AnonymousClass2DE.A05(this.A00);
    }

    public void AXQ(int i2) {
        AnonymousClass2DE.A05(this.A00);
        this.A02.setMax(i2);
    }

    public void AXw(int i2, boolean z2) {
        AnonymousClass2DE.A06(this.A00);
        if (z2) {
            this.A02.setProgress(0);
        }
    }
}
