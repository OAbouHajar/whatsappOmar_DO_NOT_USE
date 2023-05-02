package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
public class C10560hK implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ File A01;

    public C10560hK(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, File file) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = file;
    }

    public static String A00(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue((String) null, str) : attributeValue;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01a4 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:87:0x01a4=Splitter:B:87:0x01a4, B:82:0x019c=Splitter:B:82:0x019c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r22 = this;
            r2 = r22
            java.io.File r1 = r2.A01     // Catch:{ Exception -> 0x01d5 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x0050
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x0050
        L_0x0016:
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = r2.A00     // Catch:{ Exception -> 0x01d5 }
            r21 = r0
            java.io.File r1 = r0.A01     // Catch:{ Exception -> 0x01d5 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01d5 }
            if (r0 == 0) goto L_0x0046
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x0046
        L_0x002e:
            r0 = r21
            java.util.Map r0 = r0.A04     // Catch:{ Exception -> 0x01d5 }
            r20 = r0
            r0 = r21
            java.io.File r0 = r0.A02     // Catch:{ Exception -> 0x01d5 }
            r19 = r0
            r0 = r21
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x01d5 }
            r18 = r0
            X.00N r3 = new X.00N     // Catch:{ Exception -> 0x01d5 }
            r3.<init>()     // Catch:{ Exception -> 0x01d5 }
            goto L_0x005a
        L_0x0046:
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x002e
            r1.mkdirs()     // Catch:{ Exception -> 0x01d5 }
            goto L_0x002e
        L_0x0050:
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01d5 }
            if (r0 != 0) goto L_0x0016
            r1.mkdirs()     // Catch:{ Exception -> 0x01d5 }
            goto L_0x0016
        L_0x005a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01a5 }
            r0 = r19
            r2.<init>(r0)     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r19.exists()     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x019c
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "UTF_8"
            r4.setInput(r2, r0)     // Catch:{ all -> 0x01a0 }
        L_0x0070:
            int r1 = r4.next()     // Catch:{ all -> 0x01a0 }
            r0 = 1
            if (r1 == r0) goto L_0x019c
            r0 = 2
            if (r1 != r0) goto L_0x0070
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x01a0 }
            java.lang.String r1 = "target"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x01a0 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "id"
            java.lang.String r17 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "short_label"
            java.lang.String r16 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "rank"
            java.lang.String r0 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            int r13 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "long_label"
            java.lang.String r12 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "disabled_message"
            java.lang.String r11 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "component"
            java.lang.String r5 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00cc
            r10 = 0
            goto L_0x00d0
        L_0x00cc:
            android.content.ComponentName r10 = android.content.ComponentName.unflattenFromString(r5)     // Catch:{ all -> 0x01a0 }
        L_0x00d0:
            java.lang.String r0 = "icon_resource_name"
            java.lang.String r6 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "icon_bitmap_path"
            java.lang.String r5 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01a0 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x01a0 }
            r8.<init>()     // Catch:{ all -> 0x01a0 }
        L_0x00e5:
            int r7 = r4.next()     // Catch:{ all -> 0x01a0 }
            r0 = 1
            if (r7 == r0) goto L_0x014c
            r0 = 2
            if (r7 != r0) goto L_0x013f
            java.lang.String r7 = r4.getName()     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = "intent"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0113
            java.lang.String r0 = "categories"
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "name"
            java.lang.String r7 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x00e5
            r8.add(r7)     // Catch:{ all -> 0x01a0 }
            goto L_0x00e5
        L_0x0113:
            java.lang.String r0 = "action"
            java.lang.String r0 = A00(r0, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r7 = "targetPackage"
            java.lang.String r15 = A00(r7, r4)     // Catch:{ all -> 0x01a0 }
            java.lang.String r7 = "targetClass"
            java.lang.String r14 = A00(r7, r4)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00e5
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x01a0 }
            r7.<init>(r0)     // Catch:{ all -> 0x01a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x013b
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x013b
            r7.setClassName(r15, r14)     // Catch:{ all -> 0x01a0 }
        L_0x013b:
            r9.add(r7)     // Catch:{ all -> 0x01a0 }
            goto L_0x00e5
        L_0x013f:
            r0 = 3
            if (r7 != r0) goto L_0x00e5
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x01a0 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x00e5
        L_0x014c:
            X.04R r7 = new X.04R     // Catch:{ all -> 0x01a0 }
            r1 = r18
            r0 = r17
            r7.<init>((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ all -> 0x01a0 }
            X.04S r1 = r7.A00     // Catch:{ all -> 0x01a0 }
            r0 = r16
            r1.A0B = r0     // Catch:{ all -> 0x01a0 }
            r1.A02 = r13     // Catch:{ all -> 0x01a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0165
            r1.A0C = r12     // Catch:{ all -> 0x01a0 }
        L_0x0165:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x016d
            r1.A0A = r11     // Catch:{ all -> 0x01a0 }
        L_0x016d:
            if (r10 == 0) goto L_0x0171
            r1.A04 = r10     // Catch:{ all -> 0x01a0 }
        L_0x0171:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x0182
            r0 = 0
            android.content.Intent[] r0 = new android.content.Intent[r0]     // Catch:{ all -> 0x01a0 }
            java.lang.Object[] r0 = r9.toArray(r0)     // Catch:{ all -> 0x01a0 }
            android.content.Intent[] r0 = (android.content.Intent[]) r0     // Catch:{ all -> 0x01a0 }
            r1.A0P = r0     // Catch:{ all -> 0x01a0 }
        L_0x0182:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x018a
            r1.A0F = r8     // Catch:{ all -> 0x01a0 }
        L_0x018a:
            X.04S r0 = r7.A00()     // Catch:{ all -> 0x01a0 }
            X.0OO r1 = new X.0OO     // Catch:{ all -> 0x01a0 }
            r1.<init>(r0, r6, r5)     // Catch:{ all -> 0x01a0 }
            X.04S r0 = r1.A00     // Catch:{ all -> 0x01a0 }
            java.lang.String r0 = r0.A0D     // Catch:{ all -> 0x01a0 }
            r3.put(r0, r1)     // Catch:{ all -> 0x01a0 }
            goto L_0x0070
        L_0x019c:
            r2.close()     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01c1
        L_0x01a0:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01a4 }
        L_0x01a4:
            throw r0     // Catch:{ Exception -> 0x01a5 }
        L_0x01a5:
            r2 = move-exception
            r19.delete()     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = "Failed to load saved values from file "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = r19.getAbsolutePath()     // Catch:{ Exception -> 0x01d5 }
            r1.append(r0)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = ". Old state removed, new added"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r2)     // Catch:{ Exception -> 0x01d5 }
        L_0x01c1:
            r0 = r20
            r0.putAll(r3)     // Catch:{ Exception -> 0x01d5 }
            java.util.Collection r0 = r20.values()     // Catch:{ Exception -> 0x01d5 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x01d5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x01d5 }
            r0 = r21
            r0.A05(r1)     // Catch:{ Exception -> 0x01d5 }
            return
        L_0x01d5:
            r2 = move-exception
            java.lang.String r1 = "ShortcutInfoCompatSaver"
            java.lang.String r0 = "ShortcutInfoCompatSaver started with an exceptions "
            android.util.Log.w(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10560hK.run():void");
    }
}
