package X;

import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker;

/* renamed from: X.2zw  reason: invalid class name and case insensitive filesystem */
public abstract class C60082zw extends AnonymousClass1V8 {
    public boolean A00 = false;

    public C60082zw() {
        C13680ns.A1G(this, 30);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            C49132Rg r3 = (C49132Rg) C14570pP.A1S(this);
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, groupCallParticipantPicker);
            C14530pL.A0b(r3, r1, groupCallParticipantPicker, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, groupCallParticipantPicker), groupCallParticipantPicker);
            groupCallParticipantPicker.A00 = (C204310c) r1.A3O.get();
        }
    }
}
