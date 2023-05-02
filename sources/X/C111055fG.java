package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.obwhatsapp.R;

/* renamed from: X.5fG  reason: invalid class name and case insensitive filesystem */
public class C111055fG extends C005602k {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final C209512f A04;
    public final C209712h A05;

    public C111055fG(View view, C209512f r3, C209712h r4) {
        super(view);
        this.A01 = C13680ns.A0J(view, R.id.background_theme);
        this.A00 = C004601z.A0E(view, R.id.payment_background_selection);
        this.A02 = C13680ns.A0J(view, R.id.retry_download_icon);
        this.A03 = (ProgressBar) C004601z.A0E(view, R.id.asset_download_progress);
        this.A05 = r4;
        this.A04 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C118275uQ r7) {
        /*
            r6 = this;
            android.widget.ProgressBar r0 = r6.A03
            r3 = 8
            r0.setVisibility(r3)
            X.1lo r4 = r7.A03
            r2 = 0
            if (r4 != 0) goto L_0x0041
            android.widget.ImageView r5 = r6.A01
            r0 = 2131232268(0x7f08060c, float:1.808064E38)
            r5.setImageResource(r0)
            r5.setBackgroundColor(r2)
        L_0x0017:
            android.widget.ImageView r0 = r6.A02
            r0.setVisibility(r3)
        L_0x001c:
            r0 = 2131363629(0x7f0a072d, float:1.8347072E38)
            r5.setTag(r0, r4)
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            if (r4 == 0) goto L_0x0035
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0035
            X.12f r2 = r6.A04
            int r1 = r3.width
            int r0 = r3.height
            r2.A00(r5, r4, r1, r0)
        L_0x0035:
            boolean r2 = r7.A02
            android.view.View r1 = r6.A00
            r0 = 4
            if (r2 == 0) goto L_0x003d
            r0 = 0
        L_0x003d:
            r1.setVisibility(r0)
            return
        L_0x0041:
            java.lang.String r1 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004e
            android.widget.ImageView r0 = r6.A01
            r0.setContentDescription(r1)
        L_0x004e:
            android.widget.ImageView r5 = r6.A01
            int r0 = r4.A0A
            r5.setBackgroundColor(r0)
            r0 = 0
            r5.setImageDrawable(r0)
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0017
            android.widget.ImageView r0 = r6.A02
            r0.setVisibility(r2)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111055fG.A07(X.5uQ):void");
    }
}
