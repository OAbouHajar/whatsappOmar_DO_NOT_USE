package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.4c0  reason: invalid class name and case insensitive filesystem */
public abstract class C89344c0 {
    public C455829l A00;

    public C89344c0() {
    }

    public C89344c0(C455829l r1) {
        this.A00 = r1;
    }

    public String A00() {
        return this instanceof C76913ut ? "undo_delete_shape" : this instanceof C76903us ? "undo_change_z_order" : "undo_add_shape";
    }

    public void A01(List list) {
        int i2;
        C455829l r0;
        if (this instanceof C76913ut) {
            C76913ut r02 = (C76913ut) this;
            i2 = r02.A00;
            r0 = r02.A00;
        } else if (this instanceof C76903us) {
            C76903us r1 = (C76903us) this;
            list.remove(r1.A00);
            i2 = r1.A00;
            r0 = r1.A00;
        } else {
            list.remove(this.A00);
            return;
        }
        list.add(i2, r0);
    }

    public void A02(JSONObject jSONObject) {
        if (this instanceof C76913ut) {
            ((C76913ut) this).A00 = jSONObject.getInt("index");
        }
    }

    public void A03(JSONObject jSONObject) {
        if (this instanceof C76913ut) {
            jSONObject.put("index", ((C76913ut) this).A00);
        }
    }
}
