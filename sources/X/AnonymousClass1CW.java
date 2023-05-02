package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1CW  reason: invalid class name */
public class AnonymousClass1CW extends AnonymousClass15L {
    public AnonymousClass1CW(AnonymousClass11X r1) {
        super(r1);
    }

    public Integer A00(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(A02));
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder("key-value-store/getIntProp/Invalid int value: ");
            sb.append(A02);
            Log.e(sb.toString(), e2);
            return null;
        }
    }

    public Long A01(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A02));
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder("key-value-store/getLongProp/Invalid long value: ");
            sb.append(A02);
            Log.e(sb.toString(), e2);
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r2 = "prop_value"
            X.11X r0 = r10.A00
            X.0tf r3 = r0.get()
            java.lang.String r4 = "wa_props"
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ all -> 0x0043 }
            r0 = 0
            r8[r0] = r2     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "prop_name=?"
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ all -> 0x0043 }
            r9[r0] = r11     // Catch:{ all -> 0x0043 }
            r6 = 0
            java.lang.String r7 = "CONTACT_PROPS"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x003a
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x003a
            int r0 = r1.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0035 }
            r1.close()     // Catch:{ all -> 0x0043 }
            r3.close()
            return r0
        L_0x0035:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003a:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x0043 }
        L_0x003f:
            r3.close()
            return r6
        L_0x0043:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CW.A02(java.lang.String):java.lang.String");
    }

    public List A03(String str) {
        String A02 = A02(str);
        if (A02 == null) {
            return null;
        }
        String[] split = A02.split(",");
        ArrayList arrayList = new ArrayList();
        int length = split.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = split[i2];
            try {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                i2++;
            } catch (NumberFormatException e2) {
                StringBuilder sb = new StringBuilder("key-value-store/getLongListProp/Invalid long value: ");
                sb.append(str2);
                Log.e(sb.toString(), e2);
                return null;
            }
        }
        return arrayList;
    }

    public synchronized Set A04(String str) {
        HashSet hashSet;
        String A02 = A02(str);
        hashSet = new HashSet();
        if (A02 != null) {
            try {
                JSONArray jSONArray = new JSONArray(A02);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    hashSet.add(jSONArray.getString(i2));
                }
            } catch (JSONException e2) {
                throw new IllegalStateException("key-value-store/getStringSetProp:", e2);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            X.11X r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0037 }
            X.0tf r4 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0037 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wa_props"
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "prop_name=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0032 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x0032 }
            X.AnonymousClass15L.A02(r4, r3, r2, r1)     // Catch:{ all -> 0x0032 }
            goto L_0x002e
        L_0x001b:
            r0 = 2
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0032 }
            r1.<init>(r0)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "prop_name"
            r1.put(r0, r6)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = "prop_value"
            r1.put(r0, r7)     // Catch:{ all -> 0x0032 }
            X.AnonymousClass15L.A04(r1, r4, r3)     // Catch:{ all -> 0x0032 }
        L_0x002e:
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0037 }
            return
        L_0x0032:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            java.lang.String r1 = "key-value-store/unable to set prop:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CW.A05(java.lang.String, java.lang.String):void");
    }

    public synchronized void A06(String str, Set set) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        A05(str, jSONArray.toString());
    }
}
