package X;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* renamed from: X.0hg  reason: invalid class name and case insensitive filesystem */
public class C10780hg implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LottieAnimationView A01;

    public C10780hg(LottieAnimationView lottieAnimationView, int i2) {
        this.A01 = lottieAnimationView;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        String str;
        LottieAnimationView lottieAnimationView = this.A01;
        boolean z2 = lottieAnimationView.A09;
        Context context = lottieAnimationView.getContext();
        int i2 = this.A00;
        if (z2) {
            StringBuilder A0r = AnonymousClass000.A0r("rawRes");
            A0r.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
            str = AnonymousClass000.A0l(A0r, i2);
        } else {
            str = null;
        }
        return AnonymousClass0XN.A00(context, str, i2);
    }
}
