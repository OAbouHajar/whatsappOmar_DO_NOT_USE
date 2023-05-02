package X;

import android.content.Context;
import com.obwhatsapp.RollingCounterView;

/* renamed from: X.3gt  reason: invalid class name and case insensitive filesystem */
public class C70473gt extends RollingCounterView implements AnonymousClass006 {
    public AnonymousClass013 A00;
    public C52662eE A01;
    public boolean A02;

    public C70473gt(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public String A01(int i2) {
        return C56092kx.A02(getContext(), this.A00, i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
