package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.4KZ  reason: invalid class name */
public class AnonymousClass4KZ {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public AnonymousClass4KZ(ViewGroup viewGroup) {
        ImageView A0J = C13680ns.A0J(viewGroup, R.id.emoji_tab);
        this.A02 = A0J;
        this.A00 = C004601z.A0E(viewGroup, R.id.emoji_group_layout);
        this.A01 = C004601z.A0E(viewGroup, R.id.pager);
        A0J.setVisibility(0);
    }
}
