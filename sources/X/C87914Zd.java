package X;

/* renamed from: X.4Zd  reason: invalid class name and case insensitive filesystem */
public class C87914Zd {
    public final String A00;
    public final String A01;

    public C87914Zd(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public static C87914Zd A00(String str) {
        if (str == null) {
            return null;
        }
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        for (String split : str.split("[?&](?!\\?)")) {
            String[] split2 = split.split("=", 2);
            String str6 = split2[0];
            switch (str6.hashCode()) {
                case -738783918:
                    if (!str6.equals("certHash")) {
                        break;
                    } else {
                        str4 = split2[1];
                        break;
                    }
                case 351608024:
                    if (!str6.equals("version")) {
                        break;
                    } else {
                        i2 = Integer.parseInt(split2[1]);
                        break;
                    }
                case 1450587441:
                    if (!str6.equals("authToken")) {
                        break;
                    } else {
                        str5 = split2[1];
                        break;
                    }
                case 1809169577:
                    if (!str6.equals("authMethod")) {
                        break;
                    } else {
                        str3 = split2[1];
                        break;
                    }
                case 1874684019:
                    if (!str6.equals("platform")) {
                        break;
                    } else {
                        str2 = split2[1];
                        break;
                    }
            }
        }
        if (i2 != 1 || str2 == null || str3 == null || str4 == null || str5 == null) {
            return null;
        }
        return new C87914Zd(str4, str5);
    }
}
