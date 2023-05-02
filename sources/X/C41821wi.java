package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public abstract class C41821wi {
    public View A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = false;
    public final Rect A06 = new Rect();

    public void A00() {
        StringBuilder sb = new StringBuilder("playbackPage/onConfigurationChanged page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A01() {
        this.A01 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onDestroy page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A02() {
        this.A03 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onPause page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A03() {
        this.A03 = true;
        StringBuilder sb = new StringBuilder("playbackPage/onResume page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A04() {
        this.A04 = true;
        StringBuilder sb = new StringBuilder("playbackPage/onViewActive page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A05() {
        this.A04 = false;
        StringBuilder sb = new StringBuilder("playbackPage/onViewInactive page=");
        sb.append(this);
        sb.append("; host=");
        sb.append(((C41811wh) this).A0R.A01);
        Log.i(sb.toString());
    }

    public void A06(int i2) {
        C41811wh r1 = (C41811wh) this;
        r1.A05 = false;
        r1.A0J(i2);
    }

    public void A07(Rect rect) {
        this.A06.set(rect);
    }
}
