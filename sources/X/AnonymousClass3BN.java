package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/* renamed from: X.3BN  reason: invalid class name */
public class AnonymousClass3BN {
    public static final HashSet A0J;
    public static final HashSet A0K;
    public static final HashSet A0L;
    public static final HashSet A0M;
    public static final Pattern A0N = Pattern.compile("type=(.*?)[:;]");
    public static final Pattern A0O = Pattern.compile("waid=(.*?)[:;]");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public String A0C = null;
    public String A0D;
    public String A0E;
    public HashSet A0F = C13680ns.A0o();
    public AnonymousClass25L A0G = null;
    public AnonymousClass5R6 A0H;
    public boolean A0I = false;

    static {
        String[] strArr = new String[50];
        strArr[0] = "DOM";
        strArr[1] = "INTL";
        strArr[2] = "POSTAL";
        strArr[3] = "PARCEL";
        strArr[4] = "HOME";
        strArr[5] = "WORK";
        strArr[6] = "PREF";
        strArr[7] = "VOICE";
        strArr[8] = "FAX";
        strArr[9] = "MSG";
        strArr[10] = "CELL";
        strArr[11] = "PAGER";
        strArr[12] = "BBS";
        strArr[13] = "MODEM";
        strArr[14] = "CAR";
        strArr[15] = "ISDN";
        strArr[16] = "VIDEO";
        strArr[17] = "AOL";
        strArr[18] = "APPLELINK";
        strArr[19] = "ATTMAIL";
        strArr[20] = "CIS";
        strArr[21] = "EWORLD";
        strArr[22] = "INTERNET";
        strArr[23] = "IBMMAIL";
        strArr[24] = "MCIMAIL";
        strArr[25] = "POWERSHARE";
        strArr[26] = "PRODIGY";
        strArr[27] = "TLX";
        strArr[28] = "X400";
        strArr[29] = "GIF";
        strArr[30] = "CGM";
        strArr[31] = "WMF";
        strArr[32] = "BMP";
        strArr[33] = "MET";
        strArr[34] = "PMB";
        strArr[35] = "DIB";
        strArr[36] = "PICT";
        strArr[37] = "TIFF";
        strArr[38] = "PDF";
        strArr[39] = "PS";
        strArr[40] = "JPEG";
        strArr[41] = "QTIME";
        strArr[42] = "MPEG";
        strArr[43] = "MPEG2";
        strArr[44] = "AVI";
        strArr[45] = "WAVE";
        strArr[46] = "AIFF";
        strArr[47] = "PCM";
        strArr[48] = "X509";
        A0L = C13680ns.A0p("PGP", strArr, 49);
        String[] strArr2 = new String[4];
        strArr2[0] = "INLINE";
        strArr2[1] = "URL";
        strArr2[2] = "CONTENT-ID";
        A0M = C13680ns.A0p("CID", strArr2, 3);
        String[] strArr3 = new String[20];
        strArr3[0] = "BEGIN";
        strArr3[1] = "LOGO";
        strArr3[2] = "PHOTO";
        strArr3[3] = "LABEL";
        strArr3[4] = "FN";
        strArr3[5] = "TITLE";
        strArr3[6] = "SOUND";
        strArr3[7] = "VERSION";
        strArr3[8] = "TEL";
        strArr3[9] = "EMAIL";
        strArr3[10] = "TZ";
        strArr3[11] = "GEO";
        strArr3[12] = "NOTE";
        strArr3[13] = "URL";
        strArr3[14] = "BDAY";
        strArr3[15] = "ROLE";
        strArr3[16] = "REV";
        strArr3[17] = "UID";
        strArr3[18] = "KEY";
        A0K = C13680ns.A0p("MAILER", strArr3, 19);
        String[] strArr4 = new String[5];
        strArr4[0] = "7BIT";
        strArr4[1] = "8BIT";
        strArr4[2] = "QUOTED-PRINTABLE";
        strArr4[3] = "BASE64";
        A0J = C13680ns.A0p("B", strArr4, 4);
    }

