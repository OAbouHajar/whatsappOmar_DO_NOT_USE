package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.filter.FilterUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Fb  reason: invalid class name and case insensitive filesystem */
public class C62823Fb implements AnonymousClass2OV {
    public Context A00;
    public AnonymousClass329 A01;
    public final int A02;
    public final Uri A03;
    public final AnonymousClass013 A04;
    public final C26051Md A05;
    public final C17250um A06;
    public final C14710pd A07;
    public final AnonymousClass20I A08;
    public final C17960vv A09;
    public final AnonymousClass1MF A0A;
    public final AnonymousClass1A9 A0B;
    public final AtomicBoolean A0C = new AtomicBoolean(false);

    public C62823Fb(Uri uri, AnonymousClass013 r4, C26051Md r5, C17250um r6, C14710pd r7, AnonymousClass20I r8, C17960vv r9, AnonymousClass329 r10, AnonymousClass1MF r11, AnonymousClass1A9 r12, int i2) {
        this.A00 = r10.getContext();
        this.A04 = r4;
        this.A06 = r6;
        this.A0B = r12;
        this.A09 = r9;
        this.A0A = r11;
        this.A03 = uri;
        this.A08 = r8;
        this.A01 = r10;
        this.A02 = i2;
        this.A05 = r5;
        this.A07 = r7;
    }

    public String AGT() {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(this.A03, A0o);
        return AnonymousClass000.A0h("-thumb", A0o);
    }

    public Bitmap AKB() {
        Bitmap bitmap;
        Bitmap A002;
        AtomicBoolean atomicBoolean = this.A0C;
        if (!atomicBoolean.get() && this.A01.getTag() == this) {
            AnonymousClass20I r4 = this.A08;
            Uri fromFile = Uri.fromFile(r4.A04());
            byte A003 = this.A09.A00(this.A03);
            if (A003 == 1) {
                try {
                    AnonymousClass1A9 r1 = this.A0B;
                    int i2 = this.A02;
                    bitmap = r1.A0W(fromFile, i2, i2);
                } catch (AnonymousClass20M | IOException unused) {
                    bitmap = C816349d.A00;
                }
            } else if (A003 == 3 || A003 == 13) {
                File A052 = r4.A05();
                AnonymousClass00B.A06(A052);
                Bitmap A012 = C18830xK.A01(A052);
                if (A012 != null) {
                    Bitmap.Config config = A012.getConfig();
                    int i3 = this.A02;
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = Bitmap.createBitmap(i3, i3, config);
                    Canvas canvas = new Canvas(bitmap);
                    Paint A053 = C13700nu.A05();
                    A053.setAntiAlias(true);
                    A053.setFilterBitmap(true);
                    A053.setDither(true);
                    int width = A012.getWidth();
                    int height = A012.getHeight();
                    canvas.drawBitmap(A012, width > height ? new Rect((width - height) >> 1, 0, (width + height) >> 1, height) : new Rect(0, (height - width) >> 1, width, (height + width) >> 1), new Rect(0, 0, i3, i3), A053);
                    A012.recycle();
                } else {
                    bitmap = C816349d.A00;
                }
            } else {
                bitmap = null;
            }
            if (!atomicBoolean.get()) {
                if (bitmap != null) {
                    int A004 = r4.A00();
                    if (!(A004 == 0 || !this.A07.A0E(C16620tM.A02, 2589) || (A002 = FilterUtils.A00(bitmap, this.A05, A004, true)) == null)) {
                        bitmap = A002;
                    }
                    if (r4.A08() == null) {
                        return bitmap;
                    }
                    if (!bitmap.isMutable()) {
                        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    C62033Bj A032 = C62033Bj.A03(this.A00, this.A04, this.A06, this.A0A, r4.A08());
                    if (A032 != null) {
                        A032.A07(bitmap, 0, false, false);
                    }
                    if (bitmap != null) {
                        return bitmap;
                    }
                }
                return C816349d.A00;
            }
        }
        return null;
    }
}
