package com.obwhatsapp.gallery;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass024;
import X.AnonymousClass0y0;
import X.AnonymousClass17F;
import X.AnonymousClass17N;
import X.AnonymousClass1WW;
import X.AnonymousClass2DW;
import X.AnonymousClass2EA;
import X.AnonymousClass372;
import X.AnonymousClass3R5;
import X.AnonymousClass49V;
import X.AnonymousClass49W;
import X.C001000l;
import X.C004601z;
import X.C14710pd;
import X.C15830rv;
import X.C16260sj;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16800tf;
import X.C16930tt;
import X.C18940xV;
import X.C19150xq;
import X.C25711Kv;
import X.C42391xi;
import X.C42431xm;
import X.C609036o;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import java.util.ArrayList;

public abstract class GalleryFragmentBase extends Hilt_GalleryFragmentBase implements AnonymousClass2DW {
    public int A00 = -1;
    public View A01;
    public RecyclerView A02;
    public C16440t3 A03;
    public C16260sj A04;
    public AnonymousClass013 A05;
    public C16460t6 A06;
    public C42391xi A07;
    public C19150xq A08;
    public AnonymousClass0y0 A09;
    public AnonymousClass3R5 A0A;
    public C609036o A0B;
    public AnonymousClass372 A0C;
    public C15830rv A0D;
    public C16320sq A0E;
    public String A0F = "";
    public final C18940xV A0G = new IDxMObserverShape74S0100000_2_I0(this, 6);
    public final String A0H;
    public final ArrayList A0I = new ArrayList();

    public GalleryFragmentBase(String str) {
        this.A0H = str;
    }

    public void A0n(Bundle bundle) {
        this.A0V = true;
        C15830rv A022 = C15830rv.A02(A0D().getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        this.A0D = A022;
        View A062 = A06();
        this.A01 = A062.findViewById(16908292);
        RecyclerView recyclerView = (RecyclerView) A062.findViewById(R.id.grid);
        this.A02 = recyclerView;
        C004601z.A0p(recyclerView, true);
        C004601z.A0p(this.A0A.findViewById(16908292), true);
        C001000l A0C2 = A0C();
        if (A0C2 instanceof MediaGalleryActivity) {
            this.A02.A0o(((MediaGalleryActivity) A0C2).A0r);
        }
        this.A08.A02(this.A0G);
        View view = this.A0A;
        if (view != null) {
            view.findViewById(R.id.progress_bar).setVisibility(0);
        }
        A1C();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout02ad, viewGroup, false);
    }

    public void A12() {
        super.A12();
        this.A08.A03(this.A0G);
        Cursor A0E2 = this.A0A.A0E((Cursor) null);
        if (A0E2 != null) {
            A0E2.close();
        }
        AnonymousClass372 r0 = this.A0C;
        if (r0 != null) {
            r0.A0B();
            this.A0C = null;
        }
        C609036o r1 = this.A0B;
        if (r1 != null) {
            r1.A06(true);
            synchronized (r1) {
                AnonymousClass024 r02 = r1.A00;
                if (r02 != null) {
                    r02.A01();
                }
            }
            this.A0B = null;
        }
    }

    public void A14() {
        super.A14();
        A1D();
    }

    public void A16(Context context) {
        super.A16(context);
        this.A07 = new C42391xi(this.A05);
    }

