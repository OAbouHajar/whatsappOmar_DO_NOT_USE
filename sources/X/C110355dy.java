package X;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5dy  reason: invalid class name and case insensitive filesystem */
public class C110355dy extends FrameLayout implements AnonymousClass006 {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public C52662eE A04;
    public boolean A05;

    public C110355dy(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.layout0433, this, true);
        setBottomDividerSpaceVisibility(0);
        this.A02 = C13680ns.A0M(this, R.id.card_name);
        this.A03 = C13680ns.A0M(this, R.id.card_number);
        this.A01 = C13680ns.A0K(this, R.id.card_network_icon);
        this.A00 = C13680ns.A0K(this, R.id.card_view_background);
        this.A00.setImageDrawable(new C110185de(context));
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00.setClipToOutline(true);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(((int) (((float) (View.MeasureSpec.getSize(i2) - (getPaddingLeft() + getPaddingRight()))) * 0.62f)) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }

    public void setBottomDividerSpaceVisibility(int i2) {
        float f2 = 0.0f;
        if (i2 == 0) {
            f2 = 24.0f;
        }
        setPadding(C87594Xo.A00(getContext(), 24.0f), 0, C87594Xo.A00(getContext(), 24.0f), C87594Xo.A00(getContext(), f2));
    }

    public void setCard(C35391lr r8) {
        TextView textView = this.A02;
        Context context = getContext();
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = C35391lr.A07(r8.A01);
        textView.setText(C13680ns.A0d(context, C30671cl.A02(r8.A00), A1Z, 1, R.string.str1cc5));
        this.A03.setText(C13680ns.A0d(getContext(), C110105dW.A0d(r8.A09), new Object[1], 0, R.string.str1cc6));
        this.A01.setImageResource(r8.A01 == 0 ? R.drawable.card_default : C119405xi.A00(r8));
    }

    public void setCardNameTextViewVisibility(int i2) {
        this.A02.setVisibility(i2);
    }

    public void setCardNetworkIconVisibility(int i2) {
        this.A01.setVisibility(i2);
    }

    public void setCardNumberTextColor(int i2) {
        TextView textView = this.A03;
    }
}
