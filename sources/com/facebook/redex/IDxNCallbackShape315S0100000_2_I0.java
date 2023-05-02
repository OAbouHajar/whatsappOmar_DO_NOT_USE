package com.facebook.redex;

import X.AnonymousClass1ZK;
import X.C109005Qi;
import X.C13680ns;
import X.C15860rz;
import X.C30811cz;

public class IDxNCallbackShape315S0100000_2_I0 implements C109005Qi {
    public Object A00;
    public final int A01;

    public IDxNCallbackShape315S0100000_2_I0(AnonymousClass1ZK r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void A5p() {
        switch (this.A01) {
            case 0:
                ((AnonymousClass1ZK) this.A00).A06++;
                return;
            case 1:
                ((AnonymousClass1ZK) this.A00).A0T(true, false);
                return;
            case 2:
                AnonymousClass1ZK r2 = (AnonymousClass1ZK) this.A00;
                r2.A0D = r2.A0z.A00();
                return;
            case 3:
                AnonymousClass1ZK r5 = (AnonymousClass1ZK) this.A00;
                C30811cz r0 = r5.A0P;
                if (r0 == null || r0.A06.isRecording()) {
                    int i2 = r5.A07 + 1;
                    r5.A07 = i2;
                    if (r5.A1W && i2 == 6) {
                        r5.A1G.A0F.setVisibility(4);
                        if (r5.A13.A0C(1140)) {
                            C15860rz r3 = r5.A10;
                            if (!C13680ns.A0B(r3).getBoolean("ptt_draft_preview_error_count_reached", false)) {
                                C13680ns.A0z(r3.A0K(), "ptt_draft_preview_error_count_reached", true);
                                r5.A0n.AcB("voice_visualization_error_count_reached_critical_event_name", (String) null, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((AnonymousClass1ZK) this.A00).A08();
                return;
        }
    }
}
