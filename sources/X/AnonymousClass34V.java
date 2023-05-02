package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.search.views.MessageThumbView;

/* renamed from: X.34V  reason: invalid class name */
public class AnonymousClass34V extends AnonymousClass34I {
    public AnonymousClass013 A00;
    public boolean A01;
    public final WaTextView A02 = C13680ns.A0S(this, R.id.media_time);
    public final MessageThumbView A03;

    public AnonymousClass34V(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C004601z.A0E(this, R.id.thumb_view);
        this.A03 = messageThumbView;
        C13680ns.A0t(context, messageThumbView, R.string.str09b8);
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
        return R.drawable.msg_status_gif;
    }

    public float getRatio() {
        return 1.0f;
    }

    public void setMessage(C38801rR r3) {
        super.setMessage(r3);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.setVisibility(0);
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r3);
        WaTextView waTextView = this.A02;
        C13700nu.A0T(waTextView);
        waTextView.setVisibility(8);
    }
}
