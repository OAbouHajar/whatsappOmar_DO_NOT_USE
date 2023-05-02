package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.4NH  reason: invalid class name */
public class AnonymousClass4NH {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final ImageView A04;

    public AnonymousClass4NH(Context context, ViewGroup viewGroup) {
        this.A03 = viewGroup;
        this.A00 = context;
        this.A01 = C004601z.A0E(viewGroup, R.id.sticker_onboarding_badge);
        this.A02 = C004601z.A0E(viewGroup, R.id.sticker_tab);
        this.A04 = C13680ns.A0J(viewGroup, R.id.sticker_tab_icon);
    }
}
