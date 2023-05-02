package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxTRendererShape199S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape1S1400000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.List;

/* renamed from: X.31Q  reason: invalid class name */
public class AnonymousClass31Q extends AnonymousClass4PV {
    public WaImageView A00;
    public final Resources A01;
    public final C14870pt A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final AnonymousClass013 A05;
    public final C221116r A06;
    public final C218315p A07;
    public final AnonymousClass25V A08 = new IDxTRendererShape199S0100000_2_I1(this, 5);
    public final C25791Ld A09;
    public final C16320sq A0A;

    public AnonymousClass31Q(C14870pt r3, C16000sG r4, C16080sP r5, C16980tz r6, AnonymousClass013 r7, C221116r r8, C218315p r9, C25791Ld r10, C16320sq r11) {
        this.A02 = r3;
        this.A0A = r11;
        this.A01 = C16980tz.A00(r6);
        this.A07 = r9;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r7;
        this.A09 = r10;
        this.A06 = r8;
    }

    public void A00(FrameLayout frameLayout, C30011bb r17, C16740tZ r18, C16880tn r19) {
        String quantityString;
        WaImageView waImageView;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.removeAllViews();
        C16880tn r4 = r19;
        if (!"payment_method".equals(r4.A00()) && !"payment_status".equals(r4.A00())) {
            Context context = frameLayout2.getContext();
            C70603hL r11 = new C70603hL(context);
            frameLayout2.addView(r11);
            C35251lc r3 = r4.A01;
            AnonymousClass00B.A06(r3);
            r11.A05.setText(C13680ns.A0d(context, r3.A09, new Object[1], 0, R.string.str0456));
            C30011bb r12 = r17;
            r11.A02.setText(r12.A0r(r3.A03(this.A05)));
            boolean equals = "review_order".equals(r4.A00());
            View view = r11.A01;
            C16740tZ r5 = r18;
            if (equals) {
                view.setVisibility(8);
                r11.A00.setVisibility(0);
                C15830rv r1 = r5.A11.A00;
                AnonymousClass00B.A06(r1);
                String A082 = this.A04.A08(this.A03.A0A(r1));
                AnonymousClass00B.A06(A082);
                SpannableString spannableString = new SpannableString(C13680ns.A0d(context, A082, new Object[1], 0, R.string.str1119));
                spannableString.setSpan(new StyleSpan(1), spannableString.toString().indexOf(A082), spannableString.length(), 33);
                r11.A04.setText(r12.A0r(spannableString));
                this.A0A.Acl(new RunnableRunnableShape1S1400000_I1(this, context, r11, r12, r3.A03, 1));
                C28411Vz r0 = r3.A04;
                if (r0 == null) {
                    waImageView = r11.A08;
                } else {
                    C13700nu.A0L(context, r11.A08, C218315p.A00(r0));
                    return;
                }
            } else {
                view.setVisibility(0);
                r11.A00.setVisibility(8);
                r11.A07.setText(r12.A0r(r3.A0A));
                List list = r3.A05.A08;
                AnonymousClass00B.A06(list);
                if (list.size() == 1) {
                    Context context2 = frameLayout2.getContext();
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, ((C93554jO) list.get(0)).A00, 0);
                    quantityString = context2.getString(R.string.str0457, objArr);
                } else {
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        i2 += ((C93554jO) list.get(i3)).A00;
                    }
                    Resources A0D = C13680ns.A0D(frameLayout2);
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1M(objArr2, i2, 0);
                    quantityString = A0D.getQuantityString(R.plurals.plurals00f0, i2, objArr2);
                }
                r11.A03.setText(r12.A0r(quantityString));
                this.A00 = r11.A09;
                C16870tm A0F = r5.A0F();
                if (A0F == null || !A0F.A05()) {
                    waImageView = this.A00;
                } else {
                    this.A09.A07(this.A00, r5, this.A08);
                    return;
                }
            }
            waImageView.setVisibility(8);
        }
    }
}
