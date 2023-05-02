package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.IDxLObserverShape336S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape13S0300000_2_I0;
import com.facebook.redex.IDxSObserverShape275S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.location.ContactLiveLocationThumbnail;
import com.obwhatsapp.location.DragBottomSheetIndicator;
import com.obwhatsapp.location.GroupChatLiveLocationsUi$13;
import com.obwhatsapp.location.LocationSharingService;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.291  reason: invalid class name */
public abstract class AnonymousClass291 implements C18950xW, LocationListener, View.OnCreateContextMenuListener {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05;
    public float A06 = 0.0f;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C = AnonymousClass1NO.A0L;
    public long A0D;
    public Activity A0E;
    public BroadcastReceiver A0F = new IDxBReceiverShape7S0100000_2_I0(this, 13);
    public Bitmap A0G;
    public Bitmap A0H;
    public Drawable A0I;
    public Location A0J;
    public View A0K;
    public View A0L;
    public View A0M;
    public View A0N;
    public View A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public View A0U;
    public TextView A0V;
    public TextView A0W;
    public RecyclerView A0X;
    public RecyclerView A0Y;
    public BottomSheetBehavior A0Z;
    public BottomSheetBehavior A0a;
    public AnonymousClass2Ao A0b;
    public C15830rv A0c;
    public UserJid A0d;
    public ContactLiveLocationThumbnail A0e;
    public ContactLiveLocationThumbnail A0f;
    public DragBottomSheetIndicator A0g;
    public C455129c A0h;
    public C455129c A0i;
    public AnonymousClass4I5 A0j;
    public AnonymousClass29V A0k;
    public AnonymousClass29W A0l;
    public C39721sx A0m;
    public C39721sx A0n;
    public C39721sx A0o;
    public boolean A0p = false;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s = false;
    public boolean A0t = false;
    public boolean A0u = false;
    public final Handler A0v = new Handler(Looper.getMainLooper());
    public final C19980zJ A0w;
    public final AnonymousClass16R A0x;
    public final C14870pt A0y;
    public final C16040sK A0z;
    public final C16600tK A10;
    public final C204310c A11;
    public final C40781ug A12 = new IDxSObserverShape63S0100000_2_I0(this, 18);
    public final AnonymousClass127 A13;
    public final C17160ud A14;
    public final C16000sG A15;
    public final C33481ie A16 = new IDxCObserverShape68S0100000_2_I0(this, 20);
    public final C17140ub A17;
    public final C16080sP A18;
    public final C17200uh A19;
    public final AnonymousClass152 A1A;
    public final C16440t3 A1B;
    public final C16260sj A1C;
    public final AnonymousClass013 A1D;
    public final C18940xV A1E = new IDxMObserverShape74S0100000_2_I0(this, 8);
    public final C19150xq A1F;
    public final AnonymousClass1VD A1G = new IDxPObserverShape81S0100000_2_I0(this, 20);
    public final AnonymousClass18R A1H;
    public final C454728t A1I = new IDxSObserverShape275S0100000_2_I0(this, 3);
    public final AnonymousClass290 A1J = new IDxLObserverShape336S0100000_2_I0(this, 3);
    public final C19430yQ A1K;
    public final AnonymousClass1P7 A1L;
    public final C27471Rw A1M;
    public final Runnable A1N = new RunnableRunnableShape10S0100000_I0_9(this, 20);
    public final Runnable A1O = new RunnableRunnableShape10S0100000_I0_9(this, 17);
    public final Runnable A1P = new RunnableRunnableShape10S0100000_I0_9(this, 19);
    public final List A1Q = new ArrayList();
    public final List A1R = new ArrayList();
    public final List A1S = new ArrayList();
    public final Map A1T = new HashMap();
    public final Set A1U = new LinkedHashSet();
    public volatile boolean A1V;

    public AnonymousClass291(C19980zJ r5, AnonymousClass16R r6, C14870pt r7, C16040sK r8, C16600tK r9, C204310c r10, AnonymousClass127 r11, C17160ud r12, C16000sG r13, C17140ub r14, C16080sP r15, C17200uh r16, AnonymousClass152 r17, C16440t3 r18, C16260sj r19, AnonymousClass013 r20, C19150xq r21, AnonymousClass18R r22, C19430yQ r23, AnonymousClass1P7 r24, C27471Rw r25) {
        this.A1B = r18;
        this.A0y = r7;
        this.A0z = r8;
        this.A11 = r10;
        this.A0w = r5;
        this.A19 = r16;
        this.A1L = r24;
        this.A14 = r12;
        this.A15 = r13;
        this.A18 = r15;
        this.A1D = r20;
        this.A17 = r14;
        this.A1F = r21;
        this.A10 = r9;
        this.A13 = r11;
        this.A0x = r6;
        C16260sj r1 = r19;
        this.A1C = r1;
        this.A1K = r23;
        this.A0r = r1.A05();
        this.A1A = r17;
        this.A1H = r22;
        this.A1M = r25;
    }

    public static double A00(double d2) {
        double sin = Math.sin((d2 * 3.141592653589793d) / 180.0d);
        return Math.max(Math.min(Math.log((sin + 1.0d) / (1.0d - sin)) / 2.0d, 3.141592653589793d), -3.141592653589793d) / 2.0d;
    }

