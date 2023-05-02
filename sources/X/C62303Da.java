package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.obwhatsapp.R;

/* renamed from: X.3Da  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62303Da implements AnonymousClass023 {
    public final /* synthetic */ C601130c A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C62303Da(C601130c r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public final void AOH(Object obj) {
        C601130c r6 = this.A00;
        boolean z2 = this.A01;
        r6.setVisibility(0);
        TextView A0L = C13680ns.A0L(r6, R.id.message_text);
        if (z2) {
            A0L.setText(AnonymousClass1ZW.A00(r6.getContext(), new Object[]{obj}, R.string.str12ca));
            return;
        }
        Resources resources = r6.getResources();
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = obj;
        SpannableStringBuilder A06 = r6.A1c.A06(new RunnableRunnableShape18S0100000_I1_1((Object) r6, 7), C13700nu.A0F(resources, "profile-info", A1Z, 1, R.string.str12c9), "profile-info");
        A0L.setMovementMethod(new AnonymousClass3MF());
        A0L.setText(A06);
    }
}
