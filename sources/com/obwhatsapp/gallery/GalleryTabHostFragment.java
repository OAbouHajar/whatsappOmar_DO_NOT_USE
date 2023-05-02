package com.obwhatsapp.gallery;

import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass013;
import X.AnonymousClass01X;
import X.AnonymousClass02C;
import X.AnonymousClass1DV;
import X.AnonymousClass29Q;
import X.AnonymousClass2BF;
import X.AnonymousClass2KC;
import X.AnonymousClass2OM;
import X.AnonymousClass2SR;
import X.C001000l;
import X.C004601z;
import X.C011005f;
import X.C015507l;
import X.C14640pW;
import X.C14710pd;
import X.C15220qW;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C16980tz;
import X.C18450wi;
import X.C23651Cv;
import X.C29251aI;
import X.C447725m;
import X.C455529g;
import X.C50452Zp;
import X.C54342hH;
import X.C54352hI;
import X.C54362hJ;
import X.C54372hK;
import X.C54382hM;
import X.C54392hN;
import X.C54422hU;
import X.C54432hV;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxCListenerShape323S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaMediaThumbnailView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class GalleryTabHostFragment extends Hilt_GalleryTabHostFragment implements C015507l, C50452Zp {
    public long A00;
    public View A01;
    public ViewGroup A02;
    public Toolbar A03;
    public RecyclerView A04;
    public ViewPager A05;
    public C23651Cv A06;
    public C16440t3 A07;
    public C16980tz A08;
    public AnonymousClass013 A09;
    public C14710pd A0A;
    public C16320sq A0B;
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final C15220qW A0D = new AnonymousClass1DV(new C54342hH(this));
    public final C15220qW A0E = new AnonymousClass1DV(new C54352hI(this));

    public static final View A01(ViewGroup viewGroup) {
        C18450wi.A0H(viewGroup, 0);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sb = new StringBuilder("Index: ");
        sb.append(0);
        sb.append(", Size: ");
        sb.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public void A0o(boolean z2) {
        ViewPager viewPager;
        super.A0o(z2);
        if (this.A0K.A02.A00(C011005f.RESUMED) && (viewPager = this.A05) != null) {
            viewPager.setCurrentItem(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0x(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            X.00l r1 = r8.A0C()
            boolean r0 = r1 instanceof X.C14640pW
            if (r0 == 0) goto L_0x0019
            X.0pW r1 = (X.C14640pW) r1
            if (r1 == 0) goto L_0x0019
            X.1aI r1 = r1.AAQ()
            if (r1 == 0) goto L_0x0019
            X.0pN r0 = r1.A0A
            if (r0 == 0) goto L_0x0019
            r1.A0I(r9, r10, r11)
        L_0x0019:
            r0 = 101(0x65, float:1.42E-43)
            r1 = -1
            if (r9 != r0) goto L_0x00ce
            if (r10 == r1) goto L_0x00b3
            if (r10 == 0) goto L_0x00af
            r0 = 1
            if (r10 != r0) goto L_0x0123
            if (r11 == 0) goto L_0x0123
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r1 = r11.getParcelableArrayListExtra(r0)
            if (r1 != 0) goto L_0x007f
            r7 = 0
        L_0x0030:
            X.2hK r0 = r8.A1F()
            if (r0 == 0) goto L_0x0123
            if (r7 == 0) goto L_0x0123
            X.0qW r0 = r0.A05
            java.lang.Object r6 = r0.getValue()
            com.obwhatsapp.gallery.GalleryRecentsFragment r6 = (com.obwhatsapp.gallery.GalleryRecentsFragment) r6
            int r1 = r7.size()
            java.util.Map r5 = r6.A07
            int r0 = r5.size()
            if (r1 == r0) goto L_0x0123
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L_0x0059
        L_0x007f:
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            goto L_0x008e
        L_0x00a0:
            java.util.Set r7 = X.C003101j.A0F(r2)
            goto L_0x0030
        L_0x00a5:
            r5.clear()
            r5.putAll(r4)
            r6.A1N()
            return
        L_0x00af:
            r8.A1G()
            return
        L_0x00b3:
            X.00l r1 = r8.A0C()
            boolean r0 = r1 instanceof com.obwhatsapp.camera.CameraActivity
            if (r0 == 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00c0
            r1.finish()
        L_0x00c0:
            X.00l r1 = r8.A0C()
            boolean r0 = r1 instanceof com.obwhatsapp.gallerypicker.GalleryPicker
            if (r0 == 0) goto L_0x0123
            if (r1 == 0) goto L_0x0123
            r1.finish()
            return
        L_0x00ce:
            r0 = 91
            if (r9 != r0) goto L_0x00fd
            if (r10 != r1) goto L_0x0123
            boolean r0 = r8.A1M()
            if (r0 == 0) goto L_0x0119
            if (r11 == 0) goto L_0x0123
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r2 = r11.getParcelableArrayListExtra(r0)
            if (r2 != 0) goto L_0x00f3
            android.net.Uri r1 = r11.getData()
            if (r1 == 0) goto L_0x0123
            r0 = 1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r2.add(r1)
        L_0x00f3:
            android.content.Intent r1 = r8.A1C(r2)
            r0 = 90
            r8.startActivityForResult(r1, r0)
            return
        L_0x00fd:
            r0 = 90
            if (r9 != r0) goto L_0x0123
            if (r10 == r1) goto L_0x0119
            r1 = 2
            if (r10 != r1) goto L_0x0123
            X.00l r0 = r8.A0C()
            if (r0 == 0) goto L_0x010f
            r0.setResult(r1)
        L_0x010f:
            X.00l r0 = r8.A0C()
            if (r0 == 0) goto L_0x0123
            r0.finish()
            return
        L_0x0119:
            X.00l r0 = r8.A0C()
            if (r0 == 0) goto L_0x010f
            r0.setResult(r1, r11)
            goto L_0x010f
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryTabHostFragment.A0x(int, int, android.content.Intent):void");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout02b4, viewGroup, false);
        C18450wi.A0B(inflate);
        return inflate;
    }

    public void A13() {
        List list;
        super.A13();
        ((AnonymousClass2OM) this.A0D.getValue()).A00();
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            viewPager.setAdapter((AnonymousClass012) null);
        }
        ViewPager viewPager2 = this.A05;
        if (!(viewPager2 == null || (list = viewPager2.A0c) == null)) {
            list.remove(this);
        }
        this.A05 = null;
        this.A02 = null;
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass01X) null);
        }
        this.A04 = null;
        this.A03 = null;
    }

    public void A18(Bundle bundle, View view) {
        ViewPager viewPager;
        Intent intent;
        int intExtra;
        C14640pW r2;
        C18450wi.A0H(view, 0);
        if (this.A07 != null) {
            this.A00 = System.currentTimeMillis();
            ViewPager viewPager2 = (ViewPager) view.findViewById(R.id.gallery_view_pager);
            C004601z.A0p(viewPager2, true);
            C001000l A0C2 = A0C();
            C29251aI r7 = null;
            if ((A0C2 instanceof C14640pW) && (r2 = (C14640pW) A0C2) != null) {
                r7 = r2.AAQ();
            }
            Resources resources = A1D().A00.getResources();
            Bundle bundle2 = this.A05;
            int i2 = 7;
            if (bundle2 != null) {
                i2 = bundle2.getInt("include", 7);
            }
            AnonymousClass02C A0F = A0F();
            C18450wi.A0B(resources);
            viewPager2.setAdapter(new C54372hK(resources, A0F, r7, this, i2));
            viewPager2.A0G(this);
            this.A05 = viewPager2;
            ((TabLayout) view.findViewById(R.id.gallery_tab_layout)).setupWithViewPager(this.A05);
            this.A02 = (ViewGroup) view.findViewById(R.id.gallery_selected_container);
            View findViewById = view.findViewById(R.id.toolbar);
            C18450wi.A0B(findViewById);
            Toolbar toolbar = (Toolbar) findViewById;
            this.A03 = toolbar;
            Drawable A022 = AnonymousClass2SR.A02(toolbar.getContext(), R.drawable.ic_back, R.color.color045e);
            C18450wi.A0B(A022);
            AnonymousClass013 r22 = this.A09;
            if (r22 != null) {
                toolbar.setNavigationIcon((Drawable) new C447725m(A022, r22));
                toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 3));
                toolbar.setTitleTextColor(AnonymousClass00T.A00(toolbar.getContext(), R.color.color045f));
                Menu menu = toolbar.getMenu();
                C18450wi.A0B(menu);
                SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
                C18450wi.A0F(subMenu);
                C18450wi.A0B(subMenu);
                Bundle bundle3 = this.A05;
                int i3 = 7;
                if (bundle3 != null) {
                    i3 = bundle3.getInt("include", 7);
                }
                C54432hV r3 = new C54432hV(this, A1D(), new C54422hU(subMenu, this), i3);
                C16320sq r23 = this.A0B;
                if (r23 != null) {
                    r23.Ack(r3, new Void[0]);
                    toolbar.A0R = new IDxCListenerShape323S0100000_2_I0(this, 3);
                    C001000l A0C3 = A0C();
                    if ((A0C3 == null || (intent = A0C3.getIntent()) == null || !((intExtra = intent.getIntExtra("origin", 1)) == 2 || intExtra == 15 || intExtra == 18 || intExtra == 7 || intExtra == 8 || intExtra == 12 || intExtra == 13)) && (viewPager = this.A05) != null) {
                        viewPager.A0F(1, false);
                    }
                    C18450wi.A0B(view.getContext());
                    View findViewById2 = view.findViewById(R.id.gallery_selected_media);
                    C18450wi.A0B(findViewById2);
                    RecyclerView recyclerView = (RecyclerView) findViewById2;
                    this.A04 = recyclerView;
                    recyclerView.A0h = true;
                    recyclerView.setAdapter((AnonymousClass01X) this.A0E.getValue());
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                    linearLayoutManager.A1P(0);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    View findViewById3 = view.findViewById(R.id.gallery_done_btn);
                    C18450wi.A0B(findViewById3);
                    this.A01 = findViewById3;
                    findViewById3.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 2));
                    return;
                }
                C18450wi.A0O("waWorkers");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C18450wi.A0O("whatsAppLocale");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C18450wi.A0O("time");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final int A1B() {
        Intent intent;
        C001000l A0C2 = A0C();
        if (A0C2 == null || (intent = A0C2.getIntent()) == null) {
            C14710pd r2 = this.A0A;
            if (r2 != null) {
                return r2.A03(C16620tM.A02, 2614);
            }
            C18450wi.A0O("abProps");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C14710pd r22 = this.A0A;
        if (r22 != null) {
            return intent.getIntExtra("max_items", r22.A03(C16620tM.A02, 2614));
        }
        C18450wi.A0O("abProps");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final Intent A1C(ArrayList arrayList) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        C001000l A0C2 = A0C();
        int i2 = 1;
        if (!(A0C2 == null || (intent7 = A0C2.getIntent()) == null)) {
            i2 = intent7.getIntExtra("origin", 1);
        }
        AnonymousClass2KC r5 = new AnonymousClass2KC(A0D());
        if (this.A07 != null) {
            r5.A04 = System.currentTimeMillis() - this.A00;
            C001000l A0C3 = A0C();
            boolean z2 = false;
            if (!(A0C3 == null || (intent6 = A0C3.getIntent()) == null)) {
                z2 = intent6.getBooleanExtra("number_from_url", false);
            }
            r5.A0F = z2;
            C001000l A0C4 = A0C();
            String str = null;
            if (!(A0C4 == null || (intent5 = A0C4.getIntent()) == null)) {
                str = intent5.getStringExtra("jid");
            }
            r5.A0A = str;
            r5.A01 = A1B() - ((C54362hJ) this.A0E.getValue()).A02.size();
            C001000l A0C5 = A0C();
            boolean z3 = false;
            if (!(A0C5 == null || (intent4 = A0C5.getIntent()) == null)) {
                z3 = intent4.getBooleanExtra("skip_max_items_new_limit", false);
            }
            r5.A0J = z3;
            r5.A02 = i2;
            C001000l A0C6 = A0C();
            long j2 = 0;
            if (!(A0C6 == null || (intent3 = A0C6.getIntent()) == null)) {
                j2 = intent3.getLongExtra("picker_open_time", 0);
            }
            r5.A05 = j2;
            C001000l A0C7 = A0C();
            String str2 = null;
            if (!(A0C7 == null || (intent2 = A0C7.getIntent()) == null)) {
                str2 = intent2.getStringExtra("quoted_group_jid");
            }
            r5.A0B = str2;
            C001000l A0C8 = A0C();
            long j3 = 0;
            if (!(A0C8 == null || (intent = A0C8.getIntent()) == null)) {
                j3 = intent.getLongExtra("quoted_message_row_id", 0);
            }
            r5.A06 = j3;
            boolean z4 = false;
            if (i2 != 20) {
                z4 = true;
            }
            r5.A0H = z4;
            r5.A0I = true;
            r5.A0E = arrayList;
            return r5.A00();
        }
        C18450wi.A0O("time");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C16980tz A1D() {
        C16980tz r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("waContext");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C54382hM A1E(List list) {
        RecyclerView recyclerView;
        int size = list.size();
        if (!C455529g.A00 || ((C54362hJ) this.A0E.getValue()).A02.size() != 1 || (recyclerView = this.A04) == null || recyclerView.getChildCount() != 1 || size != 1 || this.A0A == null) {
            return new C54382hM((Bitmap) null, (View) null, (AnonymousClass2BF) null, (String) null, (C54392hN) null, 15);
        }
        RecyclerView recyclerView2 = this.A04;
        if (recyclerView2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        String obj = ((AnonymousClass2BF) list.get(0)).A9L().toString();
        C18450wi.A0B(obj);
        return new C54382hM((WaMediaThumbnailView) A01((ViewGroup) A01(recyclerView2)), obj);
    }

    public final C54372hK A1F() {
        ViewPager viewPager = this.A05;
        AnonymousClass012 adapter = viewPager == null ? null : viewPager.getAdapter();
        if (adapter instanceof C54372hK) {
            return (C54372hK) adapter;
        }
        return null;
    }

    public final void A1G() {
        C54372hK A1F = A1F();
        if (A1F != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A1F.A05.getValue();
            if (false != galleryRecentsFragment.A05) {
                galleryRecentsFragment.A07.clear();
            }
            galleryRecentsFragment.A05 = false;
            galleryRecentsFragment.A07.clear();
            galleryRecentsFragment.A1N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (((X.C54362hJ) r5.A0E.getValue()).A02.size() != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1H(int r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.Toolbar r0 = r5.A03
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0010
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x0010
            android.view.MenuItem r3 = r0.getItem(r4)
        L_0x0010:
            r2 = 1
            if (r3 == 0) goto L_0x0030
            if (r6 != 0) goto L_0x002c
            boolean r0 = r5.A1L()
            if (r0 == 0) goto L_0x002c
            X.0qW r0 = r5.A0E
            java.lang.Object r0 = r0.getValue()
            X.2hJ r0 = (X.C54362hJ) r0
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 1
            if (r1 == 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r3.setVisible(r0)
        L_0x0030:
            androidx.appcompat.widget.Toolbar r0 = r5.A03
            if (r0 == 0) goto L_0x0046
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L_0x0046
            android.view.MenuItem r0 = r0.getItem(r2)
            if (r0 == 0) goto L_0x0046
            if (r6 != r2) goto L_0x0043
            r4 = 1
        L_0x0043:
            r0.setVisible(r4)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryTabHostFragment.A1H(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00be, code lost:
        r0 = r5.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1I(java.util.List r16) {
        /*
            r15 = this;
            r9 = r15
            boolean r0 = r15.A1M()
            r6 = 1
            r1 = r16
            if (r0 != r6) goto L_0x00d0
            X.00l r2 = r15.A0C()
            boolean r0 = r2 instanceof X.C14640pW
            if (r0 == 0) goto L_0x0082
            X.0pW r2 = (X.C14640pW) r2
            if (r2 == 0) goto L_0x0082
            X.1aI r7 = r2.AAQ()
            if (r7 == 0) goto L_0x0082
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00cd
            X.2hM r5 = r15.A1E(r1)
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()
            X.2BF r0 = (X.AnonymousClass2BF) r0
            android.net.Uri r0 = r0.A9L()
            r11.add(r0)
            goto L_0x0035
        L_0x0049:
            java.lang.String r4 = r5.A03
            if (r4 == 0) goto L_0x007c
            android.view.View r3 = r5.A01
            if (r3 == 0) goto L_0x007c
            X.01Q[] r2 = new X.AnonymousClass01Q[r6]
            r1 = 0
            X.01Q r0 = new X.01Q
            r0.<init>(r3, r4)
            r2[r1] = r0
            java.util.List r12 = X.AnonymousClass1JA.A0S(r2)
        L_0x005f:
            android.graphics.Bitmap r8 = r5.A00
            X.2BF r10 = r5.A02
            r13 = 4
            X.2hK r0 = r15.A1F()
            if (r0 == 0) goto L_0x007a
            X.0qW r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.gallery.GalleryRecentsFragment r0 = (com.obwhatsapp.gallery.GalleryRecentsFragment) r0
            if (r0 == 0) goto L_0x007a
            boolean r14 = r0.A05
        L_0x0076:
            r7.A0L(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x007a:
            r14 = 0
            goto L_0x0076
        L_0x007c:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            goto L_0x005f
        L_0x0082:
            X.2hM r5 = r15.A1E(r1)
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0095:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r1.next()
            X.2BF r0 = (X.AnonymousClass2BF) r0
            android.net.Uri r0 = r0.A9L()
            r2.add(r0)
            goto L_0x0095
        L_0x00a9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            android.content.Intent r4 = r15.A1C(r0)
            r3 = 101(0x65, float:1.42E-43)
            X.00l r2 = r15.A0C()
            if (r2 == 0) goto L_0x00ce
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x00ce
            java.lang.String r0 = r5.A03
            if (r0 == 0) goto L_0x00ce
            X.09N r0 = X.AnonymousClass09N.A01(r2, r1, r0)
            android.os.Bundle r0 = r0.A03()
        L_0x00ca:
            r15.A0O(r4, r3, r0)
        L_0x00cd:
            return
        L_0x00ce:
            r0 = 0
            goto L_0x00ca
        L_0x00d0:
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00df:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r1.next()
            X.2BF r0 = (X.AnonymousClass2BF) r0
            android.net.Uri r0 = r0.A9L()
            r2.add(r0)
            goto L_0x00df
        L_0x00f3:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            X.00l r4 = r15.A0D()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r1 = r4.getIntent()
            r0 = 0
            if (r1 != 0) goto L_0x012b
            r2 = r0
        L_0x0109:
            java.lang.String r1 = "bucket_uri"
            r3.putExtra(r1, r2)
            java.lang.String r1 = "android.intent.extra.STREAM"
            r3.putParcelableArrayListExtra(r1, r5)
            int r1 = r5.size()
            if (r1 != r6) goto L_0x0120
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x0120:
            r3.setData(r0)
            r0 = -1
            r4.setResult(r0, r3)
            r4.finish()
            return
        L_0x012b:
            android.net.Uri r2 = r1.getData()
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryTabHostFragment.A1I(java.util.List):void");
    }

    public void A1J(Set set) {
        ViewGroup viewGroup;
        Toolbar toolbar = this.A03;
        String str = null;
        if (toolbar != null) {
            if (!set.isEmpty()) {
                A1K(true);
                AnonymousClass013 r5 = this.A09;
                if (r5 != null) {
                    str = r5.A0J(new Object[]{Integer.valueOf(set.size())}, R.plurals.plurals00e1, (long) set.size());
                } else {
                    C18450wi.A0O("whatsAppLocale");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                A1K(false);
                Bundle bundle = this.A05;
                if (bundle != null) {
                    str = bundle.getString("gallery_picker_title");
                }
            }
            toolbar.setTitle((CharSequence) str);
        }
        int i2 = 8;
        if (!set.isEmpty()) {
            i2 = 0;
        }
        ViewGroup viewGroup2 = this.A02;
        if ((viewGroup2 == null || viewGroup2.getVisibility() != i2) && (viewGroup = this.A02) != null) {
            viewGroup.setVisibility(i2);
        }
        C54362hJ r1 = (C54362hJ) this.A0E.getValue();
        List list = r1.A02;
        list.clear();
        list.addAll(set);
        r1.A01();
        ViewPager viewPager = this.A05;
        A1H(viewPager == null ? 0 : viewPager.getCurrentItem());
    }

    public final void A1K(boolean z2) {
        C54372hK A1F = A1F();
        if (A1F != null) {
            GalleryRecentsFragment galleryRecentsFragment = (GalleryRecentsFragment) A1F.A05.getValue();
            if (!z2 && z2 != galleryRecentsFragment.A05) {
                galleryRecentsFragment.A07.clear();
            }
            galleryRecentsFragment.A05 = z2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = (r0 = A0C()).getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1L() {
        /*
            r4 = this;
            int r0 = r4.A1B()
            r3 = 1
            if (r0 <= r3) goto L_0x0023
            boolean r0 = r4.A1M()
            if (r0 != 0) goto L_0x0022
            X.00l r0 = r4.A0C()
            r2 = 0
            if (r0 == 0) goto L_0x0023
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "is_in_multi_select_mode_only"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 != r3) goto L_0x0023
        L_0x0022:
            return r3
        L_0x0023:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryTabHostFragment.A1L():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1M() {
        /*
            r3 = this;
            X.00l r0 = r3.A0C()
            r2 = 1
            if (r0 == 0) goto L_0x0016
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "preview"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryTabHostFragment.A1M():boolean");
    }

    public void AFr(AnonymousClass29Q r2, Collection collection) {
        C54372hK A1F = A1F();
        if (A1F != null) {
            A1F.AFr(r2, collection);
        }
    }

    public void AUN(int i2) {
    }

    public void AUO(int i2, float f2, int i3) {
    }

    public void AUP(int i2) {
        A1G();
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            Bundle bundle = this.A05;
            toolbar.setTitle((CharSequence) bundle == null ? null : bundle.getString("gallery_picker_title"));
        }
        A1H(i2);
    }

    public void AbZ() {
        C54372hK A1F = A1F();
        if (A1F != null) {
            A1F.AbZ();
        }
    }

    public void Aeb(AnonymousClass29Q r2, Collection collection, Collection collection2) {
        C54372hK A1F = A1F();
        if (A1F != null) {
            A1F.Aeb(r2, collection, collection2);
        }
    }
}
