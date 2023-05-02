package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.335  reason: invalid class name */
public class AnonymousClass335 extends AnonymousClass2X5 {
    public static final int[] A01 = {R.drawable.ic_emoji_people, R.drawable.ic_emoji_nature, R.drawable.ic_emoji_food, R.drawable.ic_emoji_activity, R.drawable.ic_emoji_travel, R.drawable.ic_emoji_objects, R.drawable.ic_emoji_symbols, R.drawable.ic_emoji_flags};
    public static final int[] A02 = {R.string.str077e, R.string.str077c, R.string.str077b, R.string.str0779, R.string.str0780, R.string.str077d, R.string.str077f, R.string.str077a};
    public final AnonymousClass3RM A00;

    public AnonymousClass335(RecyclerView recyclerView, AnonymousClass4EX r6, ShapePickerRecyclerView shapePickerRecyclerView) {
        super(recyclerView, r6, shapePickerRecyclerView, false);
        Resources A0D = C13680ns.A0D(recyclerView);
        AnonymousClass3RM r0 = new AnonymousClass3RM(A0D.getDimensionPixelSize(R.dimen.dimen071b), A0D.getDimensionPixelSize(R.dimen.dimen0719), A0D.getDimensionPixelSize(R.dimen.dimen071a));
        this.A00 = r0;
        recyclerView.A0m(r0);
    }

    public void A02(AnonymousClass3S8 r8, boolean z2) {
        super.A02(r8, z2);
        ImageView imageView = r8.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        RecyclerView recyclerView = this.A06;
        Resources A0D = C13680ns.A0D(recyclerView);
        int i2 = R.dimen.dimen0739;
        if (z2) {
            i2 = R.dimen.dimen0738;
        }
        int dimensionPixelSize = A0D.getDimensionPixelSize(i2);
        float f2 = (float) dimensionPixelSize;
        float dimensionPixelSize2 = (float) C13680ns.A0D(recyclerView).getDimensionPixelSize(R.dimen.dimen0718);
        float f3 = 1.0f;
        if (z2) {
            f3 = 0.9f;
        }
        int i3 = ((int) (f2 - (dimensionPixelSize2 * f3))) >> 1;
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        View view = r8.A0H;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = z2 ? C13680ns.A0D(recyclerView).getDimensionPixelOffset(R.dimen.dimen0719) : -2;
        view.setLayoutParams(layoutParams2);
        this.A00.A00 = z2;
    }
}
