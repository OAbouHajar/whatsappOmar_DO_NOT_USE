package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

/* renamed from: X.0tY  reason: invalid class name and case insensitive filesystem */
public abstract class C16730tY extends C16740tZ {
    public int A00;
    public long A01;
    public C16750ta A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final Object A0B = new Object();
    public volatile C42591y4 A0C;

    public C16730tY(C16750ta r10, C28381Vw r11, C16730tY r12, byte b2, long j2, boolean z2) {
        super(r12, r11, b2, j2, z2);
        this.A02 = r10;
        this.A03 = r12.A03;
        this.A00 = r12.A00;
        this.A04 = r12.A04;
        this.A05 = r12.A05;
        this.A06 = r12.A06;
        this.A07 = r12.A07;
        this.A01 = r12.A01;
        this.A08 = r12.A08;
        this.A09 = r12.A09;
        C42591y4 A12 = r12.A12();
        if (A12 == null) {
            return;
        }
        if (A12.A04()) {
            C42591y4 A122 = A12();
            AnonymousClass00B.A06(A122);
            A122.A03(A12.A05(), A12.A06());
            return;
        }
        StringBuilder sb = new StringBuilder("FMessageVideo/Cloned message should have sidecar, but original message doesn't have it: sidecar=");
        sb.append(this.A0C);
        Log.e(sb.toString());
    }

    public C16730tY(C28381Vw r2, byte b2, long j2) {
        super(r2, b2, j2);
    }

    public static C16750ta A00(C16730tY r0) {
        C16750ta r02 = r0.A02;
        AnonymousClass00B.A06(r02);
        return r02;
    }

    public static String A01(C16730tY r3) {
        String A002 = C221516v.A00(r3.A06);
        Locale locale = Locale.US;
        String upperCase = A002.toUpperCase(locale);
        return (!TextUtils.isEmpty(upperCase) || TextUtils.isEmpty(r3.A14())) ? upperCase : AnonymousClass1XI.A08(r3.A14()).toUpperCase(locale);
    }

    public C42591y4 A12() {
        if (this.A0C == null && C42591y4.A00(C31831f6.A01(this.A10, this.A08))) {
            synchronized (this.A0B) {
                if (this.A0C == null) {
                    this.A0C = new C42591y4(this);
                }
            }
        }
        return this.A0C;
    }

    public String A13() {
        C30611cf r0;
        if (this instanceof C38901rb) {
            r0 = ((C38901rb) this).A00;
        } else if (this instanceof C38921rd) {
            r0 = ((C38921rd) this).A00;
        } else if (!(this instanceof C38931re)) {
            return this.A03;
        } else {
            r0 = ((C38931re) this).A00;
        }
        return r0.A02;
    }

    public String A14() {
        if (!(this instanceof C38631rA)) {
            return this.A07;
        }
        String str = this.A07;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String A002 = C221516v.A00(this.A06);
        if (TextUtils.isEmpty(A002)) {
            return A13();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A13());
        sb.append(".");
        sb.append(A002);
        return sb.toString();
    }

    public void A15(Cursor cursor, C16750ta r4) {
        this.A02 = r4;
        A0l(cursor.getString(cursor.getColumnIndexOrThrow("multicast_id")));
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A04 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
    }

    public void A16(Cursor cursor, C16750ta r5) {
        this.A02 = r5;
        this.A06 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.A08 = cursor.getString(cursor.getColumnIndexOrThrow("message_url"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("file_length"));
        this.A07 = cursor.getString(cursor.getColumnIndexOrThrow("media_name"));
        this.A05 = cursor.getString(cursor.getColumnIndexOrThrow("file_hash"));
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("media_duration"));
        this.A04 = cursor.getString(cursor.getColumnIndexOrThrow("enc_file_hash"));
        C16870tm A0F = A0F();
        if (A0F != null) {
            A0F.A03(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
        }
    }

    public void A17(String str) {
        StringBuilder sb;
        String str2;
        String obj;
        C28381Vw r4 = this.A11;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder("MessageUtil/isValidIncomingUrl/error empty media url received. message.key=");
            sb2.append(r4);
            obj = sb2.toString();
        } else {
            Uri parse = Uri.parse(str);
            if (!"https".equalsIgnoreCase(parse.getScheme())) {
                sb = new StringBuilder();
                str2 = "MessageUtil/isValidIncomingUrl/error invalid scheme on received media url; url=";
            } else if (TextUtils.isEmpty(parse.getHost()) || !parse.getHost().endsWith(".whatsapp.net")) {
                sb = new StringBuilder();
                str2 = "MessageUtil/isValidIncomingUrl/error invalid host on received media url; url=";
            } else {
                this.A08 = str;
                return;
            }
            sb.append(str2);
            sb.append(str);
            sb.append("; message.key=");
            sb.append(r4);
            obj = sb.toString();
        }
        Log.w(obj);
        throw new AnonymousClass23S(15);
    }

    public boolean A18() {
        File file;
        C16750ta r0 = this.A02;
        if (!(r0 == null || (file = r0.A0F) == null)) {
            yo.VO_setCurrentFile(file, this);
            return file.canRead();
        }
    }
}
