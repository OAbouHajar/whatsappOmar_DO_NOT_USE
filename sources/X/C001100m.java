package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity$3;
import androidx.activity.ComponentActivity$4;
import androidx.activity.ComponentActivity$5;
import androidx.activity.ImmLeaksCleaner;
import com.facebook.redex.IDxAListenerShape119S0100000_I0;
import com.facebook.redex.IDxSProviderShape316S0100000_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.00m  reason: invalid class name and case insensitive filesystem */
public class C001100m extends C001200n implements C001300o, C001500q, C001600r, C001700s, C001800t, C001900u, C002000v, C002100w {
    public static final String A09 = "android:support:activity-result";
    public int A00;
    public AnonymousClass04o A01;
    public C010505a A02;
    public final AnonymousClass05R A03;
    public final AnonymousClass05Q A04;
    public final AnonymousClass05N A05;
    public final C009604p A06;
    public final AnonymousClass05O A07;
    public final AtomicInteger A08;

    public C001100m() {
        this.A05 = new AnonymousClass05N();
        this.A06 = new C009604p(this);
        this.A07 = new AnonymousClass05O(this);
        this.A04 = new AnonymousClass05Q(new AnonymousClass05P(this));
        this.A08 = new AtomicInteger();
        this.A03 = new AnonymousClass05R(this);
        C009604p r1 = this.A06;
        if (r1 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                r1.A00(new ComponentActivity$3(this));
            }
            this.A06.A00(new ComponentActivity$4(this));
            this.A06.A00(new ComponentActivity$5(this));
            if (19 <= i2 && i2 <= 23) {
                this.A06.A00(new ImmLeaksCleaner(this));
            }
            this.A07.A01.A05(new IDxSProviderShape316S0100000_I0(this, 0), A09);
            A0T(new IDxAListenerShape119S0100000_I0(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public C001100m(int i2) {
        this();
        this.A00 = i2;
    }

    public static /* synthetic */ Bundle A0C(C001100m r4) {
        Bundle bundle = new Bundle();
        AnonymousClass05R r42 = r4.A03;
        Map map = r42.A04;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(r42.A00));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) r42.A02.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", r42.A01);
        return bundle;
    }

    private void A0D() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        AnonymousClass05Z.A00(getWindow().getDecorView(), this);
    }

    @Deprecated
    public static void A0E() {
    }

    public static /* synthetic */ void A0I(C001100m r2) {
        Bundle A012 = r2.A07.A01.A01(A09);
        if (A012 != null) {
            r2.A03.A03(A012);
        }
    }

    public final C011105i A0N(AnonymousClass05R r3, AnonymousClass05g r4, AnonymousClass05h r5) {
        StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.A08.getAndIncrement());
        return r3.A01(r4, r5, this, sb.toString());
    }

    public final C011105i A0O(AnonymousClass05g r2, AnonymousClass05h r3) {
        return A0N(this.A03, r2, r3);
    }

    public void A0P() {
        if (this.A02 == null) {
            C010605b r0 = (C010605b) getLastNonConfigurationInstance();
            if (r0 != null) {
                this.A02 = r0.A00;
            }
            if (this.A02 == null) {
                this.A02 = new C010505a();
            }
        }
    }

    @Deprecated
    public void A0Q() {
        getLastNonConfigurationInstance();
    }

    public void A0R() {
    }

    public /* synthetic */ void A0S() {
    }

    public final void A0T(C006202q r3) {
        AnonymousClass05N r1 = this.A05;
        if (r1.A01 != null) {
            r3.AP6(r1.A01);
        }
        r1.A00.add(r3);
    }

    public final void A0U(C006202q r2) {
        this.A05.A00.remove(r2);
    }

    public final AnonymousClass05R A9m() {
        return this.A03;
    }

    public AnonymousClass04o ABj() {
        if (getApplication() != null) {
            AnonymousClass04o r2 = this.A01;
            if (r2 != null) {
                return r2;
            }
            C010705c r22 = new C010705c(getApplication(), getIntent() != null ? getIntent().getExtras() : null, this);
            this.A01 = r22;
            return r22;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final AnonymousClass05Q AE3() {
        return this.A04;
    }

    public final AnonymousClass05X AFh() {
        return this.A07.A01;
    }

    public C010505a AGy() {
        if (getApplication() != null) {
            A0P();
            return this.A02;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0D();
        super.addContentView(view, layoutParams);
    }

    public C009704q getLifecycle() {
        return this.A06;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.A03.A05(intent, i2, i3)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.A04.A00();
    }

    public void onCreate(Bundle bundle) {
        this.A07.A01(bundle);
        AnonymousClass05N r0 = this.A05;
        r0.A01 = this;
        for (C006202q AP6 : r0.A00) {
            AP6.AP6(this);
        }
        super.onCreate(bundle);
        C010905e.A00(this);
        int i2 = this.A00;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.A03.A05(new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr), i2, -1) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C010605b r0;
        C010505a r1 = this.A02;
        if (r1 == null && ((r0 = (C010605b) getLastNonConfigurationInstance()) == null || (r1 = r0.A00) == null)) {
            return null;
        }
        C010605b r02 = new C010605b();
        r02.A00 = r1;
        return r02;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C009604p r1 = this.A06;
        if (r1 != null) {
            r1.A05(C011005f.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.A07.A02(bundle);
    }

    public void reportFullyDrawn() {
        try {
            if (C011205j.A02()) {
                C011205j.A00();
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19 || (i2 == 19 && AnonymousClass00T.A01(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            C011205j.A01();
        }
    }

    public void setContentView(int i2) {
        A0D();
        super.setContentView(i2);
    }

    public void setContentView(View view) {
        A0D();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A0D();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
