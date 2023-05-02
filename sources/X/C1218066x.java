package X;

import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;

/* renamed from: X.66x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1218066x implements Comparator {
    public final /* synthetic */ AnonymousClass2BZ A00;
    public final /* synthetic */ C114315nZ A01;

    public /* synthetic */ C1218066x(AnonymousClass2BZ r1, C114315nZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        C114315nZ r0 = this.A01;
        AnonymousClass2BZ r6 = this.A00;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = r0.A00;
        C18090w8 r1 = paymentGroupParticipantPickerActivity.A0C;
        C16010sH r5 = ((C116765ru) obj).A00;
        Class<UserJid> cls = UserJid.class;
        int A002 = r1.A00((UserJid) r5.A08(cls));
        C18090w8 r12 = paymentGroupParticipantPickerActivity.A0C;
        C16010sH r2 = ((C116765ru) obj2).A00;
        int A003 = r12.A00((UserJid) r2.A08(cls));
        if (A002 == 2) {
            if (A003 != 2) {
                return -1;
            }
        } else if (A003 == 2) {
            return 1;
        }
        return r6.compare(r5, r2);
    }
}
