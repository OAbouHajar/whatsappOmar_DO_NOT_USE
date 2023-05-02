package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.instagram.common.bloks.mutations.IDxUOperationShape50S0100000_2_I1;
import java.util.List;

/* renamed from: X.3CP  reason: invalid class name */
public class AnonymousClass3CP implements TextWatcher {
    public boolean A00 = false;
    public final C14990q7 A01;
    public final AnonymousClass38S A02;
    public final C31201dg A03;
    public final List A04;

    public AnonymousClass3CP(C14990q7 r2, C31201dg r3) {
        this.A03 = r3;
        this.A01 = r2;
        this.A02 = (AnonymousClass38S) C62183Bz.A05(r2, r3);
        this.A04 = AnonymousClass000.A0u();
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass38S r3 = this.A02;
        r3.A0E = editable;
        r3.A0P = false;
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher afterTextChanged : this.A04) {
                afterTextChanged.afterTextChanged(r3.A0E);
            }
            C31201dg r5 = this.A03;
            if (r5.A0P(63, false)) {
                C14990q7 r2 = this.A01;
                int lineCount = ((TextView) r5.A0C(r2)).getLineCount();
                if (r3.A04 != lineCount) {
                    r3.A04 = lineCount;
                    C62183Bz.A03(r2).A06(new IDxUOperationShape50S0100000_2_I1(this, 3), (long) r5.A00);
                }
            }
            C14930q1 A0H = r5.A0H(48);
            if (A0H != null) {
                C14940q2 r1 = new C14940q2();
                r1.A03(r5, 0);
                C14990q7 r0 = this.A01;
                r1.A03(r0, 1);
                C14940q2.A00(r0, r5, r1, A0H);
            }
            this.A00 = false;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher beforeTextChanged : this.A04) {
                beforeTextChanged.beforeTextChanged(charSequence, i2, i3, i4);
            }
            this.A00 = false;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.A00) {
            this.A00 = true;
            for (TextWatcher onTextChanged : this.A04) {
                onTextChanged.onTextChanged(charSequence, i2, i3, i4);
            }
            this.A00 = false;
        }
    }
}
