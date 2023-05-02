package X;

import android.os.Build;
import android.util.Property;
import android.view.View;
import com.facebook.redex.IDxPropertyShape1S0000000_I1;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public class C06430Vt {
    public static final Property A00 = new IDxPropertyShape1S0000000_I1(3);
    public static final Property A01 = new IDxPropertyShape1S0000000_I1(2);
    public static final AnonymousClass0SD A02;

    static {
        int i2 = Build.VERSION.SDK_INT;
        A02 = i2 >= 29 ? new AnonymousClass0GO() : i2 >= 23 ? new AnonymousClass0GP() : i2 >= 22 ? new AnonymousClass0GQ() : i2 >= 21 ? new AnonymousClass0GR() : i2 >= 19 ? new AnonymousClass0GS() : new AnonymousClass0SD();
    }

    public static C12000jg A00(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C07870cb(view) : new C07860ca(view.getWindowToken());
    }
}
