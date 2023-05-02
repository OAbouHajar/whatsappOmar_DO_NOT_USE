package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.2yZ  reason: invalid class name and case insensitive filesystem */
public class C59602yZ extends AnonymousClass100 {
    public static final DateFormat A01;
    public final C39651sq A00;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        A01 = simpleDateFormat;
    }

    public C59602yZ(C39651sq r1) {
        this.A00 = r1;
    }
}
