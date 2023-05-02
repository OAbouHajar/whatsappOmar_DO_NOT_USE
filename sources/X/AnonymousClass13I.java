package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.Me;
import com.obwhatsapp.privacy.usernotice.UserNoticeContentWorker;
import com.obwhatsapp.privacy.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.13I  reason: invalid class name */
public class AnonymousClass13I {
    public C34171jo A00;
    public final C16040sK A01;
    public final C16980tz A02;
    public final C17120uZ A03;
    public final AnonymousClass013 A04;
    public final C14710pd A05;
    public final AnonymousClass13G A06;
    public final AnonymousClass13H A07;
    public final C16320sq A08;
    public final AnonymousClass12P A09;

    public AnonymousClass13I(C16040sK r1, C16980tz r2, C17120uZ r3, AnonymousClass013 r4, C14710pd r5, AnonymousClass13G r6, AnonymousClass13H r7, C16320sq r8, AnonymousClass12P r9) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A08 = r8;
        this.A04 = r4;
        this.A09 = r9;
        this.A06 = r6;
        this.A03 = r3;
        this.A07 = r7;
    }

    public static C46322Dr A00(C14710pd r10, boolean z2) {
        AnonymousClass2Dx r4;
        int i2 = 358;
        if (z2) {
            i2 = 357;
        }
        C16620tM r1 = C16620tM.A02;
        int A032 = r10.A03(r1, i2);
        if (A032 == 0) {
            StringBuilder sb = new StringBuilder("GreenAlertUtils/buildModal/dismissible: ");
            sb.append(z2);
            sb.append(", no start time received");
            Log.i(sb.toString());
            return null;
        }
        if (!z2) {
            A032 += r10.A03(r1, 365);
        }
        if (z2) {
            r4 = new AnonymousClass2Dx(new long[]{86400000}, -1);
        } else {
            r4 = null;
        }
        C46312Dn r12 = new C46312Dn(r4, new AnonymousClass2Dy(((long) A032) * 1000), (AnonymousClass2Dy) null);
        String str = null;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            str = "";
        }
        return new C46322Dr(r12, "", "", "", "", "", (String) null, (String) null, str, arrayList);
    }

    public static final File A01(Context context, int i2) {
        File A022 = A02(context.getFilesDir(), "user_notice");
        if (A022 == null) {
            return null;
        }
        return A02(A022, String.valueOf(i2));
    }

    public static File A02(File file, String str) {
        File file2 = new File(file, str);
        if (file2.exists() || file2.mkdir()) {
            return file2;
        }
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/getDir/could not make directory ");
        sb.append(file2.getAbsolutePath());
        Log.e(sb.toString());
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x011e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C34171jo A03(X.C46352Dw r15) {
        /*
            r14 = this;
            int r3 = r15.A01
            X.0pd r5 = r14.A05
            boolean r0 = X.AnonymousClass2E5.A00(r5, r3)
            r7 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "UserNoticeContentManager/getUserNoticeContentFromLocal/green alert disabled, notice id: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0019:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001c:
            return r7
        L_0x001d:
            boolean r0 = X.AnonymousClass2E5.A01(r5, r15)
            if (r0 == 0) goto L_0x0077
            X.0tz r3 = r14.A02
            r1 = 356(0x164, float:4.99E-43)
            X.0tM r0 = X.C16620tM.A02
            int r2 = r5.A03(r0, r1)
            r10 = 0
            if (r2 != 0) goto L_0x004f
            java.lang.String r0 = "GreenAlertUtils/buildBanner/no duration received"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0035:
            r0 = 1
            X.2Dr r8 = A00(r5, r0)
            r0 = 0
            X.2Dr r9 = A00(r5, r0)
            if (r7 == 0) goto L_0x00ea
            if (r8 == 0) goto L_0x00ea
            if (r9 == 0) goto L_0x00ea
            r12 = 1
            java.lang.String r11 = "default"
            r13 = 1
            X.1jo r6 = new X.1jo
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return r6
        L_0x004f:
            android.content.Context r1 = r3.A00
            r0 = 2131893476(0x7f121ce4, float:1.942173E38)
            java.lang.String r6 = r1.getString(r0)
            r0 = 1609459200000(0x176bb3e7000, double:7.95178499103E-312)
            X.2Dy r4 = new X.2Dy
            r4.<init>(r0)
            long r2 = (long) r2
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r2 = r2 * r0
            X.2Dx r1 = new X.2Dx
            r1.<init>(r7, r2)
            X.2Dn r0 = new X.2Dn
            r0.<init>(r1, r4, r7)
            X.2E6 r7 = new X.2E6
            r7.<init>(r0, r6)
            goto L_0x0035
        L_0x0077:
            int r4 = r15.A02
            int r5 = r15.A00
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/notice id: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r2 = " version: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r0 = " stage: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 5
            if (r5 != r0) goto L_0x00a3
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/end stage, skip local content"
            goto L_0x0019
        L_0x00a3:
            X.1jo r1 = r14.A00
            if (r1 == 0) goto L_0x00ce
            int r0 = r1.A00
            if (r0 != r3) goto L_0x00ce
            int r0 = r1.A01
            if (r0 != r4) goto L_0x00ce
            java.lang.String r1 = "UserNoticeContentManager/getUserNoticeContentFromLocal/has content for notice id: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1jo r0 = r14.A00
            r14.A06(r0, r3)
            X.1jo r6 = r14.A00
            return r6
        L_0x00ce:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r2 = "content.json"
            r1[r0] = r2
            boolean r0 = r14.A09(r1, r3)
            if (r0 == 0) goto L_0x001c
            X.0tz r0 = r14.A02
            android.content.Context r0 = r0.A00
            java.io.File r1 = A01(r0, r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            goto L_0x00ec
        L_0x00ea:
            r6 = 0
            return r6
        L_0x00ec:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x011f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x011f }
            X.2E7 r0 = X.AnonymousClass2E7.A00     // Catch:{ all -> 0x011a }
            X.1jo r0 = r0.A02(r2, r3)     // Catch:{ all -> 0x011a }
            r14.A00 = r0     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0104
            r14.A06(r0, r3)     // Catch:{ all -> 0x011a }
            X.1jo r0 = r14.A00     // Catch:{ all -> 0x011a }
            r2.close()     // Catch:{ IOException -> 0x011f }
            return r0
        L_0x0104:
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/error parsing"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            r14.A04(r3)     // Catch:{ all -> 0x011a }
            X.13G r1 = r14.A06     // Catch:{ all -> 0x011a }
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x011a }
            r1.A02(r0)     // Catch:{ all -> 0x011a }
            r2.close()     // Catch:{ IOException -> 0x011f }
            return r7
        L_0x011a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x011e }
        L_0x011e:
            throw r0     // Catch:{ IOException -> 0x011f }
        L_0x011f:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentManager/getUserNoticeContentFromLocal/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13I.A03(X.2Dw):X.1jo");
    }

    public void A04(int i2) {
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/deleteUserNoticeData/notice id: ");
        sb.append(i2);
        Log.i(sb.toString());
        File A012 = A01(this.A02.A00, i2);
        if (A012 != null) {
            this.A08.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) A012, 20));
        }
        this.A00 = null;
    }

    public void A05(int i2) {
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/fetchAndStoreUserNoticeContent/notice id ");
        sb.append(i2);
        Log.i(sb.toString());
        C007103g r9 = new C007103g();
        r9.A01("notice_id", i2);
        C16040sK r0 = this.A01;
        r0.A0B();
        Me me = r0.A00;
        if (me == null) {
            StringBuilder sb2 = new StringBuilder("UserNoticeContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notice id ");
            sb2.append(i2);
            Log.e(sb2.toString());
            return;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter("id", String.valueOf(i2));
        AnonymousClass013 r3 = this.A04;
        Uri build = appendQueryParameter.appendQueryParameter("lg", r3.A06()).appendQueryParameter("lc", r3.A05()).appendQueryParameter("cc", C18160wF.A00(me.cc)).appendQueryParameter("platform", "android").appendQueryParameter("img-size", this.A02.A00.getResources().getDisplayMetrics().densityDpi <= 240 ? "hdpi" : "xxhdpi").build();
        build.toString();
        r9.A00.put("url", build.toString());
        C007203h A002 = r9.A00();
        AnonymousClass040 r1 = new AnonymousClass040();
        r1.A01(AnonymousClass041.CONNECTED);
        AnonymousClass042 A003 = r1.A00();
        C006903e r32 = new C006903e(UserNoticeContentWorker.class);
        r32.A03.add("tag.whatsapp.usernotice.content.fetch");
        r32.A00.A0A = A003;
        AnonymousClass04P r7 = AnonymousClass04P.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.HOURS;
        r32.A03(r7, timeUnit, 1);
        r32.A00.A0B = A002;
        C006903e r5 = new C006903e(UserNoticeIconWorker.class);
        r5.A03.add("tag.whatsapp.usernotice.icon.fetch");
        r5.A00.A0A = A003;
        r5.A03(r7, timeUnit, 1);
        r5.A00.A0B = r9.A00();
        StringBuilder sb3 = new StringBuilder("tag.whatsapp.usernotice.content.fetch.");
        sb3.append(i2);
        ((AnonymousClass022) this.A09.get()).A02(AnonymousClass03z.REPLACE, (AnonymousClass043) r32.A00(), sb3.toString()).A02((AnonymousClass043) r5.A00()).A03();
    }

    public final void A06(C34171jo r4, int i2) {
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/populateIconFiles/notice id: ");
        sb.append(i2);
        Log.i(sb.toString());
        A07(r4.A02, "banner_icon_light.png", "banner_icon_dark.png", i2);
        A07(r4.A04, "modal_icon_light.png", "modal_icon_dark.png", i2);
        A07(r4.A03, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i2);
    }

    public final void A07(AnonymousClass2Dq r3, String str, String str2, int i2) {
        if (r3 != null) {
            if (A09(new String[]{str, str2}, i2)) {
                File A012 = A01(this.A02.A00, i2);
                r3.A01 = new File(A012, str);
                r3.A00 = new File(A012, str2);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(java.io.InputStream r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            X.0tz r0 = r5.A02     // Catch:{ IOException -> 0x0037 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0037 }
            java.io.File r2 = A01(r0, r8)     // Catch:{ IOException -> 0x0037 }
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0037 }
            r1.<init>()     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/storing user notice for "
            r1.append(r0)     // Catch:{ IOException -> 0x0037 }
            r1.append(r8)     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0037 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0037 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0037 }
            r0.<init>(r2, r7)     // Catch:{ IOException -> 0x0037 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0037 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0037 }
            X.AnonymousClass1XI.A0H(r6, r1)     // Catch:{ all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0037 }
            return r4
        L_0x0032:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/storeUserNoticeContent/failed to store"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13I.A08(java.io.InputStream, java.lang.String, int):boolean");
    }

    public final boolean A09(String[] strArr, int i2) {
        File[] listFiles;
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, strArr);
        File A012 = A01(this.A02.A00, i2);
        if (!(A012 == null || (listFiles = A012.listFiles()) == null)) {
            for (File name : listFiles) {
                hashSet.remove(name.getName());
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        StringBuilder sb = new StringBuilder("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        sb.append(i2);
        sb.append(" files exists: ");
        sb.append(isEmpty);
        Log.i(sb.toString());
        return isEmpty;
    }
}
