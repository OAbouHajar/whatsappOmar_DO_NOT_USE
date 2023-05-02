package X;

import com.obwhatsapp.R;

/* renamed from: X.271  reason: invalid class name */
public class AnonymousClass271 {
    public static final int[] A00 = {R.string.str12f8, R.string.str12f7, R.string.str12ff};

    public static int A00(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        if ("contact_blacklist".equals(str)) {
            return 3;
        }
        if ("match_last_seen".equals(str)) {
            return 4;
        }
        return "known".equals(str) ? 5 : -1;
    }

    public static String A01(int i2, String str) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? (i2 != 4 || !"online".equals(str)) ? "all" : "match_last_seen" : "contact_blacklist" : "none" : "contacts";
    }

    public static String A02(String str) {
        switch (str.hashCode()) {
            case -1977700443:
                if (str.equals("privacy_profile_photo")) {
                    return "profile";
                }
                break;
            case -1926138227:
                if (str.equals("privacy_last_seen")) {
                    return "last";
                }
                break;
            case -1038662714:
                if (str.equals("read_receipts_enabled")) {
                    return "readreceipts";
                }
                break;
            case -385074228:
                if (str.equals("privacy_calladd")) {
                    return "calladd";
                }
                break;
            case 897320682:
                if (str.equals("privacy_online")) {
                    return "online";
                }
                break;
            case 1017061513:
                if (str.equals("privacy_status")) {
                    return "status";
                }
                break;
            case 1626211481:
                if (str.equals("privacy_groupadd")) {
                    return "groupadd";
                }
                break;
        }
        StringBuilder sb = new StringBuilder("Unrecognized preference: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
