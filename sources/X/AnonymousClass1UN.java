package X;

import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1UN  reason: invalid class name */
public final class AnonymousClass1UN extends Provider implements AnonymousClass1UO {
    public static final Map A00 = new HashMap();
    public static final C32921hY A01 = new C32921hY();
    public static final String[] A02 = {"MD5", "SHA1", "SHA256", "SHA384"};
    public static final String[] A03 = {"AES", "XSalsa20"};
    public static final String[] A04 = {"PBEPBKDF2"};

    public AnonymousClass1UN() {
        super("SC", 1.68d, "SpongyCastle Security Provider v1.68");
        AccessController.doPrivileged(new C32961hc(this));
    }

    public final void A00(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(strArr[i2]);
            sb.append("$Mappings");
            Class A002 = C32971hd.A00(AnonymousClass1UN.class, sb.toString());
            if (A002 != null) {
                try {
                    ((C33001hh) A002.newInstance()).A00(this);
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("cannot create instance of ");
                    sb2.append(str);
                    sb2.append(strArr[i2]);
                    sb2.append("$Mappings : ");
                    sb2.append(e2);
                    throw new InternalError(sb2.toString());
                }
            }
        }
    }

    public void A4W(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        StringBuilder sb = new StringBuilder("duplicate provider key (");
        sb.append(str);
        sb.append(") found");
        throw new IllegalStateException(sb.toString());
    }
}
