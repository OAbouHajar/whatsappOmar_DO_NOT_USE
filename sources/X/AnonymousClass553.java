package X;

import java.io.Serializable;
import java.text.DateFormat;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.553  reason: invalid class name */
public class AnonymousClass553 implements Comparable, Serializable {
    public static final long serialVersionUID = 8139806907588338737L;
    public final long ntpTime;
    public DateFormat simpleFormatter;
    public DateFormat utcFormatter;

    public AnonymousClass553(long j2) {
        this.ntpTime = j2;
    }

    public static long A00(long j2) {
        long j3 = (j2 >>> 32) & 4294967295L;
        return (j3 * 1000) + ((2147483648L & j3) == 0 ? 2085978496000L : -2208988800000L) + Math.round((((double) (j2 & 4294967295L)) * 1000.0d) / 4.294967296E9d);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j2 = this.ntpTime;
        long j3 = ((AnonymousClass553) obj).ntpTime;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass553) && this.ntpTime == ((AnonymousClass553) obj).ntpTime;
    }

    public int hashCode() {
        return AnonymousClass3K2.A04(this.ntpTime);
    }

    public String toString() {
        long j2 = this.ntpTime;
        StringBuilder A0o = AnonymousClass000.A0o();
        String hexString = Long.toHexString((j2 >>> 32) & 4294967295L);
        for (int length = hexString.length(); length < 8; length++) {
            A0o.append('0');
        }
        A0o.append(hexString);
        A0o.append(FilenameUtils.EXTENSION_SEPARATOR);
        String hexString2 = Long.toHexString(j2 & 4294967295L);
        for (int length2 = hexString2.length(); length2 < 8; length2++) {
            A0o.append('0');
        }
        return AnonymousClass000.A0h(hexString2, A0o);
    }
}
