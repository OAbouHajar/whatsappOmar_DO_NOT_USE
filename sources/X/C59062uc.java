package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.WaImageView;

/* renamed from: X.2uc  reason: invalid class name and case insensitive filesystem */
public class C59062uc extends C65253Tx {
    public final /* synthetic */ C31201dg A00;
    public final /* synthetic */ AnonymousClass1JW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59062uc(C14990q7 r1, C31201dg r2, C31201dg r3, AnonymousClass1JW r4) {
        super(r1, r2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ void A07(View view, C14990q7 r11, C31201dg r12, Object obj) {
        ImageView.ScaleType scaleType;
        ImageView imageView = (ImageView) view;
        C31201dg r4 = this.A00;
        String A0J = r4.A0J(41);
        if (r11.A05 && !TextUtils.isEmpty(r4.A0J(36))) {
            A0J = r4.A0J(36);
        }
        if (!TextUtils.isEmpty(A0J)) {
            C14930q1 A0H = r4.A0H(44);
            C88024Zp r7 = A0H == null ? null : new C88024Zp(r11, r4, A0H);
            C62183Bz.A05(r11, r4);
            AnonymousClass1JW r5 = this.A01;
            Uri parse = Uri.parse(A0J);
            boolean equals = "static.whatsapp.net".equals(parse.getHost());
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(parse.getHost());
            String path = parse.getPath();
            if (equals) {
                A0o.append(path);
                path = parse.getQuery();
            }
            r5.A87(imageView, r7, A0J, AnonymousClass000.A0h(path, A0o));
        }
        C31201dg A0G = r4.A0G(46);
        if (A0G != null) {
            String A0J2 = A0G.A0J(36);
            if (!TextUtils.isEmpty(A0J2)) {
                byte[] decode = Base64.decode(A0J2, 0);
                imageView.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
            }
        }
        String A0J3 = r4.A0J(40);
        if (A0J3 == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            try {
                scaleType = C62163Bx.A0A(A0J3);
            } catch (AnonymousClass40K e2) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
                C29691b2.A01("WaRcCoreBloksImageComponentBinderUtils", "Failed to parse Image scaleType", e2);
            }
        }
        imageView.setScaleType(scaleType);
        C31201dg A0G2 = r4.A0G(35);
        if (A0G2 != null) {
            imageView.setColorFilter(C87564Xk.A01(r11, A0G2, 0));
        }
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r4, C31201dg r5, Object obj) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable((Drawable) null);
        imageView.setTag((Object) null);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setColorFilter((ColorFilter) null);
        imageView.setScaleX(1.0f);
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new WaImageView(context);
    }
}
