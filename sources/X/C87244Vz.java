package X;

import android.content.Context;
import com.obwhatsapp.components.ConversationListRowHeaderView;
import java.util.List;

/* renamed from: X.4Vz  reason: invalid class name and case insensitive filesystem */
public class C87244Vz {
    public final ConversationListRowHeaderView A00;
    public final C16080sP A01;
    public final C70523h7 A02;

    public C87244Vz(Context context, ConversationListRowHeaderView conversationListRowHeaderView, C16080sP r9, AnonymousClass013 r10, C25781Lc r11) {
        this.A00 = conversationListRowHeaderView;
        this.A01 = r9;
        Context context2 = context;
        this.A02 = new C70523h7(context2, conversationListRowHeaderView.A00, r9, r10, r11);
    }

    public void A00() {
        this.A02.A05();
    }

    public void A01() {
        this.A00.A01.setVisibility(8);
        C70523h7 r1 = this.A02;
        r1.A0E("");
        r1.A02.setPlaceholder(50);
    }

    public void A02(C16010sH r4, AnonymousClass2TP r5, List list) {
        C70523h7 r2 = this.A02;
        r2.A02.setPlaceholder(0);
        r2.A0G(r5, this.A01.A09(r4), list);
    }
}
