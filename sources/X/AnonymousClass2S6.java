package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.google.android.gms.maps.GoogleMapOptions;
import com.obwhatsapp.R;

/* renamed from: X.2S6  reason: invalid class name */
public class AnonymousClass2S6 extends FrameLayout {
    public final AnonymousClass39K A00;

    public AnonymousClass2S6(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new AnonymousClass39K(context, this, googleMapOptions);
        setClickable(true);
    }

    public void A00() {
        AnonymousClass39K r1 = this.A00;
        C107835Lp r0 = r1.A01;
        if (r0 != null) {
            try {
                C31361e1 r2 = (C31361e1) ((C98084r4) r0).A02;
                r2.A03(5, r2.A01());
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        } else {
            r1.A00(1);
        }
    }

    public void A01() {
        C107835Lp r0 = this.A00.A01;
        if (r0 != null) {
            try {
                C31361e1 r2 = (C31361e1) ((C98084r4) r0).A02;
                r2.A03(6, r2.A01());
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        }
    }

    public void A02() {
        AnonymousClass39K r1 = this.A00;
        C107835Lp r0 = r1.A01;
        if (r0 != null) {
            try {
                C31361e1 r2 = (C31361e1) ((C98084r4) r0).A02;
                r2.A03(4, r2.A01());
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        } else {
            r1.A00(5);
        }
    }

    public void A03() {
        AnonymousClass39K r2 = this.A00;
        r2.A01((Bundle) null, new C98104r6(r2));
    }

    public void A04(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            AnonymousClass39K r1 = this.A00;
            r1.A01(bundle, new AnonymousClass3EE(bundle, r1));
            if (r1.A01 == null) {
                C57892s9 r3 = C57892s9.A00;
                Context context = getContext();
                int A002 = r3.A00(context, 12451000);
                String A01 = C62093Bp.A01(context, A002);
                Resources resources = context.getResources();
                int i2 = R.string.str1c28;
                if (A002 != 1) {
                    i2 = R.string.str1c2f;
                    if (A002 != 2) {
                        i2 = R.string.str1c25;
                        if (A002 != 3) {
                            i2 = 17039370;
                        }
                    }
                }
                String string = resources.getString(i2);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(A01);
                linearLayout.addView(textView);
                Intent A012 = r3.A01(context, (String) null, A002);
                if (A012 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(string);
                    linearLayout.addView(button);
                    button.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1(context, A012, 0));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void A05(Bundle bundle) {
        AnonymousClass39K r1 = this.A00;
        C107835Lp r0 = r1.A01;
        if (r0 != null) {
            C98084r4 r02 = (C98084r4) r0;
            try {
                Bundle bundle2 = new Bundle();
                C90234dn.A01(bundle, bundle2);
                C31361e1 r2 = (C31361e1) r02.A02;
                Parcel A01 = r2.A01();
                C90334dy.A01(A01, bundle2);
                Parcel A02 = r2.A02(7, A01);
                if (A02.readInt() != 0) {
                    bundle2.readFromParcel(A02);
                }
                A02.recycle();
                C90234dn.A01(bundle2, bundle);
            } catch (RemoteException e2) {
                throw new C105555Ab(e2);
            }
        } else {
            Bundle bundle3 = r1.A00;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public void A06(AnonymousClass5OF r4) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C13710nw.A02(r4, "callback must not be null.");
            AnonymousClass39K r1 = this.A00;
            C107835Lp r0 = r1.A01;
            if (r0 != null) {
                ((C98084r4) r0).A00(r4);
            } else {
                r1.A08.add(r4);
            }
        } else {
            throw new IllegalStateException("getMapAsync() must be called on the main thread");
        }
    }
}
