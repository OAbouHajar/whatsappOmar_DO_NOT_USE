package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.2VB  reason: invalid class name */
public final class AnonymousClass2VB extends AnonymousClass071 {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public final /* synthetic */ AnonymousClass2Ur A03;

    public AnonymousClass2VB(Context context, AnonymousClass2Ur r4) {
        this.A03 = r4;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen072c);
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        int i4 = this.A01 + i3;
        this.A01 = i4;
        this.A03.A08.setAlpha(Math.min(1.0f, ((float) i4) / ((float) this.A00)));
    }

    public void A01(RecyclerView recyclerView, int i2) {
        AnonymousClass2Ut r0;
        int i3 = this.A02;
        if (!(i3 != 0 || i2 == i3 || (r0 = this.A03.A0N) == null)) {
            r0.A0A.clearFocus();
        }
        this.A02 = i2;
    }
}
