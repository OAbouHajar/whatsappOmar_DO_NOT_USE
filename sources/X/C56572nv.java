package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.2nv  reason: invalid class name and case insensitive filesystem */
public class C56572nv extends View implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;
    public final /* synthetic */ C30011bb A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56572nv(Context context, C30011bb r3) {
        super(context);
        this.A04 = r3;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass000.A0J();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean isSelected() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        int A022;
        int A023;
        super.onDraw(canvas);
        if (this.A02) {
            Rect rect = this.A03;
            getDrawingRect(rect);
            C30011bb r3 = this.A04;
            if (r3.A0S) {
                rect.top += r3.getPaddingTop();
                A023 = rect.bottom - r3.getPaddingBottom();
            } else {
                C616339r r5 = r3.A0c;
                if (r5.A04()) {
                    if (r3.A1i) {
                        rect.top += r3.A0D.getTop();
                    }
                    if ((r3 instanceof AnonymousClass31J) || (r3 instanceof AnonymousClass31I)) {
                        rect.top -= r5.A03(getContext());
                        A023 = rect.bottom + r5.A02(getContext());
                    } else {
                        Rect rect2 = r3.A09;
                        rect.top = rect2.top - r5.A03(getContext());
                        int A024 = rect2.bottom + r5.A02(getContext());
                        rect.bottom = A024;
                        C56942pD r0 = r3.A0H;
                        if (r0 != null) {
                            A022 = A024 + (r0.getHeight() - r3.getReactionsViewVerticalOverlap());
                        }
                        canvas.drawRect(rect, r3.A0c.A00);
                    }
                } else {
                    A022 = r3.A09.bottom + r5.A02(getContext());
                }
                rect.bottom = A022;
                canvas.drawRect(rect, r3.A0c.A00);
            }
            rect.bottom = A023;
            canvas.drawRect(rect, r3.A0c.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2.isPressed() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRowSelected(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 == r4) goto L_0x001b
            r3.A02 = r4
            r3.setSelected(r4)
            X.1bb r2 = r3.A04
            if (r4 != 0) goto L_0x0014
            boolean r1 = r2.isPressed()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.dispatchSetPressed(r0)
            r3.invalidate()
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56572nv.setRowSelected(boolean):void");
    }
}
