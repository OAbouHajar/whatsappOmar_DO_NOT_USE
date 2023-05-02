package X;

import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.whatsapp.util.Log;

/* renamed from: X.1Rq  reason: invalid class name and case insensitive filesystem */
public class C27411Rq extends C18240wN {
    public final C18210wK A00;

    public C27411Rq(C18210wK r4, C16320sq r5) {
        super(new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(r5, 34)));
        this.A00 = r4;
    }

    /* renamed from: A06 */
    public boolean A05(AnonymousClass1XQ r3) {
        StringBuilder sb = new StringBuilder("mediauploadqueue/cancel ");
        sb.append(r3);
        Log.i(sb.toString());
        return super.A05(r3);
    }
}