    public String A00() {
        if (!(this instanceof C63533Iy)) {
            return this.A0H.readLine();
        }
        C63533Iy r2 = (C63533Iy) this;
        String str = r2.A00;
        if (str == null) {
            return r2.A0H.readLine();
        }
        r2.A00 = null;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        return r7.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C63533Iy
            if (r0 == 0) goto L_0x007c
            r6 = r8
            X.3Iy r6 = (X.C63533Iy) r6
            boolean r0 = r6.A0I
            r5 = 0
            if (r0 == 0) goto L_0x0011
            r6.A0I = r5
            java.lang.String r0 = r6.A0D
        L_0x0010:
            return r0
        L_0x0011:
            r4 = 0
        L_0x0012:
            r7 = r4
        L_0x0013:
            X.5R6 r0 = r6.A0H
            java.lang.String r3 = r0.readLine()
            if (r3 != 0) goto L_0x0029
            if (r7 != 0) goto L_0x004b
            java.lang.String r0 = r6.A00
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = "Reached end of buffer."
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x0029:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0050
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r2) goto L_0x0050
            char r1 = r3.charAt(r5)
            r0 = 32
            if (r1 == r0) goto L_0x0059
            char r1 = r3.charAt(r5)
            r0 = 9
            if (r1 == r0) goto L_0x0059
            java.lang.String r0 = r6.A00
            r6.A00 = r3
            if (r0 != 0) goto L_0x0010
            if (r7 == 0) goto L_0x0013
        L_0x004b:
            java.lang.String r0 = r7.toString()
            return r0
        L_0x0050:
            if (r7 != 0) goto L_0x004b
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0013
        L_0x0056:
            r6.A00 = r4
            return r0
        L_0x0059:
            r1 = 1
            if (r7 != 0) goto L_0x0066
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L_0x0074
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0q(r0)
            r6.A00 = r4
        L_0x0066:
            java.lang.String r0 = r3.substring(r1)
            r7.append(r0)
            int r0 = r7.length()
            if (r0 <= r2) goto L_0x0013
            goto L_0x0012
        L_0x0074:
            java.lang.String r1 = "Space exists at the beginning of the line"
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        L_0x007c:
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x0086
            r0 = 0
            r8.A0I = r0
            java.lang.String r2 = r8.A0D
            return r2
        L_0x0086:
            java.lang.String r2 = r8.A00()
            if (r2 == 0) goto L_0x00a4
            int r1 = r2.length()
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 >= r0) goto L_0x009f
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x009f
            return r2
        L_0x009f:
            java.lang.String r2 = r8.A01()
            return r2
        L_0x00a4:
            java.lang.String r1 = "Reached end of buffer."
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BN.A01():java.lang.String");
    }

    public String A02(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(str.substring(0, (str.length() - 1) + 1));
        while (true) {
            A0o.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            String A002 = A00();
            if (A002 == null) {
                throw new AnonymousClass25G("File ended during parsing quoted-printable String");
            } else if (!A002.trim().endsWith("=")) {
                return AnonymousClass000.A0h(A002, A0o);
            } else {
                A0o.append(A002.substring(0, (A002.length() - 1) + 1));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "."
            int r0 = r8.indexOf(r0)
            r5 = 1
            int r4 = r0 + 1
            r6 = 0
            if (r4 <= 0) goto L_0x0014
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x0015
            java.lang.String r3 = r7.A0D
            if (r3 != 0) goto L_0x0029
        L_0x0014:
            return r6
        L_0x0015:
            java.lang.String r3 = r7.A01()
            r7.A0D = r3
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = r3.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0014
            r7.A0I = r5
        L_0x0029:
            int r0 = r3.length()
            if (r0 <= r4) goto L_0x0014
            r2 = 0
            java.lang.String r1 = r8.substring(r2, r4)
            java.lang.String r0 = r3.substring(r2, r4)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0014
            if (r9 == 0) goto L_0x0061
            int r0 = r4 + -1
            char r1 = r3.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x004b
            r5 = 0
        L_0x004b:
            X.AnonymousClass00B.A0G(r5)
            java.lang.String r0 = ":"
            int r0 = r3.lastIndexOf(r0)
            if (r0 < r4) goto L_0x0014
            java.lang.String r0 = r3.substring(r4, r0)
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0061
            return r6
        L_0x0061:
            r7.A0I = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BN.A03(java.lang.String, java.lang.String):java.lang.String");
    }

    public void A04(String str) {
        String str2;
        AnonymousClass25L r0;
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String trim = split[0].trim();
            str2 = split[1].trim();
            if (!trim.equalsIgnoreCase("TYPE")) {
                if (trim.equals("VALUE")) {
                    if (A0M.contains(str2.toUpperCase(Locale.US)) || str2.startsWith("X-")) {
                        r0 = this.A0G;
                        if (r0 != null) {
                            r0.A01 = "VALUE";
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder A0r = AnonymousClass000.A0r("Unknown value \"");
                        A0r.append(str2);
                        throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0r));
                    }
                } else if (trim.equals("ENCODING")) {
                    if ((this instanceof C63533Iy ? C63533Iy.A01 : A0J).contains(str2.toUpperCase(Locale.US)) || str2.startsWith("X-")) {
                        AnonymousClass25L r02 = this.A0G;
                        if (r02 != null) {
                            r02.A01 = "ENCODING";
                            r02.A00(str2);
                        }
                        this.A0C = str2;
                        return;
                    }
                    StringBuilder A0r2 = AnonymousClass000.A0r("Unknown encoding \"");
                    A0r2.append(str2);
                    throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0r2));
                } else if (trim.equals("CHARSET")) {
                    r0 = this.A0G;
                    if (r0 != null) {
                        r0.A01 = "CHARSET";
                    } else {
                        return;
                    }
                } else if (trim.equals("LANGUAGE")) {
                    String[] split2 = str2.split("-");
                    int length = split2.length;
                    if (length <= 2) {
                        int i2 = 0;
                        String str3 = split2[0];
                        int length2 = str3.length();
                        int i3 = 0;
                        while (i3 < length2) {
                            char charAt = str3.charAt(i3);
                            if (charAt >= 'a') {
                                if (charAt <= 'z') {
                                    i3++;
                                }
                            } else if (charAt >= 'A' && charAt <= 'Z') {
                                i3++;
                            }
                            StringBuilder A0q = AnonymousClass000.A0q("Invalid Language: \"");
                            A0q.append(str2);
                            throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0q));
                        }
                        if (length > 1) {
                            String str4 = split2[1];
                            int length3 = str4.length();
                            while (i2 < length3) {
                                char charAt2 = str4.charAt(i2);
                                if (charAt2 >= 'a') {
                                    if (charAt2 <= 'z') {
                                        i2++;
                                    }
                                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                    i2++;
                                }
                                StringBuilder A0q2 = AnonymousClass000.A0q("Invalid Language: \"");
                                A0q2.append(str2);
                                throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0q2));
                            }
                        }
                        r0 = this.A0G;
                        if (r0 != null) {
                            r0.A01 = "LANGUAGE";
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder A0q3 = AnonymousClass000.A0q("Invalid Language: \"");
                        A0q3.append(str2);
                        throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0q3));
                    }
                } else if (trim.startsWith("X-")) {
                    r0 = this.A0G;
                    if (r0 != null) {
                        r0.A01 = trim;
                    } else {
                        return;
                    }
                } else if (trim.equalsIgnoreCase("WAID")) {
                    AnonymousClass25L r1 = this.A0G;
                    if (r1 != null) {
                        r1.A01 = "waId";
                        r1.A00(str2);
                        return;
                    }
                    return;
                } else {
                    StringBuilder A0r3 = AnonymousClass000.A0r("Unknown type \"");
                    A0r3.append(trim);
                    throw new AnonymousClass25G(AnonymousClass000.A0h("\"", A0r3));
                }
                r0.A00(str2);
                return;
            }
        } else {
            str2 = split[0];
        }
        A05(str2);
    }

    public void A05(String str) {
        AnonymousClass25L r2;
        String replaceAll;
        if (this instanceof C63533Iy) {
            String[] split = str.split(",");
            this.A0G.A01 = "TYPE";
            for (String str2 : split) {
                if (str2.length() < 2 || !str2.startsWith("\"") || !str2.endsWith("\"")) {
                    r2 = this.A0G;
                    replaceAll = str2.replaceAll("[_$!<|>!$_]", "");
                } else {
                    r2 = this.A0G;
                    replaceAll = str2.substring(1, str2.length() - 1);
                }
                r2.A00(replaceAll);
            }
            return;
        }
        if (!A0L.contains(str) && !str.startsWith("X-")) {
            HashSet hashSet = this.A0F;
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                Log.w(C13680ns.A0h("Type unsupported by vCard 2.1: ", str));
            }
        }
        AnonymousClass25L r1 = this.A0G;
        if (r1 != null) {
            r1.A01 = "TYPE";
            r1.A00(str);
        }
    }
}
