package X;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0TD  reason: invalid class name */
public final class AnonymousClass0TD {
    public static final String A00;

    static {
        String A01 = C06530Wm.A01("DiagnosticsWrkr");
        C18450wi.A0B(A01);
        A00 = A01;
    }

    /* JADX INFO: finally extract failed */
    public static final String A00(C13140lX r11, C12100jq r12, C12610kg r13, List list) {
        StringBuilder A0o = AnonymousClass000.A0o();
        String str = Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id";
        StringBuilder A0r = AnonymousClass000.A0r("\n Id \t Class Name\t ");
        A0r.append(str);
        A0o.append(AnonymousClass000.A0h("\t State\t Unique Name\t Tags\t", A0r));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C007303i r7 = (C007303i) it.next();
            AnonymousClass0RF AGO = r11.AGO(AnonymousClass0MO.A00(r7));
            Integer valueOf = AGO != null ? Integer.valueOf(AGO.A01) : null;
            String str2 = r7.A0J;
            C07770cR A002 = AnonymousClass0M4.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A002.A5S(1, str2);
            AnonymousClass0SM r0 = ((C08150dA) r12).A01;
            r0.A09();
            Cursor A003 = AnonymousClass0M5.A00(r0, A002, false);
            try {
                ArrayList A0v = AnonymousClass000.A0v(A003);
                while (A003.moveToNext()) {
                    A0v.add(A003.isNull(0) ? null : A003.getString(0));
                }
                A003.close();
                A002.A01();
                String A08 = C003101j.A08(",", (CharSequence) null, (CharSequence) null, A0v, 62);
                String A082 = C003101j.A08(",", (CharSequence) null, (CharSequence) null, r13.AGU(str2), 62);
                StringBuilder A0r2 = AnonymousClass000.A0r(IOUtils.LINE_SEPARATOR_UNIX);
                A0r2.append(str2);
                A0r2.append("\t ");
                A0r2.append(r7.A0G);
                A0r2.append("\t ");
                A0r2.append(valueOf);
                A0r2.append("\t ");
                A0r2.append(r7.A0E.name());
                A0r2.append("\t ");
                A0r2.append(A08);
                A0r2.append("\t ");
                A0r2.append(A082);
                A0r2.append(9);
                AnonymousClass000.A1I(A0r2, A0o);
            } catch (Throwable th) {
                A003.close();
                A002.A01();
                throw th;
            }
        }
        String obj = A0o.toString();
        C18450wi.A0B(obj);
        return obj;
    }
}
