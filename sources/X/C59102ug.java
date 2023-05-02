package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxConsumerShape210S0100000_2_I1;
import com.facebook.redex.IDxConsumerShape81S0200000_2_I1;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

/* renamed from: X.2ug  reason: invalid class name and case insensitive filesystem */
public class C59102ug extends C65253Tx {
    public final /* synthetic */ AnonymousClass1JW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59102ug(C14990q7 r1, C31201dg r2, AnonymousClass1JW r3) {
        super(r1, r2);
        this.A00 = r3;
    }

    public void A07(View view, C14990q7 r18, C31201dg r19, Object obj) {
        Integer num;
        View view2 = view;
        view2.setFocusable(false);
        C31201dg r3 = r19;
        String A0J = r3.A0J(45);
        String A0J2 = r3.A0J(41);
        Integer num2 = null;
        if (A0J2 != null) {
            try {
                num = Integer.valueOf(C62163Bx.A07(A0J2));
            } catch (AnonymousClass40K e2) {
                throw new RuntimeException(e2);
            }
        } else {
            num = null;
        }
        String A0J3 = r3.A0J(35);
        String A0J4 = r3.A0J(40);
        Boolean bool = Boolean.FALSE;
        boolean z2 = !C13690nt.A1S(bool, r3.A0P(43, true));
        boolean z3 = !C13690nt.A1S(bool, r3.A0P(44, true));
        C14990q7 r1 = r18;
        if (z3) {
            C31201dg A0G = r3.A0G(42);
            num2 = Integer.valueOf(A0G != null ? C87564Xk.A01(r1, A0G, 0) : 0);
        }
        this.A00.A5V(r1.A00, view2, new IDxConsumerShape210S0100000_2_I1(r3, 0), new IDxConsumerShape81S0200000_2_I1(r1, r3, 2), new IDxConsumerShape81S0200000_2_I1(r1, r3, 1), num, num2, A0J, A0J4, A0J3, r3.A0A(36, 0), z2);
    }

    public void A08(View view, C14990q7 r5, C31201dg r6, Object obj) {
        Context context = r5.A00;
        CodeInputField codeInputField = (CodeInputField) C004601z.A0E(view, R.id.code);
        codeInputField.removeTextChangedListener(codeInputField.A04);
        if (codeInputField.getTag() != null) {
            codeInputField.removeCallbacks((Runnable) codeInputField.getTag());
        }
        ((ViewGroup) view).removeAllViews();
        C19980zJ.A00(context).getWindow().clearFlags(8192);
    }

    public void A09(View view, C14990q7 r2, C31201dg r3, Object obj) {
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return View.inflate(context, R.layout.layout05fd, (ViewGroup) null);
    }
}
