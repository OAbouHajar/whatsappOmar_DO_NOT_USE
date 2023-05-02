package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.2UF  reason: invalid class name */
public class AnonymousClass2UF {
    public static AnonymousClass2SD A00;
    public static AnonymousClass2SD A01;

    public static Dialog A00(Context context) {
        AnonymousClass2SD r1 = new AnonymousClass2SD(context);
        A01 = r1;
        r1.setTitle(R.string.str0d82);
        A01.setMessage(context.getString(R.string.str152a));
        A01.setIndeterminate(true);
        A01.setCancelable(false);
        return A01;
    }

    public static Dialog A01(Context context) {
        int i2;
        int i3;
        IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0;
        if (C14730pf.A00()) {
            boolean equals = "unmounted".equals(Environment.getExternalStorageState());
            i2 = R.string.str0d8b;
            i3 = R.string.str0d8a;
            if (equals) {
                i2 = R.string.str0d8d;
                i3 = R.string.str0d8c;
                iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(context, 25);
            }
            iDxCListenerShape127S0100000_2_I0 = null;
        } else {
            i2 = R.string.str0d89;
            i3 = R.string.str0dfa;
            iDxCListenerShape127S0100000_2_I0 = null;
        }
        C32241fu r1 = new C32241fu(context);
        r1.A02(i2);
        r1.A01(i3);
        r1.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        if (iDxCListenerShape127S0100000_2_I0 != null) {
            r1.setPositiveButton(R.string.str02b0, iDxCListenerShape127S0100000_2_I0);
        }
        return r1.create();
    }

    public static String A02(Activity activity, AnonymousClass013 r6, long j2) {
        int i2;
        if (j2 == 0) {
            i2 = R.string.str0dc7;
        } else if (j2 != -1) {
            return C42681yF.A00(System.currentTimeMillis(), j2) == 0 ? C47672Jx.A00(r6, j2) : C28961Zl.A01(r6, j2).toString();
        } else {
            i2 = R.string.str188a;
        }
        return activity.getString(i2);
    }
}
