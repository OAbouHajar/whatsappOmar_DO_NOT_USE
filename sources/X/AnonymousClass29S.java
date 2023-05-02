package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape6S0101000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.google.android.gms.maps.model.LatLngBounds;
import com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.location.PlaceInfo;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape0S0300000_I0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.29S  reason: invalid class name */
public abstract class AnonymousClass29S implements LocationListener {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Location A06;
    public Handler A07;
    public Handler A08;
    public HandlerThread A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public View A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public ImageView A0S;
    public ImageView A0T;
    public ListView A0U;
    public ProgressBar A0V;
    public ProgressBar A0W;
    public TextView A0X;
    public C000900k A0Y;
    public AnonymousClass267 A0Z;
    public C15830rv A0a;
    public AnonymousClass2A5 A0b;
    public AnonymousClass4RF A0c;
    public C63333Hc A0d;
    public AnonymousClass36R A0e;
    public C56742oR A0f;
    public PlaceInfo A0g;
    public C35311li A0h;
    public C38411qk A0i;
    public Runnable A0j;
    public Runnable A0k;
    public String A0l;
    public Map A0m;
    public boolean A0n = true;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q = false;
    public boolean A0r = false;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u = false;
    public boolean A0v;
    public boolean A0w = false;
    public boolean A0x;
    public boolean A0y = true;
    public final C19980zJ A0z;
    public final C16300so A10;
    public final AnonymousClass16R A11;
    public final C14870pt A12;
    public final C16040sK A13;
    public final C17130ua A14;
    public final C16760tb A15;
    public final C17160ud A16;
    public final C17030uP A17;
    public final AnonymousClass152 A18;
    public final AnonymousClass01V A19;
    public final C16440t3 A1A;
    public final C16980tz A1B;
    public final C16260sj A1C;
    public final C15860rz A1D;
    public final AnonymousClass013 A1E;
    public final C15810rt A1F;
    public final C16460t6 A1G;
    public final C206711d A1H;
    public final C17250um A1I;
    public final AnonymousClass1BQ A1J;
    public final C14710pd A1K;
    public final C19950zG A1L;
    public final C19430yQ A1M;
    public final AnonymousClass1P7 A1N;
    public final PlaceInfo A1O = new PlaceInfo();
    public final C614038t A1P;
    public final WhatsAppLibLoader A1Q;
    public final C17020u3 A1R;
    public final C17220uj A1S;
    public final C23061Ai A1T;
    public final C16320sq A1U;

    public AnonymousClass29S(C19980zJ r3, C16300so r4, AnonymousClass16R r5, C14870pt r6, C16040sK r7, C17130ua r8, C16760tb r9, C17160ud r10, C17030uP r11, AnonymousClass152 r12, AnonymousClass01V r13, C16440t3 r14, C16980tz r15, C16260sj r16, C15860rz r17, AnonymousClass013 r18, C15810rt r19, C16460t6 r20, C206711d r21, C17250um r22, AnonymousClass1BQ r23, C14710pd r24, C19950zG r25, C19430yQ r26, AnonymousClass1P7 r27, C614038t r28, WhatsAppLibLoader whatsAppLibLoader, C17020u3 r30, C17220uj r31, C23061Ai r32, C16320sq r33) {
        this.A1B = r15;
        this.A1A = r14;
        this.A1K = r24;
        this.A12 = r6;
        this.A1T = r32;
        this.A10 = r4;
        this.A13 = r7;
        this.A1U = r33;
        this.A1F = r19;
        this.A14 = r8;
        this.A1I = r22;
        this.A15 = r9;
        this.A1H = r21;
        this.A0z = r3;
        this.A1N = r27;
        this.A16 = r10;
        this.A19 = r13;
        this.A1E = r18;
        this.A1S = r31;
        this.A1G = r20;
        this.A1P = r28;
        this.A1Q = whatsAppLibLoader;
        this.A1J = r23;
        this.A17 = r11;
        this.A1L = r25;
        this.A1C = r16;
        this.A1D = r17;
        this.A11 = r5;
        this.A1M = r26;
        this.A1R = r30;
        this.A18 = r12;
    }

    public abstract int A00();

