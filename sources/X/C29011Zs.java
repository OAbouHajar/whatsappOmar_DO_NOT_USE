package X;

/* renamed from: X.1Zs  reason: invalid class name and case insensitive filesystem */
public final class C29011Zs {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static int checkNonnegative(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i2, String str) {
        if (i2 <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf("count").length() + 38);
            sb.append("count");
            sb.append(" must be positive but was: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void checkRemove(boolean z2) {
        C29031Zu.A04("no calls to next() since the last call to remove()", z2);
    }
}
