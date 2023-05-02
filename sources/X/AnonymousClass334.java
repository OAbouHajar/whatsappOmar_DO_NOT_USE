package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.334  reason: invalid class name */
public class AnonymousClass334 extends AnonymousClass2X5 {
    public long A00;
    public boolean A01;
    public final AnonymousClass1CX A02;
    public final List A03 = AnonymousClass000.A0u();
    public final Map A04;

    public AnonymousClass334(RecyclerView recyclerView, AnonymousClass4EX r4, ShapePickerRecyclerView shapePickerRecyclerView, AnonymousClass1CX r6) {
        super(recyclerView, r4, shapePickerRecyclerView, true);
        this.A02 = r6;
        this.A00 = 0;
        this.A04 = AnonymousClass000.A0x();
    }

    public void A02(AnonymousClass3S8 r6, boolean z2) {
        super.A02(r6, z2);
        View view = r6.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources A0D = C13680ns.A0D(recyclerView);
        int i2 = R.dimen.dimen0735;
        if (z2) {
            i2 = R.dimen.dimen0734;
        }
        layoutParams.width = A0D.getDimensionPixelSize(i2);
        view.setLayoutParams(layoutParams);
        ImageView imageView = r6.A01;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Resources A0D2 = C13680ns.A0D(recyclerView);
        int i3 = R.dimen.dimen0733;
        if (z2) {
            i3 = R.dimen.dimen0732;
        }
        int dimensionPixelSize = A0D2.getDimensionPixelSize(i3);
        layoutParams2.width = dimensionPixelSize;
        layoutParams2.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams2);
    }
}
