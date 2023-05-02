package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1uX  reason: invalid class name and case insensitive filesystem */
public class C40691uX {
    public static final long A00 = new GregorianCalendar(2022, 3, 12).getTimeInMillis();
    public static final long A01 = new GregorianCalendar(2022, 2, 15).getTimeInMillis();
    public static final byte[] A02 = {0, 1};
    public static final byte[] A03 = {0, 1};
    public static final byte[] A04 = {0, 2};

    public static int A00(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return 7;
            }
            if (i2 != 3) {
                StringBuilder sb = new StringBuilder("Unexpected backup result value: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
        return 6;
    }

    public static int A01(String str, String str2) {
        if (str2.equals(str)) {
            return 0;
        }
        if (str.endsWith(".crypt")) {
            return 1;
        }
        String[] split = str.split(".crypt");
        if (split.length != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/get-version/unexpected-filename ");
            sb.append(str);
            Log.e(sb.toString());
            return -1;
        }
        try {
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("msgstore/get-version/unexpected-filename ");
            sb2.append(str);
            Log.e(sb2.toString(), e2);
            return -1;
        }
    }

    public static long A02(C14710pd r7, boolean z2) {
        if (z2) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        C16620tM r1 = C16620tM.A02;
        instance.set(11, r7.A03(r1, 954) + 2);
        return Math.max(instance.getTimeInMillis(), System.currentTimeMillis() + TimeUnit.MINUTES.toMillis((long) r7.A03(r1, 955)));
    }

    public static C40731ub A03(InputStream inputStream) {
        int length = A02.length;
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        int i2 = length + 1;
        byte[] bArr5 = new byte[(i2 + 32 + 16 + 16)];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, length);
        if (Arrays.equals(bArr, A04) || Arrays.equals(bArr, A03)) {
            String valueOf = String.valueOf(bArr5[length]);
            byte[][] bArr6 = {bArr2, bArr3, bArr4};
            int i3 = 0;
            do {
                byte[] bArr7 = bArr6[i3];
                System.arraycopy(bArr5, i2, bArr7, 0, bArr7.length);
                i2 += bArr7.length;
                i3++;
            } while (i3 < 3);
            return new C40731ub(valueOf, bArr, bArr2, bArr3, bArr4);
        }
        throw new AnonymousClass03R();
    }

    public static C40731ub A04(InputStream inputStream) {
        AnonymousClass2GB r2 = (AnonymousClass2GB) C28541Wm.A0D(AnonymousClass2GB.A05, inputStream);
        if (r2 == null) {
            return null;
        }
        int i2 = r2.A01;
        if (((i2 == 0 || i2 != 1) ? AnonymousClass42E.A02 : AnonymousClass42E.A01) != AnonymousClass42E.A02) {
            return null;
        }
        AnonymousClass2u8 r1 = r2.A04;
        if (r1 == null) {
            r1 = AnonymousClass2u8.A06;
        }
        return new C40731ub(r1.A05, r1.A01.A04(), r1.A04.A04(), r1.A03.A04(), r1.A02.A04());
    }

    public static AnonymousClass2Fy A05(Context context) {
        File file = new File(context.getFilesDir(), "key");
        if (!file.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
        } else {
            byte[] A0H = C004101u.A0H(file);
            if (A0H != null) {
                int length = A0H.length;
                byte[] bArr = A02;
                int length2 = bArr.length;
                int i2 = length2 + 1;
                int i3 = i2 + 32;
                int i4 = i3 + 16;
                int i5 = i4 + 32 + 16;
                if (length >= i5 + 32) {
                    byte[] bArr2 = new byte[length2];
                    System.arraycopy(A0H, 0, bArr2, 0, length2);
                    if (Arrays.equals(bArr2, bArr)) {
                        String valueOf = String.valueOf(A0H[length2]);
                        byte[] bArr3 = new byte[32];
                        System.arraycopy(A0H, i2, bArr3, 0, 32);
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0H, i3, bArr4, 0, 16);
                        byte[] bArr5 = new byte[32];
                        System.arraycopy(A0H, i4, bArr5, 0, 32);
                        byte[] A0E = C004101u.A0E(16);
                        byte[] bArr6 = new byte[32];
                        System.arraycopy(A0H, i5, bArr6, 0, 32);
                        return new AnonymousClass2Fy(valueOf, bArr2, bArr3, bArr4, bArr5, A0E, bArr6);
                    }
                    throw new AnonymousClass03R();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(file);
                sb.append(" size mismatch");
                throw new InvalidParameterException(sb.toString());
            }
        }
        return null;
    }

    public static C16960tx A06(C16200sd r0) {
        return r0.A03.A1f() ? C16960tx.A07 : C16960tx.A06;
    }

