package X;

import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.1Mj  reason: invalid class name and case insensitive filesystem */
public class C26111Mj {
    public static final C35081lL[] A00(String str, String str2) {
        int i2 = 2;
        if (str2 != null) {
            i2 = 3;
        }
        C35081lL[] r4 = new C35081lL[i2];
        r4[0] = new C35081lL(FacebookFacade.RequestParameter.NAME, str);
        r4[1] = new C35081lL("value", "contact_blacklist");
        if (str2 != null) {
            r4[2] = new C35081lL("dhash", str2);
        }
        return r4;
    }
}
