package X;

import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ng  reason: invalid class name and case insensitive filesystem */
public class C114385ng extends C16690tT {
    public final ArrayList A00;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A01;

    public C114385ng(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, ArrayList arrayList) {
        this.A01 = paymentGroupParticipantPickerActivity;
        this.A00 = arrayList != null ? C13680ns.A0n(arrayList) : null;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        HashSet A0o = C13680ns.A0o();
        ArrayList arrayList = this.A00;
        if (arrayList == null || arrayList.isEmpty()) {
            A0u.addAll(this.A01.A0N);
            return A0u;
        }
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        Iterator it = paymentGroupParticipantPickerActivity.A0N.iterator();
        while (it.hasNext()) {
            C116765ru r4 = (C116765ru) it.next();
            C16010sH r3 = r4.A00;
            Jid A08 = r3.A08(UserJid.class);
            if (paymentGroupParticipantPickerActivity.A05.A0T(r3, arrayList, true) && !A0o.contains(A08)) {
                A0u.add(r4);
                A0o.add(A08);
            }
            if (this.A02.isCancelled()) {
                break;
            }
        }
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A01;
        paymentGroupParticipantPickerActivity.A0E = null;
        C110315ds r0 = paymentGroupParticipantPickerActivity.A0F;
        r0.A00 = (List) obj;
        r0.notifyDataSetChanged();
    }
}
