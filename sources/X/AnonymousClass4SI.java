package X;

import android.text.TextUtils;
import com.obwhatsapp.chatinfo.view.custom.ContactDetailsCard;

/* renamed from: X.4SI  reason: invalid class name */
public class AnonymousClass4SI {
    public final C25731Kx A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final ContactDetailsCard A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final AnonymousClass01V A06;
    public final AnonymousClass013 A07;
    public final C14710pd A08;
    public final AnonymousClass174 A09;
    public final C218315p A0A;
    public final boolean A0B;

    public AnonymousClass4SI(C25731Kx r1, C14870pt r2, C16040sK r3, ContactDetailsCard contactDetailsCard, C16000sG r5, C16080sP r6, AnonymousClass01V r7, AnonymousClass013 r8, C14710pd r9, C55482jg r10, AnonymousClass174 r11, C218315p r12, boolean z2) {
        this.A01 = r2;
        this.A0B = z2;
        this.A08 = r9;
        this.A02 = r3;
        this.A0A = r12;
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = contactDetailsCard;
        contactDetailsCard.A0Q = r10;
        this.A09 = r11;
    }

    public void A00(C16010sH r7) {
        String A002 = this.A00.A00(r7);
        if (!r7.A0G() || TextUtils.isEmpty(A002)) {
            this.A03.setContactChatStatusVisibility(8);
            return;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A002.substring(0, 1).toUpperCase(C13690nt.A0m(this.A07)));
        String A0h = AnonymousClass000.A0h(A002.substring(1), A0o);
        ContactDetailsCard contactDetailsCard = this.A03;
        contactDetailsCard.setContactChatStatusVisibility(0);
        contactDetailsCard.setContactChatStatus(A0h);
    }
}
