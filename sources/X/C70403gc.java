package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3gc  reason: invalid class name and case insensitive filesystem */
public class C70403gc extends AnonymousClass3MG {
    public final /* synthetic */ C30011bb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70403gc(Context context, C30011bb r2) {
        super(context);
        this.A00 = r2;
    }

    public void onClick(View view) {
        C30011bb r3 = this.A00;
        C16740tZ fMessage = r3.getFMessage();
        AnonymousClass1YG r1 = r3.A0b;
        if (r1 != null) {
            int AGW = r1.AGW(fMessage);
            if (AGW == 0) {
                AGW = 1;
            }
            r1.Aeq(fMessage, AGW + 1);
            r3.A0t();
        }
    }
}
