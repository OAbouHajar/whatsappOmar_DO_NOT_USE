package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.16r  reason: invalid class name and case insensitive filesystem */
public class C221116r {
    public static final String[] A0A = {"key_remote_jid", "key_from_me", "key_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender", "receiver", "type", "currency", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id", "background_id", "purchase_initiator"};
    public static final String[] A0B = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", "type", "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id", "background_id", "purchase_initiator"};
    public AnonymousClass1GR A00;
    public final C16040sK A01;
    public final C16440t3 A02;
    public final C216314v A03;
    public final C16900tq A04;
    public final AnonymousClass11I A05;
    public final AnonymousClass173 A06;
    public final AnonymousClass160 A07;
    public final C18250wO A08;
    public final AnonymousClass1Vo A09 = AnonymousClass1Vo.A00("PaymentTransactionStore", "database", "COMMON");

    public C221116r(C16040sK r4, C16440t3 r5, C216314v r6, C16900tq r7, AnonymousClass11I r8, AnonymousClass173 r9, AnonymousClass160 r10, C18250wO r11) {
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A07 = r10;
        this.A05 = r8;
        this.A04 = r7;
        this.A08 = r11;
        this.A06 = r9;
    }

    public static final int A00(ContentValues contentValues, C16800tf r5, AnonymousClass1Vt r6) {
        return r5.A02.A00("pay_transaction", contentValues, "id=?", new String[]{r6.A0K});
    }

    public static Pair A01() {
        return new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(608)});
    }

    public static Pair A02() {
        String num = Integer.toString(12);
        return new Pair("((type=? AND status=?) OR (type=? AND (status=? OR status=?)))", new String[]{Integer.toString(20), num, Integer.toString(10), num, Integer.toString(19)});
    }

    public static Pair A03() {
        return Pair.create(new String[]{"19", "12", "17", "608", String.valueOf(1), String.valueOf(2), "20", "10", String.valueOf(6), String.valueOf(7), String.valueOf(8), String.valueOf(9), "100", "300", "40", "415", String.valueOf(15), String.valueOf(16)}, "((status!=?) AND (status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND (status=? OR status=? OR status=?))))");
    }

    public static Pair A04(Pair pair, Pair pair2, String str) {
        if (TextUtils.isEmpty((CharSequence) pair.first)) {
            return pair2;
        }
        if (TextUtils.isEmpty((CharSequence) pair2.first)) {
            return pair;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append((String) pair.first);
        sb.append(") ");
        sb.append(str);
        sb.append(" (");
        sb.append((String) pair2.first);
        sb.append(")");
        String obj = sb.toString();
        Object obj2 = pair.second;
        int length = ((String[]) obj2).length;
        String[] strArr = new String[(((String[]) pair2.second).length + length)];
        System.arraycopy(obj2, 0, strArr, 0, length);
        Object obj3 = pair2.second;
        System.arraycopy(obj3, 0, strArr, ((String[]) pair.second).length, ((String[]) obj3).length);
        return new Pair(obj, strArr);
    }

    public static final Pair A05(Pair pair, boolean z2) {
        String str = z2 ? "currency_code" : "currency";
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(" !=? OR ");
        sb.append("metadata");
        sb.append(" LIKE ?)");
        return A04(pair, new Pair(sb.toString(), new String[]{((C35491m1) C35481m0.A06).A04, "%money%"}), "AND");
    }

    public static final Pair A06(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str2};
            str3 = "key_id=? OR id=?";
        } else {
            strArr = new String[]{str};
            str3 = "key_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static Pair A07(boolean z2) {
        return Pair.create(new String[]{"405", "106", "604", "408"}, z2 ? "(status IN (?, ?, ?, ?))" : "(status NOT IN (?, ?, ?, ?))");
    }

    public static Pair A08(int[] iArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        int length2 = iArr2.length;
        String[] strArr = new String[(length + length2)];
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("status=?");
            if (i2 != length - 1) {
                sb.append(" OR ");
            }
            strArr[i2] = String.valueOf(iArr[i2]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < length2; i3++) {
            sb2.append("type=?");
            if (i3 != length2 - 1) {
                sb2.append(" OR ");
            }
            strArr[length + i3] = String.valueOf(iArr2[i3]);
        }
        StringBuilder sb3 = new StringBuilder("((");
        sb3.append(sb);
        sb3.append(") AND (");
        sb3.append(sb2);
        sb3.append("))");
        return Pair.create(strArr, sb3.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ed, code lost:
        if (r1 != null) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A09(X.AnonymousClass1Vt r9, X.AnonymousClass1Vt r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0055
            boolean r0 = r9.A0J(r10)
            if (r0 != 0) goto L_0x0055
            X.1Vo r4 = r8.A09
            java.lang.String r0 = "writeTransactionToCValues skipping transaction with: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.1W2 r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0053
            int r0 = r0.A05()
        L_0x002f:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x0047
            int r2 = r0.A05()
        L_0x0047:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0053:
            r0 = 0
            goto L_0x002f
        L_0x0055:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            X.0rv r0 = r10.A0C
            java.lang.String r2 = "key_from_me"
            java.lang.String r1 = "key_remote_jid"
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = r0.getRawString()
            r3.put(r1, r0)
            boolean r0 = r10.A0Q
        L_0x006b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r2, r0)
        L_0x0072:
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0081
            java.lang.String r1 = r10.A0L
            java.lang.String r0 = "key_id"
            r3.put(r0, r1)
        L_0x0081:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x008f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x008f:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = r10.A0K
            java.lang.String r0 = "id"
            r3.put(r0, r1)
        L_0x009e:
            com.whatsapp.jid.UserJid r0 = r10.A0E
            if (r0 == 0) goto L_0x00ac
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "sender"
            r3.put(r0, r1)
        L_0x00ac:
            com.whatsapp.jid.UserJid r0 = r10.A0D
            if (r0 == 0) goto L_0x00b9
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "receiver"
            r3.put(r0, r1)
        L_0x00b9:
            if (r9 == 0) goto L_0x00d1
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r1 = r10.A0I
            X.1Vz r0 = X.C35481m0.A06
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00d8
        L_0x00d1:
            java.lang.String r1 = r10.A0I
            java.lang.String r0 = "currency"
            r3.put(r0, r1)
        L_0x00d8:
            X.1Vy r0 = r10.A08
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00f8
            X.1Vy r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x00f8:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x010d:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x0118
            if (r9 == 0) goto L_0x011f
            int r0 = r9.A02
        L_0x0118:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x011f:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0131
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x0131:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0140
            java.lang.String r1 = r10.A0H
            java.lang.String r0 = "credential_id"
            r3.put(r0, r1)
        L_0x0140:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r1 = r10.A0J
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
        L_0x014f:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x015e
            java.lang.String r1 = r10.A0F
            java.lang.String r0 = "bank_transaction_id"
            r3.put(r0, r1)
        L_0x015e:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x016d
            java.lang.String r1 = r10.A0M
            java.lang.String r0 = "request_key_id"
            r3.put(r0, r1)
        L_0x016d:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x01f0
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01f0
        L_0x0179:
            java.lang.String r0 = X.AnonymousClass1W1.A05(r2)
            r3.put(r1, r0)
        L_0x0180:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x01eb
            X.1W2 r1 = r9.A0A
            if (r1 == 0) goto L_0x01eb
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x0196
            r1.A0T(r0)
            X.1W2 r1 = r9.A0A
            int r0 = r9.A02
            r1.A0O(r0)
        L_0x0196:
            java.lang.String r0 = r1.A0K()
            r3.put(r2, r0)
        L_0x019d:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ac
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "country"
            r3.put(r0, r1)
        L_0x01ac:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x01c1
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x01c1:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.1lo r2 = r10.A01()
            if (r2 == 0) goto L_0x01df
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "background_id"
            r3.put(r0, r1)
            X.0wO r0 = r8.A08
            r0.A04(r2)
        L_0x01df:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x01eb:
            X.1W2 r1 = r10.A0A
            if (r1 == 0) goto L_0x019d
            goto L_0x0196
        L_0x01f0:
            if (r9 == 0) goto L_0x0180
            java.util.ArrayList r2 = r9.A0N
            if (r2 == 0) goto L_0x0180
            goto L_0x0179
        L_0x01f7:
            if (r9 == 0) goto L_0x0072
            X.0rv r0 = r9.A0C
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r0.getRawString()
            r3.put(r1, r0)
            boolean r0 = r9.A0Q
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A09(X.1Vt, X.1Vt):android.content.ContentValues");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        if (r0 != null) goto L_0x01a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.ContentValues A0A(X.AnonymousClass1Vt r9, X.AnonymousClass1Vt r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0055
            boolean r0 = r9.A0J(r10)
            if (r0 != 0) goto L_0x0055
            X.1Vo r4 = r8.A09
            java.lang.String r0 = "writeTransactionToCValuesV2 skipping transaction with: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.String r0 = r10.A0K
            r5.append(r0)
            java.lang.String r0 = " as status is not updated  old ts: "
            r5.append(r0)
            long r0 = r9.A06
            r5.append(r0)
            java.lang.String r3 = " counter: "
            r5.append(r3)
            X.1W2 r0 = r9.A0A
            r2 = 0
            if (r0 == 0) goto L_0x0053
            int r0 = r0.A05()
        L_0x002f:
            r5.append(r0)
            java.lang.String r0 = " new ts: "
            r5.append(r0)
            long r0 = r10.A06
            r5.append(r0)
            r5.append(r3)
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x0047
            int r2 = r0.A05()
        L_0x0047:
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r4.A06(r0)
            r0 = 0
            return r0
        L_0x0053:
            r0 = 0
            goto L_0x002f
        L_0x0055:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            X.0rv r1 = r10.A0C
            java.lang.String r6 = "remote_jid_row_id"
            r4 = -1
            if (r1 != 0) goto L_0x0068
            if (r9 == 0) goto L_0x0079
            X.0rv r1 = r9.A0C
            if (r1 == 0) goto L_0x0079
        L_0x0068:
            X.14v r0 = r8.A03
            long r1 = r0.A01(r1)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r3.put(r6, r0)
        L_0x0079:
            java.lang.String r0 = r10.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = r10.A0L
            java.lang.String r0 = "key_id"
            r3.put(r0, r1)
        L_0x0088:
            int r0 = r10.A03
            if (r0 == 0) goto L_0x0096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r3.put(r0, r1)
        L_0x0096:
            java.lang.String r0 = r10.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a5
            java.lang.String r1 = r10.A0K
            java.lang.String r0 = "id"
            r3.put(r0, r1)
        L_0x00a5:
            com.whatsapp.jid.UserJid r1 = r10.A0E
            if (r1 == 0) goto L_0x00b9
            X.14v r0 = r8.A03
            long r0 = r0.A01(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "sender_jid_row_id"
            r3.put(r0, r1)
        L_0x00b9:
            com.whatsapp.jid.UserJid r1 = r10.A0D
            if (r1 == 0) goto L_0x00cc
            X.14v r0 = r8.A03
            long r0 = r0.A01(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "receiver_jid_row_id"
            r3.put(r0, r1)
        L_0x00cc:
            if (r9 == 0) goto L_0x00e4
            java.lang.String r0 = r10.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r1 = r10.A0I
            X.1Vz r0 = X.C35481m0.A06
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00eb
        L_0x00e4:
            java.lang.String r1 = r10.A0I
            java.lang.String r0 = "currency_code"
            r3.put(r0, r1)
        L_0x00eb:
            X.1Vy r0 = r10.A08
            if (r0 == 0) goto L_0x010b
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x010b
            X.1Vy r0 = r10.A08
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "amount_1000"
            r3.put(r0, r1)
        L_0x010b:
            long r1 = r10.A05
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "init_timestamp"
            r3.put(r0, r1)
        L_0x0120:
            int r0 = r10.A02
            java.lang.String r1 = "status"
            if (r0 != 0) goto L_0x012b
            if (r9 == 0) goto L_0x0132
            int r0 = r9.A02
        L_0x012b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r0)
        L_0x0132:
            long r1 = r10.A06
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0144
            long r1 = r1 / r6
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r3.put(r0, r1)
        L_0x0144:
            java.lang.String r0 = r10.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0153
            java.lang.String r1 = r10.A0H
            java.lang.String r0 = "credential_id"
            r3.put(r0, r1)
        L_0x0153:
            java.lang.String r0 = r10.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0162
            java.lang.String r1 = r10.A0J
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
        L_0x0162:
            java.lang.String r0 = r10.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0171
            java.lang.String r1 = r10.A0F
            java.lang.String r0 = "bank_transaction_id"
            r3.put(r0, r1)
        L_0x0171:
            java.lang.String r0 = r10.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0180
            java.lang.String r1 = r10.A0M
            java.lang.String r0 = "request_key_id"
            r3.put(r0, r1)
        L_0x0180:
            java.util.ArrayList r2 = r10.A0N
            java.lang.String r1 = "methods"
            if (r2 == 0) goto L_0x01fe
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01fe
        L_0x018c:
            java.lang.String r0 = X.AnonymousClass1W1.A05(r2)
            r3.put(r1, r0)
        L_0x0193:
            java.lang.String r2 = "metadata"
            if (r9 == 0) goto L_0x01f9
            X.1W2 r1 = r9.A0A
            if (r1 == 0) goto L_0x01f9
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x01a2
            r1.A0T(r0)
        L_0x01a2:
            X.1W2 r0 = r9.A0A
        L_0x01a4:
            java.lang.String r0 = r0.A0K()
            r3.put(r2, r0)
        L_0x01ab:
            java.lang.String r0 = r10.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01ba
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = "country"
            r3.put(r0, r1)
        L_0x01ba:
            int r0 = r10.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "version"
            r3.put(r0, r1)
            byte[] r1 = r10.A0R
            if (r1 == 0) goto L_0x01cf
            java.lang.String r0 = "future_data"
            r3.put(r0, r1)
        L_0x01cf:
            int r0 = r10.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "service_id"
            r3.put(r0, r1)
            X.1lo r2 = r10.A01()
            if (r2 == 0) goto L_0x01ed
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "background_id"
            r3.put(r0, r1)
            X.0wO r0 = r8.A08
            r0.A04(r2)
        L_0x01ed:
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "purchase_initiator"
            r3.put(r0, r1)
            return r3
        L_0x01f9:
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x01ab
            goto L_0x01a4
        L_0x01fe:
            if (r9 == 0) goto L_0x0193
            java.util.ArrayList r2 = r9.A0N
            if (r2 == 0) goto L_0x0193
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0A(X.1Vt, X.1Vt):android.content.ContentValues");
    }

    public final Cursor A0B(Integer num) {
        boolean A0i = A0i();
        String num2 = Integer.toString(20);
        String[] strArr = {num2, Integer.toString(12), Integer.toString(40), num2, "%\"isPendingRequestViewed\":true%"};
        C16800tf A012 = this.A04.get();
        try {
            Cursor A092 = A012.A02.A09(A0i ? "pay_transaction" : "pay_transactions", A0i ? A0B : A0A, "((type=? AND status=?) OR (type=? AND status=?)) AND metadata NOT LIKE ?", strArr, (String) null, (String) null, num != null ? num.toString() : null);
            A012.close();
            return A092;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public Pair A0C() {
        Pair A042 = A04(new Pair("(type=? AND status=?)", new String[]{Integer.toString(8), Integer.toString(602)}), A01(), "OR");
        Pair pair = new Pair(new String[0], (Object) null);
        return A04(A042, new Pair(pair.second, pair.first), "AND");
    }

    public Pair A0D() {
        Pair A022 = A02();
        Pair pair = new Pair(new String[0], (Object) null);
        return A04(A022, new Pair(pair.second, pair.first), "AND");
    }

    public final Pair A0E(int i2) {
        String str;
        String rawString;
        if (i2 == 2) {
            str = "( sender_jid_row_id=? OR receiver_jid_row_id=? )";
            rawString = Long.toString(this.A03.A01(A0O()));
        } else {
            str = "( sender=? OR receiver=? )";
            rawString = A0O().getRawString();
        }
        Pair pair = new Pair(new String[]{rawString, rawString}, str);
        StringBuilder sb = new StringBuilder("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        sb.append((String) pair.second);
        sb.append(") OR (");
        sb.append("type");
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?) OR (");
        sb.append("type");
        sb.append("=? AND (");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=? OR ");
        sb.append("status");
        sb.append("=?)) OR (");
        sb.append("type");
        sb.append("=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=? AND ");
        sb.append("status");
        sb.append("!=?))");
        String obj = sb.toString();
        Pair pair2 = new Pair(new String[0], (Object) null);
        String[] strArr = (String[]) pair2.first;
        Object obj2 = pair2.second;
        if (obj2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" AND ");
            sb2.append((String) obj2);
            obj = sb2.toString();
        }
        boolean z2 = !TextUtils.isEmpty((CharSequence) null);
        if (z2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(" AND credential_id=?");
            obj = sb3.toString();
        }
        int length = strArr.length;
        String[] strArr2 = new String[((z2 ? 1 : 0) + true + length)];
        int i3 = 0;
        strArr2[0] = Integer.toString(1);
        strArr2[1] = Integer.toString(2);
        strArr2[2] = Integer.toString(100);
        strArr2[3] = Integer.toString(6);
        strArr2[4] = Integer.toString(7);
        strArr2[5] = Integer.toString(8);
        strArr2[6] = Integer.toString(9);
        strArr2[7] = Integer.toString(1000);
        String[] strArr3 = (String[]) pair.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(40);
        strArr2[14] = Integer.toString(415);
        strArr2[15] = Integer.toString(15);
        strArr2[16] = Integer.toString(16);
        strArr2[17] = Integer.toString(10);
        strArr2[18] = num;
        strArr2[19] = Integer.toString(19);
        strArr2[20] = num2;
        int i4 = 21;
        while (i3 < length) {
            strArr2[i4] = strArr[i3];
            i3++;
            i4++;
        }
        if (z2) {
            strArr2[i4] = null;
        }
        return new Pair(obj, strArr2);
    }

    public final Pair A0F(C15830rv r12, int i2) {
        String str;
        Pair A0E = A0E(i2);
        Pair A0D = A0D();
        String[] strArr = new String[(((String[]) A0E.second).length + 1 + ((String[]) A0D.second).length)];
        if (i2 == 1) {
            strArr[0] = r12.getRawString();
            str = "key_remote_jid=?";
        } else {
            long A012 = this.A03.A01(r12);
            if (A012 != -1) {
                strArr[0] = String.valueOf(A012);
                str = "remote_jid_row_id=?";
            } else {
                AnonymousClass1Vo r2 = this.A09;
                StringBuilder sb = new StringBuilder("getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=");
                sb.append(r12.getRawString());
                r2.A05(sb.toString());
                return null;
            }
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(" AND (");
        sb2.append((String) A0E.first);
        sb2.append(" OR ");
        sb2.append((String) A0D.first);
        sb2.append("))");
        String obj = sb2.toString();
        Object obj2 = A0E.second;
        System.arraycopy(obj2, 0, strArr, 1, ((String[]) obj2).length);
        Object obj3 = A0D.second;
        System.arraycopy(obj3, 0, strArr, ((String[]) A0E.second).length + 1, ((String[]) obj3).length);
        return new Pair(obj, strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A0G(X.C39961tL r7) {
        /*
            r6 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1lg r0 = r7.A01
            if (r0 == 0) goto L_0x00ad
            java.lang.String[] r0 = r0.A01
            java.util.Collections.addAll(r3, r0)
            X.1lg r0 = r7.A01
            java.lang.String r0 = r0.A00
        L_0x0017:
            r4.add(r0)
        L_0x001a:
            boolean r0 = r7.A06
            r5 = 1
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "(type=? OR type=? OR type=?)"
            r4.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r5)
            r3.add(r0)
            r0 = 10
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.add(r0)
            r0 = 100
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x003a:
            r3.add(r0)
        L_0x003d:
            java.lang.String r0 = "( sender=? OR receiver=?)"
            r4.add(r0)
            com.whatsapp.jid.UserJid r0 = r6.A0O()
            java.lang.String r0 = r0.getRawString()
            r3.add(r0)
            r3.add(r0)
            boolean r0 = r7.A02
            r2 = 0
            if (r0 == 0) goto L_0x0089
            android.util.Pair r1 = A07(r5)
        L_0x0059:
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            r4.add(r0)
        L_0x0065:
            java.lang.String r0 = "("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = " AND "
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x0089:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0065
            android.util.Pair r1 = A07(r2)
            goto L_0x0059
        L_0x0092:
            X.1tM r0 = r7.A00
            if (r0 == 0) goto L_0x003d
            X.AnonymousClass00B.A06(r0)
            r2 = 20
            r1 = 2
            java.lang.String r0 = "(type=? OR type=?)"
            r4.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r1)
            r3.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2)
            goto L_0x003a
        L_0x00ad:
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x001a
            android.util.Pair r1 = A03()
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0G(X.1tL):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A0H(X.C39961tL r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.1lg r0 = r8.A01
            if (r0 == 0) goto L_0x00cd
            java.lang.String[] r0 = r0.A01
            java.util.Collections.addAll(r3, r0)
            X.1lg r0 = r8.A01
            java.lang.String r0 = r0.A00
        L_0x0017:
            r4.add(r0)
        L_0x001a:
            com.whatsapp.jid.UserJid r1 = r7.A0O()
            X.14v r0 = r7.A03
            long r0 = r0.A01(r1)
            java.lang.String r5 = java.lang.Long.toString(r0)
            boolean r0 = r8.A06
            r6 = 1
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = "(type=? OR type=? OR type=?)"
            r4.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r6)
            r3.add(r0)
            r0 = 10
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.add(r0)
            r0 = 100
            java.lang.String r0 = java.lang.Integer.toString(r0)
        L_0x0048:
            r3.add(r0)
        L_0x004b:
            java.lang.String r0 = "( receiver_jid_row_id=? OR sender_jid_row_id=? OR (service_id=? AND (type=? OR type=? OR type=? OR type=?)))"
            r4.add(r0)
            r3.add(r5)
            r3.add(r5)
            java.lang.String r0 = "3"
            r3.add(r0)
            java.lang.String r0 = "6"
            r3.add(r0)
            java.lang.String r0 = "7"
            r3.add(r0)
            java.lang.String r0 = "8"
            r3.add(r0)
            java.lang.String r0 = "9"
            r3.add(r0)
            boolean r0 = r8.A02
            r2 = 0
            if (r0 == 0) goto L_0x00a8
            android.util.Pair r1 = A07(r6)
        L_0x0078:
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            r4.add(r0)
        L_0x0084:
            java.lang.String r0 = "("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = " AND "
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r0 = r3.toArray(r0)
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            return r0
        L_0x00a8:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0084
            android.util.Pair r1 = A07(r2)
            goto L_0x0078
        L_0x00b1:
            X.1tM r0 = r8.A00
            if (r0 == 0) goto L_0x004b
            X.AnonymousClass00B.A06(r0)
            r2 = 20
            r1 = 2
            java.lang.String r0 = "(type=? OR type=?)"
            r4.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r1)
            r3.add(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2)
            goto L_0x0048
        L_0x00cd:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x001a
            android.util.Pair r1 = A03()
            java.lang.Object r0 = r1.first
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.Collections.addAll(r3, r0)
            java.lang.Object r0 = r1.second
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0H(X.1tL):android.util.Pair");
    }

    public final AnonymousClass1Vt A0I(Cursor cursor) {
        long j2;
        AnonymousClass1Vt A022;
        C228919r AEq;
        AnonymousClass1GR r4;
        Cursor cursor2 = cursor;
        if (!A0i()) {
            return A0J(cursor2);
        }
        C216314v r42 = this.A03;
        C15830rv A002 = C15830rv.A00(r42.A03(cursor2.getLong(cursor2.getColumnIndexOrThrow("remote_jid_row_id"))));
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("key_id"));
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("id"));
        long j3 = ((long) cursor2.getInt(cursor2.getColumnIndexOrThrow("init_timestamp"))) * 1000;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("timestamp");
        long max = Math.max(((long) (cursor2.isNull(columnIndexOrThrow) ? 0 : cursor2.getInt(columnIndexOrThrow))) * 1000, 0);
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("status"));
        UserJid of = UserJid.of(r42.A03(cursor2.getLong(cursor2.getColumnIndexOrThrow("sender_jid_row_id"))));
        UserJid of2 = UserJid.of(r42.A03(cursor2.getLong(cursor2.getColumnIndexOrThrow("receiver_jid_row_id"))));
        int i3 = cursor2.getInt(cursor2.getColumnIndexOrThrow("type"));
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("currency_code"));
        long j4 = cursor2.getLong(cursor2.getColumnIndexOrThrow("amount_1000"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("credential_id"));
        String string5 = cursor2.getString(cursor2.getColumnIndexOrThrow("error_code"));
        String string6 = cursor2.getString(cursor2.getColumnIndexOrThrow("bank_transaction_id"));
        String string7 = cursor2.getString(cursor2.getColumnIndexOrThrow("methods"));
        String string8 = cursor2.getString(cursor2.getColumnIndexOrThrow("metadata"));
        String string9 = cursor2.getString(cursor2.getColumnIndexOrThrow("request_key_id"));
        String string10 = cursor2.getString(cursor2.getColumnIndexOrThrow("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = "IN";
        }
        int i4 = cursor2.getInt(cursor2.getColumnIndexOrThrow("version"));
        byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("future_data"));
        int i5 = cursor2.getInt(cursor2.getColumnIndexOrThrow("service_id"));
        String string11 = cursor2.getString(cursor2.getColumnIndexOrThrow("background_id"));
        C35361lo r9 = null;
        if (!TextUtils.isEmpty(string11)) {
            r9 = this.A08.A01(string11);
        }
        int i6 = cursor2.getInt(cursor2.getColumnIndexOrThrow("purchase_initiator"));
        C16040sK r43 = this.A01;
        boolean z2 = (r43.A0I(of2) && (i3 == 20 || i3 == 40 || i3 == 10 || i3 == 30)) || (r43.A0I(of) && (i3 == 2 || i3 == 200 || i3 == 1 || i3 == 100 || i3 == 3));
        String string12 = cursor2.getString(cursor2.getColumnIndexOrThrow("interop_id"));
        AnonymousClass1Vo r3 = this.A09;
        StringBuilder sb = new StringBuilder("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(max);
        sb.append(" service_id: ");
        sb.append(i5);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description:  peer: ");
        sb.append(of2);
        r3.A03((String) null, sb.toString());
        if (i3 != 5 || !TextUtils.isEmpty(string3)) {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j4).scaleByPowerOfTen(-3);
            String str = string3;
            j2 = 0;
            A022 = AnonymousClass1W1.A02(this.A06.A01(str), of, of2, str, string2, string4, string5, string6, string10, scaleByPowerOfTen, blob, i3, i2, i4, i5, i6, j3, max);
        } else {
            A022 = new AnonymousClass1Vt(string10, 5, i4, 0, j3);
            A022.A0R = blob;
            j2 = 0;
        }
        A022.A05(r9);
        A022.A0C = A002;
        A022.A0Q = z2;
        if (!TextUtils.isEmpty(string)) {
            A022.A0L = string;
        } else if (!TextUtils.isEmpty(string12)) {
            A022.A0L = string12;
        }
        if (!TextUtils.isEmpty(string9)) {
            A022.A0M = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A022.A08(AnonymousClass1W1.A06(A022.A00(), string7));
        }
        if (!TextUtils.isEmpty(string12)) {
            A022.A0P = true;
        }
        if (!TextUtils.isEmpty(string8) && (r4 = this.A00) != null) {
            int i7 = A022.A01;
            C228919r AEs = i7 != 0 ? r4.AEs(i7) : r4.AEq(A022.A0G, A022.A0I);
            if (AEs != null) {
                A022.A0A = AEs.AI7();
            }
            AnonymousClass1W2 r1 = A022.A0A;
            if (r1 != null) {
                r1.A04(string8);
                if (A022.A0D()) {
                    long A092 = A022.A0A.A09();
                    if (A092 > j2 && A092 < this.A02.A00()) {
                        int i8 = 16;
                        if (A022.A03 == 8) {
                            i8 = 607;
                        }
                        A022.A02 = i8;
                    }
                }
            }
        }
        if (A022.A01 == 0) {
            AnonymousClass1GR r44 = this.A00;
            A022.A01 = (r44 == null || (AEq = r44.AEq(A022.A0G, A022.A0I)) == null) ? 0 : AEq.AG1();
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A022);
        sb2.append(" countryData: ");
        sb2.append(A022.A0A);
        r3.A03((String) null, sb2.toString());
        return A022;
    }

    public final AnonymousClass1Vt A0J(Cursor cursor) {
        long j2;
        AnonymousClass1Vt A022;
        C228919r AEq;
        AnonymousClass1GR r6;
        Cursor cursor2 = cursor;
        C15830rv A023 = C15830rv.A02(cursor2.getString(cursor2.getColumnIndexOrThrow("key_remote_jid")));
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("key_id"));
        boolean z2 = false;
        if (cursor2.getInt(cursor2.getColumnIndexOrThrow("key_from_me")) == 1) {
            z2 = true;
        }
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("id"));
        long j3 = ((long) cursor2.getInt(cursor2.getColumnIndexOrThrow("init_timestamp"))) * 1000;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("timestamp");
        long max = Math.max(((long) (cursor2.isNull(columnIndexOrThrow) ? 0 : cursor2.getInt(columnIndexOrThrow))) * 1000, 0);
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("status"));
        UserJid nullable = UserJid.getNullable(cursor2.getString(cursor2.getColumnIndexOrThrow("sender")));
        UserJid nullable2 = UserJid.getNullable(cursor2.getString(cursor2.getColumnIndexOrThrow("receiver")));
        int i3 = cursor2.getInt(cursor2.getColumnIndexOrThrow("type"));
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("currency"));
        long j4 = cursor2.getLong(cursor2.getColumnIndexOrThrow("amount_1000"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("credential_id"));
        String string5 = cursor2.getString(cursor2.getColumnIndexOrThrow("error_code"));
        String string6 = cursor2.getString(cursor2.getColumnIndexOrThrow("bank_transaction_id"));
        String string7 = cursor2.getString(cursor2.getColumnIndexOrThrow("methods"));
        String string8 = cursor2.getString(cursor2.getColumnIndexOrThrow("metadata"));
        String string9 = cursor2.getString(cursor2.getColumnIndexOrThrow("request_key_id"));
        String string10 = cursor2.getString(cursor2.getColumnIndexOrThrow("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = "IN";
        }
        int i4 = cursor2.getInt(cursor2.getColumnIndexOrThrow("version"));
        byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("future_data"));
        int i5 = cursor2.getInt(cursor2.getColumnIndexOrThrow("service_id"));
        String string11 = cursor2.getString(cursor2.getColumnIndexOrThrow("background_id"));
        C35361lo r8 = null;
        if (!TextUtils.isEmpty(string11)) {
            r8 = this.A08.A01(string11);
        }
        int i6 = cursor2.getInt(cursor2.getColumnIndexOrThrow("purchase_initiator"));
        AnonymousClass1Vo r4 = this.A09;
        StringBuilder sb = new StringBuilder("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(max);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description:  peer: ");
        sb.append(nullable2);
        sb.append(" background_id: ");
        sb.append(string11);
        r4.A03((String) null, sb.toString());
        if (i3 != 5 || !TextUtils.isEmpty(string3)) {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j4).scaleByPowerOfTen(-3);
            String str = string3;
            j2 = 0;
            A022 = AnonymousClass1W1.A02(this.A06.A01(str), nullable, nullable2, str, string2, string4, string5, string6, string10, scaleByPowerOfTen, blob, i3, i2, i4, i5, i6, j3, max);
        } else {
            A022 = new AnonymousClass1Vt(string10, 5, i4, 0, j3);
            A022.A0R = blob;
            j2 = 0;
        }
        A022.A05(r8);
        A022.A0C = A023;
        if (A023 == null) {
            A022.A0P = true;
        }
        A022.A0Q = z2;
        if (!TextUtils.isEmpty(string)) {
            A022.A0L = string;
        }
        if (!TextUtils.isEmpty(string9)) {
            A022.A0M = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A022.A08(AnonymousClass1W1.A06(A022.A00(), string7));
        }
        if (!TextUtils.isEmpty(string8) && (r6 = this.A00) != null) {
            int i7 = A022.A01;
            C228919r AEs = i7 != 0 ? r6.AEs(i7) : r6.AEq(A022.A0G, A022.A0I);
            if (AEs != null) {
                A022.A0A = AEs.AI7();
            }
            AnonymousClass1W2 r1 = A022.A0A;
            if (r1 != null) {
                r1.A04(string8);
                if (A022.A0D()) {
                    long A092 = A022.A0A.A09();
                    if (A092 > j2 && A092 < this.A02.A00()) {
                        int i8 = 16;
                        if (A022.A03 == 8) {
                            i8 = 607;
                        }
                        A022.A02 = i8;
                    }
                }
            }
        }
        if (A022.A01 == 0) {
            AnonymousClass1GR r3 = this.A00;
            A022.A01 = (r3 == null || (AEq = r3.AEq(A022.A0G, A022.A0I)) == null) ? 0 : AEq.AG1();
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A022);
        sb2.append(" countryData: ");
        sb2.append(A022.A0A);
        r4.A03((String) null, sb2.toString());
        return A022;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0070 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0070=Splitter:B:30:0x0070, B:19:0x0045=Splitter:B:19:0x0045} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Vt A0K(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r9 = "request_key_id=?"
            r5 = 1
            java.lang.String[] r10 = new java.lang.String[r5]
            r0 = 0
            r10[r0] = r15
            r14.A0i()
            X.0tq r0 = r14.A04
            X.0tf r4 = r0.get()
            X.0tg r6 = r4.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = r14.A0P()     // Catch:{ all -> 0x0071 }
            boolean r0 = r14.A0i()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0027
            java.lang.String[] r8 = A0B     // Catch:{ all -> 0x0071 }
        L_0x001f:
            r11 = 0
            r13 = r11
            r12 = r11
            android.database.Cursor r6 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0071 }
            goto L_0x002a
        L_0x0027:
            java.lang.String[] r8 = A0A     // Catch:{ all -> 0x0071 }
            goto L_0x001f
        L_0x002a:
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x006a }
            r3 = 0
            if (r0 == 0) goto L_0x0045
            X.1Vt r3 = r14.A0I(r6)     // Catch:{ 1W4 -> 0x0036 }
            goto L_0x0045
        L_0x0036:
            r2 = move-exception
            X.1Vo r1 = r14.A09     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByRequestMessageId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x006a }
            r6.close()     // Catch:{ all -> 0x0071 }
            r4.close()
            return r11
        L_0x0045:
            r6.close()     // Catch:{ all -> 0x0071 }
            r4.close()
            X.1Vo r2 = r14.A09
            java.lang.String r0 = "readTransactionInfoByRequestMessageId/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r3 != 0) goto L_0x005f
            r5 = 0
        L_0x005f:
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            return r3
        L_0x006a:
            r0 = move-exception
            if (r6 == 0) goto L_0x0070
            r6.close()     // Catch:{ all -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0K(java.lang.String):X.1Vt");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0069=Splitter:B:27:0x0069, B:16:0x003e=Splitter:B:16:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Vt A0L(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r9 = "id=?"
            r3 = 1
            java.lang.String[] r10 = new java.lang.String[r3]
            r0 = 0
            r10[r0] = r15
            r14.A0i()
            X.0tq r0 = r14.A04
            X.0tf r5 = r0.get()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x006a }
            java.lang.String r7 = r14.A0P()     // Catch:{ all -> 0x006a }
            boolean r0 = r14.A0i()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0027
            java.lang.String[] r8 = A0B     // Catch:{ all -> 0x006a }
        L_0x001f:
            r11 = 0
            r13 = r11
            r12 = r11
            android.database.Cursor r6 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x006a }
            goto L_0x002a
        L_0x0027:
            java.lang.String[] r8 = A0A     // Catch:{ all -> 0x006a }
            goto L_0x001f
        L_0x002a:
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x003d
            X.1Vt r4 = r14.A0I(r6)     // Catch:{ 1W4 -> 0x0035 }
            goto L_0x003e
        L_0x0035:
            r2 = move-exception
            X.1Vo r1 = r14.A09     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "PaymentTransactionStore/readTransactionInfoByTransId/InvalidJidException - Cannot read TransactionInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0063 }
        L_0x003d:
            r4 = 0
        L_0x003e:
            r6.close()     // Catch:{ all -> 0x006a }
            r5.close()
            X.1Vo r2 = r14.A09
            java.lang.String r0 = "readTransactionInfoByTransId/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r4 != 0) goto L_0x0058
            r3 = 0
        L_0x0058:
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            return r4
        L_0x0063:
            r0 = move-exception
            if (r6 == 0) goto L_0x0069
            r6.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x006e }
        L_0x006e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0L(java.lang.String):X.1Vt");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r2 != null) goto L_0x008a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00c8 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0068=Splitter:B:24:0x0068, B:50:0x00c8=Splitter:B:50:0x00c8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Vt A0M(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            boolean r0 = r14.A0i()
            r3 = r16
            if (r0 == 0) goto L_0x000f
            r0 = -1
            X.1Vt r11 = r14.A0N(r15, r3, r0)
            return r11
        L_0x000f:
            android.util.Pair r0 = A06(r15, r3)
            r11 = 0
            if (r0 != 0) goto L_0x0032
            X.1Vo r2 = r14.A09
            java.lang.String r0 = "getMessagePaymentInfoFromV1 got null query and params for message id: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r0 = " trans id: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            return r11
        L_0x0032:
            java.lang.Object r9 = r0.first
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.second
            java.lang.String[] r10 = (java.lang.String[]) r10
            X.0tq r0 = r14.A04
            X.0tf r5 = r0.get()
            X.0tg r6 = r5.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r7 = "pay_transactions"
            java.lang.String[] r8 = A0A     // Catch:{ all -> 0x00c9 }
            r3 = r11
            r13 = r11
            r12 = r11
            android.database.Cursor r6 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c9 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0067
            X.1Vt r4 = r14.A0J(r6)     // Catch:{ 1W4 -> 0x0058 }
            goto L_0x0068
        L_0x0058:
            r2 = move-exception
            X.1Vo r1 = r14.A09     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "PaymentTransactionStore/getMessagePaymentInfoFromV1/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00c2 }
            r6.close()     // Catch:{ all -> 0x00c9 }
            r5.close()
            return r11
        L_0x0067:
            r4 = r11
        L_0x0068:
            r6.close()     // Catch:{ all -> 0x00c9 }
            r5.close()
            if (r4 == 0) goto L_0x0074
            X.1W2 r2 = r4.A0A
            if (r2 != 0) goto L_0x008a
        L_0x0074:
            X.1GR r2 = r14.A00
            if (r2 == 0) goto L_0x0095
            if (r4 == 0) goto L_0x00bd
            java.lang.String r1 = r4.A0G
            java.lang.String r0 = r4.A0I
            X.19r r0 = r2.AEq(r1, r0)
        L_0x0082:
            if (r0 == 0) goto L_0x0095
            X.1W2 r2 = r0.AI7()
            if (r2 == 0) goto L_0x0095
        L_0x008a:
            java.lang.String r1 = r2.A0H()
            if (r1 == 0) goto L_0x0095
            X.160 r0 = r14.A07
            r0.A0F(r2, r1)
        L_0x0095:
            X.1Vo r2 = r14.A09
            java.lang.String r0 = "PaymentTransactionStore/getMessagePaymentInfoFromV1/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r15)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " country data: "
            r1.append(r0)
            if (r4 == 0) goto L_0x00b2
            X.1W2 r11 = r4.A0A
        L_0x00b2:
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            r2.A03(r3, r0)
            return r4
        L_0x00bd:
            X.19r r0 = r2.AFy()
            goto L_0x0082
        L_0x00c2:
            r0 = move-exception
            if (r6 == 0) goto L_0x00c8
            r6.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0M(java.lang.String, java.lang.String):X.1Vt");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (r10 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c7, code lost:
        if (r2 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r8 != null) goto L_0x0045;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0090=Splitter:B:31:0x0090, B:37:0x009a=Splitter:B:37:0x009a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Vt A0N(java.lang.String r14, java.lang.String r15, long r16) {
        /*
            r13 = this;
            r2 = 0
            r10 = 0
            r3 = -1
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            java.lang.String r0 = "message_row_id=?"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            X.1tN r1 = new X.1tN
            r1.<init>(r13)
            java.lang.String r0 = java.lang.Long.toString(r16)
            r1.add(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = " OR key_id=?"
            r3.append(r0)
            r1.add(r14)
        L_0x0029:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = " OR id=?"
            r3.append(r0)
            r1.add(r15)
        L_0x0037:
            java.lang.String r8 = r3.toString()
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r9 = r1.toArray(r0)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r8 == 0) goto L_0x00a2
        L_0x0045:
            X.0tq r0 = r13.A04
            X.0tf r4 = r0.get()
            goto L_0x006a
        L_0x004c:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r1 = 1
            if (r0 != 0) goto L_0x005d
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]
            r9[r2] = r14
            r9[r1] = r14
            java.lang.String r8 = "key_id=? OR interop_id=?"
            goto L_0x0045
        L_0x005d:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x00a2
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r15
            java.lang.String r8 = "id=?"
            goto L_0x0045
        L_0x006a:
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x009b }
            java.lang.String r6 = "pay_transaction"
            java.lang.String[] r7 = A0B     // Catch:{ all -> 0x009b }
            r12 = r10
            r11 = r10
            android.database.Cursor r3 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009b }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0090
            X.1Vt r10 = r13.A0I(r3)     // Catch:{ 1W4 -> 0x0081 }
            goto L_0x0090
        L_0x0081:
            r2 = move-exception
            X.1Vo r1 = r13.A09     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "getMessagePaymentInfoV2/InvalidJidException - Cannot get PaymentInfo from a message with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0094 }
            r3.close()     // Catch:{ all -> 0x009b }
            r4.close()
            return r10
        L_0x0090:
            r3.close()     // Catch:{ all -> 0x009b }
            goto L_0x00aa
        L_0x0094:
            r0 = move-exception
            if (r3 == 0) goto L_0x009a
            r3.close()     // Catch:{ all -> 0x009a }
        L_0x009a:
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x009f }
        L_0x009f:
            throw r0
        L_0x00a0:
            if (r10 != 0) goto L_0x00d4
        L_0x00a2:
            X.1Vo r2 = r13.A09
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, txn is null"
        L_0x00a6:
            r2.A06(r0)
            return r10
        L_0x00aa:
            r4.close()
            if (r10 == 0) goto L_0x00b3
            X.1W2 r2 = r10.A0A
            if (r2 != 0) goto L_0x00c9
        L_0x00b3:
            X.1GR r2 = r13.A00
            if (r2 == 0) goto L_0x00a0
            if (r10 == 0) goto L_0x00a2
            java.lang.String r1 = r10.A0G
            java.lang.String r0 = r10.A0I
            X.19r r0 = r2.AEq(r1, r0)
            if (r0 == 0) goto L_0x00d4
            X.1W2 r2 = r0.AI7()
            if (r2 == 0) goto L_0x00d4
        L_0x00c9:
            java.lang.String r1 = r2.A0H()
            if (r1 == 0) goto L_0x00d4
            X.160 r0 = r13.A07
            r0.A0F(r2, r1)
        L_0x00d4:
            X.1Vo r2 = r13.A09
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN PaymentTransactionStore#getMessagePaymentInfoV2 fetching from db, and interop is "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            boolean r0 = r10.A0P
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0N(java.lang.String, java.lang.String, long):X.1Vt");
    }

    public final UserJid A0O() {
        C16040sK r0 = this.A01;
        r0.A0B();
        C28881Zb r02 = r0.A01;
        AnonymousClass00B.A06(r02);
        UserJid userJid = (UserJid) r02.A0E;
        AnonymousClass00B.A06(userJid);
        return userJid;
    }

    public final String A0P() {
        return A0i() ? "pay_transaction" : "pay_transactions";
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x029e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x0296=Splitter:B:110:0x0296, B:116:0x029e=Splitter:B:116:0x029e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0Q(X.C16740tZ r20, boolean r21) {
        /*
            r19 = this;
            r6 = r20
            X.1Vt r0 = r6.A0L
            if (r0 == 0) goto L_0x02a8
            r5 = 0
            r4 = r19
            X.0tq r0 = r4.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x029f }
            r18 = r0
            X.0tf r3 = r18.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x029f }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            X.1W2 r1 = r0.A0A     // Catch:{ all -> 0x029a }
            r17 = 0
            if (r1 == 0) goto L_0x00f7
            java.lang.String r11 = r1.A0H()     // Catch:{ all -> 0x029a }
            long r13 = r1.A08()     // Catch:{ all -> 0x029a }
            if (r11 == 0) goto L_0x00a7
            X.160 r2 = r4.A07     // Catch:{ all -> 0x029a }
            X.1GS r0 = r2.A01     // Catch:{ all -> 0x029a }
            X.19s r0 = r0.AFx()     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x003d
            X.1W2 r7 = r0.AI7()     // Catch:{ all -> 0x029a }
            if (r7 == 0) goto L_0x0036
            r2.A0F(r7, r11)     // Catch:{ all -> 0x029a }
        L_0x0036:
            X.1tB r0 = r2.A00     // Catch:{ all -> 0x029a }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x029a }
            goto L_0x003f
        L_0x003d:
            r7 = 0
            goto L_0x0036
        L_0x003f:
            X.1cj r12 = r8.A00()     // Catch:{ all -> 0x009f }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x009a }
            r10 = 1
            if (r0 != 0) goto L_0x0089
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x009a }
            r9.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "tmp_id"
            r9.put(r0, r11)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r1.A0L()     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0089
            java.lang.String r0 = "tmp_metadata"
            r9.put(r0, r1)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "tmp_ts"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x009a }
            r9.put(r2, r0)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x008d
            java.lang.String r0 = r7.A0H()     // Catch:{ all -> 0x009a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x009a }
            if (r0 != 0) goto L_0x008d
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "tmp_transactions"
            java.lang.String r1 = "tmp_id=?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x009a }
            r0[r17] = r11     // Catch:{ all -> 0x009a }
            r7.A00(r2, r9, r1, r0)     // Catch:{ all -> 0x009a }
        L_0x0089:
            r12.A00()     // Catch:{ all -> 0x009a }
            goto L_0x0096
        L_0x008d:
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "tmp_transactions"
            r1.A02(r9, r0)     // Catch:{ all -> 0x009a }
            goto L_0x0089
        L_0x0096:
            r12.close()     // Catch:{ all -> 0x009f }
            goto L_0x00a4
        L_0x009a:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x009e }
        L_0x009e:
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            throw r0     // Catch:{ all -> 0x029a }
        L_0x00a4:
            r8.close()     // Catch:{ all -> 0x029a }
        L_0x00a7:
            X.160 r2 = r4.A07     // Catch:{ all -> 0x029a }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            com.whatsapp.jid.UserJid r0 = r0.A0E     // Catch:{ all -> 0x029a }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x029a }
            X.1m3 r7 = r2.A05(r0)     // Catch:{ all -> 0x029a }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            X.1W2 r0 = r0.A0A     // Catch:{ all -> 0x029a }
            java.lang.String r1 = r0.A0J()     // Catch:{ all -> 0x029a }
            if (r7 == 0) goto L_0x00f2
            com.whatsapp.jid.UserJid r0 = r7.A05     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = r7.A07()     // Catch:{ all -> 0x029a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x00f2
            r7.A09(r1)     // Catch:{ all -> 0x029a }
            r2.A0I(r7)     // Catch:{ all -> 0x029a }
            X.1Vo r2 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r1.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "updated the contact for "
            r1.append(r0)     // Catch:{ all -> 0x029a }
            com.whatsapp.jid.UserJid r0 = r7.A05     // Catch:{ all -> 0x029a }
            r1.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029a }
            r2.A06(r0)     // Catch:{ all -> 0x029a }
        L_0x00f2:
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            r4.A0k(r0)     // Catch:{ all -> 0x029a }
        L_0x00f7:
            if (r21 == 0) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r11 = r5
            goto L_0x0104
        L_0x00fc:
            X.1Vw r0 = r6.A11     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x029a }
            X.1Vt r11 = r4.A0M(r0, r5)     // Catch:{ all -> 0x029a }
        L_0x0104:
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            android.content.ContentValues r10 = r4.A09(r11, r0)     // Catch:{ all -> 0x029a }
            if (r10 != 0) goto L_0x0110
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x029f }
            return r5
        L_0x0110:
            X.1Vw r9 = r6.A11     // Catch:{ all -> 0x029a }
            X.0rv r7 = r9.A00     // Catch:{ all -> 0x029a }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x029a }
            java.lang.String r1 = r7.getRawString()     // Catch:{ all -> 0x029a }
            r8 = 1
            if (r11 == 0) goto L_0x015f
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x029a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x015f
            X.1Vo r1 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r2.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "insertMessagePaymentInfo already exists with old message id: "
            r2.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x029a }
            r2.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "; new message id: "
            r2.append(r0)     // Catch:{ all -> 0x029a }
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r0.A0L     // Catch:{ all -> 0x029a }
            r2.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x029a }
            r1.A03(r5, r0)     // Catch:{ all -> 0x029a }
        L_0x014a:
            int r0 = r10.size()     // Catch:{ all -> 0x029a }
            if (r0 <= 0) goto L_0x0275
            boolean r0 = r4.A0i()     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x01cb
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            android.content.ContentValues r13 = r4.A0A(r11, r0)     // Catch:{ all -> 0x029a }
            if (r13 == 0) goto L_0x01cb
            goto L_0x017b
        L_0x015f:
            java.lang.String r0 = "key_remote_jid"
            r10.put(r0, r1)     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "key_from_me"
            boolean r1 = r9.A02     // Catch:{ all -> 0x029a }
            r0 = 0
            if (r1 == 0) goto L_0x016c
            r0 = 1
        L_0x016c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x029a }
            r10.put(r2, r0)     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x029a }
            r10.put(r1, r0)     // Catch:{ all -> 0x029a }
            goto L_0x014a
        L_0x017b:
            if (r11 == 0) goto L_0x0185
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x029a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x019b
        L_0x0185:
            X.14v r0 = r4.A03     // Catch:{ all -> 0x029a }
            long r0 = r0.A01(r7)     // Catch:{ all -> 0x029a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "remote_jid_row_id"
            r13.put(r0, r1)     // Catch:{ all -> 0x029a }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "key_id"
            r13.put(r0, r1)     // Catch:{ all -> 0x029a }
        L_0x019b:
            long r0 = r6.A13     // Catch:{ all -> 0x029a }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "message_row_id"
            r13.put(r0, r1)     // Catch:{ all -> 0x029a }
            java.lang.String r12 = "/"
            if (r11 != 0) goto L_0x01d9
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "pay_transaction"
            long r1 = r1.A04(r13, r0)     // Catch:{ all -> 0x029a }
            X.1Vo r14 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "insertMessagePaymentInfoV2/"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r13.<init>(r0)     // Catch:{ all -> 0x029a }
        L_0x01bb:
            r13.append(r7)     // Catch:{ all -> 0x029a }
            r13.append(r12)     // Catch:{ all -> 0x029a }
            r13.append(r1)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x029a }
            r14.A06(r0)     // Catch:{ all -> 0x029a }
        L_0x01cb:
            r18.A04()     // Catch:{ all -> 0x029a }
            r0 = r18
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x029a }
            boolean r0 = r0.A0D(r3)     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x026c
            goto L_0x0215
        L_0x01d9:
            long r1 = r6.A13     // Catch:{ all -> 0x029a }
            r15 = -1
            java.lang.String r0 = "insertMessagePaymentInfoV2/found old row and updating "
            int r14 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r14 == 0) goto L_0x0208
            r1 = 2
            java.lang.String[] r14 = new java.lang.String[r1]     // Catch:{ all -> 0x029a }
            long r1 = r6.A13     // Catch:{ all -> 0x029a }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x029a }
            r14[r17] = r1     // Catch:{ all -> 0x029a }
            java.lang.String r1 = r11.A0K     // Catch:{ all -> 0x029a }
            r14[r8] = r1     // Catch:{ all -> 0x029a }
            X.0tg r15 = r3.A02     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "pay_transaction"
            java.lang.String r1 = "message_row_id=? OR id=?"
        L_0x01f8:
            int r1 = r15.A00(r2, r13, r1, r14)     // Catch:{ all -> 0x029a }
            long r1 = (long) r1     // Catch:{ all -> 0x029a }
            X.1Vo r14 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r13.<init>()     // Catch:{ all -> 0x029a }
            r13.append(r0)     // Catch:{ all -> 0x029a }
            goto L_0x01bb
        L_0x0208:
            java.lang.String[] r14 = new java.lang.String[r8]     // Catch:{ all -> 0x029a }
            java.lang.String r1 = r11.A0K     // Catch:{ all -> 0x029a }
            r14[r17] = r1     // Catch:{ all -> 0x029a }
            X.0tg r15 = r3.A02     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "pay_transaction"
            java.lang.String r1 = "id=?"
            goto L_0x01f8
        L_0x0215:
            java.lang.String r12 = "/"
            if (r11 != 0) goto L_0x021a
            goto L_0x0248
        L_0x021a:
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x029a }
            r8[r17] = r0     // Catch:{ all -> 0x029a }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x029a }
            java.lang.String r1 = "pay_transactions"
            java.lang.String r0 = "key_id=?"
            int r0 = r2.A00(r1, r10, r0, r8)     // Catch:{ all -> 0x029a }
            long r0 = (long) r0     // Catch:{ all -> 0x029a }
            X.1Vo r9 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r8.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "insertMessagePaymentInfo/found old row and updating "
            r8.append(r2)     // Catch:{ all -> 0x029a }
            r8.append(r7)     // Catch:{ all -> 0x029a }
            r8.append(r12)     // Catch:{ all -> 0x029a }
            r8.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x029a }
            r9.A06(r0)     // Catch:{ all -> 0x029a }
            goto L_0x026c
        L_0x0248:
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "pay_transactions"
            long r0 = r1.A04(r10, r0)     // Catch:{ all -> 0x029a }
            X.1Vo r9 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r8.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r2 = "insertMessagePaymentInfo/"
            r8.append(r2)     // Catch:{ all -> 0x029a }
            r8.append(r7)     // Catch:{ all -> 0x029a }
            r8.append(r12)     // Catch:{ all -> 0x029a }
            r8.append(r0)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x029a }
            r9.A06(r0)     // Catch:{ all -> 0x029a }
        L_0x026c:
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x0296
            java.lang.String r0 = "UNSET"
            goto L_0x0296
        L_0x0275:
            X.1Vo r2 = r4.A09     // Catch:{ all -> 0x029a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x029a }
            r1.<init>()     // Catch:{ all -> 0x029a }
            java.lang.String r0 = "insertMessagePaymentInfo/found no columns to update: "
            r1.append(r0)     // Catch:{ all -> 0x029a }
            r1.append(r9)     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x029a }
            r2.A06(r0)     // Catch:{ all -> 0x029a }
            if (r11 == 0) goto L_0x0292
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0292
            goto L_0x0296
        L_0x0292:
            X.1Vt r0 = r6.A0L     // Catch:{ all -> 0x029a }
            java.lang.String r0 = r0.A0K     // Catch:{ all -> 0x029a }
        L_0x0296:
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x029f }
            return r0
        L_0x029a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x029e }
        L_0x029e:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x029f }
        L_0x029f:
            r2 = move-exception
            X.1Vo r1 = r4.A09
            java.lang.String r0 = "insertMessagePaymentInfo"
            r1.A0A(r0, r2)
            return r5
        L_0x02a8:
            java.lang.String r1 = "PaymentTransactionStore"
            java.lang.String r0 = "insertMessagePaymentInfo transaction info is null"
            java.lang.String r1 = X.AnonymousClass1Vo.A01(r1, r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0Q(X.0tZ, boolean):java.lang.String");
    }

    public List A0R() {
        List list;
        synchronized (this) {
            if (A0i()) {
                Pair A0D = A0D();
                list = A0Z((String) A0D.first, (String[]) A0D.second, -1);
            } else {
                Pair A0D2 = A0D();
                list = A0Y((String) A0D2.first, (String[]) A0D2.second, -1);
            }
        }
        return list;
    }

    public synchronized List A0S(int i2) {
        List list;
        synchronized (this) {
            if (A0i()) {
                Pair pair = new Pair(new String[0], (Object) null);
                Pair A042 = A04(A04(A05(A02(), true), A01(), "OR"), new Pair((String) pair.second, (String[]) pair.first), "AND");
                list = A0Z((String) A042.first, (String[]) A042.second, i2);
            } else {
                Pair pair2 = new Pair(new String[0], (Object) null);
                Pair A043 = A04(A04(A05(A02(), false), A01(), "OR"), new Pair((String) pair2.second, (String[]) pair2.first), "AND");
                list = A0Y((String) A043.first, (String[]) A043.second, i2);
            }
        }
        return list;
    }

    public synchronized List A0T(int i2) {
        ArrayList arrayList;
        arrayList = new ArrayList(r8 + r6 + r3);
        for (int valueOf : AnonymousClass1Vt.A0T) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        for (int valueOf2 : AnonymousClass1Vt.A0V) {
            arrayList.add(Integer.valueOf(valueOf2));
        }
        for (int valueOf3 : AnonymousClass1Vt.A0U) {
            arrayList.add(Integer.valueOf(valueOf3));
        }
        return A0c((Integer[]) arrayList.toArray(new Integer[0]), new Integer[]{2, 1, 200, 100, 20, 10, 6, 7, 8}, i2);
    }

    public final List A0U(Cursor cursor, String str) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            try {
                arrayList.add(A0I(cursor));
            } catch (AnonymousClass1W4 e2) {
                AnonymousClass1Vo r2 = this.A09;
                StringBuilder sb = new StringBuilder("PaymentTransactionStore/");
                sb.append(str);
                sb.append("/InvalidJidException- Skipped pending transaction with invalid JID");
                r2.A0A(sb.toString(), e2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00eb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0V(X.C15830rv r10, int r11) {
        /*
            r9 = this;
            r6 = 0
            boolean r0 = r9.A0i()
            if (r0 == 0) goto L_0x0022
            r0 = 2
            if (r10 != 0) goto L_0x001d
            android.util.Pair r0 = r9.A0E(r0)
        L_0x000e:
            if (r0 != 0) goto L_0x0035
            X.1Vo r1 = r9.A09
            java.lang.String r0 = "readTransactionsV2/null queryPair"
        L_0x0014:
            r1.A05(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            return r5
        L_0x001d:
            android.util.Pair r0 = r9.A0F(r10, r0)
            goto L_0x000e
        L_0x0022:
            r0 = 1
            if (r10 != 0) goto L_0x0030
            android.util.Pair r0 = r9.A0E(r0)
        L_0x0029:
            if (r0 != 0) goto L_0x0092
            X.1Vo r1 = r9.A09
            java.lang.String r0 = "PaymentTransactionStore/readTransactions/null queryPair"
            goto L_0x0014
        L_0x0030:
            android.util.Pair r0 = r9.A0F(r10, r0)
            goto L_0x0029
        L_0x0035:
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.second
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r7 = "init_timestamp DESC"
            if (r11 <= 0) goto L_0x004f
            java.lang.String r8 = java.lang.Integer.toString(r11)
        L_0x0045:
            r9.A0i()
            X.0tq r0 = r9.A04
            X.0tf r0 = r0.get()
            goto L_0x0052
        L_0x004f:
            java.lang.String r8 = ""
            goto L_0x0045
        L_0x0052:
            X.0tg r1 = r0.A02     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "pay_transaction"
            java.lang.String[] r3 = A0B     // Catch:{ all -> 0x00ec }
            android.database.Cursor r4 = r1.A09(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x0082
            java.lang.String r1 = "readTransactionsV2"
            java.util.List r5 = r9.A0U(r4, r1)     // Catch:{ all -> 0x008b }
            X.1Vo r3 = r9.A09     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r2.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "readTransactionsV2 returned: "
            r2.append(r1)     // Catch:{ all -> 0x008b }
            int r1 = r5.size()     // Catch:{ all -> 0x008b }
            r2.append(r1)     // Catch:{ all -> 0x008b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x008b }
            r3.A03(r6, r1)     // Catch:{ all -> 0x008b }
            r4.close()     // Catch:{ all -> 0x00ec }
            goto L_0x0087
        L_0x0082:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008b }
            r5.<init>()     // Catch:{ all -> 0x008b }
        L_0x0087:
            r0.close()
            return r5
        L_0x008b:
            r1 = move-exception
            if (r4 == 0) goto L_0x00eb
            r4.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00eb
        L_0x0092:
            java.lang.Object r4 = r0.first
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.second
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.String r7 = "init_timestamp DESC"
            if (r11 <= 0) goto L_0x00a9
            java.lang.String r8 = java.lang.Integer.toString(r11)
        L_0x00a2:
            X.0tq r0 = r9.A04
            X.0tf r0 = r0.get()
            goto L_0x00ac
        L_0x00a9:
            java.lang.String r8 = ""
            goto L_0x00a2
        L_0x00ac:
            X.0tg r1 = r0.A02     // Catch:{ all -> 0x00ec }
            java.lang.String r2 = "pay_transactions"
            java.lang.String[] r3 = A0A     // Catch:{ all -> 0x00ec }
            android.database.Cursor r5 = r1.A09(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ec }
            if (r5 == 0) goto L_0x00dc
            java.lang.String r1 = "readTransactions"
            java.util.List r4 = r9.A0U(r5, r1)     // Catch:{ all -> 0x00e5 }
            X.1Vo r3 = r9.A09     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r2.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "readTransactions returned: "
            r2.append(r1)     // Catch:{ all -> 0x00e5 }
            int r1 = r4.size()     // Catch:{ all -> 0x00e5 }
            r2.append(r1)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00e5 }
            r3.A03(r6, r1)     // Catch:{ all -> 0x00e5 }
            r5.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00e1
        L_0x00dc:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00e5 }
            r4.<init>()     // Catch:{ all -> 0x00e5 }
        L_0x00e1:
            r0.close()
            return r4
        L_0x00e5:
            r1 = move-exception
            if (r5 == 0) goto L_0x00eb
            r5.close()     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0V(X.0rv, int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0W(X.C39961tL r13) {
        /*
            r12 = this;
            boolean r0 = r12.A0i()
            if (r0 == 0) goto L_0x0015
            android.util.Pair r0 = r12.A0H(r13)
        L_0x000a:
            java.lang.Object r8 = r0.first
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.lang.Object r7 = r0.second
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r10 = "init_timestamp DESC"
            goto L_0x001a
        L_0x0015:
            android.util.Pair r0 = r12.A0G(r13)
            goto L_0x000a
        L_0x001a:
            X.0tq r0 = r12.A04     // Catch:{ Exception -> 0x006f }
            X.0tf r3 = r0.get()     // Catch:{ Exception -> 0x006f }
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x006a }
            java.lang.String r5 = r12.A0P()     // Catch:{ all -> 0x006a }
            boolean r0 = r12.A0i()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0037
            java.lang.String[] r6 = A0B     // Catch:{ all -> 0x006a }
        L_0x002e:
            r9 = 0
            r11 = r9
            android.database.Cursor r5 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x006a }
            if (r5 == 0) goto L_0x0066
            goto L_0x003a
        L_0x0037:
            java.lang.String[] r6 = A0A     // Catch:{ all -> 0x006a }
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = "readTransactionsWithFilters"
            java.util.List r4 = r12.A0U(r5, r0)     // Catch:{ all -> 0x0061 }
            X.1Vo r2 = r12.A09     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r1.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "readTransactionsWithFilters returned: "
            r1.append(r0)     // Catch:{ all -> 0x0061 }
            int r0 = r4.size()     // Catch:{ all -> 0x0061 }
            r1.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0061 }
            r2.A03(r9, r0)     // Catch:{ all -> 0x0061 }
            r5.close()     // Catch:{ all -> 0x006a }
            r3.close()     // Catch:{ Exception -> 0x006f }
            return r4
        L_0x0061:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x0066:
            r3.close()     // Catch:{ Exception -> 0x006f }
            goto L_0x0077
        L_0x006a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006e }
        L_0x006e:
            throw r0     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            r2 = move-exception
            X.1Vo r1 = r12.A09
            java.lang.String r0 = "PaymentTransactionStore/readTransactionsWithFilters "
            r1.A0A(r0, r2)
        L_0x0077:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0W(X.1tL):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x012e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0133 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x0133=Splitter:B:62:0x0133, B:51:0x0124=Splitter:B:51:0x0124} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0X(java.lang.String r13, java.lang.Integer[] r14, java.lang.Integer[] r15, int r16) {
        /*
            r12 = this;
            monitor-enter(r12)
            X.0tq r3 = r12.A04     // Catch:{ all -> 0x0141 }
            r3.A04()     // Catch:{ all -> 0x0141 }
            boolean r0 = r3.A01     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0010
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0141 }
            goto L_0x013f
        L_0x0010:
            int r0 = r14.length     // Catch:{ all -> 0x0141 }
            r7 = 1
            r6 = 0
            r4 = 2
            if (r0 <= 0) goto L_0x004e
            java.lang.String r2 = "(%s IN (\"%s\"))"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "status"
            r1[r6] = r0     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "\",\""
            java.lang.String r0 = android.text.TextUtils.join(r0, r14)     // Catch:{ all -> 0x0141 }
            r1[r7] = r0     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0141 }
        L_0x002b:
            int r0 = r15.length     // Catch:{ all -> 0x0141 }
            if (r0 <= 0) goto L_0x004b
            java.lang.String r5 = "(%s IN (\"%s\"))"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "type"
            r1[r6] = r0     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "\",\""
            java.lang.String r0 = android.text.TextUtils.join(r0, r15)     // Catch:{ all -> 0x0141 }
            r1[r7] = r0     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x0141 }
        L_0x0043:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0141 }
            r11 = 0
            if (r0 == 0) goto L_0x0052
            goto L_0x0051
        L_0x004b:
            java.lang.String r5 = ""
            goto L_0x0043
        L_0x004e:
            java.lang.String r2 = ""
            goto L_0x002b
        L_0x0051:
            r2 = r11
        L_0x0052:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0090
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            r1.append(r2)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0141 }
            r1.append(r5)     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0141 }
        L_0x0072:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0141 }
            if (r0 != 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "credential_id="
            r1.append(r0)     // Catch:{ all -> 0x0141 }
            r1.append(r13)     // Catch:{ all -> 0x0141 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0141 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x0094
            goto L_0x0092
        L_0x0090:
            r5 = r2
            goto L_0x0072
        L_0x0092:
            r5 = r2
            goto L_0x00a8
        L_0x0094:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            r1.append(r5)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x0141 }
            r1.append(r2)     // Catch:{ all -> 0x0141 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0141 }
        L_0x00a8:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0141 }
            if (r0 == 0) goto L_0x00b5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0141 }
            r5.<init>()     // Catch:{ all -> 0x0141 }
            goto L_0x013f
        L_0x00b5:
            java.lang.String r2 = "(%s) AND (%s IS NOT NULL)"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0141 }
            r1[r6] = r5     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "id"
            r1[r7] = r0     // Catch:{ all -> 0x0141 }
            java.lang.String r7 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x0141 }
            X.1Vo r2 = r12.A09     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r1.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = "pending txns query: "
            r1.append(r0)     // Catch:{ all -> 0x0141 }
            r1.append(r7)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0141 }
            r8 = 0
            r2.A03(r11, r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r10 = "timestamp DESC"
            if (r16 <= 0) goto L_0x00e3
            java.lang.String r11 = java.lang.Integer.toString(r16)     // Catch:{ all -> 0x0141 }
        L_0x00e3:
            r12.A0i()     // Catch:{ all -> 0x0141 }
            X.0tf r3 = r3.get()     // Catch:{ IllegalStateException -> 0x0134 }
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x012f }
            java.lang.String r5 = r12.A0P()     // Catch:{ all -> 0x012f }
            boolean r0 = r12.A0i()     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x00fe
            java.lang.String[] r6 = A0B     // Catch:{ all -> 0x012f }
        L_0x00f8:
            r9 = r8
            android.database.Cursor r4 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x012f }
            goto L_0x0101
        L_0x00fe:
            java.lang.String[] r6 = A0A     // Catch:{ all -> 0x012f }
            goto L_0x00f8
        L_0x0101:
            java.lang.String r0 = "readTransactionsWithTypeStatusAndCredentialId"
            java.util.List r5 = r12.A0U(r4, r0)     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            r1.<init>()     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = "readPendingTransactions returned: "
            r1.append(r0)     // Catch:{ all -> 0x0128 }
            int r0 = r5.size()     // Catch:{ all -> 0x0128 }
            r1.append(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0128 }
            r2.A03(r8, r0)     // Catch:{ all -> 0x0128 }
            if (r4 == 0) goto L_0x0124
            r4.close()     // Catch:{ all -> 0x012f }
        L_0x0124:
            r3.close()     // Catch:{ IllegalStateException -> 0x0134 }
            goto L_0x013f
        L_0x0128:
            r0 = move-exception
            if (r4 == 0) goto L_0x012e
            r4.close()     // Catch:{ all -> 0x012e }
        L_0x012e:
            throw r0     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0133 }
        L_0x0133:
            throw r0     // Catch:{ IllegalStateException -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            java.lang.String r0 = "readPendingTransactions/IllegalStateException "
            r2.A0A(r0, r1)     // Catch:{ all -> 0x0141 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0141 }
            r5.<init>()     // Catch:{ all -> 0x0141 }
        L_0x013f:
            monitor-exit(r12)
            return r5
        L_0x0141:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0X(java.lang.String, java.lang.Integer[], java.lang.Integer[], int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A0Y(java.lang.String r14, java.lang.String[] r15, int r16) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r11 = "init_timestamp DESC"
            if (r16 <= 0) goto L_0x000a
            java.lang.String r12 = java.lang.Integer.toString(r16)     // Catch:{ all -> 0x0064 }
            goto L_0x000c
        L_0x000a:
            java.lang.String r12 = ""
        L_0x000c:
            X.0tq r0 = r13.A04     // Catch:{ IllegalStateException -> 0x0055 }
            X.0tf r4 = r0.get()     // Catch:{ IllegalStateException -> 0x0055 }
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = "pay_transactions"
            java.lang.String[] r7 = A0A     // Catch:{ all -> 0x0050 }
            r10 = 0
            r8 = r14
            r9 = r15
            android.database.Cursor r5 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "queryPaymentTransactionInfos"
            java.util.List r3 = r13.A0U(r5, r0)     // Catch:{ all -> 0x0049 }
            X.1Vo r2 = r13.A09     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "readPendingRequests returned: "
            r1.append(r0)     // Catch:{ all -> 0x0049 }
            int r0 = r3.size()     // Catch:{ all -> 0x0049 }
            r1.append(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0049 }
            r2.A03(r10, r0)     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x0044
            r5.close()     // Catch:{ all -> 0x0050 }
        L_0x0044:
            r4.close()     // Catch:{ IllegalStateException -> 0x0055 }
            monitor-exit(r13)
            return r3
        L_0x0049:
            r0 = move-exception
            if (r5 == 0) goto L_0x004f
            r5.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0     // Catch:{ IllegalStateException -> 0x0055 }
        L_0x0055:
            r2 = move-exception
            X.1Vo r1 = r13.A09     // Catch:{ all -> 0x0064 }
            java.lang.String r0 = "PaymentTransactionStore/queryPaymentTransactionInfos/IllegalStateException "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0064 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0064 }
            r0.<init>()     // Catch:{ all -> 0x0064 }
            monitor-exit(r13)
            return r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0Y(java.lang.String, java.lang.String[], int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0053 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0058 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0048=Splitter:B:17:0x0048, B:30:0x0058=Splitter:B:30:0x0058} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A0Z(java.lang.String r14, java.lang.String[] r15, int r16) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r11 = "init_timestamp DESC"
            if (r16 <= 0) goto L_0x000d
            java.lang.String r12 = java.lang.Integer.toString(r16)     // Catch:{ all -> 0x0068 }
        L_0x0009:
            r13.A0i()     // Catch:{ all -> 0x0068 }
            goto L_0x0010
        L_0x000d:
            java.lang.String r12 = ""
            goto L_0x0009
        L_0x0010:
            X.0tq r0 = r13.A04     // Catch:{ IllegalStateException -> 0x0059 }
            X.0tf r4 = r0.get()     // Catch:{ IllegalStateException -> 0x0059 }
            X.0tg r5 = r4.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r6 = "pay_transaction"
            java.lang.String[] r7 = A0B     // Catch:{ all -> 0x0054 }
            r10 = 0
            r8 = r14
            r9 = r15
            android.database.Cursor r5 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "queryPaymentTransactionInfosV2"
            java.util.List r3 = r13.A0U(r5, r0)     // Catch:{ all -> 0x004d }
            X.1Vo r2 = r13.A09     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "readPendingRequests returned: "
            r1.append(r0)     // Catch:{ all -> 0x004d }
            int r0 = r3.size()     // Catch:{ all -> 0x004d }
            r1.append(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004d }
            r2.A03(r10, r0)     // Catch:{ all -> 0x004d }
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ all -> 0x0054 }
        L_0x0048:
            r4.close()     // Catch:{ IllegalStateException -> 0x0059 }
            monitor-exit(r13)
            return r3
        L_0x004d:
            r0 = move-exception
            if (r5 == 0) goto L_0x0053
            r5.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0     // Catch:{ IllegalStateException -> 0x0059 }
        L_0x0059:
            r2 = move-exception
            X.1Vo r1 = r13.A09     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "queryPaymentTransactionInfosV2/IllegalStateException "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0068 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0068 }
            r0.<init>()     // Catch:{ all -> 0x0068 }
            monitor-exit(r13)
            return r0
        L_0x0068:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0Z(java.lang.String, java.lang.String[], int):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0084 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0a(java.util.List r13) {
        /*
            r12 = this;
            java.lang.String r0 = "id IN (\""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "\",\""
            java.lang.String r0 = android.text.TextUtils.join(r0, r13)
            r1.append(r0)
            java.lang.String r0 = "\")"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r12.A0i()
            X.0tq r0 = r12.A04
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x008e }
            java.lang.String r5 = r12.A0P()     // Catch:{ all -> 0x008e }
            boolean r0 = r12.A0i()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x003c
            java.lang.String[] r6 = A0B     // Catch:{ all -> 0x008e }
        L_0x0030:
            r8 = 0
            java.lang.String r11 = "100"
            r10 = r8
            r9 = r8
            android.database.Cursor r5 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0085
            goto L_0x003f
        L_0x003c:
            java.lang.String[] r6 = A0A     // Catch:{ all -> 0x008e }
            goto L_0x0030
        L_0x003f:
            int r0 = r5.getCount()     // Catch:{ all -> 0x0080 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0080 }
            r4.<init>(r0)     // Catch:{ all -> 0x0080 }
        L_0x0048:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x005f
            X.1Vt r0 = r12.A0I(r5)     // Catch:{ 1W4 -> 0x0056 }
            r4.add(r0)     // Catch:{ 1W4 -> 0x0056 }
            goto L_0x0048
        L_0x0056:
            r2 = move-exception
            X.1Vo r1 = r12.A09     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "readTransactionsByIds/InvalidJidException - Skipped transaction with invalid JID"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0080 }
            goto L_0x0048
        L_0x005f:
            X.1Vo r2 = r12.A09     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r1.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "readTransactionsByIds returned: "
            r1.append(r0)     // Catch:{ all -> 0x0080 }
            int r0 = r4.size()     // Catch:{ all -> 0x0080 }
            r1.append(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0080 }
            r2.A06(r0)     // Catch:{ all -> 0x0080 }
            r5.close()     // Catch:{ all -> 0x008e }
            r3.close()
            return r4
        L_0x0080:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0085:
            r3.close()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x008e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0a(java.util.List):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0125 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x012a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A0b(boolean r16) {
        /*
            r15 = this;
            r14 = r15
            monitor-enter(r14)
            X.0t3 r0 = r15.A02     // Catch:{ all -> 0x0144 }
            long r12 = r0.A00()     // Catch:{ all -> 0x0144 }
            r5 = -1
            if (r16 == 0) goto L_0x006a
            int[] r8 = X.AnonymousClass1Vt.A0T     // Catch:{ all -> 0x0068 }
            int r7 = r8.length     // Catch:{ all -> 0x0068 }
            int[] r4 = X.AnonymousClass1Vt.A0U     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            int r0 = r7 + r3
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0068 }
            r2.<init>(r0)     // Catch:{ all -> 0x0068 }
            r6 = 0
            r1 = 0
        L_0x001a:
            if (r1 >= r7) goto L_0x0028
            r0 = r8[r1]     // Catch:{ all -> 0x0068 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r2.add(r0)     // Catch:{ all -> 0x0068 }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r1 >= r3) goto L_0x0037
            r0 = r4[r1]     // Catch:{ all -> 0x0068 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r2.add(r0)     // Catch:{ all -> 0x0068 }
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0037:
            java.lang.Integer[] r0 = new java.lang.Integer[r6]     // Catch:{ all -> 0x0068 }
            java.lang.Object[] r4 = r2.toArray(r0)     // Catch:{ all -> 0x0068 }
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4     // Catch:{ all -> 0x0068 }
            r0 = 4
            java.lang.Integer[] r3 = new java.lang.Integer[r0]     // Catch:{ all -> 0x0068 }
            r2 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0068 }
            r3[r6] = r0     // Catch:{ all -> 0x0068 }
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r0 = 1
            r3[r0] = r1     // Catch:{ all -> 0x0068 }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r3[r2] = r0     // Catch:{ all -> 0x0068 }
            r1 = 3
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0068 }
            r3[r1] = r0     // Catch:{ all -> 0x0068 }
            java.util.List r0 = r15.A0c(r4, r3, r5)     // Catch:{ all -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x006a:
            java.util.List r0 = r15.A0T(r5)     // Catch:{ all -> 0x0144 }
        L_0x006e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0144 }
            r4.<init>()     // Catch:{ all -> 0x0144 }
            X.0tq r6 = r15.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
            X.0tf r5 = r6.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
            X.1cj r11 = r5.A00()     // Catch:{ all -> 0x0126 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0121 }
        L_0x0081:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0117
            java.lang.Object r7 = r10.next()     // Catch:{ all -> 0x0121 }
            X.1Vt r7 = (X.AnonymousClass1Vt) r7     // Catch:{ all -> 0x0121 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0121 }
            r8.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = r7.A0L     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0121 }
            android.util.Pair r9 = A06(r1, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0081
            java.lang.String r1 = "status"
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0121 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r12 / r0
            int r2 = (int) r0     // Catch:{ all -> 0x0121 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0121 }
            r8.put(r3, r0)     // Catch:{ all -> 0x0121 }
            X.1Vo r2 = r15.A09     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r1.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "failed transaction/key_id="
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r7.A0L     // Catch:{ all -> 0x0121 }
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = ", transaction_id="
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r7.A0K     // Catch:{ all -> 0x0121 }
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0121 }
            r2.A06(r0)     // Catch:{ all -> 0x0121 }
            boolean r0 = r15.A0i()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00ed
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0121 }
            java.lang.Object r2 = r9.first     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0121 }
            java.lang.Object r1 = r9.second     // Catch:{ all -> 0x0121 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "pay_transaction"
            r3.A00(r0, r8, r2, r1)     // Catch:{ all -> 0x0121 }
        L_0x00ed:
            r6.A04()     // Catch:{ all -> 0x0121 }
            X.1jC r0 = r6.A04     // Catch:{ all -> 0x0121 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x0107
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "pay_transactions"
            java.lang.Object r1 = r9.first     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0121 }
            java.lang.Object r0 = r9.second     // Catch:{ all -> 0x0121 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x0121 }
            r3.A00(r2, r8, r1, r0)     // Catch:{ all -> 0x0121 }
        L_0x0107:
            X.0rv r3 = r7.A0C     // Catch:{ all -> 0x0121 }
            boolean r2 = r7.A0Q     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = r7.A0L     // Catch:{ all -> 0x0121 }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x0121 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x0121 }
            r4.add(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x0081
        L_0x0117:
            r11.A00()     // Catch:{ all -> 0x0121 }
            r11.close()     // Catch:{ all -> 0x0126 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
            goto L_0x0142
        L_0x0121:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0125 }
        L_0x0125:
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x012a }
        L_0x012a:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        L_0x012b:
            r3 = move-exception
            X.1Vo r2 = r15.A09     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0144 }
            r1.<init>()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "PaymentTransactionStore/failPendingTransactions/failed: "
            r1.append(r0)     // Catch:{ all -> 0x0144 }
            r1.append(r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0144 }
            r2.A05(r0)     // Catch:{ all -> 0x0144 }
        L_0x0142:
            monitor-exit(r14)
            return r4
        L_0x0144:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0b(boolean):java.util.List");
    }

    public synchronized List A0c(Integer[] numArr, Integer[] numArr2, int i2) {
        return A0X((String) null, numArr, numArr2, i2);
    }

    public void A0d() {
        ArrayList arrayList = new ArrayList();
        Cursor A0B2 = A0B((Integer) null);
        while (A0B2.moveToNext()) {
            try {
                AnonymousClass1Vt A0I = A0I(A0B2);
                A0I.A06 = this.A02.A00();
                AnonymousClass1W2 r1 = A0I.A0A;
                if (r1 != null) {
                    r1.A03 = Boolean.TRUE;
                }
                arrayList.add(A0I);
            } catch (AnonymousClass1W4 e2) {
                this.A09.A0A("setAllPendingRequestViewed/InvalidJidException - Skipped pending transaction with invalid JID", e2);
            } catch (Throwable th) {
                if (A0B2 != null) {
                    try {
                        A0B2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        A0B2.close();
        A0n(arrayList);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0082 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0e(X.AnonymousClass1Vt r13) {
        /*
            r12 = this;
            r11 = r12
            monitor-enter(r11)
            X.0t3 r0 = r12.A02     // Catch:{ all -> 0x0091 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0091 }
            X.0tq r3 = r12.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0088 }
            X.0tf r4 = r3.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0088 }
            X.1cj r10 = r4.A00()     // Catch:{ all -> 0x0083 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x007e }
            r5.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r13.A0L     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r13.A0K     // Catch:{ all -> 0x007e }
            android.util.Pair r6 = A06(r6, r2)     // Catch:{ all -> 0x007e }
            java.lang.String r7 = "status"
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r5.put(r7, r2)     // Catch:{ all -> 0x007e }
            java.lang.String r9 = "timestamp"
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r7
            int r2 = (int) r0     // Catch:{ all -> 0x007e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r5.put(r9, r0)     // Catch:{ all -> 0x007e }
            X.1Vo r2 = r12.A09     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "expirePendingRequest key id:"
            r1.append(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r13.A0L     // Catch:{ all -> 0x007e }
            r1.append(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            r2.A06(r0)     // Catch:{ all -> 0x007e }
            boolean r0 = r12.A0i()     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x005a
            A00(r5, r4, r13)     // Catch:{ all -> 0x007e }
        L_0x005a:
            r3.A04()     // Catch:{ all -> 0x007e }
            X.1jC r0 = r3.A04     // Catch:{ all -> 0x007e }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0074
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "pay_transactions"
            java.lang.Object r1 = r6.first     // Catch:{ all -> 0x007e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r6.second     // Catch:{ all -> 0x007e }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x007e }
            r3.A00(r2, r5, r1, r0)     // Catch:{ all -> 0x007e }
        L_0x0074:
            r10.A00()     // Catch:{ all -> 0x007e }
            r10.close()     // Catch:{ all -> 0x0083 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0088 }
            goto L_0x008f
        L_0x007e:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0087 }
        L_0x0087:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0088 }
        L_0x0088:
            X.1Vo r1 = r12.A09     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "expirePendingRequest failed."
            r1.A05(r0)     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r11)
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0e(X.1Vt):void");
    }

    public void A0f(C16740tZ r4) {
        String str;
        if (r4.A10 == 0) {
            String str2 = "UNSET";
            if (str2.equals(r4.A0n)) {
                AnonymousClass1Vt A0M = A0M(r4.A11.A01, (String) null);
                if (A0M == null && !AnonymousClass1W1.A08(r4.A0L)) {
                    A0Q(r4, false);
                }
                r4.A0L = A0M;
                if (!(A0M == null || (str = A0M.A0K) == null)) {
                    str2 = str;
                }
                r4.A0n = str2;
            }
        }
    }

    public void A0g(String str, int i2, int i3, long j2, long j3) {
        AnonymousClass1Vt A0L;
        C228919r AEq;
        if (!TextUtils.isEmpty(str) && i2 > 0 && j2 > 0 && j3 > 0 && i3 > 0 && (A0L = A0L(str)) != null) {
            AnonymousClass1W2 r1 = A0L.A0A;
            if (!(r1 == null && ((AEq = this.A00.AEq(A0L.A0G, A0L.A0I)) == null || (r1 = AEq.AI7()) == null))) {
                r1.A0P(A0L.A03);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i2));
            contentValues.put("init_timestamp", Integer.valueOf((int) (j2 / 1000)));
            contentValues.put("status", Integer.valueOf(i3));
            contentValues.put("timestamp", Integer.valueOf((int) (j3 / 1000)));
            String[] strArr = {str};
            C16900tq r5 = this.A04;
            C16800tf A022 = r5.A02();
            try {
                if (A0i()) {
                    A022.A02.A00("pay_transaction", contentValues, "id=?", strArr);
                }
                r5.A04();
                if (r5.A04.A0D(A022)) {
                    int A002 = A022.A02.A00("pay_transactions", contentValues, "id=?", strArr);
                    AnonymousClass1Vo r2 = this.A09;
                    StringBuilder sb = new StringBuilder();
                    sb.append("updateTransactionTypeById/");
                    sb.append(str);
                    sb.append("/");
                    sb.append(A002);
                    r2.A03((String) null, sb.toString());
                }
                A0i();
                A022.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean A0h() {
        Cursor A0B2 = A0B(1);
        try {
            boolean moveToNext = A0B2.moveToNext();
            A0B2.close();
            return moveToNext;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public boolean A0i() {
        boolean z2;
        C16900tq r2 = this.A04;
        C16800tf A012 = r2.get();
        try {
            if (this.A03.A0C()) {
                r2.A04();
                C33811jC r1 = r2.A04;
                if (!r1.A0E(A012.A02)) {
                    r2.A04();
                    if (r1.A0D(A012)) {
                        if (this.A05.A01("new_pay_transaction_ready", 0) == 1) {
                        }
                    }
                }
                z2 = true;
                A012.close();
                return z2;
            }
            z2 = false;
            A012.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public boolean A0j(AnonymousClass1Vt r4) {
        AnonymousClass1Vt A0M = A0M(r4.A0L, r4.A0K);
        if (A0M == null) {
            return false;
        }
        r4.A06 = this.A02.A00();
        return A0l(r4, A0M, r4.A0L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = r5.A02;
        r0 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r0 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r0 = new X.C35501m2();
        r3.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r0.A00.put(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        return r4.A0I(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0k(X.AnonymousClass1Vt r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.1W2 r0 = r9.A0A     // Catch:{ all -> 0x00b9 }
            r6 = 0
            if (r0 == 0) goto L_0x0009
            X.1lz r5 = r0.A00     // Catch:{ all -> 0x00b9 }
            goto L_0x000a
        L_0x0009:
            r5 = r6
        L_0x000a:
            r7 = 0
            if (r5 == 0) goto L_0x00b7
            X.0sK r1 = r8.A01     // Catch:{ all -> 0x00b9 }
            com.whatsapp.jid.UserJid r0 = r9.A0E     // Catch:{ all -> 0x00b9 }
            boolean r0 = r1.A0I(r0)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b7
            com.whatsapp.jid.UserJid r0 = r9.A0D     // Catch:{ all -> 0x00b9 }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x00b9 }
            if (r2 == 0) goto L_0x00b0
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b0
            X.160 r4 = r8.A07     // Catch:{ all -> 0x00b9 }
            X.1m3 r3 = r4.A05(r2)     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r3.A05     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x004d
        L_0x002f:
            java.lang.String r0 = X.C24561Gk.A04(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x00b9 }
            X.1cm r0 = X.C30681cm.A01(r0)     // Catch:{ all -> 0x00b9 }
            X.1GR r1 = r8.A00     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x00b9 }
            X.19r r0 = r1.AG0(r0, r6)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0063
            X.1m3 r3 = r0.AI5()     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x00b7
            r3.A05 = r2     // Catch:{ all -> 0x00b9 }
        L_0x004d:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x00b9 }
            r2.<init>()     // Catch:{ all -> 0x00b9 }
            X.1m2 r0 = r3.A04     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00b9 }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00b9 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0067
            goto L_0x0066
        L_0x0063:
            if (r3 == 0) goto L_0x00b7
            goto L_0x004d
        L_0x0066:
            r2 = r0
        L_0x0067:
            int r0 = r9.A02     // Catch:{ NumberFormatException -> 0x00a7 }
            switch(r0) {
                case 401: goto L_0x0082;
                case 402: goto L_0x0082;
                case 403: goto L_0x0082;
                case 404: goto L_0x0074;
                case 405: goto L_0x0082;
                case 406: goto L_0x0074;
                case 407: goto L_0x0074;
                case 408: goto L_0x0074;
                case 409: goto L_0x0074;
                case 410: goto L_0x0082;
                case 411: goto L_0x0074;
                case 412: goto L_0x0074;
                case 413: goto L_0x0074;
                case 414: goto L_0x0074;
                case 415: goto L_0x0074;
                case 416: goto L_0x0074;
                case 417: goto L_0x0082;
                case 418: goto L_0x0074;
                case 419: goto L_0x0074;
                case 420: goto L_0x0082;
                case 421: goto L_0x0074;
                default: goto L_0x006c;
            }     // Catch:{ NumberFormatException -> 0x00a7 }
        L_0x006c:
            X.1Vo r1 = r8.A09     // Catch:{ NumberFormatException -> 0x00a7 }
            java.lang.String r0 = "There's no valid transaction status. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            goto L_0x00b7
        L_0x0074:
            java.lang.String r0 = r9.A0K     // Catch:{ NumberFormatException -> 0x00a7 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            r2.remove(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            goto L_0x008f
        L_0x0082:
            java.lang.String r0 = r9.A0K     // Catch:{ NumberFormatException -> 0x00a7 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
            r2.add(r0)     // Catch:{ NumberFormatException -> 0x00a7 }
        L_0x008f:
            java.lang.String r1 = r5.A02     // Catch:{ all -> 0x00b9 }
            X.1m2 r0 = r3.A04     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x009c
            X.1m2 r0 = new X.1m2     // Catch:{ all -> 0x00b9 }
            r0.<init>()     // Catch:{ all -> 0x00b9 }
            r3.A04 = r0     // Catch:{ all -> 0x00b9 }
        L_0x009c:
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x00b9 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00b9 }
            boolean r0 = r4.A0I(r3)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r8)
            return r0
        L_0x00a7:
            r2 = move-exception
            X.1Vo r1 = r8.A09     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "There was a problem parsing the paymentTransactionInfo.id"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b7
        L_0x00b0:
            X.1Vo r1 = r8.A09     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "insertOrUpdateIncentivePaymentContactInfo/ Receiver Jid or transaction id are null. Updating the incentive record in the payment contacts table failed."
            r1.A05(r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b7:
            monitor-exit(r8)
            return r7
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0k(X.1Vt):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x0245 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:68:0x0245=Splitter:B:68:0x0245, B:62:0x023d=Splitter:B:62:0x023d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0l(X.AnonymousClass1Vt r19, X.AnonymousClass1Vt r20, java.lang.String r21) {
        /*
            r18 = this;
            r17 = 0
            r4 = r18
            r9 = r19
            r6 = r21
            r9.A0L = r6     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            r11 = r20
            android.content.ContentValues r3 = r4.A09(r11, r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            if (r3 != 0) goto L_0x001a
            X.1Vo r1 = r4.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessage() content-values are null, nothing to update"
            r1.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            return r17
        L_0x001a:
            int r0 = r3.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            if (r0 <= 0) goto L_0x0246
            X.0tq r10 = r4.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            X.0tf r5 = r10.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            boolean r0 = r4.A0i()     // Catch:{ all -> 0x0241 }
            r15 = 0
            if (r0 == 0) goto L_0x0162
            android.content.ContentValues r12 = r4.A0A(r11, r9)     // Catch:{ all -> 0x0241 }
            r1 = 0
            if (r12 != 0) goto L_0x004b
            X.1Vo r8 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 content values are null, nothing to update"
        L_0x003a:
            r8.A06(r0)     // Catch:{ all -> 0x0241 }
        L_0x003d:
            r10.A04()     // Catch:{ all -> 0x0241 }
            X.1jC r0 = r10.A04     // Catch:{ all -> 0x0241 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x0241 }
            r12 = 1
            if (r0 == 0) goto L_0x0238
            goto L_0x0166
        L_0x004b:
            boolean r0 = r9.A0P     // Catch:{ all -> 0x0241 }
            java.lang.String r7 = "key_id"
            if (r0 != 0) goto L_0x0077
            r12.put(r7, r6)     // Catch:{ all -> 0x0241 }
        L_0x0054:
            java.lang.String r7 = "/"
            if (r20 != 0) goto L_0x0095
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "pay_transaction"
            long r1 = r1.A04(r12, r0)     // Catch:{ all -> 0x0241 }
            X.1Vo r8 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.String r12 = "insertOrUpdatePaymentInfoWithoutMessageV2/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r0.<init>(r12)     // Catch:{ all -> 0x0241 }
            r0.append(r6)     // Catch:{ all -> 0x0241 }
            r0.append(r7)     // Catch:{ all -> 0x0241 }
            r0.append(r1)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0241 }
            goto L_0x003a
        L_0x0077:
            java.lang.String r0 = "interop_id"
            r12.put(r0, r6)     // Catch:{ all -> 0x0241 }
            r12.remove(r7)     // Catch:{ all -> 0x0241 }
            X.1Vo r7 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 interop_id is added to content values"
            r7.A06(r0)     // Catch:{ all -> 0x0241 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is empty"
        L_0x008e:
            r7.A06(r0)     // Catch:{ all -> 0x0241 }
            goto L_0x0054
        L_0x0092:
            java.lang.String r0 = "IN- HANDLE_SEND_AGAIN insertOrUpdatePaymentInfoWithoutMessageV2 keyId is not empty"
            goto L_0x008e
        L_0x0095:
            boolean r0 = r11.A0J(r9)     // Catch:{ all -> 0x0241 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r13 = r9.A0K     // Catch:{ all -> 0x0241 }
            boolean r14 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0241 }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0241 }
            if (r14 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            goto L_0x0146
        L_0x00ab:
            r8 = 2
            r1 = 1
            if (r14 != 0) goto L_0x00bb
            if (r0 != 0) goto L_0x00b2
            goto L_0x00c2
        L_0x00b2:
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x0241 }
            r2[r17] = r21     // Catch:{ all -> 0x0241 }
            r2[r1] = r21     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "key_id=? OR interop_id=?"
            goto L_0x00cd
        L_0x00bb:
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0241 }
            r2[r17] = r13     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "id=?"
            goto L_0x00cd
        L_0x00c2:
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0241 }
            r2[r17] = r21     // Catch:{ all -> 0x0241 }
            r2[r1] = r21     // Catch:{ all -> 0x0241 }
            r2[r8] = r13     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = "key_id=? OR interop_id=? OR id=?"
        L_0x00cd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0241 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0241 }
            java.lang.Object r13 = r0.first     // Catch:{ all -> 0x0241 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0241 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0241 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0241 }
            X.1Vo r8 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 already exists with old message id: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r1.<init>(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "; new key id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " old transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " new transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " query: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            r1.append(r13)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " params: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = java.util.Arrays.toString(r2)     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0241 }
            r0 = 0
            r8.A03(r0, r1)     // Catch:{ all -> 0x0241 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "pay_transaction"
            int r0 = r1.A00(r0, r12, r13, r2)     // Catch:{ all -> 0x0241 }
            long r1 = (long) r0     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2/found old row and updating transaction id: "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r12.<init>(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r12.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " message id: "
            r12.append(r0)     // Catch:{ all -> 0x0241 }
            r12.append(r6)     // Catch:{ all -> 0x0241 }
            r12.append(r7)     // Catch:{ all -> 0x0241 }
            r12.append(r1)     // Catch:{ all -> 0x0241 }
            goto L_0x015c
        L_0x0146:
            X.1Vo r8 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessageV2 got null query and params for interop id: "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r12.<init>(r0)     // Catch:{ all -> 0x0241 }
            r12.append(r6)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " trans id: "
            r12.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r12.append(r0)     // Catch:{ all -> 0x0241 }
        L_0x015c:
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0241 }
            goto L_0x003a
        L_0x0162:
            r1 = 0
            goto L_0x003d
        L_0x0166:
            java.lang.String r7 = "/"
            if (r20 != 0) goto L_0x018e
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "pay_transactions"
            long r1 = r1.A04(r3, r0)     // Catch:{ all -> 0x0241 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r3.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/"
            r3.append(r0)     // Catch:{ all -> 0x0241 }
            r3.append(r6)     // Catch:{ all -> 0x0241 }
            r3.append(r7)     // Catch:{ all -> 0x0241 }
            r3.append(r1)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0241 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0241 }
            goto L_0x0238
        L_0x018e:
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            android.util.Pair r0 = A06(r6, r0)     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x01b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r1.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage got null query and params for message id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            r1.append(r6)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " trans id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0241 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0241 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            return r17
        L_0x01b8:
            java.lang.Object r10 = r0.first     // Catch:{ all -> 0x0241 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0241 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x0241 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0241 }
            X.1Vo r8 = r4.A09     // Catch:{ all -> 0x0241 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r1.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage already exists with old message id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r11.A0L     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "; new key id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0L     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " old transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r11.A0K     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " new transaction id: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " query: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            r1.append(r10)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " params: "
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = java.util.Arrays.toString(r2)     // Catch:{ all -> 0x0241 }
            r1.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0241 }
            r0 = 0
            r8.A03(r0, r1)     // Catch:{ all -> 0x0241 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "pay_transactions"
            int r0 = r1.A00(r0, r3, r10, r2)     // Catch:{ all -> 0x0241 }
            long r1 = (long) r0     // Catch:{ all -> 0x0241 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0241 }
            r3.<init>()     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/found old row and updating transaction id: "
            r3.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r9.A0K     // Catch:{ all -> 0x0241 }
            r3.append(r0)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = " message id: "
            r3.append(r0)     // Catch:{ all -> 0x0241 }
            r3.append(r6)     // Catch:{ all -> 0x0241 }
            r3.append(r7)     // Catch:{ all -> 0x0241 }
            r3.append(r1)     // Catch:{ all -> 0x0241 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0241 }
            r8.A06(r0)     // Catch:{ all -> 0x0241 }
        L_0x0238:
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x023d
            r12 = 0
        L_0x023d:
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            return r12
        L_0x0241:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0245 }
        L_0x0245:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
        L_0x0246:
            X.1Vo r2 = r4.A09     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage/found no columns to update: "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            r1.append(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            r2.A06(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x025d }
            return r17
        L_0x025d:
            r2 = move-exception
            X.1Vo r1 = r4.A09
            java.lang.String r0 = "insertOrUpdatePaymentInfoWithoutMessage"
            r1.A0A(r0, r2)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0l(X.1Vt, X.1Vt, java.lang.String):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x012e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x0126=Splitter:B:63:0x0126, B:69:0x012e=Splitter:B:69:0x012e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0m(X.AnonymousClass1Vt r12, X.C28381Vw r13, int r14, int r15, long r16) {
        /*
            r11 = this;
            X.1GR r2 = r11.A00
            java.lang.String r1 = r12.A0G
            java.lang.String r0 = r12.A0I
            X.19r r0 = r2.AEq(r1, r0)
            if (r0 == 0) goto L_0x003b
            X.1W2 r2 = r0.AI7()
            if (r2 == 0) goto L_0x003b
            monitor-enter(r12)
            if (r14 <= 0) goto L_0x0023
            int r0 = r12.A02     // Catch:{ all -> 0x0037 }
            if (r0 == r14) goto L_0x0023
            X.1W2 r0 = r12.A0A     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0020
            r12.A0A = r2     // Catch:{ all -> 0x0037 }
            r0 = r2
        L_0x0020:
            r0.A0O(r14)     // Catch:{ all -> 0x0037 }
        L_0x0023:
            monitor-exit(r12)
            r0 = r16
            r12.A03(r2, r0)
            monitor-enter(r12)
            if (r15 <= 0) goto L_0x003a
            X.1W2 r0 = r12.A0A     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0033
            r12.A0A = r2     // Catch:{ all -> 0x0037 }
            r0 = r2
        L_0x0033:
            r0.A0N(r15)     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x003a:
            monitor-exit(r12)
        L_0x003b:
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            int r0 = r12.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            r6.put(r0, r1)
            int r0 = r12.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status"
            r6.put(r0, r1)
            long r1 = r12.A06
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r0 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r6.put(r0, r1)
            java.lang.String r0 = r12.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r1 = r12.A0K
            java.lang.String r0 = "id"
            r6.put(r0, r1)
        L_0x0077:
            java.lang.String r0 = r12.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0086
            java.lang.String r1 = r12.A0H
            java.lang.String r0 = "credential_id"
            r6.put(r0, r1)
        L_0x0086:
            java.lang.String r0 = r12.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = r12.A0J
            java.lang.String r0 = "error_code"
            r6.put(r0, r1)
        L_0x0095:
            java.lang.String r0 = r12.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a4
            java.lang.String r1 = r12.A0F
            java.lang.String r0 = "bank_transaction_id"
            r6.put(r0, r1)
        L_0x00a4:
            X.1W2 r0 = r12.A0A
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = r0.A0K()
            java.lang.String r0 = "metadata"
            r6.put(r0, r1)
        L_0x00b1:
            r5 = 1
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r1 = r13.A01
            r10 = 0
            r3[r10] = r1
            X.0tq r9 = r11.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x012f }
            X.0tf r4 = r9.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x012f }
            boolean r0 = r11.A0i()     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r12.A0K     // Catch:{ all -> 0x012a }
            android.util.Pair r0 = A06(r1, r0)     // Catch:{ all -> 0x012a }
            r8 = 0
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r7 = r0.first     // Catch:{ all -> 0x012a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x012a }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x012a }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x012a }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "pay_transaction"
            int r0 = r1.A00(r0, r6, r7, r2)     // Catch:{ all -> 0x012a }
            if (r0 <= 0) goto L_0x00e3
            r8 = 1
            goto L_0x00e3
        L_0x00e2:
            r8 = 0
        L_0x00e3:
            r9.A04()     // Catch:{ all -> 0x012a }
            X.1jC r0 = r9.A04     // Catch:{ all -> 0x012a }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x011d
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x012a }
            java.lang.String r1 = "pay_transactions"
            java.lang.String r0 = "key_id=?"
            int r3 = r2.A00(r1, r6, r0, r3)     // Catch:{ all -> 0x012a }
            X.1Vo r2 = r11.A09     // Catch:{ all -> 0x012a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x012a }
            r1.<init>()     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "PaymentTransactionStore/insertMessagePaymentInfo/"
            r1.append(r0)     // Catch:{ all -> 0x012a }
            X.0rv r0 = r13.A00     // Catch:{ all -> 0x012a }
            r1.append(r0)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x012a }
            r1.append(r3)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x012a }
            r0 = 0
            r2.A03(r0, r1)     // Catch:{ all -> 0x012a }
            if (r3 > 0) goto L_0x011c
            r5 = 0
        L_0x011c:
            r8 = r5
        L_0x011d:
            X.1W2 r0 = r12.A0A     // Catch:{ all -> 0x012a }
            if (r0 == 0) goto L_0x0126
            if (r8 == 0) goto L_0x0126
            r11.A0k(r12)     // Catch:{ all -> 0x012a }
        L_0x0126:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x012f }
            return r8
        L_0x012a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x012e }
        L_0x012e:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x012f }
        L_0x012f:
            r2 = move-exception
            X.1Vo r1 = r11.A09
            java.lang.String r0 = "PaymentTransactionStore/insertMessagePaymentInfo"
            r1.A0A(r0, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0m(X.1Vt, X.1Vw, int, int, long):boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x0184 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0n(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r8 = " counter: "
            r19 = 0
            r7 = r20
            if (r21 == 0) goto L_0x018a
            int r0 = r21.size()
            if (r0 <= 0) goto L_0x018a
            X.0tq r9 = r7.A04
            X.0tf r6 = r9.A02()
            X.1cj r18 = r6.A00()     // Catch:{ all -> 0x0185 }
            java.util.Iterator r17 = r21.iterator()     // Catch:{ all -> 0x0180 }
            r5 = 0
            r16 = 0
        L_0x001f:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0180 }
            r15 = 1
            if (r0 == 0) goto L_0x0179
            java.lang.Object r4 = r17.next()     // Catch:{ all -> 0x0180 }
            X.1Vt r4 = (X.AnonymousClass1Vt) r4     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0180 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0180 }
            X.1Vt r3 = r7.A0L(r0)     // Catch:{ all -> 0x0180 }
            if (r3 == 0) goto L_0x0094
            boolean r0 = r3.A0J(r4)     // Catch:{ all -> 0x0180 }
            if (r0 != 0) goto L_0x0094
            X.1Vo r2 = r7.A09     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r10.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "storeTransactions skipping store transaction with: "
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0180 }
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " as status is not updated  old ts: "
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            long r0 = r3.A06     // Catch:{ all -> 0x0180 }
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            r10.append(r8)     // Catch:{ all -> 0x0180 }
            X.1W2 r0 = r3.A0A     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0092
            int r0 = r0.A05()     // Catch:{ all -> 0x0180 }
        L_0x0069:
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " new ts: "
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            long r0 = r4.A06     // Catch:{ all -> 0x0180 }
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            r10.append(r8)     // Catch:{ all -> 0x0180 }
            X.1W2 r0 = r4.A0A     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x0090
            int r0 = r0.A05()     // Catch:{ all -> 0x0180 }
        L_0x0081:
            r10.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0180 }
            r2.A06(r0)     // Catch:{ all -> 0x0180 }
            int r16 = r16 + 1
            int r5 = r5 + 1
            goto L_0x001f
        L_0x0090:
            r0 = 0
            goto L_0x0081
        L_0x0092:
            r0 = 0
            goto L_0x0069
        L_0x0094:
            boolean r0 = r7.A0i()     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x00eb
            android.content.ContentValues r14 = r7.A0A(r3, r4)     // Catch:{ all -> 0x0180 }
            if (r14 == 0) goto L_0x00eb
            java.lang.String r12 = "id=?"
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0180 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0180 }
            r0 = 1
            if (r1 != 0) goto L_0x00ac
            r0 = 2
        L_0x00ac:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0180 }
            r2[r19] = r0     // Catch:{ all -> 0x0180 }
            if (r1 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r1.<init>()     // Catch:{ all -> 0x0180 }
            r1.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " OR key_id=?"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0180 }
            r2[r15] = r0     // Catch:{ all -> 0x0180 }
        L_0x00c9:
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r10 = "pay_transaction"
            int r0 = r11.A00(r10, r14, r12, r2)     // Catch:{ all -> 0x0180 }
            long r0 = (long) r0     // Catch:{ all -> 0x0180 }
            r12 = 1
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00dd
            long r10 = r11.A02(r14, r10)     // Catch:{ all -> 0x0180 }
            goto L_0x00df
        L_0x00dd:
            r10 = -1
        L_0x00df:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x00e9
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00eb
        L_0x00e9:
            int r5 = r5 + 1
        L_0x00eb:
            r9.A04()     // Catch:{ all -> 0x0180 }
            X.1jC r0 = r9.A04     // Catch:{ all -> 0x0180 }
            boolean r0 = r0.A0D(r6)     // Catch:{ all -> 0x0180 }
            if (r0 == 0) goto L_0x001f
            android.content.ContentValues r13 = r7.A09(r3, r4)     // Catch:{ all -> 0x0180 }
            if (r13 == 0) goto L_0x001f
            java.lang.String r3 = "id=?"
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0180 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0180 }
            r0 = 1
            if (r1 != 0) goto L_0x0108
            r0 = 2
        L_0x0108:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0K     // Catch:{ all -> 0x0180 }
            r2[r19] = r0     // Catch:{ all -> 0x0180 }
            if (r1 != 0) goto L_0x0125
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r1.<init>()     // Catch:{ all -> 0x0180 }
            r1.append(r3)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = " OR key_id=?"
            r1.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r4.A0L     // Catch:{ all -> 0x0180 }
            r2[r15] = r0     // Catch:{ all -> 0x0180 }
        L_0x0125:
            X.0tg r10 = r6.A02     // Catch:{ all -> 0x0180 }
            java.lang.String r1 = "pay_transactions"
            int r0 = r10.A00(r1, r13, r3, r2)     // Catch:{ all -> 0x0180 }
            long r2 = (long) r0     // Catch:{ all -> 0x0180 }
            r11 = 1
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0139
            long r0 = r10.A02(r13, r1)     // Catch:{ all -> 0x0180 }
            goto L_0x013b
        L_0x0139:
            r0 = -1
        L_0x013b:
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x0146
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0146
            goto L_0x014f
        L_0x0146:
            int r16 = r16 + 1
            goto L_0x001f
        L_0x014a:
            X.1Vo r10 = r7.A09     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = "could not update or insert transaction with empty transaction id"
            goto L_0x0174
        L_0x014f:
            X.1Vo r10 = r7.A09     // Catch:{ all -> 0x0180 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0180 }
            r11.<init>()     // Catch:{ all -> 0x0180 }
            java.lang.String r12 = "could not update or insert transaction: "
            r11.append(r12)     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = r4.A0K     // Catch:{ all -> 0x0180 }
            r11.append(r4)     // Catch:{ all -> 0x0180 }
            java.lang.String r4 = " update returned: "
            r11.append(r4)     // Catch:{ all -> 0x0180 }
            r11.append(r2)     // Catch:{ all -> 0x0180 }
            java.lang.String r2 = " insert returned: "
            r11.append(r2)     // Catch:{ all -> 0x0180 }
            r11.append(r0)     // Catch:{ all -> 0x0180 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0180 }
        L_0x0174:
            r10.A06(r0)     // Catch:{ all -> 0x0180 }
            goto L_0x001f
        L_0x0179:
            r18.A00()     // Catch:{ all -> 0x0180 }
            r18.close()     // Catch:{ all -> 0x0185 }
            goto L_0x0193
        L_0x0180:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0184 }
        L_0x0184:
            throw r0     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0189 }
        L_0x0189:
            throw r0
        L_0x018a:
            X.1Vo r1 = r7.A09
            java.lang.String r0 = "storeTransactions not storing transactions"
            r1.A06(r0)
            goto L_0x01c2
        L_0x0193:
            r6.close()
            boolean r0 = r7.A0i()
            if (r0 != 0) goto L_0x019e
            r5 = r16
        L_0x019e:
            int r0 = r21.size()
            X.1Vo r2 = r7.A09
            if (r5 != r0) goto L_0x01c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "storeTransactions stored: "
        L_0x01ae:
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            int r0 = r21.size()
            r1 = 1
            if (r5 == r0) goto L_0x01c3
        L_0x01c2:
            r1 = 0
        L_0x01c3:
            return r1
        L_0x01c4:
            java.lang.String r0 = "storeTransactions got: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r21.size()
            r1.append(r0)
            java.lang.String r0 = " transactions but stored: "
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221116r.A0n(java.util.List):boolean");
    }
}
