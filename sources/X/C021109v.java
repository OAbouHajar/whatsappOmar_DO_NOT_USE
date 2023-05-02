package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.09v  reason: invalid class name and case insensitive filesystem */
public class C021109v extends AnimatorListenerAdapter {
    public Matrix A00 = AnonymousClass000.A0H();
    public boolean A01;
    public final /* synthetic */ Matrix A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ C05190Pq A04;
    public final /* synthetic */ C05440Rh A05;
    public final /* synthetic */ AnonymousClass0GG A06;
    public final /* synthetic */ boolean A07;

    public C021109v(Matrix matrix, View view, C05190Pq r4, C05440Rh r5, AnonymousClass0GG r6, boolean z2) {
        this.A06 = r6;
        this.A07 = z2;
        this.A02 = matrix;
        this.A03 = view;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void onAnimationCancel(Animator animator) {
        this.A01 = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            if (this.A07) {
                Matrix matrix = this.A02;
                Matrix matrix2 = this.A00;
                matrix2.set(matrix);
                View view = this.A03;
                view.setTag(R.id.transition_transform, matrix2);
                this.A05.A00(view);
            } else {
                View view2 = this.A03;
                view2.setTag(R.id.transition_transform, (Object) null);
                view2.setTag(R.id.parent_matrix, (Object) null);
            }
        }
        View view3 = this.A03;
        C06430Vt.A02.A01((Matrix) null, view3);
        this.A05.A00(view3);
    }

    public void onAnimationPause(Animator animator) {
        Matrix matrix = this.A04.A02;
        Matrix matrix2 = this.A00;
        matrix2.set(matrix);
        View view = this.A03;
        view.setTag(R.id.transition_transform, matrix2);
        this.A05.A00(view);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A03;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C004601z.A0Y(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
