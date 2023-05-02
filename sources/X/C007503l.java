package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.03l  reason: invalid class name and case insensitive filesystem */
public class C007503l {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public Notification A07;
    public Notification A08;
    public PendingIntent A09;
    public PendingIntent A0A;
    public Context A0B;
    public Bitmap A0C;
    public Bundle A0D;
    public RemoteViews A0E;
    public C007603n A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N = new ArrayList();
    public ArrayList A0O = new ArrayList();
    @Deprecated
    public ArrayList A0P;
    public ArrayList A0Q = new ArrayList();
    public boolean A0R;
    public boolean A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = true;
    public boolean A0W;

    public C007503l(Context context, String str) {
        Notification notification = new Notification();
        this.A07 = notification;
        this.A0B = context;
        this.A0J = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.A03 = 0;
        this.A0P = new ArrayList();
        this.A0R = true;
    }

    public static CharSequence A00(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 5120) ? charSequence : charSequence.subSequence(0, 5120);
    }

    public Notification A01() {
        return new C07280au(this).A01();
    }

    public void A02(int i2) {
        Notification notification = this.A07;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public void A03(int i2, int i3, boolean z2) {
        this.A05 = i2;
        this.A04 = i3;
        this.A0U = z2;
    }

    public void A04(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this.A0N.add(new AnonymousClass04E(i2, charSequence, pendingIntent));
    }

    public void A05(long j2) {
        this.A07.when = j2;
    }

    public void A06(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.A0B.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen01ee);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dimen01ed);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.A0C = bitmap;
    }

    public void A07(Uri uri) {
        Notification notification = this.A07;
        notification.sound = uri;
        notification.audioStreamType = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
    }

    public void A08(C007603n r2) {
        if (this.A0F != r2) {
            this.A0F = r2;
            if (r2.A00 != this) {
                r2.A00 = this;
                A08(r2);
            }
        }
    }

    public void A09(CharSequence charSequence) {
        this.A0G = A00(charSequence);
    }

    public void A0A(CharSequence charSequence) {
        this.A0H = A00(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A07.tickerText = A00(charSequence);
    }

    @Deprecated
    public void A0C(String str) {
        if (str != null && !str.isEmpty()) {
            this.A0P.add(str);
        }
    }

    public void A0D(boolean z2) {
        Notification notification = this.A07;
        int i2 = notification.flags;
        int i3 = 16 | i2;
        if (!z2) {
            i3 = -17 & i2;
        }
        notification.flags = i3;
    }

    public void A0E(boolean z2) {
        Notification notification = this.A07;
        int i2 = notification.flags;
        int i3 = 2 | i2;
        if (!z2) {
            i3 = -3 & i2;
        }
        notification.flags = i3;
    }
}
