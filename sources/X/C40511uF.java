package X;

/* renamed from: X.1uF  reason: invalid class name and case insensitive filesystem */
public class C40511uF {
    public static int A00(int i2) {
        if (i2 < 4) {
            return 1;
        }
        if (i2 < 8) {
            return 2;
        }
        if (i2 < 16) {
            return 3;
        }
        if (i2 < 32) {
            return 4;
        }
        if (i2 < 64) {
            return 5;
        }
        if (i2 < 128) {
            return 6;
        }
        if (i2 < 256) {
            return 7;
        }
        if (i2 < 512) {
            return 8;
        }
        if (i2 < 1000) {
            return 9;
        }
        if (i2 < 1500) {
            return 10;
        }
        if (i2 < 2000) {
            return 11;
        }
        if (i2 < 2500) {
            return 12;
        }
        if (i2 < 3000) {
            return 13;
        }
        if (i2 < 3500) {
            return 14;
        }
        if (i2 < 4000) {
            return 15;
        }
        if (i2 >= 4500) {
            return i2 < 5000 ? 17 : 18;
        }
        return 16;
    }

    public static int A01(int i2) {
        if (i2 <= 33) {
            return 1;
        }
        if (i2 <= 65) {
            return 2;
        }
        if (i2 <= 129) {
            return 3;
        }
        if (i2 <= 257) {
            return 4;
        }
        if (i2 <= 513) {
            return 5;
        }
        if (i2 <= 1025) {
            return 16;
        }
        if (i2 <= 1501) {
            return 7;
        }
        if (i2 <= 2001) {
            return 8;
        }
        if (i2 <= 2501) {
            return 9;
        }
        if (i2 <= 3001) {
            return 10;
        }
        if (i2 <= 3501) {
            return 11;
        }
        if (i2 <= 4001) {
            return 12;
        }
        if (i2 > 4501) {
            return i2 <= 5001 ? 14 : 15;
        }
        return 13;
    }

    public static int A02(C17380uz r5) {
        if (r5.size() < 4) {
            return 1;
        }
        if (r5.size() < 8) {
            return 2;
        }
        if (r5.size() < 16) {
            return 3;
        }
        if (r5.size() < 32) {
            return 4;
        }
        if (r5.size() < 64) {
            return 5;
        }
        if (r5.size() < 128) {
            return 6;
        }
        if (r5.size() < 256) {
            return 7;
        }
        if (r5.size() < 512) {
            return 8;
        }
        if (r5.size() < 999) {
            return 9;
        }
        if (r5.size() < 1500) {
            return 10;
        }
        if (r5.size() < 2000) {
            return 11;
        }
        if (r5.size() < 2500) {
            return 12;
        }
        if (r5.size() < 3000) {
            return 13;
        }
        if (r5.size() < 3500) {
            return 14;
        }
        if (r5.size() < 4000) {
            return 15;
        }
        return r5.size() < 4500 ? 16 : 17;
    }

    public static int A03(C17240ul r1, C16050sL r2) {
        if (r1.A0m(r2)) {
            return 4;
        }
        if (r1.A0n(r2)) {
            return 2;
        }
        return r1.A0l(r2) ? 3 : 1;
    }
}
