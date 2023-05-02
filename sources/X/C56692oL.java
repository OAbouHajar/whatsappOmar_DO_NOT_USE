package X;

import android.widget.BaseAdapter;
import com.obwhatsapp.profile.WebImagePicker;

/* renamed from: X.2oL  reason: invalid class name and case insensitive filesystem */
public class C56692oL extends BaseAdapter {
    public AnonymousClass35t A00;
    public boolean A01;
    public final /* synthetic */ WebImagePicker A02;

    public C56692oL(WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
    }

    public int getCount() {
        WebImagePicker webImagePicker = this.A02;
        int size = webImagePicker.A0J.size();
        int i2 = webImagePicker.A00;
        return ((size + i2) - 1) / i2;
    }

    public Object getItem(int i2) {
        return null;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 != r2.A00) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r3 = r20
            r9 = 0
            r4 = r18
            if (r20 == 0) goto L_0x0013
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
            com.obwhatsapp.profile.WebImagePicker r2 = r4.A02
            int r0 = r2.A00
            if (r1 == r0) goto L_0x003e
        L_0x0013:
            com.obwhatsapp.profile.WebImagePicker r2 = r4.A02
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r2)
            android.content.res.Resources r0 = X.C13680ns.A0D(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1076538027(0x402aaaab, float:2.6666667)
            float r1 = r1 * r0
            int r5 = (int) r1
            android.content.res.Resources r0 = X.C13680ns.A0D(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setPadding(r5, r0, r9, r0)
            r3.setClickable(r9)
        L_0x003e:
            int r8 = r3.getChildCount()
            int r7 = r2.A00
            r5 = r19
            int r7 = r7 * r19
            r6 = 0
        L_0x0049:
            int r0 = r19 + 1
            int r10 = r2.A00
            int r0 = r0 * r10
            if (r7 >= r0) goto L_0x0101
            java.util.ArrayList r1 = r2.A0J
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x00f2
            java.lang.Object r11 = r1.get(r7)
            X.4V7 r11 = (X.AnonymousClass4V7) r11
            if (r8 > r6) goto L_0x00e8
            android.widget.ImageView r15 = new android.widget.ImageView
            r15.<init>(r2)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r15.setScaleType(r0)
            int r0 = r2.A01
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r0, r0)
            r15.setLayoutParams(r10)
            android.content.res.Resources r0 = X.C13680ns.A0D(r15)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1079334229(0x40555555, float:3.3333333)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10.rightMargin = r0
            r0 = 2131232418(0x7f0806a2, float:1.8080945E38)
            r15.setBackgroundResource(r0)
            android.content.res.Resources r0 = X.C13680ns.A0D(r15)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r15.setPadding(r0, r0, r0, r0)
            android.view.View$OnClickListener r0 = r2.A03
            r15.setOnClickListener(r0)
            r3.addView(r15)
        L_0x00a5:
            java.lang.String r0 = r11.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00e5
            r0 = 2131887584(0x7f1205e0, float:1.940978E38)
            java.lang.String r0 = r2.getString(r0)
        L_0x00b4:
            r15.setContentDescription(r0)
            r1 = 2131367107(0x7f0a14c3, float:1.8354126E38)
            java.lang.String r0 = r11.A07
            r15.setTag(r1, r0)
            X.1qk r12 = r2.A0E
            java.lang.String r10 = r11.A07
            int r1 = r11.A00
            if (r1 != 0) goto L_0x00e1
            r0 = 2131100123(0x7f0601db, float:1.7812619E38)
            int r1 = X.AnonymousClass00T.A00(r2, r0)
        L_0x00ce:
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r1)
            r14 = 0
            r16 = r14
            r17 = r10
            r12.A00(r13, r14, r15, r16, r17)
            int r6 = r6 + 1
        L_0x00dd:
            int r7 = r7 + 1
            goto L_0x0049
        L_0x00e1:
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r1 = r1 | r0
            goto L_0x00ce
        L_0x00e5:
            java.lang.String r0 = r11.A04
            goto L_0x00b4
        L_0x00e8:
            android.view.View r15 = r3.getChildAt(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r15.setVisibility(r9)
            goto L_0x00a5
        L_0x00f2:
            int r10 = r10 * r19
            int r0 = r7 - r10
            if (r8 <= r0) goto L_0x00dd
            android.view.View r1 = r3.getChildAt(r0)
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x00dd
        L_0x0101:
            X.35t r0 = r4.A00
            if (r0 != 0) goto L_0x0120
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0120
            java.util.ArrayList r0 = r2.A0J
            int r0 = r0.size()
            int r0 = r0 + -1
            int r0 = r0 / r10
            if (r5 != r0) goto L_0x0120
            X.35t r1 = new X.35t
            r1.<init>(r4)
            r4.A00 = r1
            X.0sq r0 = r2.A05
            X.C13700nu.A0W(r1, r0)
        L_0x0120:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56692oL.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
