package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass006;
import X.C31171dd;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class ConversationRowImageAlbum$AlbumGridFrame extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public C52662eE A01;
    public boolean A02;

    public ConversationRowImageAlbum$AlbumGridFrame(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        A00(context);
    }

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00(context);
    }

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A00(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen02a5);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int A012 = isInEditMode() ? 800 : C31171dd.A01(getContext(), 72);
        if (mode != 0) {
            A012 = Math.min(A012, View.MeasureSpec.getSize(i2));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((A012 - this.A00) >> 1, 1073741824);
        int i4 = 0;
        do {
            getChildAt(i4).measure(makeMeasureSpec, makeMeasureSpec);
            i4++;
        } while (i4 < 4);
        setMeasuredDimension(A012, A012);
    }
}
