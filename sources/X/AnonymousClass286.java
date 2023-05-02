package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

/* renamed from: X.286  reason: invalid class name */
public final class AnonymousClass286 {
    public static final String[] A07 = {"com.obwhatsapp", "com.obwhatsapp.w4b"};
    public static final String[] A08 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type"};
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass286(String str, String str2, String str3, String str4, String str5, int i2, long j2) {
        if (str2 != null) {
            this.A01 = j2;
            this.A03 = str;
            this.A05 = str2;
            this.A00 = i2;
            this.A04 = str3;
            this.A06 = str4;
            this.A02 = str5;
            return;
        }
        throw new NullPointerException("number must not be null");
    }

    public static Cursor A00(AnonymousClass01V r5, String str) {
        Log.i("phone/getcursor/query/start");
        ContentResolver A0C = r5.A0C();
        if (A0C == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor query = A0C.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A08, A01(), (String[]) null, (String) null);
        Log.i("phone/getcursor/query/end");
        StringBuilder sb = new StringBuilder();
        if (query == null) {
            return query;
        }
        sb.append(str);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(query.getCount());
        Log.i(sb.toString());
        return query;
    }

    public static String A01() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("account_type");
        sb.append(" IS NULL OR (");
        sb.append("account_type");
        sb.append(" NOT IN (");
        int i2 = 0;
        while (true) {
            String[] strArr = A07;
            int length = strArr.length - 1;
            if (i2 < length) {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[i2]);
                sb.append(",");
                i2++;
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[length]);
                sb.append(")))");
                Log.i(sb.toString());
                return sb.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (AnonymousClass286.class != obj.getClass()) {
            return false;
        }
        AnonymousClass286 r7 = (AnonymousClass286) obj;
        return this.A01 == r7.A01 && TextUtils.equals(this.A03, r7.A03) && TextUtils.equals(this.A05, r7.A05) && this.A00 == r7.A00 && TextUtils.equals(this.A04, r7.A04) && TextUtils.equals(this.A06, r7.A06);
    }

    public int hashCode() {
        long j2 = this.A01;
        int i2 = 0;
        int i3 = ((((((int) (j2 >>> 32)) * 31) + ((int) j2)) * 31) + this.A00) * 31;
        String str = this.A05;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}
