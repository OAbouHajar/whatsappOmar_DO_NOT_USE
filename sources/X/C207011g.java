package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.11g  reason: invalid class name and case insensitive filesystem */
public class C207011g implements C207111h {
    public AnonymousClass2HS A00;
    public boolean A01;
    public final C16300so A02;
    public final AnonymousClass2HR A03;
    public final C206711d A04;
    public final C206411a A05;
    public final C14710pd A06;

    public C207011g(C16300so r3, C16980tz r4, C206911f r5, C206711d r6, C206411a r7, C14710pd r8) {
        this.A06 = r8;
        this.A02 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = new AnonymousClass2HR(r4.A00, r3, r5, r8);
    }

    public static final Set A00(List list, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!set.isEmpty()) {
            for (Object next : list) {
                if (set.contains(next)) {
                    linkedHashSet.add(next);
                    set.remove(next);
                }
            }
        }
        return linkedHashSet;
    }

    public List A01(String str, int i2, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr : this.A04.A02()) {
            if (iArr != null) {
                arrayList2.add(new C37781pj(iArr));
            }
        }
        C206411a r3 = this.A05;
        synchronized (r3) {
            List list = r3.A00;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                ArrayList arrayList3 = new ArrayList();
                String string = ((SharedPreferences) r3.A02.A01.get()).getString("top_emojis", (String) null);
                if (string != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            arrayList3.add(C37941pz.A00(jSONArray.getString(i3)));
                        }
                        r3.A00 = arrayList3;
                        arrayList = new ArrayList(arrayList3);
                    } catch (JSONException e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("topemojisstore/get-top-emojis/failed ");
                        sb.append(e2);
                        Log.e(sb.toString());
                        arrayList = new ArrayList(C206411a.A03);
                    }
                } else {
                    arrayList = new ArrayList(C206411a.A03);
                }
            }
        }
        return A02(str, arrayList2, arrayList, i2, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(java.lang.String r19, java.util.List r20, java.util.List r21, int r22, boolean r23) {
        /*
            r18 = this;
            java.lang.String r0 = r19.trim()
            java.lang.String r8 = X.AnonymousClass1ZW.A09(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            if (r23 == 0) goto L_0x0095
            r12 = 1
            java.util.Set r0 = r7.A03(r8, r9, r10, r11, r12)
        L_0x001c:
            r1.addAll(r0)
        L_0x001f:
            X.0pd r3 = r7.A06
            r2 = 2880(0xb40, float:4.036E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 != 0) goto L_0x0036
            X.01T r0 = X.AnonymousClass2HP.A00
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.removeAll(r0)
        L_0x0036:
            int r0 = r1.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x0043:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r6 = r10.next()
            X.1pj r6 = (X.C37781pj) r6
            int r0 = r5.size()
            if (r0 >= r11) goto L_0x00ca
            int[] r9 = r6.A00
            int r0 = r9.length
            r8 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0082
            r0 = 2
            int[] r1 = new int[r0]
            r0 = r9[r8]
            r1[r8] = r0
            r0 = 65039(0xfe0f, float:9.1139E-41)
            r1[r2] = r0
            X.1pj r7 = new X.1pj
            r7.<init>((int[]) r1)
            int[] r1 = r7.A00
            X.20a r0 = new X.20a
            r0.<init>(r1)
            long r3 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r0, r2)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0082
            r5.add(r7)
            goto L_0x0043
        L_0x0082:
            X.20a r0 = new X.20a
            r0.<init>(r9)
            long r3 = com.obwhatsapp.emoji.EmojiDescriptor.A00(r0, r8)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            r5.add(r6)
            goto L_0x0043
        L_0x0095:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a3
            r1.addAll(r9)
            r1.addAll(r10)
            goto L_0x001f
        L_0x00a3:
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            java.util.Set r0 = r12.A03(r13, r14, r15, r16, r17)
            r1.addAll(r0)
            int r0 = r1.size()
            if (r0 >= r11) goto L_0x001f
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 0
            java.util.Set r0 = r12.A03(r13, r14, r15, r16, r17)
            goto L_0x001c
        L_0x00ca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207011g.A02(java.lang.String, java.util.List, java.util.List, int, boolean):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A03(java.lang.String r10, java.util.List r11, java.util.List r12, int r13, boolean r14) {
        /*
            r9 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            int r0 = r5.size()
            if (r0 >= r13) goto L_0x00c6
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x001e
            X.0so r3 = r9.A02
            r2 = 0
            r1 = 0
            java.lang.String r0 = "emoji dictionary is not prepared yet"
            r3.AcB(r0, r2, r1)
        L_0x001d:
            return r5
        L_0x001e:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r8 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = "SELECT DISTINCT symbol FROM emoji_search_tag WHERE type=? AND ("
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "tag"
            r2.append(r0)
            if (r14 == 0) goto L_0x0082
            java.lang.String r0 = " = "
        L_0x0036:
            r2.append(r0)
            java.lang.String r0 = "? OR "
            r2.append(r0)
            java.lang.String r6 = "symbol"
            r2.append(r6)
            java.lang.String r0 = "=?)"
            r2.append(r0)
            java.lang.String r0 = " ORDER BY _id ASC LIMIT ?"
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r0 = 4
            java.lang.String[] r3 = new java.lang.String[r0]
            r2 = 0
            r7 = 1
            java.lang.String r0 = "1"
            r3[r2] = r0
            if (r14 == 0) goto L_0x0070
            r0 = r10
        L_0x005e:
            r3[r7] = r0
            r0 = 2
            r3[r0] = r10
            r2 = 3
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r3[r2] = r0
            X.01Q r7 = new X.01Q
            r7.<init>(r4, r3)
            goto L_0x0085
        L_0x0070:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r0 = "%"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x005e
        L_0x0082:
            java.lang.String r0 = " LIKE "
            goto L_0x0036
        L_0x0085:
            X.2HR r0 = r9.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c2 }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c2 }
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x00bd }
            java.lang.Object r2 = r7.A00     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r7.A01     // Catch:{ all -> 0x00bd }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00bd }
            android.database.Cursor r3 = r3.A08(r2, r0)     // Catch:{ all -> 0x00bd }
            int r2 = r3.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x00b6 }
        L_0x009d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r3.getString(r2)     // Catch:{ all -> 0x00b6 }
            X.1pj r0 = X.C37941pz.A00(r0)     // Catch:{ all -> 0x00b6 }
            r1.add(r0)     // Catch:{ all -> 0x00b6 }
            goto L_0x009d
        L_0x00af:
            r3.close()     // Catch:{ all -> 0x00bd }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c2 }
            goto L_0x00c6
        L_0x00b6:
            r0 = move-exception
            if (r3 == 0) goto L_0x00bc
            r3.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00c6:
            int r0 = r5.size()
            if (r0 >= r13) goto L_0x00d3
            java.util.Set r0 = A00(r11, r1)
            r5.addAll(r0)
        L_0x00d3:
            int r0 = r5.size()
            if (r0 >= r13) goto L_0x00e0
            java.util.Set r0 = A00(r12, r1)
            r5.addAll(r0)
        L_0x00e0:
            int r0 = r5.size()
            if (r0 >= r13) goto L_0x001d
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x001d
            int r0 = r1.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r4.addAll(r1)
            r3 = r9
            monitor-enter(r3)
            X.2HS r1 = r9.A00     // Catch:{ all -> 0x011f }
            if (r1 != 0) goto L_0x0117
            X.0pd r2 = r9.A06     // Catch:{ all -> 0x011f }
            r1 = 2880(0xb40, float:4.036E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x011f }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x0114
            X.2HU[] r0 = X.AnonymousClass2HT.A08     // Catch:{ all -> 0x011f }
        L_0x010c:
            X.2HS r1 = new X.2HS     // Catch:{ all -> 0x011f }
            r1.<init>(r0)     // Catch:{ all -> 0x011f }
            r9.A00 = r1     // Catch:{ all -> 0x011f }
            goto L_0x0117
        L_0x0114:
            X.2HU[] r0 = X.AnonymousClass2HT.A09     // Catch:{ all -> 0x011f }
            goto L_0x010c
        L_0x0117:
            monitor-exit(r3)
            java.util.Collections.sort(r4, r1)
            r5.addAll(r4)
            return r5
        L_0x011f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207011g.A03(java.lang.String, java.util.List, java.util.List, int, boolean):java.util.Set");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A6A() {
        /*
            r6 = this;
            X.2HR r0 = r6.A03
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x002d }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0028 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0028 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "emoji_search_tag"
            java.lang.String r0 = "type=?"
            r3.A01(r1, r0, r2)     // Catch:{ all -> 0x0028 }
            r4.A00()     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ all -> 0x002d }
            r5.close()
            return
        L_0x0028:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207011g.A6A():void");
    }

    public /* bridge */ /* synthetic */ Collection A8y(String str, int i2, boolean z2, boolean z3) {
        return A01(str, i2, false);
    }

    public void Ae3(boolean z2) {
        StringBuilder sb = new StringBuilder("emojidictionarystore/setIsFetched:");
        sb.append(z2);
        Log.i(sb.toString());
        this.A01 = z2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0035=Splitter:B:15:0x0035, B:7:0x0028=Splitter:B:7:0x0028} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r6 = this;
            X.2HR r0 = r6.A03
            X.0tf r5 = r0.get()
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "SELECT count(*) as count FROM emoji_search_tag WHERE type=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0036 }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x0036 }
            android.database.Cursor r1 = r4.A08(r3, r1)     // Catch:{ all -> 0x0036 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x002f }
        L_0x0028:
            r1.close()     // Catch:{ all -> 0x0036 }
            r5.close()
            return r2
        L_0x002f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x0035 }
        L_0x0035:
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207011g.getCount():int");
    }
}
