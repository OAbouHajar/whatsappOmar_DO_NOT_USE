package X;

import com.whatsapp.util.Log;

/* renamed from: X.0vf  reason: invalid class name and case insensitive filesystem */
public final class C17800vf implements C17810vg {
    public final C17790ve A00;

    public C17800vf(C17790ve r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public boolean A00(Object obj, String str) {
        C453728e r1;
        Object obj2 = this.A00.A02.get(str);
        if ((obj2 instanceof C453728e) && (r1 = (C453728e) obj2) != null) {
            return r1.AHa(obj);
        }
        StringBuilder sb = new StringBuilder("Support for the nux key ");
        sb.append(str);
        sb.append(" has not been added yet.");
        Log.e(sb.toString());
        return false;
    }
}
