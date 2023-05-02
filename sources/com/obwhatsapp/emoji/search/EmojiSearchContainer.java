package com.obwhatsapp.emoji.search;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass1BQ;
import X.AnonymousClass2X4;
import X.C108725Pc;
import X.C17020u3;
import X.C17250um;
import X.C206711d;
import X.C52662eE;
import X.C57552rM;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.InterceptingEditText;

public class EmojiSearchContainer extends FrameLayout implements AnonymousClass006 {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public AnonymousClass013 A05;
    public C206711d A06;
    public C17250um A07;
    public C57552rM A08;
    public AnonymousClass1BQ A09;
    public C108725Pc A0A;
    public C17020u3 A0B;
    public C52662eE A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;

    public EmojiSearchContainer(Context context) {
        super(context);
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public final void A00(String str) {
        AnonymousClass1BQ r0 = this.A09;
        if (r0 != null && r0.A02) {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
            C57552rM r3 = this.A08;
            AnonymousClass2X4 A002 = this.A09.A00(str, true);
            synchronized (r3) {
                AnonymousClass2X4 r1 = r3.A00;
                if (r1 != null) {
                    r1.A00 = null;
                }
                r3.A00 = A002;
                A002.A00(r3);
                r3.A01();
            }
            this.A0D = str;
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0C;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }
}
