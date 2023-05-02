package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.whatsapp.util.Log;

/* renamed from: X.3gV  reason: invalid class name and case insensitive filesystem */
public class C70343gV extends C30551cZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C42821yj A03;
    public final /* synthetic */ boolean A04;

    public C70343gV(View view, ViewGroup viewGroup, C42821yj r3, int i2, boolean z2) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A04 = z2;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animation animation) {
        Log.i("conversation/hideinputextension/end");
        this.A02.setVisibility(8);
        C42821yj r3 = this.A03;
        r3.A08.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(this, 5));
        r3.A0z.setClipChildren(true);
        r3.A1n.setTranscriptMode(this.A00);
    }
}
