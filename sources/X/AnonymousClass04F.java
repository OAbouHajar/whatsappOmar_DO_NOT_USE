package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.GravityCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.04F  reason: invalid class name */
public final class AnonymousClass04F {
    public int A00 = -1;
    public int A01;
    public int A02 = GravityCompat.END;
    public int A03;
    public int A04 = 0;
    public int A05 = 1;
    public int A06 = 80;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = new ArrayList();
    public ArrayList A0D = new ArrayList();

    public static Notification.Action A00(AnonymousClass04E r6) {
        Notification.Action.Builder builder;
        int i2 = Build.VERSION.SDK_INT;
        IconCompat A002 = r6.A00();
        if (i2 >= 23) {
            builder = new Notification.Action.Builder(A002 == null ? null : A002.A08(), r6.A03, r6.A01);
        } else {
            builder = new Notification.Action.Builder((A002 == null || A002.A05() != 2) ? 0 : A002.A04(), r6.A03, r6.A01);
        }
        Bundle bundle = new Bundle(r6.A07);
        boolean z2 = r6.A04;
        bundle.putBoolean("android.support.allowGeneratedReplies", z2);
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(z2);
            if (i2 >= 31) {
                builder.setAuthenticationRequired(false);
            }
        }
        builder.addExtras(bundle);
        AnonymousClass04G[] r0 = r6.A09;
        if (r0 != null) {
            for (RemoteInput addRemoteInput : AnonymousClass04G.A01(r0)) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        return builder.build();
    }

    public void A01(C007503l r8) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass04E r3 = (AnonymousClass04E) it.next();
                if (Build.VERSION.SDK_INT >= 20) {
                    arrayList2.add(A00(r3));
                } else {
                    arrayList2.add(C06480Wd.A01(r3));
                }
            }
            bundle.putParcelableArrayList(FacebookFacade.RequestParameter.ACTIONS, arrayList2);
        }
        int i2 = this.A05;
        if (i2 != 1) {
            bundle.putInt("flags", i2);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            bundle.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList3 = this.A0D;
        if (!arrayList3.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            bundle.putParcelable("background", bitmap);
        }
        int i3 = this.A01;
        if (i3 != 0) {
            bundle.putInt("contentIcon", i3);
        }
        int i4 = this.A02;
        if (i4 != 8388613) {
            bundle.putInt("contentIconGravity", i4);
        }
        int i5 = this.A00;
        if (i5 != -1) {
            bundle.putInt("contentActionIndex", i5);
        }
        int i6 = this.A04;
        if (i6 != 0) {
            bundle.putInt("customSizePreset", i6);
        }
        int i7 = this.A03;
        if (i7 != 0) {
            bundle.putInt("customContentHeight", i7);
        }
        int i8 = this.A06;
        if (i8 != 80) {
            bundle.putInt("gravity", i8);
        }
        int i9 = this.A07;
        if (i9 != 0) {
            bundle.putInt("hintScreenTimeout", i9);
        }
        String str = this.A0B;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        Bundle bundle2 = r8.A0D;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            r8.A0D = bundle2;
        }
        bundle2.putBundle("android.wearable.EXTENSIONS", bundle);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        AnonymousClass04F r2 = new AnonymousClass04F();
        r2.A0C = new ArrayList(this.A0C);
        r2.A05 = this.A05;
        r2.A08 = this.A08;
        r2.A0D = new ArrayList(this.A0D);
        r2.A09 = this.A09;
        r2.A01 = this.A01;
        r2.A02 = this.A02;
        r2.A00 = this.A00;
        r2.A04 = this.A04;
        r2.A03 = this.A03;
        r2.A06 = this.A06;
        r2.A07 = this.A07;
        r2.A0B = this.A0B;
        r2.A0A = this.A0A;
        return r2;
    }
}
