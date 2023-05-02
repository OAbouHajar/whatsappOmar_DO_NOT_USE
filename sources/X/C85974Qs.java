package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.penmode.PenModeView;

/* renamed from: X.4Qs  reason: invalid class name and case insensitive filesystem */
public class C85974Qs {
    public final /* synthetic */ C49102Rb A00;
    public final /* synthetic */ C53742gD A01;

    public C85974Qs(C49102Rb r1, C53742gD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(int i2) {
        PenModeView penModeView = this.A01.A0A;
        for (View background : penModeView.A01) {
            background.setBackground((Drawable) null);
        }
        int i3 = R.id.pen_mode_thin;
        if (i2 != 1) {
            i3 = R.id.pen_mode_medium;
            if (i2 != 2) {
                i3 = R.id.pen_mode_thick;
                if (i2 != 3) {
                    if (i2 == 4) {
                        i3 = R.id.pen_mode_blur;
                    } else {
                        return;
                    }
                }
            }
        }
        C004601z.A0E(penModeView, i3).setBackgroundResource(R.drawable.pen_mode_selected_background);
    }
}
