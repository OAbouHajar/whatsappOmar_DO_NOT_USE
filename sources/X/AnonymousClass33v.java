package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.obwhatsapp.R;
import org.apache.commons.io.IOUtils;

/* renamed from: X.33v  reason: invalid class name */
public class AnonymousClass33v extends C42101xE {
    public AnonymousClass33v(C16880tn r1) {
        super(r1);
    }

    public CharSequence A02(Context context, Paint paint, AnonymousClass013 r8) {
        C35171lU r0 = this.A00.A04;
        if (r0 == null) {
            return super.A02(context, paint, r8);
        }
        long A00 = (long) r0.A00();
        Object[] A1b = C13680ns.A1b();
        C13690nt.A1Q(A1b, 0, A00);
        return r8.A0J(A1b, R.plurals.plurals011a, A00);
    }

    public String A08(AnonymousClass013 r10) {
        StringBuilder A0o = AnonymousClass000.A0o();
        String A03 = A03();
        if (TextUtils.isEmpty(A03)) {
            A0o.append(A03);
        }
        C16880tn r8 = this.A00;
        C35171lU r0 = r8.A04;
        if (r0 != null) {
            int A00 = r0.A00();
            A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, A00, 0);
            A0o.append(r10.A0J(A1b, R.plurals.plurals011a, (long) A00));
        }
        String str = r8.A07;
        if (!TextUtils.isEmpty(str)) {
            A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
            A0o.append(str);
        }
        String str2 = r8.A08;
        if (!TextUtils.isEmpty(str2)) {
            A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
            A0o.append(str2);
        }
        return A0o.toString();
    }

    public void A09(C16740tZ r1, AnonymousClass21Q r2, AnonymousClass1GC r3) {
        AnonymousClass38D.A00(r1, r2, r3);
    }
}
