package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.EmojiDescriptor;
import org.json.JSONObject;

/* renamed from: X.32p  reason: invalid class name and case insensitive filesystem */
public class C605032p extends C76883uq {
    public Drawable A00;
    public C37781pj A01;
    public final Context A02;
    public final C17250um A03;
    public final boolean A04;

    public C605032p(Context context, C17250um r4, JSONObject jSONObject) {
        this.A02 = context;
        this.A03 = r4;
        this.A04 = false;
        if (jSONObject.has("emoji")) {
            this.A01 = new C37781pj(jSONObject.getString("emoji"));
            A0S(true);
            super.A0A(jSONObject);
        }
    }

    public C605032p(Context context, C37781pj r3, C17250um r4, boolean z2) {
        this.A01 = r3;
        this.A02 = context;
        this.A03 = r4;
        this.A04 = z2;
        A0S(false);
    }

    public Drawable A0F() {
        return this.A00;
    }

    public String A0G() {
        return "emoji";
    }

    public String A0H(Context context) {
        C37781pj r0 = this.A01;
        return r0 == null ? context.getString(R.string.str1c81) : r0.toString();
    }

    public void A0I(Canvas canvas) {
        A0P(canvas);
    }

    public boolean A0J() {
        return false;
    }

    public boolean A0K() {
        return false;
    }

    public void A0N(JSONObject jSONObject) {
        super.A0N(jSONObject);
        C37781pj r0 = this.A01;
        if (r0 != null) {
            jSONObject.put("emoji", r0.toString());
        }
    }

    public void A0P(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            RectF rectF = this.A02;
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            canvas.save();
            C13690nt.A0x(canvas, rectF, this.A00);
            this.A00.draw(canvas);
            canvas.restore();
        }
    }

    public void A0Q(RectF rectF, float f2, float f3, float f4, float f5) {
        super.A0Q(rectF, f2, f3, f4, f5);
        if (!this.A04) {
            RectF rectF2 = this.A02;
            if (rectF2.width() > 128.0f || rectF2.height() > 128.0f) {
                A06(Math.min(128.0f / rectF2.width(), 128.0f / rectF2.height()));
            }
        }
    }

    public float A0R() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) this.A00.getIntrinsicHeight());
    }

    public final void A0S(boolean z2) {
        Drawable A05;
        C37781pj r0 = this.A01;
        if (r0 != null) {
            C434420a r5 = new C434420a(r0.A00);
            long A002 = EmojiDescriptor.A00(r5, false);
            if (this.A04) {
                A05 = this.A03.A05(this.A02.getResources(), r5, A002);
            } else if (z2) {
                C17250um r4 = this.A03;
                Resources resources = this.A02.getResources();
                C434720d A06 = r4.A06(r5, A002);
                if (A06 == null) {
                    A05 = null;
                } else {
                    A05 = r4.A03(resources, A06, r4.A02, (C434820e) null);
                    if (A05 == null) {
                        A05 = r4.A03(resources, A06, r4.A03, new C435320k(r4));
                    }
                }
            } else {
                A05 = this.A03.A02(this.A02.getResources(), new C101934y8(this), r5, A002);
            }
            this.A00 = A05;
        }
    }
}
