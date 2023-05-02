package com.obwhatsapp;

import X.AnonymousClass006;
import X.C004601z;
import X.C13680ns;
import X.C15860rz;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.obwhatsapp.components.Button;

public class EmptyTellAFriendView extends ScrollView implements AnonymousClass006 {
    public WaTextView A00;
    public Button A01;
    public C15860rz A02;
    public C52662eE A03;
    public boolean A04;

    public EmptyTellAFriendView(Context context) {
        super(context);
        A00();
        A01();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C16150sX.A0Y(C52652eD.A00(generatedComponent()));
        }
    }

    public final void A01() {
        ScrollView.inflate(getContext(), R.layout.layout0258, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A01 = (Button) C004601z.A0E(this, R.id.invite_button_tell_a_friend);
        this.A00 = C13680ns.A0S(this, R.id.subtitle_tell_a_friend);
        boolean equals = "91".equals(this.A02.A0O());
        WaTextView waTextView = this.A00;
        int i2 = R.string.str1b8e;
        if (equals) {
            i2 = R.string.str1b8f;
        }
        waTextView.setText(i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }
}
