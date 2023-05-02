package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;

/* renamed from: X.1bp  reason: invalid class name and case insensitive filesystem */
public class C30151bp extends AnonymousClass01X {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final C26051Md A08;
    public final C30141bo A09;

    public C30151bp(Context context, C26051Md r5, C30141bo r6) {
        this.A06 = context;
        this.A08 = r5;
        this.A09 = r6;
        this.A04 = context.getResources().getDimension(R.dimen.dimen03c8) / ((float) r6.A0I);
        this.A05 = context.getResources().getDimension(R.dimen.dimen03c9) / ((float) r6.A0J);
        this.A07 = new ColorDrawable(AnonymousClass00T.A00(context, R.color.color00ef));
        int size = AnonymousClass3B5.A00.size() - 1;
        this.A01 = new Bitmap[size];
        this.A03 = new boolean[size];
        this.A02 = new boolean[size];
        A0E(0);
    }

    public int A0C() {
        return AnonymousClass3B5.A00.size();
    }

    public void A0E(int i2) {
        this.A00 = true;
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i3 < zArr.length) {
                if (!zArr[i3]) {
                    A02(i3);
                }
                i3++;
            } else {
                this.A08.A0E(new C455629h(this), i2);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r27, int i2) {
        float f2;
        AnonymousClass36Z r16;
        AnonymousClass3T2 r10 = (AnonymousClass3T2) r27;
        C30141bo r9 = this.A09;
        boolean z2 = false;
        int i3 = i2;
        if (i3 == r9.A01) {
            z2 = true;
        }
        boolean booleanValue = Boolean.valueOf(z2).booleanValue();
        float f3 = 1.0f;
        if (booleanValue) {
            f2 = this.A05;
            f3 = this.A04;
        } else {
            f2 = 1.0f;
        }
        r10.A04.A04(booleanValue, false);
        View view = r10.A00;
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setPivotX(((float) r9.A0J) / 2.0f);
        view.setPivotY((float) r9.A0I);
        Context context = this.A06;
        String string = context.getString(AnonymousClass3B5.A00(i3).A01);
        TextView textView = r10.A03;
        textView.setText(string);
        ImageView imageView = r10.A02;
        imageView.setBackground(this.A07);
        imageView.setImageDrawable((Drawable) null);
        View view2 = r10.A01;
        view2.setOnClickListener(r10);
        if (r9.A02 != null) {
            if (i2 == 0) {
                r16 = new AnonymousClass36Z(context, this.A08, r9, r10, this, this.A01, this.A03, this.A02, 0);
            } else {
                boolean[] zArr = this.A02;
                if (zArr[i2 - 1]) {
                    r16 = new AnonymousClass36Z(context, this.A08, r9, r10, this, this.A01, this.A03, zArr, i3);
                } else if (this.A00) {
                    textView.setText(R.string.str08e9);
                    imageView.setBackgroundColor(AnonymousClass00T.A00(context, R.color.color0444));
                    view2.setOnClickListener((View.OnClickListener) null);
                    imageView.setClickable(false);
                    return;
                } else {
                    textView.setText(R.string.str08e8);
                    imageView.setClickable(true);
                    view2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 8));
                    return;
                }
            }
            r16.A02.executeOnExecutor(r9.A0W, new Void[0]);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3T2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0288, viewGroup, false), this);
    }
}
