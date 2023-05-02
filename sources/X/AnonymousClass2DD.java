package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.2DD  reason: invalid class name */
public abstract class AnonymousClass2DD extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2DD(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass2DD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass2DD(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            GroupDetailsCard groupDetailsCard = (GroupDetailsCard) this;
            C16150sX r2 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            groupDetailsCard.A04 = (C16040sK) r2.ADr.get();
            groupDetailsCard.A0H = (C17250um) r2.A7e.get();
            groupDetailsCard.A07 = (C204310c) r2.A3O.get();
            groupDetailsCard.A03 = (C19980zJ) r2.A0P.get();
            groupDetailsCard.A08 = (C16000sG) r2.A4x.get();
            groupDetailsCard.A09 = (C16080sP) r2.AQ9.get();
            groupDetailsCard.A0E = (AnonymousClass013) r2.AR8.get();
            groupDetailsCard.A0L = (C17240ul) r2.ABK.get();
            groupDetailsCard.A0O = new C25781Lc();
            groupDetailsCard.A0M = (C217915l) r2.AOG.get();
            groupDetailsCard.A0F = (C16070sO) r2.ABY.get();
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
