package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.2z1  reason: invalid class name and case insensitive filesystem */
public class C59782z1 extends C72823ml {
    public final WaImageView A00;
    public final WaTextView A01;

    public C59782z1(View view) {
        super(view);
        this.A00 = C13690nt.A0R(view, R.id.location_icon);
        this.A01 = C13680ns.A0S(view, R.id.search_location_address);
    }

    public /* bridge */ /* synthetic */ void A08(Object obj) {
        C72063lV r7 = (C72063lV) obj;
        AnonymousClass26B r5 = r7.A00;
        String str = r5.A07;
        if (TextUtils.isEmpty(str)) {
            str = this.A0H.getContext().getString(R.string.str0209);
        } else if (!r5.A02()) {
            str = C13680ns.A0d(this.A0H.getContext(), str, C13680ns.A1b(), 0, R.string.str0221);
        }
        this.A01.setText(str);
        WaImageView waImageView = this.A00;
        View view = this.A0H;
        Context context = view.getContext();
        boolean equals = "device".equals(r5.A08);
        int i2 = R.drawable.business_directory_ic_location;
        if (equals) {
            i2 = R.drawable.ic_location_nearby;
        }
        C13700nu.A0L(context, waImageView, i2);
        view.setOnClickListener(r7.A01);
    }
}
