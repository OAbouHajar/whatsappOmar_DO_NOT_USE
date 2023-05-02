package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C006002o;
import X.C52662eE;
import X.C73813p6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class ConversationRowDocument$DocumentPreviewView extends C006002o implements AnonymousClass006 {
    public C73813p6 A00;
    public C52662eE A01;
    public boolean A02;

    public ConversationRowDocument$DocumentPreviewView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A00 = new C73813p6((int) getResources().getDimension(R.dimen.dimen0268));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C73813p6 r0 = this.A00;
        ImageView.ScaleType scaleType = getScaleType();
        RectF A05 = r0.A05(i4, i5);
        Matrix matrix = null;
        if (A05 != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i5);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                matrix = AnonymousClass000.A0H();
                matrix.setRectToRect(A05, rectF, Matrix.ScaleToFit.FILL);
            } else {
                matrix = C73813p6.A00;
            }
        }
        setImageMatrix(matrix);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A00.A09(bitmap.getWidth(), bitmap.getHeight());
        super.setImageBitmap(bitmap);
    }
}
