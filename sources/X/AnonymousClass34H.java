package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.search.views.MessageThumbView;

/* renamed from: X.34H  reason: invalid class name */
public class AnonymousClass34H extends C71403kJ {
    public boolean A00;
    public final WaImageView A01 = C13690nt.A0R(this, R.id.kept_status);
    public final WaImageView A02 = C13690nt.A0R(this, R.id.starred_status);
    public final MessageThumbView A03;

    public AnonymousClass34H(Context context) {
        super(context);
        A01();
        this.A00 = 1.0f;
        FrameLayout.inflate(context, R.layout.layout052a, this);
        MessageThumbView messageThumbView = (MessageThumbView) C004601z.A0E(this, R.id.thumb_view);
        this.A03 = messageThumbView;
        C13680ns.A0t(context, messageThumbView, R.string.str1cea);
    }

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A01 = C16150sX.A0k(C52652eD.A00(generatedComponent()));
        }
    }

    public void setMessage(C38681rF r3) {
        this.A02 = r3;
        A04(this.A02, this.A01);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.A00 = this.A00;
        messageThumbView.setMessage(r3);
    }
}
