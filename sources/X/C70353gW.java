package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ListView;
import com.obwhatsapp.KeyboardPopupLayout;
import com.whatsapp.util.Log;

/* renamed from: X.3gW  reason: invalid class name and case insensitive filesystem */
public class C70353gW extends C30551cZ {
    public final int A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final ListView A03;
    public final KeyboardPopupLayout A04;

    public C70353gW(ViewGroup viewGroup, ViewGroup viewGroup2, ListView listView, KeyboardPopupLayout keyboardPopupLayout, int i2) {
        this.A01 = viewGroup;
        this.A04 = keyboardPopupLayout;
        this.A03 = listView;
        this.A02 = viewGroup2;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        this.A01.setVisibility(8);
        ViewGroup viewGroup = this.A02;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C94324kj(viewGroup));
        this.A04.setClipChildren(true);
        this.A03.setTranscriptMode(this.A00);
    }
}
