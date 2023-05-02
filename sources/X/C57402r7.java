package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.2r7  reason: invalid class name and case insensitive filesystem */
public class C57402r7 extends AnonymousClass01X {
    public final Activity A00;
    public final C020009i A01;
    public final C82634Do A02;
    public final C16080sP A03;
    public final AnonymousClass2Ao A04;
    public final AnonymousClass013 A05;
    public final C16070sO A06;
    public final C218115n A07;
    public final C25781Lc A08;

    public C57402r7(Activity activity, C82634Do r5, C16080sP r6, AnonymousClass2Ao r7, AnonymousClass013 r8, C16070sO r9, C218115n r10, C25781Lc r11) {
        this.A03 = r6;
        this.A05 = r8;
        this.A08 = r11;
        this.A07 = r10;
        this.A04 = r7;
        this.A06 = r9;
        this.A00 = activity;
        this.A01 = new C020009i(new AnonymousClass3TA(this, r6), C16010sH.class);
        this.A02 = r5;
    }

    public int A0C() {
        return this.A01.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r10, int r11) {
        /*
            r9 = this;
            X.3SW r10 = (X.AnonymousClass3SW) r10
            X.09i r0 = r9.A01
            java.lang.Object r8 = r0.A01(r11)
            X.0sH r8 = (X.C16010sH) r8
            X.0sP r7 = r9.A03
            X.2Ao r2 = r9.A04
            X.4Do r6 = r9.A02
            X.1l4 r0 = r8.A0G
            if (r0 == 0) goto L_0x00d7
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x00d7
            com.obwhatsapp.components.button.ThumbnailButton r1 = r10.A03
            r0 = 2131230904(0x7f0800b8, float:1.8077874E38)
            r1.setImageResource(r0)
        L_0x0021:
            X.1cU r0 = r10.A01
            r0.A0A(r8)
            X.1l4 r0 = r8.A0G
            if (r0 == 0) goto L_0x008f
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x008f
            com.obwhatsapp.TextEmojiLabel r0 = r10.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131886316(0x7f1200ec, float:1.9407207E38)
        L_0x0038:
            java.lang.CharSequence r1 = r1.getText(r0)
        L_0x003c:
            com.obwhatsapp.TextEmojiLabel r0 = r10.A00
            r2 = 0
            r0.A0I(r2, r1)
            X.1l4 r0 = r8.A0G
            if (r0 == 0) goto L_0x0087
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0087
            com.obwhatsapp.WaImageButton r4 = r10.A02
            r4.setOnClickListener(r2)
            r0 = 4
        L_0x0051:
            r4.setVisibility(r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131891172(0x7f1213e4, float:1.9417057E38)
            X.C13680ns.A0t(r1, r4, r0)
            android.content.Context r5 = r4.getContext()
            r2 = 2131886141(0x7f12003d, float:1.9406852E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            r0 = -1
            r3 = 0
            java.lang.String r0 = r7.A0G(r8, r0, r3)
            java.lang.String r1 = X.C13680ns.A0d(r5, r0, r1, r3, r2)
            r0 = 1
            X.2hF[] r2 = new X.C54322hF[r0]
            X.2hG r0 = new X.2hG
            r0.<init>(r1)
            r2[r3] = r0
            r1 = 4
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r0 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r0.<init>(r2, r1)
            X.C004601z.A0j(r4, r0)
            return
        L_0x0087:
            com.obwhatsapp.WaImageButton r4 = r10.A02
            r0 = 7
            X.C34331k5.A05(r4, r10, r6, r8, r0)
            r0 = 0
            goto L_0x0051
        L_0x008f:
            java.lang.Class<X.1WP> r1 = X.AnonymousClass1WP.class
            com.whatsapp.jid.Jid r0 = r8.A08(r1)
            if (r0 == 0) goto L_0x00bb
            com.whatsapp.jid.Jid r1 = r8.A08(r1)
            X.AnonymousClass00B.A06(r1)
            X.0sN r1 = (X.C16060sN) r1
            X.0sO r0 = r10.A04
            X.1cE r0 = X.C16070sO.A00(r0, r1)
            X.0uz r0 = r0.A04()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x00cc
            com.obwhatsapp.TextEmojiLabel r0 = r10.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            goto L_0x0038
        L_0x00bb:
            java.lang.Class<X.0sN> r1 = X.C16060sN.class
            com.whatsapp.jid.Jid r0 = r8.A08(r1)
            if (r0 == 0) goto L_0x00d3
            com.whatsapp.jid.Jid r1 = r8.A08(r1)
            X.AnonymousClass00B.A06(r1)
            X.0sN r1 = (X.C16060sN) r1
        L_0x00cc:
            r0 = 1
            java.lang.String r1 = r7.A0K(r1, r0, r0)
            goto L_0x003c
        L_0x00d3:
            java.lang.String r1 = ""
            goto L_0x003c
        L_0x00d7:
            if (r2 == 0) goto L_0x00e0
            com.obwhatsapp.components.button.ThumbnailButton r0 = r10.A03
            r2.A06(r0, r8)
            goto L_0x0021
        L_0x00e0:
            com.obwhatsapp.components.button.ThumbnailButton r5 = r10.A03
            X.15n r4 = r10.A05
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131230915(0x7f0800c3, float:1.8077896E38)
            android.content.res.Resources$Theme r1 = X.C13700nu.A04(r5)
            X.4tK r0 = X.C99004tK.A00
            android.graphics.drawable.Drawable r0 = r4.A00(r1, r3, r0, r2)
            r5.setImageDrawable(r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57402r7.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass013 r3 = this.A05;
        C218115n r5 = this.A07;
        C16080sP r2 = this.A03;
        C25781Lc r6 = this.A08;
        return new AnonymousClass3SW(C13680ns.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.layout0062), r2, r3, this.A06, r5, r6);
    }
}
