package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.5nZ  reason: invalid class name and case insensitive filesystem */
public class C114315nZ extends C16690tT {
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A00;

    public C114315nZ(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        this.A00 = paymentGroupParticipantPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashSet A0o = C13680ns.A0o();
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        C16070sO r0 = paymentGroupParticipantPickerActivity.A09;
        C28031Ub it = r0.A07.A04(paymentGroupParticipantPickerActivity.A0A).A04().iterator();
        while (true) {
            C35511m3 r4 = null;
            if (it.hasNext()) {
                C16010sH A0A = paymentGroupParticipantPickerActivity.A03.A0A(((C30661ck) it.next()).A03);
                if (!A0o.contains(A0A) && !paymentGroupParticipantPickerActivity.A01.A0I(A0A.A07())) {
                    UserJid A0I = C110115dX.A0I(A0A);
                    if (A0I != null) {
                        r4 = C110115dX.A0H(paymentGroupParticipantPickerActivity.A0D).A05(A0I);
                    }
                    paymentGroupParticipantPickerActivity.A0N.add(new C116765ru(A0A, r4));
                    A0o.add(A0A);
                }
            } else {
                Collections.sort(paymentGroupParticipantPickerActivity.A0N, new C1218066x(new AnonymousClass2BZ(paymentGroupParticipantPickerActivity.A01, paymentGroupParticipantPickerActivity.A05, true), this));
                return null;
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A00;
        paymentGroupParticipantPickerActivity.Ac1();
        C110315ds r0 = paymentGroupParticipantPickerActivity.A0F;
        ArrayList arrayList = paymentGroupParticipantPickerActivity.A0N;
        r0.A00 = arrayList;
        r0.notifyDataSetChanged();
        C005402i x2 = paymentGroupParticipantPickerActivity.x();
        if (x2 != null) {
            AnonymousClass013 r6 = paymentGroupParticipantPickerActivity.A01;
            long size = (long) arrayList.size();
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, arrayList.size(), 0);
            x2.A0I(r6.A0J(A1b, R.plurals.plurals00d7, size));
        }
    }
}
