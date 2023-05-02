package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.12f  reason: invalid class name and case insensitive filesystem */
public class C209512f {
    public final C16180sb A00;
    public final C18840xL A01;
    public final C16320sq A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public C209512f(C16180sb r2, C18840xL r3, C16320sq r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A00(ImageView imageView, C35361lo r11, int i2, int i3) {
        StringBuilder sb = new StringBuilder("PaymentBackgroundMetadata{id='");
        C35361lo r4 = r11;
        sb.append(r11.A0F);
        sb.append("',fileSize=");
        sb.append(r11.A0E);
        sb.append(",width=");
        sb.append(r11.A0D);
        sb.append(",height=");
        sb.append(r11.A09);
        sb.append(",mimetype='");
        sb.append(r11.A0G);
        sb.append("'}_");
        int i4 = i2;
        sb.append(i2);
        sb.append("_");
        int i5 = i3;
        sb.append(i3);
        String obj = sb.toString();
        ImageView imageView2 = imageView;
        imageView.setTag(obj);
        Drawable drawable = imageView.getDrawable();
        Reference reference = (Reference) this.A03.get(obj);
        Drawable drawable2 = reference != null ? (Drawable) reference.get() : null;
        if (drawable != null && drawable.equals(drawable2)) {
            return;
        }
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
        } else {
            this.A02.Ack(new C78983z0(imageView2, r4, this, obj, i4, i5), new Void[0]);
        }
    }
}
