package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.09w  reason: invalid class name and case insensitive filesystem */
public class C021209w extends AnimatorListenerAdapter implements C019509b {
    public float A00;
    public float A01;
    public int[] A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final View A08;

    public C021209w(View view, View view2, float f2, float f3, int i2, int i3) {
        this.A07 = view;
        this.A08 = view2;
        this.A05 = i2 - Math.round(view.getTranslationX());
        this.A06 = i3 - Math.round(view.getTranslationY());
        this.A03 = f2;
        this.A04 = f3;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.A02 = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, (Object) null);
        }
    }

    public void AZB(C015707n r1) {
    }

    public void AZC(C015707n r3) {
        View view = this.A07;
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
        r3.A09(this);
    }

    public void AZD(C015707n r1) {
    }

    public void AZE(C015707n r1) {
    }

    public void AZF(C015707n r1) {
    }

    public void onAnimationCancel(Animator animator) {
        int[] iArr = this.A02;
        if (iArr == null) {
            iArr = new int[2];
            this.A02 = iArr;
        }
        View view = this.A07;
        iArr[0] = Math.round(((float) this.A05) + view.getTranslationX());
        this.A02[1] = Math.round(((float) this.A06) + view.getTranslationY());
        this.A08.setTag(R.id.transition_position, this.A02);
    }

    public void onAnimationPause(Animator animator) {
        View view = this.A07;
        this.A00 = view.getTranslationX();
        this.A01 = view.getTranslationY();
        view.setTranslationX(this.A03);
        view.setTranslationY(this.A04);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A07;
        view.setTranslationX(this.A00);
        view.setTranslationY(this.A01);
    }
}
