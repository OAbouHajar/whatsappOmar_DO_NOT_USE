package X;

/* renamed from: X.4Kp  reason: invalid class name and case insensitive filesystem */
public class C84454Kp {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    public C84454Kp(String str, Boolean bool) {
        int indexOf;
        int indexOf2;
        String str2 = null;
        if (str != null && (indexOf2 = str.indexOf("filetype=")) >= 0) {
            int i2 = indexOf2 + 9;
            int indexOf3 = str.indexOf(59, i2);
            str2 = indexOf3 >= 0 ? str.substring(i2, indexOf3) : str.substring(i2);
        }
        this.A02 = str2;
        String str3 = null;
        if (str != null && (indexOf = str.indexOf("filehash=")) >= 0) {
            int i3 = indexOf + 9;
            int indexOf4 = str.indexOf(59, i3);
            str3 = indexOf4 >= 0 ? str.substring(i3, indexOf4) : str.substring(i3);
        }
        this.A01 = str3;
        this.A00 = bool;
    }
}
