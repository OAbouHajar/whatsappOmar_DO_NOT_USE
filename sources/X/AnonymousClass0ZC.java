package X;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* renamed from: X.0ZC  reason: invalid class name */
public class AnonymousClass0ZC implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference A00;

    public AnonymousClass0ZC(SeekBarPreference seekBarPreference) {
        this.A00 = seekBarPreference;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (z2) {
            SeekBarPreference seekBarPreference = this.A00;
            if (seekBarPreference.A0B || !seekBarPreference.A0A) {
                seekBarPreference.A0T(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.A00;
        int i3 = i2 + seekBarPreference2.A01;
        TextView textView = seekBarPreference2.A07;
        if (textView != null) {
            textView.setText(String.valueOf(i3));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.A00.A0A = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.A00;
        seekBarPreference.A0A = false;
        if (seekBar.getProgress() + seekBarPreference.A01 != seekBarPreference.A03) {
            seekBarPreference.A0T(seekBar);
        }
    }
}
