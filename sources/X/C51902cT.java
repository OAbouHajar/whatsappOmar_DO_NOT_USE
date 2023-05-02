package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;

/* renamed from: X.2cT  reason: invalid class name and case insensitive filesystem */
public class C51902cT extends View {
    public final /* synthetic */ HomeActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51902cT(Context context, HomeActivity homeActivity) {
        super(context);
        this.A00 = homeActivity;
    }

    public void onMeasure(int i2, int i3) {
        getContext().getResources().getDimensionPixelSize(R.dimen.dimen07cb);
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
    }
}
