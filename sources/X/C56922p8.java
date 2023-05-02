package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.checkbox.RtlCheckBox;
import java.util.List;

/* renamed from: X.2p8  reason: invalid class name and case insensitive filesystem */
public class C56922p8 extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C56922p8(Context context, Integer num, String str, String str2, List list) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.layout022b, this);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen02ea);
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.dimen02eb), dimensionPixelSize, 0);
        View A0E = C004601z.A0E(this, R.id.image);
        TextView A0L = C13680ns.A0L(this, R.id.title);
        TextView A0L2 = C13680ns.A0L(this, R.id.subtitle);
        A0E.setVisibility(8);
        C13690nt.A1D(A0L, str);
        C13690nt.A1D(A0L2, str2);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen02e9);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dimen02e8);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C83704Hs r4 = (C83704Hs) list.get(i2);
            int i3 = dimensionPixelSize3;
            if (i2 == 0) {
                i3 = dimensionPixelSize2;
            }
            RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), (AttributeSet) null);
            rtlCheckBox.setTextSize(2, 16.0f);
            C13680ns.A0v(getContext(), rtlCheckBox, R.color.color06c5);
            addView(rtlCheckBox);
            AnonymousClass000.A0O(rtlCheckBox).topMargin = i3;
            rtlCheckBox.setText(r4.A01);
            rtlCheckBox.setChecked(false);
            rtlCheckBox.setOnClickListener(new ViewOnClickCListenerShape6S0200000_I1_1(r4, 24, rtlCheckBox));
        }
        if (num != null) {
            float f2 = C13690nt.A0H(this).density;
            View view = new View(getContext());
            view.setLayoutParams(new AbsListView.LayoutParams(-1, (int) ((((float) num.intValue()) * f2) + 0.5f)));
            addView(view);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
