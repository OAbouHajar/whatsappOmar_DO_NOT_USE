package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass29S;
import X.AnonymousClass29T;
import X.AnonymousClass2KS;
import X.AnonymousClass2RY;
import X.C15860rz;
import android.app.Activity;
import android.content.DialogInterface;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.registration.VerifyPhoneNumber;

public class IDxCListenerShape6S0101000_2_I0 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape6S0101000_2_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A02) {
            case 0:
                AnonymousClass2RY r2 = (AnonymousClass2RY) this.A01;
                AnonymousClass29T.A00(r2.A01, this.A00);
                r2.A00 = true;
                r2.A03(true, false);
                return;
            case 1:
                int i3 = this.A00;
                Activity activity = ((AnonymousClass2RY) this.A01).A01;
                AnonymousClass29T.A00(activity, i3);
                AnonymousClass29T.A01(activity, 106);
                return;
            case 2:
                ((PromptDialogFragment) this.A01).A00.APm(this.A00);
                break;
            case 3:
                ((PromptDialogFragment) this.A01).A00.APk(this.A00);
                break;
            case 4:
                ((PromptDialogFragment) this.A01).A00.APl(this.A00);
                break;
            case 5:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A01).A03, this.A00);
                return;
            case 6:
                AnonymousClass29S r22 = (AnonymousClass29S) this.A01;
                AnonymousClass29T.A00(r22.A0Y, this.A00);
                if (r22.A0r) {
                    r22.A06();
                    return;
                }
                return;
            case 7:
                AnonymousClass29S r4 = (AnonymousClass29S) this.A01;
                int i4 = this.A00;
                AnonymousClass29T.A00(r4.A0Y, i4);
                C15860rz r0 = r4.A1D;
                if (i4 == 3) {
                    r0.A1M(false);
                    r4.A0V(true);
                    return;
                }
                r0.A1N(false);
                Runnable runnable = r4.A0j;
                AnonymousClass00B.A06(runnable);
                runnable.run();
                return;
            case 9:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A01;
                AnonymousClass29T.A00(verifyPhoneNumber, this.A00);
                StringBuilder A0r = AnonymousClass000.A0r("+");
                A0r.append(verifyPhoneNumber.A1C);
                verifyPhoneNumber.A0k.A01(verifyPhoneNumber, AnonymousClass000.A0h(AnonymousClass000.A0h(verifyPhoneNumber.A1D, A0r), AnonymousClass000.A0r("verify-bp ")));
                return;
            case 11:
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) this.A01;
                AnonymousClass29T.A00(verifyPhoneNumber2, this.A00);
                verifyPhoneNumber2.A0f.A00(verifyPhoneNumber2, "how-to-register");
                return;
            default:
                VerifyPhoneNumber verifyPhoneNumber3 = (VerifyPhoneNumber) this.A01;
                AnonymousClass29T.A00(verifyPhoneNumber3, this.A00);
                verifyPhoneNumber3.A3L();
                return;
        }
        dialogInterface.dismiss();
    }
}
