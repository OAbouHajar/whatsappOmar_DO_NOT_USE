package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.5lj  reason: invalid class name and case insensitive filesystem */
public class C113245lj extends C111025fD {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final C50262Yq A05;
    public final AnonymousClass013 A06;
    public final C25791Ld A07;

    public C113245lj(View view, C50262Yq r3, AnonymousClass013 r4, C25791Ld r5) {
        super(view);
        this.A00 = C13690nt.A0R(view, R.id.item_thumbnail);
        this.A04 = C13680ns.A0S(view, R.id.item_title);
        this.A02 = C13680ns.A0S(view, R.id.item_quantity);
        this.A01 = C13680ns.A0S(view, R.id.item_price);
        this.A03 = C13680ns.A0S(view, R.id.item_sale_price);
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C116235r3 r20) {
        /*
            r19 = this;
            r0 = r20
            X.5lS r0 = (X.C113075lS) r0
            X.0tj r8 = r0.A02
            X.1lc r7 = X.C110115dX.A0W(r8)
            X.4jO r6 = r0.A01
            X.1mL r15 = r0.A00
            r5 = r19
            com.obwhatsapp.WaImageView r14 = r5.A00
            android.content.res.Resources r3 = X.C13680ns.A0D(r14)
            com.obwhatsapp.WaTextView r1 = r5.A04
            java.lang.String r0 = r6.A03
            r1.setText(r0)
            com.obwhatsapp.WaTextView r2 = r5.A02
            r1 = 2131889879(0x7f120ed7, float:1.9414434E38)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r13 = r6.A00
            boolean r9 = X.C13690nt.A1W(r0, r13)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.setText(r0)
            X.1lY r10 = r6.A02
            if (r10 != 0) goto L_0x0083
            com.obwhatsapp.WaTextView r10 = r5.A01
            X.1lY r11 = r6.A01
            if (r11 != 0) goto L_0x006f
            r0 = 0
        L_0x003d:
            r10.setText(r0)
            com.obwhatsapp.WaTextView r1 = r5.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x0047:
            java.lang.String r1 = r6.A00()
            java.lang.String r0 = "custom-item"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
            android.view.View r0 = r5.A0H
            android.content.Context r2 = r0.getContext()
            r1 = 2131231939(0x7f0804c3, float:1.8079973E38)
            r0 = 2131101092(0x7f0605a4, float:1.7814584E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r2, r1, r0)
            r14.setImageDrawable(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r14.setScaleX(r0)
            r14.setScaleY(r0)
            return
        L_0x006f:
            long r2 = r11.A01
            long r0 = (long) r13
            long r2 = r2 * r0
            int r9 = r11.A00
            java.lang.String r0 = r11.A02
            X.1lY r1 = new X.1lY
            r1.<init>(r9, r0, r2)
            X.013 r0 = r5.A06
            java.lang.String r0 = r7.A04(r0, r1)
            goto L_0x003d
        L_0x0083:
            com.obwhatsapp.WaTextView r12 = r5.A01
            long r0 = r10.A01
            long r2 = (long) r13
            long r0 = r0 * r2
            int r13 = r10.A00
            java.lang.String r11 = r10.A02
            X.1lY r10 = new X.1lY
            r10.<init>(r13, r11, r0)
            X.013 r11 = r5.A06
            java.lang.String r0 = r7.A04(r11, r10)
            r12.setText(r0)
            com.obwhatsapp.WaTextView r10 = r5.A03
            r10.setVisibility(r9)
            X.1lY r13 = r6.A01
            if (r13 != 0) goto L_0x00a9
            r0 = 0
        L_0x00a5:
            r10.setText(r0)
            goto L_0x0047
        L_0x00a9:
            long r0 = r13.A01
            long r0 = r0 * r2
            int r12 = r13.A00
            java.lang.String r3 = r13.A02
            X.1lY r2 = new X.1lY
            r2.<init>(r12, r3, r0)
            java.lang.String r0 = r7.A04(r11, r2)
            if (r0 == 0) goto L_0x00a5
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            android.text.style.StrikethroughSpan r2 = new android.text.style.StrikethroughSpan
            r2.<init>()
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r9, r1, r0)
            r0 = r3
            goto L_0x00a5
        L_0x00d0:
            if (r15 != 0) goto L_0x0103
            X.1lZ r0 = r7.A05
            java.util.List r1 = r0.A08
            int r0 = r7.A01()
            if (r0 != r4) goto L_0x00ef
            int r0 = r1.size()
            if (r0 != r4) goto L_0x00ef
            X.62f r1 = new X.62f
            r1.<init>(r5)
            X.1Ld r0 = r5.A07
            X.0tZ r8 = (X.C16740tZ) r8
            r0.A07(r14, r8, r1)
            return
        L_0x00ef:
            android.content.res.Resources r1 = X.C13680ns.A0D(r14)
            r0 = 2131101831(0x7f060887, float:1.7816083E38)
            int r1 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r14.setImageDrawable(r0)
            return
        L_0x0103:
            X.2Yq r13 = r5.A05
            r1 = 0
            com.facebook.redex.IDxSListenerShape36S0000000_3_I1 r0 = new com.facebook.redex.IDxSListenerShape36S0000000_3_I1
            r0.<init>(r1)
            r18 = 2
            r16 = 0
            r17 = r0
            r13.A02(r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113245lj.A07(X.5r3):void");
    }
}
