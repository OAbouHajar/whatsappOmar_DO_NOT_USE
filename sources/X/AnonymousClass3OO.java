package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3OO  reason: invalid class name */
public class AnonymousClass3OO extends LinearLayout implements AnonymousClass006 {
    public TextEmojiLabel A00;
    public C25651Kp A01;
    public C52662eE A02;
    public boolean A03;

    public AnonymousClass3OO(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = (C25651Kp) C52652eD.A00(generatedComponent()).A2m.get();
        }
        LinearLayout.inflate(context, R.layout.layout008e, this);
        this.A00 = C13680ns.A0Q(this, R.id.beta_text);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFAQLink(String str) {
        this.A01.A00(getContext(), this.A00, getContext().getString(R.string.str01a2), "account-and-profile", str);
    }
}
