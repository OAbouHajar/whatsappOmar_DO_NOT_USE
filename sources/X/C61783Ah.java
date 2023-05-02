package X;

import android.view.View;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.facebook.redex.IDxTRendererShape199S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

/* renamed from: X.3Ah  reason: invalid class name and case insensitive filesystem */
public class C61783Ah {
    public static final int A0O;
    public static final int A0P;
    public C16730tY A00;
    public boolean A01;
    public boolean A02;
    public final View.OnClickListener A03 = new ViewOnClickCListenerShape5S0100000_I1_1(this, 14);
    public final View A04;
    public final View A05;
    public final AnonymousClass10X A06;
    public final C16760tb A07;
    public final WaButton A08;
    public final C16260sj A09;
    public final AnonymousClass013 A0A;
    public final C14710pd A0B;
    public final AnonymousClass1HE A0C;
    public final C209212c A0D;
    public final AnonymousClass1MF A0E;
    public final StickerView A0F;
    public final C50772aQ A0G;
    public final AnonymousClass25V A0H = new IDxTRendererShape199S0100000_2_I1(this, 3);
    public final C25791Ld A0I;
    public final C34331k5 A0J = new ViewOnClickCListenerShape5S0100000_I1_1(this, 11);
    public final C34331k5 A0K = new ViewOnClickCListenerShape5S0100000_I1_1(this, 12);
    public final C34331k5 A0L = new ViewOnClickCListenerShape5S0100000_I1_1(this, 13);
    public final C33741j5 A0M;
    public final C33741j5 A0N;

    static {
        boolean z2 = C89674ci.A00;
        int i2 = 7;
        int i3 = 1;
        if (z2) {
            i3 = 7;
        }
        A0O = i3;
        if (!z2) {
            i2 = 3;
        }
        A0P = i2;
    }

    public C61783Ah(View view, AnonymousClass10X r5, C16760tb r6, C16260sj r7, AnonymousClass013 r8, C14710pd r9, AnonymousClass1HE r10, C209212c r11, AnonymousClass1MF r12, C50772aQ r13, C25791Ld r14) {
        this.A05 = view;
        this.A0F = (StickerView) view.findViewById(R.id.sticker_image);
        C33741j5 A002 = C33741j5.A00(view, R.id.progress_bar);
        this.A0N = A002;
        this.A0G = r13;
        A002.A05(new IDxIListenerShape29S0000000_2_I1(6));
        this.A0M = C33741j5.A00(view, R.id.cancel_download);
        this.A04 = view.findViewById(R.id.control_frame);
        this.A08 = (WaButton) view.findViewById(R.id.control_btn);
        this.A0B = r9;
        this.A0E = r12;
        this.A06 = r5;
        this.A07 = r6;
        this.A0A = r8;
        this.A0I = r14;
        this.A09 = r7;
        this.A0D = r11;
        this.A0C = r10;
    }

    public void A00() {
        View view = this.A04;
        view.setVisibility(0);
        C33741j5 r5 = this.A0N;
        C33741j5 r6 = this.A0M;
        WaButton waButton = this.A08;
        AnonymousClass2Q7.A0c(view, waButton, r5, r6, false, false, false);
        C16730tY r1 = this.A00;
        if (!r1.A11.A02 || C38621r6.A0z(r1)) {
            StickerView stickerView = this.A0F;
            C13680ns.A0t(stickerView.getContext(), stickerView, R.string.str0326);
            waButton.setText(C38621r6.A0I(this.A0A, this.A00.A01));
            waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_download, 0, 0, 0);
            C34331k5 r0 = this.A0K;
            waButton.setOnClickListener(r0);
            stickerView.setOnClickListener(r0);
            return;
        }
        StickerView stickerView2 = this.A0F;
        C13680ns.A0t(stickerView2.getContext(), stickerView2, R.string.str146a);
        waButton.setText(R.string.str146a);
        waButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
        C34331k5 r02 = this.A0L;
        waButton.setOnClickListener(r02);
        stickerView2.setOnClickListener(r02);
    }

    public void A01() {
        boolean z2 = this.A00.A11.A02;
        View view = this.A04;
        if (!z2) {
            view.setVisibility(0);
            C33741j5 r4 = this.A0N;
            C33741j5 r5 = this.A0M;
            WaButton waButton = this.A08;
            AnonymousClass2Q7.A0c(view, waButton, r4, r5, true, false, false);
            StickerView stickerView = this.A0F;
            C13680ns.A0t(stickerView.getContext(), stickerView, R.string.str0b3a);
            C34331k5 r0 = this.A0J;
            waButton.setOnClickListener(r0);
            r4.A04(r0);
        } else {
            view.setVisibility(8);
        }
        this.A0F.setOnClickListener((View.OnClickListener) null);
    }

    public void A02() {
        View view = this.A04;
        view.setVisibility(8);
        C33741j5 r3 = this.A0N;
        C33741j5 r4 = this.A0M;
        WaButton waButton = this.A08;
        AnonymousClass2Q7.A0c(view, waButton, r3, r4, false, false, false);
        waButton.setOnClickListener((View.OnClickListener) null);
        this.A0F.setOnClickListener(this.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C38641rB r14, boolean r15) {
        /*
            r13 = this;
            r13.A00 = r14
            r3 = 0
            if (r15 == 0) goto L_0x000a
            com.whatsapp.stickers.StickerView r0 = r13.A0F
            r0.setImageDrawable(r3)
        L_0x000a:
            X.1jm r6 = r14.A1A()
            X.0ta r1 = X.C16730tY.A00(r14)
            com.whatsapp.stickers.StickerView r5 = r13.A0F
            android.content.res.Resources r2 = X.C13680ns.A0D(r5)
            r0 = 2131165832(0x7f070288, float:1.7945892E38)
            int r9 = r2.getDimensionPixelSize(r0)
            r5.setOnClickListener(r3)
            java.lang.String r0 = r6.A09
            if (r0 == 0) goto L_0x0045
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
            X.1XO r4 = X.AnonymousClass1XO.A00(r0)
            X.0pd r3 = r13.A0B
            r2 = 1396(0x574, float:1.956E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x0045
            r14.A02 = r4
        L_0x003e:
            X.1pj[] r0 = r4.A09
            if (r0 == 0) goto L_0x0045
            r6.A01(r0)
        L_0x0045:
            android.content.Context r0 = r5.getContext()
            java.lang.String r0 = X.C89674ci.A00(r0, r6)
            r5.setContentDescription(r0)
            java.lang.String r0 = r6.A0D
            if (r0 == 0) goto L_0x0072
            java.io.File r0 = r1.A0F
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = r14.A14()
            if (r0 == 0) goto L_0x0072
        L_0x005e:
            X.1MF r4 = r13.A0E
            X.51z r7 = new X.51z
            r7.<init>(r1, r13, r14, r15)
            r8 = 1
            r12 = 0
            r11 = 1
            r10 = r9
            r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x006c:
            android.view.View r0 = r13.A05
            r0.invalidate()
            return
        L_0x0072:
            r13.A04(r14, r15)
            goto L_0x006c
        L_0x0076:
            if (r4 == 0) goto L_0x0045
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61783Ah.A03(X.1rB, boolean):void");
    }

    public final void A04(C38641rB r8, boolean z2) {
        C38641rB r3 = r8;
        if (!this.A01 || z2) {
            this.A01 = false;
            this.A0I.A07(this.A0F, r8, this.A0H);
            return;
        }
        this.A01 = false;
        this.A0I.A0B(this.A0F, r3, this.A0H, r8.A11, false);
    }
}
