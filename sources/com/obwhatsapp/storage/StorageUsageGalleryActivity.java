package com.obwhatsapp.storage;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass024;
import X.AnonymousClass050;
import X.AnonymousClass05J;
import X.AnonymousClass05K;
import X.AnonymousClass10B;
import X.AnonymousClass10G;
import X.AnonymousClass1BQ;
import X.AnonymousClass1HE;
import X.AnonymousClass1L8;
import X.AnonymousClass1L9;
import X.AnonymousClass1YF;
import X.AnonymousClass1YG;
import X.AnonymousClass1yL;
import X.AnonymousClass2Ao;
import X.AnonymousClass2GQ;
import X.AnonymousClass2JP;
import X.AnonymousClass2SQ;
import X.AnonymousClass31W;
import X.AnonymousClass36C;
import X.AnonymousClass47T;
import X.AnonymousClass5PQ;
import X.C004601z;
import X.C005402i;
import X.C009804r;
import X.C101894y3;
import X.C14740pg;
import X.C14870pt;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16460t6;
import X.C16480t8;
import X.C16490t9;
import X.C16740tZ;
import X.C16760tb;
import X.C17020u3;
import X.C17030uP;
import X.C17200uh;
import X.C18930xU;
import X.C18940xV;
import X.C19150xq;
import X.C19410yO;
import X.C19990zK;
import X.C20260zl;
import X.C20270zm;
import X.C206711d;
import X.C209212c;
import X.C23631Ct;
import X.C24841Hm;
import X.C28381Vw;
import X.C41761wc;
import X.C49132Rg;
import X.C51082aw;
import X.C616339r;
import X.C73763p1;
import X.C73773p2;
import X.C86144Rj;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape378S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape307S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.message.selection.IDxMCallbackShape71S0100000_1_I0;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StorageUsageGalleryActivity extends AnonymousClass1YF implements AnonymousClass1YG {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public C009804r A05;
    public AnonymousClass05J A06;
    public AnonymousClass024 A07;
    public C51082aw A08;
    public C16760tb A09;
    public C18930xU A0A;
    public C16000sG A0B;
    public C17030uP A0C;
    public C16080sP A0D;
    public AnonymousClass2Ao A0E;
    public C17200uh A0F;
    public AnonymousClass1L8 A0G;
    public C86144Rj A0H;
    public C20270zm A0I;
    public C16460t6 A0J;
    public AnonymousClass10B A0K;
    public AnonymousClass36C A0L;
    public C16480t8 A0M;
    public C19150xq A0N;
    public AnonymousClass10G A0O;
    public C24841Hm A0P;
    public C16010sH A0Q;
    public C19410yO A0R;
    public ProgressDialogFragment A0S;
    public C206711d A0T;
    public AnonymousClass1BQ A0U;
    public C20260zl A0V;
    public C16490t9 A0W;
    public C15830rv A0X;
    public AnonymousClass1HE A0Y;
    public C209212c A0Z;
    public C19990zK A0a;
    public C17020u3 A0b;
    public AnonymousClass47T A0c;
    public StorageUsageMediaGalleryFragment A0d;
    public C73773p2 A0e;
    public C23631Ct A0f;
    public AnonymousClass01D A0g;
    public Runnable A0h;
    public Runnable A0i;
    public String A0j;
    public final Handler A0k = new Handler(Looper.getMainLooper());
    public final AnonymousClass5PQ A0l = new IDxRCallbackShape307S0100000_2_I0(this, 3);
    public final C18940xV A0m = new IDxMObserverShape74S0100000_2_I0(this, 14);
    public final C41761wc A0n = new C101894y3(this);
    public final Runnable A0o = new RunnableRunnableShape15S0100000_I0_14(this, 24);
    public final Runnable A0p = new RunnableRunnableShape15S0100000_I0_14(this, 23);

    public final void A35() {
        Handler handler = this.A0k;
        handler.removeCallbacks(this.A0p);
        Runnable runnable = this.A0i;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.A0i = null;
        }
        ProgressDialogFragment progressDialogFragment = this.A0S;
        if (progressDialogFragment != null) {
            progressDialogFragment.A1D();
            this.A0S = null;
        }
        AnonymousClass36C r1 = this.A0L;
        if (r1 != null) {
            r1.A06(true);
            this.A0L = null;
        }
        AnonymousClass024 r0 = this.A07;
        if (r0 != null) {
            r0.A01();
            this.A07 = null;
        }
    }

    public final void A36() {
        int i2;
        TextView textView = (TextView) C004601z.A0E(this.A04, R.id.storage_usage_detail_all_size);
        long j2 = this.A03;
        if (j2 >= 0) {
            textView.setText(AnonymousClass2GQ.A04(this.A01, Math.max(j2 - this.A02, 0)));
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public final void A37() {
        C86144Rj r1;
        AnonymousClass05J r2 = this.A06;
        if (r2 != null && (r1 = this.A0H) != null) {
            if (r1.A04.isEmpty()) {
                r2.A05();
                return;
            }
            AnonymousClass01V r8 = this.A08;
            AnonymousClass013 r7 = this.A01;
            HashMap hashMap = r1.A04;
            long size = (long) hashMap.size();
            AnonymousClass2JP.A00(this, r8, r7.A0J(new Object[]{Integer.valueOf(hashMap.size())}, R.plurals.plurals00dc, size));
            this.A06.A06();
        }
    }

    public void A4o(Drawable drawable, View view) {
    }

    public void A96() {
        AnonymousClass05J r0 = this.A06;
        if (r0 != null) {
            r0.A05();
        }
    }

    public /* synthetic */ void A9J(C16740tZ r1) {
    }

    public /* synthetic */ int AAs() {
        return 0;
    }

    public Object AAy(Class cls) {
        if (cls == AnonymousClass5PQ.class) {
            return this.A0l;
        }
        return null;
    }

    public C616339r AAz() {
        return this.A0G.A02;
    }

    public /* synthetic */ ArrayList AFm() {
        return null;
    }

    public /* synthetic */ int AGW(C16740tZ r2) {
        return 0;
    }

    public boolean AHi() {
        return this.A0H != null;
    }

    public /* synthetic */ boolean AJH() {
        return false;
    }

    public boolean AJI(C16740tZ r3) {
        C86144Rj r0 = this.A0H;
        if (r0 != null) {
            return r0.A04.containsKey(r3.A11);
        }
    }

    public /* synthetic */ boolean AJU() {
        return false;
    }

    public /* synthetic */ boolean AJn(C16740tZ r2) {
        return false;
    }

    public /* synthetic */ void AW7(C16740tZ r1, boolean z2) {
    }

    public /* synthetic */ void Ad8(C16740tZ r1) {
    }

    public /* synthetic */ void AeT(C16740tZ r1) {
    }

    public void Aec(List list, boolean z2) {
        if (this.A0H == null) {
            this.A0H = new C86144Rj(this.A05, new IDxCListenerShape378S0100000_2_I0(this, 1), (C86144Rj) null, this.A0N);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16740tZ r2 = (C16740tZ) it.next();
            C86144Rj r0 = this.A0H;
            C28381Vw r1 = r2.A11;
            HashMap hashMap = r0.A04;
            if (z2) {
                hashMap.put(r1, r2);
            } else {
                hashMap.remove(r1);
            }
        }
        A37();
    }

    public /* synthetic */ void Aeq(C16740tZ r1, int i2) {
    }

    public /* synthetic */ boolean AfN() {
        return false;
    }

    public /* synthetic */ boolean Afe() {
        return false;
    }

    public void Afs(View view, C16740tZ r2, int i2, boolean z2) {
    }

    public void Ag8(C16740tZ r9) {
        C14870pt r5 = this.A05;
        C19150xq r3 = this.A0N;
        C86144Rj r0 = new C86144Rj(r5, new IDxCListenerShape378S0100000_2_I0(this, 1), this.A0H, r3);
        this.A0H = r0;
        r0.A04.put(r9.A11, r9);
        this.A06 = AgA(this.A05);
        AnonymousClass01V r7 = this.A08;
        AnonymousClass013 r6 = this.A01;
        C86144Rj r1 = this.A0H;
        long size = (long) r1.A04.size();
        AnonymousClass2JP.A00(this, r7, r6.A0J(new Object[]{Integer.valueOf(r1.A04.size())}, R.plurals.plurals00dc, size));
    }

    public boolean Agy(C16740tZ r6) {
        C86144Rj r1 = this.A0H;
        if (r1 == null) {
            r1 = new C86144Rj(this.A05, new IDxCListenerShape378S0100000_2_I0(this, 1), (C86144Rj) null, this.A0N);
            this.A0H = r1;
        }
        C28381Vw r2 = r6.A11;
        boolean containsKey = r1.A04.containsKey(r2);
        HashMap hashMap = this.A0H.A04;
        if (containsKey) {
            hashMap.remove(r2);
        } else {
            hashMap.put(r2, r6);
        }
        A37();
        return !containsKey;
    }

    public /* synthetic */ void Ahb(C16740tZ r1) {
    }

    public void onBackPressed() {
        long j2 = this.A02;
        if (j2 >= 0) {
            if (j2 > this.A03) {
                Log.e("Deleted media size is greater than the total media size");
            }
            Intent intent = new Intent();
            C15830rv r0 = this.A0X;
            if (r0 != null) {
                intent.putExtra("jid", r0.getRawString());
            }
            intent.putExtra("gallery_type", this.A01);
            intent.putExtra("memory_size", Math.max(this.A03 - this.A02, 0));
            intent.putExtra("deleted_size", this.A02);
            setResult(1, intent);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        A2R();
        setContentView((int) R.layout.layout0058);
        AnonymousClass47T r15 = this.A0c;
        C16000sG r10 = this.A0B;
        C16080sP r11 = this.A0D;
        AnonymousClass013 r14 = this.A01;
        C49132Rg r2 = this.A08.A00.A01;
        this.A05 = new IDxMCallbackShape71S0100000_1_I0(this, r10, r11, new C73763p1((AnonymousClass2SQ) r2.A0l.get(), this, new C73773p2(r2.A0D(), new AnonymousClass31W((AnonymousClass1L9) r2.A1s.AFI.get()))), this.A0e, r14, r15, this, 4);
        this.A0E = this.A0F.A04(this, "storage-usage-gallery-activity");
        int intExtra = getIntent().getIntExtra("gallery_type", 0);
        this.A01 = intExtra;
        if (intExtra == 0) {
            C15830rv A022 = C15830rv.A02(getIntent().getStringExtra("jid"));
            AnonymousClass00B.A06(A022);
            this.A0X = A022;
            this.A0Q = this.A0B.A08(A022);
        }
        this.A03 = getIntent().getLongExtra("memory_size", 0);
        this.A0j = getIntent().getStringExtra("session_id");
        this.A00 = getIntent().getIntExtra("entry_point", 0);
        String str = null;
        if (bundle == null) {
            int i2 = this.A01;
            C15830rv r0 = this.A0X;
            if (r0 != null) {
                str = r0.getRawString();
            }
            this.A0d = StorageUsageMediaGalleryFragment.A01(str, i2);
            AnonymousClass050 r4 = new AnonymousClass050(AGM());
            r4.A0D(this.A0d, "storage_usage_gallery_fragment_tag", R.id.storage_usage_gallery_container);
            r4.A01();
            this.A02 = 0;
        } else {
            this.A0d = (StorageUsageMediaGalleryFragment) AGM().A0B("storage_usage_gallery_fragment_tag");
            List<C28381Vw> A042 = AnonymousClass1yL.A04(bundle2);
            if (A042 != null) {
                for (C28381Vw r6 : A042) {
                    C16740tZ A032 = this.A0J.A0K.A03(r6);
                    if (A032 != null) {
                        C86144Rj r22 = this.A0H;
                        if (r22 == null) {
                            r22 = new C86144Rj(this.A05, new IDxCListenerShape378S0100000_2_I0(this, 1), (C86144Rj) null, this.A0N);
                            this.A0H = r22;
                        }
                        r22.A04.put(r6, A032);
                    }
                }
                if (this.A0H != null) {
                    this.A06 = AgA(this.A05);
                }
            }
            this.A02 = bundle2.getLong("deleted_size");
        }
        this.A0P.A09.add(this.A0n);
        this.A0N.A02(this.A0m);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(false);
        x2.A0Q(false);
        ((Toolbar) AnonymousClass00T.A05(this, R.id.toolbar)).A07();
        View inflate = LayoutInflater.from(this).inflate(R.layout.layout0597, (ViewGroup) null, false);
        AnonymousClass00B.A04(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A04 = viewGroup;
        ImageView imageView = (ImageView) C004601z.A0E(viewGroup, R.id.storage_usage_back_button);
        imageView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 21));
        boolean z2 = !this.A01.A0T();
        int i3 = R.drawable.ic_back_rtl;
        if (z2) {
            i3 = R.drawable.ic_back;
        }
        imageView.setImageResource(i3);
        View A0E2 = C004601z.A0E(this.A04, R.id.storage_usage_sort_button);
        A0E2.setVisibility(0);
        A0E2.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 20));
        x2.A0O(true);
        x2.A0H(this.A04, new AnonymousClass05K(-1, -1));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(this.A04, R.id.storage_usage_detail_name);
        View A0E3 = C004601z.A0E(this.A04, R.id.storage_usage_contact_photo_container);
        ImageView imageView2 = (ImageView) C004601z.A0E(this.A04, R.id.storage_usage_contact_photo);
        int i4 = this.A01;
        if (i4 == 2) {
            textEmojiLabel.setText(C14740pg.A04(this, this.A01));
        } else if (i4 == 1) {
            textEmojiLabel.setText(R.string.str16fa);
        } else {
            if (i4 == 0) {
                C16080sP r1 = this.A0D;
                C16010sH r02 = this.A0Q;
                AnonymousClass00B.A06(r02);
                textEmojiLabel.A0I((List) null, r1.A08(r02));
                A0E3.setVisibility(0);
                this.A0E.A06(imageView2, this.A0Q);
            }
            textEmojiLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textEmojiLabel.setMarqueeRepeatLimit(1);
            textEmojiLabel.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(textEmojiLabel, 19));
            this.A05.A0L(new RunnableRunnableShape11S0200000_I0_9(this, 9, textEmojiLabel), 1000);
            A36();
        }
        A0E3.setVisibility(8);
        textEmojiLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textEmojiLabel.setMarqueeRepeatLimit(1);
        textEmojiLabel.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(textEmojiLabel, 19));
        this.A05.A0L(new RunnableRunnableShape11S0200000_I0_9(this, 9, textEmojiLabel), 1000);
        A36();
    }

    public void onDestroy() {
        super.onDestroy();
        C86144Rj r0 = this.A0H;
        if (r0 != null) {
            r0.A00();
            this.A0H = null;
        }
        this.A0d = null;
        C24841Hm r02 = this.A0P;
        r02.A09.remove(this.A0n);
        this.A0k.removeCallbacks((Runnable) null);
        A35();
        this.A0N.A03(this.A0m);
        AnonymousClass2Ao r03 = this.A0E;
        if (r03 != null) {
            r03.A00();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C86144Rj r0 = this.A0H;
        if (r0 != null) {
            ArrayList arrayList = new ArrayList();
            for (C16740tZ r02 : r0.A04.values()) {
                arrayList.add(r02.A11);
            }
            AnonymousClass1yL.A0A(bundle, arrayList);
        }
        bundle.putLong("deleted_size", this.A02);
    }
}