    public static ArrayList A07(File file, List list) {
        File[] listFiles;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        ArrayList arrayList = new ArrayList();
        String pattern = simpleDateFormat.toPattern();
        String A012 = AnonymousClass02N.A01(file.getName());
        String A022 = AnonymousClass02N.A02(file.getName(), "");
        List<String> list2 = list;
        int size = list2.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = AnonymousClass02N.A02(file.getName(), (String) list2.get(i2));
        }
        File parentFile = file.getParentFile();
        if (!(parentFile == null || (listFiles = parentFile.listFiles()) == null)) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith(A012)) {
                    boolean endsWith = name.endsWith(A022);
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            String str = strArr[i3];
                            if (endsWith) {
                                break;
                            }
                            endsWith = name.endsWith(str);
                            i3++;
                        } else if (!endsWith) {
                        }
                    }
                    if (name.length() > A012.length() + pattern.length()) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        for (String append : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(append);
            File file3 = new File(sb.toString());
            if (file3.exists()) {
                arrayList.add(file3);
            }
        }
        Collections.sort(arrayList, new AnonymousClass57C(A012, simpleDateFormat));
        return arrayList;
    }

    public static List A08(C16960tx r5, C16960tx r6) {
        if (r5.version <= r6.version) {
            ArrayList arrayList = new ArrayList(r5);
            for (C16960tx r2 : C16960tx.A04(r5, r6)) {
                StringBuilder sb = new StringBuilder(".crypt");
                sb.append(r2.version);
                arrayList.add(sb.toString());
            }
            return arrayList;
        }
        StringBuilder sb2 = new StringBuilder("msgstore/get-db-crypt-extension-range/illegal-range [");
        sb2.append(r5);
        sb2.append(", ");
        sb2.append(r6);
        sb2.append(")");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void A09(Context context) {
        new File(context.getFilesDir(), "key").delete();
    }

    public static void A0A(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        StringBuilder sb = new StringBuilder("backupkey/set/v=");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        byte[] bArr5 = bArr;
        Arrays.toString(bArr5);
        byte[] bArr6 = bArr2;
        Arrays.toString(bArr6);
        File file = new File(context.getFilesDir(), "key");
        byte[] bArr7 = new byte[16];
        Arrays.toString(bArr7);
        byte[] bArr8 = {Byte.parseByte(str2)};
        byte[] bArr9 = A02;
        byte[] bArr10 = new byte[(bArr9.length + 1 + bArr5.length + bArr4.length + bArr3.length + 16 + bArr6.length)];
        byte[][] bArr11 = {bArr9, bArr8, bArr, bArr4, bArr3, bArr7, bArr2};
        int i2 = 0;
        int i3 = 0;
        do {
            byte[] bArr12 = bArr11[i2];
            System.arraycopy(bArr12, 0, bArr10, i3, bArr12.length);
            i3 += bArr12.length;
            i2++;
        } while (i2 < 7);
        Arrays.toString(bArr10);
        try {
            C004101u.A09(file, bArr10);
            byte[] A0H = C004101u.A0H(file);
            A05(context);
            Arrays.equals(bArr10, A0H);
        } catch (Exception e2) {
            Log.e("backupkey/set/unable-to-write ", e2);
        }
    }

    public static void A0B(AnonymousClass03O r3, AnonymousClass1WE r4, InputStream inputStream, OutputStream outputStream, long j2) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                r4.accept(Long.valueOf(j2));
                return;
            } else if (r3.test((Object) null)) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                r4.accept(Long.valueOf(j2));
            } else {
                return;
            }
        }
    }

    public static void A0C(C16300so r3, byte[] bArr) {
        int length = bArr.length;
        if (length != 32) {
            StringBuilder sb = new StringBuilder("");
            sb.append(length);
            r3.AcB("crypto-iq-incorrect-account-hash-size", sb.toString(), true);
        }
    }

    public static void A0D(File file, ArrayList arrayList) {
        Collections.sort(arrayList, new AnonymousClass57C(AnonymousClass02N.A01(file.getName()), new SimpleDateFormat("yyyy-MM-dd", Locale.US)));
    }

    public static boolean A0E(Context context) {
        File file = new File(context.getFilesDir(), "key");
        if (!file.exists()) {
            return true;
        }
        String str = null;
        try {
            AnonymousClass2Fy A05 = A05(context);
            if (A05 != null) {
                str = A05.A00.A00;
            }
        } catch (AnonymousClass03R | InvalidParameterException unused) {
        }
        if (TextUtils.isEmpty(str) || "1".equals(str)) {
            return true;
        }
        long lastModified = file.lastModified();
        return A01 <= lastModified && lastModified < A00 && "3".equals(str);
    }

    public static boolean A0F(AnonymousClass2GB r4, String str) {
        boolean z2 = false;
        if ((r4.A00 & 8) == 8) {
            z2 = true;
        }
        if (z2) {
            AnonymousClass2G7 r0 = r4.A02;
            AnonymousClass2G7 r2 = r0;
            if (r0 == null) {
                r0 = AnonymousClass2G7.A0f;
            }
            if ((r0.A01 & 4) == 4) {
                if (r2 == null) {
                    r2 = AnonymousClass2G7.A0f;
                }
                String str2 = r2.A06;
                if (!TextUtils.isEmpty(str2) && !str.endsWith(str2)) {
                    StringBuilder sb = new StringBuilder("EncBackupUtils/has-jid-user-mismatch/expected-jid-user-ends-with: ");
                    sb.append(str2);
                    sb.append("  actual-jid-user: ");
                    sb.append(str);
                    Log.e(sb.toString());
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] A0G(byte[] bArr) {
        MessageDigest messageDigest;
        Arrays.toString(bArr);
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e2) {
            Log.e("calculateahash/digester ", e2);
            messageDigest = null;
        }
        if (messageDigest == null) {
            Log.e("calculateahash/digester is null");
            return null;
        }
        messageDigest.reset();
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
