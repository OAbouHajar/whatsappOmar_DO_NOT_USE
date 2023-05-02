package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.2Rj  reason: invalid class name and case insensitive filesystem */
public abstract class C49162Rj extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;

    public C49162Rj(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        if (this instanceof C49142Rh) {
            C49142Rh r1 = (C49142Rh) this;
            if (!r1.A0C) {
                r1.A0C = true;
                C52652eD r3 = (C52652eD) ((C52642eC) r1.generatedComponent());
                C16150sX r2 = r3.A07;
                r1.A05 = (C14710pd) r2.A05.get();
                r1.A0A = (AnonymousClass1PD) r2.AEP.get();
                r1.A00 = (C14870pt) r2.AB3.get();
                r1.A01 = (AnonymousClass10X) r2.ALc.get();
                r1.A02 = (C16760tb) r2.APV.get();
                r1.A0B = (C25791Ld) r2.AFY.get();
                r1.A04 = (C16260sj) r2.AQe.get();
                r1.A07 = (C209212c) r2.AE1.get();
                r1.A08 = (C26691Ot) r2.AE5.get();
                r1.A03 = (C19610yi) r2.AEq.get();
                r1.A06 = (AnonymousClass1HE) r2.ALb.get();
                r1.A0C = C17270uo.A00(r2.AGp);
                r1.A01 = (C16040sK) r2.ADr.get();
                r1.A03 = (C17200uh) r2.A52.get();
                r1.A02 = (C16000sG) r2.A4x.get();
                r1.A05 = (AnonymousClass013) r2.AR8.get();
                r1.A06 = (AnonymousClass1RV) r2.AF6.get();
                r1.A0B = C17270uo.A00(r2.AK1);
                r1.A00 = (C52922ef) r3.A04.get();
                r1.A04 = (AnonymousClass1B5) r2.AEp.get();
                return;
            }
            return;
        }
        AnonymousClass348 r12 = (AnonymousClass348) this;
        if (!r12.A05) {
            r12.A05 = true;
            C16150sX r22 = ((C52652eD) ((C52642eC) r12.generatedComponent())).A07;
            r12.A05 = (C14710pd) r22.A05.get();
            r12.A0A = (AnonymousClass1PD) r22.AEP.get();
            r12.A00 = (C14870pt) r22.AB3.get();
            r12.A01 = (AnonymousClass10X) r22.ALc.get();
            r12.A02 = (C16760tb) r22.APV.get();
            r12.A0B = (C25791Ld) r22.AFY.get();
            r12.A04 = (C16260sj) r22.AQe.get();
            r12.A07 = (C209212c) r22.AE1.get();
            r12.A08 = (C26691Ot) r22.AE5.get();
            r12.A03 = (C19610yi) r22.AEq.get();
            r12.A06 = (AnonymousClass1HE) r22.ALb.get();
            r12.A0C = C17270uo.A00(r22.AGp);
            r12.A02 = (AnonymousClass013) r22.AR8.get();
            r12.A01 = (AnonymousClass1B5) r22.AEp.get();
            r12.A04 = C17270uo.A00(r22.AK1);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
