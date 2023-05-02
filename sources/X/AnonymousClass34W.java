package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.search.views.MessageThumbView;

/* renamed from: X.34W  reason: invalid class name */
public class AnonymousClass34W extends AnonymousClass34I {
    public AnonymousClass013 A00;
    public boolean A01;
    public final LinearLayout A02;
    public final WaTextView A03 = C13680ns.A0S(this, R.id.media_time);
    public final MessageThumbView A04;

    public AnonymousClass34W(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C004601z.A0E(this, R.id.thumb_view);
        this.A04 = messageThumbView;
        this.A02 = (LinearLayout) C004601z.A0E(this, R.id.button_frame);
        C13680ns.A0t(context, messageThumbView, R.string.str1de1);
    }

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A01 = C16150sX.A0k(A002);
            this.A00 = C16150sX.A0Z(A002);
        }
    }

    public int getMark() {
        return R.drawable.mark_video;
    }

    public float getRatio() {
        return 1.0f;
    }

    public void setMessage(C38711rI r6) {
        super.setMessage(r6);
        MessageThumbView messageThumbView = this.A04;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r6);
        WaTextView waTextView = this.A03;
        waTextView.setText(AnonymousClass46W.A00(this.A00, r6));
        waTextView.setVisibility(0);
        int textSize = ((int) waTextView.getTextSize()) + (getResources().getDimensionPixelSize(R.dimen.dimen06b1) << 1);
        LinearLayout linearLayout = this.A02;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i2 = layoutParams.height;
        int i3 = layoutParams.width;
        if (i2 < textSize) {
            int i4 = 3;
            if (this.A00.A0T()) {
                i4 = 5;
            }
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(i3, textSize, i4 | 80));
        }
    }
}
