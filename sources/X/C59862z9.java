package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape329S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.businessdirectory.util.FacebookMapPreview;

/* renamed from: X.2z9  reason: invalid class name and case insensitive filesystem */
public final class C59862z9 extends C72823ml {
    public FacebookMapPreview A00;
    public C72223ll A01;
    public AnonymousClass1GE A02;
    public final View A03;
    public final View A04;
    public final TextEmojiLabel A05;
    public final C17180uf A06;
    public final C25641Ko A07;
    public final C50302Yu A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59862z9(View view, C17180uf r11, C25641Ko r12, C50302Yu r13, AnonymousClass1GE r14) {
        super(view);
        C18450wi.A0I(r14, 2, r11);
        C18450wi.A0H(r12, 4);
        this.A03 = view;
        this.A02 = r14;
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r13;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18450wi.A00(view, R.id.discover_businesses_btn);
        this.A05 = textEmojiLabel;
        this.A04 = C18450wi.A00(view, R.id.map_overlay);
        Context context = view.getContext();
        SpannableStringBuilder A0F = C13690nt.A0F(C18450wi.A06("# ", context.getString(R.string.str01bf)));
        C56522nn.A02(textEmojiLabel.getPaint(), AnonymousClass2SR.A04(context, C13690nt.A0C(context, R.drawable.ic_location_nearby), R.color.color0659), A0F, -1, 0, 1);
        textEmojiLabel.setText(A0F);
        ViewGroup A072 = C13700nu.A07(view, R.id.map_preview);
        C18450wi.A09(A072);
        AnonymousClass1GE r3 = this.A02;
        this.A00 = new FacebookMapPreview(A072, new IDxCListenerShape329S0100000_2_I1(this, 1), A09(), r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r5.equals("city_default") != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A08(java.lang.Object r7) {
        /*
            r6 = this;
            X.3ll r7 = (X.C72223ll) r7
            r0 = 0
            X.C18450wi.A0H(r7, r0)
            r6.A01 = r7
            android.view.View r2 = r6.A04
            X.26B r0 = r7.A00
            java.lang.String r5 = r0.A08
            java.lang.String r0 = "country_default"
            boolean r4 = r5.equals(r0)
            r3 = 0
            if (r4 != 0) goto L_0x0021
            java.lang.String r0 = "city_default"
            boolean r1 = r5.equals(r0)
            r0 = 8
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r2.setVisibility(r0)
            android.view.View r1 = r6.A03
            r0 = 2131363217(0x7f0a0591, float:1.8346237E38)
            android.view.View r2 = X.C004601z.A0E(r1, r0)
            X.0uf r1 = r6.A06
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x0048
            X.C18450wi.A09(r2)
            if (r4 != 0) goto L_0x0045
            java.lang.String r0 = "city_default"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0045
            r3 = 8
        L_0x0045:
            r2.setVisibility(r3)
        L_0x0048:
            r0 = 20
            X.C13680ns.A18(r2, r7, r0)
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x005f
            com.obwhatsapp.businessdirectory.util.FacebookMapPreview r0 = r6.A00
            X.2jx r1 = r0.A00
            X.3Ds r0 = new X.3Ds
            r0.<init>(r7, r6)
            r1.A0J(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59862z9.A08(java.lang.Object):void");
    }

    public final AnonymousClass0YG A09() {
        AnonymousClass020 r4;
        float f2;
        Double d2;
        Double d3;
        AnonymousClass26B A012 = this.A07.A01();
        if (!this.A06.A09() || A012 == null || (d2 = A012.A03) == null || (d3 = A012.A04) == null) {
            r4 = new AnonymousClass020(-14.235004d, -51.92528d);
            f2 = 2.0f;
        } else {
            r4 = new AnonymousClass020(d2.doubleValue(), d3.doubleValue());
            f2 = 15.0f;
        }
        return new AnonymousClass0YG(r4, f2, 90.0f, 0.0f);
    }
}
