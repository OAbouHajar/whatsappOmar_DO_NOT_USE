package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.32r  reason: invalid class name and case insensitive filesystem */
public class C605232r extends C76883uq implements AnonymousClass5QP {
    public int A00;
    public Drawable A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Context A05;
    public final AnonymousClass1MF A06;
    public final String A07;

    public C605232r(Context context, AnonymousClass1MF r6, JSONObject jSONObject) {
        this.A05 = context;
        this.A04 = jSONObject.getInt("sticker_size");
        this.A06 = r6;
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A02 = jSONObject.getString("file_path");
            this.A03 = jSONObject.getString("plain_file_hash");
            this.A00 = jSONObject.getInt("file_storage_location");
            A0S();
        }
        this.A07 = jSONObject.getString("content_description");
        super.A0A(jSONObject);
        if (this.A01 == null) {
            throw AnonymousClass000.A0T("loadedDrawable was not loaded correctly");
        }
    }

    public C605232r(Context context, C34151jm r3, AnonymousClass1MF r4, int i2) {
        this.A05 = context;
        this.A02 = r3.A09;
        this.A04 = i2;
        this.A00 = r3.A01;
        this.A03 = r3.A0D;
        this.A07 = C89674ci.A00(context, r3);
        this.A06 = r4;
        A0S();
    }

    public static void A02(Canvas canvas, C605232r r6) {
        canvas.save();
        Drawable drawable = r6.A01;
        if (drawable instanceof C436020t) {
            C436020t r4 = (C436020t) drawable;
            r6.A0T(canvas, r4.getBounds().right, r4.getBounds().bottom);
            canvas.drawBitmap(r4.A07.A09, (Rect) null, r4.getBounds(), r4.A06);
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        r6.A0T(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        bitmapDrawable.draw(canvas);
    }

    public Drawable A0F() {
        return this.A01;
    }

    public String A0G() {
        return "sticker";
    }

    public String A0H(Context context) {
        return this.A07;
    }

    public void A0I(Canvas canvas) {
        if (this.A01 != null) {
            canvas.save();
            if (this.A01 != null) {
                A02(canvas, this);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public boolean A0J() {
        return false;
    }

    public boolean A0K() {
        return false;
    }

    public boolean A0L() {
        return true;
    }

    public void A0N(JSONObject jSONObject) {
        String str;
        super.A0N(jSONObject);
        String str2 = this.A02;
        if (!(str2 == null || (str = this.A03) == null)) {
            jSONObject.put("file_path", str2);
            jSONObject.put("plain_file_hash", str);
            jSONObject.put("file_storage_location", this.A00);
        }
        jSONObject.put("sticker_size", this.A04);
        jSONObject.put("content_description", this.A07);
    }

    public void A0P(Canvas canvas) {
        if (this.A01 != null) {
            A02(canvas, this);
            canvas.restore();
        }
    }

    public float A0R() {
        float width;
        int height;
        Drawable drawable = this.A01;
        if (drawable == null) {
            return 0.0f;
        }
        if (drawable instanceof C436020t) {
            width = (float) drawable.getBounds().right;
            height = this.A01.getBounds().bottom;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            width = (float) bitmapDrawable.getBitmap().getWidth();
            height = bitmapDrawable.getBitmap().getHeight();
        }
        return width / ((float) height);
    }

    public final void A0S() {
        String str = this.A02;
        AnonymousClass00B.A06(str);
        String str2 = this.A03;
        AnonymousClass00B.A06(str2);
        int i2 = this.A04;
        AnonymousClass00B.A0G(AnonymousClass000.A1Q(i2));
        C34151jm r4 = new C34151jm();
        int i3 = this.A00;
        r4.A09 = str;
        r4.A01 = i3;
        r4.A0D = str2;
        this.A06.A05((C14870pt) null, new C436320w(this.A05, r4, this, AnonymousClass1MF.A00(r4, i2, i2), i2, i2), (Map) null);
    }

    public final void A0T(Canvas canvas, int i2, int i3) {
        RectF rectF = this.A02;
        float width = rectF.width() / ((float) i2);
        float height = rectF.height() / ((float) i3);
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(this.A00);
        float f2 = ((float) (-i2)) / 2.0f;
        canvas.translate(f2, f2);
    }

    public void AXl(Drawable drawable) {
        this.A01 = drawable;
        RectF rectF = this.A02;
        A0Q(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
