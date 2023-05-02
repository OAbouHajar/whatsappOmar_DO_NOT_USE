package X;

import android.content.DialogInterface;

/* renamed from: X.4fc  reason: invalid class name and case insensitive filesystem */
public class C91254fc implements DialogInterface.OnClickListener {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public AnonymousClass027 A01 = C13690nt.A0O();
    public AnonymousClass027 A02 = C13690nt.A0O();

    public void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass027 r0;
        if (i2 == -3) {
            r0 = this.A01;
        } else if (i2 == -2) {
            r0 = this.A00;
        } else if (i2 == -1) {
            r0 = this.A02;
        } else {
            return;
        }
        r0.A09(dialogInterface);
    }
}
