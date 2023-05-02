package X;

import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerView;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.3G8  reason: invalid class name */
public class AnonymousClass3G8 implements C109925Uh {
    public final Runnable A00;
    public final /* synthetic */ AnonymousClass2Ra A01;

    public AnonymousClass3G8(AnonymousClass2Ra r1, Runnable runnable) {
        this.A01 = r1;
        this.A00 = runnable;
    }

    public void APz() {
        AnonymousClass2Ra r2 = this.A01;
        r2.A0Q.A08 = true;
        if (r2.A0J.A02 || r2.A0K.A01 != null) {
            Handler handler = r2.A0A;
            Runnable runnable = this.A00;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 400);
        }
    }

    public void AQ0() {
        AnonymousClass2Ra r4 = this.A01;
        C49112Rc r2 = r4.A0Q;
        int i2 = 0;
        r2.A08 = false;
        C49102Rb r7 = r4.A0J;
        if (r7.A02 || r4.A0K.A01 != null) {
            C455729k r5 = r4.A0O;
            C455829l r6 = r5.A01;
            r4.A0A.removeCallbacks(this.A00);
            if (!r4.A08()) {
                if (r6 == null) {
                    r4.A0E.A05(true);
                    r4.A03.A00();
                } else if (r7.A02) {
                    ColorPickerComponent colorPickerComponent = r4.A0E;
                    if (colorPickerComponent.A05.getVisibility() != 0) {
                        colorPickerComponent.A00();
                    }
                }
                if (r2.A00() == 2) {
                    TitleBarView titleBarView = r2.A0H;
                    Animation animation = r2.A0E;
                    if (titleBarView.A00.getVisibility() != 0) {
                        titleBarView.A00.setVisibility(0);
                        titleBarView.A00.startAnimation(animation);
                    }
                    r4.A0E.A00();
                } else {
                    r2.A04();
                }
                r4.A0H.setSystemUiVisibility(1280);
                if (!(!r5.A03.A00.isEmpty())) {
                    i2 = 4;
                }
                TitleBarView titleBarView2 = r2.A0H;
                titleBarView2.setUndoButtonVisibility(i2);
                boolean A0T = r4.A0B.A0T();
                RelativeLayout relativeLayout = titleBarView2.A07;
                ImageView imageView = titleBarView2.A02;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.addRule(A0T ^ true ? 1 : 0, imageView.getId());
                relativeLayout.setLayoutParams(layoutParams);
                r4.A03.A04();
            }
        }
    }

    public void AXA(C455829l r6) {
        AnonymousClass2Ra r3 = this.A01;
        C49112Rc r4 = r3.A0Q;
        if (r4.A00() != 2) {
            boolean A0K = r6.A0K();
            if (A0K || r6.A0J()) {
                if (r4.A00() == 5) {
                    r3.A0E.A00();
                }
                if (r6.A0J()) {
                    int color = r6.A01.getColor();
                    if (color != 0) {
                        r3.A0E.setColorAndInvalidate(color);
                    }
                    ColorPickerView colorPickerView = r3.A0E.A05;
                    colorPickerView.A01();
                    colorPickerView.invalidate();
                }
                if (A0K) {
                    r3.A0E.setSizeAndInvalidate(r6.A02() * r3.A0H.A00);
                }
            } else {
                r3.A0E.A05(true);
                r3.A03.A00();
            }
            r3.A04();
        }
    }
}
