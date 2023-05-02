package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.obwhatsapp.R;
import rc.whatsapp.stories.value.Stories;

/* renamed from: X.4b7  reason: invalid class name and case insensitive filesystem */
public final class C88804b7 {
    public static final int A0Q = AnonymousClass4A3.A00;
    public static final PorterDuffXfermode A0R = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public BitmapDrawable A00;
    public ImageView.ScaleType A01 = ImageView.ScaleType.CENTER_CROP;
    public C801342r A02;
    public C800242g A03;
    public AnonymousClass4W8 A04;
    public C813447u A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final Path A09 = new Path();
    public final Path A0A = new Path();
    public final Path A0B = new Path();
    public final Rect A0C = new Rect();
    public final RectF A0D = new RectF();
    public final RectF A0E = new RectF();
    public final RectF A0F = new RectF();
    public final RectF A0G = new RectF();
    public final RectF A0H = new RectF();
    public final RectF A0I = new RectF();
    public final AnonymousClass013 A0J;
    public final C95794nI A0K;
    public final C15220qW A0L = AnonymousClass3K3.A0t(6);
    public final C15220qW A0M = AnonymousClass3K3.A0t(7);
    public final C15220qW A0N = AnonymousClass3K3.A0t(8);
    public final C15220qW A0O = C32521gW.A00(new C106545Eg(this));
    public final C15220qW A0P = C32521gW.A00(new C106555Eh(this));

    public C88804b7(Context context, AnonymousClass013 r4, C95794nI r5, C801342r r6, C800242g r7, boolean z2) {
        this.A08 = context;
        this.A0J = r4;
        this.A07 = z2;
        this.A03 = r7;
        this.A02 = r6;
        this.A0K = r5;
        this.A04 = C89594cV.A02(this.A03).A00(context);
        this.A05 = new C79463zx(AnonymousClass42X.A03);
    }

    public final void A00() {
        C15220qW r2 = this.A0P;
        ((Paint) r2.getValue()).setStrokeWidth(this.A04.A01);
        C813447u r3 = this.A05;
        if (r3 instanceof C79463zx) {
            Paint paint = (Paint) r2.getValue();
            Context context = this.A08;
            int i2 = ((C79463zx) r3).A00.statusColor;
            int unseenColor = Stories.unseenColor();
            if (i2 != R.color.color0878) {
                unseenColor = Stories.seenColor();
            }
            paint.setColor(unseenColor);
        }
    }
}
