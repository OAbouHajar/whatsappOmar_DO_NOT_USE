package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0XN;
import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class IDxCallableShape6S1100000_I1 implements Callable {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCallableShape6S1100000_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A02) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A00).A04.get(this.A01);
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.A00;
                boolean z2 = lottieAnimationView.A09;
                Context context = lottieAnimationView.getContext();
                String str = this.A01;
                return AnonymousClass0XN.A01(context, str, z2 ? AnonymousClass000.A0h(str, AnonymousClass000.A0r("asset_")) : null);
            default:
                return AnonymousClass0XN.A03((InputStream) this.A00, this.A01);
        }
    }
}
