package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.redex.IDxAListenerShape119S0100000_I0;
import com.facebook.redex.IDxSProviderShape316S0100000_I0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.00l  reason: invalid class name and case insensitive filesystem */
public class C001000l extends C001100m implements C000400f, C002200x {
    public static final String A05 = "android:support:fragments";
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass06F A03 = new AnonymousClass06F(new AnonymousClass061(this));
    public final C009604p A04 = new C009604p(this);

    public C001000l() {
        A0A();
    }

    public C001000l(int i2) {
        super(i2);
        A0A();
    }

    private void A0A() {
        this.A07.A01.A05(new IDxSProviderShape316S0100000_I0(this, 2), A05);
        A0T(new IDxAListenerShape119S0100000_I0(this, 2));
    }

    public static boolean A0B(AnonymousClass02C r4, C011005f r5) {
        boolean z2 = false;
        for (AnonymousClass01A r2 : r4.A0U.A02()) {
            if (r2 != null) {
                if (r2.A0F != null) {
                    z2 |= A0B(r2.A0F(), r5);
                }
                C07490bv r0 = r2.A0I;
                if (r0 != null) {
                    r0.A00();
                    if (r0.A00.A02.A00(C011005f.STARTED)) {
                        r2.A0I.A00.A05(r5);
                        z2 = true;
                    }
                }
                if (r2.A0K.A02.A00(C011005f.STARTED)) {
                    r2.A0K.A05(r5);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final View A0V(View view, String str, Context context, AttributeSet attributeSet) {
        return this.A03.A00.A03.A0S.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public C05520Rw A0W() {
        return new C05520Rw(this, AGy());
    }

    public void A0X() {
        do {
        } while (A0B(this.A03.A00.A03, C011005f.CREATED));
    }

    public void A0Y() {
        this.A04.A04(C011405n.ON_RESUME);
        AnonymousClass02C r2 = this.A03.A00.A03;
        r2.A0P = false;
        r2.A0Q = false;
        r2.A0A.A01 = false;
        r2.A0O(7);
    }

    public void A0Z() {
        AnonymousClass00T.A09(this);
    }

    @Deprecated
    public void A0a() {
        invalidateOptionsMenu();
    }

    public void A0b() {
        AnonymousClass00T.A0A(this);
    }

    public void A0c() {
        AnonymousClass00T.A0C(this);
    }

    @Deprecated
    public final void A0d() {
    }

    @Deprecated
    public void A0e(Intent intent, IntentSender intentSender, Bundle bundle, AnonymousClass01A r20, int i2, int i3, int i4, int i5) {
        Intent intent2 = intent;
        IntentSender intentSender2 = intentSender;
        Bundle bundle2 = bundle;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        if (i6 == -1) {
            startIntentSenderForResult(intentSender2, -1, intent2, i7, i8, i9, bundle2);
            return;
        }
        AnonymousClass01A r6 = r20;
        if (r6.A0F != null) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(r6);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                sb.append(i6);
                sb.append(" IntentSender: ");
                sb.append(intentSender2);
                sb.append(" fillInIntent: ");
                sb.append(intent2);
                sb.append(" options: ");
                sb.append(bundle2);
                Log.v("FragmentManager", sb.toString());
            }
            AnonymousClass02C A0G = r6.A0G();
            if (A0G.A04 != null) {
                if (bundle != null) {
                    if (intent == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (AnonymousClass02C.A02(2)) {
                        StringBuilder sb2 = new StringBuilder("ActivityOptions ");
                        sb2.append(bundle2);
                        sb2.append(" were added to fillInIntent ");
                        sb2.append(intent2);
                        sb2.append(" for fragment ");
                        sb2.append(r6);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                }
                AnonymousClass0YA r2 = new AnonymousClass0YA(intent2, intentSender2, i7, i8);
                A0G.A0D.addLast(new AnonymousClass0Y9(r6.A0T, i6));
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder sb3 = new StringBuilder("Fragment ");
                    sb3.append(r6);
                    sb3.append("is launching an IntentSender for result ");
                    Log.v("FragmentManager", sb3.toString());
                }
                A0G.A04.A00((AnonymousClass09N) null, r2);
                return;
            }
            AnonymousClass061 r0 = A0G.A07;
            if (i6 == -1) {
                r0.A00.startIntentSenderForResult(intentSender2, -1, intent2, i7, i8, i9, bundle2);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(r6);
        sb4.append(" not attached to Activity");
        throw new IllegalStateException(sb4.toString());
    }

    public void A0f(Intent intent, Bundle bundle, AnonymousClass01A r4, int i2) {
        if (i2 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            r4.A0O(intent, i2, bundle);
        }
    }

    public void A0g(Intent intent, AnonymousClass01A r3, int i2) {
        A0f(intent, (Bundle) null, r3, i2);
    }

    @Deprecated
    public void A0h(Menu menu, View view) {
        super.onPreparePanel(0, view, menu);
    }

    public void A0i(C000700i r1) {
        AnonymousClass00T.A0D(this, r1);
    }

    public void A0j(C000700i r1) {
        AnonymousClass00T.A0E(this, r1);
    }

    @Deprecated
    public void A1R(AnonymousClass01A r1) {
    }

    public AnonymousClass02C AGM() {
        return this.A03.A00.A03;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.A00);
        printWriter.print(" mResumed=");
        printWriter.print(this.A01);
        printWriter.print(" mStopped=");
        printWriter.print(this.A02);
        if (getApplication() != null) {
            new C05520Rw(this, AGy()).A03(obj, fileDescriptor, printWriter, strArr);
        }
        this.A03.A00.A03.A0j(str, fileDescriptor, printWriter, strArr);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.A03.A00.A03.A0H();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A03.A00.A03.A0H();
        super.onConfigurationChanged(configuration);
        for (AnonymousClass01A r0 : this.A03.A00.A03.A0U.A02()) {
            if (r0 != null) {
                r0.A0P(configuration);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04.A04(C011405n.ON_CREATE);
        AnonymousClass02C r2 = this.A03.A00.A03;
        r2.A0P = false;
        r2.A0Q = false;
        r2.A0A.A01 = false;
        r2.A0O(1);
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        if (i2 != 0) {
            return onCreatePanelMenu;
        }
        AnonymousClass06F r0 = this.A03;
        return onCreatePanelMenu | r0.A00.A03.A0r(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View A0V = A0V(view, str, context, attributeSet);
        return A0V == null ? super.onCreateView(view, str, context, attributeSet) : A0V;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View A0V = A0V((View) null, str, context, attributeSet);
        return A0V == null ? super.onCreateView(str, context, attributeSet) : A0V;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A00.A03.A0G();
        this.A04.A04(C011405n.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        for (AnonymousClass01A r0 : this.A03.A00.A03.A0U.A02()) {
            if (r0 != null) {
                r0.A0L();
            }
        }
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.A03.A00.A03.A0t(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.A03.A00.A03.A0s(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z2) {
        for (AnonymousClass01A r0 : this.A03.A00.A03.A0U.A02()) {
            if (r0 != null) {
                r0.A0Y(z2);
            }
        }
    }

    public void onNewIntent(Intent intent) {
        this.A03.A00.A03.A0H();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.A03.A00.A03.A0S(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.A01 = false;
        this.A03.A00.A03.A0O(5);
        this.A04.A04(C011405n.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z2) {
        for (AnonymousClass01A r0 : this.A03.A00.A03.A0U.A02()) {
            if (r0 != null) {
                r0.A0Z(z2);
            }
        }
    }

    public void onPostResume() {
        super.onPostResume();
        A0Y();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? super.onPreparePanel(0, view, menu) | this.A03.A00.A03.A0q(menu) : super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.A03.A00.A03.A0H();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        this.A03.A00.A03.A0H();
        super.onResume();
        this.A01 = true;
        this.A03.A00.A03.A0m(true);
    }

    public void onStart() {
        this.A03.A00.A03.A0H();
        super.onStart();
        this.A02 = false;
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass02C r2 = this.A03.A00.A03;
            r2.A0P = false;
            r2.A0Q = false;
            r2.A0A.A01 = false;
            r2.A0O(4);
        }
        this.A03.A00.A03.A0m(true);
        this.A04.A04(C011405n.ON_START);
        AnonymousClass02C r22 = this.A03.A00.A03;
        r22.A0P = false;
        r22.A0Q = false;
        r22.A0A.A01 = false;
        r22.A0O(5);
    }

    public void onStateNotSaved() {
        this.A03.A00.A03.A0H();
    }

    public void onStop() {
        super.onStop();
        this.A02 = true;
        A0X();
        AnonymousClass02C r2 = this.A03.A00.A03;
        r2.A0Q = true;
        r2.A0A.A01 = true;
        r2.A0O(4);
        this.A04.A04(C011405n.ON_STOP);
    }
}
