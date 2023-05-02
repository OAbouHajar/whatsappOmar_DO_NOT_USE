package X;

import java.io.File;

/* renamed from: X.1et  reason: invalid class name and case insensitive filesystem */
public final class C31701et {
    public C52612e9 A00;
    public final int A01;
    public final File A02;
    public final String A03;
    public final boolean A04;

    public C31701et(int i2) {
        this(i2, (String) null, false);
    }

    public C31701et(int i2, String str, boolean z2) {
        this((File) null, str, i2, z2);
    }

    public C31701et(File file, String str, int i2, boolean z2) {
        this.A01 = i2;
        this.A03 = str;
        this.A04 = z2;
        this.A02 = file;
    }

    public static String A00(int i2) {
        switch (i2) {
            case 0:
                return "success";
            case 1:
                return "failed_generic";
            case 2:
                return "dns_failure";
            case 3:
                return "timeout";
            case 4:
                return "disk_full";
            case 5:
                return "too_old";
            case 6:
                return "resume_failed";
            case 7:
                return "hash_mismatch";
            case 8:
                return "invalid_url";
            case 9:
                return "output_stream_fail";
            case 11:
                return "no_route";
            case 12:
                return "throttle";
            case 13:
                return "user_cancel";
            case 14:
                return "prefetch_end";
            case 15:
                return "watls_error";
            case 16:
                return "server_error";
            case 17:
                return "wamsys_failed";
            case 18:
                return "failed_network";
            case 19:
                return "failed_connect";
            default:
                return "invalid";
        }
    }

    public static boolean A01(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 11 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19;
    }

    public boolean A02() {
        return this.A01 == 0;
    }

    public String toString() {
        return A00(this.A01);
    }
}
