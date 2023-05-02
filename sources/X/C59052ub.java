package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;

/* renamed from: X.2ub  reason: invalid class name and case insensitive filesystem */
public class C59052ub extends C65253Tx {
    public final /* synthetic */ C31201dg A00;
    public final /* synthetic */ AnonymousClass1JW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59052ub(C14990q7 r1, C31201dg r2, C31201dg r3, AnonymousClass1JW r4) {
        super(r1, r2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public void A07(View view, C14990q7 r14, C31201dg r15, Object obj) {
        Context context = r14.A00;
        C31201dg r3 = this.A00;
        String A0J = r3.A0J(41);
        AnonymousClass4KB r6 = new AnonymousClass4KB(r14, r3, this);
        this.A01.A5X(context, view, r6, r3.A0J(40), r3.A0J(35), A0J, r3.A0A(43, 0), !C13690nt.A1S(Boolean.FALSE, r3.A0P(38, true)));
    }

    public void A09(View view, C14990q7 r5, C31201dg r6, Object obj) {
        TextView A0L = C13680ns.A0L(view, R.id.hintOrDate);
        A0L.setOnClickListener((View.OnClickListener) null);
        A0L.setText("");
        A0L.setEnabled(false);
        A0L.setClickable(false);
        ((TextInputLayout) C004601z.A0E(view, R.id.inputView)).setHint("");
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return View.inflate(context, R.layout.layout020a, (ViewGroup) null);
    }
}
