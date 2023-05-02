package com.obwhatsapp.gallerypicker;

import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01S;
import X.AnonymousClass050;
import X.AnonymousClass05J;
import X.C13680ns;
import X.C434920f;
import X.C455529g;
import X.C59232vZ;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.obwhatsapp.R;

public class MediaPicker extends C59232vZ {
    public AnonymousClass01A A00;

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        C434920f.A04(this, R.color.color04f1);
    }

    public void AYY(AnonymousClass05J r3) {
        super.AYY(r3);
        C434920f.A08(getWindow(), false);
        C434920f.A03(this, R.color.right_side);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        AnonymousClass01A A08 = AGM().A08(R.id.content);
        if (A08 != null) {
            A08.A0x(i2, i3, intent);
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        A1X(5);
        if (C455529g.A00) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setEnterTransition(inflateTransition);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReturnTransition(inflateTransition2);
            A0b();
        }
        C434920f.A04(this, R.color.color04f1);
        super.onCreate(bundle);
        setTitle(R.string.str092d);
        AGK().A0N(true);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(R.id.content);
        if (bundle == null) {
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A09(this.A00, frameLayout.getId());
            A0O.A01();
            View view = new View(this);
            C13680ns.A0u(this, view, R.color.color01db);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.ceil((double) (C13680ns.A01(this) / 2.0f))));
            frameLayout.addView(view);
        }
        setContentView((View) frameLayout);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass00T.A09(this);
        return true;
    }
}
