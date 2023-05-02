package X;

import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.0hO  reason: invalid class name and case insensitive filesystem */
public class C10600hO implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ List A01;

    public C10600hO(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = list;
    }

    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", AnonymousClass000.A0g("Failed to delete file which is a directory ", file2));
        }
        if (!file.renameTo(file2)) {
            StringBuilder A0r = AnonymousClass000.A0r("Failed to rename ");
            A0r.append(file);
            Log.e("AtomicFile", AnonymousClass000.A0e(file2, " to ", A0r));
        }
    }

    public static void A01(String str, String str2, XmlSerializer xmlSerializer) {
        if (!TextUtils.isEmpty(str2)) {
            xmlSerializer.attribute((String) null, str, str2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(1:4)|5|6|7|8|(15:10|11|12|13|(18:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|(3:33|(2:35|92)(1:93)|36)|91|37|(4:40|(2:42|97)(1:96)|94|38)|95|43|14)|90|44|45|46|49|(3:51|52|53)|54|55|60|61)(4:62|63|64|67)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0054 A[SYNTHETIC, Splitter:B:10:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01b3 A[SYNTHETIC, Splitter:B:73:0x01b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = r1.A00
            java.util.List r2 = r1.A01
            r0.A05(r2)
            java.io.File r5 = r0.A02
            java.lang.String r11 = "share_targets"
            r10 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".new"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".bak"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r8 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01a2 }
            if (r0 == 0) goto L_0x0044
            A00(r1, r5)     // Catch:{ Exception -> 0x01a2 }
        L_0x0044:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x004a }
            r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004a }
            goto L_0x0059
        L_0x004a:
            java.io.File r0 = r6.getParentFile()     // Catch:{ Exception -> 0x01a2 }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x01a2 }
            if (r0 == 0) goto L_0x0189
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0195 }
            r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0195 }
        L_0x0059:
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x01a4 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x01a4 }
            org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "UTF_8"
            r8.setOutput(r9, r0)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x01a4 }
            r8.startDocument(r10, r0)     // Catch:{ Exception -> 0x01a4 }
            r8.startTag(r10, r11)     // Catch:{ Exception -> 0x01a4 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x01a4 }
        L_0x0073:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x015c
            java.lang.Object r2 = r16.next()     // Catch:{ Exception -> 0x01a4 }
            X.0OO r2 = (X.AnonymousClass0OO) r2     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r4 = "target"
            r8.startTag(r10, r4)     // Catch:{ Exception -> 0x01a4 }
            X.04S r14 = r2.A00     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r14.A0D     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "id"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
            java.lang.CharSequence r0 = r14.A0B     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "short_label"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
            int r0 = r14.A02     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "rank"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x01a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01a4 }
            if (r0 != 0) goto L_0x00b6
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "long_label"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x00b6:
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x01a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01a4 }
            if (r0 != 0) goto L_0x00c9
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "disabled_message"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x00c9:
            android.content.ComponentName r0 = r14.A04     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r1 = r0.flattenToString()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "component"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x00d6:
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x01a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01a4 }
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "icon_resource_name"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x00e3:
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x01a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01a4 }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "icon_bitmap_path"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x00f0:
            android.content.Intent[] r1 = r14.A0P     // Catch:{ Exception -> 0x01a4 }
            int r0 = r1.length     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x01a4 }
            android.content.Intent[] r13 = (android.content.Intent[]) r13     // Catch:{ Exception -> 0x01a4 }
            int r12 = r13.length     // Catch:{ Exception -> 0x01a4 }
            r3 = 0
        L_0x00fb:
            if (r3 >= r12) goto L_0x0133
            r15 = r13[r3]     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = "intent"
            r8.startTag(r10, r2)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r15.getAction()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "action"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x012d
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "targetPackage"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "targetClass"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x01a4 }
        L_0x012d:
            r8.endTag(r10, r2)     // Catch:{ Exception -> 0x01a4 }
            int r3 = r3 + 1
            goto L_0x00fb
        L_0x0133:
            java.util.Set r0 = r14.A0F     // Catch:{ Exception -> 0x01a4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x01a4 }
        L_0x0139:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x01a4 }
            if (r0 == 0) goto L_0x0157
            java.lang.String r2 = X.AnonymousClass000.A0m(r3)     // Catch:{ Exception -> 0x01a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01a4 }
            if (r0 != 0) goto L_0x0139
            java.lang.String r1 = "categories"
            r8.startTag(r10, r1)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r0 = "name"
            A01(r0, r2, r8)     // Catch:{ Exception -> 0x01a4 }
            r8.endTag(r10, r1)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x0139
        L_0x0157:
            r8.endTag(r10, r4)     // Catch:{ Exception -> 0x01a4 }
            goto L_0x0073
        L_0x015c:
            r8.endTag(r10, r11)     // Catch:{ Exception -> 0x01a4 }
            r8.endDocument()     // Catch:{ Exception -> 0x01a4 }
            r9.flush()     // Catch:{ Exception -> 0x01a4 }
            r7.flush()     // Catch:{ Exception -> 0x01a4 }
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x0171 }
            r0.sync()     // Catch:{ IOException -> 0x0171 }
            r0 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x017b
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x01a4 }
        L_0x017b:
            r7.close()     // Catch:{ IOException -> 0x017f }
            goto L_0x0185
        L_0x017f:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)     // Catch:{ Exception -> 0x01a4 }
        L_0x0185:
            A00(r6, r5)     // Catch:{ Exception -> 0x01a4 }
            return
        L_0x0189:
            java.lang.String r0 = "Failed to create directory for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)     // Catch:{ Exception -> 0x01a2 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01a2 }
            goto L_0x01a1
        L_0x0195:
            r2 = move-exception
            java.lang.String r0 = "Failed to create new file "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)     // Catch:{ Exception -> 0x01a2 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x01a2 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01a2 }
        L_0x01a1:
            throw r1     // Catch:{ Exception -> 0x01a2 }
        L_0x01a2:
            r4 = move-exception
            goto L_0x01a6
        L_0x01a4:
            r4 = move-exception
            r8 = r7
        L_0x01a6:
            java.lang.String r3 = "Failed to write to file "
            java.lang.String r1 = X.AnonymousClass000.A0g(r3, r5)
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r4)
            if (r8 == 0) goto L_0x01e0
            java.io.FileDescriptor r0 = r8.getFD()     // Catch:{ IOException -> 0x01bb }
            r0.sync()     // Catch:{ IOException -> 0x01bb }
            goto L_0x01bd
        L_0x01bb:
            r0 = 0
            goto L_0x01be
        L_0x01bd:
            r0 = 1
        L_0x01be:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)
        L_0x01c7:
            r8.close()     // Catch:{ IOException -> 0x01cb }
            goto L_0x01d1
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)
        L_0x01d1:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "Failed to delete new file "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r6)
            android.util.Log.e(r2, r0)
        L_0x01e0:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r3)
            java.lang.String r1 = X.AnonymousClass000.A0f(r5, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10600hO.run():void");
    }
}
