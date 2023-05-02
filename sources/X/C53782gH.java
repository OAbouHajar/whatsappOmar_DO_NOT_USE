package X;

/* renamed from: X.2gH  reason: invalid class name and case insensitive filesystem */
public class C53782gH {
    public static int A00(String str) {
        switch (str.hashCode()) {
            case -284840886:
                if (str.equals("unknown")) {
                    return 1;
                }
                break;
            case 107348:
                if (str.equals("low")) {
                    return 2;
                }
                break;
            case 3202466:
                if (str.equals("high")) {
                    return 3;
                }
                break;
        }
        return 0;
    }
}
