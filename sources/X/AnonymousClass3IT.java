package X;

import android.text.TextUtils;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3IT  reason: invalid class name */
public class AnonymousClass3IT implements Comparator {
    public Map A00;
    public final C450026p A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public AnonymousClass3IT(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = new C450026p(messageDetailsActivity.A08, messageDetailsActivity.A01);
        this.A00 = new HashMap(messageDetailsActivity.A0b.size());
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass2Aj r8 = (AnonymousClass2Aj) obj;
        AnonymousClass2Aj r9 = (AnonymousClass2Aj) obj2;
        int A002 = r8.A00();
        int A003 = r9.A00();
        if (A002 != A003) {
            C795740j A022 = r8.A02();
            MessageDetailsActivity messageDetailsActivity = this.A02;
            if (!MessageDetailsActivity.A03(A022, messageDetailsActivity.A0C)) {
                return (MessageDetailsActivity.A03(r9.A02(), messageDetailsActivity.A0C) || C42881yp.A00(A002, A003) < 0) ? 1 : -1;
            }
            return -1;
        }
        UserJid userJid = r8.A01;
        if (userJid == null) {
            return r9.A01 == null ? 0 : 1;
        }
        UserJid userJid2 = r9.A01;
        if (userJid2 == null) {
            return -1;
        }
        Map map = this.A00;
        C16010sH r3 = (C16010sH) map.get(userJid);
        if (r3 == null) {
            r3 = this.A02.A06.A0A(userJid);
            map.put(userJid, r3);
        }
        C16010sH r2 = (C16010sH) map.get(userJid2);
        if (r2 == null) {
            r2 = this.A02.A06.A0A(userJid2);
            map.put(userJid2, r2);
        }
        boolean z2 = !TextUtils.isEmpty(r3.A09());
        return z2 == (TextUtils.isEmpty(r2.A09()) ^ true) ? this.A01.compare(r3, r2) : z2 ? -1 : 1;
    }
}