    public Cursor A1B(AnonymousClass024 r13, C42391xi r14, C15830rv r15) {
        Throwable th;
        Cursor cursor;
        C16800tf r4;
        Cursor cursor2;
        if (this instanceof LinksGalleryFragment) {
            AnonymousClass17N r2 = ((LinksGalleryFragment) this).A03;
            boolean z2 = false;
            if (r2.A04.A01("links_ready", 0) == 2) {
                z2 = true;
            }
            if (z2) {
                AnonymousClass17F r3 = r2.A02;
                long A042 = r3.A04();
                String l2 = Long.toString(r2.A01.A02(r15));
                r4 = r2.A03.get();
                try {
                    if (!(!r14.A03().isEmpty())) {
                        cursor2 = r4.A02.A07(r13, AnonymousClass49V.A00, new String[]{l2});
                    } else if (A042 == 1) {
                        String A0G2 = r3.A0G(r14.A02());
                        cursor2 = r4.A02.A07(r13, C42431xm.A03, new String[]{l2, A0G2});
                    } else {
                        r14.A02 = AnonymousClass2EA.A03;
                        String A0B2 = r3.A0B(r13, r14, (Integer) null);
                        cursor2 = r4.A02.A07(r13, C42431xm.A04, new String[]{A0B2});
                    }
                } catch (Throwable unused) {
                }
            } else {
                String rawString = r15.getRawString();
                AnonymousClass17F r8 = r2.A02;
                long A043 = r8.A04();
                r4 = r2.A03.get();
                if (!r14.A03().isEmpty()) {
                    String A022 = r14.A02();
                    String str = null;
                    if (A043 == 1) {
                        if (!TextUtils.isEmpty(A022)) {
                            str = r8.A0G(A022);
                        }
                        cursor2 = r4.A02.A07(r13, C42431xm.A01, new String[]{rawString, str});
                    } else {
                        r14.A02 = AnonymousClass2EA.A03;
                        String A0B3 = r8.A0B(r13, r14, (Integer) null);
                        cursor2 = r4.A02.A07(r13, C42431xm.A02, new String[]{A0B3});
                    }
                } else {
                    cursor2 = r4.A02.A07(r13, AnonymousClass49W.A00, new String[]{rawString});
                }
            }
            r4.close();
            return cursor2;
        }
        DocumentsGalleryFragment documentsGalleryFragment = (DocumentsGalleryFragment) this;
        C16460t6 r5 = documentsGalleryFragment.A06;
        C25711Kv r82 = documentsGalleryFragment.A03;
        AnonymousClass17F r32 = r82.A01;
        long A044 = r32.A04();
        C16800tf A012 = r82.A02.get();
        try {
            r14.A02();
            if (!(!r14.A03().isEmpty())) {
                cursor = A012.A02.A07(r13, AnonymousClass1WW.A04, new String[]{String.valueOf(r82.A00.A02(r15))});
            } else if (A044 == 1) {
                String A0G3 = r32.A0G(r14.A02());
                cursor = A012.A02.A07(r13, C42431xm.A00, new String[]{A0G3, String.valueOf(r82.A00.A02(r15))});
            } else {
                boolean z3 = false;
                if (A044 == 5) {
                    z3 = true;
                }
                AnonymousClass00B.A0B("unknown fts version", z3);
                r14.A02 = 100;
                String A0B4 = r32.A0B(r13, r14, (Integer) null);
                cursor = A012.A02.A07(r13, C42431xm.A05, new String[]{A0B4});
            }
            A012.close();
            return new C16930tt(cursor, r5, (C14710pd) null, r15);
        } catch (Throwable th2) {
            th = th2;
            A012.close();
            throw th;
        }
    }

    public final void A1C() {
        C609036o r1 = this.A0B;
        if (r1 != null) {
            r1.A06(true);
            synchronized (r1) {
                AnonymousClass024 r0 = r1.A00;
                if (r0 != null) {
                    r0.A01();
                }
            }
        }
        AnonymousClass372 r02 = this.A0C;
        if (r02 != null) {
            r02.A0B();
        }
        C609036o r2 = new C609036o(this.A07, this, this.A0D);
        this.A0B = r2;
        this.A0E.Ack(r2, new Void[0]);
    }

    public final void A1D() {
        if (this.A00 == -1) {
            return;
        }
        if (!this.A04.A0B() || this.A00 <= 0) {
            this.A01.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A01.setVisibility(8);
        this.A02.setVisibility(0);
    }

    public void AWn(C42391xi r3) {
        if (!TextUtils.equals(this.A0F, r3.A02())) {
            this.A0F = r3.A02();
            this.A07 = r3;
            A1C();
        }
    }

    public void AWv() {
        this.A0A.A01();
    }
}
