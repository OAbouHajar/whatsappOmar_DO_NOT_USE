package android.support.v4.util;

import java.io.PrintWriter;

public class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr = new char[24];
    private static final Object sFormatSync = new Object();

    private static int accumField(int i2, int i3, boolean z2, int i4) {
        if (i2 > 99 || (z2 && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z2 && i4 >= 2)) {
            return i3 + 2;
        }
        if (z2 || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    public static void formatDuration(long j2, long j3, PrintWriter printWriter) {
        if (j2 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j2 - j3, printWriter, 0);
        }
    }

    public static void formatDuration(long j2, PrintWriter printWriter) {
        formatDuration(j2, printWriter, 0);
    }

    public static void formatDuration(long j2, PrintWriter printWriter, int i2) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j2, i2)));
        }
    }

    public static void formatDuration(long j2, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j2, 0));
        }
    }

    private static int formatDurationLocked(long j2, int i2) {
        char c2;
        if (sFormatStr.length < i2) {
            sFormatStr = new char[i2];
        }
        char[] cArr = sFormatStr;
        if (j2 == 0) {
            int i3 = i2 - 1;
            while (0 < i3) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j2 = -j2;
        }
        int i4 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        if (floor > SECONDS_PER_DAY) {
            i5 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i5;
        }
        if (floor > SECONDS_PER_HOUR) {
            i6 = floor / SECONDS_PER_HOUR;
            floor -= i6 * SECONDS_PER_HOUR;
        }
        if (floor > SECONDS_PER_MINUTE) {
            i7 = floor / SECONDS_PER_MINUTE;
            floor -= i7 * SECONDS_PER_MINUTE;
        }
        int i8 = 0;
        if (i2 != 0) {
            int accumField = accumField(i5, 1, false, 0);
            int accumField2 = accumField + accumField(i6, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i7, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(floor, 1, accumField3 > 0, 2);
            for (int accumField5 = accumField4 + accumField(i4, 2, true, accumField4 > 0 ? 3 : 0) + 1; accumField5 < i2; accumField5++) {
                cArr[i8] = ' ';
                i8++;
            }
        }
        cArr[i8] = c2;
        int i9 = i8 + 1;
        int i10 = i9;
        boolean z2 = i2 != 0;
        int printField = printField(cArr, i5, 'd', i9, false, 0);
        int printField2 = printField(cArr, i6, 'h', printField, printField != i10, z2 ? 2 : 0);
        int printField3 = printField(cArr, i7, 'm', printField2, printField2 != i10, z2 ? 2 : 0);
        int printField4 = printField(cArr, floor, 's', printField3, printField3 != i10, z2 ? 2 : 0);
        int printField5 = printField(cArr, i4, 'm', printField4, true, (!z2 || printField4 == i10) ? 0 : 3);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    private static int printField(char[] cArr, int i2, char c2, int i3, boolean z2, int i4) {
        if (!z2 && i2 <= 0) {
            return i3;
        }
        int i5 = i3;
        if ((z2 && i4 >= 3) || i2 > 99) {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i3++;
            i2 -= i6 * 100;
        }
        if ((z2 && i4 >= 2) || i2 > 9 || i5 != i3) {
            int i7 = i2 / 10;
            cArr[i3] = (char) (i7 + 48);
            i3++;
            i2 -= i7 * 10;
        }
        cArr[i3] = (char) (i2 + 48);
        int i8 = i3 + 1;
        cArr[i8] = c2;
        return i8 + 1;
    }
}
