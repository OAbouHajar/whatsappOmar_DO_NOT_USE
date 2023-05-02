package com.obwhatsapp.twofactor;

import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14860ps;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

public class SetCodeFragment extends Hilt_SetCodeFragment {
    public int A00;
    public Button A01;
    public TextView A02;
    public CodeInputField A03;
    public TwoFactorAuthActivity A04;
    public C14860ps A05;

    public static SetCodeFragment A01(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("type", i2);
        SetCodeFragment setCodeFragment = new SetCodeFragment();
        setCodeFragment.A0T(A0D);
        return setCodeFragment;
    }

    public static /* synthetic */ void A02(SetCodeFragment setCodeFragment) {
        int i2 = setCodeFragment.A00;
        if (i2 == 1) {
            setCodeFragment.A04.A37(A01(2), true);
        } else if (i2 == 2) {
            TwoFactorAuthActivity twoFactorAuthActivity = setCodeFragment.A04;
            if (twoFactorAuthActivity.A38(setCodeFragment)) {
                twoFactorAuthActivity.A35();
            } else {
                twoFactorAuthActivity.A37(SetEmailFragment.A01(1), true);
            }
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02a5);
    }

    public void A13() {
        super.A13();
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A04.A38(r4) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A14() {
        /*
            r4 = this;
            super.A14()
            int r0 = r4.A00
            r3 = 2
            if (r0 != r3) goto L_0x0011
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = r4.A04
            boolean r0 = r0.A38(r4)
            r2 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            android.widget.Button r1 = r4.A01
            r0 = 2131889632(0x7f120de0, float:1.9413933E38)
            if (r2 == 0) goto L_0x001c
            r0 = 2131892311(0x7f121857, float:1.9419367E38)
        L_0x001c:
            r1.setText(r0)
            int r0 = r4.A00
            if (r0 != r3) goto L_0x0037
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = r4.A04
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0037
            com.obwhatsapp.CodeInputField r0 = r4.A03
            r0.setCode(r1)
            com.obwhatsapp.CodeInputField r0 = r4.A03
            java.lang.String r0 = r0.getCode()
            r4.A1C(r0)
        L_0x0037:
            r4.A1B()
            com.obwhatsapp.CodeInputField r0 = r4.A03
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.twofactor.SetCodeFragment.A14():void");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A00 = A04().getInt("type", 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r14, android.view.View r15) {
        /*
            r13 = this;
            X.00l r0 = r13.A0C()
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = (com.obwhatsapp.twofactor.TwoFactorAuthActivity) r0
            r13.A04 = r0
            r0 = 2131366502(0x7f0a1266, float:1.83529E38)
            android.view.View r1 = r15.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r13.A01 = r1
            r0 = 10
            X.C34331k5.A02(r1, r13, r0)
            r0 = 2131363527(0x7f0a06c7, float:1.8346865E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r15, r0)
            r13.A02 = r0
            r0 = 2131362770(0x7f0a03d2, float:1.834533E38)
            android.view.View r0 = r15.findViewById(r0)
            com.obwhatsapp.CodeInputField r0 = (com.obwhatsapp.CodeInputField) r0
            r13.A03 = r0
            X.4uc r7 = new X.4uc
            r7.<init>(r13)
            r1 = 2131886145(0x7f120041, float:1.940686E38)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r12 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r2 = 0
            java.lang.String r9 = X.C13690nt.A0c(r13, r4, r0, r2, r1)
            com.obwhatsapp.CodeInputField r5 = r13.A03
            X.4ub r6 = new X.4ub
            r6.<init>(r13)
            r10 = 42
            r8 = 0
            r11 = 42
            r5.A08(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r13.A00
            if (r1 == r3) goto L_0x007e
            r0 = 2
            if (r1 == r0) goto L_0x0075
            r0 = 2131892314(0x7f12185a, float:1.9419373E38)
            java.lang.String r1 = r13.A0J(r0)
        L_0x005e:
            r4 = 0
        L_0x005f:
            r0 = 2131362772(0x7f0a03d4, float:1.8345334E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r15, r0)
            r0.setText(r1)
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r1 = r13.A04
            int[] r0 = r1.A08
            int r0 = r0.length
            if (r0 != r3) goto L_0x0071
            r2 = r4
        L_0x0071:
            r1.A36(r15, r2)
            return
        L_0x0075:
            r0 = 2131892285(0x7f12183d, float:1.9419314E38)
            java.lang.String r1 = r13.A0J(r0)
            r4 = 1
            goto L_0x005f
        L_0x007e:
            r1 = 2131892280(0x7f121838, float:1.9419304E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = X.C13690nt.A0c(r13, r4, r0, r2, r1)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.twofactor.SetCodeFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public final void A1B() {
        String str;
        if (this.A01 != null) {
            boolean z2 = true;
            if (this.A00 != 1 ? (str = this.A04.A02) == null || !str.contentEquals(this.A03.getCode()) : this.A03.getCode().length() != 6) {
                z2 = false;
            }
            this.A01.setEnabled(z2);
        }
    }

    public final boolean A1C(CharSequence charSequence) {
        C13700nu.A0T(this.A02);
        if (charSequence.length() == 6) {
            int i2 = this.A00;
            if (i2 != 1) {
                if (i2 == 2) {
                    String str = this.A04.A02;
                    if (str == null || !str.contentEquals(this.A03.getCode())) {
                        this.A02.setText(R.string.str1839);
                    }
                }
                this.A03.requestFocus();
            }
            return true;
        }
        return false;
    }
}
