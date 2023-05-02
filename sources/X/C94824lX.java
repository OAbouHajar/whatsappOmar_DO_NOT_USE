package X;

import android.widget.SeekBar;

/* renamed from: X.4lX  reason: invalid class name and case insensitive filesystem */
public class C94824lX implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ AnonymousClass1ZK A00;

    public C94824lX(AnonymousClass1ZK r1) {
        this.A00 = r1;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        AnonymousClass1ZK.A01(this.A00, i2, z2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        AnonymousClass1ZK r5 = this.A00;
        r5.A1K.A02++;
        if (r5.A0N != null) {
            r5.A0a.removeCallbacks(r5.A1S);
            r5.A08 = -1;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        AnonymousClass1ZK.A00(this.A00);
    }
}
