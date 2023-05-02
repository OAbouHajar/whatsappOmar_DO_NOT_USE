package com.obwhatsapp.migration.export.ui;

import X.AnonymousClass027;
import X.C003401n;
import X.C103014zt;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16620tM;
import X.C17320ut;
import X.C34901l3;
import X.C85544Ow;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class ExportMigrationViewModel extends C003401n {
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final C17320ut A03;
    public final C103014zt A04;
    public final C85544Ow A05 = new C85544Ow();

    public ExportMigrationViewModel(C14710pd r3, C17320ut r4) {
        int i2;
        this.A03 = r4;
        C103014zt r0 = new C103014zt(this);
        this.A04 = r0;
        r4.A02(r0);
        if (r3.A0E(C16620tM.A02, 881)) {
            Log.e("ExportMigrationViewModel/disabled: app version for platform migration is not supported");
            i2 = 4;
        } else {
            i2 = 0;
        }
        A05(i2);
    }

    public void A04() {
        this.A03.A03(this.A04);
    }

    public void A05(int i2) {
        int i3;
        Log.i(C13680ns.A0c(i2, "ExportMigrationViewModel/setScreen: "));
        Integer valueOf = Integer.valueOf(i2);
        AnonymousClass027 r1 = this.A02;
        if (!C34901l3.A00(valueOf, r1.A01())) {
            C85544Ow r3 = this.A05;
            r3.A0A = 8;
            r3.A00 = 8;
            r3.A03 = 8;
            r3.A06 = 8;
            r3.A04 = 8;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        r3.A08 = R.string.str1d09;
                        r3.A07 = R.string.str1d1c;
                        r3.A02 = R.string.str0de0;
                        r3.A03 = 0;
                    } else if (i2 == 4) {
                        r3.A08 = R.string.str18ac;
                        r3.A07 = R.string.str1d22;
                        r3.A02 = R.string.str18b2;
                        r3.A03 = 0;
                        r3.A05 = R.string.str0e1f;
                        r3.A06 = 0;
                        r3.A0A = 8;
                        i3 = R.drawable.vec_android_to_ios_error;
                    } else if (i2 == 5) {
                        r3.A08 = R.string.str1d10;
                        r3.A07 = R.string.str1d0f;
                        r3.A06 = 8;
                        r3.A04 = 8;
                    } else {
                        return;
                    }
                    r3.A0A = 8;
                } else {
                    r3.A08 = R.string.str1d1a;
                    r3.A07 = R.string.str1d13;
                    r3.A0A = 8;
                    r3.A06 = 0;
                    r3.A05 = R.string.str0394;
                    r3.A04 = 0;
                }
                i3 = R.drawable.vec_android_to_ios_in_progress;
            } else {
                r3.A08 = R.string.str1d15;
                r3.A07 = R.string.str1d17;
                r3.A00 = 0;
                r3.A02 = R.string.str1d20;
                r3.A03 = 0;
                r3.A09 = R.string.str1d16;
                r3.A0A = 0;
                i3 = R.drawable.vec_android_to_ios_start;
            }
            r3.A01 = i3;
            Log.i(C13680ns.A0c(i2, "ExportMigrationViewModel/setScreen/post="));
            r1.A09(valueOf);
        }
    }
}
