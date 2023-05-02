package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.4Y4  reason: invalid class name */
public class AnonymousClass4Y4 {
    public static Drawable A00(Context context) {
        Drawable A04 = AnonymousClass00T.A04(context, R.drawable.balloon_incoming_frame);
        int A00 = AnonymousClass00T.A00(context, R.color.color00c6);
        AnonymousClass00B.A06(A04);
        return AnonymousClass2SR.A06(A04, A00);
    }

    public static Drawable A01(Context context) {
        Drawable A04 = AnonymousClass00T.A04(context, R.drawable.balloon_outgoing_frame);
        int A00 = AnonymousClass00T.A00(context, R.color.color00c8);
        AnonymousClass00B.A06(A04);
        return AnonymousClass2SR.A06(A04, A00);
    }
}
