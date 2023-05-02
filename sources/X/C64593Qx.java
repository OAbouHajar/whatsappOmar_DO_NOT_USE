package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Qx  reason: invalid class name and case insensitive filesystem */
public final class C64593Qx extends AnonymousClass01X {
    public C109305Rn A00;
    public List A01 = AnonymousClass000.A0u();

    public C64593Qx(C109305Rn r2, List list) {
        this.A00 = r2;
        this.A01 = list;
    }

    public static Object A00(C15220qW r0) {
        Object value = r0.getValue();
        C18450wi.A0B(value);
        return value;
    }

    public int A0C() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r9, int i2) {
        ImageView imageView;
        Context context;
        int i3;
        AnonymousClass3SX r92 = (AnonymousClass3SX) r9;
        C18450wi.A0H(r92, 0);
        AnonymousClass2KI r6 = (AnonymousClass2KI) this.A01.get(i2);
        C109305Rn r5 = this.A00;
        C18450wi.A0H(r6, 0);
        C15220qW r4 = r92.A03;
        ((View) A00(r4)).setVisibility(0);
        int i4 = r6.A01;
        if (i4 != 1) {
            if (i4 == 2) {
                C15220qW r7 = r92.A04;
                View view = r92.A0H;
                C13700nu.A0L(view.getContext(), (ImageView) A00(r7), R.drawable.ic_alert);
                imageView = (ImageView) A00(r7);
                context = view.getContext();
                i3 = R.color.color0034;
            } else if (i4 == 3) {
                C15220qW r72 = r92.A04;
                View view2 = r92.A0H;
                C13700nu.A0L(view2.getContext(), (ImageView) A00(r72), R.drawable.ic_card);
                imageView = (ImageView) A00(r72);
                context = view2.getContext();
                i3 = R.color.color0035;
            }
            C018808t.A00(ColorStateList.valueOf(AnonymousClass00T.A00(context, i3)), imageView);
        } else {
            C15220qW r73 = r92.A04;
            View view3 = r92.A0H;
            C13700nu.A0L(view3.getContext(), (ImageView) A00(r73), R.drawable.ic_alert_round);
            C018808t.A00(ColorStateList.valueOf(AnonymousClass00T.A00(view3.getContext(), R.color.f141top)), (ImageView) A00(r73));
            ((View) A00(r4)).setVisibility(8);
        }
        ((TextView) A00(r92.A05)).setText(r6.A08);
        ((TextView) A00(r92.A02)).setText(r6.A05);
        TextView textView = (TextView) A00(r92.A01);
        textView.setText(r6.A04);
        C13680ns.A1C(textView, r5, r6, 27);
        if (((View) A00(r4)).getVisibility() == 0) {
            TextView textView2 = (TextView) A00(r4);
            textView2.setText(textView2.getResources().getString(R.string.str1bce));
            C13680ns.A1C(textView2, r5, r6, 26);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        View inflate = C13680ns.A0G(viewGroup).inflate(R.layout.layout006a, viewGroup, false);
        C18450wi.A0B(inflate);
        return new AnonymousClass3SX(inflate);
    }
}
