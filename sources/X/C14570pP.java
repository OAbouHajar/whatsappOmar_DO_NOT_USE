package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.0pP  reason: invalid class name and case insensitive filesystem */
public class C14570pP extends C14580pQ {
    public AnonymousClass2T5 A00;
    public AnonymousClass013 A01;
    public AnonymousClass10F A02;
    public AnonymousClass17S A03;
    public C19500yX A04;
    public C16320sq A05;
    public C008804a A06;
    public boolean A07;

    public static AnonymousClass2Rf A1S(C14590pR r0) {
        return (AnonymousClass2Rf) r0.A1f().generatedComponent();
    }

    public static C49132Rg A1T(C14590pR r0) {
        return (C49132Rg) ((AnonymousClass2Rf) r0.A1f().generatedComponent());
    }

    public static void A1U(Activity activity) {
        activity.getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00T.A00(activity, R.color.color0647)));
        activity.getWindow().addFlags(2621440);
    }

    public static void A1V(Object obj, AbstractCollection abstractCollection, int i2) {
        abstractCollection.add(Pair.create(obj, Integer.valueOf(i2)));
    }

    public static boolean A1W(AnonymousClass2Q7 r2) {
        return RequestPermissionActivity.A0X(r2.getContext(), r2.A01);
    }

    public void A25() {
    }

    public void A26() {
    }

    public void A27() {
    }

    public void A28() {
    }

    public void A29() {
    }

    public boolean A2A() {
        return false;
    }

    public void attachBaseContext(Context context) {
        AnonymousClass01F r3 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A01 = r3.Ai9();
        C16150sX r0 = (C16150sX) r3;
        yo.setSingleton(r0);
        AnonymousClass2T4 r2 = new AnonymousClass2T4((AnonymousClass013) r0.AR8.get());
        this.A00 = r2;
        super.attachBaseContext(new AnonymousClass2T6(context, r2, this.A01));
        this.A02 = r3.AgI();
        C31081dR r1 = this.A01.A01;
        this.A04 = r1.A08;
        this.A03 = r1.A07;
    }

    public Resources getResources() {
        C008804a r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        if (this.A01 == null) {
            Log.i("wabaseappcompatactivity/get resources object/returning super resources");
            return super.getResources();
        }
        C008804a A002 = C008804a.A00(super.getResources(), this.A01);
        this.A06 = A002;
        return A002;
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass013 r0 = this.A01;
        if (r0 != null) {
            r0.A0M();
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.A01.A0M();
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        if (!this.A07) {
            if (A2A()) {
                this.A05.Acl(new RunnableRunnableShape2S0100000_I0_1(this, 22));
            }
            this.A07 = true;
        }
    }
}
