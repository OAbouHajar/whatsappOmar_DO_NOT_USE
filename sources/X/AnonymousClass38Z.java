package X;

import android.app.Activity;
import com.obwhatsapp.Conversation;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.38Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38Z {
    public final /* synthetic */ C30011bb A00;

    public /* synthetic */ AnonymousClass38Z(C30011bb r1) {
        this.A00 = r1;
    }

    public final void A00(C39821t7 r14) {
        C30011bb r5 = this.A00;
        AnonymousClass1yP A02 = AnonymousClass22O.A02(r5);
        if (A02 == null) {
            Log.e("ConversationRow/dynamicReplyOnClickCallback/error: not click in Conversation");
        } else {
            C35071lK r2 = r14.A02;
            if (r2 != null) {
                try {
                    r5.A0q.A02((Activity) A02, r5.getFMessage(), r2);
                } catch (JSONException unused) {
                    Log.e("[PAY] : ConversationRow exception processing NFM message");
                }
            } else {
                C16740tZ fMessage = r5.getFMessage();
                C42821yj r1 = ((Conversation) A02).A00;
                C16760tb r4 = C14530pL.A0K(r1).A03;
                C15830rv A01 = C16010sH.A01(r1.A2l);
                C222617g r3 = r4.A1N;
                String str = r14.A03;
                C39051rq r7 = new C39051rq(r3.A05.A02(A01, true), C40651uT.A05(str), r14.A04, r4.A0Q.A00());
                r3.A05(r7, fMessage);
                r4.A0M(r7);
                r4.A0e.A0W(r7);
            }
        }
        r5.A0t();
    }
}
