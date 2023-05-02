package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.34U  reason: invalid class name */
public class AnonymousClass34U extends AnonymousClass34M {
    public AnonymousClass34C A00;
    public boolean A01;
    public final C26081Mg A02;

    public AnonymousClass34U(Context context, C85934Qo r2, C26081Mg r3, C25781Lc r4) {
        super(context, r2, r4);
        A00();
        this.A02 = r3;
    }

    /* renamed from: A07 */
    public void A05(C30581cc r4, List list) {
        super.A05(r4, list);
        if (AnonymousClass3AC.A00(getContext(), this.A02, r4, 0, false).A00.A01 != null) {
            this.A00.setVisibility(0);
            this.A00.setMessage(r4, list);
            return;
        }
        this.A00.setVisibility(8);
    }
}
