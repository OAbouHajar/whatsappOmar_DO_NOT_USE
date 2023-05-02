package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5e0  reason: invalid class name and case insensitive filesystem */
public class C110375e0 extends FrameLayout implements AnonymousClass006 {
    public TextView A00;
    public TextView A01;
    public C16440t3 A02;
    public AnonymousClass013 A03;
    public C218315p A04;
    public C52662eE A05;
    public boolean A06;

    public C110375e0(Context context) {
        super(context);
        if (!this.A06) {
            this.A06 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A02 = C16150sX.A0U(A002);
            this.A04 = (C218315p) A002.AIL.get();
            this.A03 = C16150sX.A0Z(A002);
        }
        FrameLayout.inflate(getContext(), R.layout.layout048b, this);
        this.A01 = C13680ns.A0L(this, R.id.date);
        this.A00 = C13680ns.A0L(this, R.id.amount);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A05;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }
}
