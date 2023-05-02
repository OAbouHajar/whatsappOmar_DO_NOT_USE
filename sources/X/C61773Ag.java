package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Ag  reason: invalid class name and case insensitive filesystem */
public abstract class C61773Ag {
    public Canvas A00;
    public final float A01;
    public final Paint A02;
    public final List A03 = AnonymousClass000.A0u();

    public C61773Ag(Bitmap bitmap, Paint paint, PointF pointF, float f2, int i2) {
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            float f3 = (float) i2;
            canvas.scale(f3, f3);
            if (pointF != null) {
                canvas.translate(-pointF.x, -pointF.y);
            }
            this.A00 = canvas;
        }
        this.A01 = f2;
        this.A02 = paint;
    }

    public static List A00(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("points");
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i2 = 0; i2 < jSONArray.length(); i2 += 2) {
            A0u.add(new PointF(((float) jSONArray.getInt(i2)) / 100.0f, ((float) jSONArray.getInt(i2 + 1)) / 100.0f));
        }
        return A0u;
    }

    public void A01(Bitmap bitmap, PointF pointF, int i2) {
        Canvas canvas = new Canvas(bitmap);
        float f2 = (float) i2;
        canvas.scale(f2, f2);
        if (pointF != null) {
            canvas.translate(-pointF.x, -pointF.y);
        }
        this.A00 = canvas;
    }

    public void A02(Canvas canvas) {
        AnonymousClass333 r2 = (AnonymousClass333) this;
        Canvas canvas2 = canvas;
        if (canvas != null) {
            for (PointF pointF : r2.A03) {
                r2.A06(canvas2, r2.A02, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public void A03(PointF pointF, long j2) {
    }

    public void A04(PointF pointF, long j2) {
        AnonymousClass333 r2 = (AnonymousClass333) this;
        List list = r2.A03;
        if (list.isEmpty() || !list.get(list.size() - 1).equals(pointF)) {
            list.add(pointF);
            Canvas canvas = r2.A00;
            if (canvas != null) {
                r2.A06(canvas, r2.A02, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public void A05(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        for (PointF pointF : this.A03) {
            jSONArray.put((int) (pointF.x * 100.0f));
            jSONArray.put((int) (pointF.y * 100.0f));
        }
        jSONObject.put("points", jSONArray);
        jSONObject.put("width", (int) (this.A01 * 100.0f));
    }
}
