package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5p1  reason: invalid class name and case insensitive filesystem */
public class C115045p1 extends Exception {
    public C115045p1(Context context, String str) {
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: ")));
        Activity A00 = C19980zJ.A00(context);
        String string = A00.getString(R.string.str1d33);
        A00.findViewById(R.id.error_layout).setVisibility(0);
        ((TextView) A00.findViewById(R.id.error_message)).setText(string);
    }
}
