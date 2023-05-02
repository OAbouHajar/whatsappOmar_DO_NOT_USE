package com.obwhatsapp.calling;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass2Ao;
import X.AnonymousClass2OY;
import X.C14710pd;
import X.C15860rz;
import X.C16150sX;
import X.C17160ud;
import X.C17200uh;
import X.C52652eD;
import X.C52662eE;
import X.C57382r3;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxPDisplayerShape297S0100000_2_I0;
import com.obwhatsapp.R;

public class PeerAvatarLayout extends RecyclerView implements AnonymousClass006 {
    public int A00;
    public int A01;
    public C57382r3 A02;
    public C17160ud A03;
    public AnonymousClass2OY A04;
    public AnonymousClass2Ao A05;
    public C17200uh A06;
    public C15860rz A07;
    public AnonymousClass013 A08;
    public C14710pd A09;
    public C52662eE A0A;
    public boolean A0B;

    public class NonScrollingLinearLayoutManager extends LinearLayoutManager {
        public boolean A13() {
            return false;
        }

        public boolean A14() {
            return false;
        }
    }

    public PeerAvatarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0B) {
            this.A0B = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A09 = C16150sX.A0k(A002);
            this.A07 = C16150sX.A0Y(A002);
            this.A03 = C16150sX.A0L(A002);
            this.A06 = C16150sX.A0R(A002);
            this.A08 = C16150sX.A0Z(A002);
        }
        this.A02 = new C57382r3(this);
        NonScrollingLinearLayoutManager nonScrollingLinearLayoutManager = new NonScrollingLinearLayoutManager();
        nonScrollingLinearLayoutManager.A1P(0);
        setLayoutManager(nonScrollingLinearLayoutManager);
        setAdapter(this.A02);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen00ee);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.dimen00ef);
        this.A04 = new IDxPDisplayerShape297S0100000_2_I0(this.A03, 0);
        this.A05 = this.A06.A05("peer-avatar-photo", 0.0f, getResources().getDimensionPixelSize(R.dimen.dimen00f4));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }
}
