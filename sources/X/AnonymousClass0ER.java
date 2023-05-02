package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0ER  reason: invalid class name */
public class AnonymousClass0ER extends AnonymousClass0ES {
    public static final AnonymousClass030 A00 = AnonymousClass030.A02(WindowInsets.CONSUMED);

    public AnonymousClass0ER(AnonymousClass030 r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }

    public static int A00(int i2) {
        int statusBars;
        int i3 = 0;
        int i4 = 1;
        do {
            if ((i2 & i4) != 0) {
                if (i4 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i4 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i4 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i4 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i4 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i4 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i4 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i4 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i3 |= statusBars;
            }
            i4 <<= 1;
        } while (i4 <= 256);
        return i3;
    }

    public C06510Wk A0B(int i2) {
        return C06510Wk.A01(this.A03.getInsets(A00(7)));
    }

    public C06510Wk A0C(int i2) {
        return C06510Wk.A01(this.A03.getInsetsIgnoringVisibility(A00(i2)));
    }

    public final void A0E(View view) {
    }
}
