package X;

import com.obwhatsapp.phonematching.MatchPhoneNumberFragment;

/* renamed from: X.51Z  reason: invalid class name */
public class AnonymousClass51Z implements C53912gV {
    public final /* synthetic */ MatchPhoneNumberFragment A00;

    public AnonymousClass51Z(MatchPhoneNumberFragment matchPhoneNumberFragment) {
        this.A00 = matchPhoneNumberFragment;
    }

    public void AU3(int i2) {
        this.A00.A03.sendEmptyMessage(3);
    }

    public void AU4(String str) {
        MatchPhoneNumberFragment matchPhoneNumberFragment = this.A00;
        String str2 = matchPhoneNumberFragment.A00.A05().user;
        AnonymousClass00B.A06(str2);
        int i2 = 2;
        if (str2.equals(str)) {
            i2 = 1;
        }
        matchPhoneNumberFragment.A03.sendEmptyMessage(i2);
    }
}
