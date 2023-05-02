package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3kw  reason: invalid class name and case insensitive filesystem */
public final class C71723kw extends C65023So {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass013 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71723kw(View view, AnonymousClass013 r3) {
        super(view);
        C18450wi.A0J(view, r3);
        this.A00 = view;
        this.A05 = r3;
        this.A02 = (ImageView) C18450wi.A00(view, R.id.category_icon);
        this.A04 = (TextView) C18450wi.A00(view, R.id.category_name);
        this.A03 = (TextView) C18450wi.A00(view, R.id.biz_number);
        this.A01 = (ImageView) C18450wi.A00(view, R.id.chevron_category_row);
    }
}
