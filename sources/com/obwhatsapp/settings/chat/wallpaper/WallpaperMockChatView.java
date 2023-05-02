package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass006;
import X.AnonymousClass1YG;
import X.AnonymousClass31K;
import X.C004601z;
import X.C13680ns;
import X.C15830rv;
import X.C16040sK;
import X.C16150sX;
import X.C16440t3;
import X.C222617g;
import X.C224718b;
import X.C28381Vw;
import X.C30011bb;
import X.C30581cc;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

public class WallpaperMockChatView extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public C16040sK A05;
    public C30011bb A06;
    public C30011bb A07;
    public C16440t3 A08;
    public C222617g A09;
    public C52662eE A0A;
    public boolean A0B;

    public WallpaperMockChatView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WallpaperMockChatView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A0B) {
            this.A0B = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A08 = C16150sX.A0U(A002);
            this.A05 = C16150sX.A04(A002);
            this.A09 = (C222617g) A002.A8a.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0A;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public C30011bb getOutgoingRow() {
        return this.A07;
    }

    public void setMessages(String str, String str2, AnonymousClass1YG r13) {
        Context context = getContext();
        C222617g r5 = this.A09;
        C16440t3 r8 = this.A08;
        C16040sK r9 = this.A05;
        C30581cc r6 = (C30581cc) r5.A01(new C28381Vw((C15830rv) null, C224718b.A00(r9, r8, false), false), (byte) 0, r8.A00());
        r6.A0k(str);
        r9.A0B();
        C30581cc r52 = (C30581cc) r5.A01(new C28381Vw(r9.A05, C224718b.A00(r9, r8, false), true), (byte) 0, r8.A00());
        r52.A0I = r8.A00();
        r52.A0W(5);
        r52.A0k(str2);
        setBackgroundResource(0);
        setOrientation(1);
        AnonymousClass31K r0 = new AnonymousClass31K(context, r13, r6);
        this.A06 = r0;
        r0.A1I(true);
        this.A06.setEnabled(false);
        this.A00 = C004601z.A0E(this.A06, R.id.date_wrapper);
        this.A03 = C13680ns.A0L(this.A06, R.id.message_text);
        this.A02 = C13680ns.A0L(this.A06, R.id.conversation_row_date_divider);
        AnonymousClass31K r02 = new AnonymousClass31K(context, r13, r52);
        this.A07 = r02;
        r02.A1I(false);
        this.A07.setEnabled(false);
        this.A01 = C004601z.A0E(this.A07, R.id.date_wrapper);
        this.A04 = C13680ns.A0L(this.A07, R.id.message_text);
        addView(this.A06);
        addView(this.A07);
    }
}
