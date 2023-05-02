package X;

import android.content.Context;
import android.widget.LinearLayout;

/* renamed from: X.2kB  reason: invalid class name and case insensitive filesystem */
public abstract class C55692kB extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C55692kB(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        C52642eC r1;
        AnonymousClass34R r0;
        if (this instanceof AnonymousClass34R) {
            AnonymousClass34R r02 = (AnonymousClass34R) this;
            if (!r02.A00) {
                r02.A00 = true;
                r1 = (C52642eC) r02.generatedComponent();
                r0 = r02;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34Q) {
            AnonymousClass34Q r03 = (AnonymousClass34Q) this;
            if (!r03.A00) {
                r03.A00 = true;
                r1 = (C52642eC) r03.generatedComponent();
                r0 = r03;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34S) {
            AnonymousClass34S r04 = (AnonymousClass34S) this;
            if (!r04.A00) {
                r04.A00 = true;
                r1 = (C52642eC) r04.generatedComponent();
                r0 = r04;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass2k8) {
            AnonymousClass2k8 r05 = (AnonymousClass2k8) this;
            if (!r05.A01) {
                r05.A01 = true;
                r1 = (C52642eC) r05.generatedComponent();
                r0 = r05;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34F) {
            AnonymousClass34F r06 = (AnonymousClass34F) this;
            if (!r06.A01) {
                r06.A01 = true;
                r1 = (C52642eC) r06.generatedComponent();
                r0 = r06;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34G) {
            AnonymousClass34G r07 = (AnonymousClass34G) this;
            if (!r07.A01) {
                r07.A01 = true;
                r1 = (C52642eC) r07.generatedComponent();
                r0 = r07;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34E) {
            AnonymousClass34E r08 = (AnonymousClass34E) this;
            if (!r08.A01) {
                r08.A01 = true;
                r1 = (C52642eC) r08.generatedComponent();
                r0 = r08;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34D) {
            AnonymousClass34D r09 = (AnonymousClass34D) this;
            if (!r09.A01) {
                r09.A01 = true;
                r1 = (C52642eC) r09.generatedComponent();
                r0 = r09;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass34N) {
            AnonymousClass34N r010 = (AnonymousClass34N) this;
            if (r010 instanceof AnonymousClass34U) {
                AnonymousClass34U r011 = (AnonymousClass34U) r010;
                if (!r011.A01) {
                    r011.A01 = true;
                    r1 = (C52642eC) r011.generatedComponent();
                    r0 = r011;
                } else {
                    return;
                }
            } else if (!r010.A00) {
                r010.A00 = true;
                r1 = (C52642eC) r010.generatedComponent();
                r0 = r010;
            } else {
                return;
            }
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            r0 = (C55682kA) this;
        } else {
            return;
        }
        C16150sX r2 = ((C52652eD) r1).A07;
        r0.A08 = (C16440t3) r2.AP2.get();
        r0.A04 = (C16040sK) r2.ADr.get();
        r0.A05 = (C16000sG) r2.A4x.get();
        r0.A0A = (C17250um) r2.A7e.get();
        r0.A07 = (AnonymousClass01V) r2.AOi.get();
        r0.A06 = (C16080sP) r2.AQ9.get();
        r0.A09 = (AnonymousClass013) r2.AR8.get();
        r0.A0B = (C17020u3) r2.AMG.get();
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
