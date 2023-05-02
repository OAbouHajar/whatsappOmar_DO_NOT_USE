package X;

import android.graphics.drawable.GradientDrawable;
import com.obwhatsapp.R;

/* renamed from: X.4mW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95364mW implements C12430kO {
    public final /* synthetic */ AnonymousClass2DL A00;

    public /* synthetic */ C95364mW(AnonymousClass2DL r1) {
        this.A00 = r1;
    }

    public final void ARh(AnonymousClass0UB r6) {
        AnonymousClass2DL r4 = this.A00;
        ((C49662Uu) r4.findViewById(R.id.content)).setColor(AnonymousClass00T.A00(r4, R.color.color064b));
        AnonymousClass00T.A00(r4, R.color.color064b);
        r4.findViewById(R.id.bottom_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        r4.findViewById(R.id.top_shade).setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{855638016, 0}));
    }
}
