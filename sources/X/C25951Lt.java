package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.1Lt  reason: invalid class name and case insensitive filesystem */
public class C25951Lt {
    public final C18900xR A00;
    public final C25941Ls A01;
    public final C15860rz A02;
    public final AnonymousClass013 A03;

    public C25951Lt(C18900xR r1, C25941Ls r2, C15860rz r3, AnonymousClass013 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static String A00(Context context, Uri uri, int i2) {
        return context.getString(i2, new Object[]{context.getString(R.string.str091e, new Object[]{uri.toString()})});
    }

    public Dialog A01(Activity activity, C18890xQ r11) {
        C25941Ls r1 = this.A01;
        int time = ((int) ((r1.A00.A01().getTime() - r1.A01.A00()) / 86400000)) + 1;
        C32241fu r5 = new C32241fu(activity);
        r5.A02(R.string.str1658);
        r5.A06(this.A03.A0J(new Object[]{Integer.valueOf(time)}, R.plurals.plurals013e, (long) time));
        r5.setPositiveButton(R.string.str18b2, new IDxCListenerShape28S0200000_2_I0(activity, 2, r11));
        r5.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(activity, 15));
        return r5.create();
    }
}
