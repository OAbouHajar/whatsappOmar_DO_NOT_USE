package com.facebook.redex;

import X.AnonymousClass2V2;
import X.AnonymousClass2VD;
import X.C29251aI;
import X.C49062Qp;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.AssemMods.translator.Language;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.overlays.AutofocusOverlay;
import java.util.ArrayList;
import java.util.List;

public class RunnableRunnableShape0S0100002_I0 implements Runnable {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0100002_I0(Object obj, float f2, float f3, int i2) {
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = f2;
        this.A01 = f3;
    }

    public final void run() {
        if (this.A03 != 0) {
            C49062Qp r3 = (C49062Qp) this.A02;
            float f2 = this.A00;
            float f3 = this.A01;
            synchronized (r3) {
                Camera camera = r3.A07;
                if (camera != null && r3.A0M) {
                    camera.cancelAutoFocus();
                    Camera.Parameters parameters = r3.A07.getParameters();
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        float dimension = r3.getContext().getResources().getDimension(R.dimen.dimen008f) / 2.0f;
                        RectF rectF = new RectF(f2 - dimension, f3 - dimension, f2 + dimension, dimension + f3);
                        Matrix matrix = new Matrix();
                        float f4 = 1.0f;
                        if (r3.A0N) {
                            f4 = -1.0f;
                        }
                        matrix.setScale(f4, 1.0f);
                        matrix.postRotate((float) r3.A01);
                        float width = (float) r3.getWidth();
                        float height = (float) r3.getHeight();
                        matrix.postScale(width / 2000.0f, height / 2000.0f);
                        matrix.postTranslate(width / 2.0f, height / 2.0f);
                        matrix.invert(matrix);
                        matrix.mapRect(rectF);
                        Rect rect = new Rect();
                        int A002 = C49062Qp.A00(rectF.left);
                        rect.left = A002;
                        int A003 = C49062Qp.A00(rectF.top);
                        rect.top = A003;
                        int A004 = C49062Qp.A00(rectF.right);
                        rect.right = A004;
                        int A005 = C49062Qp.A00(rectF.bottom);
                        rect.bottom = A005;
                        if (Math.abs(A003 - A005) < 10) {
                            rect.top = A003 - 5;
                            rect.bottom = A005 + 5;
                        }
                        if (Math.abs(A002 - A004) < 10) {
                            rect.left = A002 - 5;
                            rect.right = A004 + 5;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(rect, 1000));
                        parameters.setFocusAreas(arrayList);
                        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null && supportedFocusModes.contains(Language.AUTO_DETECT)) {
                            parameters.setFocusMode(Language.AUTO_DETECT);
                        }
                        r3.A07.setParameters(parameters);
                        r3.A0F.AN0(f2, f3);
                    }
                    r3.A07.autoFocus(new IDxFCallbackShape425S0100000_2_I1(r3, 0));
                }
            }
            return;
        }
        float f5 = this.A00;
        float f6 = this.A01;
        C29251aI r2 = ((AnonymousClass2V2) this.A02).A00;
        AnonymousClass2VD r1 = r2.A0I;
        float left = ((float) r2.A08.getLeft()) + f5;
        float top2 = ((float) r2.A08.getTop()) + f6;
        AutofocusOverlay autofocusOverlay = r1.A03;
        float f7 = autofocusOverlay.A00 / 2.0f;
        autofocusOverlay.A01 = new RectF(left - f7, top2 - f7, f7 + left, f7 + top2);
        autofocusOverlay.A03 = null;
        autofocusOverlay.setVisibility(0);
        if (autofocusOverlay.A05) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 0, left, 0, top2);
            scaleAnimation.setDuration(400);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillAfter(true);
            autofocusOverlay.startAnimation(scaleAnimation);
        }
        autofocusOverlay.invalidate();
        autofocusOverlay.removeCallbacks(autofocusOverlay.A07);
    }
}
