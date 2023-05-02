package X;

import android.content.Context;
import android.os.Build;
import com.mod.bomfab.bomb.BuildConfig;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.01u  reason: invalid class name and case insensitive filesystem */
public class C004101u {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static String A03;
    public static final AnonymousClass01D A04 = new AnonymousClass01T((Object) null, new C004401x());
    public static final byte[] A05 = {0, 2};

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[SYNTHETIC, Splitter:B:11:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e A[SYNTHETIC, Splitter:B:27:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 0
            java.lang.String r1 = "/proc/sys/kernel/osrelease"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x001d }
            r0.<init>(r1)     // Catch:{ all -> 0x001d }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x001d }
            r2.<init>(r0)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0020 }
            r4.append(r0)     // Catch:{ all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0027 }
            goto L_0x002c
        L_0x001d:
            r0 = move-exception
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r0 = move-exception
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0026:
            throw r0     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            java.lang.String r0 = "Unknown release"
            r4.append(r0)
        L_0x002c:
            java.lang.String r1 = "/proc/sys/kernel/version"
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0048 }
            r0.<init>(r1)     // Catch:{ all -> 0x0048 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0048 }
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            r0 = 32
            r4.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x004b }
            r4.append(r0)     // Catch:{ all -> 0x004b }
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0057
        L_0x0048:
            r0 = move-exception
            r1 = r2
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0051:
            throw r0     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            java.lang.String r0 = " unknown version"
            r4.append(r0)
        L_0x0057:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004101u.A00():java.lang.String");
    }

    public static String A01(String str) {
        String str2 = "";
        try {
            Process start = new ProcessBuilder(new String[]{"/system/bin/getprop", str}).redirectErrorStream(true).start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str2 = readLine;
                } else {
                    start.destroy();
                    return str2;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return str2;
        }
    }

    public static String A02(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            return A05(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String A03(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return A05(instance.digest());
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String A04(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(r6 << 1)];
        int i2 = 0;
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            int i3 = i2 + 1;
            cArr2[i2] = cArr[b3 >>> 4];
            i2 = i3 + 1;
            cArr2[i3] = cArr[b3 & 15];
        }
        return new String(cArr2);
    }

    public static String A05(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 >>> 4) & 15, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static SecretKey A06(String str, byte[] bArr, char[] cArr, int i2, int i3) {
        try {
            try {
                return SecretKeyFactory.getInstance(str).generateSecret(new PBEKeySpec(cArr, bArr, i2, i3));
            } catch (InvalidKeySpecException e2) {
                throw new AssertionError(e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    public static SecretKey A07(byte[] bArr, byte[] bArr2, int i2, int i3) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = (char) bArr[i4];
        }
        return A06("PBKDF2WithHmacSHA1And8BIT", bArr2, cArr, i2, i3);
    }

    public static void A08(Context context) {
        new File(context.getFilesDir(), "rc2").delete();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(java.io.File r3, byte[] r4) {
        /*
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r3)
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0019 }
            r1.<init>(r2)     // Catch:{ all -> 0x0019 }
            r1.writeObject(r4)     // Catch:{ all -> 0x0014 }
            r1.close()     // Catch:{ all -> 0x0019 }
            r2.close()
            return
        L_0x0014:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004101u.A09(java.io.File, byte[]):void");
    }

    public static boolean A0A() {
        String str = A03;
        if (str == null) {
            String str2 = Build.MANUFACTURER;
            str = "";
            if (str2 == null) {
                str2 = str;
            }
            String str3 = Build.VERSION.RELEASE;
            if (str3 == null) {
                str3 = str;
            }
            String str4 = Build.DISPLAY;
            if (str4 == null) {
                str4 = str;
            }
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = str;
            }
            String A002 = A00();
            Locale locale = Locale.US;
            if (A002.toLowerCase(locale).contains("cyanogen")) {
                str = "cyanogen";
            } else if (str2.toLowerCase(locale).contains(BuildConfig.BUILD_TYPE) || str3.toLowerCase(locale).contains(BuildConfig.BUILD_TYPE) || str4.toLowerCase(locale).contains(BuildConfig.BUILD_TYPE) || str5.toLowerCase(locale).contains(BuildConfig.BUILD_TYPE) || A002.toLowerCase(locale).contains(BuildConfig.BUILD_TYPE)) {
                str = BuildConfig.BUILD_TYPE;
            } else if (str4.startsWith("Darky")) {
                str = "darky";
            } else if (str2.startsWith("XDAndroid")) {
                str = "xdandroid";
            } else if (str3.startsWith("FroydVillain")) {
                str = "froydvillain";
            } else if (str3.startsWith("VillainROM") || str4.startsWith("VillainROM")) {
                str = "villainrom";
            } else if (str3.startsWith("WildPuzzle")) {
                str = "wildpuzzle";
            } else if (str4.startsWith("MIUI")) {
                str = "miui";
            } else if (str4.startsWith("ITFUNZ")) {
                str = "itfunz";
            } else if (str4.startsWith("DebusROM")) {
                str = "debus";
            } else if (str4.startsWith("FreeX10")) {
                str = "freex10";
            } else if (str4.startsWith("Perception Build")) {
                str = "perception";
            } else if (str4.startsWith("Bionix")) {
                str = "bionix";
            } else if (str4.startsWith("Lite'ning Rom")) {
                str = "litening";
            } else if (str4.startsWith("GINGERVillain")) {
                str = "gingervillian";
            } else if (str4.startsWith("GingerReal")) {
                str = "gingerreal";
            } else if (str4.startsWith("R.U.R.1920")) {
                str = "rur1920";
            } else if (str5.startsWith("MoDaCo")) {
                str = "modaco";
            } else if (str4.startsWith("CriskeloROM")) {
                str = "criskelorom";
            } else if (str4.startsWith("LeeDrOiD")) {
                str = "leedroid";
            } else if (str4.startsWith("Dexter's FolioMod")) {
                str = "foliomod";
            } else if (str4.startsWith("Andro-ID")) {
                str = "andro-id";
            } else if (str4.startsWith("FroyoPlus")) {
                str = "froyoplus";
            } else if (str4.startsWith("PilotxRom")) {
                str = "pilotx";
            } else if (str4.startsWith("Achotjan")) {
                str = "achotjan";
            } else if (A002.contains("FuguMod")) {
                str = "fugu";
            } else if (A002.contains("fakeShmoo")) {
                str = "fakeshmoo";
            } else if (A002.contains("LorDmodNCTeam")) {
                str = "lordmod";
            } else if (A002.contains("-RCMIX")) {
                str = "rcmix";
            } else if (str4.contains("DamianGTO")) {
                str = "damiangto";
            }
            StringBuilder sb = new StringBuilder("app/custom-rom ");
            sb.append(str);
            Log.i(sb.toString());
            A03 = str;
        }
        return str.length() != 0;
    }

    public static boolean A0B(Context context, String str, byte[] bArr) {
        new String(bArr);
        File file = new File(context.getFilesDir(), "rc2");
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass021.A0N);
        sb.append(str);
        String obj = sb.toString();
        byte[] bArr2 = A05;
        try {
            byte[] A0E = A0E(4);
            byte[] A0E2 = A0E(16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A07(obj.getBytes(), A0E, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
            instance.init(1, secretKeySpec, new IvParameterSpec(A0E2));
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr3 = new byte[(bArr2.length + A0E.length + A0E2.length + doFinal.length)];
            byte[][] bArr4 = {bArr2, A0E, A0E2, doFinal};
            int i2 = 0;
            int i3 = 0;
            do {
                byte[] bArr5 = bArr4[i2];
                System.arraycopy(bArr5, 0, bArr3, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
            } while (i2 < 4);
            A09(file, bArr3);
            return Arrays.equals(bArr3, A0H(file));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("unable to write ");
            sb2.append(file.toString());
            Log.e(sb2.toString(), e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        new java.io.FileInputStream(r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0131 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0C(X.AnonymousClass01V r9) {
        /*
            java.lang.Boolean r0 = A02
            if (r0 != 0) goto L_0x0017
            java.lang.String r1 = android.os.Build.TAGS
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001c
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A02 = r0
        L_0x0017:
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001c:
            java.lang.String r1 = "/system/app/Superuser.apk"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x002a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x002a }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x002a }
            if (r0 == 0) goto L_0x002a
            goto L_0x0010
        L_0x002a:
            java.lang.String r0 = "/system/bin/su"
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.String r0 = "/system/xbin/su"
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            r5 = 2
            boolean r0 = r3.canExecute()     // Catch:{ Exception -> 0x0048, NoSuchMethodError -> 0x004a }
            r4 = 0
            if (r0 == 0) goto L_0x0041
            r4 = 1
        L_0x0041:
            boolean r5 = r2.canExecute()     // Catch:{ Exception -> 0x005f, NoSuchMethodError -> 0x0046 }
            goto L_0x005f
        L_0x0046:
            r6 = move-exception
            goto L_0x004c
        L_0x0048:
            r4 = 2
            goto L_0x005f
        L_0x004a:
            r6 = move-exception
            r4 = 2
        L_0x004c:
            java.lang.String r0 = "app/check/nomethod "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0, r6)
        L_0x005f:
            java.lang.String r1 = android.os.Build.PRODUCT
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r8 = 1
            if (r0 != 0) goto L_0x00bd
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r7)
            java.lang.String r6 = "sdk"
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = r1.toLowerCase(r7)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = r1.toLowerCase(r7)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00bd
            android.net.ConnectivityManager r0 = r9.A0H()
            if (r0 == 0) goto L_0x00bd
            android.content.ContentResolver r1 = r9.A0C()
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ NullPointerException -> 0x00bd }
            java.lang.String r0 = com.obwhatsapp.yo.yo.getYoAndroidID(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bd
            android.telephony.TelephonyManager r0 = r9.A0N()
            if (r0 == 0) goto L_0x00bd
            r8 = 0
        L_0x00bd:
            java.lang.String r7 = "app/dly "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            boolean r0 = r3.exists()
            r1.append(r0)
            boolean r0 = r3.canRead()
            r1.append(r0)
            boolean r0 = r3.canWrite()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r6 = ".0"
            java.lang.String r4 = ""
            r0 = r4
            if (r8 == 0) goto L_0x00e4
            r0 = r6
        L_0x00e4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            boolean r0 = r2.exists()
            r1.append(r0)
            boolean r0 = r2.canRead()
            r1.append(r0)
            boolean r0 = r2.canWrite()
            r1.append(r0)
            r1.append(r5)
            if (r8 != 0) goto L_0x0111
            r6 = r4
        L_0x0111:
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0010
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0010
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0131 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0131 }
            r0.close()     // Catch:{ Exception -> 0x0131 }
            goto L_0x0010
        L_0x0131:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x013b }
            r0.<init>(r2)     // Catch:{ Exception -> 0x013b }
            r0.close()     // Catch:{ Exception -> 0x013b }
            goto L_0x0010
        L_0x013b:
            r0 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004101u.A0C(X.01V):boolean");
    }

    public static byte[] A0D() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(160, C003601p.A00());
            return instance.generateKey().getEncoded();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] A0E(int i2) {
        byte[] bArr = new byte[i2];
        C003601p.A00().nextBytes(bArr);
        return bArr;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0F(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageCodePath()     // Catch:{ Exception -> 0x003f }
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x003f }
            r5.<init>(r0)     // Catch:{ Exception -> 0x003f }
            java.lang.String r0 = "classes.dex"
            java.util.zip.ZipEntry r0 = r5.getEntry(r0)     // Catch:{ all -> 0x003a }
            java.io.InputStream r4 = r5.getInputStream(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ all -> 0x0033 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0033 }
        L_0x001d:
            int r1 = r4.read(r2)     // Catch:{ all -> 0x0033 }
            if (r1 <= 0) goto L_0x0028
            r0 = 0
            r3.update(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            goto L_0x001d
        L_0x0028:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x0033 }
            r4.close()     // Catch:{ all -> 0x003a }
            r5.close()     // Catch:{ Exception -> 0x003f }
            return r0
        L_0x0033:
            r0 = move-exception
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "app/md5/bytes/error "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r1 = "null"
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x004e }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004e }
            return r0
        L_0x004e:
            r1 = move-exception
            java.lang.Error r0 = new java.lang.Error
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004101u.A0F(android.content.Context):byte[]");
    }

    public static byte[] A0G(Context context, String str) {
        File file;
        try {
            file = new File(context.getFilesDir(), "rc2");
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass021.A0N);
            sb.append(str);
            String obj = sb.toString();
            byte[] bArr = A05;
            byte[] A0H = A0H(file);
            if (A0H == null) {
                return null;
            }
            int length = A0H.length;
            int length2 = bArr.length;
            int i2 = length2 + 4;
            int i3 = i2 + 16;
            if (length >= i3 + 20) {
                byte[] bArr2 = new byte[length2];
                System.arraycopy(A0H, 0, bArr2, 0, length2);
                if (Arrays.equals(bArr2, bArr)) {
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(A0H, length2, bArr3, 0, 4);
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(A0H, i2, bArr4, 0, 16);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(new SecretKeySpec(A07(obj.getBytes(), bArr3, 16, 128).getEncoded(), "AES").getEncoded(), "AES/OFB/NoPadding");
                    Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                    instance.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                    return instance.doFinal(A0H, i3, length - i3);
                }
                throw new AnonymousClass03R();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.toString());
            sb2.append(" size mismatch");
            throw new InvalidParameterException(sb2.toString());
        } catch (Exception e2) {
            file.delete();
            if (e2 instanceof AnonymousClass03R) {
                throw e2;
            }
            throw new RuntimeException(e2);
        } catch (AnonymousClass03R e3) {
            Log.w("recovery token header mismatch", e3);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A0H(java.io.File r5) {
        /*
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0037
            long r3 = r5.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0037
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0031 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0031 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002c }
            r1.<init>(r2)     // Catch:{ all -> 0x002c }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0027 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0027 }
            r1.close()     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ Exception -> 0x0031 }
            return r0
        L_0x0027:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            java.lang.String r0 = "get byte array"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0037:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004101u.A0H(java.io.File):byte[]");
    }

    public static byte[] A0I(byte[] bArr, byte[]... bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(new SecretKeySpec(bArr, "HmacSHA1"));
            for (byte[] update : bArr2) {
                instance.update(update);
            }
            return instance.doFinal();
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException(e2);
        }
    }
}
