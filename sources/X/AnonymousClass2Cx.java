package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.facebook.redex.ViewOnClickCListenerShape14S0100000_I0_7;
import com.obwhatsapp.R;
import com.obwhatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.2Cx  reason: invalid class name */
public abstract class AnonymousClass2Cx extends FrameLayout {
    public AnonymousClass2Cx(Context context) {
        super(context);
    }

    public static int[] getViewIdsToIgnoreScaling() {
        return new int[]{R.id.logo_button, R.id.play_pause_fullscreen, R.id.loading};
    }

    public void A00() {
        C46202Cw r2 = (C46202Cw) this;
        r2.A0Z.setVisibility(8);
        r2.A0a.setVisibility(8);
    }

    public void A01() {
        C46202Cw r2 = (C46202Cw) this;
        r2.A0N = true;
        if (r2.A0I != null) {
            r2.A0Q();
        }
        if (!r2.A0O) {
            r2.A0v.setVisibility(8);
        }
        r2.A0c.setVisibility(8);
        if (r2.A0X()) {
            r2.A13.setVisibility(0);
            if (!r2.A0O) {
                r2.A0p.setVisibility(8);
            }
        }
        if (r2.A0T && r2.A0Q && r2.A0N) {
            r2.A0g.setVisibility(0);
            r2.A0f.setVisibility(8);
            r2.A0r.setVisibility(8);
        }
        if (r2.A0t.getVisibility() == 0) {
            r2.A0R();
        }
        if (!TextUtils.isEmpty(r2.A10.getText())) {
            r2.A0e.setVisibility(0);
        }
        r2.setVideoCaption(r2.A11.getText());
        r2.A0S();
        r2.A0T();
        r2.A0P();
        r2.A0L();
        r2.A0M();
    }

    public void A02() {
        C46202Cw r2 = (C46202Cw) this;
        r2.A0N = false;
        r2.A0d.setVisibility(8);
        r2.A0r.setVisibility(8);
        r2.A0u.setVisibility(8);
        r2.A0v.setVisibility(0);
        if (!r2.A0O) {
            r2.A0c.setVisibility(0);
        }
        if (r2.A0X() && !r2.A0O) {
            r2.A13.setVisibility(8);
            r2.A0p.setVisibility(0);
        }
        if (r2.A0T && r2.A0Q) {
            r2.A0O();
        }
        if (r2.A0t.getVisibility() == 0) {
            r2.A0R();
        }
        r2.A0e.setVisibility(8);
        r2.A11.setVisibility(8);
        r2.A0S();
        r2.A0T();
        r2.A0P();
        r2.A0M();
    }

    public void A03() {
        C46202Cw r2 = (C46202Cw) this;
        AnonymousClass29D r0 = r2.A0I;
        if (r0 != null) {
            if (r0.A0C()) {
                C85464Oo r02 = r2.A12;
                if (r02 != null) {
                    C87394Wp r1 = r02.A09;
                    if (r1.A02) {
                        r1.A00();
                    }
                }
                r2.A0I.A07();
            }
            if (!r2.A0A()) {
                r2.A0L();
            }
            r2.removeCallbacks(r2.A16);
            r2.A0U();
            r2.A07(500);
        }
    }

    public void A04() {
        C46202Cw r1 = (C46202Cw) this;
        AnonymousClass29D r0 = r1.A0I;
        if (r0 != null) {
            r1.A0z.setText(C46212Cy.A00(r1.A17, r1.A18, (long) r0.A04()));
        }
    }

    public void A05() {
        C46202Cw r2 = (C46202Cw) this;
        r2.A0q.setVisibility(0);
        if (r2.A0N && r2.A0g.getVisibility() != 0) {
            r2.A0r.setVisibility(0);
        }
    }

    public void A06() {
        C46202Cw r2 = (C46202Cw) this;
        AnonymousClass2PL r1 = r2.A0D;
        if (r1 != null) {
            r1.A00 = true;
            r2.A0D = null;
        }
        r2.A0U = false;
        r2.A0Y.removeCallbacksAndMessages(0);
    }

    public void A07(int i2) {
        C46202Cw r3 = (C46202Cw) this;
        r3.A06();
        AnonymousClass2PL r1 = new AnonymousClass2PL(r3);
        r3.A0D = r1;
        r3.postDelayed(new RunnableRunnableShape16S0100000_I0_15(r1, 16), (long) i2);
    }

    public void A08(int i2, int i3) {
        C46202Cw r4 = (C46202Cw) this;
        AnonymousClass29D r0 = r4.A0I;
        if (r0 != null && r0.A06() != null) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
            ofObject.setDuration(150);
            ofObject.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(r4, 30));
            ofObject.start();
        }
    }

    public void A09(C54292hA r7, int i2) {
        int i3;
        C46202Cw r5 = (C46202Cw) this;
        r5.A0G = r7;
        if (r5.A0X()) {
            ImageButton imageButton = r5.A0p;
            imageButton.setImageResource(C42181xM.A00(i2));
            imageButton.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r5, 9));
            WDSButton wDSButton = r5.A13;
            switch (i2) {
                case 1:
                    i3 = R.drawable.ic_pip_streamable;
                    break;
                case 2:
                case 5:
                    i3 = R.drawable.ic_pip_facebook_color;
                    break;
                case 3:
                    i3 = R.drawable.ic_pip_instagram_color;
                    break;
                case 4:
                    i3 = R.drawable.ic_pip_youtube;
                    break;
                case 6:
                    i3 = R.drawable.ic_pip_lasso;
                    break;
                case 7:
                    i3 = R.drawable.ic_pip_netflix;
                    break;
                case 8:
                    i3 = R.drawable.ic_pip_sharechat_color;
                    break;
                default:
                    i3 = -1;
                    break;
            }
            wDSButton.setIcon(i3);
            wDSButton.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I0_7(r5, 11));
            if (r5.A0N) {
                wDSButton.setVisibility(0);
                imageButton.setVisibility(8);
                return;
            }
            wDSButton.setVisibility(8);
            imageButton.setVisibility(0);
            return;
        }
        r5.A13.setVisibility(8);
        r5.A0p.setVisibility(8);
    }

    public boolean A0A() {
        C46202Cw r2 = (C46202Cw) this;
        return r2.A0N ? r2.A0u.getVisibility() == 0 : r2.A0v.getVisibility() == 0;
    }

    public abstract void A0K();

    public abstract void A0L();

    public abstract List getFullscreenControls();

    public abstract List getInlineControls();

    public abstract void setCloseButtonListener(C54292hA r1);

    public abstract void setFullscreenButtonClickListener(C54292hA r1);

    public abstract void setMusicAttributionClickListener(C54292hA r1);

    public abstract void setPlayer(AnonymousClass29D r1);

    public abstract void setPlayerElevation(int i2);

    public abstract void setWatchMoreVideosText(String str);
}
