package X;

import android.graphics.RectF;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.332  reason: invalid class name */
public class AnonymousClass332 extends C89344c0 {
    public AnonymousClass4MV A00;

    public AnonymousClass332() {
    }

    public AnonymousClass332(AnonymousClass4MV r1, C455829l r2) {
        super(r2);
        this.A00 = r1;
    }

    public String A00() {
        return "undo_modify_shape";
    }

    public void A01(List list) {
        this.A00.A0M(this.A00);
    }

    public void A02(JSONObject jSONObject) {
        RectF A0K = AnonymousClass000.A0K();
        A0K.left = (float) jSONObject.getDouble("left");
        A0K.right = (float) jSONObject.getDouble("right");
        A0K.top = (float) jSONObject.getDouble("top");
        A0K.bottom = (float) jSONObject.getDouble("bottom");
        int i2 = jSONObject.getInt("color");
        float f2 = (float) jSONObject.getDouble("rotate");
        float f3 = (float) jSONObject.getDouble("strokeWidth");
        if (jSONObject.has("text")) {
            this.A00 = new C76873up(A0K, jSONObject.getString("text"), f2, f3, i2, jSONObject.getInt("fontStyle"));
        } else {
            this.A00 = new AnonymousClass4MV(A0K, f2, f3, i2);
        }
    }

    public void A03(JSONObject jSONObject) {
        jSONObject.put("color", this.A00.A02);
        jSONObject.put("rotate", (double) this.A00.A00);
        jSONObject.put("strokeWidth", (double) this.A00.A01);
        jSONObject.put("left", (double) this.A00.A03.left);
        jSONObject.put("right", (double) this.A00.A03.right);
        jSONObject.put("top", (double) this.A00.A03.top);
        jSONObject.put("bottom", (double) this.A00.A03.bottom);
        AnonymousClass4MV r2 = this.A00;
        if (r2 instanceof C76873up) {
            C76873up r22 = (C76873up) r2;
            jSONObject.put("text", r22.A01);
            jSONObject.put("fontStyle", r22.A00);
        }
    }
}
