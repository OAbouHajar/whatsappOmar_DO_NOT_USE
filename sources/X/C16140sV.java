package X;

import android.database.AbstractCursor;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0sV  reason: invalid class name and case insensitive filesystem */
public class C16140sV extends AbstractCursor {
    public Map A00 = null;
    public Map A01 = null;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C16080sP A07;
    public final C16110sS A08;
    public final C16120sT A09;
    public final C16100sR A0A;
    public final C15880s3 A0B;
    public final List A0C;
    public final String[] A0D;

    public C16140sV(C16080sP r14, C16110sS r15, C16130sU r16, C16120sT r17, C16100sR r18, C15880s3 r19, List list, String[] strArr) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr2;
        String[] strArr3 = strArr;
        if (strArr == null) {
            str = "_id";
            str2 = "display_name";
            str3 = "is_group";
            str4 = "call_rank";
            str5 = "message_rank";
            strArr2 = new String[]{str, str2, str3, str4, str5};
        } else {
            str = "_id";
            str2 = "display_name";
            str3 = "is_group";
            str4 = "call_rank";
            str5 = "message_rank";
            HashSet hashSet = new HashSet(Arrays.asList(new String[]{str, str2, str3, str4, str5}));
            ArrayList arrayList = new ArrayList();
            int length = strArr3.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str6 = strArr[i2];
                if (hashSet.contains(str6)) {
                    arrayList.add(str6);
                }
            }
            strArr2 = (String[]) arrayList.toArray(new String[0]);
        }
        if (!r16.A01.A00.A05(C15910s6.A10)) {
            LinkedList linkedList = new LinkedList(Arrays.asList(strArr2));
            linkedList.remove(str4);
            linkedList.remove(str5);
            strArr2 = (String[]) linkedList.toArray(new String[0]);
        }
        this.A0D = strArr2;
        this.A0C = new ArrayList(list);
        this.A07 = r14;
        this.A0B = r19;
        this.A0A = r18;
        this.A08 = r15;
        this.A09 = r17;
        this.A04 = C43041zF.A00(str, strArr2);
        this.A03 = C43041zF.A00(str2, strArr2);
        this.A05 = C43041zF.A00(str3, strArr2);
        this.A02 = C43041zF.A00(str4, strArr2);
        this.A06 = C43041zF.A00(str5, strArr2);
    }

    public final C16010sH A00(int i2) {
        if (i2 >= 0) {
            List list = this.A0C;
            if (i2 < list.size()) {
                return (C16010sH) list.get(i2);
            }
        }
        StringBuilder sb = new StringBuilder("Position: ");
        sb.append(i2);
        sb.append(", size = ");
        sb.append(this.A0C.size());
        throw new IllegalStateException(sb.toString());
    }

    public String[] getColumnNames() {
        return this.A0D;
    }

    public int getCount() {
        return this.A0C.size();
    }

    public double getDouble(int i2) {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.1Z8} */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getInt(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x01f2
            int r0 = r13.getPosition()
            X.0sH r5 = r13.A00(r0)
            int r0 = r13.A05
            if (r14 != r0) goto L_0x0014
            boolean r0 = r5.A0J()
            return r0
        L_0x0014:
            int r0 = r13.A02
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 != r0) goto L_0x00eb
            java.util.Map r4 = r13.A00
            if (r4 != 0) goto L_0x00df
            X.0sS r4 = r13.A08
            X.0s3 r0 = r13.A0B
            java.lang.String r9 = r0.A01
            r6 = 0
            X.C18450wi.A0H(r9, r6)
            X.0sU r2 = r4.A01
            X.0s4 r0 = r2.A01
            X.0s5 r1 = r0.A00
            X.0s8 r0 = X.C15910s6.A10
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x00db
            X.0t3 r0 = r2.A00
            long r10 = r0.A00()
            X.0sD r7 = r2.A02
            java.lang.String r8 = "metadata/last_call_ranking_time"
            java.lang.String r3 = X.C15970sD.A00(r9, r8)
            android.content.SharedPreferences r2 = r7.A01()
            r0 = 0
            long r0 = r2.getLong(r3, r0)
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00db
            java.lang.String r3 = X.C15970sD.A00(r9, r8)
            android.content.SharedPreferences r0 = r7.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.0t3 r0 = r7.A01
            long r0 = r0.A00()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r3, r0)
            r0.apply()
            X.1D0 r2 = r4.A00
            r1 = 1000(0x3e8, float:1.401E-42)
            X.4xx r0 = new X.4xx
            r0.<init>()
            java.util.ArrayList r0 = r2.A05(r0, r6, r1)
            X.22u r2 = new X.22u
            r2.<init>(r0)
            X.5FM r1 = new X.5FM
            r1.<init>(r4)
            r0 = 1
            X.22K r3 = new X.22K
            r3.<init>(r1, r2, r0)
            r1 = 25
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r1)
            X.58y r2 = new X.58y
            r2.<init>(r0, r3)
            X.5FN r1 = new X.5FN
            r1.<init>(r4)
            X.58x r0 = new X.58x
            r0.<init>(r1, r2)
            X.58w r1 = new X.58w
            r1.<init>(r0)
            X.58v r0 = new X.58v
            r0.<init>(r1)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            X.57i r3 = new X.57i
            r3.<init>(r0)
        L_0x00b7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r2 = r3.next()
            X.4Vu r2 = (X.C87194Vu) r2
            java.lang.Object r0 = r2.A01
            X.C18450wi.A0B(r0)
            X.1po r0 = (X.C37831po) r0
            X.1lE r0 = r0.A0C
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.C18450wi.A0B(r1)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r1, r0)
            goto L_0x00b7
        L_0x00db:
            X.1Z8 r4 = X.AnonymousClass1Z8.A00
        L_0x00dd:
            r13.A00 = r4
        L_0x00df:
            X.0rv r1 = r5.A0E
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x01d8
            java.util.Map r0 = r13.A00
            goto L_0x01ce
        L_0x00eb:
            int r0 = r13.A06
            if (r14 != r0) goto L_0x01d9
            java.util.Map r0 = r13.A01
            if (r0 != 0) goto L_0x01c2
            X.0sT r6 = r13.A09
            X.0s3 r0 = r13.A0B
            java.lang.String r9 = r0.A01
            r4 = 0
            X.C18450wi.A0H(r9, r4)
            X.0sU r2 = r6.A02
            X.0s4 r0 = r2.A01
            X.0s5 r1 = r0.A00
            X.0s8 r0 = X.C15910s6.A10
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x01a3
            X.0t3 r0 = r2.A00
            long r10 = r0.A00()
            X.0sD r7 = r2.A02
            java.lang.String r8 = "metadata/last_message_ranking_time"
            java.lang.String r3 = X.C15970sD.A00(r9, r8)
            android.content.SharedPreferences r2 = r7.A01()
            r0 = 0
            long r0 = r2.getLong(r3, r0)
            long r10 = r10 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01a3
            java.lang.String r3 = X.C15970sD.A00(r9, r8)
            android.content.SharedPreferences r0 = r7.A01()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            X.0t3 r0 = r7.A01
            long r0 = r0.A00()
            android.content.SharedPreferences$Editor r0 = r2.putLong(r3, r0)
            r0.apply()
            X.0xS r0 = r6.A00
            r0.A07(r4)
            X.0rt r0 = r6.A01
            java.util.Collection r0 = r0.A0A()
            X.C18450wi.A0B(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0160:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0rx r0 = (X.C15840rx) r0
            X.0rv r0 = r0.A05()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0179
            r3.add(r1)
            goto L_0x0160
        L_0x0179:
            r6.add(r1)
            goto L_0x0160
        L_0x017d:
            java.util.Map r4 = X.C16120sT.A00(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x018a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0rx r0 = (X.C15840rx) r0
            X.0rv r0 = r0.A05()
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x018a
            r3.add(r1)
            goto L_0x018a
        L_0x01a3:
            X.1Z8 r0 = X.AnonymousClass1Z8.A00
            X.4Vj r2 = new X.4Vj
            r2.<init>(r0, r0)
            goto L_0x01b4
        L_0x01ab:
            java.util.Map r0 = X.C16120sT.A00(r3)
            X.4Vj r2 = new X.4Vj
            r2.<init>(r4, r0)
        L_0x01b4:
            java.util.Map r0 = r2.A01
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
            r13.A01 = r1
            java.util.Map r0 = r2.A00
            r1.putAll(r0)
        L_0x01c2:
            X.0rv r1 = r5.A0E
            java.util.Map r0 = r13.A01
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x01d8
            java.util.Map r0 = r13.A01
        L_0x01ce:
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r12 = r0.intValue()
        L_0x01d8:
            return r12
        L_0x01d9:
            java.lang.String r0 = "Column #"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r14)
            java.lang.String r0 = " is not an int."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f2:
            java.lang.String r1 = "Invalid column index"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16140sV.getInt(int):int");
    }

    public long getLong(int i2) {
        throw new UnsupportedOperationException();
    }

    public short getShort(int i2) {
        throw new UnsupportedOperationException();
    }

    public String getString(int i2) {
        if (i2 != -1) {
            C16010sH A002 = A00(getPosition());
            if (i2 == this.A04) {
                C16100sR r1 = this.A0A;
                C15880s3 r2 = this.A0B;
                Jid A082 = A002.A08(C15830rv.class);
                if (A082 == null) {
                    return null;
                }
                return r1.A01.A03(r2, A082.getRawString());
            } else if (i2 == this.A03) {
                return this.A07.A07(A002, false).A01;
            } else {
                if (i2 == this.A05 || i2 == this.A02 || i2 == this.A06) {
                    return Integer.toString(getInt(i2));
                }
                StringBuilder sb = new StringBuilder("Column #");
                sb.append(i2);
                sb.append(" is not a string.");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Invalid column index");
        }
    }

    public boolean isNull(int i2) {
        return false;
    }
}
