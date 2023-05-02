package com.obwhatsapp.contact.picker;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass050;
import X.AnonymousClass05J;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass127;
import X.AnonymousClass151;
import X.AnonymousClass156;
import X.AnonymousClass18R;
import X.AnonymousClass19Y;
import X.AnonymousClass1A9;
import X.AnonymousClass1BI;
import X.AnonymousClass1BJ;
import X.AnonymousClass1BU;
import X.AnonymousClass1BZ;
import X.AnonymousClass1G1;
import X.AnonymousClass1L1;
import X.AnonymousClass1L3;
import X.AnonymousClass1L4;
import X.AnonymousClass1MX;
import X.AnonymousClass1ND;
import X.AnonymousClass1PD;
import X.AnonymousClass1QZ;
import X.AnonymousClass1VD;
import X.AnonymousClass1XI;
import X.AnonymousClass1ZD;
import X.AnonymousClass1ZR;
import X.AnonymousClass1ZW;
import X.AnonymousClass1yL;
import X.AnonymousClass267;
import X.AnonymousClass29T;
import X.AnonymousClass2Ao;
import X.AnonymousClass2JO;
import X.AnonymousClass2Sy;
import X.AnonymousClass2XJ;
import X.AnonymousClass35s;
import X.AnonymousClass368;
import X.AnonymousClass37G;
import X.AnonymousClass37T;
import X.AnonymousClass38E;
import X.AnonymousClass38N;
import X.AnonymousClass3A2;
import X.AnonymousClass3BB;
import X.AnonymousClass3DM;
import X.AnonymousClass3MF;
import X.AnonymousClass4NB;
import X.AnonymousClass4QT;
import X.AnonymousClass54G;
import X.C001000l;
import X.C001300o;
import X.C004601z;
import X.C006602z;
import X.C009804r;
import X.C101354xB;
import X.C14550pN;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16220sf;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16510tB;
import X.C16620tM;
import X.C16760tb;
import X.C16820th;
import X.C16900tq;
import X.C17020u3;
import X.C17030uP;
import X.C17130ua;
import X.C17140ub;
import X.C17180uf;
import X.C17190ug;
import X.C17200uh;
import X.C17210ui;
import X.C17220uj;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C17750va;
import X.C17800vf;
import X.C17960vv;
import X.C17970vw;
import X.C17980vx;
import X.C18010w0;
import X.C18030w2;
import X.C18160wF;
import X.C18260wP;
import X.C18290wS;
import X.C19230xz;
import X.C19600yh;
import X.C19740yv;
import X.C19820z3;
import X.C19980zJ;
import X.C20260zl;
import X.C206210w;
import X.C217915l;
import X.C220316j;
import X.C220516l;
import X.C224618a;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C24561Gk;
import X.C24901Hs;
import X.C25501Ka;
import X.C25681Ks;
import X.C25781Lc;
import X.C25791Ld;
import X.C26001Ly;
import X.C26021Ma;
import X.C26081Mg;
import X.C26091Mh;
import X.C26101Mi;
import X.C30931dC;
import X.C32241fu;
import X.C33421iY;
import X.C33481ie;
import X.C35541m6;
import X.C40631uR;
import X.C40651uT;
import X.C40781ug;
import X.C447725m;
import X.C45902Bo;
import X.C45922Bq;
import X.C49182Rm;
import X.C49352Sp;
import X.C50272Yr;
import X.C51282bN;
import X.C51292bO;
import X.C52142dD;
import X.C57102q8;
import X.C60052zs;
import X.C607035a;
import X.C614639a;
import X.C73623oY;
import X.C74153pw;
import X.C79093zB;
import X.C82234Ca;
import X.C85944Qp;
import X.C93464jF;
import X.C93514jK;
import X.C99874uj;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape269S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.obwhatsapp.IDxTSpanShape53S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment;
import com.obwhatsapp.contentprovider.MediaProvider;
import com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactPickerFragment extends Hilt_ContactPickerFragment {
    public static boolean A2z;
    public byte A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public MenuItem A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ViewGroup A0D;
    public ImageView A0E;
    public ImageView A0F;
    public ListView A0G;
    public ProgressBar A0H;
    public C009804r A0I;
    public AnonymousClass05J A0J;
    public C23101Am A0K;
    public C19980zJ A0L;
    public AnonymousClass1G1 A0M;
    public C49352Sp A0N;
    public C82234Ca A0O;
    public C14870pt A0P;
    public C16040sK A0Q;
    public AnonymousClass267 A0R;
    public AnonymousClass10X A0S;
    public C15900s5 A0T;
    public C17130ua A0U;
    public AnonymousClass1BJ A0V;
    public TextEmojiLabel A0W;
    public C16760tb A0X;
    public C19740yv A0Y;
    public WaTextView A0Z;
    public AnonymousClass01Y A0a;
    public C25501Ka A0b;
    public C17180uf A0c;
    public C17210ui A0d;
    public C18010w0 A0e;
    public C40781ug A0f;
    public AnonymousClass127 A0g;
    public AnonymousClass1L3 A0h;
    public AnonymousClass1L4 A0i;
    public C17750va A0j;
    public C18260wP A0k;
    public AnonymousClass19Y A0l;
    public C16000sG A0m;
    public C33481ie A0n;
    public C17140ub A0o;
    public AnonymousClass156 A0p;
    public C17030uP A0q;
    public C16080sP A0r;
    public AnonymousClass2Ao A0s;
    public C17200uh A0t;
    public AnonymousClass37T A0u;
    public AnonymousClass35s A0v;
    public C49182Rm A0w;
    public C99874uj A0x;
    public AnonymousClass368 A0y;
    public C79093zB A0z;
    public AnonymousClass37G A10;
    public AnonymousClass38N A11;
    public C93464jF A12;
    public AnonymousClass1BI A13;
    public C220516l A14;
    public C206210w A15;
    public C23181Au A16;
    public C19230xz A17;
    public C33421iY A18;
    public C220316j A19;
    public C19600yh A1A;
    public AnonymousClass1BZ A1B;
    public C15800rs A1C;
    public AnonymousClass01V A1D;
    public C16440t3 A1E;
    public C16260sj A1F;
    public C15860rz A1G;
    public AnonymousClass013 A1H;
    public CountryGatingViewModel A1I;
    public C19820z3 A1J;
    public C85944Qp A1K;
    public AnonymousClass3BB A1L;
    public C26021Ma A1M;
    public C24901Hs A1N;
    public C26001Ly A1O;
    public C15810rt A1P;
    public AnonymousClass151 A1Q;
    public C16070sO A1R;
    public C16900tq A1S;
    public C26081Mg A1T;
    public C35541m6 A1U;
    public AnonymousClass11G A1V;
    public C16010sH A1W;
    public C26091Mh A1X;
    public AnonymousClass1ND A1Y;
    public AnonymousClass1MX A1Z;
    public C224618a A1a;
    public C17250um A1b;
    public C26101Mi A1c;
    public C14710pd A1d;
    public C20260zl A1e;
    public C16490t9 A1f;
    public C17240ul A1g;
    public AnonymousClass1VD A1h;
    public AnonymousClass18R A1i;
    public C50272Yr A1j;
    public C217915l A1k;
    public C15830rv A1l;
    public C17960vv A1m;
    public C17190ug A1n;
    public C17800vf A1o;
    public C18290wS A1p;
    public C17020u3 A1q;
    public C16220sf A1r;
    public C25781Lc A1s;
    public AnonymousClass1BU A1t;
    public C17980vx A1u;
    public AnonymousClass1L1 A1v;
    public C17220uj A1w;
    public ToSGatingViewModel A1x;
    public AnonymousClass1PD A1y;
    public C25681Ks A1z;
    public AnonymousClass4QT A20;
    public C18160wF A21;
    public C16510tB A22;
    public AnonymousClass1A9 A23;
    public C16320sq A24;
    public C23201Aw A25;
    public AnonymousClass1QZ A26;
    public AnonymousClass01D A27;
    public Long A28;
    public String A29;
    public String A2A;
    public String A2B;
    public String A2C;
    public String A2D;
    public String A2E;
    public String A2F;
    public String A2G;
    public String A2H;
    public String A2I;
    public ArrayList A2J;
    public ArrayList A2K;
    public ArrayList A2L;
    public List A2M;
    public List A2N;
    public List A2O;
    public List A2P;
    public List A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W;
    public boolean A2X;
    public boolean A2Y;
    public boolean A2Z;
    public boolean A2a;
    public boolean A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;
    public boolean A2q;
    public final Handler A2r = new Handler(Looper.getMainLooper());
    public final C14750ph A2s = new C14750ph();
    public final Runnable A2t;
    public final HashSet A2u;
    public final List A2v = new ArrayList();
    public final Map A2w = new LinkedHashMap();
    public final Set A2x;
    public final Set A2y;

    public ContactPickerFragment() {
        HashSet hashSet = new HashSet();
        this.A2x = hashSet;
        yo.HCoN(hashSet);
        this.A2U = false;
        this.A2F = "";
        this.A1L = new C614639a().A01();
        this.A2u = new HashSet();
        this.A2M = new ArrayList();
        this.A2Q = new ArrayList();
        this.A2N = new ArrayList();
        this.A2O = new ArrayList();
        HashSet hashSet2 = new HashSet();
        this.A2y = hashSet2;
        this.A2t = new RunnableRunnableShape1S0100000_I0((Object) hashSet2, 28);
    }

    public static Bundle A01(Intent intent) {
        Bundle bundle = new Bundle();
        if (intent.getExtras() != null) {
            bundle.putAll(intent.getExtras());
            bundle.remove("perf_origin");
            bundle.remove("perf_start_time_ns");
            bundle.remove("key_perf_tracked");
        }
        if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
            bundle.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", intent.getAction());
        bundle2.putString("type", intent.getType());
        bundle2.putBundle("extras", bundle);
        return bundle2;
    }

    public static /* synthetic */ void A02(ContactPickerFragment contactPickerFragment) {
        Log.i("contactpicker/notifyAdapter");
        contactPickerFragment.A0w.notifyDataSetChanged();
    }

    public static /* synthetic */ void A03(ContactPickerFragment contactPickerFragment) {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList(1);
        C15830rv r0 = contactPickerFragment.A1W.A0E;
        AnonymousClass00B.A06(r0);
        arrayList.add(r0.getRawString());
        intent.putStringArrayListExtra("jids", arrayList);
        intent.putExtra("file_path", contactPickerFragment.A1C().getString("file_path"));
        contactPickerFragment.A0x.A01(intent);
        AnonymousClass29T.A00(contactPickerFragment.A0C(), 2);
        contactPickerFragment.A20.A00(false, 1);
        contactPickerFragment.A0x.A00();
    }

    public static /* synthetic */ void A04(ContactPickerFragment contactPickerFragment) {
        Intent intent = new Intent();
        C15830rv r0 = contactPickerFragment.A1W.A0E;
        AnonymousClass00B.A06(r0);
        intent.putExtra("contact", r0.getRawString());
        intent.putExtra("message_row_id", contactPickerFragment.A1C().getLong("message_row_id"));
        contactPickerFragment.A0x.A01(intent);
        AnonymousClass29T.A00(contactPickerFragment.A0C(), 3);
        contactPickerFragment.A0x.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cd, code lost:
        if (A1C().getBoolean("request_out_contact_sync", false) == false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0n(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 1
            r9.A0V = r0
            java.lang.String r0 = "contactpicker/onactivitycreated"
            X.1Zf r2 = new X.1Zf
            r2.<init>((java.lang.String) r0)
            X.0uh r3 = r9.A0t
            android.content.Context r1 = r9.A0u()
            java.lang.String r0 = "contact-picker-fragment"
            X.2Ao r0 = r3.A04(r1, r0)
            r9.A0s = r0
            android.view.View r1 = r9.A0A
            r0 = 2131363529(0x7f0a06c9, float:1.834687E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r9.A0Z = r0
            android.view.View r1 = r9.A0A
            r0 = 2131364124(0x7f0a091c, float:1.8348076E38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r9.A0H = r0
            android.view.View r1 = r9.A0A
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r7 = r1.findViewById(r0)
            androidx.appcompat.widget.Toolbar r7 = (androidx.appcompat.widget.Toolbar) r7
            X.0sK r0 = r9.A0Q
            r0.A0B()
            X.1Zb r0 = r0.A01
            if (r0 == 0) goto L_0x005a
            X.0rv r0 = r0.A0E
            if (r0 == 0) goto L_0x005a
            java.lang.String r1 = X.C24561Gk.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = X.C39851tA.A02(r1)
            r9.A29 = r0
        L_0x005a:
            X.4uj r0 = r9.A0x
            X.1ZA r0 = r0.A00
            r0.Aem(r7)
            X.00l r4 = r9.A0C()
            X.013 r8 = r9.A1H
            android.view.View r1 = r9.A0A
            r0 = 2131365943(0x7f0a1037, float:1.8351766E38)
            android.view.View r5 = r1.findViewById(r0)
            r0 = 5
            com.facebook.redex.IDxTListenerShape170S0100000_2_I0 r6 = new com.facebook.redex.IDxTListenerShape170S0100000_2_I0
            r6.<init>(r9, r0)
            X.267 r3 = new X.267
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A0R = r3
            X.0pd r3 = r9.A1d
            r1 = 1663(0x67f, float:2.33E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x008e
            X.267 r1 = r9.A0R
            r0 = 1
            r1.A04 = r0
        L_0x008e:
            X.4uj r0 = r9.A0x
            X.1ZA r0 = r0.A00
            X.02i r1 = r0.x()
            r4 = 1
            r1.A0N(r4)
            r0 = 2131893142(0x7f121b96, float:1.9421052E38)
            r1.A0B(r0)
            X.4uj r3 = r9.A0x
            X.0yh r0 = r9.A1A
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0U
            boolean r1 = r0.get()
            X.1ZA r0 = r3.A00
            r0.A1b(r1)
            java.lang.String r3 = "request_sync"
            r1 = 0
            if (r10 == 0) goto L_0x014b
            boolean r0 = r10.containsKey(r3)
            if (r0 == 0) goto L_0x014b
            boolean r0 = r10.getBoolean(r3, r1)
        L_0x00be:
            r9.A2c = r0
            if (r10 != 0) goto L_0x00cf
            android.os.Bundle r3 = r9.A1C()
            java.lang.String r0 = "request_out_contact_sync"
            boolean r3 = r3.getBoolean(r0, r1)
            r0 = 1
            if (r3 != 0) goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r9.A2b = r0
            X.0tq r0 = r9.A1S
            r0.A04()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0147
            A2z = r4
            X.4uj r0 = r9.A0x
            X.1ZA r0 = r0.A00
            X.2RY r0 = r0.A00
            X.12W r3 = r0.A07
            X.1g2 r0 = r0.A06
            boolean r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x00f6
            X.4uj r0 = r9.A0x
            X.1ZA r0 = r0.A00
            X.2RY r0 = r0.A00
            r0.A02()
        L_0x00f6:
            java.util.Map r0 = r9.A2w
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0110
            boolean r0 = r9.A2q
            if (r0 != 0) goto L_0x0136
            boolean r0 = r9.A2i
            if (r0 != 0) goto L_0x0136
            boolean r0 = r9.A2o
            if (r0 != 0) goto L_0x0136
            r9.A1L()
            r9.A1U()
        L_0x0110:
            boolean r0 = r9.A2q
            if (r0 != 0) goto L_0x011c
            boolean r0 = r9.A2i
            if (r0 != 0) goto L_0x011c
            boolean r0 = r9.A2o
            if (r0 == 0) goto L_0x012b
        L_0x011c:
            X.0vx r0 = r9.A1u
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x012b
            X.1L1 r1 = r9.A1v
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0A(r0)
        L_0x012b:
            if (r10 == 0) goto L_0x0132
            X.267 r0 = r9.A0R
            r0.A03(r10)
        L_0x0132:
            r2.A01()
            return
        L_0x0136:
            android.view.View r0 = r9.A09
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r9.A0E
            r0.setVisibility(r1)
            r9.A1Q()
            r9.A1R()
            goto L_0x0110
        L_0x0147:
            r9.A1K()
            goto L_0x00f6
        L_0x014b:
            android.os.Bundle r0 = r9.A1C()
            boolean r0 = r0.getBoolean(r3, r1)
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A0n(android.os.Bundle):void");
    }

    public boolean A0p(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        ListView listView = this.A0G;
        if (listView == null) {
            listView = (ListView) this.A0A.findViewById(16908298);
            others.MainBKC(listView);
            this.A0G = listView;
        }
        C16010sH AAn = ((AnonymousClass2XJ) listView.getItemAtPosition(adapterContextMenuInfo.position)).AAn();
        if (AAn == null || menuItem.getItemId() != 0) {
            return false;
        }
        AnonymousClass01Y r2 = this.A0a;
        C001000l A0C2 = A0C();
        Jid A082 = AAn.A08(UserJid.class);
        AnonymousClass00B.A06(A082);
        r2.A0K(A0C2, (UserJid) A082);
        return true;
    }

    public void A0s(Bundle bundle) {
        Jid A082;
        bundle.putBoolean("request_sync", this.A2c);
        C16010sH r1 = this.A1W;
        if (!(r1 == null || (A082 = r1.A08(C15830rv.class)) == null)) {
            bundle.putString("jid", A082.getRawString());
        }
        Map map = this.A2w;
        if (!map.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C16030sJ.A06(map.keySet()));
        }
        bundle.putParcelable("status_distribution", this.A1U);
        this.A0R.A04(bundle);
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.A1z.A00();
                    if (Build.VERSION.SDK_INT >= 30) {
                        A1P();
                    }
                } else if (i2 != 151) {
                    super.A0x(i2, i3, intent);
                } else if (i3 == -1) {
                    A1e((C16010sH) null);
                }
            } else if (i3 == -1) {
                this.A0x.A00();
            }
        } else if (this.A1V.A0G()) {
            View view = this.A0B;
            if (view != null) {
                view.setVisibility(8);
                this.A0B = null;
            }
            A1Q();
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search);
        this.A05 = icon;
        icon.setShowAsAction(10);
        this.A05.setOnActionExpandListener(new IDxEListenerShape269S0100000_2_I0(this, 1));
        this.A05.setVisible(!this.A2M.isEmpty());
        if (A1m()) {
            menu.add(0, R.id.menuitem_tell_friend, 0, R.string.str1798);
            if (!this.A0Q.A0G()) {
                menu.add(0, R.id.menuitem_contacts, 0, R.string.str0cfd);
                menu.add(0, R.id.menuitem_refresh, 0, R.string.str0d09);
            }
            menu.add(0, R.id.menuitem_contacts_help, 0, R.string.str1d95);
        }
    }

    public boolean A10(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_refresh) {
            this.A0x.A00.A1b(true);
            A1P();
        } else if (itemId == R.id.menuitem_contacts) {
            PackageManager packageManager = A0u().getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", ContactsContract.Contacts.CONTENT_URI);
            intent.setComponent(intent.resolveActivity(packageManager));
            if (intent.getComponent() != null) {
                A0r(intent);
                return true;
            }
            try {
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.android.contacts");
                if (launchIntentForPackage == null) {
                    this.A0P.A09(R.string.str19d7, 0);
                    return true;
                }
                A0r(launchIntentForPackage);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.w("contact_picker/options/system contacts app could not found", e2);
                this.A0P.A09(R.string.str19d7, 0);
                return true;
            }
        } else if (itemId == R.id.menuitem_tell_friend) {
            AnonymousClass1BJ r3 = this.A0V;
            C001000l A0C2 = A0C();
            int i2 = 4;
            if (this.A2e) {
                i2 = 7;
            }
            r3.A01(A0C2, Integer.valueOf(i2));
            return true;
        } else if (itemId == R.id.menuitem_search) {
            this.A0R.A02();
            return true;
        } else if (itemId == R.id.menuitem_contacts_help) {
            A1S();
            return true;
        } else if (itemId == 16908332) {
            this.A0x.A00();
            return true;
        }
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z2 = this.A2W;
        int i2 = R.layout.layout013e;
        if (z2) {
            i2 = R.layout.layout0403;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        this.A0A = inflate;
        boolean z3 = this.A2W;
        int i3 = R.id.send_old;
        if (z3) {
            i3 = R.id.send;
        }
        ImageView imageView = (ImageView) inflate.findViewById(i3);
        this.A0E = imageView;
        imageView.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.input_send), this.A1H));
        this.A0E.setOnClickListener(new C607035a(this));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A0A.findViewById(R.id.recipients);
        yo.ChangeSize(textEmojiLabel, 0);
        this.A0W = textEmojiLabel;
        this.A0D = (ViewGroup) C004601z.A0E(this.A0A, R.id.footer_container);
        View A0E2 = C004601z.A0E(this.A0A, R.id.recipients_container);
        this.A09 = A0E2;
        if (!this.A2W) {
            ((ImageView) A0E2.findViewById(R.id.recipients_chevron)).setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.chevron_right), this.A1H));
        }
        this.A0F = this.A2W ? (ImageView) C004601z.A0E(this.A0A, R.id.status_icon) : null;
        this.A2Z = this.A2W;
        boolean z4 = A1C().getBoolean("status_chip_clicked", false);
        if (this.A2Z && bundle == null) {
            C35541m6 A002 = this.A1t.A00(A1C());
            if (A002 != null) {
                this.A1U = A002;
            }
            if (z4) {
                A1M();
            }
        }
        return this.A0A;
    }

    public void A12() {
        super.A12();
        C33481ie r1 = this.A0n;
        if (r1 != null) {
            this.A0o.A03(r1);
            this.A0n = null;
        }
        C40781ug r12 = this.A0f;
        if (r12 != null) {
            this.A0g.A03(r12);
            this.A0f = null;
        }
        C33421iY r13 = this.A18;
        if (r13 != null) {
            this.A19.A03(r13);
            this.A18 = null;
        }
        AnonymousClass1VD r14 = this.A1h;
        if (r14 != null) {
            this.A1i.A03(r14);
            this.A1h = null;
        }
        this.A0s.A00();
        AnonymousClass368 r0 = this.A0y;
        if (r0 != null) {
            r0.A06(true);
            this.A0y = null;
        }
        AnonymousClass35s r02 = this.A0v;
        if (r02 != null) {
            r02.A06(true);
            this.A0v = null;
        }
        AnonymousClass37T r03 = this.A0u;
        if (r03 != null) {
            r03.A06(true);
            this.A0u = null;
        }
        C79093zB r04 = this.A0z;
        if (r04 != null) {
            r04.A06(true);
            this.A0z = null;
        }
    }

    public void A14() {
        super.A14();
        if (!A2z) {
            Log.i("contactpicker/notifyAdapter");
            this.A0w.notifyDataSetChanged();
            A2z = false;
        }
    }

    public void A16(Context context) {
        super.A16(context);
        try {
            this.A0x = ((AnonymousClass1ZD) context).ACf();
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context);
            sb.append(" must implement ContactPickerFragment$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        AnonymousClass01F r3 = (AnonymousClass01F) AnonymousClass01I.A00(A02(), AnonymousClass01F.class);
        this.A1x = (ToSGatingViewModel) new C006602z(this).A01(ToSGatingViewModel.class);
        this.A1I = (CountryGatingViewModel) new C006602z(this).A01(CountryGatingViewModel.class);
        this.A2W = this.A1d.A0E(C16620tM.A01, 815);
        if (bundle != null) {
            C15830rv A022 = C15830rv.A02(bundle.getString("jid"));
            if (A022 != null) {
                this.A1W = this.A0m.A0A(A022);
            }
            ArrayList<String> stringArrayList = bundle.getStringArrayList("selected_jids");
            if (stringArrayList != null) {
                List<C15830rv> A082 = C16030sJ.A08(C15830rv.class, stringArrayList);
                if (!A082.isEmpty()) {
                    Map map = this.A2w;
                    map.clear();
                    for (C15830rv r1 : A082) {
                        C16010sH A083 = this.A0m.A08(r1);
                        if (A083 != null) {
                            map.put(r1, A083);
                        }
                    }
                }
            }
            if (this.A2W) {
                Parcelable parcelable = bundle.getParcelable("status_distribution");
                AnonymousClass00B.A06(parcelable);
                this.A1U = (C35541m6) parcelable;
            }
        }
        A0a(true);
        this.A2X = this.A1d.A0E(C16620tM.A02, 1283);
        this.A27 = C17270uo.A00(((C16150sX) r3).A5z);
        if (this.A1U == null) {
            this.A1U = new C35541m6(this.A1V.A08(), this.A1V.A09(), this.A1V.A02(), false);
        }
    }

    public Dialog A1B(int i2) {
        C32241fu r3;
        int i3;
        C001000l A0C2 = A0C();
        int i4 = i2;
        if (i4 != 1) {
            if (i4 == 2) {
                boolean A0J2 = this.A1W.A0J();
                int i5 = R.string.str0520;
                if (A0J2) {
                    i5 = R.string.str0a49;
                }
                String A0K2 = A0K(i5, this.A0r.A08(this.A1W));
                r3 = new C32241fu(A0u());
                r3.A06(AnonymousClass2Sy.A05(A0C2, this.A1b, A0K2));
                r3.A07(true);
                r3.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 54));
                r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 53));
                i3 = 7;
            } else if (i4 != 3) {
                return null;
            } else {
                String A0K3 = A0K(R.string.str0a4d, this.A0r.A08(this.A1W));
                r3 = new C32241fu(A0u());
                r3.A06(AnonymousClass2Sy.A05(A0C2, this.A1b, A0K3));
                r3.A07(true);
                r3.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 52));
                r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 49));
                i3 = 8;
            }
            r3.A03(new IDxCListenerShape161S0100000_2_I0(this, i3));
            return r3.create();
        }
        Map map = this.A2w;
        C16010sH r11 = this.A1W;
        C16080sP r10 = this.A0r;
        ArrayList arrayList = this.A2K;
        C17250um r12 = this.A1b;
        return AnonymousClass38E.A00(A0C2, new IDxCListenerShape161S0100000_2_I0(this, 6), new IDxCListenerShape127S0100000_2_I0(this, 50), new IDxCListenerShape127S0100000_2_I0(this, 51), r10, r11, r12, arrayList, map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle A1C() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.A05
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "extras"
            android.os.Bundle r2 = r1.getBundle(r0)
            r1 = 1
            if (r2 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "extras should not be null (it should be an empty bundle if there are nothing)"
            X.AnonymousClass00B.A0B(r0, r1)
            if (r2 != 0) goto L_0x001a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x001a:
            return r2
        L_0x001b:
            r2 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1C():android.os.Bundle");
    }

    public final View A1D(View.OnClickListener onClickListener, int i2, int i3, int i4, int i5) {
        View inflate = A05().inflate(R.layout.layout0144, (ViewGroup) null, false);
        AnonymousClass3A2.A01(inflate, i2, i3, i4, i5);
        inflate.setOnClickListener(onClickListener);
        FrameLayout frameLayout = new FrameLayout(A0u());
        frameLayout.addView(inflate);
        this.A2v.add(inflate);
        C004601z.A0d(frameLayout, 2);
        return frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0056, code lost:
        if (r12.A2S != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0076, code lost:
        if (r12.A1I.A02.A0E(X.C16620tM.A02, 1105) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass37T A1E() {
        /*
            r55 = this;
            r12 = r55
            java.lang.String r0 = r12.A2B
            r54 = r0
            java.util.ArrayList r0 = r12.A2J
            r33 = r0
            java.util.List r0 = r12.A2M
            r34 = r0
            java.util.List r0 = r12.A2Q
            r35 = r0
            java.util.List r0 = r12.A2N
            r31 = r0
            java.util.List r0 = r12.A2O
            r30 = r0
            java.util.HashSet r0 = r12.A2u
            r28 = r0
            X.0rv r0 = r12.A1l
            r29 = r0
            java.util.Set r0 = r12.A2x
            r27 = r0
            boolean r0 = r12.A2g
            r26 = r0
            boolean r0 = r12.A2q
            r25 = r0
            boolean r0 = r12.A2f
            r24 = r0
            boolean r0 = r12.A2i
            r23 = r0
            boolean r0 = r12.A2p
            r22 = r0
            boolean r0 = r12.A2e
            r21 = r0
            boolean r0 = r12.A2h
            r20 = r0
            boolean r0 = r12.A2l
            r19 = r0
            boolean r0 = r12.A2o
            r18 = r0
            boolean r0 = r12.A2j
            r17 = r0
            int r0 = r12.A02
            if (r0 > 0) goto L_0x0058
            boolean r0 = r12.A2S
            r50 = 0
            if (r0 == 0) goto L_0x005a
        L_0x0058:
            r50 = 1
        L_0x005a:
            boolean r15 = r12.A2a
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r12.A1x
            X.0pd r1 = r0.A05
            X.135 r0 = r0.A08
            boolean r0 = X.C41871wn.A01(r1, r0)
            if (r0 != 0) goto L_0x0078
            com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r12.A1I
            X.0pd r2 = r0.A02
            r1 = 1105(0x451, float:1.548E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r52 = 0
            if (r0 == 0) goto L_0x007a
        L_0x0078:
            r52 = 1
        L_0x007a:
            X.0pd r14 = r12.A1d
            X.0sK r13 = r12.A0Q
            X.0rt r11 = r12.A1P
            X.0sG r10 = r12.A0m
            X.0sP r9 = r12.A0r
            X.013 r8 = r12.A1H
            X.0sf r7 = r12.A1r
            X.0uP r6 = r12.A0q
            X.0rs r5 = r12.A1C
            boolean r4 = r12.A2k
            int r3 = r12.A01
            X.4jF r2 = r12.A12
            X.0zl r1 = r12.A1e
            X.1Mi r0 = r12.A1c
            X.2zr r16 = new X.2zr
            r32 = r28
            r36 = r31
            r37 = r30
            r38 = r27
            r39 = r3
            r40 = r26
            r41 = r25
            r42 = r24
            r43 = r23
            r44 = r22
            r45 = r21
            r46 = r20
            r47 = r19
            r48 = r18
            r49 = r17
            r51 = r15
            r53 = r4
            r17 = r13
            r18 = r10
            r19 = r6
            r20 = r9
            r21 = r12
            r22 = r2
            r23 = r5
            r24 = r8
            r25 = r11
            r26 = r0
            r27 = r14
            r28 = r1
            r30 = r7
            r31 = r54
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1E():X.37T");
    }

    public AnonymousClass35s A1F() {
        HashSet hashSet = this.A2u;
        C15830rv r24 = this.A1l;
        boolean z2 = this.A2g;
        boolean z3 = this.A2d;
        boolean z4 = this.A2q;
        boolean z5 = this.A2f;
        boolean z6 = this.A2i;
        boolean z7 = this.A2p;
        boolean z8 = this.A2e;
        boolean z9 = this.A2h;
        boolean z10 = this.A2l;
        boolean z11 = this.A2o;
        boolean z12 = this.A2n;
        boolean z13 = this.A2S;
        C14710pd r6 = this.A1d;
        C16000sG r5 = this.A0m;
        C18290wS r4 = this.A1p;
        AnonymousClass01Y r3 = this.A0a;
        C19740yv r2 = this.A0Y;
        C18290wS r25 = r4;
        HashSet hashSet2 = hashSet;
        boolean z14 = z2;
        boolean z15 = z3;
        boolean z16 = z4;
        boolean z17 = z5;
        boolean z18 = z6;
        return new C60052zs(r2, r3, r5, this, this.A1Q, this.A1R, r6, r24, r25, hashSet2, z14, z15, z16, z17, z18, z7, z8, z9, z10, z11, z12, z13);
    }

    public String A1G(C16010sH r2) {
        return null;
    }

    public String A1H(C16010sH r2) {
        return null;
    }

    public final List A1I() {
        Map map = this.A2w;
        ArrayList arrayList = new ArrayList(map.size());
        for (C16010sH A082 : map.values()) {
            arrayList.add(A082.A08(C15830rv.class));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        if (r14.A1d.A0E(X.C16620tM.A02, 691) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0059, code lost:
        if (r14.A2o != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1J() {
        /*
            r14 = this;
            r8 = r14
            android.view.View r1 = r14.A0A
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = X.C004601z.A0E(r1, r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            com.obwhatsapp.youbasha.others.MainBKC(r0)
            r14.A0G = r0
            r1 = 1
            r0.setScrollbarFadingEnabled(r1)
            android.widget.ListView r3 = r14.A0G
            android.view.View r2 = r14.A0A
            r0 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r0 = r2.findViewById(r0)
            r3.setEmptyView(r0)
            r7 = 0
            r14.A1W(r7)
            android.view.View r2 = r14.A0A
            r0 = 2131362927(0x7f0a046f, float:1.8345648E38)
            android.view.View r2 = X.C004601z.A0E(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L_0x004e
            android.content.Context r0 = r14.A0u()
            com.obwhatsapp.EmptyTellAFriendView r3 = new com.obwhatsapp.EmptyTellAFriendView
            r3.<init>(r0)
            r2.addView(r3)
            r2 = 21
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r0 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r0.<init>(r14, r2)
            r3.setInviteButtonClickListener(r0)
        L_0x004e:
            boolean r0 = r14.A2q
            if (r0 != 0) goto L_0x005b
            boolean r0 = r14.A2i
            if (r0 != 0) goto L_0x005b
            boolean r0 = r14.A2o
            r3 = 1
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            android.widget.ListView r0 = r14.A0G
            if (r0 == 0) goto L_0x0072
            r0.setFastScrollEnabled(r3)
            android.widget.ListView r0 = r14.A0G
            r0.setFastScrollAlwaysVisible(r3)
            android.widget.ListView r2 = r14.A0G
            r0 = 0
            if (r3 == 0) goto L_0x006f
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x006f:
            r2.setScrollBarStyle(r0)
        L_0x0072:
            android.content.res.Resources r2 = r14.A03()
            r0 = 2131165692(0x7f0701fc, float:1.7945608E38)
            int r4 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r2 = r14.A03()
            r0 = 2131165693(0x7f0701fd, float:1.794561E38)
            int r6 = r2.getDimensionPixelSize(r0)
            boolean r0 = r14.A1k()
            if (r0 != 0) goto L_0x032c
            boolean r0 = r14.A1j()
            if (r0 != 0) goto L_0x032c
            r5 = 0
        L_0x0095:
            X.013 r3 = r14.A1H
            android.widget.ListView r2 = r14.A0G
            X.C45902Bo.A0A(r2, r3, r4, r5, r6, r7)
            X.013 r0 = r14.A1H
            boolean r0 = r0.A0T()
            android.widget.ListView r2 = r14.A0G
            if (r0 == 0) goto L_0x0326
            r2.setVerticalScrollbarPosition(r1)
        L_0x00a9:
            boolean r0 = r14.A2l
            if (r0 == 0) goto L_0x00ba
            X.0pd r3 = r14.A1d
            r2 = 691(0x2b3, float:9.68E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            r3 = 1
            if (r0 != 0) goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            android.widget.ListView r2 = r14.A0G
            X.3DE r0 = new X.3DE
            r0.<init>(r14, r3)
            r2.setOnItemClickListener(r0)
            boolean r0 = r14.A2l
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r14.A2i
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r14.A2q
            if (r0 != 0) goto L_0x00d5
            boolean r0 = r14.A2o
            if (r0 == 0) goto L_0x00df
        L_0x00d5:
            android.widget.ListView r2 = r14.A0G
            com.facebook.redex.IDxCListenerShape300S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape300S0100000_2_I0
            r0.<init>(r14, r7)
            r2.setOnItemLongClickListener(r0)
        L_0x00df:
            boolean r2 = r14.A1l()
            r0 = 0
            if (r2 == 0) goto L_0x0183
            if (r3 == 0) goto L_0x02fc
            X.0sK r2 = r14.A0Q
            boolean r2 = r2.A0G()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0123
            r5 = 2131231981(0x7f0804ed, float:1.8080058E38)
            r4 = 2131889412(0x7f120d04, float:1.9413487E38)
            android.view.LayoutInflater r3 = r14.A05()
            android.view.View r2 = r14.A0A
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = X.AnonymousClass3A2.A00(r3, r2, r5, r4)
            android.content.Context r2 = r14.A0u()
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r2)
            r4.addView(r5)
            r3 = 7
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r2 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r2.<init>(r14, r3)
            r5.setOnClickListener(r2)
            r14.A08 = r5
            X.AnonymousClass2JP.A02(r5)
            android.widget.ListView r2 = r14.A0G
            r2.addFooterView(r4, r0, r1)
        L_0x0123:
            r5 = 2131231898(0x7f08049a, float:1.807989E38)
            r4 = 2131891711(0x7f1215ff, float:1.941815E38)
            android.view.LayoutInflater r3 = r14.A05()
            android.view.View r2 = r14.A0A
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = X.AnonymousClass3A2.A00(r3, r2, r5, r4)
            android.content.Context r2 = r14.A0u()
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r2)
            r4.addView(r3)
            r3 = 8
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r2 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r2.<init>(r14, r3)
            r4.setOnClickListener(r2)
            X.AnonymousClass2JP.A02(r4)
            android.widget.ListView r2 = r14.A0G
            r2.addFooterView(r4, r0, r1)
            r5 = 2131231594(0x7f08036a, float:1.8079273E38)
            r4 = 2131887525(0x7f1205a5, float:1.940966E38)
            android.view.LayoutInflater r3 = r14.A05()
            android.view.View r2 = r14.A0A
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = X.AnonymousClass3A2.A00(r3, r2, r5, r4)
            android.content.Context r2 = r14.A0u()
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r2)
            r4.addView(r3)
        L_0x0171:
            android.widget.ListView r2 = r14.A0G
            r2.addFooterView(r4, r0, r1)
            X.AnonymousClass2JP.A02(r4)
            r3 = 10
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r2 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r2.<init>(r14, r3)
            r4.setOnClickListener(r2)
        L_0x0183:
            android.widget.ListView r2 = r14.A0G
            r2.setOnCreateContextMenuListener(r14)
            boolean r2 = r14.A1r()
            X.01D r3 = r14.A27
            if (r2 == 0) goto L_0x02f3
            X.3oT r2 = new X.3oT
            r2.<init>(r14, r3)
            r14.A0w = r2
        L_0x0197:
            boolean r2 = r14.A1k()
            if (r2 == 0) goto L_0x01b7
            r2 = 18
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r9 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r9.<init>(r14, r2)
            r10 = 2131231443(0x7f0802d3, float:1.8078967E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131889620(0x7f120dd4, float:1.9413909E38)
            r11 = 0
            android.view.View r3 = r8.A1D(r9, r10, r11, r12, r13)
            android.widget.ListView r2 = r14.A0G
            r2.addHeaderView(r3, r0, r1)
        L_0x01b7:
            boolean r2 = r14.A2e
            if (r2 == 0) goto L_0x01df
            X.0pd r3 = r14.A1d
            X.0sK r2 = r14.A0Q
            boolean r2 = X.C32601gl.A04(r2, r3)
            if (r2 == 0) goto L_0x01df
            r2 = 19
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r9 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r9.<init>(r14, r2)
            r10 = 2131231718(0x7f0803e6, float:1.8079525E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131889613(0x7f120dcd, float:1.9413895E38)
            r11 = 0
            android.view.View r3 = r8.A1D(r9, r10, r11, r12, r13)
            android.widget.ListView r2 = r14.A0G
            r2.addHeaderView(r3, r0, r1)
        L_0x01df:
            boolean r2 = r14.A2e
            if (r2 == 0) goto L_0x01fd
            r2 = 22
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r9 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r9.<init>(r14, r2)
            r10 = 2131231443(0x7f0802d3, float:1.8078967E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131889621(0x7f120dd5, float:1.941391E38)
            r11 = 0
            android.view.View r3 = r8.A1D(r9, r10, r11, r12, r13)
            android.widget.ListView r2 = r14.A0G
            r2.addHeaderView(r3, r0, r1)
        L_0x01fd:
            boolean r2 = r14.A1j()
            if (r2 == 0) goto L_0x026c
            r2 = 23
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r9 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r9.<init>(r14, r2)
            r10 = 2131231394(0x7f0802a2, float:1.8078868E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131889412(0x7f120d04, float:1.9413487E38)
            r11 = 0
            android.view.View r5 = r8.A1D(r9, r10, r11, r12, r13)
            X.013 r6 = r14.A1H
            r2 = 2131362466(0x7f0a02a2, float:1.8344713E38)
            android.view.View r4 = r5.findViewById(r2)
            android.content.res.Resources r3 = r14.A03()
            r2 = 2131165698(0x7f070202, float:1.794562E38)
            int r2 = r3.getDimensionPixelSize(r2)
            X.C45902Bo.A08(r4, r6, r7, r2)
            r2 = 2131362920(0x7f0a0468, float:1.8345634E38)
            android.view.View r4 = r5.findViewById(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4.setVisibility(r7)
            r2 = 2131231841(0x7f080461, float:1.8079774E38)
            r4.setImageResource(r2)
            r3 = 17
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r2 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r2.<init>(r14, r3)
            r4.setOnClickListener(r2)
            r2 = 2131890995(0x7f121333, float:1.9416698E38)
            java.lang.String r2 = r14.A0J(r2)
            r4.setContentDescription(r2)
            android.content.Context r3 = r14.A0u()
            r2 = 2131101455(0x7f06070f, float:1.781532E38)
            int r2 = X.AnonymousClass00T.A00(r3, r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            X.C018808t.A00(r2, r4)
            android.widget.ListView r2 = r14.A0G
            r2.addHeaderView(r5, r0, r1)
        L_0x026c:
            boolean r2 = r14.A2m
            if (r2 == 0) goto L_0x0294
            X.0ul r2 = r14.A1g
            boolean r2 = r2.A0b()
            if (r2 == 0) goto L_0x0294
            r10 = 2131231781(0x7f080425, float:1.8079653E38)
            r11 = 2131101963(0x7f06090b, float:1.781635E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131889614(0x7f120dce, float:1.9413897E38)
            r2 = 20
            com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2 r9 = new com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2
            r9.<init>(r14, r2)
            android.view.View r3 = r8.A1D(r9, r10, r11, r12, r13)
            android.widget.ListView r2 = r14.A0G
            r2.addHeaderView(r3, r0, r1)
        L_0x0294:
            boolean r2 = r14.A2l
            if (r2 == 0) goto L_0x02e2
            X.0pd r4 = r14.A1d
            r3 = 2015(0x7df, float:2.824E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r4.A0E(r2, r3)
            if (r2 == 0) goto L_0x02e2
        L_0x02a4:
            android.widget.ListView r6 = r14.A0G
            r5 = 2131887464(0x7f120568, float:1.9409536E38)
            android.view.LayoutInflater r3 = r14.A05()
            r2 = 2131559320(0x7f0d0398, float:1.874398E38)
            android.view.View r4 = r3.inflate(r2, r0, r7)
            r2 = 2
            X.C004601z.A0d(r4, r2)
            r2 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r3 = X.C004601z.A0E(r4, r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.AnonymousClass1UP.A06(r3)
            boolean r2 = r14.A2k
            if (r2 == 0) goto L_0x02cb
            r3.setSingleLine(r7)
        L_0x02cb:
            r3.setText(r5)
            r6.addHeaderView(r4)
            boolean r2 = r14.A2l
            if (r2 == 0) goto L_0x0394
            X.0pd r4 = r14.A1d
            r3 = 2015(0x7df, float:2.824E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r4.A0E(r2, r3)
            if (r2 == 0) goto L_0x0394
            goto L_0x033e
        L_0x02e2:
            boolean r2 = r14.A2l
            if (r2 != 0) goto L_0x02ea
            boolean r2 = r14.A2e
            if (r2 == 0) goto L_0x03ea
        L_0x02ea:
            X.0uf r2 = r14.A0c
            boolean r2 = r2.A06()
            if (r2 == 0) goto L_0x03ea
            goto L_0x02a4
        L_0x02f3:
            X.2Rm r2 = new X.2Rm
            r2.<init>(r14, r3)
            r14.A0w = r2
            goto L_0x0197
        L_0x02fc:
            android.view.LayoutInflater r3 = r14.A05()
            r2 = 2131558727(0x7f0d0147, float:1.8742778E38)
            android.view.View r4 = r3.inflate(r2, r0)
            r3 = 9
            com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1 r2 = new com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1
            r2.<init>(r14, r3)
            r4.setOnClickListener(r2)
            X.AnonymousClass2JP.A02(r4)
            android.widget.ListView r2 = r14.A0G
            r2.addFooterView(r4, r0, r1)
            android.view.LayoutInflater r3 = r14.A05()
            r2 = 2131558721(0x7f0d0141, float:1.8742766E38)
            android.view.View r4 = r3.inflate(r2, r0)
            goto L_0x0171
        L_0x0326:
            r0 = 2
            r2.setVerticalScrollbarPosition(r0)
            goto L_0x00a9
        L_0x032c:
            android.content.res.Resources r2 = r14.A03()
            r0 = 2131165694(0x7f0701fe, float:1.7945612E38)
            int r5 = r2.getDimensionPixelSize(r0)
            android.widget.ListView r0 = r14.A0G
            r0.setClipToPadding(r7)
            goto L_0x0095
        L_0x033e:
            android.content.Context r2 = r14.A02()     // Catch:{ Exception -> 0x03e6 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x03e6 }
            r4.<init>()     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r2 = "com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity"
            r4.setClassName(r3, r2)     // Catch:{ Exception -> 0x03e6 }
            r2 = 20
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r9 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0     // Catch:{ Exception -> 0x03e6 }
            r9.<init>(r14, r2, r4)     // Catch:{ Exception -> 0x03e6 }
            r10 = 2131231503(0x7f08030f, float:1.8079089E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131887872(0x7f120700, float:1.9410363E38)
            r11 = 0
            android.view.View r5 = r8.A1D(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x03e6 }
            r2 = 2131362924(0x7f0a046c, float:1.8345642E38)
            android.view.View r4 = X.C004601z.A0E(r5, r2)     // Catch:{ Exception -> 0x03e6 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ Exception -> 0x03e6 }
            android.content.res.Resources r3 = r14.A03()     // Catch:{ Exception -> 0x03e6 }
            r2 = 2131101963(0x7f06090b, float:1.781635E38)
            int r2 = r3.getColor(r2)     // Catch:{ Exception -> 0x03e6 }
            X.AnonymousClass2SR.A08(r4, r2)     // Catch:{ Exception -> 0x03e6 }
            android.widget.ListView r2 = r14.A0G     // Catch:{ Exception -> 0x03e6 }
            r2.addHeaderView(r5, r0, r1)     // Catch:{ Exception -> 0x03e6 }
            X.1Ka r2 = r14.A0b     // Catch:{ Exception -> 0x03e6 }
            X.3qD r1 = new X.3qD     // Catch:{ Exception -> 0x03e6 }
            r1.<init>()     // Catch:{ Exception -> 0x03e6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x03e6 }
            r1.A00 = r0     // Catch:{ Exception -> 0x03e6 }
            X.0t9 r0 = r2.A04     // Catch:{ Exception -> 0x03e6 }
            r0.A06(r1)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x03ea
        L_0x0394:
            boolean r2 = r14.A2l
            if (r2 != 0) goto L_0x039c
            boolean r2 = r14.A2e
            if (r2 == 0) goto L_0x03ea
        L_0x039c:
            X.0uf r2 = r14.A0c
            boolean r2 = r2.A06()
            if (r2 == 0) goto L_0x03ea
            X.1Am r3 = r14.A0K     // Catch:{ Exception -> 0x03e6 }
            android.content.Context r2 = r14.A02()     // Catch:{ Exception -> 0x03e6 }
            android.content.Intent r3 = r3.A00(r2)     // Catch:{ Exception -> 0x03e6 }
            r2 = 19
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r9 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0     // Catch:{ Exception -> 0x03e6 }
            r9.<init>(r14, r2, r3)     // Catch:{ Exception -> 0x03e6 }
            r10 = 2131231503(0x7f08030f, float:1.8079089E38)
            r12 = 2131231362(0x7f080282, float:1.8078803E38)
            r13 = 2131887872(0x7f120700, float:1.9410363E38)
            r11 = 0
            android.view.View r5 = r8.A1D(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x03e6 }
            r2 = 2131362924(0x7f0a046c, float:1.8345642E38)
            android.view.View r4 = X.C004601z.A0E(r5, r2)     // Catch:{ Exception -> 0x03e6 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ Exception -> 0x03e6 }
            android.content.res.Resources r3 = r14.A03()     // Catch:{ Exception -> 0x03e6 }
            r2 = 2131101963(0x7f06090b, float:1.781635E38)
            int r2 = r3.getColor(r2)     // Catch:{ Exception -> 0x03e6 }
            X.AnonymousClass2SR.A08(r4, r2)     // Catch:{ Exception -> 0x03e6 }
            android.widget.ListView r2 = r14.A0G     // Catch:{ Exception -> 0x03e6 }
            r2.addHeaderView(r5, r0, r1)     // Catch:{ Exception -> 0x03e6 }
            X.0ui r2 = r14.A0d     // Catch:{ Exception -> 0x03e6 }
            r0 = 3
            r2.A02(r1, r0)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x03ea
        L_0x03e6:
            r0 = move-exception
            r0.getMessage()
        L_0x03ea:
            android.widget.ListView r1 = r14.A0G
            X.2Rm r0 = r14.A0w
            r1.setAdapter(r0)
            boolean r0 = r14.A2i
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r14.A2q
            if (r0 != 0) goto L_0x03fd
            boolean r0 = r14.A2o
            if (r0 == 0) goto L_0x0408
        L_0x03fd:
            android.widget.ListView r2 = r14.A0G
            r1 = 3
            com.facebook.redex.IDxSListenerShape252S0100000_2_I0 r0 = new com.facebook.redex.IDxSListenerShape252S0100000_2_I0
            r0.<init>(r14, r1)
            r2.setOnScrollListener(r0)
        L_0x0408:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1J():void");
    }

    public void A1K() {
        C14870pt r1;
        int i2;
        ImageView imageView;
        AnonymousClass013 r4;
        Drawable A042;
        Parcelable parcelable;
        String A012;
        ComponentName component;
        String str;
        String str2;
        AnonymousClass3BB A013;
        boolean z2;
        C99874uj r11;
        int i3;
        Object[] objArr;
        String A022;
        int i4;
        Set A014;
        List<C15830rv> list;
        Bundle bundle;
        List A043;
        C16010sH A082;
        Bundle bundle2 = this.A05;
        Bundle A1C2 = A1C();
        String string = bundle2.getString("action");
        Uri uri = A1C2.get("uri") instanceof Uri ? (Uri) A1C2.get("uri") : null;
        int i5 = A1C2.getInt("source", 1);
        HashSet hashSet = this.A2u;
        hashSet.clear();
        this.A2S = A1C2.getBoolean("enforce_hfm_limit", false);
        this.A2j = A1C2.getBoolean("forward_ctwa", false);
        if (string != null && string.equals("android.intent.action.CREATE_SHORTCUT")) {
            this.A2f = true;
        } else if (A1C2.getBoolean("call_picker", false)) {
            this.A2e = true;
        } else if (A1C2.getBoolean("for_group_call", false)) {
            this.A2h = true;
            this.A0x.A00.x().A0B(R.string.str1a70);
        } else if (A1C2.getBoolean("for_payments", false)) {
            this.A2n = true;
        } else if (A1C2.getBoolean("forward", false)) {
            this.A0x.A00.x().A0B(R.string.str0912);
            this.A2i = true;
            this.A1l = C15830rv.A02(A1C2.getString("forward_jid"));
            ArrayList<Integer> integerArrayList = A1C2.getIntegerArrayList("message_types");
            AnonymousClass00B.A06(integerArrayList);
            hashSet.addAll(integerArrayList);
            this.A2a = A1C2.getBoolean("is_voice_status_forward_allowed", false);
            this.A02 = A1C2.getInt("forward_messages_becoming_frequently_forwarded", 0);
            this.A2Y = A1C2.getBoolean("is_forwarded", false);
            this.A2T = A1C2.getBoolean("forward_highly_forwarded", false);
        } else if (A1C2.getBoolean("send", false)) {
            this.A2P = C16030sJ.A08(C15830rv.class, A1C2.getStringArrayList("jids"));
            this.A0x.A00.x().A0B(R.string.str14c4);
            this.A2o = true;
            this.A2k = A1C2.getBoolean("multi_select_ddm", false);
            int i6 = A1C2.getInt("dm_duration", 0);
            this.A01 = i6;
            if (this.A2k) {
                if (i6 == 0) {
                    i6 = 7776000;
                }
                this.A1a.A00().edit().putInt("disappearing_mode_duration_for_chat_picker_int", i6).apply();
            }
            ArrayList<Integer> integerArrayList2 = A1C2.getIntegerArrayList("message_types");
            AnonymousClass00B.A06(integerArrayList2);
            hashSet.addAll(integerArrayList2);
            if (A1C2.getBoolean("skip_preview", false)) {
                this.A0E.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.input_send), this.A1H));
            } else {
                this.A0E.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.ic_action_arrow_next), this.A1H));
                this.A0x.A00.x().A0B(R.string.str14fd);
            }
            if (A1C2.getBoolean("multi_select_ddm", false)) {
                int i7 = R.string.str070f;
                if (this.A1c.A00()) {
                    i7 = R.string.str0706;
                }
                this.A0x.A00.x().A0B(i7);
                this.A0E.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.ic_done), this.A1H));
            }
        } else if (A1C2.getBoolean("set_group_icon", false)) {
            this.A0x.A00.x().A0B(R.string.str0564);
            this.A2p = true;
        } else if (A1C2.getBoolean("email_history", false)) {
            this.A0x.A00.x().A0B(R.string.str0563);
            this.A2g = true;
        } else if (A1C2.getBoolean("block_contact", false)) {
            this.A2d = true;
            ArrayList<String> stringArrayList = A1C2.getStringArrayList("blocked_list");
            if (stringArrayList != null) {
                this.A2x.addAll(C16030sJ.A08(C15830rv.class, stringArrayList));
            }
        } else if (A1C2.getBoolean("request_out_contact_sync", false)) {
            this.A2l = true;
            this.A2m = true;
        } else {
            if (uri != null) {
                this.A0x.A00.x().A0B(R.string.str14fd);
                this.A2C = UUID.randomUUID().toString();
                boolean z3 = false;
                if (i5 == 2) {
                    z3 = true;
                }
                C14710pd r14 = this.A1d;
                C26081Mg r21 = this.A1T;
                C26001Ly r20 = this.A1O;
                C26021Ma r12 = this.A1M;
                C16490t9 r19 = this.A1f;
                C26091Mh r18 = this.A1X;
                AnonymousClass3BB A015 = new C614639a().A01();
                String A016 = C18030w2.A01(uri);
                String queryParameter = uri.getQueryParameter("text");
                uri.getQueryParameter("jid");
                uri.getQueryParameter("lid");
                if (queryParameter != null) {
                    queryParameter = AnonymousClass1ZW.A04(8000, C40651uT.A02(C18030w2.A06, queryParameter));
                }
                boolean z4 = false;
                C16620tM r42 = C16620tM.A02;
                if (r14.A0E(r42, 508)) {
                    str = C18030w2.A02(uri, r14);
                    if (str != null) {
                        z4 = str.contains("ctwa");
                    }
                    str2 = C18030w2.A03(uri, r14, z3);
                    if (z4) {
                        r12.A01("deep_link");
                        r12.A00("ctwa_deeplink_parsing_starts");
                    }
                } else {
                    str = null;
                    str2 = null;
                }
                boolean A0E2 = r14.A0E(r42, 2754);
                C14710pd r13 = r20.A00;
                if (A0E2) {
                    A013 = r18.A00(uri, r13.A0E(r42, 981));
                } else {
                    boolean A0E3 = r13.A0E(r42, 981);
                    C614639a r15 = new C614639a();
                    r15.A01 = uri;
                    r15.A06 = new AnonymousClass54G(r14);
                    r15.A00 = r14.A03(r42, 1841);
                    r15.A0J = A0E3;
                    r15.A03 = r19;
                    A013 = r15.A01();
                }
                if (z4) {
                    r12.A00("ctwa_deeplink_parsing_completes");
                }
                String str3 = A013.A07;
                if (str3 == null || (A014 = r21.A01(C15830rv.A02(A016), str3)) == null || A014.isEmpty()) {
                    A015 = A013;
                } else {
                    queryParameter = null;
                }
                String str4 = A015.A02;
                String str5 = A015.A07;
                this.A00 = 0;
                this.A2F = queryParameter;
                this.A2A = str4;
                this.A2I = str5;
                this.A1L = A015;
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.A2V = true;
                    this.A1Z.A01(this.A2C, true, !TextUtils.isEmpty(A016));
                    if (!TextUtils.isEmpty(A016)) {
                        if (this.A0z == null) {
                            z2 = true;
                        }
                        Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                    }
                    this.A2R = false;
                    this.A2q = true;
                } else if (TextUtils.isEmpty(A016)) {
                    Log.e("contactpicker/textanddirectchatlink/link-failed/no-text-or-phone");
                    this.A0P.A09(R.string.str0ba4, 0);
                    this.A0x.A00();
                } else {
                    this.A1Z.A01(this.A2C, false, true);
                    if (this.A0z == null) {
                        z2 = false;
                    }
                    Log.i("contactpicker/textanddirectchatlink/skip/synctask-already-exists");
                    this.A2R = false;
                    this.A2q = true;
                }
                String replaceAll = A016.replaceAll("\\D", "");
                if (replaceAll.length() < 5) {
                    Log.w("contactpicker/converttointlformat/too-short-no-cc");
                    r11 = this.A0x;
                    i3 = R.string.str06f8;
                    objArr = new Object[]{A016};
                } else {
                    Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(replaceAll);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        String substring = replaceAll.substring(group.length());
                        int A017 = AnonymousClass2JO.A01(this.A0M, group, substring);
                        if (A017 == 1) {
                            int parseInt = Integer.parseInt(group);
                            try {
                                substring = this.A0M.A02(parseInt, substring.replaceAll("\\D", ""));
                            } catch (Exception e2) {
                                StringBuilder sb = new StringBuilder("contactpicker/converttointlformat/trim/error ");
                                sb.append(parseInt);
                                Log.w(sb.toString(), e2);
                            }
                            StringBuilder sb2 = new StringBuilder("+");
                            sb2.append(group);
                            sb2.append(substring);
                            String obj = sb2.toString();
                            if (obj != null) {
                                if (!this.A0k.A0A()) {
                                    StringBuilder sb3 = new StringBuilder("handledeeplink/network-unavailable/");
                                    sb3.append(obj);
                                    Log.w(sb3.toString());
                                    this.A0x.Afj(new Object[]{obj}, 0, R.string.str06f2);
                                } else {
                                    C79093zB r16 = new C79093zB(uri, this, this.A16, A015, this.A1n, obj, str, str2, z2);
                                    this.A0z = r16;
                                    this.A24.Ack(r16, new Void[0]);
                                }
                            }
                        } else if (A017 != 3) {
                            if (A017 == 4 || A017 == 5) {
                                String A002 = C18160wF.A00(group);
                                A022 = A002 == null ? null : this.A21.A02(this.A1H, A002);
                                StringBuilder sb4 = new StringBuilder("contactpicker/converttointlformat/too-short/");
                                sb4.append(A016);
                                sb4.append(" cc=");
                                sb4.append(group);
                                Log.w(sb4.toString());
                                r11 = this.A0x;
                                i4 = R.string.str06f9;
                                if (A022 != null) {
                                    i3 = R.string.str06f7;
                                }
                                objArr = new Object[]{A016, group};
                            } else if (A017 == 6) {
                                String A003 = C18160wF.A00(group);
                                A022 = A003 == null ? null : this.A21.A02(this.A1H, A003);
                                StringBuilder sb5 = new StringBuilder("contactpicker/converttointlformat/too-long/");
                                sb5.append(A016);
                                sb5.append(" cc=");
                                sb5.append(group);
                                Log.w(sb5.toString());
                                r11 = this.A0x;
                                i4 = R.string.str06f6;
                                if (A022 != null) {
                                    i3 = R.string.str06f5;
                                }
                                objArr = new Object[]{A016, group};
                            } else if (A017 == 7) {
                                String A004 = C18160wF.A00(group);
                                A022 = A004 == null ? null : this.A21.A02(this.A1H, A004);
                                StringBuilder sb6 = new StringBuilder("contactpicker/converttointlformat/invalid-length/");
                                sb6.append(A016);
                                sb6.append(" cc=");
                                sb6.append(group);
                                Log.w(sb6.toString());
                                r11 = this.A0x;
                                i4 = R.string.str06f0;
                                if (A022 != null) {
                                    i3 = R.string.str06ef;
                                }
                                objArr = new Object[]{A016, group};
                            }
                            objArr = new Object[]{A016, group, A022};
                        } else {
                            this.A0x.Afj(new Object[]{A016}, 0, R.string.str06f1);
                            StringBuilder sb7 = new StringBuilder("contactpicker/converttointlformat/invalid-cc/");
                            sb7.append(A016);
                            sb7.append(" cc=");
                            sb7.append(group);
                            Log.w(sb7.toString());
                        }
                    }
                    this.A2R = false;
                    this.A2q = true;
                }
                r11.Afj(objArr, 0, i3);
                this.A2R = false;
                this.A2q = true;
            } else if (!A1C2.isEmpty()) {
                this.A0x.A00.x().A0B(R.string.str14fd);
                this.A2R = true;
                this.A2q = true;
                String string2 = bundle2.getString("type");
                if (string2 == null) {
                    StringBuilder sb8 = new StringBuilder("contactpicker/type/null ");
                    sb8.append(A1C2.toString());
                    Log.i(sb8.toString());
                    if (A1C2.containsKey("android.intent.extra.TEXT")) {
                        this.A00 = 0;
                    } else {
                        r1 = this.A0P;
                        i2 = R.string.str15fe;
                        r1.A09(i2, 0);
                        this.A0x.A00();
                        return;
                    }
                } else {
                    byte A005 = C17970vw.A00(string2);
                    this.A00 = A005;
                    if (A005 == 0 && A1C2.containsKey("android.intent.extra.STREAM")) {
                        this.A00 = 9;
                    }
                }
                try {
                    ActivityManager A032 = this.A1D.A03();
                    if (A032 == null) {
                        Log.w("contactpicker/set am=null");
                    } else {
                        for (ActivityManager.RecentTaskInfo recentTaskInfo : A032.getRecentTasks(4, 1)) {
                            Intent intent = recentTaskInfo.baseIntent;
                            if (!(intent == null || (component = intent.getComponent()) == null)) {
                                String packageName = component.getPackageName();
                                if ("com.juggersoft.whatsappfilesender".equals(packageName) || "com.whatsend".equals(packageName)) {
                                    Log.e("contactpicker/share/badfile");
                                    this.A0P.A09(R.string.str03a9, 0);
                                    this.A0x.A00();
                                    return;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                byte b2 = this.A00;
                if (b2 == 0) {
                    String string3 = A1C2.getString("android.intent.extra.TEXT");
                    if (string3 != null) {
                        byte[] bytes = string3.getBytes();
                        if (bytes.length > 4096) {
                            string3 = new String(bytes, 0, 4096);
                        }
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(this.A2F);
                        sb9.append(string3);
                        this.A2F = sb9.toString();
                    }
                    if (C45922Bq.A0B(this.A1D, this.A1q, this.A2F)) {
                        String A018 = C30931dC.A01(this.A2F);
                        C51292bO.A00(this.A0P, new AnonymousClass1ZR(this.A0U, A018), this.A1H, (C51282bN) null, this.A24, A018, false);
                        this.A2R = false;
                    } else {
                        return;
                    }
                } else if (b2 == 4) {
                    if (A1C2.containsKey("android.intent.extra.TEXT")) {
                        A012 = A1C2.getCharSequence("android.intent.extra.TEXT").toString();
                        StringBuilder sb10 = new StringBuilder("contactpicker/share/text [");
                        sb10.append(A012.length());
                        sb10.append("]");
                        Log.i(sb10.toString());
                    } else {
                        if (A1C2.containsKey("android.intent.extra.STREAM") && (parcelable = A1C2.getParcelable("android.intent.extra.STREAM")) != null) {
                            Uri parse = Uri.parse(parcelable.toString());
                            if (parse != null) {
                                StringBuilder sb11 = new StringBuilder("contactpicker/share/stream/");
                                sb11.append(parse.toString());
                                Log.i(sb11.toString());
                                try {
                                    A012 = this.A26.A01(parse);
                                } catch (IOException unused2) {
                                    this.A0P.A09(R.string.str197b, 0);
                                }
                            } else {
                                StringBuilder sb12 = new StringBuilder("contactpicker/share/stream/vcard uri is not valid. ");
                                sb12.append(parcelable.toString());
                                Log.i(sb12.toString());
                            }
                        }
                        Log.w("contact_picker/share intent does not reference VCard data");
                        r1 = this.A0P;
                        i2 = R.string.str15fd;
                        r1.A09(i2, 0);
                        this.A0x.A00();
                        return;
                    }
                    this.A24.Acl(new RunnableRunnableShape0S1100000_I0(28, A012, this));
                } else {
                    ArrayList parcelableArrayList = A1C2.getParcelableArrayList("android.intent.extra.STREAM");
                    this.A2K = parcelableArrayList;
                    if (parcelableArrayList == null) {
                        Parcelable parcelable2 = A1C2.getParcelable("android.intent.extra.STREAM");
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("contactpicker/share/uri ");
                        sb13.append(parcelable2);
                        Log.i(sb13.toString());
                        if (parcelable2 != null) {
                            ArrayList arrayList = new ArrayList();
                            this.A2K = arrayList;
                            arrayList.add(parcelable2);
                        }
                    } else {
                        StringBuilder sb14 = new StringBuilder("contactpicker/share/uris ");
                        sb14.append(parcelableArrayList.size());
                        Log.i(sb14.toString());
                        Iterator it = this.A2K.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            StringBuilder sb15 = new StringBuilder();
                            sb15.append("contactpicker/share/uri ");
                            sb15.append(next);
                            Log.i(sb15.toString());
                        }
                    }
                    ArrayList arrayList2 = this.A2K;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        this.A0x.A00();
                        return;
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            File A033 = AnonymousClass1XI.A03(uri2);
                            if (A033 != null) {
                                try {
                                    this.A22.A04(A033);
                                } catch (IOException e3) {
                                    StringBuilder sb16 = new StringBuilder();
                                    sb16.append("contactpicker/shared-internal-file ");
                                    sb16.append(uri2);
                                    Log.e(sb16.toString(), e3);
                                    this.A0P.A09(R.string.str15fe, 0);
                                    this.A2K = null;
                                }
                            }
                            byte A006 = this.A1m.A00(uri2);
                            if (A006 != -1) {
                                if (MediaProvider.A01().match(uri2) == 4 && !A0C().getPackageName().equals(A0C().getCallingPackage())) {
                                    StringBuilder sb17 = new StringBuilder();
                                    sb17.append("contactpicker/shared-internal-file ");
                                    sb17.append(uri2);
                                    Log.e(sb17.toString());
                                    break;
                                }
                                hashSet.add(Integer.valueOf(A006));
                            } else {
                                StringBuilder sb18 = new StringBuilder("contactpicker/share/unsupported ");
                                sb18.append(uri2);
                                sb18.append(" ");
                                sb18.append(C17970vw.A0I(uri2));
                                Log.e(sb18.toString());
                                this.A0P.A09(R.string.str15fe, 0);
                                break;
                            }
                        } else {
                            if ((hashSet.contains(1) || hashSet.contains(3) || hashSet.contains(13)) && !A1C2.getBoolean("skip_preview", false)) {
                                imageView = this.A0E;
                                r4 = this.A1H;
                                A042 = AnonymousClass00T.A04(A0u(), R.drawable.ic_action_arrow_next);
                            } else {
                                imageView = this.A0E;
                                r4 = this.A1H;
                                A042 = AnonymousClass00T.A04(A0u(), R.drawable.input_send);
                            }
                            imageView.setImageDrawable(new C447725m(A042, r4));
                            C14710pd r17 = this.A1d;
                            C16620tM r43 = C16620tM.A02;
                            int A034 = r17.A03(r43, 2614);
                            if (this.A2K.size() >= A034) {
                                A034 = this.A1d.A03(r43, 2693);
                            }
                            if (this.A2K.size() >= A034) {
                                this.A0P.A0H(A02().getString(R.string.str1616, new Object[]{Integer.valueOf(A034)}), 0);
                            } else {
                                Context A0u2 = A0u();
                                Iterator it3 = this.A2K.iterator();
                                while (it3.hasNext()) {
                                    try {
                                        A0u2.grantUriPermission("com.obwhatsapp", (Uri) it3.next(), 1);
                                    } catch (SecurityException e4) {
                                        Log.w("contactpicker/permission ", e4);
                                    }
                                }
                            }
                        }
                    }
                    this.A2K = null;
                    this.A0x.A00();
                    return;
                }
            } else {
                this.A2l = true;
            }
            hashSet.add(0);
        }
        int i8 = this.A02;
        if (i8 == 0) {
            View view = this.A07;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (this.A07 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A0A.findViewById(R.id.frequently_forwarded_holder);
            this.A07 = A05().inflate(R.layout.layout02aa, viewGroup, true);
            int i9 = R.string.str0916;
            if (i8 == 1) {
                i9 = R.string.str0917;
            }
            Spanned A019 = AnonymousClass1ZW.A01(A0J(i9), new Object[0]);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A019);
            URLSpan[] uRLSpanArr = (URLSpan[]) A019.getSpans(0, A019.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("learn-more".equals(uRLSpan.getURL())) {
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        spannableStringBuilder.setSpan(new IDxTSpanShape53S0100000_2_I0(this.A0A.getContext(), (Object) this, 1), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A07.findViewById(R.id.info_text);
            yo.ChangeSize(textEmojiLabel, 0);
            textEmojiLabel.A07 = new AnonymousClass3MF();
            textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A1D));
            textEmojiLabel.setText(spannableStringBuilder);
            this.A07.setVisibility(0);
            viewGroup.setVisibility(0);
        }
        C15830rv A023 = C15830rv.A02(A1C2.getString("jid"));
        if (A023 != null) {
            C15810rt r44 = this.A1P;
            C16070sO r110 = this.A1R;
            if ((!(A023 instanceof GroupJid) || !r44.A0H(A023) || r110.A0A((GroupJid) A023)) && (A082 = this.A0m.A08(A023)) != null) {
                A1u((Intent) null, A082);
            }
        }
        if (A1C2.containsKey("contacts_to_exclude")) {
            this.A2x.addAll(C16030sJ.A08(C15830rv.class, A1C2.getStringArrayList("contacts_to_exclude")));
        }
        if (this.A2c) {
            this.A2c = false;
            A1P();
        } else {
            A1O();
        }
        if (this.A2i && this.A1d.A0E(C16620tM.A02, 1853) && (bundle = A1C().getBundle("message_keys")) != null && (A043 = AnonymousClass1yL.A04(bundle)) != null) {
            C82234Ca r45 = this.A0O;
            C001300o A0H2 = A0H();
            C16150sX r111 = r45.A00.A04;
            AnonymousClass38N r7 = new AnonymousClass38N((ViewGroup) C004601z.A0E(this.A0A, R.id.forward_preview_container), A0H2, (C16820th) r111.A3B.get(), (C25791Ld) r111.AFY.get(), (C16320sq) r111.ARB.get());
            this.A11 = r7;
            r7.A08.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 141));
            AnonymousClass38N r5 = this.A11;
            if (A043.size() == 1) {
                r5.A0C.Acl(new RunnableRunnableShape13S0200000_I1_1(r5, 48, A043.get(0)));
            }
            AnonymousClass38N r112 = this.A11;
            boolean z5 = !this.A2W;
            ViewGroup viewGroup2 = r112.A02;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), z5 ? viewGroup2.getPaddingTop() : 0);
        }
        A1J();
        if (this.A2b) {
            this.A15.A00();
        }
        IDxCObserverShape68S0100000_2_I0 iDxCObserverShape68S0100000_2_I0 = new IDxCObserverShape68S0100000_2_I0(this, 10);
        this.A0n = iDxCObserverShape68S0100000_2_I0;
        this.A0o.A02(iDxCObserverShape68S0100000_2_I0);
        IDxSObserverShape63S0100000_2_I0 iDxSObserverShape63S0100000_2_I0 = new IDxSObserverShape63S0100000_2_I0(this, 6);
        this.A0f = iDxSObserverShape63S0100000_2_I0;
        this.A0g.A02(iDxSObserverShape63S0100000_2_I0);
        C73623oY r113 = new C73623oY(this);
        this.A18 = r113;
        this.A19.A02(r113);
        IDxPObserverShape81S0100000_2_I0 iDxPObserverShape81S0100000_2_I0 = new IDxPObserverShape81S0100000_2_I0(this, 8);
        this.A1h = iDxPObserverShape81S0100000_2_I0;
        this.A1i.A02(iDxPObserverShape81S0100000_2_I0);
        this.A12 = (C93464jF) A1C().getParcelable("share_sheet_data");
        if (this.A2W && (list = this.A2P) != null) {
            for (C15830rv r2 : list) {
                C16010sH A083 = this.A0m.A08(r2);
                if (A083 != null) {
                    this.A2w.put(r2, A083);
                }
            }
        }
    }

    public void A1L() {
        if (this.A0J == null) {
            C009804r r1 = this.A0I;
            if (r1 == null) {
                r1 = new AnonymousClass3DM(this);
                this.A0I = r1;
            }
            this.A0J = this.A0x.A00.AgA(r1);
        }
    }

    public void A1M() {
        boolean z2 = false;
        if (A1C().getBoolean("forward", false) || A1C().getBoolean("send", false)) {
            z2 = true;
        }
        StatusPrivacyBottomSheetDialogFragment A012 = StatusPrivacyBottomSheetDialogFragment.A01(z2);
        this.A1t.A02(A012.A05, this.A1U);
        ((C14550pN) A0D()).Afc(A012);
    }

    public final void A1N() {
        this.A0Z.setVisibility(8);
        this.A0H.setVisibility(8);
        this.A0G.setVisibility(0);
        AnonymousClass37T r0 = this.A0u;
        if (r0 != null) {
            r0.A06(true);
            this.A0u = null;
        }
        AnonymousClass37G r02 = this.A10;
        if (r02 != null) {
            r02.A06(true);
            this.A10 = null;
        }
        AnonymousClass37T A1E2 = A1E();
        this.A0u = A1E2;
        this.A24.Acn(A1E2, new Void[0]);
    }

    public final void A1O() {
        AnonymousClass35s r0 = this.A0v;
        if (r0 != null) {
            r0.A06(true);
        }
        AnonymousClass37T r02 = this.A0u;
        if (r02 != null) {
            r02.A06(true);
            this.A0u = null;
        }
        AnonymousClass35s A1F2 = A1F();
        this.A0v = A1F2;
        this.A24.Acn(A1F2, new Void[0]);
    }

    public final void A1P() {
        C16040sK r0 = this.A0Q;
        r0.A0B();
        if (r0.A00 == null) {
            this.A0P.A09(R.string.str08fd, 1);
        } else if (!this.A0Q.A0G()) {
            this.A0x.A00.A1b(true);
            AnonymousClass368 r02 = this.A0y;
            if (r02 != null) {
                r02.A06(true);
            }
            AnonymousClass368 r2 = new AnonymousClass368(this.A0m, this, this.A17, this.A1C);
            this.A0y = r2;
            this.A24.Ack(r2, new Void[0]);
        }
    }

    public final void A1Q() {
        Map map = this.A2w;
        ArrayList arrayList = new ArrayList(map.size());
        int i2 = 0;
        if (this.A2W) {
            arrayList = this.A0r.A0N(A02(), this.A1U, A1I());
        } else {
            for (C16010sH r1 : map.values()) {
                String A0J2 = C16030sJ.A0Q(r1.A0E) ? A0J(R.string.str0dac) : this.A0r.A08(r1);
                if (A0J2 != null) {
                    arrayList.add(0, A0J2);
                }
            }
        }
        this.A0W.A0I((List) null, C40631uR.A00(this.A0r.A07, arrayList, false));
        C45902Bo.A0D((HorizontalScrollView) this.A09.findViewById(R.id.recipients_scroller), this.A1H);
        if (!TextUtils.isEmpty(this.A2F)) {
            this.A0E.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.ic_action_arrow_next), this.A1H));
        }
        if (this.A2W && this.A0F != null) {
            if (!A1t()) {
                i2 = 8;
            }
            this.A0F.setVisibility(i2);
        }
    }

    public final void A1R() {
        String A0J2;
        if (this.A2W) {
            int size = this.A2w.size();
            if (size == 0) {
                int i2 = R.string.str14c4;
                if (this.A2k) {
                    boolean A002 = this.A1c.A00();
                    i2 = R.string.str070f;
                    if (A002) {
                        i2 = R.string.str0706;
                    }
                }
                A0J2 = A02().getString(i2);
            } else {
                int i3 = R.plurals.plurals00da;
                if (this.A2k) {
                    i3 = R.plurals.plurals00d6;
                }
                A0J2 = this.A1H.A0J(new Object[]{Integer.valueOf(size)}, i3, (long) size);
            }
            this.A0x.A00.x().A0J(A0J2);
        }
    }

    public final void A1S() {
        if (this.A1d.A0E(C16620tM.A02, 674)) {
            this.A1B.A00(A0C(), "missingcontacts");
            return;
        }
        Context A0u2 = A0u();
        Intent intent = new Intent();
        intent.setClassName(A0u2.getPackageName(), "com.obwhatsapp.contact.picker.ContactPickerHelp");
        A0r(intent);
    }

    public final void A1T() {
        if (this.A04 + 3500 < SystemClock.elapsedRealtime()) {
            this.A04 = SystemClock.elapsedRealtime();
            AnonymousClass1PD r0 = this.A1y;
            A0u();
            r0.A00();
        }
    }

    public final void A1U() {
        if (this.A0J != null) {
            Map map = this.A2w;
            boolean isEmpty = map.isEmpty();
            AnonymousClass05J r3 = this.A0J;
            if (isEmpty) {
                r3.A05();
            } else {
                r3.A0B(this.A1H.A0K().format((long) map.size()));
            }
        }
    }

    public void A1V(int i2) {
        if (A0u() == null) {
            return;
        }
        if (i2 == R.string.str06f3 || i2 == R.string.str06ee || i2 == R.string.str06f4 || i2 == R.string.str06f2 || i2 == R.string.str06f1 || i2 == R.string.str06ef || i2 == R.string.str06f0 || i2 == R.string.str06f5 || i2 == R.string.str06f6 || i2 == R.string.str06f7 || i2 == R.string.str06f9 || i2 == R.string.str06f8) {
            A0r(C14750ph.A04(A0u()));
            this.A0x.A00();
        }
    }

    public final void A1W(int i2) {
        if (!this.A2W) {
            return;
        }
        if (this.A2q || this.A2i || this.A2o) {
            if (this.A06 == null) {
                View view = new View(A0u());
                this.A06 = view;
                this.A0G.addFooterView(view, (Object) null, false);
            }
            this.A06.setLayoutParams(new AbsListView.LayoutParams(-1, A03().getDimensionPixelSize(R.dimen.dimen0522) + i2));
        }
    }

    public final void A1X(Intent intent) {
        if (this.A1d.A0E(C16620tM.A02, 508) && !TextUtils.isEmpty(this.A2E)) {
            intent.putExtra("entry_point_conversion_source", this.A2E);
            if (!TextUtils.isEmpty(this.A2D)) {
                intent.putExtra("entry_point_conversion_app", this.A2D);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0123, code lost:
        if (r14.getQueryParameter("src") != null) goto L_0x0125;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Y(android.net.Uri r14, android.util.Pair r15, X.AnonymousClass3BB r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r13 = this;
            r7 = r18
            r8 = 0
            r13.A0z = r8
            r4 = 1
            r5 = 0
            r3 = r17
            if (r15 != 0) goto L_0x0031
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "handledeeplink/message-handler/disconnected/"
        L_0x0012:
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.4uj r2 = r13.A0x
            r1 = 2131887860(0x7f1206f4, float:1.941034E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r17
            r2.Afj(r0, r5, r1)
        L_0x002b:
            X.4uj r0 = r13.A0x
            r0.Ac1()
            return
        L_0x0031:
            java.lang.Object r0 = r15.first
            X.284 r0 = (X.AnonymousClass284) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x0091
            r0 = 2
            if (r1 == r0) goto L_0x0091
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = "handledeeplink/existencesync/network-unavailable/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.4uj r2 = r13.A0x
            r1 = 2131887858(0x7f1206f2, float:1.9410335E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r17
            r2.Afj(r0, r5, r1)
            goto L_0x002b
        L_0x005d:
            r0 = 4
            if (r1 != r0) goto L_0x0068
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "handledeeplink/existencesync/failed/try-again-later/"
            goto L_0x0012
        L_0x0068:
            if (r1 != r4) goto L_0x007c
            java.lang.String r1 = "handledeeplink/existencesync/exisitng request ongoing/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x002b
        L_0x007c:
            r0 = 6
            if (r1 != r0) goto L_0x002b
            java.lang.String r1 = "handledeeplink/existencesync/exception-occurred/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x002b
        L_0x0091:
            java.lang.Object r6 = r15.second
            X.27a r6 = (X.C450927a) r6
            r1 = 0
            if (r6 == 0) goto L_0x0099
            r1 = 1
        L_0x0099:
            java.lang.String r0 = "deeplink: user is null"
            X.AnonymousClass00B.A0B(r0, r1)
            int r1 = r6.A04
            if (r1 != r4) goto L_0x01e3
            r0 = r16
            r13.A1L = r0
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x01d7
            r13.A2E = r7
            r0 = r19
            r13.A2D = r0
        L_0x00b2:
            com.whatsapp.jid.UserJid r5 = r6.A0C
            X.1Hs r3 = r13.A1N
            X.4Qp r2 = r13.A1K
            X.3BB r0 = r13.A1L
            java.lang.String r1 = r0.A06
            java.lang.String r0 = r0.A03
            X.21U r1 = r2.A00(r5, r1, r0, r7)
            int r0 = r1.A00
            if (r0 != r4) goto L_0x00ce
            X.1Hp r0 = r3.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00d3
        L_0x00ce:
            X.0zO r0 = r3.A01
            r0.A04(r1)
        L_0x00d3:
            X.1MX r7 = r13.A1Z
            com.whatsapp.jid.UserJid r1 = r6.A0C
            if (r1 == 0) goto L_0x00e3
            X.0sG r0 = r13.A0m
            boolean r0 = r0.A0Z(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x00e3:
            java.lang.String r10 = r13.A2C
            r11 = 2
            android.os.Bundle r0 = r13.A1C()
            java.lang.String r1 = "source"
            int r12 = r0.getInt(r1, r4)
            X.0uP r2 = r13.A0q
            com.whatsapp.jid.UserJid r0 = r6.A0C
            X.1Vq r0 = r2.A00(r0)
            java.lang.Integer r9 = X.C54692i1.A00(r0)
            r7.A00(r8, r9, r10, r11, r12)
            com.whatsapp.jid.UserJid r3 = r6.A0C
            android.os.Bundle r0 = r13.A1C()
            int r0 = r0.getInt(r1)
            if (r4 != r0) goto L_0x0137
            java.lang.String r8 = "type"
            java.lang.String r0 = r14.getQueryParameter(r8)
            java.lang.String r2 = "custom_url"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0125
            java.lang.String r0 = "src"
            java.lang.String r1 = r14.getQueryParameter(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0126
        L_0x0125:
            r0 = 0
        L_0x0126:
            r7 = 5
            r5 = 4
            if (r0 == 0) goto L_0x01af
            X.1ND r2 = r13.A1Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A00(r3, r1, r0)
        L_0x0137:
            X.1Aw r1 = r13.A25
            com.whatsapp.jid.UserJid r0 = r6.A0C
            r1.A00(r14, r0)
            com.whatsapp.jid.UserJid r0 = r6.A0C
            X.0sH r3 = new X.0sH
            r3.<init>(r0)
            X.0sq r2 = r13.A24
            r1 = 45
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r13, r1, r6)
            r2.Acl(r0)
            if (r20 != 0) goto L_0x01de
            com.whatsapp.jid.UserJid r0 = r6.A0C
            if (r0 == 0) goto L_0x0167
            java.lang.String r0 = r13.A2A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = r13.A2I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01de
        L_0x0167:
            android.content.Context r0 = r13.A0u()
            r3 = 0
            android.content.Intent r2 = X.C14750ph.A08(r0, r3)
            com.whatsapp.jid.UserJid r0 = r6.A0C
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "skip_preview"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "number_from_url"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "text_from_url"
            r2.putExtra(r0, r3)
            java.lang.String r1 = r13.A2C
            java.lang.String r0 = "extra_deep_link_session_id"
            r2.putExtra(r0, r1)
            r13.A1X(r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.addFlags(r0)
            java.lang.Class r0 = r13.getClass()
            java.lang.String r0 = r0.getSimpleName()
            X.AnonymousClass22U.A00(r2, r0)
            X.4uj r0 = r13.A0x
            X.1ZA r0 = r0.A00
            r0.A2X(r2, r4)
            goto L_0x002b
        L_0x01af:
            java.lang.String r0 = r14.getQueryParameter(r8)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = "src"
            java.lang.String r1 = r14.getQueryParameter(r0)
            java.lang.String r0 = "qr"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0137
            X.1ND r2 = r13.A1Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A01(r3, r1, r0)
            goto L_0x0137
        L_0x01d7:
            r13.A2E = r8
            r7 = r8
            r13.A2D = r8
            goto L_0x00b2
        L_0x01de:
            r13.A1e(r3)
            goto L_0x002b
        L_0x01e3:
            r0 = 2
            if (r1 != r0) goto L_0x0214
            java.lang.String r0 = "handledeeplink/existencesync/user/not-wa/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.jid.UserJid r0 = r6.A0C
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.jid.UserJid r0 = r6.A0C
            X.AnonymousClass00B.A06(r0)
            java.lang.String r6 = r0.user
            X.4uj r3 = r13.A0x
            r2 = 2131887859(0x7f1206f3, float:1.9410337E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r0, r6)
            r1[r5] = r0
            r3.Afj(r1, r5, r2)
            goto L_0x002b
        L_0x0214:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            java.lang.String r0 = "handledeeplink/existencesync/user/invalid/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.List r0 = r6.A0G
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4uj r3 = r13.A0x
            r2 = 2131887854(0x7f1206ee, float:1.9410327E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.util.List r0 = r6.A0G
            java.lang.Object r0 = r0.get(r5)
            r1[r5] = r0
            r3.Afj(r1, r5, r2)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1Y(android.net.Uri, android.util.Pair, X.3BB, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f0, code lost:
        if (r4 > 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0219, code lost:
        if (r0.A2U == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022b, code lost:
        if (r3 != false) goto L_0x022d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x038b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1Z(android.view.View r20, X.C16010sH r21) {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0.A2q
            if (r1 != 0) goto L_0x000e
            boolean r1 = r0.A2i
            if (r1 != 0) goto L_0x000e
            boolean r1 = r0.A2o
            if (r1 == 0) goto L_0x0066
        L_0x000e:
            java.util.Map r1 = r0.A2w
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0066
            android.widget.ImageView r1 = r0.A0E
            r5 = 0
            r1.setVisibility(r5)
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r6 = new android.view.animation.ScaleAnimation
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = 125(0x7d, double:6.2E-322)
            r6.setDuration(r3)
            r1 = 100
            r6.setStartOffset(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r6.setInterpolator(r1)
            r6.setFillBefore(r11)
            android.widget.ImageView r1 = r0.A0E
            r1.startAnimation(r6)
            android.view.ViewGroup r1 = r0.A0D
            android.animation.LayoutTransition r6 = r1.getLayoutTransition()
            r6.setDuration(r3)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r1 = 2
            r6.setInterpolator(r1, r2)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r6.setInterpolator(r5, r1)
            android.view.View r1 = r0.A09
            r1.setVisibility(r5)
        L_0x0066:
            r1 = 0
            r0.A1W = r1
            java.util.Map r6 = r0.A2w
            r1 = r21
            X.0rv r2 = r1.A0E
            boolean r2 = r6.containsKey(r2)
            r5 = r20
            if (r2 == 0) goto L_0x019a
            X.0rv r2 = r1.A0E
            r6.remove(r2)
            r4 = 0
            r5.setBackgroundResource(r4)
            X.0rv r2 = r1.A0E
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 == 0) goto L_0x00d6
            android.view.View r2 = r0.A0B
            if (r2 == 0) goto L_0x00d6
            int r3 = r2.getVisibility()
            r2 = 8
            if (r3 == r2) goto L_0x00d6
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r12 = 1
            X.013 r2 = r0.A1H
            boolean r2 = r2.A0T()
            r2 = r2 ^ 1
            r13 = 0
            if (r2 == 0) goto L_0x00a5
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r14 = 1
            r15 = 0
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 125(0x7d, double:6.2E-322)
            r7.setDuration(r2)
            r2 = 100
            r7.setStartOffset(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r7.setInterpolator(r2)
            android.view.View r3 = r0.A0B
            r2 = 2131364043(0x7f0a08cb, float:1.8347912E38)
            android.view.View r2 = r3.findViewById(r2)
            r2.startAnimation(r7)
            r3 = 6
            com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0 r2 = new com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0
            r2.<init>(r0, r3)
            r7.setAnimationListener(r2)
        L_0x00d6:
            boolean r2 = r1.A0J()
            if (r2 == 0) goto L_0x00de
            r0.A2U = r4
        L_0x00de:
            boolean r2 = r0.A2q
            if (r2 != 0) goto L_0x00ea
            boolean r2 = r0.A2i
            if (r2 != 0) goto L_0x00ea
            boolean r2 = r0.A2o
            if (r2 == 0) goto L_0x013c
        L_0x00ea:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0196
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r12 = 1
            r13 = 1056964608(0x3f000000, float:0.5)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r14 = 1
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r7 = new android.view.animation.ScaleAnimation
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 125(0x7d, double:6.2E-322)
            r7.setDuration(r2)
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            r7.setInterpolator(r4)
            android.widget.ImageView r4 = r0.A0E
            r4.startAnimation(r7)
            android.widget.ImageView r4 = r0.A0E
            r5 = 8
            r4.setVisibility(r5)
            android.view.ViewGroup r4 = r0.A0D
            android.animation.LayoutTransition r4 = r4.getLayoutTransition()
            r4.setDuration(r2)
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            r2 = 3
            r4.setInterpolator(r2, r3)
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            r4.setInterpolator(r12, r2)
            android.view.View r2 = r0.A09
            r2.setVisibility(r5)
        L_0x0139:
            r0.A1R()
        L_0x013c:
            java.util.Set r3 = r0.A2y
            java.lang.Class<X.0rv> r7 = X.C15830rv.class
            com.whatsapp.jid.Jid r2 = r1.A08(r7)
            r3.add(r2)
            android.os.Handler r5 = r0.A2r
            java.lang.Runnable r4 = r0.A2t
            r5.removeCallbacks(r4)
            r2 = 200(0xc8, double:9.9E-322)
            r5.postDelayed(r4, r2)
            boolean r2 = r0.A2q
            if (r2 != 0) goto L_0x015f
            boolean r2 = r0.A2i
            if (r2 != 0) goto L_0x015f
            boolean r2 = r0.A2o
            if (r2 == 0) goto L_0x0188
        L_0x015f:
            java.lang.String r2 = r0.A2B
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0188
            com.whatsapp.jid.Jid r1 = r1.A08(r7)
            boolean r1 = r6.containsKey(r1)
            if (r1 == 0) goto L_0x0188
            X.267 r1 = r0.A0R
            androidx.appcompat.widget.SearchView r2 = r1.A02
            if (r2 == 0) goto L_0x0188
            r1 = 2131365991(0x7f0a1067, float:1.8351863E38)
            android.view.View r3 = r2.findViewById(r1)
            android.widget.EditText r3 = (android.widget.EditText) r3
            r2 = 0
            int r1 = r3.length()
            r3.setSelection(r2, r1)
        L_0x0188:
            r0.A1U()
            java.lang.String r1 = "contactpicker/notifyAdapter"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2Rm r0 = r0.A0w
            r0.notifyDataSetChanged()
            return
        L_0x0196:
            r0.A1Q()
            goto L_0x0139
        L_0x019a:
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r3 = r2.iterator()
            r9 = 0
            r7 = 0
        L_0x01a4:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x01b9
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 != 0) goto L_0x01a4
            int r7 = r7 + 1
            goto L_0x01a4
        L_0x01b9:
            X.0rv r2 = r1.A0E
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 != 0) goto L_0x01c3
            int r7 = r7 + 1
        L_0x01c3:
            boolean r2 = r0.A2k
            r15 = 1
            if (r2 != 0) goto L_0x0257
            boolean r2 = r0.A2q
            if (r2 != 0) goto L_0x0208
            boolean r2 = r0.A2i
            if (r2 != 0) goto L_0x0208
            boolean r2 = r0.A2o
            if (r2 != 0) goto L_0x0208
            X.0s5 r3 = r0.A0T
            X.0tC r2 = X.C15910s6.A1A
            int r4 = r3.A02(r2)
            X.0s5 r3 = r0.A0T
            X.0tC r2 = X.C15910s6.A1l
            int r2 = r3.A02(r2)
            int r2 = r2 + -1
            int r2 = r2 - r15
            int r4 = java.lang.Math.min(r4, r2)
            r10 = 2131755018(0x7f10000a, float:1.9140903E38)
            r8 = 0
            r2 = 0
            if (r4 <= 0) goto L_0x0257
        L_0x01f2:
            int r4 = com.obwhatsapp.yo.yo.getMaxMCastLimit(r4)
            if (r4 <= 0) goto L_0x0249
            if (r7 <= r4) goto L_0x0249
            if (r2 == 0) goto L_0x0233
            X.4uj r3 = r0.A0x
            com.obwhatsapp.dialogs.HFMLearnMoreDialogFragment r2 = new com.obwhatsapp.dialogs.HFMLearnMoreDialogFragment
            r2.<init>()
            r3.Afc(r2)
            goto L_0x00de
        L_0x0208:
            boolean r2 = r0.A2Y
            if (r2 == 0) goto L_0x021b
            boolean r2 = r0.A2X
            if (r2 == 0) goto L_0x021b
            boolean r2 = r1.A0J()
            if (r2 == 0) goto L_0x021b
            boolean r2 = r0.A2U
            r8 = 1
            if (r2 != 0) goto L_0x021c
        L_0x021b:
            r8 = 0
        L_0x021c:
            boolean r2 = r0.A2i
            if (r2 == 0) goto L_0x0224
            boolean r2 = r0.A2T
            if (r2 != 0) goto L_0x022d
        L_0x0224:
            boolean r3 = r0.A2S
            r10 = 2131755221(0x7f1000d5, float:1.9141315E38)
            r2 = 0
            r4 = 5
            if (r3 == 0) goto L_0x01f2
        L_0x022d:
            r10 = 2131755221(0x7f1000d5, float:1.9141315E38)
            r2 = 1
            r4 = 1
            goto L_0x01f2
        L_0x0233:
            X.4uj r8 = r0.A0x
            X.013 r7 = r0.A1H
            long r2 = (long) r4
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r9] = r4
            java.lang.String r2 = r7.A0J(r5, r10, r2)
            r8.Afh(r2)
            goto L_0x00de
        L_0x0249:
            if (r8 == 0) goto L_0x0257
            X.4uj r3 = r0.A0x
            com.obwhatsapp.dialogs.ForwardLimitToGroupsLearnMoreDialogFragment r2 = new com.obwhatsapp.dialogs.ForwardLimitToGroupsLearnMoreDialogFragment
            r2.<init>()
            r3.Afc(r2)
            goto L_0x00de
        L_0x0257:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x026c
            boolean r2 = r0.A2q
            if (r2 != 0) goto L_0x026c
            boolean r2 = r0.A2i
            if (r2 != 0) goto L_0x026c
            boolean r2 = r0.A2o
            if (r2 != 0) goto L_0x026c
            r0.A1L()
        L_0x026c:
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            com.whatsapp.jid.Jid r2 = r1.A08(r2)
            r6.put(r2, r1)
            r2 = 2131100872(0x7f0604c8, float:1.7814138E38)
            r5.setBackgroundResource(r2)
            X.0rv r2 = r1.A0E
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 == 0) goto L_0x042e
            X.11G r2 = r0.A1V
            boolean r2 = r2.A0G()
            r4 = 0
            if (r2 != 0) goto L_0x0312
            android.view.View r2 = r0.A0B
            if (r2 != 0) goto L_0x02ca
            android.view.View r8 = r0.A0A
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.LayoutInflater r5 = r0.A05()
            r3 = 2131558726(0x7f0d0146, float:1.8742776E38)
            r2 = 0
            android.view.View r3 = r5.inflate(r3, r2, r9)
            r0.A0B = r3
            r2 = 2131364043(0x7f0a08cb, float:1.8347912E38)
            android.view.View r7 = r3.findViewById(r2)
            X.013 r5 = r0.A1H
            android.content.Context r3 = r0.A0u()
            r2 = 2131231696(0x7f0803d0, float:1.807948E38)
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00T.A04(r3, r2)
            X.25m r2 = new X.25m
            r2.<init>(r3, r5)
            r7.setBackground(r2)
            android.view.View r3 = r0.A0B
            r2 = 8
            r3.setVisibility(r2)
            android.view.View r2 = r0.A0B
            r8.addView(r2)
        L_0x02ca:
            android.view.View r2 = r0.A0B
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0312
            android.view.View r2 = r0.A0B
            r2.setVisibility(r9)
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            X.013 r2 = r0.A1H
            boolean r2 = r2.A0T()
            r2 = r2 ^ 1
            r16 = 0
            if (r2 == 0) goto L_0x02e8
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x02e8:
            r13 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r17 = 1
            r18 = 0
            android.view.animation.ScaleAnimation r10 = new android.view.animation.ScaleAnimation
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 125(0x7d, double:6.2E-322)
            r10.setDuration(r2)
            r2 = 100
            r10.setStartOffset(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r10.setInterpolator(r2)
            android.view.View r3 = r0.A0B
            r2 = 2131364043(0x7f0a08cb, float:1.8347912E38)
            android.view.View r2 = r3.findViewById(r2)
            r2.startAnimation(r10)
        L_0x0312:
            android.os.Bundle r8 = r0.A1C()
            boolean r5 = r0.A2q
            r7 = 700(0x2bc, float:9.81E-43)
            r2 = 0
            r9 = 3
            if (r5 == 0) goto L_0x03c7
            java.util.HashSet r10 = r0.A2u
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            boolean r5 = r10.contains(r5)
            if (r5 == 0) goto L_0x03b8
            java.lang.String r5 = "skip_preview"
            boolean r4 = r8.getBoolean(r5, r4)
            if (r4 == 0) goto L_0x03b8
            java.lang.Long r4 = r0.A28
            if (r4 != 0) goto L_0x039f
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.A28 = r2
            java.util.ArrayList r2 = r0.A2K
            X.AnonymousClass00B.A06(r2)
            java.util.Iterator r8 = r2.iterator()
        L_0x0347:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x039f
            java.lang.Object r4 = r8.next()
            android.net.Uri r4 = (android.net.Uri) r4
            X.0vv r2 = r0.A1m
            byte r2 = r2.A00(r4)
            if (r2 != r9) goto L_0x0347
            X.1A9 r2 = r0.A23     // Catch:{ 1xB -> 0x0398 }
            X.1wq r3 = new X.1wq     // Catch:{ Exception -> 0x038c }
            r3.<init>()     // Catch:{ Exception -> 0x038c }
            X.0tz r2 = r2.A04     // Catch:{ all -> 0x0387 }
            android.content.Context r2 = r2.A00     // Catch:{ all -> 0x0387 }
            r3.setDataSource(r2, r4)     // Catch:{ all -> 0x0387 }
            r2 = 9
            java.lang.String r2 = r3.extractMetadata(r2)     // Catch:{ all -> 0x0387 }
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0387 }
            r3.close()     // Catch:{ Exception -> 0x038c }
            java.lang.Long r2 = r0.A28     // Catch:{ 1xB -> 0x0398 }
            long r2 = r2.longValue()     // Catch:{ 1xB -> 0x0398 }
            long r2 = java.lang.Math.max(r4, r2)     // Catch:{ 1xB -> 0x0398 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ 1xB -> 0x0398 }
            r0.A28 = r2     // Catch:{ 1xB -> 0x0398 }
            goto L_0x0347
        L_0x0387:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x038b }
        L_0x038b:
            throw r2     // Catch:{ Exception -> 0x038c }
        L_0x038c:
            r3 = move-exception
            java.lang.String r2 = "mediafileutils/getVideoDuration exception"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ 1xB -> 0x0398 }
            X.1xB r2 = new X.1xB     // Catch:{ 1xB -> 0x0398 }
            r2.<init>()     // Catch:{ 1xB -> 0x0398 }
            throw r2     // Catch:{ 1xB -> 0x0398 }
        L_0x0398:
            r3 = move-exception
            java.lang.String r2 = "contactpicker/video/"
            com.whatsapp.util.Log.e(r2, r3)
            goto L_0x0347
        L_0x039f:
            java.lang.Long r2 = r0.A28
            long r8 = r2.longValue()
            X.0s5 r3 = r0.A0T
            X.0tC r2 = X.C15910s6.A1y
            int r2 = r3.A02(r2)
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x03b8
            r0.A1T()
        L_0x03b8:
            java.lang.String r2 = r0.A2F
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x042e
            java.lang.String r2 = r0.A2F
            int r2 = r2.length()
            goto L_0x0400
        L_0x03c7:
            boolean r5 = r0.A2i
            if (r5 == 0) goto L_0x0438
            java.util.HashSet r10 = r0.A2u
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            boolean r5 = r10.contains(r5)
            if (r5 == 0) goto L_0x03f0
            java.lang.String r5 = "forward_video_duration"
            long r13 = r8.getLong(r5, r2)
            X.0s5 r3 = r0.A0T
            X.0tC r2 = X.C15910s6.A1y
            int r2 = r3.A02(r2)
            long r2 = (long) r2
            r11 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r11
            int r5 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x03f0
            r0.A1T()
        L_0x03f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r2 = r10.contains(r2)
            if (r2 == 0) goto L_0x042e
            java.lang.String r2 = "forward_text_length"
            int r2 = r8.getInt(r2, r4)
        L_0x0400:
            if (r2 <= r7) goto L_0x042e
            long r2 = r0.A03
            r4 = 3500(0xdac, double:1.729E-320)
            long r2 = r2 + r4
            long r8 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x042e
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0.A03 = r2
            X.0pt r11 = r0.A0P
            X.013 r10 = r0.A1H
            r9 = 2131755373(0x7f10016d, float:1.9141623E38)
            r2 = 700(0x2bc, double:3.46E-321)
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r5 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r8[r5] = r4
            java.lang.String r2 = r10.A0J(r8, r9, r2)
            r11.A0H(r2, r15)
        L_0x042e:
            boolean r2 = r1.A0J()
            if (r2 == 0) goto L_0x00de
            r0.A2U = r15
            goto L_0x00de
        L_0x0438:
            boolean r4 = r0.A2o
            if (r4 == 0) goto L_0x042e
            java.util.HashSet r5 = r0.A2u
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x042e
            java.lang.String r4 = "send_max_video_duration"
            long r9 = r8.getLong(r4, r2)
            X.0s5 r3 = r0.A0T
            X.0tC r2 = X.C15910s6.A1y
            int r2 = r3.A02(r2)
            long r3 = (long) r2
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x042e
            r0.A1T()
            goto L_0x042e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1Z(android.view.View, X.0sH):void");
    }

    public void A1a(C101354xB r8) {
        Intent intent = new Intent("android.intent.action.SEND");
        String str = r8.A01;
        intent.putExtra("android.intent.extra.TEXT", str);
        String str2 = r8.A00;
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.setType("text/plain");
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        if (Build.VERSION.SDK_INT < 22) {
            C18010w0 r3 = this.A0e;
            r3.A01.A06(C52142dD.A01((String) null, 2, 3, r8.A02));
        }
        A0r(C52142dD.A00(A02(), str, str2, 3, r8.A02));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r14.A2i != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (X.AnonymousClass2JO.A01(r14.A0M, r4, r5.substring(r4.length())) == 1) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1b(X.C83584Hg r15) {
        /*
            r14 = this;
            r10 = r14
            X.2Rm r0 = r14.A0w
            java.util.List r4 = r15.A00
            r0.A02 = r4
            r0.notifyDataSetChanged()
            java.util.List r6 = r15.A01
            r5 = 8
            r3 = 0
            r2 = 8
            if (r6 != 0) goto L_0x0014
            r2 = 0
        L_0x0014:
            java.util.List r0 = r14.A2v
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L_0x001a
        L_0x002a:
            android.view.View r0 = r14.A08
            if (r0 == 0) goto L_0x0034
            if (r6 == 0) goto L_0x0031
            r5 = 0
        L_0x0031:
            r0.setVisibility(r5)
        L_0x0034:
            boolean r0 = r14.A2l
            if (r0 != 0) goto L_0x003c
            boolean r0 = r14.A2e
            if (r0 == 0) goto L_0x0055
        L_0x003c:
            if (r6 != 0) goto L_0x003f
            r3 = 1
        L_0x003f:
            android.widget.ListView r0 = r14.A0G
            if (r0 == 0) goto L_0x0055
            r0.setFastScrollEnabled(r3)
            android.widget.ListView r0 = r14.A0G
            r0.setFastScrollAlwaysVisible(r3)
            android.widget.ListView r1 = r14.A0G
            r0 = 0
            if (r3 == 0) goto L_0x0052
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0052:
            r1.setScrollBarStyle(r0)
        L_0x0055:
            boolean r0 = r14.A2l
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0060
            boolean r0 = r14.A2i
            r1 = 0
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r1 = 1
        L_0x0061:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00d5
            if (r1 == 0) goto L_0x00d5
            X.0pd r4 = r14.A1d
            r1 = 1663(0x67f, float:2.33E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r13 = r14.A2B
            java.lang.String r0 = r14.A29
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r14.A2B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009d
            java.lang.String r4 = r14.A2B
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r4.replaceAll(r1, r0)
            int r1 = r5.length()
            r0 = 5
            if (r1 >= r0) goto L_0x00d6
            java.lang.String r0 = "contactpicker/isvalidnumber/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x009d:
            java.lang.String r0 = "contactpicker/fetchContactUsingPhoneNumber/invalidnumber"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r14.A2B
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = 0
        L_0x00b1:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00d5
            X.37G r0 = r14.A10
            if (r0 == 0) goto L_0x00c1
            r0.A06(r3)
            r0 = 0
            r14.A10 = r0
        L_0x00c1:
            X.0ug r12 = r14.A1n
            X.1Au r11 = r14.A16
            X.0sG r9 = r14.A0m
            X.37G r8 = new X.37G
            r8.<init>(r9, r10, r11, r12, r13)
            r14.A10 = r8
            X.0sq r1 = r14.A24
            java.lang.Void[] r0 = new java.lang.Void[r2]
            r1.Acn(r8, r0)
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x009d
            java.lang.String r4 = r1.group(r3)
            int r0 = r4.length()
            java.lang.String r1 = r5.substring(r0)
            X.1G1 r0 = r14.A0M
            int r0 = X.AnonymousClass2JO.A01(r0, r4, r1)
            if (r0 != r3) goto L_0x009d
        L_0x00fa:
            java.lang.String r0 = r14.A29
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b1
            java.lang.String r1 = r14.A2B
            java.lang.String r0 = r14.A29
            int r9 = java.lang.Integer.parseInt(r0)
            X.1Mf r5 = X.C26071Mf.A00()
            java.lang.String r4 = "phonenumberutil/isValidNumber"
            java.lang.String r8 = "+"
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r13 = 0
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "\\D"
            java.lang.String r6 = ""
            java.lang.String r1 = r1.replaceAll(r0, r6)
            java.lang.String r0 = "^0+(?!$)"
            java.lang.String r7 = r1.replaceFirst(r0, r6)
            int r1 = r7.length()
            r0 = 5
            if (r1 >= r0) goto L_0x0135
            java.lang.String r0 = "phonenumberutil/formatEnteredNumber/too-short-number"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00b1
        L_0x0135:
            boolean r0 = r7.startsWith(r8)     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r6 = "ZZ"
            if (r0 == 0) goto L_0x014f
            X.3HS r1 = r5.A0E(r7, r6)     // Catch:{ 43m | RuntimeException -> 0x018b }
        L_0x0141:
            boolean r0 = r5.A0L(r1)     // Catch:{ 43m | RuntimeException -> 0x018b }
            if (r0 == 0) goto L_0x00b1
            X.40u r0 = X.C796640u.E164     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r13 = r5.A0G(r0, r1)     // Catch:{ 43m | RuntimeException -> 0x018b }
            goto L_0x00b1
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.<init>()     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.append(r8)     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.append(r9)     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.append(r7)     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r1 = r0.toString()     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r0 = r5.A0F(r9)     // Catch:{ 43m | RuntimeException -> 0x018b }
            X.3HS r1 = r5.A0E(r1, r0)     // Catch:{ 43m | RuntimeException -> 0x018b }
            boolean r0 = r5.A0L(r1)     // Catch:{ 43m | RuntimeException -> 0x018b }
            if (r0 == 0) goto L_0x0177
            X.40u r0 = X.C796640u.E164     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r13 = r5.A0G(r0, r1)     // Catch:{ 43m | RuntimeException -> 0x018b }
            goto L_0x00b1
        L_0x0177:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.<init>()     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.append(r8)     // Catch:{ 43m | RuntimeException -> 0x018b }
            r0.append(r7)     // Catch:{ 43m | RuntimeException -> 0x018b }
            java.lang.String r0 = r0.toString()     // Catch:{ 43m | RuntimeException -> 0x018b }
            X.3HS r1 = r5.A0E(r0, r6)     // Catch:{ 43m | RuntimeException -> 0x018b }
            goto L_0x0141
        L_0x018b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1b(X.4Hg):void");
    }

    public void A1c(AnonymousClass4NB r3) {
        List list;
        this.A2M = r3.A00;
        this.A2Q = r3.A03;
        this.A2N = r3.A01;
        this.A2O = r3.A02;
        if (this.A2n && (list = r3.A04) != null) {
            A1h(list);
        }
        MenuItem menuItem = this.A05;
        if (menuItem != null) {
            menuItem.setVisible(!this.A2M.isEmpty());
        }
        A1N();
    }

    public void A1d(C16010sH r5) {
        if (this.A14.A04.A0E(C16620tM.A02, 1666)) {
            C206210w r1 = this.A15;
            if (!r1.A00.A0G()) {
                C16320sq r3 = r1.A07;
                RunnableRunnableShape5S0200000_I0_3 runnableRunnableShape5S0200000_I0_3 = new RunnableRunnableShape5S0200000_I0_3(r1, 2, r5);
                StringBuilder sb = new StringBuilder("ContactDiscoverySyncHelper/syncOutContact");
                sb.append(r5.A0E);
                r3.Acm(runnableRunnableShape5S0200000_I0_3, sb.toString());
            }
        }
        A1f(C24561Gk.A01(r5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x029d, code lost:
        if (r18 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1e(X.C16010sH r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.A2K
            r13 = 0
            if (r1 == 0) goto L_0x003c
            X.0sj r1 = r0.A1F
            boolean r1 = r1.A0B()
            if (r1 != 0) goto L_0x003c
            X.4uj r3 = r0.A0x
            X.00l r10 = r0.A0D()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L_0x0031
            r12 = 2131890768(0x7f121250, float:1.9416237E38)
        L_0x001e:
            r11 = 2131890769(0x7f121251, float:1.941624E38)
            r14 = 0
            r15 = 0
            r16 = 0
            android.content.Intent r2 = com.obwhatsapp.RequestPermissionActivity.A02(r10, r11, r12, r13, r14, r15, r16)
            r1 = 151(0x97, float:2.12E-43)
            X.1ZA r0 = r3.A00
            r0.Ag3(r2, r1)
        L_0x0030:
            return
        L_0x0031:
            r0 = 33
            r12 = 2131890771(0x7f121253, float:1.9416243E38)
            if (r1 >= r0) goto L_0x001e
            r12 = 2131890770(0x7f121252, float:1.9416241E38)
            goto L_0x001e
        L_0x003c:
            java.util.Map r3 = r0.A2w
            int r1 = r3.size()
            r12 = 1
            if (r1 != r12) goto L_0x006e
            java.util.Collection r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            X.0sH r1 = (X.C16010sH) r1
            X.0rv r1 = r1.A0E
            boolean r1 = X.C16030sJ.A0Q(r1)
            if (r1 != 0) goto L_0x006e
            java.util.Collection r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            X.0sH r1 = (X.C16010sH) r1
            r0.A1W = r1
            r3.clear()
        L_0x006e:
            X.4uj r1 = r0.A0x
            r2 = -1
            X.1ZA r1 = r1.A00
            r1.setResult(r2)
            X.0sH r2 = r0.A1W
            if (r2 != 0) goto L_0x029c
            if (r18 == 0) goto L_0x0245
            r2 = r18
        L_0x007e:
            r7 = 1
        L_0x007f:
            X.0rv r3 = r2.A0E
            boolean r1 = X.C16030sJ.A0Q(r3)
            r1 = r1 ^ 1
            X.AnonymousClass00B.A0G(r1)
            java.util.ArrayList r1 = r0.A2K
            if (r1 == 0) goto L_0x0106
            android.os.Bundle r3 = r0.A1C()
            android.content.Context r1 = r0.A0u()
            android.content.Intent r6 = X.C14750ph.A08(r1, r13)
            X.0rv r1 = r2.A0E
            X.AnonymousClass00B.A06(r1)
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "jid"
            r6.putExtra(r1, r2)
            byte r2 = r0.A00
            java.lang.String r1 = "wa_type"
            r6.putExtra(r1, r2)
            java.lang.String r1 = "has_share"
            r6.putExtra(r1, r12)
            java.lang.String r2 = r0.A2C
            java.lang.String r1 = "extra_deep_link_session_id"
            r6.putExtra(r1, r2)
            X.3BB r1 = r0.A1L
            android.os.Bundle r2 = r1.A00()
            java.lang.String r1 = "ctwa_deeplink_content"
            r6.putExtra(r1, r2)
            r0.A1X(r6)
            java.lang.String r2 = "skip_preview"
            boolean r1 = r3.getBoolean(r2, r13)
            r6.putExtra(r2, r1)
            java.lang.String r2 = "origin"
            int r1 = r3.getInt(r2, r13)
            r6.putExtra(r2, r1)
            java.lang.String r2 = "android.intent.extra.TEXT"
            java.lang.String r1 = r3.getString(r2)
            r6.putExtra(r2, r1)
            java.util.ArrayList r2 = r0.A2K
            java.lang.String r1 = "android.intent.extra.STREAM"
            r6.putParcelableArrayListExtra(r1, r2)
        L_0x00ed:
            r1 = 335544320(0x14000000, float:6.4623485E-27)
            r6.addFlags(r1)
        L_0x00f2:
            android.content.Context r1 = r0.A0u()
            X.C51382ba.A00(r1, r6)
            java.lang.String r1 = "ContactPickerFragment:shareIntent"
            X.AnonymousClass22U.A00(r6, r1)
        L_0x00fe:
            X.4uj r0 = r0.A0x
            X.1ZA r0 = r0.A00
            r0.A2X(r6, r12)
            return
        L_0x0106:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r3)
            if (r1 == 0) goto L_0x0181
            java.lang.String r1 = r0.A2A
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0181
            java.lang.String r1 = r0.A2I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0181
            X.0ph r6 = new X.0ph
            r6.<init>()
            android.content.Context r5 = r0.A02()
            boolean r1 = r0.A2R
            r9 = r1 ^ 1
            boolean r8 = r0.A2V
            byte r10 = r0.A00
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r2.A08(r1)
            X.AnonymousClass00B.A06(r4)
            X.0rv r4 = (X.C15830rv) r4
            java.lang.String r3 = r0.A2A
            X.3BB r1 = r0.A1L
            android.os.Bundle r2 = r1.A00()
            android.content.Intent r6 = r6.A0x(r5, r4)
            java.lang.String r1 = "wa_type"
            r6.putExtra(r1, r10)
            java.lang.String r1 = "has_share"
            r6.putExtra(r1, r12)
            java.lang.String r1 = "confirm"
            r6.putExtra(r1, r9)
            java.lang.String r1 = "text_from_url"
            r6.putExtra(r1, r8)
            java.lang.String r1 = "number_from_url"
            r6.putExtra(r1, r7)
            java.lang.String r1 = "iq_code"
            r6.putExtra(r1, r3)
            java.lang.String r3 = "ctwa_deeplink_content"
            r6.putExtra(r3, r2)
            X.C51382ba.A00(r5, r6)
            java.lang.String r2 = r0.A2C
            java.lang.String r1 = "extra_deep_link_session_id"
            r6.putExtra(r1, r2)
            X.3BB r1 = r0.A1L
            android.os.Bundle r1 = r1.A00()
            r6.putExtra(r3, r1)
        L_0x017c:
            r0.A1X(r6)
            goto L_0x00f2
        L_0x0181:
            java.lang.String r1 = r0.A2F
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01e2
            X.0ph r6 = new X.0ph
            r6.<init>()
            android.content.Context r5 = r0.A02()
            boolean r1 = r0.A2R
            r9 = r1 ^ 1
            boolean r8 = r0.A2V
            java.lang.String r4 = r0.A2F
            byte r3 = r0.A00
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r2.A08(r1)
            X.AnonymousClass00B.A06(r1)
            X.0rv r1 = (X.C15830rv) r1
            android.content.Intent r6 = r6.A0x(r5, r1)
            java.lang.String r1 = "wa_type"
            r6.putExtra(r1, r3)
            java.lang.String r1 = "share_msg"
            r6.putExtra(r1, r4)
            java.lang.String r1 = "has_share"
            r6.putExtra(r1, r12)
            java.lang.String r1 = "confirm"
            r6.putExtra(r1, r9)
            java.lang.String r1 = "text_from_url"
            r6.putExtra(r1, r8)
            java.lang.String r1 = "number_from_url"
            r6.putExtra(r1, r7)
            X.C51382ba.A00(r5, r6)
            java.lang.String r2 = r0.A2C
            java.lang.String r1 = "extra_deep_link_session_id"
            r6.putExtra(r1, r2)
            X.3BB r1 = r0.A1L
            android.os.Bundle r2 = r1.A00()
            java.lang.String r1 = "ctwa_deeplink_content"
            r6.putExtra(r1, r2)
            goto L_0x017c
        L_0x01e2:
            java.lang.String r1 = r0.A2G
            if (r1 == 0) goto L_0x0222
            android.content.Context r1 = r0.A0u()
            android.content.Intent r6 = X.C14750ph.A08(r1, r13)
            X.0rv r1 = r2.A0E
            X.AnonymousClass00B.A06(r1)
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "jid"
            r6.putExtra(r1, r2)
            java.lang.String r2 = r0.A2G
            java.lang.String r1 = "vcard_str"
            r6.putExtra(r1, r2)
            java.lang.String r2 = r0.A2H
            java.lang.String r1 = "vcard_name"
            r6.putExtra(r1, r2)
        L_0x020c:
            byte r2 = r0.A00
            java.lang.String r1 = "wa_type"
            r6.putExtra(r1, r2)
            java.lang.String r1 = "has_share"
            r6.putExtra(r1, r12)
            java.lang.String r2 = r0.A2C
            java.lang.String r1 = "extra_deep_link_session_id"
            r6.putExtra(r1, r2)
            goto L_0x00ed
        L_0x0222:
            java.util.ArrayList r1 = r0.A2L
            if (r1 == 0) goto L_0x0315
            android.content.Context r1 = r0.A0u()
            android.content.Intent r6 = X.C14750ph.A08(r1, r13)
            X.0rv r1 = r2.A0E
            X.AnonymousClass00B.A06(r1)
            java.lang.String r2 = r1.getRawString()
            java.lang.String r1 = "jid"
            r6.putExtra(r1, r2)
            java.util.ArrayList r2 = r0.A2L
            java.lang.String r1 = "vcard_array_str"
            r6.putStringArrayListExtra(r1, r2)
            goto L_0x020c
        L_0x0245:
            java.util.List r9 = r0.A1I()
            java.lang.String r1 = r0.A2F
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r1 != 0) goto L_0x02a1
            int r1 = r3.size()
            if (r1 != r12) goto L_0x031e
            java.util.Collection r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            X.0sH r1 = (X.C16010sH) r1
            X.0rv r1 = r1.A0E
            boolean r1 = X.C16030sJ.A0Q(r1)
            if (r1 == 0) goto L_0x031e
            android.content.Context r2 = r0.A0u()
            java.lang.String r5 = r0.A2F
            X.1m6 r4 = r0.A1U
            r1 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity"
            r6.setClassName(r2, r1)
            java.lang.String r1 = "status_distribution"
            r6.putExtra(r1, r4)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r6.putExtra(r1, r5)
            java.lang.String r1 = "entry_point"
            r6.putExtra(r1, r3)
            goto L_0x00fe
        L_0x029c:
            r7 = 0
            if (r18 == 0) goto L_0x007f
            goto L_0x007e
        L_0x02a1:
            java.lang.String r8 = r0.A2G
            if (r8 == 0) goto L_0x02cf
            X.0tb r5 = r0.A0X
            java.lang.String r7 = r0.A2H
            r10 = 0
            r5.A0S(r6, r7, r8, r9, r10)
        L_0x02ad:
            X.4uj r1 = r0.A0x
            X.1ZA r1 = r1.A00
            r1.Agv(r9)
            int r1 = r3.size()
            if (r1 <= r12) goto L_0x02c9
            X.4uj r3 = r0.A0x
            X.00l r1 = r0.A0D()
            android.content.Intent r2 = X.C14750ph.A03(r1)
            X.1ZA r1 = r3.A00
            r1.A2X(r2, r13)
        L_0x02c9:
            X.4uj r0 = r0.A0x
            r0.A00()
            return
        L_0x02cf:
            java.util.ArrayList r2 = r0.A2L
            if (r2 == 0) goto L_0x02d9
            X.0tb r1 = r0.A0X
            r1.A0T(r6, r9, r2, r13)
            goto L_0x02ad
        L_0x02d9:
            java.util.ArrayList r1 = r0.A2K
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0030
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x0030
            android.os.Bundle r2 = r0.A1C()
            X.10X r3 = r0.A0S
            java.util.ArrayList r10 = r0.A2K
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r8 = r2.getString(r1)
            java.lang.String r1 = "origin"
            int r11 = r2.getInt(r1, r13)
            java.lang.String r1 = "skip_preview"
            boolean r13 = r2.getBoolean(r1, r13)
            X.00l r4 = r0.A0D()
            X.4uj r5 = r0.A0x
            X.1m6 r7 = r0.A1U
            X.4us r6 = new X.4us
            r6.<init>(r0, r9)
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0315:
            X.0pt r1 = r0.A0P
            r0 = 2131892603(0x7f12197b, float:1.9419959E38)
            r1.A09(r0, r13)
            return
        L_0x031e:
            X.4uj r2 = r0.A0x
            java.lang.String r1 = r0.A2F
            boolean r0 = r0.A2V
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r0 = com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment.A01(r1, r9, r0)
            r2.Afb(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1e(X.0sH):void");
    }

    public final void A1f(String str) {
        AnonymousClass1BJ r6 = this.A0V;
        Activity A002 = C19980zJ.A00(A0u());
        StringBuilder sb = new StringBuilder("sms:");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        String A0K2 = A0K(R.string.str179b, "https://whatsapp.com/dl/");
        int i2 = 14;
        if (this.A2e) {
            i2 = 15;
        }
        r6.A00(A002, parse, Integer.valueOf(i2), A0K2);
    }

    public void A1g(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16010sH r3 = (C16010sH) it.next();
            CharSequence A002 = C16080sP.A00(A0u(), this.A1H, r3);
            arrayList.add(new C93514jK(A002 != null ? A002.toString() : null, C24561Gk.A01(r3)));
        }
        if (!arrayList.isEmpty()) {
            PhoneNumberSelectionDialog A012 = PhoneNumberSelectionDialog.A01(A0K(R.string.str0d32, str), arrayList);
            AnonymousClass050 r1 = new AnonymousClass050(A0F());
            r1.A0C(A012, "phone_number_selection_dialog");
            r1.A02();
        }
    }

    public void A1h(List list) {
    }

    public boolean A1i() {
        return true;
    }

    public boolean A1j() {
        return (this.A2l || this.A2e) && (this.A0Q.A0G() ^ true);
    }

    public boolean A1k() {
        return this.A2l;
    }

    public boolean A1l() {
        return this.A2l || this.A2e;
    }

    public boolean A1m() {
        return this.A2l || this.A2e;
    }

    public boolean A1n() {
        return this.A2d || this.A2e || this.A2l || this.A2h;
    }

    public boolean A1o() {
        return false;
    }

    public boolean A1p() {
        if (this.A2l && this.A14.A04.A0E(C16620tM.A02, 1666)) {
            C220516l r0 = this.A14;
            r0.A05.A06(new C74153pw());
        }
        Intent intent = new Intent();
        intent.putExtra("jids", C16030sJ.A06(A1I()));
        this.A1t.A01(intent, this.A1U);
        if (this.A2k) {
            intent.putExtra("all_contacts_count", this.A2M.size());
        }
        this.A0x.A00.setResult(0, intent);
        AnonymousClass267 r02 = this.A0R;
        if (r02 == null || !r02.A06()) {
            if (this.A2i) {
                this.A20.A00(true, this.A2w.size());
            }
            return false;
        }
        this.A0R.A05(true);
        return true;
    }

    public boolean A1q() {
        return false;
    }

    public boolean A1r() {
        return this.A2d || this.A2p || this.A2e || this.A2l || this.A2h;
    }

    public boolean A1s() {
        return this.A2l || this.A2e || this.A2d;
    }

    public final boolean A1t() {
        for (C16010sH r0 : this.A2w.values()) {
            if (C16030sJ.A0Q(r0.A0E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r1.A09((com.whatsapp.jid.GroupJid) r0) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r6.A2R != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r6.A2L == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1u(android.content.Intent r7, X.C16010sH r8) {
        /*
            r6 = this;
            java.lang.String r0 = "contactpicker/picked "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r8.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r8.A08(r4)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.01Y r0 = r6.A0a
            boolean r0 = r0.A0V(r2)
            r3 = 1
            if (r0 != 0) goto L_0x004f
            r6.A1W = r8
            boolean r0 = r6.A2q
            if (r0 != 0) goto L_0x0036
            boolean r0 = r6.A2i
            if (r0 != 0) goto L_0x0036
            boolean r0 = r6.A2o
            if (r0 != 0) goto L_0x0036
            boolean r0 = r6.A2p
            if (r0 == 0) goto L_0x0050
        L_0x0036:
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0050
            X.0sO r1 = r6.A1R
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r8.A08(r0)
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            return r3
        L_0x0050:
            boolean r0 = r6.A2f
            if (r0 == 0) goto L_0x006d
            X.0yv r2 = r6.A0Y
            X.0tz r0 = r2.A08
            android.content.Context r1 = r0.A00
            X.04S r0 = r2.A00(r8, r3, r3)
            android.content.Intent r1 = X.AnonymousClass04T.A01(r1, r0)
            X.4uj r0 = r6.A0x
            r0.A01(r1)
        L_0x0067:
            X.4uj r0 = r6.A0x
            r0.A00()
            return r3
        L_0x006d:
            boolean r0 = r6.A2q
            r5 = 0
            if (r0 == 0) goto L_0x00f6
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r6.A1x
            boolean r0 = r0.A05(r2)
            if (r0 != 0) goto L_0x004f
            com.obwhatsapp.countrygating.viewmodel.CountryGatingViewModel r0 = r6.A1I
            boolean r0 = r0.A05(r2)
            if (r0 != 0) goto L_0x004f
            java.util.ArrayList r0 = r6.A2K
            r4 = 0
            if (r0 == 0) goto L_0x00de
            android.os.Bundle r1 = r6.A1C()
            java.lang.String r0 = "skip_preview"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x00b4
            java.util.ArrayList r2 = r6.A2K
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x00bc
            java.util.Iterator r2 = r2.iterator()
        L_0x00a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r2.next()
            android.net.Uri r1 = (android.net.Uri) r1
            X.0vv r0 = r6.A1m
            byte r0 = r0.A00(r1)
            if (r0 == r3) goto L_0x00a0
        L_0x00b4:
            X.00l r0 = r6.A0C()
            X.AnonymousClass29T.A01(r0, r3)
            return r3
        L_0x00bc:
            X.0vv r1 = r6.A1m
            java.lang.Object r0 = r2.get(r5)
            android.net.Uri r0 = (android.net.Uri) r0
            byte r1 = r1.A00(r0)
            r0 = 9
            if (r1 != r0) goto L_0x00d9
            X.0pd r2 = r6.A1d
            r1 = 1750(0x6d6, float:2.452E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0176
            goto L_0x00b4
        L_0x00d9:
            if (r1 == r3) goto L_0x0176
            if (r1 == r0) goto L_0x0176
            goto L_0x00b4
        L_0x00de:
            java.lang.String r0 = r6.A2F
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00ed
            boolean r0 = r6.A2R
            if (r0 == 0) goto L_0x0176
            goto L_0x00b4
        L_0x00ed:
            java.lang.String r0 = r6.A2G
            if (r0 != 0) goto L_0x00b4
            java.util.ArrayList r0 = r6.A2L
            if (r0 == 0) goto L_0x004f
            goto L_0x00b4
        L_0x00f6:
            boolean r0 = r6.A2i
            if (r0 == 0) goto L_0x0103
            X.00l r1 = r6.A0C()
            r0 = 2
        L_0x00ff:
            X.AnonymousClass29T.A01(r1, r0)
            return r3
        L_0x0103:
            boolean r0 = r6.A2p
            if (r0 == 0) goto L_0x010d
            X.00l r1 = r6.A0C()
            r0 = 3
            goto L_0x00ff
        L_0x010d:
            boolean r0 = r6.A2h
            if (r0 == 0) goto L_0x0130
            com.whatsapp.jid.Jid r0 = r8.A08(r4)
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.obwhatsapp.contact.picker.invite.InviteToGroupCallConfirmationFragment r2 = com.obwhatsapp.contact.picker.invite.InviteToGroupCallConfirmationFragment.A01(r0)
            X.02C r0 = r6.A0F()
            X.050 r1 = new X.050
            r1.<init>(r0)
            java.lang.String r0 = "InviteParticipantConfirmationDialog"
            r1.A0C(r2, r0)
            r1.A02()
            return r3
        L_0x0130:
            boolean r0 = r6.A2e
            if (r0 == 0) goto L_0x0170
            if (r7 == 0) goto L_0x0170
        L_0x0136:
            X.1ko r0 = r8.A0D
            if (r0 == 0) goto L_0x0143
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0143
            r5 = 1
        L_0x0143:
            r1 = r5 ^ 1
            java.lang.String r0 = "contact_out_address_book"
            r7.putExtra(r0, r1)
            if (r5 != 0) goto L_0x015b
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = "non_contact"
            r7.putExtra(r1, r0)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r7.putExtra(r1, r0)
        L_0x015b:
            X.0rv r0 = r8.A0E
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "contact"
            r7.putExtra(r0, r1)
            X.4uj r0 = r6.A0x
            r0.A01(r7)
            goto L_0x0067
        L_0x0170:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            goto L_0x0136
        L_0x0176:
            r6.A1e(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPickerFragment.A1u(android.content.Intent, X.0sH):boolean");
    }

    public boolean A1v(C16010sH r2) {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C16010sH AAn;
        AnonymousClass2XJ r0 = (AnonymousClass2XJ) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (r0 != null && (AAn = r0.AAn()) != null && this.A0a.A0V((UserJid) AAn.A08(UserJid.class))) {
            contextMenu.add(0, 0, 0, A0K(R.string.str0236, this.A0r.A08(AAn)));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }
}
