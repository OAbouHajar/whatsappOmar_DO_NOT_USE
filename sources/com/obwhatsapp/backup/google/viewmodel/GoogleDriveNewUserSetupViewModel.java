package com.obwhatsapp.backup.google.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass12U;
import X.C003401n;
import X.C15860rz;
import com.obwhatsapp.R;

public class GoogleDriveNewUserSetupViewModel extends C003401n {
    public static final int[] A05 = {R.string.str1559, R.string.str1557, R.string.str1556, R.string.str155a, R.string.str1558};
    public static final int[] A06 = {0, 4, 1, 2, 3};
    public final AnonymousClass027 A00;
    public final AnonymousClass027 A01;
    public final AnonymousClass027 A02;
    public final AnonymousClass12U A03;
    public final C15860rz A04;

    public GoogleDriveNewUserSetupViewModel(AnonymousClass12U r5, C15860rz r6) {
        AnonymousClass027 r3 = new AnonymousClass027();
        this.A02 = r3;
        AnonymousClass027 r2 = new AnonymousClass027();
        this.A00 = r2;
        AnonymousClass027 r1 = new AnonymousClass027();
        this.A01 = r1;
        this.A03 = r5;
        this.A04 = r6;
        r3.A0B(Boolean.valueOf(r6.A1a()));
        r2.A0B(r6.A0M());
        r1.A0B(Integer.valueOf(r6.A06()));
    }

    public boolean A05(int i2) {
        if (!this.A04.A1l(i2)) {
            return false;
        }
        this.A01.A0B(Integer.valueOf(i2));
        return true;
    }
}