    public static final String A01(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C39721sx) it.next()).A06.getRawString());
        }
        Collections.sort(arrayList);
        return TextUtils.join("|", arrayList);
    }

    public static /* synthetic */ void A02(AnonymousClass291 r1, float f2, boolean z2) {
        r1.A06 = f2;
        r1.A0M(Math.max(r1.A04, f2), z2);
    }

    public static boolean A03(LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.A01;
        double d2 = latLng.A00;
        LatLng latLng2 = latLngBounds.A00;
        if (d2 - latLng2.A00 > 80.0d) {
            return false;
        }
        double d3 = latLng2.A01 - latLng.A01;
        if (d3 < 0.0d) {
            d3 += 360.0d;
        }
        return d3 <= 90.0d;
    }

    public Dialog A04(int i2) {
        if (i2 == 0) {
            C32241fu r3 = new C32241fu(this.A0E);
            r3.A01(R.string.str0c85);
            r3.A07(true);
            r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            r3.setPositiveButton(R.string.str0c83, new IDxCListenerShape127S0100000_2_I0(this, 74));
            C005702l create = r3.create();
            create.requestWindowFeature(1);
            return create;
        } else if (i2 != 2) {
            return null;
        } else {
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(this, 73);
            C32241fu r1 = new C32241fu(this.A0E);
            r1.A02(R.string.str0a05);
            r1.A01(R.string.str0a04);
            r1.A07(true);
            r1.setPositiveButton(R.string.str0e87, iDxCListenerShape127S0100000_2_I0);
            return r1.create();
        }
    }

    public Bitmap A05(AnonymousClass29W r19) {
        ContactLiveLocationThumbnail contactLiveLocationThumbnail;
        View view;
        List list;
        boolean z2;
        boolean z3;
        Activity activity;
        int i2;
        ArrayList arrayList = new ArrayList();
        AnonymousClass29W r11 = r19;
        int i3 = r11.A00;
        float f2 = 1.0f;
        if (i3 == 1) {
            contactLiveLocationThumbnail = this.A0f;
            view = this.A0Q;
            list = r11.A04;
            if (list.size() == 1) {
                C16010sH A0A2 = this.A15.A0A(((C39721sx) list.get(0)).A06);
                AnonymousClass152 r14 = this.A1A;
                Activity activity2 = this.A0E;
                Bitmap A012 = r14.A01(activity2, A0A2, this.A0E.getResources().getDimension(R.dimen.dimen04f3), activity2.getResources().getDimensionPixelSize(R.dimen.dimen04f4));
                if (A012 == null) {
                    C17160ud r2 = this.A14;
                    A012 = r2.A03(this.A0E, r2.A01(A0A2));
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList.add(A012);
            } else {
                for (int i4 = 0; i4 < Math.min(list.size(), 4); i4++) {
                    C16010sH A0A3 = this.A15.A0A(((C39721sx) list.get(i4)).A06);
                    AnonymousClass152 r3 = this.A1A;
                    Activity activity3 = this.A0E;
                    Bitmap A013 = r3.A01(activity3, A0A3, 0.0f, activity3.getResources().getDimensionPixelSize(R.dimen.dimen04f4));
                    if (A013 == null) {
                        A013 = this.A0H;
                    }
                    arrayList.add(A013);
                }
                z3 = false;
            }
        } else {
            contactLiveLocationThumbnail = this.A0e;
            view = this.A0K;
            list = r11.A04;
            if (list.size() == 1) {
                C16010sH A0A4 = this.A15.A0A(((C39721sx) list.get(0)).A06);
                AnonymousClass152 r142 = this.A1A;
                Activity activity4 = this.A0E;
                Bitmap A014 = r142.A01(activity4, A0A4, yo.setSQPC(this.A0E.getResources().getDimension(R.dimen.dimen0748)), activity4.getResources().getDimensionPixelSize(R.dimen.dimen074a));
                if (A014 == null) {
                    C17160ud r22 = this.A14;
                    A014 = r22.A03(this.A0E, r22.A01(A0A4));
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(A014);
            } else {
                for (int i5 = 0; i5 < Math.min(list.size(), 4); i5++) {
                    C16010sH A0A5 = this.A15.A0A(((C39721sx) list.get(i5)).A06);
                    AnonymousClass152 r32 = this.A1A;
                    Activity activity5 = this.A0E;
                    Bitmap A015 = r32.A01(activity5, A0A5, 0.0f, activity5.getResources().getDimensionPixelSize(R.dimen.dimen074a));
                    if (A015 == null) {
                        A015 = this.A0G;
                    }
                    arrayList.add(A015);
                }
                z2 = false;
            }
            if (i3 == 2) {
                f2 = 0.3f;
            }
        }
        contactLiveLocationThumbnail.setAlpha(f2);
        contactLiveLocationThumbnail.setImageBitmap(arrayList.size() == 1 ? (Bitmap) arrayList.get(0) : C17200uh.A01(arrayList, 0.0f));
        int i6 = r11.A01;
        if (i6 == 0) {
            activity = this.A0E;
            i2 = R.color.color051b;
            contactLiveLocationThumbnail.A01 = AnonymousClass00T.A00(activity, i2);
        } else if (i6 != 1) {
            contactLiveLocationThumbnail.A01 = 0;
        } else {
            activity = this.A0E;
            i2 = R.color.color051e;
            contactLiveLocationThumbnail.A01 = AnonymousClass00T.A00(activity, i2);
        }
        contactLiveLocationThumbnail.A03 = z3;
        contactLiveLocationThumbnail.A02 = list.size();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public LatLng A06() {
        double latitude;
        double longitude;
        if (this.A0d != null) {
            Iterator it = this.A1Q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C39721sx r5 = (C39721sx) it.next();
                if (r5 != null && r5.A05 > 0 && r5.A06.equals(this.A0d)) {
                    latitude = r5.A00;
                    longitude = r5.A01;
                    break;
                }
            }
        }
        Location A012 = this.A0x.A01("group-chat-live-location-ui");
        if (A012 == null) {
            return null;
        }
        latitude = A012.getLatitude();
        longitude = A012.getLongitude();
        return new LatLng(latitude, longitude);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass29W A07(com.google.android.gms.maps.model.LatLng r24) {
        /*
            r23 = this;
            r12 = r23
            X.29U r9 = r12.A09()
            r22 = 0
            if (r9 == 0) goto L_0x0127
            r0 = r24
            android.graphics.Point r4 = r9.A00(r0)
            int r2 = r4.x
            int r0 = r12.A0B
            int r0 = r0 >> 1
            int r2 = r2 - r0
            int r1 = r4.y
            int r0 = r12.A0A
            int r0 = r0 >> 1
            int r1 = r1 - r0
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r2, r1)
            int r2 = r4.x
            int r0 = r12.A0B
            int r0 = r0 >> 1
            int r2 = r2 + r0
            int r1 = r4.y
            int r0 = r12.A0A
            int r0 = r0 >> 1
            int r1 = r1 + r0
            android.graphics.Point r11 = new android.graphics.Point
            r11.<init>(r2, r1)
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            X.39T r10 = r9.A01
            if (r10 == 0) goto L_0x0110
            com.google.android.gms.maps.model.LatLng r8 = r10.A01(r3)
        L_0x0042:
            java.lang.String r15 = "point must not be null"
            X.C13710nw.A02(r8, r15)
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r2 = r8.A00
            double r13 = java.lang.Math.min(r0, r2)
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r0 = java.lang.Math.max(r0, r2)
            double r2 = r8.A01
            boolean r8 = java.lang.Double.isNaN(r6)
            if (r8 == 0) goto L_0x00f0
            r6 = r2
        L_0x005e:
            r4 = r2
        L_0x005f:
            if (r10 == 0) goto L_0x00d9
            com.google.android.gms.maps.model.LatLng r10 = r10.A01(r11)
        L_0x0065:
            X.C13710nw.A02(r10, r15)
            double r8 = r10.A00
            double r2 = java.lang.Math.min(r13, r8)
            double r0 = java.lang.Math.max(r0, r8)
            double r8 = r10.A01
            boolean r10 = java.lang.Double.isNaN(r6)
            if (r10 == 0) goto L_0x00b3
            r6 = r8
        L_0x007b:
            r4 = r8
        L_0x007c:
            boolean r8 = java.lang.Double.isNaN(r6)
            r9 = r8 ^ 1
            java.lang.String r8 = "no included points"
            X.C13710nw.A04(r8, r9)
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r2, r6)
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r0, r4)
            com.google.android.gms.maps.model.LatLngBounds r3 = new com.google.android.gms.maps.model.LatLngBounds
            r3.<init>(r8, r2)
            java.util.List r0 = r12.A1R
            java.util.Iterator r2 = r0.iterator()
        L_0x009c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r1 = r2.next()
            X.29W r1 = (X.AnonymousClass29W) r1
            com.google.android.gms.maps.model.LatLng r0 = r1.A00()
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x009c
            return r1
        L_0x00b3:
            int r11 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x00d2
            if (r10 > 0) goto L_0x00bf
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x007c
        L_0x00bf:
            double r15 = r6 - r8
            r10 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r15 = r15 + r10
            double r15 = r15 % r10
            double r13 = r8 - r4
            double r13 = r13 + r10
            double r13 = r13 % r10
            int r10 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x007b
            r6 = r8
            goto L_0x007c
        L_0x00d2:
            if (r10 <= 0) goto L_0x007c
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x00bf
            goto L_0x007c
        L_0x00d9:
            X.0Wn r8 = r9.A00
            int r2 = r11.x
            float r3 = (float) r2
            int r2 = r11.y
            float r2 = (float) r2
            X.020 r2 = r8.A05(r3, r2)
            double r8 = r2.A00
            double r2 = r2.A01
            com.google.android.gms.maps.model.LatLng r10 = new com.google.android.gms.maps.model.LatLng
            r10.<init>(r8, r2)
            goto L_0x0065
        L_0x00f0:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x005f
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x005f
            double r20 = r6 - r2
            r18 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r20 = r20 + r18
            double r20 = r20 % r18
            double r16 = r2 - r6
            double r16 = r16 + r18
            double r16 = r16 % r18
            int r8 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x005e
            r6 = r2
            goto L_0x005f
        L_0x0110:
            X.0Wn r2 = r9.A00
            int r0 = r3.x
            float r1 = (float) r0
            int r0 = r3.y
            float r0 = (float) r0
            X.020 r0 = r2.A05(r1, r0)
            double r2 = r0.A00
            double r0 = r0.A01
            com.google.android.gms.maps.model.LatLng r8 = new com.google.android.gms.maps.model.LatLng
            r8.<init>(r2, r0)
            goto L_0x0042
        L_0x0127:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass291.A07(com.google.android.gms.maps.model.LatLng):X.29W");
    }

    public AnonymousClass29W A08(C39721sx r6) {
        if (r6 == null) {
            return null;
        }
        for (AnonymousClass29W r3 : this.A1R) {
            List list = r3.A04;
            if (list.size() > 1 && list.contains(r6)) {
                return r3;
            }
        }
        return null;
    }

    public abstract AnonymousClass29U A09();

    public String A0A(AnonymousClass29W r14) {
        List<C39721sx> list = r14.A04;
        if (list.size() == 1 && this.A0z.A0I(((C39721sx) list.get(0)).A06)) {
            return this.A0E.getString(R.string.str1baa);
        }
        ArrayList arrayList = new ArrayList();
        for (C39721sx r0 : list) {
            arrayList.add(r0.A06);
        }
        AnonymousClass013 r5 = this.A1D;
        C16080sP r7 = this.A18;
        HashSet hashSet = new HashSet();
        return r5.A0J(new Object[]{r5.A0G(r7.A0M(hashSet, 3, -1, r7.A0U(arrayList, hashSet), true))}, R.plurals.plurals00ca, (long) arrayList.size());
    }

    public void A0B() {
        this.A0o = null;
        this.A0j = null;
        A0P((AnonymousClass29W) null);
        A0G();
        this.A0h.A01();
    }

    public void A0C() {
        this.A0b.A00();
        this.A17.A03(this.A16);
        this.A1F.A03(this.A1E);
        this.A13.A03(this.A12);
        this.A1H.A03(this.A1G);
    }

    public void A0D() {
        this.A10.A03(this);
        this.A0D = 0;
        Handler handler = this.A0v;
        handler.removeCallbacks(this.A1N);
        C27471Rw r5 = this.A1M;
        C15830rv r9 = this.A0c;
        C1046156d r4 = new C1046156d(r9);
        C17190ug r10 = r5.A01;
        String A022 = r10.A02();
        StringBuilder sb = new StringBuilder("LocationSubscriptionSendMethods/unsubscribe; iqId=");
        sb.append(A022);
        Log.i(sb.toString());
        C28371Vv r7 = new C28371Vv("unsubscribe", (C35081lL[]) null);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new C35081lL("id", A022));
        arrayList.add(new C35081lL("xmlns", "location"));
        arrayList.add(new C35081lL("type", "get"));
        arrayList.add(new C35081lL((Jid) r9, "to"));
        r10.A0A(new IDxRCallbackShape13S0300000_2_I0(r4, r4, r5, 3), new C28371Vv(r7, "iq", (C35081lL[]) arrayList.toArray(C27471Rw.A04)), A022, 83, 32000);
        handler.removeCallbacks(this.A1P);
        handler.removeCallbacks(this.A1O);
        this.A0x.A04(this);
        this.A0J = null;
        this.A0E.unregisterReceiver(this.A0F);
        C19430yQ r2 = this.A1K;
        r2.A0X.remove(this.A1J);
        r2.A0W.remove(this.A1I);
    }

    public void A0E() {
        AnonymousClass16R r6 = this.A0x;
        this.A0q = r6.A07();
        this.A0r = this.A1C.A05();
        Context applicationContext = this.A0E.getApplicationContext();
        C19430yQ r5 = this.A1K;
        LocationSharingService.A01(applicationContext, r5);
        if (this.A0m == null) {
            r5.A0U(this.A1I);
            AnonymousClass290 r2 = this.A1J;
            List list = r5.A0X;
            if (!list.contains(r2)) {
                list.add(r2);
            }
            C76683uW r4 = new C76683uW(this.A0c, this);
            Handler handler = this.A0v;
            Runnable runnable = this.A1N;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.A0C);
            this.A1M.A02(r4);
        }
        A0H();
        this.A0E.invalidateOptionsMenu();
        this.A0E.registerReceiver(this.A0F, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        if (r5.A0c(this.A0c)) {
            r6.A05(this, "group-chat-live-location-ui-onresume", 0.0f, 3, 5000, 1000);
        }
        this.A10.A02(this);
    }

    public final void A0F() {
        AnonymousClass013 r8 = this.A1D;
        List list = this.A1S;
        this.A0V.setText(r8.A0J(new Object[]{Integer.valueOf(list.size())}, R.plurals.plurals00cb, (long) list.size()));
        this.A0i.A01();
        if (this.A0R != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A0E.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min((int) (Math.min(4.5d, (double) list.size()) * ((double) this.A07)), displayMetrics.heightPixels >> 1);
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            bottomSheetBehavior.A0J = true;
            bottomSheetBehavior.A0M(5);
            int i2 = this.A0a.A0B;
            RecyclerView recyclerView = this.A0Y;
            if (i2 != 3) {
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, min));
                this.A0a.A0M(3);
            } else if (min != recyclerView.getHeight()) {
                this.A0Y.clearAnimation();
                AnonymousClass3NX r2 = new AnonymousClass3NX(this.A0Y, this, min);
                r2.setDuration((long) ((int) (((float) min) / this.A0E.getResources().getDisplayMetrics().density)));
                BottomSheetBehavior bottomSheetBehavior2 = this.A0Z;
                A0L((float) (bottomSheetBehavior2.A0M ? -1 : bottomSheetBehavior2.A09), false);
                this.A0Y.startAnimation(r2);
            }
        } else if (this.A0M.getTranslationY() != 0.0f) {
            this.A0M.clearAnimation();
            View view = this.A0M;
            view.setTranslationY((float) view.getHeight());
            C004601z.A0H(this.A0M).A07(0.0f);
        }
    }

    public final void A0G() {
        this.A1S.clear();
        this.A0i.A01();
        A0P((AnonymousClass29W) null);
        if (this.A0R != null) {
            this.A0Y.clearAnimation();
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            if (bottomSheetBehavior.A0B != 4) {
                bottomSheetBehavior.A0M(4);
                A0Y(true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A0a;
            if (bottomSheetBehavior2.A0B != 5) {
                bottomSheetBehavior2.A0M(5);
            } else {
                this.A06 = 0.0f;
                A0M(Math.max(this.A04, 0.0f), true);
            }
        } else {
            this.A0M.clearAnimation();
            C004601z.A0H(this.A0M).A07((float) this.A0M.getHeight());
        }
        A0K();
    }

    public final void A0H() {
        this.A0y.A0K(new RunnableRunnableShape10S0100000_I0_9(this, 18));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
            r10 = this;
            long r3 = r10.A0D
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            android.widget.TextView r1 = r10.A0W
            r0 = 0
            r1.setOnClickListener(r0)
            X.0yQ r1 = r10.A1K
            X.0rv r0 = r10.A0c
            boolean r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r10.A0r
            if (r0 != 0) goto L_0x006c
            android.widget.TextView r1 = r10.A0W
            r0 = 2131889268(0x7f120c74, float:1.9413195E38)
            r1.setText(r0)
            android.widget.TextView r2 = r10.A0W
            r1 = 14
        L_0x002a:
            com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2 r0 = new com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
        L_0x0032:
            android.view.View r0 = r10.A0T
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 == 0) goto L_0x004e
            android.view.View r0 = r10.A0T
            r0.setVisibility(r3)
            android.view.View r2 = r10.A0T
            android.app.Activity r1 = r10.A0E
            r0 = 2130771983(0x7f01000f, float:1.7147072E38)
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r2.startAnimation(r0)
        L_0x004e:
            java.util.List r0 = r10.A1Q
            int r1 = r0.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0058
            r3 = 1
        L_0x0058:
            com.obwhatsapp.location.DragBottomSheetIndicator r2 = r10.A0g
            if (r2 == 0) goto L_0x006b
            r1 = 8
            r0 = 8
            if (r3 == 0) goto L_0x0063
            r0 = 4
        L_0x0063:
            r2.setVisibility(r0)
            android.view.View r0 = r10.A0L
            r0.setVisibility(r1)
        L_0x006b:
            return
        L_0x006c:
            X.0rv r0 = r10.A0c
            boolean r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x0085
            boolean r0 = r10.A0q
            if (r0 != 0) goto L_0x0085
            android.widget.TextView r1 = r10.A0W
            r0 = 2131889268(0x7f120c74, float:1.9413195E38)
            r1.setText(r0)
            android.widget.TextView r2 = r10.A0W
            r1 = 15
            goto L_0x002a
        L_0x0085:
            java.util.Set r1 = r10.A1U
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ec
            monitor-enter(r1)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r0.<init>(r1)     // Catch:{ all -> 0x0143 }
            r1.clear()     // Catch:{ all -> 0x0143 }
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            int r9 = r0.size()
            r7 = 0
            r8 = 1
            if (r9 != r8) goto L_0x00d7
            X.0sG r1 = r10.A15
            java.lang.Object r0 = r0.get(r7)
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r1 = r1.A08(r0)
            if (r1 == 0) goto L_0x00d7
            X.0sP r0 = r10.A18
            java.lang.String r3 = r0.A0E(r1)
            android.widget.TextView r6 = r10.A0W
            android.app.Activity r2 = r10.A0E
            r1 = 2131889286(0x7f120c86, float:1.9413231E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r3
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x00c2:
            r6.setText(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 3000(0xbb8, double:1.482E-320)
            long r0 = r0 + r2
            r10.A0D = r0
            android.os.Handler r1 = r10.A0v
            java.lang.Runnable r0 = r10.A1P
            r1.postDelayed(r0, r2)
            goto L_0x0032
        L_0x00d7:
            android.widget.TextView r6 = r10.A0W
            X.013 r5 = r10.A1D
            r4 = 2131755212(0x7f1000cc, float:1.9141297E38)
            long r2 = (long) r9
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r7] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            goto L_0x00c2
        L_0x00ec:
            java.util.List r4 = r10.A1Q
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00fe
            android.widget.TextView r1 = r10.A0W
            r0 = 2131889272(0x7f120c78, float:1.9413203E38)
            r1.setText(r0)
            goto L_0x0032
        L_0x00fe:
            android.view.View r0 = r10.A0T
            int r0 = r0.getVisibility()
            r3 = 0
            if (r0 != 0) goto L_0x0124
            android.view.View r0 = r10.A0T
            r0.setVisibility(r3)
            android.app.Activity r1 = r10.A0E
            r0 = 2130771980(0x7f01000c, float:1.7147065E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r1 = 12
            com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0 r0 = new com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0
            r0.<init>(r10, r1)
            r2.setAnimationListener(r0)
            android.view.View r0 = r10.A0T
            r0.startAnimation(r2)
        L_0x0124:
            int r1 = r4.size()
            r0 = 2
            r2 = 0
            if (r1 <= r0) goto L_0x012d
            r2 = 1
        L_0x012d:
            com.obwhatsapp.location.DragBottomSheetIndicator r1 = r10.A0g
            if (r1 == 0) goto L_0x006b
            r0 = 8
            if (r2 == 0) goto L_0x0136
            r0 = 0
        L_0x0136:
            r1.setVisibility(r0)
            android.view.View r0 = r10.A0L
            if (r2 != 0) goto L_0x013f
            r3 = 8
        L_0x013f:
            r0.setVisibility(r3)
            return
        L_0x0143:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass291.A0I():void");
    }

    public abstract void A0J();

    public abstract void A0K();

    public final void A0L(float f2, boolean z2) {
        this.A04 = f2;
        if (this.A0g.getVisibility() != 8) {
            this.A04 -= this.A0E.getResources().getDisplayMetrics().density * 20.0f;
        }
        float f3 = this.A04;
        float max = Math.max(f3, this.A06);
        this.A0P.setTranslationY(-f3);
        A0M(max, z2);
    }

    public abstract void A0M(float f2, boolean z2);

    public void A0N(Activity activity, Bundle bundle) {
        this.A0E = activity;
        this.A05 = activity.getResources().getDimension(R.dimen.dimen0422);
        this.A07 = activity.getResources().getDimension(R.dimen.dimen04f5);
        this.A00 = activity.getResources().getDimension(R.dimen.dimen04ee);
        this.A08 = activity.getResources().getDimension(R.dimen.dimen07cb);
        this.A03 = activity.getResources().getDimension(R.dimen.dimen04f2);
        this.A01 = activity.getResources().getDimension(R.dimen.dimen04f0);
        this.A02 = activity.getResources().getDimension(R.dimen.dimen04f1);
        this.A0b = this.A19.A04(activity, "group-chat-live-locations-ui");
        C15830rv A022 = C15830rv.A02(activity.getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        this.A0c = A022;
        this.A0d = UserJid.getNullable(activity.getIntent().getStringExtra("target"));
        UserJid nullable = UserJid.getNullable(activity.getIntent().getStringExtra("final_location_jid"));
        long longExtra = activity.getIntent().getLongExtra("final_location_timestamp", 0);
        if (nullable != null && longExtra > 0) {
            C39721sx r5 = new C39721sx(nullable);
            this.A0m = r5;
            r5.A05 = longExtra;
            r5.A00 = activity.getIntent().getDoubleExtra("final_location_latitude", 0.0d);
            this.A0m.A01 = activity.getIntent().getDoubleExtra("final_location_longitude", 0.0d);
        }
        this.A0q = this.A0x.A07();
        A0X("group-chat-live-location-ui-oncreate");
        this.A0X = (RecyclerView) activity.findViewById(R.id.user_list);
        this.A0N = activity.findViewById(R.id.list_holder);
        this.A0g = (DragBottomSheetIndicator) activity.findViewById(R.id.drag_indicator);
        this.A0P = activity.findViewById(R.id.map_bottom);
        this.A0O = activity.findViewById(R.id.list_holder_shadow);
        View view = this.A0N;
        int i2 = 8;
        if (view != null) {
            view.setVisibility(8);
            this.A0O.setVisibility(8);
            this.A0g.setVisibility(8);
            this.A0Z = new GroupChatLiveLocationsUi$13(this);
            BottomSheetBehavior bottomSheetBehavior = this.A0Z;
            ((AnonymousClass0Bo) this.A0N.getLayoutParams()).A01(bottomSheetBehavior);
            bottomSheetBehavior.A0J = false;
            bottomSheetBehavior.A0E = new IDxSCallbackShape45S0100000_2_I0(this, 2);
            this.A0L = activity.findViewById(R.id.drag_indicator_click);
            ViewOnClickCListenerShape2S0100000_I0_2 viewOnClickCListenerShape2S0100000_I0_2 = new ViewOnClickCListenerShape2S0100000_I0_2(this, 16);
            this.A0g.setOnClickListener(viewOnClickCListenerShape2S0100000_I0_2);
            this.A0L.setOnClickListener(viewOnClickCListenerShape2S0100000_I0_2);
        }
        this.A0S = activity.findViewById(R.id.selected_list_title_holder);
        this.A0V = (TextView) activity.findViewById(R.id.selected_list_title);
        this.A0Y = (RecyclerView) activity.findViewById(R.id.selected_list);
        activity.findViewById(R.id.selected_cancel).setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 17));
        this.A0R = activity.findViewById(R.id.selected_list_holder);
        View findViewById = activity.findViewById(R.id.landscape_selected_list_holder);
        this.A0M = findViewById;
        View view2 = this.A0R;
        if (view2 != null) {
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(view2);
            this.A0a = A002;
            A002.A0E = new IDxSCallbackShape45S0100000_2_I0(this, 3);
            A002.A0N = true;
            A002.A0M(5);
        } else {
            findViewById.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 4));
        }
        this.A0I = AnonymousClass00T.A04(activity, R.drawable.live_location_list_divider);
        AnonymousClass3RB r2 = new AnonymousClass3RB(this);
        List<C39721sx> list = this.A1Q;
        this.A0h = new C455129c(this, list, false);
        this.A0X.setLayoutManager(new LinearLayoutManager());
        this.A0X.setAdapter(this.A0h);
        RecyclerView recyclerView = this.A0X;
        recyclerView.A0h = true;
        recyclerView.setOnCreateContextMenuListener(this);
        this.A0X.A0m(r2);
        List list2 = this.A1S;
        this.A0i = new C455129c(this, list2, true);
        this.A0Y.setLayoutManager(new LinearLayoutManager());
        this.A0Y.setAdapter(this.A0i);
        RecyclerView recyclerView2 = this.A0Y;
        recyclerView2.A0h = true;
        recyclerView2.A0m(r2);
        this.A0W = (TextView) activity.findViewById(R.id.status);
        this.A0T = activity.findViewById(R.id.status_panel);
        A0Y(true);
        this.A1F.A02(this.A1E);
        this.A17.A02(this.A16);
        this.A13.A02(this.A12);
        this.A1H.A02(this.A1G);
        View inflate = View.inflate(this.A0E, R.layout.layout013a, (ViewGroup) null);
        this.A0K = inflate;
        this.A0e = (ContactLiveLocationThumbnail) inflate.findViewById(R.id.contact_photo);
        this.A0G = C17160ud.A00(activity, 0.0f, R.drawable.avatar_contact, activity.getResources().getDimensionPixelSize(R.dimen.dimen074a));
        this.A0H = C17160ud.A00(activity, 0.0f, R.drawable.avatar_contact, activity.getResources().getDimensionPixelSize(R.dimen.dimen04f4));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.A0K.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0K.layout(0, 0, this.A0K.getMeasuredWidth(), this.A0K.getMeasuredHeight());
        View inflate2 = View.inflate(this.A0E, R.layout.layout013b, (ViewGroup) null);
        this.A0Q = inflate2;
        this.A0f = (ContactLiveLocationThumbnail) inflate2.findViewById(R.id.contact_photo);
        this.A0Q.measure(makeMeasureSpec, makeMeasureSpec);
        this.A0B = this.A0Q.getMeasuredWidth();
        int measuredHeight = this.A0Q.getMeasuredHeight();
        this.A0A = measuredHeight;
        this.A0Q.layout(0, 0, this.A0B, measuredHeight);
        if (bundle != null) {
            this.A0s = bundle.getBoolean("map_follow_user", false);
            this.A0u = bundle.getBoolean("map_touched", false);
            C15830rv A023 = C15830rv.A02(bundle.getString("selected_user_jid"));
            if (A023 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C39721sx r1 = (C39721sx) it.next();
                    if (r1.A06.equals(A023)) {
                        this.A0o = r1;
                        break;
                    }
                }
            }
            HashSet hashSet = new HashSet();
            C16030sJ.A0D(UserJid.class, bundle.getStringArrayList("selected_user_jids"), hashSet);
            if (!hashSet.isEmpty()) {
                for (C39721sx r12 : list) {
                    if (hashSet.contains(r12.A06)) {
                        list2.add(r12);
                    }
                }
                Collections.sort(list2, new AnonymousClass2A7(this.A0z, this.A15, this.A18));
                this.A0i.A01();
                A0F();
            }
        }
        View findViewById2 = activity.findViewById(R.id.zoom_out);
        this.A0U = findViewById2;
        findViewById2.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 18));
        View view3 = this.A0U;
        if (this.A0u && this.A0m == null) {
            i2 = 0;
        }
        view3.setVisibility(i2);
        this.A0k = new AnonymousClass29V(this.A1L, new AnonymousClass2A7(this.A0z, this.A15, this.A18), (float) this.A0B, (float) this.A0A);
        LocationSharingService.A01(activity.getApplicationContext(), this.A1K);
    }

    public void A0O(Bundle bundle) {
        bundle.putBoolean("map_follow_user", this.A0s);
        bundle.putBoolean("map_touched", this.A0u);
        C39721sx r0 = this.A0o;
        if (r0 != null) {
            bundle.putString("selected_user_jid", r0.A06.getRawString());
        }
        List<C39721sx> list = this.A1S;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C39721sx r02 : list) {
                arrayList.add(r02.A06.getRawString());
            }
            bundle.putStringArrayList("selected_user_jids", arrayList);
        }
    }

    public final void A0P(AnonymousClass29W r10) {
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass29W> list = this.A1R;
        synchronized (list) {
            if (r10 == null) {
                this.A0l = null;
                for (AnonymousClass29W r0 : list) {
                    arrayList.add(new AnonymousClass29W(this.A1L, r0.A04, 0));
                }
            } else {
                for (AnonymousClass29W r4 : list) {
                    if (r4 == r10) {
                        arrayList.add(new AnonymousClass29W(this.A1L, r4.A04, 1));
                        this.A0l = r4;
                    } else {
                        arrayList.add(new AnonymousClass29W(this.A1L, r4.A04, 2));
                    }
                }
            }
            list.clear();
            list.addAll(arrayList);
            this.A0t = false;
        }
    }

    public abstract void A0Q(AnonymousClass29W r1);

    public void A0R(AnonymousClass29W r6, boolean z2) {
        A0P(r6);
        List list = r6.A04;
        if (list.size() == 1) {
            A0T((C39721sx) list.get(0));
            return;
        }
        this.A0o = null;
        List list2 = this.A1S;
        list2.clear();
        list2.addAll(list);
        Collections.sort(list2, new AnonymousClass2A7(this.A0z, this.A15, this.A18));
        this.A0i.A01();
        A0F();
        if (z2) {
            A0H();
        }
    }

    public void A0S(AnonymousClass29U r12) {
        List<C39721sx> list;
        AnonymousClass29W r1;
        AnonymousClass29V r5 = this.A0k;
        C39721sx r0 = this.A0m;
        if (r0 != null) {
            list = Collections.singletonList(r0);
        } else {
            long A002 = this.A1B.A00();
            ArrayList arrayList = new ArrayList();
            for (C39721sx r4 : this.A1Q) {
                if (r4 != null && (r4.A05 + 86400000 > A002 || this.A0z.A0I(r4.A06))) {
                    arrayList.add(r4);
                }
            }
            list = arrayList;
        }
        C39721sx r42 = this.A0o;
        List list2 = this.A1S;
        ArrayList arrayList2 = new ArrayList();
        for (C39721sx r9 : list) {
            arrayList2.add(new AnonymousClass01Q(r9, r12.A00(new LatLng(r9.A00, r9.A01))));
        }
        Collections.sort(arrayList2, new IDxComparatorShape19S0000000_2_I0(28));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        int i2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            AnonymousClass01Q r6 = (AnonymousClass01Q) it.next();
            if (r6.A00 != r42) {
                float f2 = ((float) i2) + r5.A00;
                int i3 = ((Point) r6.A01).x;
                if (f2 < ((float) i3)) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(r6);
                    arrayList3.add(arrayList4);
                    i2 = i3;
                } else {
                    ((List) arrayList3.get(arrayList3.size() - 1)).add(r6);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            List<AnonymousClass01Q> list3 = (List) it2.next();
            Collections.sort(list3, new IDxComparatorShape19S0000000_2_I0(27));
            int i4 = Integer.MIN_VALUE;
            for (AnonymousClass01Q r13 : list3) {
                Object obj = r13.A00;
                if (obj != r42) {
                    float f3 = ((float) i4) + r5.A01;
                    int i5 = ((Point) r13.A01).y;
                    if (f3 < ((float) i5)) {
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(obj);
                        arrayList5.add(arrayList6);
                        i4 = i5;
                    } else {
                        ((List) arrayList5.get(arrayList5.size() - 1)).add(obj);
                    }
                }
            }
        }
        if (r42 != null) {
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(r42);
            arrayList5.add(arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            List list4 = (List) it3.next();
            Collections.sort(list4, r5.A03);
            arrayList8.add(new AnonymousClass29W(r5.A02, list4, 0));
        }
        List<AnonymousClass29W> list5 = this.A1R;
        synchronized (list5) {
            list5.clear();
            list5.addAll(arrayList8);
            int i6 = 0;
            int i7 = 1;
            if (this.A0m != null) {
                list5.clear();
                C39721sx r14 = this.A0m;
                if (this.A0o != null) {
                    i6 = 1;
                }
                list5.add(new AnonymousClass29W(r14, i6));
            } else if (!list2.isEmpty()) {
                AnonymousClass29W r43 = null;
                for (AnonymousClass29W r2 : list5) {
                    List list6 = r2.A04;
                    ArrayList arrayList9 = new ArrayList(list2);
                    arrayList9.retainAll(list6);
                    if (arrayList9.size() > i7) {
                        i7 = arrayList9.size();
                        r43 = r2;
                    }
                }
                if (r43 != null) {
                    A0R(r43, false);
                } else {
                    A0B();
                }
            } else {
                C39721sx r3 = this.A0o;
                if (r3 != null) {
                    Iterator it4 = list5.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            r1 = null;
                            break;
                        }
                        r1 = (AnonymousClass29W) it4.next();
                        if (r1.A02 == r3) {
                            break;
                        }
                    }
                    A0P(r1);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(X.C39721sx r4) {
        /*
            r3 = this;
            r0 = 0
            r3.A0o = r0
            r3.A0G()
            if (r4 == 0) goto L_0x002f
            java.util.List r0 = r3.A1R
            java.util.Iterator r2 = r0.iterator()
        L_0x000e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r2.next()
            X.29W r1 = (X.AnonymousClass29W) r1
            X.1sx r0 = r1.A02
            if (r0 != r4) goto L_0x000e
        L_0x001e:
            r3.A0P(r1)
            r3.A0o = r4
            r3.A0V(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A0Z
            if (r1 == 0) goto L_0x002e
            r0 = 4
            r1.A0M(r0)
        L_0x002e:
            return
        L_0x002f:
            r1 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass291.A0T(X.1sx):void");
    }

    public final void A0U(C39721sx r5) {
        Map map = this.A1T;
        synchronized (map) {
            map.put(r5.A06, r5);
        }
        this.A0v.postDelayed(this.A1O, 3000);
    }

    public abstract void A0V(C39721sx r1);

    public void A0W(Float f2) {
        AnonymousClass4I5 r5 = this.A0j;
        if (r5 == null) {
            return;
        }
        if (f2 == null || ((double) Math.abs(r5.A00 - f2.floatValue())) <= 0.05d) {
            String A012 = A01(r5.A01);
            this.A0j = null;
            for (AnonymousClass29W r1 : this.A1R) {
                if (A012.equals(A01(r1.A04))) {
                    A0R(r1, false);
                    return;
                }
            }
        }
    }

    public final void A0X(String str) {
        ArrayList arrayList;
        C39721sx r0;
        if (this.A0m != null) {
            List list = this.A1Q;
            list.clear();
            list.add(this.A0m);
        } else {
            List list2 = this.A1Q;
            list2.clear();
            C19430yQ r8 = this.A1K;
            C15830rv r1 = this.A0c;
            synchronized (r8.A0R) {
                Map map = (Map) r8.A09().get(r1);
                long A002 = r8.A0G.A00();
                arrayList = new ArrayList();
                if (map != null) {
                    for (AnonymousClass28x r5 : map.values()) {
                        if (C19430yQ.A01(r5.A00, A002) && (r0 = (C39721sx) r8.A0c.get(r5.A01)) != null) {
                            arrayList.add(r0);
                        }
                    }
                }
            }
            list2.addAll(arrayList);
            if (r8.A0c(this.A0c)) {
                if (this.A0n == null) {
                    C16040sK r02 = this.A0z;
                    r02.A0B();
                    C28881Zb r03 = r02.A01;
                    AnonymousClass00B.A06(r03);
                    UserJid userJid = (UserJid) r03.A0E;
                    AnonymousClass00B.A06(userJid);
                    this.A0n = new C39721sx(userJid);
                    AnonymousClass16R r10 = this.A0x;
                    String str2 = str;
                    Location A012 = r10.A01(str2);
                    if (A012 != null) {
                        this.A0n.A00 = A012.getLatitude();
                        this.A0n.A01 = A012.getLongitude();
                        this.A0n.A05 = A012.getTime();
                        this.A0n.A02 = A012.getSpeed();
                        this.A0n.A03 = (int) A012.getAccuracy();
                        this.A0n.A04 = (int) A012.getBearing();
                    }
                    r10.A05(this, str2, 0.0f, 3, 5000, 1000);
                }
                list2.add(0, this.A0n);
                return;
            }
        }
        this.A0n = null;
        this.A0J = null;
        this.A0x.A04(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r15.A09 <= 2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r0 == 4) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(boolean r16) {
        /*
            r15 = this;
            java.util.List r8 = r15.A1Q
            int r2 = r8.size()
            android.view.View r0 = r15.A0N
            if (r0 == 0) goto L_0x0010
            if (r16 != 0) goto L_0x0011
            int r0 = r15.A09
            if (r2 != r0) goto L_0x0011
        L_0x0010:
            return
        L_0x0011:
            r5 = 2
            float r6 = (float) r2
            if (r2 <= r5) goto L_0x0017
            r6 = 1069547520(0x3fc00000, float:1.5)
        L_0x0017:
            r14 = 1
            r4 = 0
            r13 = 0
            if (r2 <= r5) goto L_0x001d
            r13 = 1
        L_0x001d:
            float r3 = r15.A03
            r9 = 0
            if (r13 == 0) goto L_0x00f6
            float r1 = r15.A00
        L_0x0024:
            float r1 = r1 + r3
            X.1sx r0 = r15.A0n
            if (r0 != 0) goto L_0x00f3
            X.1sx r0 = r15.A0m
            if (r0 != 0) goto L_0x00f3
            float r0 = r15.A08
            float r0 = r0 + r3
        L_0x0030:
            float r1 = r1 + r0
            int r1 = (int) r1
            float r0 = r15.A05
            float r6 = r6 * r0
            float r7 = (float) r1
            float r6 = r6 + r7
            int r6 = (int) r6
            r12 = 0
            if (r2 == 0) goto L_0x00ef
            r12 = 1
            if (r2 <= r5) goto L_0x00ef
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.app.Activity r0 = r15.A0E
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r3 = r1.heightPixels
            android.app.Activity r0 = r15.A0E
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131166477(0x7f07050d, float:1.79472E38)
            float r1 = r1.getDimension(r0)
            int r3 = r3 / r5
            float r0 = (float) r3
            float r3 = java.lang.Math.min(r1, r0)
            float r1 = r15.A05
            int r0 = r8.size()
            float r0 = (float) r0
            float r1 = r1 * r0
            float r1 = r1 + r7
            float r0 = java.lang.Math.min(r1, r3)
            int r3 = (int) r0
            r11 = 0
            int r0 = r15.A09
            if (r0 > r5) goto L_0x00f1
        L_0x0078:
            int r0 = r3 - r6
            float r7 = (float) r0
            android.view.View r0 = r15.A0T
            int r10 = r0.getVisibility()
            r5 = 4
            r8 = 8
            com.obwhatsapp.location.DragBottomSheetIndicator r1 = r15.A0g
            r0 = 8
            if (r10 != 0) goto L_0x00de
            if (r13 == 0) goto L_0x008d
            r0 = 4
        L_0x008d:
            r1.setVisibility(r0)
            android.view.View r0 = r15.A0L
            r0.setVisibility(r8)
        L_0x0095:
            android.view.View r0 = r15.A0N
            if (r12 == 0) goto L_0x00d2
            r0.setVisibility(r4)
            android.view.View r0 = r15.A0O
            r0.setVisibility(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r15.A0Z
            r0.A0L(r6)
            if (r14 == 0) goto L_0x00be
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r15.A0Z
            r0.A0M(r5)
        L_0x00ad:
            float r0 = (float) r6
        L_0x00ae:
            r15.A0L(r0, r4)
        L_0x00b1:
            android.view.View r0 = r15.A0N
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.height = r3
        L_0x00bb:
            r15.A09 = r2
            return
        L_0x00be:
            r1 = 3
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r15.A0Z
            if (r11 == 0) goto L_0x00c9
            r0.A0M(r1)
            float r0 = (float) r6
            float r0 = r0 + r7
            goto L_0x00ae
        L_0x00c9:
            int r0 = r0.A0B
            if (r0 != r1) goto L_0x00cf
            float r0 = (float) r3
            goto L_0x00ae
        L_0x00cf:
            if (r0 != r5) goto L_0x00b1
            goto L_0x00ad
        L_0x00d2:
            r0.setVisibility(r8)
            android.view.View r0 = r15.A0O
            r0.setVisibility(r8)
            r15.A0L(r9, r4)
            goto L_0x00bb
        L_0x00de:
            if (r13 == 0) goto L_0x00e1
            r0 = 0
        L_0x00e1:
            r1.setVisibility(r0)
            android.view.View r1 = r15.A0L
            r0 = 8
            if (r13 == 0) goto L_0x00eb
            r0 = 0
        L_0x00eb:
            r1.setVisibility(r0)
            goto L_0x0095
        L_0x00ef:
            r3 = r6
            r11 = 1
        L_0x00f1:
            r14 = 0
            goto L_0x0078
        L_0x00f3:
            r0 = 0
            goto L_0x0030
        L_0x00f6:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass291.A0Y(boolean):void");
    }

    public boolean A0Z(int i2, int i3) {
        Activity activity = this.A0E;
        if (activity != null) {
            LocationSharingService.A01(activity.getApplicationContext(), this.A1K);
        }
        if (i2 == 34) {
            if (i3 != -1) {
                return false;
            }
            this.A1L.A06(this.A0E, this.A0c);
        } else if (i2 != 100) {
            return false;
        } else {
            if (i3 == 1000) {
                C19980zJ r3 = this.A0w;
                Activity activity2 = this.A0E;
                r3.A07(activity2, new C14750ph().A0x(activity2, this.A0c));
                this.A0E.finish();
                return true;
            }
        }
        return true;
    }

    public void ARy() {
        C76683uW r4 = new C76683uW(this.A0c, this);
        Handler handler = this.A0v;
        Runnable runnable = this.A1N;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, this.A0C);
        this.A1M.A02(r4);
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public /* synthetic */ void AS1() {
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
    }

    public void onLocationChanged(Location location) {
        if (AnonymousClass1GE.A01(location, this.A0J)) {
            this.A0J = location;
            C39721sx r2 = this.A0n;
            if (r2 != null) {
                r2.A00 = location.getLatitude();
                this.A0n.A01 = location.getLongitude();
                this.A0n.A05 = location.getTime();
                this.A0n.A02 = location.getSpeed();
                this.A0n.A03 = (int) location.getAccuracy();
                this.A0n.A04 = (int) location.getBearing();
                this.A0h.A01();
                if (this.A0p) {
                    this.A0p = false;
                } else {
                    A0U(this.A0n);
                    return;
                }
            } else if (!this.A1K.A0c(this.A0c)) {
                return;
            }
            A0H();
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
