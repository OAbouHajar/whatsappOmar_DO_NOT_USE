package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.conversation.conversationrow.components.ViewOnceDownloadProgressView;
import java.util.Arrays;

/* renamed from: X.30u  reason: invalid class name and case insensitive filesystem */
public abstract class C602830u extends AnonymousClass2Q7 {
    public int A00 = 0;
    public final View A01 = C004601z.A0E(this, R.id.view_once_media_container_small);
    public final WaTextView A02 = C13680ns.A0S(this, R.id.view_once_media_type_small);
    public final ViewOnceDownloadProgressView A03 = ((ViewOnceDownloadProgressView) C004601z.A0E(this, R.id.view_once_download_small));

    public C602830u(Context context, AnonymousClass1YG r3, C16730tY r4) {
        super(context, r3, r4);
    }

    public static void A0e(ViewOnceDownloadProgressView viewOnceDownloadProgressView, C16730tY r4, int i2, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0 || i2 == 1) {
            i3 = R.drawable.ic_viewonce_cancel;
            i4 = R.color.color07cf;
            viewOnceDownloadProgressView.A00(i3, -1, i4);
        } else {
            if (i2 == 2) {
                i5 = R.drawable.ic_viewonce_one;
            } else if (i2 == 3) {
                i3 = R.drawable.ic_viewonce_retry;
                i4 = R.color.color07ce;
                viewOnceDownloadProgressView.A00(i3, -1, i4);
            } else {
                i5 = R.drawable.ic_viewonce_download;
            }
            if (z2) {
                i5 = R.drawable.ic_viewonce_one;
                i6 = R.drawable.ic_ephemeral_ring;
                i7 = R.color.color07cf;
            } else {
                i6 = R.drawable.ic_ephemeral_ring;
                i7 = R.color.color07ce;
            }
            viewOnceDownloadProgressView.A00(i5, i6, i7);
        }
        if (!viewOnceDownloadProgressView.isInEditMode()) {
            AnonymousClass3A3.A00(viewOnceDownloadProgressView.A00, r4, viewOnceDownloadProgressView.A04);
        }
        viewOnceDownloadProgressView.setVisibility(0);
    }

    public void A0t() {
        A1J(false);
        A1R();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1R();
        }
    }

    public void A1Q() {
        this.A03.A00(R.drawable.ic_ephemeral_ring, -1, R.color.color07d0);
        WaTextView waTextView = this.A02;
        C13690nt.A0w(getResources(), waTextView, R.color.color07d0);
        Typeface typeface = Typeface.DEFAULT;
        A1S();
        this.A01.setVisibility(0);
        C13680ns.A0t(getContext(), waTextView, getMediaTypeDescriptionString());
    }

    public void A1R() {
        AnonymousClass312 r3 = (AnonymousClass312) this;
        C16730tY fMessage = r3.getFMessage();
        int AGz = ((C39001rl) fMessage).AGz();
        if (AGz != 0) {
            if (AGz == 1) {
                r3.A1Q();
                WaTextView waTextView = r3.A02;
                C13690nt.A0s(r3.getContext(), waTextView, R.string.str19f8);
                C13680ns.A0t(r3.getContext(), waTextView, r3.getMediaTypeDescriptionString());
            } else if (AGz == 2) {
                A0e(r3.A03, fMessage, 2, true);
                r3.A1U(r3.A01, 2, true);
                r3.A1S();
            } else {
                return;
            }
            View view = r3.A01;
            view.setOnClickListener(r3.A02);
            C30011bb.A0K(view, r3);
            return;
        }
        int A06 = C38621r6.A06(fMessage);
        A0e(r3.A03, fMessage, A06, true);
        View view2 = r3.A01;
        r3.A1U(view2, A06, true);
        if (A06 == 2) {
            view2.setOnClickListener(r3.A02);
            C30011bb.A0K(view2, r3);
        }
        r3.A1S();
    }

    public void A1S() {
        if (this.A00 == 0) {
            A1T();
        }
        this.A02.setWidth(this.A00);
    }

    public final void A1T() {
        Integer[] numArr = new Integer[5];
        boolean A1W = C13690nt.A1W(numArr, R.string.str146a);
        AnonymousClass000.A1L(numArr, R.string.str19f9);
        numArr[2] = Integer.valueOf(R.string.str1a0d);
        numArr[3] = Integer.valueOf(R.string.str19e8);
        numArr[4] = Integer.valueOf(R.string.str19f8);
        for (Object A0D : Arrays.asList(numArr)) {
            String A0H = C13700nu.A0H(this, AnonymousClass000.A0D(A0D));
            SpannableStringBuilder A0F = C13690nt.A0F(A0H);
            A0F.setSpan(new AnonymousClass3MR(getContext()), A1W ? 1 : 0, A0H.length(), A1W);
            this.A00 = Math.max(this.A00, (int) Layout.getDesiredWidth(A0F, this.A02.getPaint())) + getResources().getDimensionPixelSize(R.dimen.dimen0232);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1U(android.view.View r7, int r8, boolean r9) {
        /*
            r6 = this;
            X.AnonymousClass2JP.A01(r7)
            r0 = 1
            X.C004601z.A0d(r7, r0)
            if (r8 == 0) goto L_0x00f0
            if (r8 == r0) goto L_0x00f8
            r2 = 0
            r1 = 2
            if (r8 == r1) goto L_0x00d1
            r0 = 3
            if (r8 == r0) goto L_0x00bd
            if (r9 != 0) goto L_0x00e8
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C13680ns.A0t(r1, r7, r0)
            X.1k5 r0 = r6.A09
            r7.setOnClickListener(r0)
            r0 = 2131886886(0x7f120326, float:1.9408364E38)
        L_0x0027:
            X.AnonymousClass2JP.A03(r7, r0)
        L_0x002a:
            X.C30011bb.A0K(r7, r6)
            r4 = r6
            boolean r0 = r6 instanceof X.AnonymousClass312
            if (r0 == 0) goto L_0x00ac
            r0 = 3
            if (r8 != r0) goto L_0x006f
            com.obwhatsapp.WaTextView r3 = r6.A02
            android.content.Context r2 = r6.getContext()
            android.content.Context r1 = r6.getContext()
            r0 = 2131891306(0x7f12146a, float:1.9417328E38)
        L_0x0042:
            java.lang.String r0 = r1.getString(r0)
            android.text.Spannable r0 = X.C45922Bq.A00(r2, r0)
            r3.setText(r0)
        L_0x004d:
            if (r9 == 0) goto L_0x0065
            r0 = 3
            if (r8 != r0) goto L_0x0065
            com.obwhatsapp.WaTextView r2 = r6.A02
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
        L_0x005b:
            X.C13690nt.A0w(r1, r2, r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            r0 = 0
            r7.setVisibility(r0)
            return
        L_0x0065:
            com.obwhatsapp.WaTextView r2 = r6.A02
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131101647(0x7f0607cf, float:1.781571E38)
            goto L_0x005b
        L_0x006f:
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeString()
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r5 = X.C13690nt.A0F(r0)
            r0 = 8203(0x200b, float:1.1495E-41)
            android.text.SpannableStringBuilder r4 = r5.append(r0)
            r0 = 2
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r0)
            int r0 = r5.length()
            int r2 = r0 + -1
            int r0 = r5.length()
            int r1 = r0 + -1
            r0 = 0
            r4.setSpan(r3, r2, r1, r0)
            com.obwhatsapp.WaTextView r2 = r6.A02
            r2.setText(r5)
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C13680ns.A0t(r1, r2, r0)
            goto L_0x004d
        L_0x00ac:
            X.31M r4 = (X.AnonymousClass31M) r4
            com.obwhatsapp.WaTextView r3 = r4.A07
            android.content.Context r2 = r4.getContext()
            android.content.Context r1 = r4.getContext()
            int r0 = r4.getMediaTypeString()
            goto L_0x0042
        L_0x00bd:
            android.content.Context r0 = r6.getContext()
            r1 = 2131891306(0x7f12146a, float:1.9417328E38)
            X.C13680ns.A0t(r0, r7, r1)
            X.1k5 r0 = r6.A0A
            r7.setOnClickListener(r0)
            X.AnonymousClass2JP.A03(r7, r1)
            goto L_0x002a
        L_0x00d1:
            if (r9 != 0) goto L_0x00e8
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getMediaTypeDescriptionString()
            X.C13680ns.A0t(r1, r7, r0)
            X.1k5 r0 = r6.A0B
            r7.setOnClickListener(r0)
            r0 = 2131892685(0x7f1219cd, float:1.9420125E38)
            goto L_0x0027
        L_0x00e8:
            r7.setOnClickListener(r2)
            X.C004601z.A0d(r7, r1)
            goto L_0x002a
        L_0x00f0:
            android.content.Context r1 = r6.getContext()
            r0 = 2131892113(0x7f121791, float:1.9418965E38)
            goto L_0x00ff
        L_0x00f8:
            android.content.Context r1 = r6.getContext()
            r0 = 2131892112(0x7f121790, float:1.9418963E38)
        L_0x00ff:
            X.C13680ns.A0t(r1, r7, r0)
            X.1k5 r0 = r6.A08
            r7.setOnClickListener(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C602830u.A1U(android.view.View, int, boolean):void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01e1;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01e1;
    }

    public int getMediaTypeDescriptionString() {
        C39001rl r1 = (C39001rl) getFMessage();
        boolean z2 = r1 instanceof C39011rm;
        int AGz = r1.AGz();
        return z2 ? AGz != 1 ? AGz != 2 ? R.string.str1a0e : R.string.str1a0f : R.string.str1a10 : AGz != 1 ? AGz != 2 ? R.string.str19fa : R.string.str19fb : R.string.str19fc;
    }

    public int getMediaTypeString() {
        return getFMessage() instanceof C39011rm ? R.string.str1a0d : R.string.str19f9;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01e2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A1T();
        A1S();
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C16730tY);
        super.setFMessage(r2);
    }
}
