package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3H8  reason: invalid class name */
public class AnonymousClass3H8 implements AnonymousClass5Si {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public final AnonymousClass013 A03;
    public final C14710pd A04;
    public final C209712h A05;
    public final C85604Pc A06;

    public AnonymousClass3H8(AnonymousClass013 r1, C14710pd r2, C209712h r3, C85604Pc r4) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
    }

    public /* bridge */ /* synthetic */ void A5O(Object obj) {
        ImageView imageView;
        C35361lo A012;
        AnonymousClass1Vt r11 = (AnonymousClass1Vt) obj;
        this.A02.setVisibility(8);
        if (r11 != null && r11.A08 != null) {
            TextView textView = this.A02;
            textView.setText(C218315p.A04(textView.getContext(), this.A03, r11.A00(), r11.A08, true));
            this.A02.setVisibility(0);
            TextView textView2 = this.A02;
            C13690nt.A0w(textView2.getResources(), textView2, R.color.color05f5);
            this.A02.setAlpha(1.0f);
            boolean A002 = this.A06.A00(r11);
            TextView textView3 = this.A02;
            if (A002) {
                AnonymousClass47D.A00(textView3);
            } else {
                textView3.setPaintFlags(textView3.getPaintFlags() & -17);
            }
            C14710pd r3 = this.A04;
            C16620tM r1 = C16620tM.A02;
            if ((r3.A0E(r1, 605) || r3.A0E(r1, 629)) && (A012 = r11.A01()) != null) {
                this.A00.setImageDrawable((Drawable) null);
                TextView textView4 = this.A02;
                int i2 = A012.A0C;
                if (A002) {
                    this.A02.setAlpha(0.54f);
                }
                this.A00.setBackgroundColor(A012.A0A);
                ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
                layoutParams.height = (int) (((float) layoutParams.width) / (((float) A012.A0D) / ((float) A012.A09)));
                this.A00.requestLayout();
                String str = A012.A01;
                if (!TextUtils.isEmpty(str)) {
                    this.A00.setContentDescription(str);
                }
                this.A05.A01(this.A00, A012, layoutParams.width, layoutParams.height, false);
                this.A00.setVisibility(0);
                imageView = this.A01;
            } else {
                this.A01.setVisibility(0);
                imageView = this.A00;
            }
            imageView.setVisibility(8);
        }
    }

    public int AD5() {
        return R.layout.layout01b7;
    }

    public void AZf(View view) {
        this.A02 = C13680ns.A0L(view, R.id.amount_container);
        this.A01 = C13680ns.A0J(view, R.id.conversation_row_payment_pattern);
        this.A00 = C13680ns.A0J(view, R.id.conversation_row_expressive_payment_background);
    }
}
