package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass1MG;
import X.AnonymousClass29T;
import X.AnonymousClass5QT;
import X.C15830rv;
import X.C16760tb;
import X.C26161Mo;
import X.C34151jm;
import X.C47592Jp;
import X.C47602Jq;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class IDxSListenerShape276S0100000_2_I0 implements AnonymousClass5QT {
    public Object A00;
    public final int A01;

    public IDxSListenerShape276S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AXt(C34151jm r10, Integer num, int i2) {
        C26161Mo r1;
        C34151jm r6 = r10;
        Integer num2 = num;
        switch (this.A01) {
            case 0:
                C47592Jp r2 = (C47592Jp) this.A00;
                AnonymousClass5QT r0 = r2.A03;
                if (r0 != null) {
                    r0.AXt(r10, num, i2);
                    if (r2.A09.A00 && (r1 = r2.A0A) != null) {
                        AnonymousClass027 r3 = r1.A03;
                        if (r3.A01() != null && !((List) r3.A01()).isEmpty()) {
                            AnonymousClass1MG r22 = r2.A0B;
                            AnonymousClass00B.A06(r22);
                            r22.A00();
                            AnonymousClass00B.A06(r1);
                            AnonymousClass00B.A06(r3.A01());
                            r22.A01(num.intValue(), i2, ((List) r3.A01()).size());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                if (messageReplyActivity.A0K.A0V(UserJid.of(messageReplyActivity.A0j))) {
                    AnonymousClass29T.A01(messageReplyActivity, 106);
                    return;
                }
                C16760tb r32 = messageReplyActivity.A0D;
                C15830rv r4 = messageReplyActivity.A0j;
                AnonymousClass00B.A06(r4);
                r32.A0G(r4, messageReplyActivity.A0s, r6, num2, false);
                messageReplyActivity.A38(7);
                return;
            default:
                AnonymousClass5QT r02 = ((C47602Jq) this.A00).A01;
                if (r02 != null) {
                    r02.AXt(r10, num, i2);
                    return;
                }
                return;
        }
    }
}
