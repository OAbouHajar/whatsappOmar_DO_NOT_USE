package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.0P3  reason: invalid class name */
public class AnonymousClass0P3 {
    public final Context A00;
    public final Rect A01 = AnonymousClass000.A0J();
    public final View A02;
    public final WindowManager.LayoutParams A03;
    public final TextView A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];

    public AnonymousClass0P3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.A03 = layoutParams;
        this.A00 = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout001b, (ViewGroup) null);
        this.A02 = inflate;
        this.A04 = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(AnonymousClass000.A0c(this));
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.style000e;
        layoutParams.flags = 24;
    }
}
