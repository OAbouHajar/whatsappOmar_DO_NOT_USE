package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;

/* renamed from: X.0ud  reason: invalid class name and case insensitive filesystem */
public class C17160ud {
    public final C218215o A00;
    public final C16980tz A01;
    public final C15810rt A02;
    public final C14710pd A03;

    public C17160ud(C218215o r1, C16980tz r2, C15810rt r3, C14710pd r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static Bitmap A00(Context context, float f2, int i2, int i3) {
        Drawable drawable = context.getResources().getDrawable(i2);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        int A002 = AnonymousClass00T.A00(context, R.color.color065f);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i3, i3);
        if (drawable instanceof BitmapDrawable) {
            Paint paint = new Paint();
            float f3 = (float) i3;
            RectF rectF = new RectF(0.0f, 0.0f, f3, f3);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(A002);
            if (f2 >= 0.0f) {
                canvas.drawRoundRect(rectF, f2, f2, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(((BitmapDrawable) drawable).getBitmap(), (Rect) null, rectF, paint);
            return createBitmap;
        }
        drawable.draw(canvas);
        return createBitmap;
    }

    public int A01(C16010sH r2) {
        return A02((C15830rv) r2.A08(C15830rv.class));
    }

    public int A02(C15830rv r7) {
        if (C16030sJ.A0P(r7)) {
            return R.drawable.avatar_server_psa;
        }
        if (C16030sJ.A0Q(r7)) {
            return R.drawable.avatar_status;
        }
        if (C16030sJ.A0G(r7)) {
            return R.drawable.avatar_broadcast;
        }
        if (!C16030sJ.A0L(r7)) {
            return R.drawable.avatar_contact;
        }
        C14710pd r5 = this.A03;
        C16620tM r3 = C16620tM.A02;
        return (!r5.A0E(r3, 982) || this.A02.A02(C16050sL.A03(r7)) != 1) ? (!r5.A0E(r3, 982) || this.A02.A02(C16050sL.A03(r7)) != 3) ? R.drawable.avatar_group : R.drawable.avatar_announcement : R.drawable.avatar_parent_large;
    }

    public Bitmap A03(Context context, int i2) {
        Bitmap bitmap;
        C218215o r4 = this.A00;
        synchronized (r4) {
            if (C434920f.A09(context) != r4.A00) {
                r4.A01.clear();
                boolean z2 = false;
                if (!r4.A00) {
                    z2 = true;
                }
                r4.A00 = z2;
            }
            SparseArray sparseArray = r4.A01;
            bitmap = (Bitmap) sparseArray.get(i2);
            if (bitmap == null) {
                bitmap = A00(context, yo.setSQPC(context.getResources().getDimension(R.dimen.dimen0748)), i2, context.getResources().getDimensionPixelSize(R.dimen.dimen074a));
                sparseArray.put(i2, bitmap);
            }
        }
        return bitmap;
    }

    public Bitmap A04(C16010sH r4, float f2, int i2) {
        Bitmap decodeResource;
        if (Build.VERSION.SDK_INT >= 21) {
            int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            int A012 = A01(r4);
            Context context = this.A01.A00;
            decodeResource = i3 >= 0 ? A00(context, f2, A012, i2) : A03(context, A012);
        } else {
            decodeResource = BitmapFactory.decodeResource(this.A01.A00.getResources(), A01(r4));
        }
        return i2 != 0 ? Bitmap.createScaledBitmap(decodeResource, i2, i2, true) : decodeResource;
    }

    public void A05(ImageView imageView, int i2) {
        imageView.setImageBitmap(A03(imageView.getContext(), i2));
    }

    public void A06(ImageView imageView, C16010sH r3) {
        A05(imageView, A02((C15830rv) r3.A08(C15830rv.class)));
    }
}
