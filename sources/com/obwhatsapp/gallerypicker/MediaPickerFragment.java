package com.obwhatsapp.gallerypicker;

import X.AnonymousClass00B;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass05J;
import X.AnonymousClass09N;
import X.AnonymousClass1J9;
import X.AnonymousClass20I;
import X.AnonymousClass29Q;
import X.AnonymousClass2BF;
import X.AnonymousClass2KC;
import X.AnonymousClass2OP;
import X.AnonymousClass2SR;
import X.AnonymousClass3DO;
import X.AnonymousClass3RO;
import X.C000900k;
import X.C001000l;
import X.C003101j;
import X.C004601z;
import X.C005602k;
import X.C009804r;
import X.C14550pN;
import X.C14710pd;
import X.C15830rv;
import X.C15900s5;
import X.C16030sJ;
import X.C16510tB;
import X.C16620tM;
import X.C20350zu;
import X.C23151Ar;
import X.C24671Gv;
import X.C34711kk;
import X.C39501sa;
import X.C455529g;
import X.C54362hJ;
import X.C54482hb;
import X.C54502hd;
import X.C54602hp;
import X.C57652rX;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.AssemMods.AGMods;
import com.facebook.redex.IDxBReceiverShape7S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;
import com.obwhatsapp.gallery.NewMediaPickerFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MediaPickerFragment extends Hilt_MediaPickerFragment implements AnonymousClass2OP {
    public int A00;
    public int A01;
    public long A02;
    public BroadcastReceiver A03;
    public C009804r A04;
    public AnonymousClass05J A05;
    public C15900s5 A06;
    public C23151Ar A07;
    public C57652rX A08;
    public C15830rv A09;
    public C20350zu A0A;
    public C24671Gv A0B;
    public C16510tB A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G = true;
    public boolean A0H;
    public final AnonymousClass29Q A0I = new AnonymousClass29Q();
    public final HashSet A0J = new LinkedHashSet();

    public void A0n(Bundle bundle) {
        this.A0V = true;
        this.A02 = System.currentTimeMillis();
        C001000l A0C2 = A0C();
        AnonymousClass00B.A06(A0C2);
        C000900k r5 = (C000900k) A0C2;
        Intent intent = r5.getIntent();
        C14710pd r1 = this.A0F;
        C16620tM r3 = C16620tM.A02;
        this.A01 = AGMods.getImgShareLimit(intent.getIntExtra("max_items", r1.A03(r3, 2614)));
        this.A0H = intent.getBooleanExtra("skip_max_items_new_limit", false);
        this.A0G = intent.getBooleanExtra("preview", true);
        this.A0E = intent.getBooleanExtra("is_in_multi_select_mode_only", false);
        AnonymousClass3DO r12 = new AnonymousClass3DO(A02(), this);
        this.A04 = r12;
        if (this.A0E) {
            this.A05 = r5.AgA(r12);
        }
        this.A09 = C15830rv.A02(intent.getStringExtra("jid"));
        this.A0D = intent.getBooleanExtra("is_favorite_filter_enabled", false);
        this.A00 = 7;
        C14550pN r9 = (C14550pN) A0C();
        AnonymousClass00B.A06(r9);
        Intent intent2 = r9.getIntent();
        if (intent2 != null) {
            String resolveType = intent2.resolveType(r9);
            if (resolveType != null) {
                if (resolveType.equals("vnd.android.cursor.dir/image") || resolveType.equals("image/*")) {
                    this.A00 = 1;
                    r9.setTitle(A0J(R.string.str1d5f));
                }
                if (resolveType.equals("vnd.android.cursor.dir/video") || resolveType.equals("video/*")) {
                    this.A00 = 4;
                    r9.setTitle(A0J(R.string.str1d60));
                }
            }
            Bundle extras = intent2.getExtras();
            String string = extras != null ? extras.getString("window_title") : null;
            if (!TextUtils.isEmpty(string)) {
                r9.A2g(string);
            }
            if (extras != null) {
                this.A00 = 7 & extras.getInt("include_media", this.A00);
            }
        }
        ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList("android.intent.extra.STREAM") : intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            HashSet hashSet = this.A0J;
            hashSet.clear();
            hashSet.addAll(parcelableArrayList);
            this.A05 = r5.AgA(this.A04);
            this.A06.A01();
        }
        A0a(true);
        A1I(false);
        C24671Gv r2 = this.A0B;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        r2.A02(stickyHeadersRecyclerView.getContext());
        stickyHeadersRecyclerView.A0o(new AnonymousClass3RO(r2));
        if (this.A0F.A0E(r3, 2576)) {
            C57652rX r13 = new C57652rX(this);
            this.A08 = r13;
            this.A08.A14.add(r13);
        }
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putParcelableArrayList("android.intent.extra.STREAM", new ArrayList(this.A0J));
    }

    public void A0w() {
        super.A0w();
        if (this.A03 != null) {
            A0D().unregisterReceiver(this.A03);
            this.A03 = null;
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        C54362hJ r1;
        if (i2 == 1) {
            C001000l A0C2 = A0C();
            AnonymousClass00B.A06(A0C2);
            C000900k r4 = (C000900k) A0C2;
            if (i3 == -1) {
                r4.setResult(-1, intent);
            } else if (i3 == 2) {
                r4.setResult(2);
            } else if (i3 == 1) {
                ArrayList<Object> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                HashSet hashSet = this.A0J;
                hashSet.clear();
                if (parcelableArrayListExtra != null) {
                    hashSet.addAll(parcelableArrayListExtra);
                }
                if (this instanceof NewMediaPickerFragment) {
                    NewMediaPickerFragment newMediaPickerFragment = (NewMediaPickerFragment) this;
                    if (parcelableArrayListExtra != null) {
                        int size = parcelableArrayListExtra.size();
                        Set set = newMediaPickerFragment.A05;
                        if (size < set.size()) {
                            ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(parcelableArrayListExtra, 10));
                            for (Object obj : parcelableArrayListExtra) {
                                arrayList.add(obj.toString());
                            }
                            Set A0F2 = C003101j.A0F(arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object next : set) {
                                if (A0F2.contains(((AnonymousClass2BF) next).A9L().toString())) {
                                    arrayList2.add(next);
                                }
                            }
                            set.clear();
                            set.addAll(arrayList2);
                            RecyclerView recyclerView = newMediaPickerFragment.A04;
                            AnonymousClass01X r12 = null;
                            if (recyclerView != null) {
                                r12 = recyclerView.A0N;
                            }
                            if ((r12 instanceof C54362hJ) && (r1 = (C54362hJ) r12) != null) {
                                List list = r1.A02;
                                list.clear();
                                list.addAll(set);
                                r1.A01();
                            }
                        }
                    }
                }
                AnonymousClass05J r0 = this.A05;
                if (r0 == null) {
                    this.A05 = r4.AgA(this.A04);
                } else {
                    r0.A06();
                }
                this.A0I.A01(intent.getExtras());
                this.A06.A01();
                return;
            } else if (i3 == 0 && !A1K()) {
                this.A0I.A00.clear();
                return;
            } else {
                return;
            }
            r4.finish();
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        if (this.A01 > 1) {
            menu.add(0, R.id.menuitem_select_multiple, 0, A0J(R.string.str1d85)).setIcon(AnonymousClass2SR.A02(A02(), R.drawable.ic_action_select_multiple_teal, R.color.color045e)).setShowAsAction(2);
        }
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
            return false;
        }
        C001000l A0C2 = A0C();
        AnonymousClass00B.A06(A0C2);
        this.A05 = ((C000900k) A0C2).AgA(this.A04);
        this.A06.A01();
        return true;
    }

    public void A12() {
        super.A12();
        this.A04 = null;
        this.A05 = null;
        int childCount = this.A08.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.A08.getChildAt(i2);
            if (childAt instanceof C54482hb) {
                ((ImageView) childAt).setImageDrawable((Drawable) null);
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
        this.A03 = new IDxBReceiverShape7S0100000_2_I0(this, 10);
        A0D().registerReceiver(this.A03, intentFilter);
    }

    public boolean A1M(AnonymousClass2BF r7, C54502hd r8) {
        int i2;
        if (this.A01 <= 1) {
            return false;
        }
        Uri A9L = r7.A9L();
        HashSet hashSet = this.A0J;
        if (!hashSet.contains(A9L) && this.A08 != null && hashSet.size() < this.A01) {
            C005602k A012 = RecyclerView.A01(r8);
            if (A012 != null) {
                i2 = A012.A06;
                if (i2 == -1) {
                    i2 = A012.A05;
                }
            } else {
                i2 = -1;
            }
            C57652rX r1 = this.A08;
            r1.A04 = true;
            r1.A03 = i2;
            r1.A00 = r8.getHeight() >> 1;
        }
        if (A1K()) {
            A1O(r7);
            return true;
        }
        hashSet.add(A9L);
        this.A0I.A03(new AnonymousClass20I(A9L));
        C001000l A0C2 = A0C();
        AnonymousClass00B.A06(A0C2);
        this.A05 = ((C000900k) A0C2).AgA(this.A04);
        this.A06.A01();
        A1G(hashSet.size());
        return true;
    }

    public void A1N() {
        this.A0J.clear();
        this.A06.A01();
    }

    public void A1O(AnonymousClass2BF r9) {
        int i2;
        if (A1K()) {
            HashSet hashSet = this.A0J;
            Uri A9L = r9.A9L();
            if (hashSet.contains(A9L)) {
                hashSet.remove(A9L);
                this.A0I.A00.remove(A9L);
            } else {
                if (!this.A0H && hashSet.size() >= (i2 = this.A01) && !this.A0F) {
                    C14710pd r1 = this.A0F;
                    C16620tM r3 = C16620tM.A02;
                    this.A01 = i2 + (r1.A03(r3, 2693) - this.A0F.A03(r3, 2614));
                    this.A0F = true;
                }
                if (hashSet.size() >= this.A01) {
                    this.A07.A0H(A02().getString(R.string.str1616, new Object[]{Integer.valueOf(this.A01)}), 0);
                } else {
                    hashSet.add(A9L);
                    this.A0I.A03(new AnonymousClass20I(A9L));
                }
            }
            boolean isEmpty = hashSet.isEmpty();
            AnonymousClass05J r0 = this.A05;
            AnonymousClass00B.A06(r0);
            if (isEmpty) {
                r0.A06();
            } else {
                r0.A06();
                this.A07.A0L(new RunnableRunnableShape9S0100000_I0_8(this, 15), 300);
            }
            this.A06.A01();
            return;
        }
        HashSet hashSet2 = new HashSet();
        Uri A9L2 = r9.A9L();
        hashSet2.add(A9L2);
        this.A0I.A03(new AnonymousClass20I(A9L2));
        A1P(hashSet2);
    }

    public void A1P(Set set) {
        if (set != null && !set.isEmpty()) {
            ArrayList arrayList = new ArrayList(set);
            C001000l A0D2 = A0D();
            if (this.A0G) {
                int intExtra = A0D2.getIntent().getIntExtra("origin", 1);
                AnonymousClass2KC r4 = new AnonymousClass2KC(A0D2);
                r4.A0E = arrayList;
                r4.A0A = C16030sJ.A03(this.A09);
                int i2 = this.A01;
                HashSet hashSet = this.A0J;
                r4.A01 = i2 - hashSet.size();
                r4.A0J = this.A0F;
                r4.A02 = intExtra;
                r4.A04 = System.currentTimeMillis() - this.A02;
                r4.A05 = A0D2.getIntent().getLongExtra("picker_open_time", 0);
                r4.A06 = A0D2.getIntent().getLongExtra("quoted_message_row_id", 0);
                r4.A0B = A0D2.getIntent().getStringExtra("quoted_group_jid");
                boolean z2 = false;
                if (intExtra != 20) {
                    z2 = true;
                }
                r4.A0H = z2;
                r4.A0F = A0D2.getIntent().getBooleanExtra("number_from_url", false);
                this.A07.A03(A1K(), hashSet.size());
                if (intExtra == 35) {
                    r4.A0I = false;
                } else {
                    r4.A0I = true;
                }
                AnonymousClass29Q r3 = this.A0I;
                AnonymousClass20I A002 = r3.A00((Uri) arrayList.get(0));
                List A082 = C16030sJ.A08(UserJid.class, A0D2.getIntent().getStringArrayListExtra("mentions"));
                Iterator it = new ArrayList(r3.A00.values()).iterator();
                while (it.hasNext()) {
                    AnonymousClass20I r1 = (AnonymousClass20I) it.next();
                    r1.A0D(r1.A07());
                    r1.A0E(r1.A09());
                }
                String A092 = A002.A09();
                if (!A082.isEmpty() && TextUtils.isEmpty(A092)) {
                    A002.A0E(C39501sa.A00(A082));
                }
                String stringExtra = A0D2.getIntent().getStringExtra("android.intent.extra.TEXT");
                String A072 = A002.A07();
                if (!TextUtils.isEmpty(stringExtra) && TextUtils.isEmpty(A072)) {
                    A002.A0D(stringExtra);
                }
                Bundle bundle = new Bundle();
                r3.A02(bundle);
                r4.A08 = bundle;
                if (!C455529g.A00 || arrayList.size() != 1 || this.A0A == null) {
                    AnonymousClass00B.A06(A0D2);
                } else {
                    Uri uri = (Uri) arrayList.get(0);
                    C54502hd A1B = A1B(uri);
                    if (A1B != null) {
                        r4.A07 = uri;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new AnonymousClass01Q(A1B, uri.toString()));
                        View findViewById = this.A0A.findViewById(R.id.header_transition);
                        arrayList2.add(new AnonymousClass01Q(findViewById, C004601z.A0L(findViewById)));
                        View findViewById2 = this.A0A.findViewById(R.id.transition_clipper_bottom);
                        C004601z.A0n(findViewById2, new C54602hp(A0D()).A00(R.string.str1dd5));
                        arrayList2.add(new AnonymousClass01Q(findViewById2, C004601z.A0L(findViewById2)));
                        View findViewById3 = this.A0A.findViewById(R.id.gallery_filter_swipe_transition);
                        arrayList2.add(new AnonymousClass01Q(findViewById3, C004601z.A0L(findViewById3)));
                        View findViewById4 = this.A0A.findViewById(R.id.gallery_send_button_transition);
                        arrayList2.add(new AnonymousClass01Q(findViewById4, C004601z.A0L(findViewById4)));
                        Bitmap bitmap = A1B.A00;
                        if (bitmap != null) {
                            C34711kk A022 = this.A09.A02();
                            StringBuilder sb = new StringBuilder();
                            sb.append(uri);
                            sb.append("-gallery_thumb");
                            A022.A03(sb.toString(), bitmap);
                        }
                        A0D2.startActivityForResult(r4.A00(), 1, AnonymousClass09N.A02(A0D2, (AnonymousClass01Q[]) arrayList2.toArray(new AnonymousClass01Q[0])).A03());
                        return;
                    }
                }
                A0D2.startActivityForResult(r4.A00(), 1);
                return;
            }
            Intent intent = new Intent();
            AnonymousClass00B.A06(A0D2);
            intent.putExtra("bucket_uri", A0D2.getIntent().getData());
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.setData(arrayList.size() == 1 ? (Uri) arrayList.get(0) : null);
            A0D2.setResult(-1, intent);
            A0D2.finish();
        }
    }

    public boolean ALP() {
        int i2;
        if (!this.A0H && this.A0J.size() >= (i2 = this.A01) && !this.A0F) {
            C14710pd r1 = this.A0F;
            C16620tM r3 = C16620tM.A02;
            this.A01 = i2 + (r1.A03(r3, 2693) - this.A0F.A03(r3, 2614));
            this.A0F = true;
        }
        return this.A0J.size() >= this.A01;
    }

    public void AdI(AnonymousClass2BF r3) {
        if (!this.A0J.contains(r3.A9L())) {
            A1O(r3);
        }
    }

    public void Aff() {
        this.A07.A0H(A02().getString(R.string.str1616, new Object[]{Integer.valueOf(this.A01)}), 0);
    }

    public void AhE(AnonymousClass2BF r3) {
        if (this.A0J.contains(r3.A9L())) {
            A1O(r3);
        }
    }
}
