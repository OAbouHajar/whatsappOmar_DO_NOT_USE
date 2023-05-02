package X;

import android.view.animation.Animation;
import android.widget.ListView;
import com.obwhatsapp.KeyboardPopupLayout;

/* renamed from: X.3gU  reason: invalid class name and case insensitive filesystem */
public class C70333gU extends C30551cZ {
    public final int A00;
    public final ListView A01;
    public final KeyboardPopupLayout A02;

    public C70333gU(ListView listView, KeyboardPopupLayout keyboardPopupLayout, int i2) {
        this.A02 = keyboardPopupLayout;
        this.A01 = listView;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animation animation) {
        this.A02.setClipChildren(true);
        this.A01.setTranscriptMode(this.A00);
    }
}
