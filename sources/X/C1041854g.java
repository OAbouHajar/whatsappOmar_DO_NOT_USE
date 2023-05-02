package X;

import java.io.Serializable;

/* renamed from: X.54g  reason: invalid class name and case insensitive filesystem */
public class C1041854g implements Serializable {
    public static final long serialVersionUID = 0;
    public String name;
    public String sha1Hash;
    public String sha256Hash;

    public C1041854g(String str, String str2, String str3) {
        this.name = str;
        if (str2.length() == 27) {
            this.sha1Hash = str2;
            if (str3.length() == 43) {
                this.sha256Hash = str3;
                return;
            }
            throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
        }
        throw new SecurityException("Invalid SHA1 key hash - should be 160-bit.");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1041854g)) {
            return false;
        }
        C1041854g r4 = (C1041854g) obj;
        String str = this.sha256Hash;
        String str2 = r4.sha256Hash;
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        String str3 = this.sha1Hash;
        String str4 = r4.sha1Hash;
        return (str3 == null || str4 == null || !str3.equals(str4)) ? false : true;
    }

    public int hashCode() {
        String str = this.sha256Hash;
        if (str == null) {
            str = this.sha1Hash;
        }
        return str.hashCode();
    }
}
