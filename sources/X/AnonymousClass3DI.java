package X;

import android.widget.SeekBar;
import com.obwhatsapp.R;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.3DI  reason: invalid class name */
public class AnonymousClass3DI implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaViewFragment A00;

    public AnonymousClass3DI(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
        if (seekBar != null) {
            MediaViewFragment mediaViewFragment = this.A00;
            mediaViewFragment.A1d.setContentDescription(mediaViewFragment.A0K(R.string.str1a50, AnonymousClass000.A1a(C28961Zl.A06(mediaViewFragment.A0l, (long) seekBar.getProgress()))));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        C30211bx r0 = mediaViewFragment.A1W;
        if (r0 != null && r0.A0D()) {
            mediaViewFragment.A1W.A04();
        }
        mediaViewFragment.A06.removeMessages(0);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        C30211bx r5 = mediaViewFragment.A1W;
        if (r5 == null) {
            mediaViewFragment.A1d.setProgress(0);
        } else if (mediaViewFragment.A01 == 1) {
            try {
                r5.A0A((int) (((float) r5.A03()) * (((float) mediaViewFragment.A1d.getProgress()) / ((float) mediaViewFragment.A1d.getMax()))));
                mediaViewFragment.A1W.A08();
                mediaViewFragment.A06.sendEmptyMessage(0);
                mediaViewFragment.A1W();
            } catch (IOException e2) {
                Log.e("mediaview/fail onStopTracking", e2);
                ((C14550pN) mediaViewFragment.A0D()).Afg(R.string.str0925);
            }
        } else {
            int A03 = (int) (((float) r5.A03()) * (((float) mediaViewFragment.A1d.getProgress()) / ((float) mediaViewFragment.A1d.getMax())));
            C16730tY A1U = mediaViewFragment.A1U(mediaViewFragment.A03);
            if (A1U != null) {
                mediaViewFragment.A1b(A1U, A03, false);
            }
        }
    }
}
