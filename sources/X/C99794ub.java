package X;

import com.obwhatsapp.twofactor.SetCodeFragment;

/* renamed from: X.4ub  reason: invalid class name and case insensitive filesystem */
public class C99794ub implements AnonymousClass5RL {
    public final /* synthetic */ SetCodeFragment A00;

    public C99794ub(SetCodeFragment setCodeFragment) {
        this.A00 = setCodeFragment;
    }

    public void AOm(String str) {
        SetCodeFragment setCodeFragment = this.A00;
        if (setCodeFragment.A03 >= 7) {
            setCodeFragment.A1B();
            int i2 = setCodeFragment.A00;
            if (i2 == 1) {
                setCodeFragment.A04.A02 = str;
            } else if (i2 == 2) {
                setCodeFragment.A04.A03 = str;
            }
            if (!setCodeFragment.A1C(str)) {
                return;
            }
            if (setCodeFragment.A00 != 2 || !setCodeFragment.A04.A38(setCodeFragment)) {
                SetCodeFragment.A02(setCodeFragment);
            }
        }
    }

    public void AU2(String str) {
        SetCodeFragment setCodeFragment = this.A00;
        if (setCodeFragment.A03 >= 7) {
            int i2 = setCodeFragment.A00;
            if (i2 == 1) {
                setCodeFragment.A04.A02 = str;
            } else if (i2 == 2) {
                setCodeFragment.A04.A03 = str;
            }
            C13700nu.A0T(setCodeFragment.A02);
            setCodeFragment.A1B();
        }
    }
}