    public Dialog A01(int i2) {
        int i3;
        Uri A042;
        int i4 = i2;
        if (i4 != 2) {
            int i5 = 3;
            if (i4 != 3) {
                i5 = 4;
                if (i4 != 4) {
                    return null;
                }
            }
            View inflate = this.A0Y.getLayoutInflater().inflate(R.layout.layout03a9, (ViewGroup) null, false);
            ImageView imageView = (ImageView) C004601z.A0E(inflate, R.id.header_logo);
            imageView.setContentDescription(this.A0Y.getString(i5 != 3 ? R.string.str14fc : R.string.str1609));
            int i6 = R.drawable.nux_live_location;
            if (i5 != 3) {
                i6 = R.drawable.nux_location;
            }
            imageView.setImageResource(i6);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) inflate.findViewById(R.id.location_new_user_description);
            Context context = this.A1B.A00;
            C14870pt r14 = this.A12;
            C19980zJ r8 = this.A0z;
            AnonymousClass01V r7 = this.A19;
            C000900k r3 = this.A0Y;
            if (i5 != 3) {
                i3 = R.string.str0dbf;
            } else {
                boolean A0E2 = this.A1K.A0E(C16620tM.A02, 332);
                i3 = R.string.str0c73;
                if (A0E2) {
                    i3 = R.string.str0c77;
                }
            }
            String string = r3.getString(i3, new Object[]{"learn-more"});
            C14710pd r6 = this.A1K;
            C16620tM r4 = C16620tM.A02;
            boolean A0E3 = r6.A0E(r4, 332);
            C17220uj r13 = this.A1S;
            if (A0E3) {
                Uri.Builder A012 = r13.A01();
                A012.appendPath("android");
                A012.appendPath("chats");
                A012.appendPath("how-to-use-location-features");
                r13.A06(A012);
                A042 = A012.build();
            } else {
                A042 = r13.A04("26000049");
            }
            C19980zJ r17 = r8;
            C45922Bq.A08(context, A042, r17, r14, textEmojiLabel, r7, string);
            C32241fu r32 = new C32241fu(this.A0Y);
            r32.setView(inflate);
            r32.A07(true);
            r32.setNegativeButton(R.string.str0394, new IDxCListenerShape6S0101000_2_I0(this, i5, 6));
            r32.A03(new IDxCListenerShape161S0100000_2_I0(this, 9));
            boolean A0E4 = r6.A0E(r4, 332);
            int i7 = R.string.str02ac;
            if (A0E4) {
                i7 = R.string.str00d3;
            }
            r32.setPositiveButton(i7, new IDxCListenerShape6S0101000_2_I0(this, i5, 7));
            return r32.create();
        }
        IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(this, 76);
        C32241fu r1 = new C32241fu(this.A0Y);
        r1.A02(R.string.str0a05);
        r1.A01(R.string.str0a04);
        r1.A07(true);
        r1.setPositiveButton(R.string.str0e87, iDxCListenerShape127S0100000_2_I0);
        return r1.create();
    }

    public abstract Location A02();

    public void A03() {
        Handler handler = this.A08;
        if (handler != null) {
            handler.removeCallbacks(this.A0k);
        }
        AnonymousClass36R r1 = this.A0e;
        if (r1 != null) {
            r1.A06(true);
            this.A0e = null;
        }
        this.A0i.A02.A02(false);
        AnonymousClass2A5 r2 = this.A0b;
        r2.A01.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A02);
        r2.A07.A08();
        this.A09.quit();
    }

    public void A04() {
        if (this.A0r || this.A0v) {
            A0V(false);
        }
        this.A11.A05(this, "location-picker-onresume", 0.0f, 3, 5000, 1000);
        A0S((Float) null, false);
    }

    public final void A05() {
        View findViewById = this.A0U.findViewById(R.id.location_description);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        boolean z2 = !this.A0p;
        this.A0p = z2;
        float f2 = -0.5f;
        if (z2) {
            f2 = 0.5f;
        }
        A0S(Float.valueOf(f2), true);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Float, java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2 */
    public final void A06() {
        ? r7;
        this.A0v = false;
        boolean z2 = this.A0r;
        C000900k r0 = this.A0Y;
        if (z2) {
            r0.finish();
            return;
        }
        View currentFocus = r0.getCurrentFocus();
        if (currentFocus != null) {
            this.A1T.A01(currentFocus);
        }
        if (this.A0A != null) {
            this.A0J.clearAnimation();
            if (this.A0J.getVisibility() == 0) {
                A0R((Float) null, false);
                C64163Nb r2 = new C64163Nb(this);
                r2.setDuration(350);
                r2.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 14));
                r2.setInterpolator(new AccelerateInterpolator());
                this.A0J.startAnimation(r2);
            } else {
                this.A0J.setVisibility(8);
                A0H(0);
            }
            if (this.A0c != null) {
                this.A0A.clearAnimation();
                int visibility = this.A0A.getVisibility();
                r7 = 0;
                View view = this.A0A;
                if (visibility != 0) {
                    view.setVisibility(0);
                    A0R((Float) null, false);
                    AnonymousClass4RF r4 = this.A0c;
                    IDxLAdapterShape51S0100000_2_I0 iDxLAdapterShape51S0100000_2_I0 = new IDxLAdapterShape51S0100000_2_I0(this, 15);
                    AnonymousClass3NZ r22 = new AnonymousClass3NZ(r4);
                    r22.setAnimationListener(new IDxLAdapterShape11S0200000_2_I0(iDxLAdapterShape51S0100000_2_I0, 5, r4));
                    r22.setDuration(400);
                    r22.setInterpolator(new AccelerateInterpolator());
                    r4.A01.startAnimation(r22);
                    return;
                }
                view.setVisibility(0);
                if (this.A0A.getHeight() == 0) {
                    this.A0A.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 6));
                    return;
                }
                this.A0c.A00((float) this.A0A.getHeight());
            } else {
                return;
            }
        } else {
            r7 = 0;
            A0R((Float) null, false);
        }
        A0L(A02(), r7, A00(), false, true);
        A0S(r7, true);
    }

    public final void A07() {
        int indexOf;
        PlaceInfo placeInfo = this.A0g;
        if (placeInfo != null && (indexOf = this.A0h.A08.indexOf(placeInfo)) >= 0) {
            A0B();
            ListView listView = this.A0U;
            listView.smoothScrollToPosition(indexOf + listView.getHeaderViewsCount());
        }
    }

    public final void A08() {
        if (!this.A1K.A0E(C16620tM.A02, 332) || !((SharedPreferences) this.A1D.A01.get()).getBoolean("nearby_location_new_user", true)) {
            if (this.A0x) {
                Intent intent = new Intent();
                intent.putExtra("locations_string", this.A0l);
                PlaceInfo placeInfo = this.A1O;
                intent.putExtra("longitude", placeInfo.A02);
                intent.putExtra("latitude", placeInfo.A01);
                this.A0Y.setResult(-1, intent);
            } else {
                Location location = this.A06;
                C16740tZ r6 = null;
                if (location != null && location.getAccuracy() > 200.0f) {
                    location = null;
                }
                long longExtra = this.A0Y.getIntent().getLongExtra("quoted_message_row_id", 0);
                C16050sL A052 = C16050sL.A05(this.A0Y.getIntent().getStringExtra("quoted_group_jid"));
                if (longExtra > 0) {
                    r6 = this.A1G.A0K.A00(longExtra);
                } else if (A052 != null) {
                    r6 = C222617g.A00(A052, (String) null, (String) null, this.A1A.A00());
                }
                C15830rv r12 = this.A0a;
                if (r12 != null) {
                    C16760tb r8 = this.A15;
                    AnonymousClass00B.A06(r12);
                    boolean booleanExtra = this.A0Y.getIntent().getBooleanExtra("has_number_from_url", false);
                    C222617g r2 = r8.A1N;
                    C16440t3 r16 = r8.A0Q;
                    C38751rM r9 = new C38751rM(r2.A05.A02(r12, true), r16.A00());
                    if (location != null) {
                        r9.A00 = location.getLatitude();
                        r9.A01 = location.getLongitude();
                    }
                    r9.A0W(1);
                    r2.A05(r9, r6);
                    if (booleanExtra) {
                        r9.A0S(4);
                    }
                    r8.A0M(r9);
                    C16460t6 r15 = r8.A0e;
                    r15.A0d(r9, 2);
                    C16300so r14 = r8.A01;
                    C17130ua r13 = r8.A08;
                    C19150xq r122 = r8.A0n;
                    C19950zG r11 = r8.A13;
                    C16260sj r10 = r8.A0S;
                    AnonymousClass16R r7 = r8.A02;
                    AnonymousClass16V r62 = r8.A0o;
                    C19430yQ r1 = r8.A14;
                    C16460t6 r19 = r15;
                    C16440t3 r17 = r16;
                    C17130ua r162 = r13;
                    AnonymousClass12E r132 = r8.A00;
                    AnonymousClass2K4 r123 = new AnonymousClass2K4(r132, r14, r7, r162, r17, r10, r19, r122, r62, r11, r1, r9);
                    r123.A01 = 15;
                    r8.A1Y.Ack(r123, new Void[0]);
                }
                C000900k r3 = this.A0Y;
                Intent intent2 = new Intent();
                Map map = this.A0m;
                if (map != null) {
                    intent2.putExtra("carry_forward_extras", new HashMap(map));
                }
                r3.setResult(-1, intent2);
            }
            this.A0Y.finish();
            return;
        }
        this.A0j = new RunnableRunnableShape10S0100000_I0_9((Object) this, 23);
        AnonymousClass29T.A01(this.A0Y, 4);
    }

    public final void A09() {
        String str;
        C35311li r2 = this.A0h;
        if (r2 == null || r2.A08.isEmpty()) {
            str = null;
        } else if (r2.A0E == 3) {
            str = this.A0Y.getString(R.string.str0c93, new Object[]{"<a href='https://foursquare.com/'>foursquare</a>"});
        } else {
            str = r2.A03;
        }
        this.A0N.setVisibility(8);
        if (str == null || this.A0p) {
            this.A0X.setVisibility(8);
            return;
        }
        this.A0X.setText(AnonymousClass1ZW.A01(str, new Object[0]));
        this.A0X.setVisibility(0);
    }

    public final void A0A() {
        View findViewById;
        String A0J2;
        if (!this.A0o) {
            findViewById = this.A0Y.findViewById(R.id.location_accuracy);
        } else if (!this.A0p) {
            findViewById = this.A0G.findViewById(R.id.location_description);
        } else {
            return;
        }
        TextView textView = (TextView) findViewById;
        if (textView != null) {
            if (this.A0x && !TextUtils.isEmpty(this.A0l)) {
                textView.setVisibility(0);
                A0J2 = this.A0l;
            } else if (this.A0x || this.A01 <= 0) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setVisibility(0);
                AnonymousClass013 r6 = this.A1E;
                int i2 = this.A01;
                A0J2 = r6.A0J(new Object[]{Integer.valueOf(i2)}, R.plurals.plurals00cd, (long) i2);
            }
            textView.setText(A0J2);
        }
    }

    public final void A0B() {
        C56742oR r1 = this.A0f;
        C35311li r0 = this.A0h;
        r1.A01 = r0 != null ? r0.A08 : null;
        r1.A00 = this.A0g;
        r1.notifyDataSetChanged();
    }

    public abstract void A0C();

    public abstract void A0D();

    public abstract void A0E();

    public abstract void A0F();

    public void A0G(double d2, double d3) {
        PlaceInfo placeInfo = this.A1O;
        placeInfo.A01 = d2;
        placeInfo.A02 = d3;
        placeInfo.A06 = null;
        placeInfo.A04 = null;
        if ((this.A0p && !this.A0u) || (this.A0x && TextUtils.isEmpty(this.A0l))) {
            if (this.A0g == null && (this.A0o || this.A0w)) {
                this.A0B.setVisibility(0);
            }
            this.A07.removeCallbacks(this.A0d);
            C63333Hc r1 = new C63333Hc(this, d2, d3);
            this.A0d = r1;
            this.A07.post(r1);
        }
    }

    public final void A0H(int i2) {
        this.A02 = i2;
        int max = Math.max(this.A00, i2);
        this.A0K.setPadding(0, 0, 0, max);
        this.A0K.requestLayout();
        A0I(max);
    }

    public abstract void A0I(int i2);

    public void A0J(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            A0L(A02(), intent.getStringExtra("query"), Math.max(A00(), 50000), true, true);
        }
    }

    public abstract void A0K(Location location, Float f2, int i2, boolean z2);

    public final void A0L(Location location, String str, int i2, boolean z2, boolean z3) {
        this.A08.removeCallbacks(this.A0k);
        (this.A0p ? this.A0W : this.A0V).setVisibility(0);
        this.A0g = null;
        A0C();
        this.A0Y.findViewById(R.id.places_empty).setVisibility(8);
        this.A0X.setVisibility(8);
        this.A0N.setVisibility(8);
        this.A0h = new C35311li();
        A0B();
        AnonymousClass36R r2 = new AnonymousClass36R(location, this, str, i2, z2, z3);
        this.A0e = r2;
        this.A1U.Ack(r2, new Void[0]);
    }

    public void A0M(Bundle bundle) {
        bundle.putParcelable("places", this.A0h);
        bundle.putBoolean("show_live_location_setting", this.A0v);
        bundle.putBoolean("fullscreen", this.A0p);
        bundle.putBoolean("zoom_to_user", this.A0y);
    }

    public void A0N(Bundle bundle, C000900k r31) {
        C15830rv r0;
        C15830rv r02;
        UserJid nullable;
        int i2;
        LocationManager A0F2;
        C15830rv r03;
        UserJid nullable2;
        C000900k r8 = r31;
        this.A0Y = r8;
        Bitmap bitmap = null;
        View inflate = r8.getLayoutInflater().inflate(R.layout.layout03ad, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.duration_15_min)).setText(r8.getString(R.string.str0c7e, new Object[]{15}));
        ((TextView) inflate.findViewById(R.id.duration_60_min)).setText(r8.getString(R.string.str0c7f, new Object[]{1}));
        ((TextView) inflate.findViewById(R.id.duration_480_min)).setText(r8.getString(R.string.str0c80, new Object[]{8}));
        r8.setContentView(inflate);
        if (!this.A1Q.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C16040sK r3 = this.A13;
            r3.A0B();
            if (r3.A00 != null) {
                Bundle bundle2 = bundle;
                if (bundle != null) {
                    this.A0h = (C35311li) bundle2.getParcelable("places");
                    this.A0v = bundle2.getBoolean("show_live_location_setting", false);
                    bundle2.remove("places");
                    this.A0p = bundle2.getBoolean("fullscreen", false);
                    this.A0y = bundle2.getBoolean("zoom_to_user", false);
                }
                this.A0a = C15830rv.A02(this.A0Y.getIntent().getStringExtra("jid"));
                this.A0r = this.A0Y.getIntent().getBooleanExtra("live_location_mode", false);
                this.A0w = this.A0Y.getIntent().getBooleanExtra("start_in_fullscreen_mode", false);
                Bundle extras = this.A0Y.getIntent().getExtras();
                if (extras != null && (extras.getSerializable("carry_forward_extras") instanceof Map)) {
                    this.A0m = (Map) extras.getSerializable("carry_forward_extras");
                }
                C14710pd r2 = this.A1K;
                C16620tM r13 = C16620tM.A02;
                boolean z2 = false;
                if ((!r2.A0E(r13, 1506) || (r03 = this.A0a) == null || (nullable2 = UserJid.getNullable(r03.getRawString())) == null || !new C32441gM(this.A17, nullable2).A02()) && ((!r2.A0E(r13, 2515) || (r02 = this.A0a) == null || (nullable = UserJid.getNullable(r02.getRawString())) == null || !((i2 = new C32441gM(this.A17, nullable).A01.hostStorage) == 2 || i2 == 1)) && ((!C16030sJ.A0M(this.A0a) || r2.A0E(r13, 2584)) && (r0 = this.A0a) != null && !C16030sJ.A0G(r0) && !r3.A0G()))) {
                    z2 = true;
                }
                this.A0o = z2;
                this.A0q = r2.A0E(r13, 2767);
                if (r8.getIntent() != null) {
                    this.A0x = r8.getIntent().getBooleanExtra("sticker_mode", false);
                }
                this.A0R = this.A0Y.findViewById(R.id.main);
                Toolbar toolbar = (Toolbar) r8.findViewById(R.id.toolbar);
                r8.Aem(toolbar);
                C005402i x2 = r8.x();
                x2.A0N(true);
                boolean z3 = this.A0x;
                int i3 = R.string.str14f3;
                if (z3) {
                    i3 = R.string.str14cc;
                }
                x2.A0B(i3);
                View findViewById = r8.findViewById(R.id.search_holder);
                findViewById.addOnLayoutChangeListener(new C94134kQ(findViewById, new C94344kl(this)));
                AnonymousClass013 r11 = this.A1E;
                this.A0Z = new AnonymousClass267(r8, findViewById, new IDxTListenerShape170S0100000_2_I0(this, 9), toolbar, r11);
                View findViewById2 = r8.findViewById(R.id.map_frame);
                this.A0L = findViewById2;
                if (findViewById2 != null) {
                    findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 19));
                }
                this.A0P = r8.findViewById(R.id.picker_list);
                this.A0Q = r8.findViewById(R.id.places_holder);
                this.A0E = r8.findViewById(R.id.map_center);
                View findViewById3 = r8.findViewById(R.id.map_center_pin);
                this.A0D = findViewById3;
                findViewById3.setContentDescription(r8.getString(R.string.str062c));
                this.A0C = r8.findViewById(R.id.map_center_filler);
                View A052 = AnonymousClass00T.A05(r8, R.id.map_center_info);
                this.A0B = A052;
                A052.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 36));
                View findViewById4 = this.A0Y.findViewById(R.id.send_my_location_btn);
                this.A0F = findViewById4;
                findViewById4.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 35));
                View findViewById5 = this.A0Y.findViewById(R.id.live_location_btn);
                this.A0H = findViewById5;
                int i4 = 0;
                if (r3.A0G()) {
                    i4 = 8;
                }
                findViewById5.setVisibility(i4);
                this.A0H.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 37));
                ImageView imageView = (ImageView) AnonymousClass00T.A05(r8, R.id.full_screen);
                this.A0S = imageView;
                imageView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 39));
                Handler handler = new Handler(Looper.getMainLooper());
                this.A08 = handler;
                RunnableRunnableShape10S0100000_I0_9 runnableRunnableShape10S0100000_I0_9 = new RunnableRunnableShape10S0100000_I0_9((Object) this, 24);
                this.A0k = runnableRunnableShape10S0100000_I0_9;
                if (this.A0h == null) {
                    handler.postDelayed(runnableRunnableShape10S0100000_I0_9, 15000);
                }
                File file = new File(r8.getCacheDir(), "Places");
                if (!file.mkdirs() && !file.isDirectory()) {
                    Log.w("LocationPickerUI/create unable to create places directory");
                }
                C38461qp r12 = new C38461qp(this.A12, this.A14, this.A1L, file, "location-picker");
                r12.A00 = this.A0Y.getResources().getDimensionPixelSize(R.dimen.dimen0502);
                this.A0i = r12.A00();
                this.A0T = (ImageView) this.A0Y.findViewById(R.id.my_location);
                this.A0O = this.A0Y.findViewById(R.id.permissions_request);
                this.A0M = this.A0Y.findViewById(R.id.no_nearby_places);
                this.A0I = this.A0Y.findViewById(R.id.live_location_setting);
                ProgressBar progressBar = (ProgressBar) AnonymousClass00T.A05(r8, R.id.progressbar_small);
                this.A0V = progressBar;
                int i5 = 8;
                if (this.A0h == null) {
                    i5 = 0;
                }
                progressBar.setVisibility(i5);
                this.A0W = (ProgressBar) r8.findViewById(R.id.progressbar_map);
                View inflate2 = View.inflate(this.A0Y, R.layout.layout03ae, (ViewGroup) null);
                TextView textView = (TextView) inflate2.findViewById(R.id.location_picker_attributions_textview);
                this.A0X = textView;
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                View inflate3 = View.inflate(this.A0Y, R.layout.layout03af, (ViewGroup) null);
                View findViewById6 = inflate3.findViewById(R.id.location_picker_loading_progress);
                this.A0N = findViewById6;
                findViewById6.setVisibility(8);
                this.A0f = new C56742oR(r8, this.A0i);
                this.A0U = (ListView) this.A0Y.findViewById(R.id.places_list);
                if (this.A0o) {
                    this.A0U.addHeaderView(this.A0Y.getLayoutInflater().inflate(R.layout.layout03a8, (ViewGroup) null), (Object) null, false);
                    View inflate4 = this.A0Y.getLayoutInflater().inflate(R.layout.layout03b3, (ViewGroup) null);
                    this.A0G = inflate4;
                    this.A0U.addHeaderView(inflate4, (Object) null, true);
                } else {
                    this.A0G = this.A0F;
                }
                this.A0U.setAdapter(this.A0f);
                this.A0U.setFooterDividersEnabled(true);
                this.A0U.addFooterView(inflate2, (Object) null, true);
                this.A0U.addFooterView(inflate3, (Object) null, false);
                A09();
                A0B();
                this.A0U.setOnItemClickListener(new C94684lJ(r8, this));
                C94804lV r4 = new C94804lV();
                ((RadioGroup) this.A0Y.findViewById(R.id.duration)).setOnCheckedChangeListener(r4);
                C000900k r28 = this.A0Y;
                C23061Ai r19 = this.A1T;
                C16300so r18 = this.A10;
                C15810rt r20 = this.A1F;
                C17250um r17 = this.A1I;
                AnonymousClass01V r1 = this.A19;
                AnonymousClass1BQ r15 = this.A1J;
                C15860rz r14 = this.A1D;
                C17020u3 r132 = this.A1R;
                C23061Ai r27 = r19;
                C000900k r142 = r28;
                this.A0b = new AnonymousClass2A5(r142, this.A0R, r18, r1, r14, r11, r20, this.A1H, r17, r15, r2, this.A0a, r132, r27);
                ImageView imageView2 = (ImageView) this.A0Y.findViewById(R.id.send);
                imageView2.setImageDrawable(new C447725m(AnonymousClass00T.A04(this.A0Y, R.drawable.input_send), r11));
                imageView2.setOnClickListener(new ViewOnClickCListenerShape0S0300000_I0(this, r8, r4, 3));
                View inflate5 = View.inflate(this.A0Y, R.layout.layout013c, (ViewGroup) null);
                r3.A0B();
                C28881Zb r42 = r3.A01;
                if (r42 != null && (bitmap = this.A18.A01(r8, r42, yo.setSQPC(this.A0Y.getResources().getDimension(R.dimen.dimen0748)), this.A0Y.getResources().getDimensionPixelSize(R.dimen.dimen074a))) == null) {
                    C17160ud r22 = this.A16;
                    bitmap = r22.A03(r8, r22.A01(r42));
                }
                ((ImageView) inflate5.findViewById(R.id.contact_photo)).setImageBitmap(bitmap);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                inflate5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = inflate5.getMeasuredWidth();
                int measuredHeight = inflate5.getMeasuredHeight();
                this.A05 = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                inflate5.layout(0, 0, measuredWidth, measuredHeight);
                inflate5.draw(new Canvas(this.A05));
                this.A0A = r8.findViewById(R.id.bottom_sheet);
                this.A0K = r8.findViewById(R.id.map_center_frame);
                View view = this.A0A;
                if (view != null) {
                    view.setVisibility(0);
                    this.A0c = new AnonymousClass4RF(r8.getResources(), this.A0A, new AnonymousClass4EQ(this));
                } else {
                    this.A0b.A07.setMaxLines(2);
                }
                View findViewById7 = r8.findViewById(R.id.live_location_sheet);
                this.A0J = findViewById7;
                if (findViewById7 != null) {
                    findViewById7.setVisibility(8);
                }
                if (bundle == null && this.A1C.A05() && (A0F2 = r1.A0F()) != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
                    AnonymousClass29T.A01(this.A0Y, 2);
                }
                HandlerThread handlerThread = new HandlerThread("GeoCode");
                this.A09 = handlerThread;
                handlerThread.start();
                this.A07 = new Handler(this.A09.getLooper());
                ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0 = new ViewOnClickCListenerShape0S0200000_I0(r8, 20, this);
                AnonymousClass00T.A05(r8, R.id.button_open_permission_settings).setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
                View findViewById8 = r8.findViewById(R.id.button_open_permission_settings_minimized);
                if (findViewById8 != null) {
                    findViewById8.setOnClickListener(viewOnClickCListenerShape0S0200000_I0);
                }
                if (this.A0w && bundle == null) {
                    A05();
                    return;
                }
                return;
            }
        }
        this.A0Y.finish();
    }

    public abstract void A0O(LatLngBounds latLngBounds, boolean z2);

    public final void A0P(PlaceInfo placeInfo) {
        C000900k r2;
        Intent intent;
        PlaceInfo placeInfo2 = placeInfo;
        if (!this.A1K.A0E(C16620tM.A02, 332) || !((SharedPreferences) this.A1D.A01.get()).getBoolean("nearby_location_new_user", true)) {
            if (this.A0x) {
                intent = new Intent();
                intent.putExtra("locations_string", placeInfo2.A06);
                PlaceInfo placeInfo3 = this.A1O;
                intent.putExtra("longitude", placeInfo3.A02);
                intent.putExtra("latitude", placeInfo3.A01);
                r2 = this.A0Y;
            } else {
                long longExtra = this.A0Y.getIntent().getLongExtra("quoted_message_row_id", 0);
                C16050sL A052 = C16050sL.A05(this.A0Y.getIntent().getStringExtra("quoted_group_jid"));
                C16740tZ r22 = null;
                if (longExtra > 0) {
                    r22 = this.A1G.A0K.A00(longExtra);
                } else if (A052 != null) {
                    r22 = C222617g.A00(A052, (String) null, (String) null, this.A1A.A00());
                }
                C15830rv r12 = this.A0a;
                if (r12 != null) {
                    C16760tb r8 = this.A15;
                    AnonymousClass00B.A06(r12);
                    boolean booleanExtra = this.A0Y.getIntent().getBooleanExtra("has_number_from_url", false);
                    C222617g r9 = r8.A1N;
                    C16440t3 r16 = r8.A0Q;
                    C38751rM r5 = new C38751rM(r9.A05.A02(r12, true), r16.A00());
                    r5.A0W(1);
                    r5.A00 = placeInfo2.A01;
                    r5.A01 = placeInfo2.A02;
                    r5.A01 = placeInfo2.A06;
                    r5.A00 = placeInfo2.A04;
                    r5.A02 = placeInfo2.A0A;
                    r9.A05(r5, r22);
                    if (booleanExtra) {
                        r5.A0S(4);
                    }
                    r8.A0M(r5);
                    C16460t6 r15 = r8.A0e;
                    r15.A0d(r5, 2);
                    C16320sq r14 = r8.A1Y;
                    C16300so r13 = r8.A01;
                    C17130ua r122 = r8.A08;
                    C19150xq r11 = r8.A0n;
                    C19950zG r10 = r8.A13;
                    C16260sj r92 = r8.A0S;
                    AnonymousClass16R r7 = r8.A02;
                    AnonymousClass16V r23 = r8.A0o;
                    C19430yQ r0 = r8.A14;
                    C16440t3 r20 = r16;
                    C16260sj r21 = r92;
                    AnonymousClass16R r18 = r7;
                    C17130ua r19 = r122;
                    AnonymousClass12E r162 = r8.A00;
                    C16300so r17 = r13;
                    r14.Ack(new AnonymousClass2K4(r162, r17, r18, r19, r20, r21, r15, r11, r23, r10, r0, r5), new Void[0]);
                }
                r2 = this.A0Y;
                intent = new Intent();
                Map map = this.A0m;
                if (map != null) {
                    intent.putExtra("carry_forward_extras", new HashMap(map));
                }
            }
            r2.setResult(-1, intent);
            this.A0Y.finish();
            return;
        }
        this.A0j = new RunnableRunnableShape8S0200000_I0_6(this, 10, placeInfo2);
        AnonymousClass29T.A01(this.A0Y, 4);
    }

    public final void A0Q(Float f2, int i2, boolean z2) {
        this.A0A.clearAnimation();
        A0K(A02(), f2, i2, z2);
        AnonymousClass4RF r4 = this.A0c;
        if (r4 == null) {
            return;
        }
        if (z2) {
            View view = r4.A01;
            AnonymousClass3NT r2 = new AnonymousClass3NT(view, r4, i2);
            r2.setDuration((long) ((int) (((float) i2) / r4.A00.getDisplayMetrics().density)));
            view.startAnimation(r2);
            return;
        }
        View view2 = r4.A01;
        view2.getLayoutParams().height = i2;
        view2.requestLayout();
        r4.A00((float) i2);
    }

    public void A0R(Float f2, boolean z2) {
        View view;
        if (A0Y()) {
            if (this.A0v) {
                if (this.A0Z.A06()) {
                    this.A0Z.A05(true);
                }
                this.A0p = false;
                this.A0S.setVisibility(8);
                this.A0Q.setVisibility(8);
            } else {
                C16260sj r3 = this.A1C;
                if (r3.A05()) {
                    A0X(true);
                }
                A0C();
                A0E();
                this.A0S.setVisibility(0);
                if (this.A0p) {
                    this.A0S.setImageResource(R.drawable.btn_map_fullscreen_off);
                    this.A0S.setContentDescription(this.A0Y.getString(R.string.str1620));
                    if (this.A0o) {
                        ImageView imageView = (ImageView) this.A0U.findViewById(R.id.send_current_location_icon);
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.ic_current_location);
                        }
                        TextView textView = (TextView) this.A0U.findViewById(R.id.send_current_location_text);
                        if (textView != null) {
                            textView.setText(R.string.str14fc);
                        }
                    }
                    TextView textView2 = (TextView) this.A0Y.findViewById(R.id.location_picker_current_location_text);
                    if (this.A0x && textView2 != null) {
                        textView2.setText(R.string.str14d6);
                    }
                    A0F();
                    this.A0X.setVisibility(8);
                    View view2 = this.A0A;
                    View view3 = this.A0Q;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        this.A0U.setAdapter((ListAdapter) null);
                        this.A0U.setOnScrollListener((AbsListView.OnScrollListener) null);
                        int height = this.A0o ? this.A0U.findViewById(R.id.nearby_places_header).getHeight() + this.A0U.findViewById(R.id.send_current_location_btn).getHeight() + this.A0H.getHeight() : this.A0F.getHeight();
                        this.A0P.getLayoutParams().height = height;
                        A0Q(f2, height, true);
                    } else {
                        view3.setVisibility(8);
                    }
                    PlaceInfo placeInfo = this.A0g;
                    if ((placeInfo == null || placeInfo.A0D == null) && (!this.A0Z.A06() || !C23061Ai.A00(this.A0R))) {
                        this.A0E.setVisibility(0);
                        this.A0Y.invalidateOptionsMenu();
                    }
                    view = this.A0E;
                    view.setVisibility(8);
                    this.A0Y.invalidateOptionsMenu();
                }
                if (this.A0o) {
                    ImageView imageView2 = (ImageView) this.A0U.findViewById(R.id.send_current_location_icon);
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.btn_send_current_location);
                    }
                    TextView textView3 = (TextView) this.A0U.findViewById(R.id.send_current_location_text);
                    if (textView3 != null) {
                        textView3.setText(R.string.str1502);
                    }
                    A0A();
                }
                TextView textView4 = (TextView) this.A0Y.findViewById(R.id.location_picker_current_location_text);
                if (this.A0x && textView4 != null) {
                    textView4.setText(R.string.str14d7);
                }
                this.A0S.setImageResource(R.drawable.btn_map_fullscreen_on);
                this.A0S.setContentDescription(this.A0Y.getString(R.string.str0b29));
                A0D();
                boolean A052 = r3.A05();
                View view4 = this.A0Q;
                if (A052) {
                    view4.setVisibility(0);
                } else {
                    view4.setVisibility(8);
                }
                A09();
                if (this.A0A != null) {
                    int i2 = this.A04;
                    if (C23061Ai.A00(this.A0R)) {
                        i2 >>= 1;
                    }
                    this.A0P.getLayoutParams().height = i2;
                    if (r3.A05()) {
                        A0Q(f2, i2, z2);
                    }
                    this.A0U.setAdapter(this.A0f);
                    A07();
                }
            }
            this.A0E.setVisibility(8);
            view = this.A0B;
            view.setVisibility(8);
            this.A0Y.invalidateOptionsMenu();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (r4.A05() != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(java.lang.Float r9, boolean r10) {
        /*
            r8 = this;
            X.0sj r4 = r8.A1C
            boolean r5 = r4.A05()
            X.0tz r0 = r8.A1B
            android.content.Context r1 = r0.A00
            X.0yQ r0 = r8.A1M
            com.obwhatsapp.location.LocationSharingService.A01(r1, r0)
            r1 = 1
            r3 = 0
            r2 = 8
            if (r5 != 0) goto L_0x001f
            boolean r0 = r8.A0q
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r4.A05()
            if (r0 != 0) goto L_0x00c4
        L_0x001f:
            android.widget.ImageView r0 = r8.A0T
            r0.setVisibility(r3)
            android.view.View r0 = r8.A0O
            r0.setVisibility(r2)
            boolean r0 = r8.A0v
            if (r0 == 0) goto L_0x009e
            android.view.View r0 = r8.A0F
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0Q
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0H
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0J
            if (r0 != 0) goto L_0x0045
            android.view.View r0 = r8.A0I
            r0.setVisibility(r3)
        L_0x0045:
            r7 = 0
            X.00k r1 = r8.A0Y
            r0 = 2131365290(0x7f0a0daa, float:1.8350441E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 4
            if (r1 == 0) goto L_0x0072
            r1.setVisibility(r0)
            android.view.View r0 = r8.A0L
            int r0 = r0.getMeasuredHeight()
            double r0 = (double) r0
            r5 = 4604119971053405471(0x3fe51eb851eb851f, double:0.66)
            double r0 = r0 * r5
            int r5 = (int) r0
            r8.A03 = r5
            android.view.View r0 = r8.A0O
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r8.A03
            r1.height = r0
            r8.A0Q(r7, r0, r3)
        L_0x0072:
            r8.A0R(r9, r10)
        L_0x0075:
            boolean r0 = r8.A0q
            if (r0 == 0) goto L_0x0080
            boolean r0 = r4.A05()
            r1 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            android.view.View r0 = r8.A0M
            if (r1 == 0) goto L_0x014e
            r0.setVisibility(r3)
            android.view.View r1 = r8.A0M
            r0 = 2131362945(0x7f0a0481, float:1.8345685E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x009d
            r1 = 38
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.setOnClickListener(r0)
        L_0x009d:
            return
        L_0x009e:
            android.view.View r0 = r8.A0Q
            r0.setVisibility(r3)
            boolean r1 = r8.A0o
            android.view.View r0 = r8.A0H
            if (r1 == 0) goto L_0x00bb
            r0.setVisibility(r3)
            android.view.View r0 = r8.A0F
            r0.setVisibility(r2)
        L_0x00b1:
            android.view.View r0 = r8.A0J
            if (r0 != 0) goto L_0x0045
            android.view.View r0 = r8.A0I
            r0.setVisibility(r2)
            goto L_0x0045
        L_0x00bb:
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0F
            r0.setVisibility(r3)
            goto L_0x00b1
        L_0x00c4:
            android.view.View r0 = r8.A0F
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0H
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0Q
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r8.A0T
            r0.setVisibility(r2)
            android.view.View r0 = r8.A0J
            if (r0 != 0) goto L_0x00e1
            android.view.View r0 = r8.A0I
            r0.setVisibility(r2)
        L_0x00e1:
            X.0rz r0 = r8.A1D
            r0.A1M(r1)
            r0.A1N(r1)
            X.00k r1 = r8.A0Y
            r0 = 2131365290(0x7f0a0daa, float:1.8350441E38)
            android.view.View r6 = r1.findViewById(r0)
            r5 = 4
            android.view.View r0 = r8.A0E
            r0.setVisibility(r2)
            boolean r0 = r8.A0p
            android.widget.ImageView r1 = r8.A0S
            if (r0 == 0) goto L_0x012b
            r0 = 2131230987(0x7f08010b, float:1.8078042E38)
            r1.setImageResource(r0)
            if (r6 == 0) goto L_0x0116
            r6.setVisibility(r3)
            int r0 = r6.getMeasuredHeight()
            if (r0 <= 0) goto L_0x011d
            int r0 = r6.getMeasuredHeight()
            r8.A0Q(r9, r0, r10)
        L_0x0116:
            android.view.View r0 = r8.A0O
            r0.setVisibility(r2)
            goto L_0x0075
        L_0x011d:
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            r1 = 2
            com.facebook.redex.IDxLListenerShape25S0300000_2_I0 r0 = new com.facebook.redex.IDxLListenerShape25S0300000_2_I0
            r0.<init>(r9, r6, r8, r1)
            r5.addOnGlobalLayoutListener(r0)
            goto L_0x0116
        L_0x012b:
            r0 = 2131230990(0x7f08010e, float:1.8078048E38)
            r1.setImageResource(r0)
            android.view.View r0 = r8.A0O
            r0.setVisibility(r3)
            if (r6 == 0) goto L_0x0075
            r6.setVisibility(r5)
            int r0 = r8.A03
            if (r0 <= 0) goto L_0x0075
            android.view.View r0 = r8.A0O
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r0 = r8.A03
            r1.height = r0
            r8.A0Q(r9, r0, r10)
            goto L_0x0075
        L_0x014e:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass29S.A0S(java.lang.Float, boolean):void");
    }

    public void A0T(Object obj) {
        Iterator it = this.A0h.A08.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A0D)) {
                this.A0g = placeInfo;
                break;
            }
        }
        A07();
    }

    public void A0U(String str, Object obj) {
        if (str != null) {
            Iterator it = this.A0h.A08.iterator();
            while (it.hasNext()) {
                PlaceInfo placeInfo = (PlaceInfo) it.next();
                if (obj.equals(placeInfo.A0D)) {
                    A0P(placeInfo);
                    return;
                }
            }
        }
    }

    public final void A0V(boolean z2) {
        C000900k r1;
        int i2;
        if (((SharedPreferences) this.A1D.A01.get()).getBoolean("live_location_is_new_user", true)) {
            r1 = this.A0Y;
            i2 = 3;
        } else {
            LocationManager A0F2 = this.A19.A0F();
            if (A0F2 != null && !A0F2.isProviderEnabled("gps") && !A0F2.isProviderEnabled("network")) {
                r1 = this.A0Y;
                i2 = 2;
            } else if (!this.A1C.A05()) {
                this.A0v = false;
                A0S((Float) null, false);
                return;
            } else {
                this.A0h = new C35311li();
                this.A0v = true;
                View view = this.A0A;
                if (view != null) {
                    if (this.A0c != null) {
                        view.clearAnimation();
                        AnonymousClass4RF r5 = this.A0c;
                        if (z2) {
                            View view2 = r5.A01;
                            if (view2.getVisibility() == 0) {
                                C64153Na r3 = new C64153Na(r5);
                                r3.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(r5, 13));
                                r3.setDuration(350);
                                r3.setInterpolator(new AccelerateInterpolator());
                                view2.startAnimation(r3);
                            }
                        }
                        r5.A01.setVisibility(8);
                        r5.A00(0.0f);
                    }
                    this.A0J.clearAnimation();
                    if (!z2 || this.A0J.getVisibility() == 0) {
                        this.A0J.setVisibility(0);
                        int height = this.A0J.getHeight();
                        View view3 = this.A0J;
                        if (height == 0) {
                            view3.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 5));
                            return;
                        }
                        A0H(view3.getHeight());
                        A0W(false);
                        A0R((Float) null, false);
                        return;
                    }
                    this.A0J.setVisibility(0);
                    A0R((Float) null, false);
                    C64173Nc r2 = new C64173Nc(this);
                    r2.setDuration(400);
                    r2.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 16));
                    r2.setInterpolator(new AccelerateInterpolator());
                    this.A0J.startAnimation(r2);
                    return;
                }
                A0W(true);
                A0S((Float) null, true);
                return;
            }
        }
        AnonymousClass29T.A01(r1, i2);
    }

    public abstract void A0W(boolean z2);

    public abstract void A0X(boolean z2);

    public abstract boolean A0Y();

    public boolean A0Z(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0Y.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0n = false;
            A0L(A02(), (String) null, A00(), false, true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (this.A0v) {
                this.A0b.A05.dismiss();
                A06();
                return true;
            }
            this.A0Y.finish();
            return true;
        }
    }

    public void onLocationChanged(Location location) {
        if (AnonymousClass1GE.A01(location, this.A06)) {
            boolean z2 = true;
            int max = location.hasAccuracy() ? Math.max(1, (int) location.getAccuracy()) : -1;
            if (max != this.A01) {
                this.A01 = max;
            }
            A0A();
            C35311li r0 = this.A0h;
            if (r0 == null || r0.A00() == null || !this.A0n || location.getAccuracy() >= 200.0f || this.A0h.A00().distanceTo(location) <= 1000.0f) {
                z2 = false;
            } else {
                this.A0n = false;
            }
            this.A06 = location;
            if (this.A0h != null && !z2) {
                return;
            }
            if ((location.getAccuracy() < 200.0f && location.getTime() + 60000 > System.currentTimeMillis()) || this.A0t) {
                this.A12.A0K(new RunnableRunnableShape0S0210000_I0(this, location, 15, z2));
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
