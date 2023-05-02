package com.obwhatsapp.camera.bottomsheet;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01Q;
import X.AnonymousClass20I;
import X.AnonymousClass29Q;
import X.AnonymousClass2BF;
import X.AnonymousClass2SR;
import X.C001000l;
import X.C004601z;
import X.C14640pW;
import X.C14710pd;
import X.C16620tM;
import X.C29251aI;
import X.C434920f;
import X.C447725m;
import X.C455529g;
import X.C50452Zp;
import X.C54482hb;
import X.C54502hd;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape323S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class CameraMediaPickerFragment extends Hilt_CameraMediaPickerFragment implements C50452Zp {
    public BroadcastReceiver A00;
    public MenuItem A01;
    public Toolbar A02;
    public Toolbar A03;
    public final AnonymousClass29Q A04 = new AnonymousClass29Q();
    public final HashSet A05 = new LinkedHashSet();
    public final List A06 = new ArrayList();

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList(this.A05));
    }

    public void A0w() {
        super.A0w();
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            A0C().unregisterReceiver(broadcastReceiver);
            this.A00 = null;
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        C29251aI AAQ;
        C001000l A0C = A0C();
        if (!(!(A0C instanceof C14640pW) || (AAQ = ((C14640pW) A0C).AAQ()) == null || AAQ.A0A == null)) {
            AAQ.A0I(i2, i3, intent);
        }
        if (i2 != 101) {
            return;
        }
        if (i3 == -1) {
            this.A05.clear();
        } else if (i3 == 1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            HashSet hashSet = this.A05;
            hashSet.clear();
            if (parcelableArrayListExtra != null) {
                hashSet.addAll(parcelableArrayListExtra);
            }
            if (!A1K()) {
                A1N();
            }
            A1P();
            this.A04.A01(intent.getExtras());
            this.A06.A01();
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout00e5, viewGroup, false);
    }

    public void A12() {
        super.A12();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            int childCount = stickyHeadersRecyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.A08.getChildAt(i2);
                if (childAt instanceof C54482hb) {
                    ((ImageView) childAt).setImageDrawable((Drawable) null);
                }
            }
        }
    }

    public void A14() {
        super.A14();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        IDxBReceiverShape7S0100000_2_I0 iDxBReceiverShape7S0100000_2_I0 = new IDxBReceiverShape7S0100000_2_I0(this, 8);
        this.A00 = iDxBReceiverShape7S0100000_2_I0;
        A0C().registerReceiver(iDxBReceiverShape7S0100000_2_I0, intentFilter);
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.A03 = toolbar;
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(A02(), R.drawable.ic_back, R.color.color04ef), this.A0E));
        this.A03.setNavigationContentDescription((int) R.string.str014a);
        this.A03.getMenu().add(0, R.id.menuitem_select_multiple, 0, R.string.str1d85).setIcon(AnonymousClass2SR.A02(A0u(), R.drawable.ic_action_select_multiple_teal, R.color.color04ef)).setShowAsAction(2);
        Toolbar toolbar2 = this.A03;
        toolbar2.A0R = new IDxCListenerShape323S0100000_2_I0(this, 1);
        toolbar2.setNavigationOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 23));
        Toolbar toolbar3 = (Toolbar) view.findViewById(R.id.gallery_action_mode_bar);
        this.A02 = toolbar3;
        MenuItem add = toolbar3.getMenu().add(0, R.id.menuitem_select_multiple, 0, R.string.str0e87);
        this.A01 = add;
        add.setShowAsAction(2);
        this.A02.setNavigationIcon((Drawable) new C447725m(AnonymousClass00T.A04(A0u(), R.drawable.ic_back), this.A0E));
        this.A02.setNavigationContentDescription((int) R.string.str014a);
        Toolbar toolbar4 = this.A02;
        toolbar4.A0R = new IDxCListenerShape323S0100000_2_I0(this, 2);
        toolbar4.setNavigationOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 24));
    }

    public boolean A1M(AnonymousClass2BF r5, C54502hd r6) {
        if (A1K()) {
            A1Q(r5);
            return true;
        }
        HashSet hashSet = this.A05;
        Uri A9L = r5.A9L();
        hashSet.add(A9L);
        this.A04.A03(new AnonymousClass20I(A9L));
        A1N();
        this.A06.A01();
        A1G(hashSet.size());
        return true;
    }

    public final void A1N() {
        if (this.A02.getVisibility() != 0) {
            this.A02.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(120);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(4);
        A1P();
        Window window = A0D().getWindow();
        AnonymousClass00B.A06(window);
        C434920f.A08(window, false);
        C434920f.A03(A0D(), R.color.right_icon);
    }

    public final void A1O() {
        if (this.A02.getVisibility() != 4) {
            this.A02.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(120);
            this.A02.startAnimation(alphaAnimation);
        }
        this.A03.setVisibility(0);
        this.A05.clear();
        this.A04.A00.clear();
        this.A06.A01();
        AnonymousClass00B.A06(A0D().getWindow());
        int i2 = Build.VERSION.SDK_INT;
        C001000l A0D = A0D();
        if (i2 >= 23) {
            C434920f.A04(A0D, R.color.color04f1);
        } else {
            C434920f.A03(A0D, R.color.color064b);
        }
    }

    public final void A1P() {
        HashSet hashSet = this.A05;
        boolean isEmpty = hashSet.isEmpty();
        Toolbar toolbar = this.A02;
        if (isEmpty) {
            toolbar.setTitle((int) R.string.str14cd);
        } else {
            AnonymousClass013 r6 = this.A0E;
            long size = (long) hashSet.size();
            toolbar.setTitle((CharSequence) r6.A0J(new Object[]{Integer.valueOf(hashSet.size())}, R.plurals.plurals00e1, size));
        }
        this.A01.setVisible(true ^ hashSet.isEmpty());
    }

    public final void A1Q(AnonymousClass2BF r8) {
        if (r8 == null) {
            return;
        }
        if (A1K()) {
            HashSet hashSet = this.A05;
            Uri A9L = r8.A9L();
            if (hashSet.contains(A9L)) {
                hashSet.remove(A9L);
            } else {
                C14710pd r1 = this.A0F;
                C16620tM r2 = C16620tM.A02;
                int A032 = r1.A03(r2, 2614);
                if (hashSet.size() >= A032) {
                    A032 = this.A0F.A03(r2, 2693);
                }
                if (hashSet.size() >= A032) {
                    this.A07.A0H(A02().getString(R.string.str1616, new Object[]{Integer.valueOf(A032)}), 0);
                } else {
                    hashSet.add(A9L);
                    this.A04.A03(new AnonymousClass20I(A9L));
                }
            }
            if (hashSet.isEmpty()) {
                A1O();
            } else {
                A1P();
                A1G(hashSet.size());
            }
            this.A06.A01();
            return;
        }
        HashSet hashSet2 = new HashSet();
        Uri A9L2 = r8.A9L();
        hashSet2.add(A9L2);
        this.A04.A03(new AnonymousClass20I(A9L2));
        A1R(hashSet2);
    }

    public final void A1R(HashSet hashSet) {
        C29251aI AAQ;
        Bitmap bitmap;
        AnonymousClass2BF r7;
        C54502hd A1B;
        if (hashSet != null && !hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            C001000l A0C = A0C();
            if ((A0C instanceof C14640pW) && (AAQ = ((C14640pW) A0C).AAQ()) != null) {
                ArrayList arrayList2 = null;
                if (!C455529g.A00 || arrayList.size() != 1 || this.A0A == null || (A1B = A1B((Uri) arrayList.get(0))) == null) {
                    bitmap = null;
                    r7 = null;
                } else {
                    arrayList2 = new ArrayList();
                    arrayList2.add(new AnonymousClass01Q(A1B, arrayList.get(0).toString()));
                    View findViewById = this.A0A.findViewById(R.id.gallery_header_transition);
                    arrayList2.add(new AnonymousClass01Q(findViewById, C004601z.A0L(findViewById)));
                    View findViewById2 = this.A0A.findViewById(R.id.gallery_footer_transition);
                    arrayList2.add(new AnonymousClass01Q(findViewById2, C004601z.A0L(findViewById2)));
                    View findViewById3 = this.A0A.findViewById(R.id.gallery_send_button_transition);
                    arrayList2.add(new AnonymousClass01Q(findViewById3, C004601z.A0L(findViewById3)));
                    bitmap = A1B.A00;
                    r7 = A1B.A05;
                }
                AAQ.A0L(bitmap, this, r7, arrayList, arrayList2, 3, A1K());
            }
        }
    }

    public void AFr(AnonymousClass29Q r3, Collection collection) {
        collection.clear();
        collection.addAll(this.A05);
        AnonymousClass29Q r0 = this.A04;
        Map map = r3.A00;
        map.clear();
        map.putAll(r0.A00);
    }

    public void AbZ() {
        A1I(false);
    }

    public void Aeb(AnonymousClass29Q r4, Collection collection, Collection collection2) {
        HashSet hashSet = this.A05;
        if (!hashSet.isEmpty() || !collection2.isEmpty()) {
            hashSet.clear();
            hashSet.addAll(collection2);
            List list = this.A06;
            list.clear();
            list.addAll(collection);
            Map map = this.A04.A00;
            map.clear();
            map.putAll(r4.A00);
            if (hashSet.isEmpty()) {
                A1O();
            } else {
                A1N();
            }
            this.A06.A01();
        }
    }
}
