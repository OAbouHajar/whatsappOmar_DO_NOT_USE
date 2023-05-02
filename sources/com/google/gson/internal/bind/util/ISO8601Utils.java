package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.io.FilenameUtils;

/* compiled from: XFMFile */
public class ISO8601Utils {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f392a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c2, int i2, String str) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    public static void b(StringBuilder sb, int i2, int i3) {
        String num = Integer.toString(i2);
        for (int length = i3 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    public static int c(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int digit = Character.digit(str.charAt(i2), 10);
            if (digit >= 0) {
                i4 = -digit;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (digit2 >= 0) {
                i4 = (i4 * 10) - digit2;
                i5 = i6;
            } else {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
        }
        return -i4;
    }

    public static String format(Date date) {
        return format(date, false, f392a);
    }

    public static String format(Date date, boolean z2) {
        return format(date, z2, f392a);
    }

    public static String format(Date date, boolean z2, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z2 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        b(sb, gregorianCalendar.get(1), 4);
        char c2 = '-';
        sb.append('-');
        b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        b(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        b(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        b(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        b(sb, gregorianCalendar.get(13), 2);
        if (z2) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            b(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / 60000;
            int abs = Math.abs(i2 / 60);
            int abs2 = Math.abs(i2 % 60);
            if (offset >= 0) {
                c2 = '+';
            }
            sb.append(c2);
            b(sb, abs, 2);
            sb.append(':');
            b(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00eb A[Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d4 A[Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            r1 = r18
            r2 = r19
            int r0 = r19.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r3 = r0 + 4
            int r0 = c(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r4 = 45
            boolean r5 = a(r4, r3, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = c(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            boolean r6 = a(r4, r5, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = c(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r7 = 84
            boolean r7 = a(r7, r6, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00e1
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r13 = 58
            boolean r14 = a(r13, r7, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = c(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            boolean r13 = a(r13, r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r13 <= r14) goto L_0x00de
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r13 == r10) goto L_0x00de
            if (r13 == r9) goto L_0x00de
            if (r13 == r4) goto L_0x00de
            int r13 = r14 + 2
            int r14 = c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = a(r15, r13, r1)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r15 == 0) goto L_0x00da
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x009c:
            int r11 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r15 >= r11) goto L_0x00bd
            char r11 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r4 = 48
            if (r11 < r4) goto L_0x00c2
            r4 = 57
            if (r11 <= r4) goto L_0x00af
            goto L_0x00c2
        L_0x00af:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x009c
        L_0x00b4:
            r0 = move-exception
            goto L_0x01dc
        L_0x00b7:
            r0 = move-exception
            goto L_0x01dc
        L_0x00ba:
            r0 = move-exception
            goto L_0x01dc
        L_0x00bd:
            int r4 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r15 = r4
        L_0x00c2:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r11 = c(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r4 = r4 - r13
            if (r4 == r8) goto L_0x00d5
            if (r4 == r12) goto L_0x00d2
            goto L_0x00d7
        L_0x00d2:
            int r11 = r11 * 10
            goto L_0x00d7
        L_0x00d5:
            int r11 = r11 * 100
        L_0x00d7:
            r4 = r6
            r6 = r15
            goto L_0x00e5
        L_0x00da:
            r4 = r6
            r6 = r13
            r11 = 0
            goto L_0x00e5
        L_0x00de:
            r4 = r6
            r6 = r14
            goto L_0x00e3
        L_0x00e1:
            r4 = 0
            r7 = 0
        L_0x00e3:
            r11 = 0
            r14 = 0
        L_0x00e5:
            int r13 = r18.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r13 <= r6) goto L_0x01d4
            char r13 = r1.charAt(r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r15 = 5
            java.util.TimeZone r17 = f392a
            if (r13 != r10) goto L_0x00f9
            int r6 = r6 + r8
        L_0x00f5:
            r9 = r17
            goto L_0x01a3
        L_0x00f9:
            if (r13 == r9) goto L_0x011c
            r9 = 45
            if (r13 != r9) goto L_0x0100
            goto L_0x011c
        L_0x0100:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r3.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
        L_0x011c:
            java.lang.String r9 = r1.substring(r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r10 < r15) goto L_0x0127
            goto L_0x0138
        L_0x0127:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r9 = "00"
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
        L_0x0138:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r6 = r6 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r10 != 0) goto L_0x00f5
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r10 == 0) goto L_0x014e
            goto L_0x00f5
        L_0x014e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r13 = "GMT"
            r10.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r9 = r10.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r13 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            boolean r16 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r16 != 0) goto L_0x019f
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r12 = r13.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            boolean r12 = r12.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            if (r12 == 0) goto L_0x017c
            goto L_0x019f
        L_0x017c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r3.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r4 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
        L_0x019f:
            r17 = r10
            goto L_0x00f5
        L_0x01a3:
            java.util.GregorianCalendar r10 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.<init>(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r9 = 0
            r10.setLenient(r9)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r10.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            int r3 = r3 - r8
            r0 = 2
            r10.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0 = 5
            r10.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0 = 11
            r10.set(r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0 = 12
            r10.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0 = 13
            r10.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r0 = 14
            r10.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.util.Date r0 = r10.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            return r0
        L_0x01d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4 }
        L_0x01dc:
            if (r1 != 0) goto L_0x01e0
            r1 = 0
            goto L_0x01f3
        L_0x01e0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01f3:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01ff
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x021a
        L_0x01ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x021a:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r19.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }
}
