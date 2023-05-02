package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.bottombar.recipients.RecipientsView;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38s  reason: invalid class name and case insensitive filesystem */
public class C613938s {
    public final Context A00;
    public final C16080sP A01;
    public final AnonymousClass013 A02;
    public final RecipientsView A03;
    public final AnonymousClass01D A04;
    public final boolean A05;

    public C613938s(C16080sP r2, AnonymousClass013 r3, RecipientsView recipientsView, AnonymousClass01D r5, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = recipientsView.getContext();
        this.A03 = recipientsView;
        this.A05 = z2;
    }

    public void A00(C35541m6 r8, List list, boolean z2) {
        RecipientsView recipientsView;
        boolean A0S = C16030sJ.A0S(list);
        boolean z3 = this.A05;
        int i2 = 0;
        C16080sP r5 = this.A01;
        if (z3) {
            ArrayList A0N = r5.A0N(this.A00, r8, list);
            CharSequence charSequence = null;
            if (A0S) {
                charSequence = (CharSequence) A0N.remove(0);
            }
            recipientsView = this.A03;
            recipientsView.setRecipientsChips(A0N, charSequence);
            recipientsView.setRecipientsContentDescription(list.size());
        } else {
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jid jid = (Jid) it.next();
                if (!C16030sJ.A0Q(jid)) {
                    A0u.add(jid);
                }
            }
            HashSet A0o = C13680ns.A0o();
            List A0O = r5.A0O(A0o, -1, r5.A0U(A0u, A0o), false);
            if (A0S) {
                Context context = this.A00;
                int i3 = r8.A00;
                int i4 = R.string.str1686;
                if (i3 == 0) {
                    i4 = R.string.str1685;
                }
                A0O.add(0, context.getString(i4));
            }
            recipientsView = this.A03;
            recipientsView.setRecipientsText(C40631uR.A00(this.A02, A0O, true));
        }
        if (z2) {
            if (list.isEmpty()) {
                i2 = 8;
            }
            recipientsView.setVisibility(i2);
        }
    }
}
