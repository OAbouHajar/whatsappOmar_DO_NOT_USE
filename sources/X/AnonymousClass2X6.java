package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView;

/* renamed from: X.2X6  reason: invalid class name */
public class AnonymousClass2X6 {
    public final Context A00;
    public final AnonymousClass01V A01;
    public final C15810rt A02;
    public final C17250um A03;
    public final CaptionView A04;
    public final C17020u3 A05;

    public AnonymousClass2X6(AnonymousClass01V r2, C15810rt r3, C17250um r4, CaptionView captionView, C17020u3 r6) {
        this.A04 = captionView;
        this.A00 = captionView.getContext();
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        AnonymousClass2JP.A03(captionView, R.string.str00a4);
        captionView.setLayoutTransition(new AnonymousClass3KN());
    }

    public void A00(Integer num) {
        int intValue;
        View view;
        int i2;
        CaptionView captionView;
        WaImageView waImageView;
        Context context;
        int i3;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        captionView = this.A04;
                        captionView.A09.setEnabled(true);
                        waImageView = captionView.A0A;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(false);
                        waImageView.setEnabled(true);
                        context = captionView.A03;
                        i3 = R.string.str1a0c;
                    } else if (intValue == 3) {
                        captionView = this.A04;
                        captionView.A09.setEnabled(false);
                        waImageView = captionView.A0A;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(true);
                        waImageView.setEnabled(true);
                        context = captionView.A03;
                        i3 = R.string.str1a0b;
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected value: ");
                        sb.append(num);
                        throw new IllegalStateException(sb.toString());
                    }
                    waImageView.setContentDescription(context.getString(i3));
                    view = captionView.A06;
                } else {
                    CaptionView captionView2 = this.A04;
                    captionView2.A09.setEnabled(true);
                    WaImageView waImageView2 = captionView2.A0A;
                    waImageView2.setVisibility(0);
                    waImageView2.setActivated(false);
                    waImageView2.setEnabled(false);
                    view = captionView2.A06;
                }
                i2 = 8;
            } else {
                CaptionView captionView3 = this.A04;
                captionView3.A09.setEnabled(true);
                captionView3.A0A.setVisibility(8);
                view = captionView3.A06;
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
