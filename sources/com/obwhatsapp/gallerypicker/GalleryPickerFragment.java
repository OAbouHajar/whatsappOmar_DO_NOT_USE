package com.obwhatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01X;
import X.AnonymousClass2OM;
import X.AnonymousClass37P;
import X.AnonymousClass4MH;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C15900s5;
import X.C16260sj;
import X.C16320sq;
import X.C16510tB;
import X.C16980tz;
import X.C20350zu;
import X.C23651Cv;
import X.C49172Rk;
import X.C56292nO;
import X.C57442rB;
import X.C87594Xo;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxBReceiverShape8S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.SquareImageView;

public class GalleryPickerFragment extends Hilt_GalleryPickerFragment {
    public static final String A0O;
    public static final AnonymousClass4MH[] A0P;
    public static final AnonymousClass4MH[] A0Q;
    public int A00 = 1;
    public int A01;
    public int A02;
    public BroadcastReceiver A03;
    public ContentObserver A04;
    public Drawable A05;
    public View A06;
    public RecyclerView A07;
    public C15900s5 A08;
    public C23651Cv A09;
    public C16980tz A0A;
    public C16260sj A0B;
    public AnonymousClass013 A0C;
    public C14710pd A0D;
    public AnonymousClass37P A0E;
    public C57442rB A0F;
    public C49172Rk A0G;
    public AnonymousClass2OM A0H;
    public C20350zu A0I;
    public C16510tB A0J;
    public C16320sq A0K;
    public boolean A0L;
    public boolean A0M;
    public final Handler A0N = AnonymousClass000.A0L();

