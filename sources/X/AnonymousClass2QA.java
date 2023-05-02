package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2QA  reason: invalid class name */
public class AnonymousClass2QA {
    public static int A00(C16740tZ r1) {
        if (r1 instanceof C38741rL) {
            return 1;
        }
        if (r1 instanceof C38811rS) {
            return ((C38811rS) r1).A12().size();
        }
        if (!C42941yx.A02(r1)) {
            return 0;
        }
        C38631rA r12 = (C38631rA) r1;
        C16750ta r0 = r12.A02;
        return r0 != null ? r0.A01 : r12.A00;
    }

    public static String A01(Context context, C16740tZ r3) {
        if (!C42941yx.A02(r3)) {
            return null;
        }
        String A14 = ((C16730tY) r3).A14();
        return TextUtils.isEmpty(A14) ? context.getString(R.string.str05d9) : AnonymousClass1XI.A09(A14);
    }

    public static List A02(C16740tZ r3, AnonymousClass1QZ r4) {
        if (r3 instanceof C38741rL) {
            return Collections.singletonList(((C38741rL) r3).A12());
        }
        if (r3 instanceof C38811rS) {
            return ((C38811rS) r3).A12();
        }
        if (C42941yx.A02(r3)) {
            C16750ta r0 = ((C16730tY) r3).A02;
            AnonymousClass00B.A06(r0);
            File file = r0.A0F;
            if (file != null) {
                try {
                    return AnonymousClass25M.A00(r4.A01(Uri.fromFile(file)));
                } catch (IOException e2) {
                    Log.e("vcardloader/splitvcards/exception", e2);
                }
            }
        }
        return null;
    }
}
