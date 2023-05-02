package X;

import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import java.text.Format;

/* renamed from: X.4xl  reason: invalid class name and case insensitive filesystem */
public class C101714xl implements AnonymousClass1V7 {
    public Format ACN(AnonymousClass013 r4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", C13690nt.A0m(r4));
        simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
        return simpleDateFormat;
    }
}
