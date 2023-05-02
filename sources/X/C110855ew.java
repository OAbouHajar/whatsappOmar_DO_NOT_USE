package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.util.List;

/* renamed from: X.5ew  reason: invalid class name and case insensitive filesystem */
public class C110855ew extends AnonymousClass01X {
    public List A00 = AnonymousClass000.A0u();
    public final Drawable A01;
    public final boolean A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    public C110855ew(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, boolean z2) {
        this.A03 = indiaUpiBankPickerActivity;
        this.A02 = z2;
        this.A01 = indiaUpiBankPickerActivity.getResources().getDrawable(z2 ? R.drawable.bank_logo_placeholder_with_circle_bg_popular_bank : R.drawable.bank_logo_placeholder_with_circle_bg);
    }

    public int A0C() {
        return this.A00.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (getItemViewType(r13 + 1) == 1) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r12, int r13) {
        /*
            r11 = this;
            int r0 = r11.getItemViewType(r13)
            r3 = 1
            if (r0 != r3) goto L_0x0015
            X.5f5 r12 = (X.C110945f5) r12
            android.widget.TextView r1 = r12.A00
            java.util.List r0 = r11.A00
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r13)
            r1.setText(r0)
        L_0x0014:
            return
        L_0x0015:
            r2 = r12
            X.5f9 r2 = (X.C110985f9) r2
            java.util.List r0 = r11.A00
            java.lang.Object r4 = r0.get(r13)
            X.1tG r4 = (X.C39911tG) r4
            android.graphics.drawable.Drawable r6 = r11.A01
            java.lang.String r0 = r4.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0063
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r0 = r2.A03
            X.1qk r5 = r0.A0D
            java.lang.String r10 = r4.A03
            X.AnonymousClass00B.A06(r10)
            android.widget.ImageView r8 = r2.A01
            r9 = 0
            r7 = r6
            r5.A00(r6, r7, r8, r9, r10)
        L_0x003a:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r8 = r2.A03
            java.util.ArrayList r0 = r8.A0F
            if (r0 == 0) goto L_0x0047
            r7.addAll(r0)
        L_0x0047:
            java.lang.String r0 = r8.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0069
            r6 = 0
        L_0x0050:
            java.lang.String r5 = r8.A0E
            int r0 = r5.length()
            if (r6 >= r0) goto L_0x0069
            int r1 = r6 + 1
            java.lang.String r0 = r5.substring(r6, r1)
            r7.add(r0)
            r6 = r1
            goto L_0x0050
        L_0x0063:
            android.widget.ImageView r0 = r2.A01
            r0.setImageDrawable(r6)
            goto L_0x003a
        L_0x0069:
            com.obwhatsapp.TextEmojiLabel r1 = r2.A02
            java.lang.String r0 = r4.A0A()
            r1.A0I(r7, r0)
            android.view.View r1 = r12.A0H
            com.facebook.redex.IDxCListenerShape3S0201000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape3S0201000_3_I1
            r0.<init>(r12, r13, r11, r3)
            r1.setOnClickListener(r0)
            android.view.View r2 = r2.A00
            if (r2 == 0) goto L_0x0014
            java.util.List r0 = r11.A00
            int r0 = r0.size()
            int r0 = r0 - r3
            if (r13 == r0) goto L_0x0092
            int r0 = r13 + 1
            int r1 = r11.getItemViewType(r0)
            r0 = 0
            if (r1 != r3) goto L_0x0093
        L_0x0092:
            r0 = 4
        L_0x0093:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110855ew.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater A0G = C13680ns.A0G(viewGroup);
        if (i2 != 2) {
            return new C110945f5(A0G.inflate(R.layout.layout032c, viewGroup, false));
        }
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A03;
        boolean z2 = this.A02;
        int i3 = R.layout.layout032d;
        if (z2) {
            i3 = R.layout.layout032a;
        }
        return new C110985f9(A0G.inflate(i3, viewGroup, false), indiaUpiBankPickerActivity);
    }

    public int getItemViewType(int i2) {
        return this.A00.get(i2) instanceof String ? 1 : 2;
    }
}
