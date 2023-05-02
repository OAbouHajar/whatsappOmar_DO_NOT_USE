package X;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: X.0Yj  reason: invalid class name and case insensitive filesystem */
public class C06910Yj implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference A00;

    public C06910Yj(SeekBarPreference seekBarPreference) {
        this.A00 = seekBarPreference;
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.A00;
            if (!((!seekBarPreference.A08 && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66)) {
                SeekBar seekBar = seekBarPreference.A06;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i2, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
