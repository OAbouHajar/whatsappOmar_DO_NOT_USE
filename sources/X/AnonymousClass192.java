package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.192  reason: invalid class name */
public class AnonymousClass192 {
    public final C216314v A00;
    public final C16900tq A01;
    public final C14710pd A02;

    public AnonymousClass192(C216314v r1, C16900tq r2, C14710pd r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final List A00(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("group_jid_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("user_jid_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("is_leave");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("timestamp");
        while (cursor2.moveToNext()) {
            long j2 = cursor2.getLong(columnIndexOrThrow);
            long j3 = cursor2.getLong(columnIndexOrThrow2);
            boolean z2 = false;
            if (cursor2.getLong(columnIndexOrThrow3) != 0) {
                z2 = true;
            }
            arrayList.add(new C39601sk(j2, j3, cursor2.getLong(columnIndexOrThrow4), z2));
        }
        return arrayList;
    }

    public final Map A01(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C39601sk r2 = (C39601sk) it.next();
            hashSet.add(Long.valueOf(r2.A00));
            hashSet2.add(Long.valueOf(r2.A02));
        }
        C216314v r1 = this.A00;
        Map A09 = r1.A09(C16060sN.class, hashSet);
        Map A092 = r1.A09(UserJid.class, hashSet2);
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C39601sk r5 = (C39601sk) it2.next();
            C16060sN r8 = (C16060sN) A09.get(Long.valueOf(r5.A00));
            UserJid userJid = (UserJid) A092.get(Long.valueOf(r5.A02));
            if (!(userJid == null || r8 == null)) {
                Object obj = hashMap.get(r8);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(r8, obj);
                }
                ((List) obj).add(new C30471cP(r8, userJid, r5.A01, r5.A03));
            }
        }
        return hashMap;
    }

    public void A02(C16060sN r6) {
        String[] strArr = {String.valueOf(this.A00.A01(r6))};
        C16800tf A022 = this.A01.A02();
        try {
            A022.A02.A01("group_past_participant_user", "group_jid_row_id = ?", strArr);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A03(C16060sN r8, UserJid userJid) {
        C216314v r0 = this.A00;
        String[] strArr = {String.valueOf(r0.A01(r8)), String.valueOf(r0.A01(userJid))};
        C16800tf A022 = this.A01.A02();
        try {
            A022.A02.A01("group_past_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", strArr);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A04(C16060sN r8, UserJid userJid, long j2, boolean z2) {
        C216314v r0 = this.A00;
        long A012 = r0.A01(r8);
        long A013 = r0.A01(userJid);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("group_jid_row_id", Long.valueOf(A012));
        contentValues.put("user_jid_row_id", Long.valueOf(A013));
        contentValues.put("is_leave", Boolean.valueOf(z2));
        contentValues.put("timestamp", Long.valueOf(j2));
        C16800tf A022 = this.A01.A02();
        try {
            A022.A02.A06(contentValues, "group_past_participant_user", 5);
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
