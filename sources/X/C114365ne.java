package X;

import android.content.Intent;
import com.obwhatsapp.payments.ui.IndiaUpiStepUpActivity;
import java.util.List;

/* renamed from: X.5ne  reason: invalid class name and case insensitive filesystem */
public class C114365ne extends C16690tT {
    public final C18290wS A00;
    public final C116745rs A01;

    public C114365ne(C14530pL r1, C18290wS r2, C116745rs r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0i = C110105dW.A0i(this.A00);
        if (!A0i.isEmpty()) {
            return A0i.get(C119405xi.A01(A0i));
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C30671cl r5 = (C30671cl) obj;
        C116745rs r1 = this.A01;
        C113295lo r0 = r1.A00;
        String str = r1.A01;
        if (r5 != null) {
            C14530pL r2 = r0.A06;
            Intent A04 = C110105dW.A04(r2, IndiaUpiStepUpActivity.class);
            C110115dX.A0o(A04, r5);
            A04.putExtra("extra_step_up_id", str);
            r2.startActivity(A04);
            return;
        }
        r0.A02();
    }
}
