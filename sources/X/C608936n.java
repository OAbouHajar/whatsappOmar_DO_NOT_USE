package X;

import android.os.Build;
import android.view.MenuItem;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.36n  reason: invalid class name and case insensitive filesystem */
public class C608936n extends C16690tT {
    public final AnonymousClass01V A00;
    public final C16980tz A01;
    public final C16260sj A02;
    public final WeakReference A03;

    public C608936n(PhoneContactsSelector phoneContactsSelector, AnonymousClass01V r3, C16980tz r4, C16260sj r5) {
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = C13690nt.A0h(phoneContactsSelector);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            X.AnonymousClass00B.A00()
            X.0tz r0 = r15.A01
            android.content.Context r7 = r0.A00
            X.0sj r2 = r15.A02
            java.util.HashMap r1 = X.AnonymousClass000.A0x()
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            int r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "returning empty name map because contact permissions are denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001b:
            java.util.HashSet r8 = X.C13680ns.A0o()
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r7 = 0
            r11[r7] = r0
            java.lang.String r0 = "display_name"
            r6 = 1
            r11[r6] = r0
            X.01V r0 = r15.A00
            android.content.ContentResolver r9 = r0.A0C()
            r12 = 0
            if (r9 != 0) goto L_0x0054
            java.lang.String r0 = "phone-contacts-selector/contact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003a:
            java.util.HashSet r8 = X.C13680ns.A0o()
        L_0x003e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r1 < r0) goto L_0x004a
            java.util.List r1 = r15.A0B()
            if (r1 != 0) goto L_0x004e
        L_0x004a:
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
        L_0x004e:
            X.4Hh r0 = new X.4Hh
            r0.<init>(r1, r8)
            return r0
        L_0x0054:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ Exception -> 0x00aa }
            android.net.Uri$Builder r5 = r0.buildUpon()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r4 = "directory"
            r2 = 0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00aa }
            android.net.Uri$Builder r0 = r5.appendQueryParameter(r4, r0)     // Catch:{ Exception -> 0x00aa }
            android.net.Uri r10 = r0.build()     // Catch:{ Exception -> 0x00aa }
            r14 = r12
            r13 = r12
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00aa }
            if (r9 != 0) goto L_0x0078
            java.lang.String r0 = "phone-contacts-selector/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x003a
        L_0x0078:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            long r2 = r9.getLong(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.String r5 = r9.getString(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r1.get(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a3 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0078
            X.2kd r0 = new X.2kd     // Catch:{ all -> 0x00a3 }
            r0.<init>(r5, r4, r2)     // Catch:{ all -> 0x00a3 }
            r8.add(r0)     // Catch:{ all -> 0x00a3 }
            goto L_0x0078
        L_0x009f:
            r9.close()     // Catch:{ Exception -> 0x00aa }
            goto L_0x003e
        L_0x00a3:
            r0 = move-exception
            if (r9 == 0) goto L_0x00a9
            r9.close()     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            throw r0     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            java.lang.String r0 = "phone-contacts-selector/contact exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x003a
        L_0x00b1:
            r0 = 3
            java.lang.String[] r8 = new java.lang.String[r0]
            r6 = 0
            java.lang.String r5 = "contact_id"
            r8[r6] = r5
            r3 = 1
            java.lang.String r4 = "mimetype"
            r8[r3] = r4
            r0 = 2
            java.lang.String r2 = "data2"
            r8[r0] = r2
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.String r3 = "vnd.android.cursor.item/name"
            r10[r6] = r3
            android.content.ContentResolver r6 = r7.getContentResolver()
            android.net.Uri r7 = android.provider.ContactsContract.Data.CONTENT_URI
            r11 = 0
            java.lang.String r9 = "mimetype IN (?)"
            android.database.Cursor r7 = r6.query(r7, r8, r9, r10, r11)
            if (r7 != 0) goto L_0x00e0
            java.lang.String r0 = "null cursor returned from structured name query"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x001b
        L_0x00e0:
            int r8 = r7.getColumnIndex(r5)     // Catch:{ all -> 0x016d }
            r0 = -1
            if (r8 != r0) goto L_0x00ed
            java.lang.String r0 = "invalid column index for the raw contact id"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0168
        L_0x00ed:
            int r6 = r7.getColumnIndex(r4)     // Catch:{ all -> 0x016d }
            if (r6 != r0) goto L_0x00f9
            java.lang.String r0 = "invalid column index for the mimetype"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0168
        L_0x00f9:
            int r5 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x016d }
            if (r5 != r0) goto L_0x0105
            java.lang.String r0 = "invalid column index for the given name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0168
        L_0x0105:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0168
            boolean r0 = r7.isNull(r8)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0117
            java.lang.String r0 = "null raw contact id for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0105
        L_0x0117:
            boolean r0 = r7.isNull(r6)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "null mimetype for record; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0105
        L_0x0123:
            long r9 = r7.getLong(r8)     // Catch:{ all -> 0x016d }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x016d }
            java.lang.Object r0 = r1.get(r9)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x016d }
            if (r0 != 0) goto L_0x0105
            java.lang.String r4 = r7.getString(r6)     // Catch:{ all -> 0x016d }
            if (r4 != 0) goto L_0x013f
            java.lang.String r0 = "mimetype was returned as null even though cursor said it wasn't null; skipping"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0105
        L_0x013f:
            int r2 = r4.hashCode()     // Catch:{ all -> 0x016d }
            r0 = -1079224304(0xffffffffbfac5810, float:-1.3464375)
            if (r2 != r0) goto L_0x0156
            boolean r0 = r4.equals(r3)     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = r7.getString(r5)     // Catch:{ all -> 0x016d }
            r1.put(r9, r0)     // Catch:{ all -> 0x016d }
            goto L_0x0105
        L_0x0156:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "unrecognized mimetype; skipping; mimetype="
            r2.append(r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r2)     // Catch:{ all -> 0x016d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            goto L_0x0105
        L_0x0168:
            r7.close()
            goto L_0x001b
        L_0x016d:
            r0 = move-exception
            if (r7 == 0) goto L_0x0173
            r7.close()     // Catch:{ all -> 0x0173 }
        L_0x0173:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C608936n.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83594Hh r14 = (C83594Hh) obj;
        PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A03.get();
        if (phoneContactsSelector != null && !phoneContactsSelector.AIm()) {
            phoneContactsSelector.A0K = null;
            if (Build.VERSION.SDK_INT >= 18) {
                phoneContactsSelector.A0b.removeAll(r14.A00);
            } else {
                Iterator it = phoneContactsSelector.A0a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!r14.A01.contains(next)) {
                        phoneContactsSelector.A0b.remove(next);
                    }
                }
            }
            phoneContactsSelector.A0Y.A01();
            ArrayList arrayList = phoneContactsSelector.A0a;
            arrayList.clear();
            arrayList.addAll(r14.A01);
            List<C55902kd> list = phoneContactsSelector.A0b;
            for (C55902kd r8 : list) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C55902kd r6 = (C55902kd) it2.next();
                    if (r6.A04 == r8.A04) {
                        r6.A03 = true;
                    }
                }
            }
            if (list.isEmpty()) {
                phoneContactsSelector.A36();
            }
            phoneContactsSelector.A37(list.size());
            MenuItem menuItem = phoneContactsSelector.A00;
            if (menuItem != null) {
                menuItem.setVisible(!arrayList.isEmpty());
            }
            PhoneContactsSelector.A03(phoneContactsSelector);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0B() {
        /*
            r12 = this;
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r1 = "contact_id"
            r8[r0] = r1
            X.01V r0 = r12.A00
            android.content.ContentResolver r6 = r0.A0C()
            r9 = 0
            if (r6 != 0) goto L_0x001b
            java.lang.String r0 = "phone-contacts-selector/contact cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r9
        L_0x001b:
            android.net.Uri r7 = android.provider.ContactsContract.DeletedContacts.CONTENT_URI     // Catch:{ Exception -> 0x004e }
            r11 = r9
            r10 = r9
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x004e }
            if (r4 == 0) goto L_0x0041
            int r3 = r4.getColumnIndex(r1)     // Catch:{ all -> 0x0047 }
        L_0x0029:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003d
            int r0 = r4.getInt(r3)     // Catch:{ all -> 0x0047 }
            long r1 = (long) r0     // Catch:{ all -> 0x0047 }
            X.2kd r0 = new X.2kd     // Catch:{ all -> 0x0047 }
            r0.<init>(r9, r9, r1)     // Catch:{ all -> 0x0047 }
            r5.add(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0029
        L_0x003d:
            r4.close()     // Catch:{ Exception -> 0x004e }
            return r5
        L_0x0041:
            java.lang.String r0 = "phone-contacts-selector/search deleted contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0047 }
            return r9
        L_0x0047:
            r0 = move-exception
            if (r4 == 0) goto L_0x004d
            r4.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            r1 = move-exception
            java.lang.String r0 = "phone-contacts-selector/query deleted contact exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C608936n.A0B():java.util.List");
    }
}
