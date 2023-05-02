package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.11i  reason: invalid class name and case insensitive filesystem */
public class C207211i {
    public final C16440t3 A00;
    public final C46292Dl A01;

    public C207211i(C16300so r3, C16440t3 r4, C16980tz r5, C206911f r6, C14710pd r7) {
        this.A01 = new C46292Dl(r5.A00, r3, r6, r7);
        this.A00 = r4;
    }

    public void A00(String str, String str2, Locale locale, byte[] bArr) {
        long A002 = this.A00.A00() / 1000;
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        C16800tf A02 = this.A01.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("lg", locale.getLanguage());
            contentValues.put("lc", locale.getCountry());
            contentValues.put("hash", str);
            contentValues.put("namespace", str2);
            contentValues.put("timestamp", Long.valueOf(A002));
            contentValues.put("data", bArr);
            A02.A02.A05(contentValues, "packs");
            A02.close();
            StringBuilder sb = new StringBuilder("language-pack-store/save-language-pack saved pack ");
            sb.append(AnonymousClass1WH.A05(locale));
            sb.append(" (");
            sb.append(str);
            sb.append(") ns=");
            sb.append(str2);
            Log.i(sb.toString());
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void A01(String str, Locale locale) {
        long A002 = this.A00.A00() / 1000;
        C16800tf A02 = this.A01.A02();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(A002));
            if (A02.A02.A00("packs", contentValues, "lg = ? AND lc = ? AND namespace = ?", new String[]{locale.getLanguage(), locale.getCountry(), str}) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("language-pack-store/touch-language-pack updated timestamp for ");
                sb.append(locale);
                sb.append(" ns=");
                sb.append(str);
                Log.i(sb.toString());
            }
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
