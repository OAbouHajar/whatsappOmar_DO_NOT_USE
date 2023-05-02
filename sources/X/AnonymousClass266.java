package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.266  reason: invalid class name */
public class AnonymousClass266 extends AnonymousClass267 {
    public static int A0E;
    public static String A0F;
    public static String A0G;
    public static String A0H;
    public ObjectAnimator A00;
    public ObjectAnimator A01;
    public ObjectAnimator A02;
    public ObjectAnimator A03;
    public TextView A04;
    public TextView A05;
    public SearchView A06;
    public final Activity A07;
    public final View A08;
    public final AccelerateInterpolator A09 = new AccelerateInterpolator();
    public final DecelerateInterpolator A0A = new DecelerateInterpolator();
    public final Toolbar A0B;
    public final int[] A0C;
    public final int[] A0D;

    public AnonymousClass266(Activity activity, View view, C016807y r7, Toolbar toolbar, AnonymousClass013 r9) {
        super(activity, view, r7, toolbar, r9);
        this.A0B = toolbar;
        this.A08 = view;
        this.A07 = activity;
        int[] iArr = new int[2];
        this.A0D = iArr;
        iArr[0] = -1;
        int[] iArr2 = new int[2];
        this.A0C = iArr2;
        iArr2[0] = -1;
    }
}