    static {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1I(Environment.getExternalStorageDirectory(), A0o);
        String valueOf = String.valueOf(AnonymousClass000.A0h("/DCIM/Camera", A0o).toLowerCase().hashCode());
        A0O = valueOf;
        A0P = new AnonymousClass4MH[]{new AnonymousClass4MH(valueOf, 4, 1, R.string.str0928), new AnonymousClass4MH(valueOf, 5, 4, R.string.str0929), new AnonymousClass4MH(valueOf, 6, 2, R.string.str0928), new AnonymousClass4MH((String) null, 0, 1, R.string.str00d8), new AnonymousClass4MH((String) null, 1, 4, R.string.str00da), new AnonymousClass4MH((String) null, 2, 2, R.string.str00d7)};
        A0Q = new AnonymousClass4MH[]{new AnonymousClass4MH(valueOf, 7, 7, R.string.str0927), new AnonymousClass4MH((String) null, 3, 7, R.string.str00d9), new AnonymousClass4MH((String) null, 1, 4, R.string.str00da)};
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02b0);
    }

    public void A13() {
        super.A13();
        AnonymousClass37P r1 = this.A0E;
        if (r1 != null) {
            r1.A06(true);
            this.A0E = null;
        }
        AnonymousClass2OM r0 = this.A0H;
        if (r0 != null) {
            r0.A00();
            this.A0H = null;
        }
        BroadcastReceiver broadcastReceiver = this.A03;
        if (broadcastReceiver != null) {
            this.A0A.A00.unregisterReceiver(broadcastReceiver);
        }
        C001000l A0C2 = A0C();
        ContentResolver contentResolver = A0C2 == null ? null : A0C2.getContentResolver();
        AnonymousClass00B.A06(contentResolver);
        contentResolver.unregisterContentObserver(this.A04);
        for (int i2 = 0; i2 < this.A07.getChildCount(); i2++) {
            View childAt = this.A07.getChildAt(i2);
            if (childAt instanceof FrameLayout) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt2 = viewGroup.getChildAt(i3);
                    if (childAt2 instanceof SquareImageView) {
                        ((ImageView) childAt2).setImageDrawable((Drawable) null);
                    }
                }
            }
        }
        this.A0F = null;
        this.A07.setAdapter((AnonymousClass01X) null);
        this.A09.A02().A02.A05(-1);
    }

    public void A18(Bundle bundle, View view) {
        this.A00 = this.A05.getInt("include");
        int A002 = AnonymousClass00T.A00(this.A0A.A00, R.color.color0457);
        this.A01 = A002;
        this.A05 = new ColorDrawable(A002);
        this.A02 = A03().getDimensionPixelSize(R.dimen.dimen03f7);
        RecyclerView recyclerView = (RecyclerView) A06().findViewById(R.id.albums);
        this.A07 = recyclerView;
        recyclerView.setClipToPadding(false);
        this.A07.setPadding(0, C87594Xo.A00(view.getContext(), 2.0f), 0, 0);
        this.A03 = new IDxBReceiverShape8S0100000_2_I1(this, 1);
        Handler handler = this.A0N;
        this.A04 = new C56292nO(handler, this);
        C57442rB r1 = new C57442rB(this);
        this.A0F = r1;
        this.A07.setAdapter(r1);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_STARTED");
        intentFilter.addAction("android.intent.action.MEDIA_SCANNER_FINISHED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addDataScheme("file");
        this.A0A.A00.registerReceiver(this.A03, intentFilter);
        C001000l A0C2 = A0C();
        ContentResolver contentResolver = A0C2 == null ? null : A0C2.getContentResolver();
        AnonymousClass00B.A06(contentResolver);
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.A04);
        C23651Cv r3 = this.A09;
        C001000l A0C3 = A0C();
        this.A0H = new AnonymousClass2OM(A0C3 == null ? null : A0C3.getContentResolver(), handler, r3, "gallery-picker-fragment");
        this.A0M = false;
        this.A0L = false;
        A1C();
    }

    public final void A1B() {
        if (this.A06 == null) {
            ViewGroup A0K2 = C13690nt.A0K(A06(), R.id.root);
            A0C().getLayoutInflater().inflate(R.layout.layout02b2, A0K2);
            View findViewById = A0K2.findViewById(R.id.no_media);
            this.A06 = findViewById;
            TextView A0M2 = C13680ns.A0M(findViewById, R.id.no_media_text);
            int i2 = this.A00;
            int i3 = R.string.str0b37;
            if (i2 != 1) {
                i3 = R.string.str0b36;
                if (i2 != 2) {
                    if (i2 == 4) {
                        i3 = R.string.str0b39;
                    }
                }
            }
            A0M2.setText(i3);
        }
        this.A06.setVisibility(0);
    }

    public final void A1C() {
        AnonymousClass00B.A0B("galleryFoldersTask must be cancelled", AnonymousClass000.A1W(this.A0E));
        if (!this.A0B.A0B()) {
            A1B();
            return;
        }
        Point point = new Point();
        C13680ns.A0s(A0C(), point);
        int i2 = point.y * point.x;
        int i3 = this.A02;
        C16980tz r2 = this.A0A;
        C49172Rk r5 = this.A0G;
        AnonymousClass37P r1 = new AnonymousClass37P(r2, this.A0C, this, r5, this.A0I, this.A00, (i2 / (i3 * i3)) + 1);
        this.A0E = r1;
        C13700nu.A0W(r1, this.A0K);
    }

    public final void A1D(boolean z2, boolean z3) {
        StringBuilder A0r = AnonymousClass000.A0r("gallerypicker/");
        A0r.append(this.A00);
        A0r.append("/rebake unmounted:");
        A0r.append(z2);
        A0r.append(" scanning:");
        A0r.append(z3);
        A0r.append(" oldunmounted:");
        A0r.append(this.A0M);
        A0r.append(" oldscanning:");
        A0r.append(this.A0L);
        C13680ns.A1V(A0r);
        if (z2 != this.A0M || z3 != this.A0L) {
            this.A0M = z2;
            this.A0L = z3;
            AnonymousClass37P r1 = this.A0E;
            if (r1 != null) {
                r1.A06(true);
                this.A0E = null;
            }
            if (this.A0M || !this.A0B.A0B()) {
                A1B();
                return;
            }
            C13680ns.A13(this.A06);
            A1C();
        }
    }
}
