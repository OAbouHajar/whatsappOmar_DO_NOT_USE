package X;

import android.view.View;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;

/* renamed from: X.3yD  reason: invalid class name and case insensitive filesystem */
public class C78523yD extends C41651wK {
    public Runnable A00;
    public final View A01;
    public final View A02;
    public final AnonymousClass2X3 A03;

    public C78523yD(View view, View view2, AnonymousClass2X3 r3) {
        this.A02 = view;
        this.A01 = view2;
        this.A03 = r3;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.removeCallbacks(runnable);
        }
        RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_2 = new RunnableRunnableShape14S0200000_I1_2(this, 32, charSequence);
        this.A00 = runnableRunnableShape14S0200000_I1_2;
        this.A02.postDelayed(runnableRunnableShape14S0200000_I1_2, 500);
    }
}
