package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2GK  reason: invalid class name */
public final class AnonymousClass2GK {
    public static final Executor A00;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, (long) 1, TimeUnit.SECONDS, new C105985Ca(), new AnonymousClass58T("Google Drive Write Worker #"));
        threadPoolExecutor.setRejectedExecutionHandler(new AnonymousClass58M());
        A00 = threadPoolExecutor;
    }

    public static int A00(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 6;
            case 12:
                return 15;
            case 13:
                return 3;
            case 14:
                return 5;
            case 15:
                return 8;
            case 16:
                return 9;
            case 17:
                return 10;
            case 18:
                return 11;
            case 19:
                return 12;
            case 20:
                return 13;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return 14;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return 16;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return 18;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return 17;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return 25;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return 26;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return 27;
            case 30:
                return 28;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return 29;
            default:
                return 2;
        }
    }

    public static int A01(C15860rz r4, boolean z2) {
        if (!z2) {
            int A06 = r4.A06();
            if (A06 != 0) {
                int i2 = 1;
                if (A06 != 1) {
                    i2 = 2;
                    if (A06 != 2) {
                        i2 = 3;
                        if (A06 != 3) {
                            if (A06 != 4) {
                                return 0;
                            }
                        }
                    }
                }
                return i2;
            }
            return 0;
        }
        return 4;
    }

    public static Dialog A02(Activity activity, DialogInterface.OnCancelListener onCancelListener, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        int i6;
        StringBuilder sb = new StringBuilder("gdrive-util/get-error-dialog creating dialog for ");
        sb.append(A03(i2));
        Log.i(sb.toString());
        AnonymousClass3C6 r4 = new AnonymousClass3C6(activity, i2, i3);
        C32241fu r3 = new C32241fu(activity);
        r3.A07(false);
        r3.setNegativeButton(R.string.str1da7, new IDxCListenerShape127S0100000_2_I0(onCancelListener, 26));
        if (i2 == 0) {
            return null;
        }
        if (i2 == 1) {
            i4 = R.string.str09d8;
            int i7 = R.string.str09d6;
            if (z2) {
                i7 = R.string.str09d5;
            }
            i6 = R.string.str09d7;
        } else if (i2 == 2) {
            i4 = R.string.str09e0;
            int i8 = R.string.str09df;
            if (z2) {
                i8 = R.string.str09de;
            }
            i6 = R.string.str09dd;
        } else if (i2 != 3) {
            if (i2 == 18) {
                i2 = 18;
            }
            return C57892s9.A00(activity, onCancelListener, new AnonymousClass3YL(activity, C57892s9.A00.A01(activity, "d", i2), i3), i2);
        } else {
            i4 = R.string.str09dc;
            i5 = R.string.str09da;
            if (z2) {
                i5 = R.string.str09d9;
            }
            i6 = R.string.str09db;
        }
        r3.A02(i4);
        r3.A01(i5);
        r3.setPositiveButton(i6, r4);
        return r3.create();
    }

    public static String A03(int i2) {
        if (i2 == 0) {
            return "success";
        }
        if (i2 == 1) {
            return "service-missing";
        }
        if (i2 == 2) {
            return "service-version-update-required";
        }
        if (i2 == 3) {
            return "service-disabled";
        }
        if (i2 == 9) {
            return "service-invalid";
        }
        if (i2 == 18) {
            return "service-updating";
        }
        StringBuilder sb = new StringBuilder("unexpected-return-code: ");
        sb.append(i2);
        return sb.toString();
    }

    public static String A04(int i2) {
        switch (i2) {
            case 10:
                return "none";
            case 11:
                return "auth-failed";
            case 12:
                return "account-missing";
            case 13:
                return "google-drive-full";
            case 14:
                return "google-drive-not-reachable";
            case 15:
                return "local-storage-full";
            case 16:
                return "local-chat-backup-missing";
            case 17:
                return "file-not-found";
            case 18:
                return "base-folder-does-not-exist";
            case 19:
                return "gdrive-servers-are-not-working-properly";
            case 20:
                return "failed-to-authenticate-with-whatsapp-servers";
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return "gps-unavailable";
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return "local-gdrive-file-map-is-missing";
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return "read-external-storage-permission-is-missing";
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return "backup-generated-using-newer-version-of-app";
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return "service-disabled";
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return "unknown";
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return "media-without-message-from-db";
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return "auth-failed-user-recoverable";
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return "auth-failed-user-recoverable-notified";
            case 30:
                return "auth-failed-user-security-exception";
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return "auth-failed-user-lib-exception";
            default:
                StringBuilder sb = new StringBuilder("unexpected-error-code:");
                sb.append(i2);
                return sb.toString();
        }
    }

    public static String A05(int i2) {
        if (i2 == 0) {
            return "off";
        }
        if (i2 == 1) {
            return "daily";
        }
        if (i2 == 2) {
            return "weekly";
        }
        if (i2 == 3) {
            return "monthly";
        }
        if (i2 == 4) {
            return "manual";
        }
        StringBuilder sb = new StringBuilder("Unexpected backup frequency: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String A06(Context context, C16300so r2, C16190sc r3, String str) {
        return (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) ? A07(context, r2, str) : r3.A07(str).getAbsolutePath();
    }

    public static String A07(Context context, C16300so r7, String str) {
        String replace;
        if ("_INTERNAL_DATABASES_/chatsettings.db".equals(str)) {
            StringBuilder sb = new StringBuilder("gdrive-util/convert-upload-title-to-local-path/ignored-file-skipped-from-backup ");
            sb.append(str);
            Log.i(sb.toString());
            return null;
        }
        try {
            if (str.startsWith("_INTERNAL_FILES_")) {
                replace = str.replace("_INTERNAL_FILES_", context.getFilesDir().getAbsolutePath());
            } else if (str.startsWith("_INTERNAL_DATABASES_")) {
                replace = str.replace("_INTERNAL_DATABASES_", context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gdrive-util/upload-title-to-local-path/unexpected-title: ");
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            String canonicalPath = new File(replace).getCanonicalPath();
            Set<File> A0E = A0E(context);
            HashSet hashSet = new HashSet(A0E.size());
            for (File canonicalPath2 : A0E) {
                hashSet.add(new File(canonicalPath2.getCanonicalPath()));
            }
            if (hashSet.contains(new File(canonicalPath))) {
                return canonicalPath;
            }
            StringBuilder sb3 = new StringBuilder("gdrive-util/convert-upload-title-to-local-path/local-path-unexpected/return-null ");
            sb3.append(canonicalPath);
            sb3.append(" not in [");
            sb3.append(TextUtils.join(" ", hashSet));
            sb3.append("]");
            Log.e(sb3.toString());
            r7.AcB("gdrive-util/convert-upload-title-to-local-path", "gdrive: upload title maps to invalid local path", true);
            return null;
        } catch (IOException e2) {
            Log.e("gdrive-util/upload-title-to-local-path", e2);
            return null;
        }
    }

    public static String A08(Context context, C16190sc r12, File file) {
        String str;
        String absolutePath = file.getAbsolutePath();
        if (r12.A0B(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(((File) r12.A03.get()).getAbsolutePath());
            sb.append("/");
            str = absolutePath.replace(sb.toString(), "");
            if (str.startsWith("_INTERNAL_FILES_") || str.startsWith("_INTERNAL_DATABASES_")) {
                StringBuilder sb2 = new StringBuilder("gdrive-util/local-path-to-upload-title/malicious-file-name: ");
                sb2.append(str);
                Log.e(sb2.toString());
                return null;
            }
        } else {
            String absolutePath2 = context.getFilesDir().getAbsolutePath();
            if (absolutePath.startsWith(absolutePath2)) {
                str = absolutePath.replace(absolutePath2, "_INTERNAL_FILES_");
            } else {
                String absolutePath3 = context.getDatabasePath("dummy.db").getParentFile().getAbsolutePath();
                if (absolutePath.startsWith(absolutePath3)) {
                    str = absolutePath.replace(absolutePath3, "_INTERNAL_DATABASES_");
                } else {
                    StringBuilder sb3 = new StringBuilder("gdrive-util/unexpected file: ");
                    sb3.append(absolutePath);
                    Log.w(sb3.toString());
                    return null;
                }
            }
            String.format(Locale.ENGLISH, "gdrive-util/local-path-to-upload-title %s -> %s", new Object[]{absolutePath, str});
        }
        return str;
    }

    public static String A09(C16190sc r2, C16260sj r3, File file, long j2) {
        try {
            try {
                return AnonymousClass1XI.A07(file, MessageDigest.getInstance("MD5"), j2);
            } catch (IOException e2) {
                if (!r2.A0B(file) || !r3.A0E()) {
                    Log.e("gdrive-util/get-message-digest", e2);
                    return null;
                }
                throw new C71153iZ(e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String A0A(AnonymousClass2GT r6) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[9];
        Double d2 = r6.A07;
        objArr[0] = Integer.valueOf(d2 != null ? (int) d2.doubleValue() : -1);
        Double d3 = r6.A03;
        objArr[1] = Integer.valueOf(d3 != null ? (int) d3.doubleValue() : -1);
        Double d4 = r6.A05;
        objArr[2] = Integer.valueOf(d4 != null ? (int) d4.doubleValue() : -1);
        Double d5 = r6.A04;
        objArr[3] = Integer.valueOf(d5 != null ? (int) d5.doubleValue() : -1);
        objArr[4] = r6.A0L;
        objArr[5] = r6.A00;
        objArr[6] = r6.A0I;
        objArr[7] = r6.A0D;
        objArr[8] = r6.A0C;
        return String.format(locale, "total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b backup-stage:%d result:%d", objArr);
    }

    public static String A0B(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("@");
        if (indexOf <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        sb.append("***");
        sb.append(str.substring(indexOf - 1));
        return sb.toString();
    }

    public static String A0C(String str, String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return str;
        }
        if (length % 2 != 0) {
            StringBuilder sb = new StringBuilder("gdrive-util/append-query-parameters/odd number of params - ");
            sb.append(length);
            Log.e(sb.toString());
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        int i2 = 0;
        do {
            buildUpon.appendQueryParameter(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        } while (i2 < length);
        return buildUpon.build().toString();
    }

    public static List A0D(C16180sb r4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(r4.A05().A01);
        arrayList.add(r4.A05().A00);
        arrayList.add(r4.A05().A0N);
        arrayList.add(r4.A05().A05);
        arrayList.add(r4.A05().A0O);
        File file = r4.A05().A0P;
        C16180sb.A04(file, false);
        arrayList.add(file);
        File file2 = r4.A05().A02;
        C16180sb.A04(file2, false);
        arrayList.add(file2);
        File file3 = r4.A05().A0M;
        C16180sb.A04(file3, false);
        arrayList.add(file3);
        File file4 = r4.A05().A04;
        C16180sb.A04(file4, false);
        arrayList.add(file4);
        ArrayList arrayList2 = new ArrayList(arrayList);
        File file5 = r4.A05().A0M;
        C16180sb.A04(file5, false);
        arrayList2.remove(file5);
        return arrayList2;
    }

    public static Set A0E(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add(context.getDatabasePath("chatsettingsbackup.db"));
        hashSet.add(new File(context.getFilesDir(), "wallpaper.jpg"));
        StringBuilder sb = new StringBuilder("gdrive-util/get-internal-files-for-restore [");
        sb.append(TextUtils.join(", ", hashSet));
        sb.append("]");
        Log.i(sb.toString());
        return hashSet;
    }

    public static boolean A0F(C19670yo r9, File file, List list) {
        if (r9 == null || r9.A0E(86400000)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (linkedList.peek() != null) {
                Object poll = linkedList.poll();
                AnonymousClass00B.A06(poll);
                File file2 = (File) poll;
                if (!file2.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-util/get-files-in-folder/does-not-exist ");
                    sb.append(file2.getAbsolutePath());
                    Log.w(sb.toString());
                } else if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File file3 : listFiles) {
                            if (!file3.exists()) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("gdrive-util/get-files-in-folder/does-not-exist ");
                                sb2.append(file3.getAbsolutePath());
                                Log.w(sb2.toString());
                            } else if (file3.isDirectory()) {
                                linkedList.add(file3);
                            } else if (file3.length() > 0) {
                                list.add(file3);
                            }
                        }
                    }
                } else if (file2.length() > 0) {
                    list.add(file2);
                }
                list.size();
            }
            return true;
        }
        StringBuilder sb3 = new StringBuilder("gdrive-util/get-files-in-folder/timeout ");
        sb3.append(file.getAbsolutePath());
        Log.e(sb3.toString());
        return false;
    }

    public static boolean A0G(C15860rz r1) {
        return r1.A09() == 1;
    }

    public static boolean A0H(C15860rz r2) {
        return r2.A09() == 2;
    }

    public static boolean A0I(C15860rz r2) {
        boolean z2 = ((SharedPreferences) r2.A01.get()).getBoolean("new_jid", false);
        StringBuilder sb = new StringBuilder("gdrive-util/is-new-jid/");
        sb.append(z2);
        Log.i(sb.toString());
        return z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0J(X.C16250si r12, java.io.File r13, java.lang.String r14, boolean r15) {
        /*
            r1 = 0
            r11 = r13
            if (r13 == 0) goto L_0x0095
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x0095
            if (r15 == 0) goto L_0x0095
            long r4 = r13.length()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "gdrive-util/validate local msgstore exists but is empty."
        L_0x0018:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r1
        L_0x001c:
            if (r14 == 0) goto L_0x0092
            java.lang.String r0 = r13.getName()
            X.0tx r9 = X.C40721ua.A00(r0)
            if (r9 == 0) goto L_0x0092
            X.12V r10 = r12.A0f     // Catch:{ IOException -> 0x0081 }
            X.0sK r2 = r12.A06     // Catch:{ IOException -> 0x0081 }
            X.0xG r6 = r12.A0I     // Catch:{ IOException -> 0x0081 }
            X.0sd r4 = r12.A08     // Catch:{ IOException -> 0x0081 }
            X.12W r5 = r12.A0B     // Catch:{ IOException -> 0x0081 }
            X.0u0 r8 = r12.A0e     // Catch:{ IOException -> 0x0081 }
            X.12X r7 = r12.A0Y     // Catch:{ IOException -> 0x0081 }
            X.1uy r3 = r12.A07     // Catch:{ IOException -> 0x0081 }
            X.1uz r2 = X.C40951ux.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0081 }
            boolean r0 = r2 instanceof X.C59352x7     // Catch:{ IOException -> 0x0081 }
            if (r0 != 0) goto L_0x0087
            X.2G5 r2 = (X.AnonymousClass2G5) r2     // Catch:{ IOException -> 0x0081 }
            X.2G6 r0 = r2.A00     // Catch:{ IOException -> 0x0081 }
            if (r0 != 0) goto L_0x0074
            java.io.InputStream r3 = r2.A0C()     // Catch:{ 03R -> 0x006b }
            X.2G6 r0 = r2.A0A(r3, r1)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005e
            boolean r0 = r0.A04(r14)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005a
            r3.close()     // Catch:{ 03R -> 0x006b }
            goto L_0x0092
        L_0x005a:
            r3.close()     // Catch:{ 03R -> 0x006b }
            goto L_0x0074
        L_0x005e:
            java.lang.String r2 = "No prefix found"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            r0.<init>(r2)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0     // Catch:{ 03R -> 0x006b }
        L_0x006b:
            r3 = move-exception
            java.lang.String r2 = "failed to read prefix"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0081 }
            r0.<init>(r2, r3)     // Catch:{ IOException -> 0x0081 }
            throw r0     // Catch:{ IOException -> 0x0081 }
        L_0x0074:
            X.3Ab r0 = r2.A07()     // Catch:{ IOException -> 0x0081 }
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.A02(r14)     // Catch:{ IOException -> 0x0081 }
            if (r0 == 0) goto L_0x0087
            goto L_0x0092
        L_0x0081:
            r2 = move-exception
            java.lang.String r0 = "MessageStoreBackup/has-jid-mismatch/failed to read backup footer"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0087:
            X.1uy r0 = r12.A07
            boolean r0 = r0.A03(r13)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "gdrive-util/the backup is not supported."
            goto L_0x0018
        L_0x0092:
            java.lang.String r0 = "gdrive-util/validate local msgstore exists but for a different jid."
            goto L_0x0018
        L_0x0095:
            java.lang.String r0 = "gdrive-util/validate local msgstore does not exist or is unusable"
            goto L_0x0018
        L_0x0098:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GK.A0J(X.0si, java.io.File, java.lang.String, boolean):boolean");
    }

    public static boolean A0K(C14710pd r2) {
        return Build.VERSION.SDK_INT >= 30 && r2.A0E(C16620tM.A02, 603);
    }
}
