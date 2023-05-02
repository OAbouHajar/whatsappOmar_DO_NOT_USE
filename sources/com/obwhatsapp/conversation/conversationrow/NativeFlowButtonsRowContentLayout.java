package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.C18180wH;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

public class NativeFlowButtonsRowContentLayout extends LinearLayout implements AnonymousClass006 {
    public C18180wH A00;
    public C52662eE A01;
    public boolean A02;
    public final View A03;
    public final View A04;
    public final LinearLayout A05;
    public final List A06;
    public final View[] A07;
    public final TextEmojiLabel[] A08;

    public NativeFlowButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public NativeFlowButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.obwhatsapp.TextEmojiLabel[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NativeFlowButtonsRowContentLayout(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0018
            r0 = 1
            r5.A02 = r0
            java.lang.Object r0 = r5.generatedComponent()
            X.0sX r0 = X.C52652eD.A00(r0)
            X.0wH r0 = X.C16150sX.A0S(r0)
            r5.A00 = r0
        L_0x0018:
            r0 = 2
            com.obwhatsapp.TextEmojiLabel[] r4 = new com.obwhatsapp.TextEmojiLabel[r0]
            r5.A08 = r4
            android.view.View[] r3 = new android.view.View[r0]
            r5.A07 = r3
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r5.A06 = r0
            r2 = 1
            r5.setOrientation(r2)
            r0 = 2131559420(0x7f0d03fc, float:1.8744184E38)
            android.widget.LinearLayout.inflate(r6, r0, r5)
            r0 = 2131364807(0x7f0a0bc7, float:1.8349461E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.A05 = r0
            r0 = 2131362449(0x7f0a0291, float:1.8344679E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A03 = r0
            r0 = 2131362450(0x7f0a0292, float:1.834468E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A04 = r0
            r0 = 2131362445(0x7f0a028d, float:1.834467E38)
            android.view.View r0 = r5.findViewById(r0)
            r1 = 0
            r4[r1] = r0
            r0 = 2131364804(0x7f0a0bc4, float:1.8349455E38)
            android.view.View r0 = r5.findViewById(r0)
            r3[r1] = r0
            r0 = 2131362446(0x7f0a028e, float:1.8344673E38)
            android.view.View r0 = r5.findViewById(r0)
            r4[r2] = r0
            r0 = 2131364805(0x7f0a0bc5, float:1.8349457E38)
            android.view.View r0 = r5.findViewById(r0)
            r3[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
