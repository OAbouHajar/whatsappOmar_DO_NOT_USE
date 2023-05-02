package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape193S0100000_1_I0;
import com.facebook.redex.IDxEListenerShape269S0100000_2_I0;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.obwhatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.GroupAddBlacklistPickerActivity;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.obwhatsapp.profile.AboutStatusBlockListPickerActivity;
import com.obwhatsapp.profile.ProfilePhotoBlockListPickerActivity;
import com.obwhatsapp.status.audienceselector.StatusRecipientsActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1gU  reason: invalid class name and case insensitive filesystem */
public abstract class C32501gU extends C32511gV {
    public MenuItem A00;
    public MenuItem A01;
    public View A02;
    public AnonymousClass363 A03;
    public AnonymousClass35w A04;
    public AnonymousClass267 A05;
    public AnonymousClass01Y A06;
    public AnonymousClass127 A07;
    public AnonymousClass19Y A08;
    public C16000sG A09;
    public C17140ub A0A;
    public C16080sP A0B;
    public AnonymousClass2Ao A0C;
    public C17200uh A0D;
    public AnonymousClass18R A0E;
    public C25781Lc A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I = new ArrayList();
    public Set A0J = new HashSet();
    public boolean A0K = true;
    public final Handler A0L;
    public final AnonymousClass2A8 A0M = new AnonymousClass2A8(this);
    public final C40781ug A0N;
    public final C33481ie A0O;
    public final AnonymousClass1VD A0P;
    public final Runnable A0Q;
    public final Set A0R = new HashSet();
    public final Set A0S;
    public final Set A0T = new HashSet();

    public C32501gU() {
        HashSet hashSet = new HashSet();
        this.A0S = hashSet;
        this.A0Q = new RunnableRunnableShape1S0100000_I0((Object) hashSet, 28);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0O = new IDxCObserverShape68S0100000_2_I0(this, 0);
        this.A0N = new IDxSObserverShape63S0100000_2_I0(this, 0);
        this.A0P = new IDxPObserverShape81S0100000_2_I0(this, 0);
    }

    public static /* synthetic */ void A02(C32501gU r3) {
        AnonymousClass363 r1 = r3.A03;
        if (r1 != null) {
            r1.A06(true);
            r3.A03 = null;
        }
        AnonymousClass363 r2 = new AnonymousClass363(r3, r3.A0H, r3.A0I);
        r3.A03 = r2;
        r3.A05.Ack(r2, new Void[0]);
    }

    public void A36() {
        A38();
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, getResources().getDimensionPixelSize(R.dimen.dimen005e)));
        listView.addFooterView(view, (Object) null, false);
        invalidateOptionsMenu();
        listView.setAdapter(this.A0M);
        listView.setOnItemClickListener(new IDxCListenerShape193S0100000_1_I0(this, 0));
        A37();
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A37() {
        /*
            r8 = this;
            boolean r2 = r8.A0K
            r7 = 0
            r1 = 1
            java.util.Set r6 = r8.A0T
            boolean r0 = r6.isEmpty()
            if (r2 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0045
            r0 = 2131889640(0x7f120de8, float:1.941395E38)
        L_0x0011:
            java.lang.String r4 = r8.getString(r0)
        L_0x0015:
            android.view.MenuItem r3 = r8.A01
            if (r3 == 0) goto L_0x002e
            int r2 = r6.size()
            java.util.Set r0 = r8.A0J
            int r1 = r0.size()
            r0 = 2131891393(0x7f1214c1, float:1.9417505E38)
            if (r2 != r1) goto L_0x002b
            r0 = 2131892384(0x7f1218a0, float:1.9419515E38)
        L_0x002b:
            r3.setTitle(r0)
        L_0x002e:
            X.02i r0 = r8.x()
            X.AnonymousClass00B.A06(r0)
            r0.A0I(r4)
            return
        L_0x0039:
            if (r0 == 0) goto L_0x003f
            r0 = 2131889641(0x7f120de9, float:1.9413951E38)
            goto L_0x0011
        L_0x003f:
            X.013 r5 = r8.A01
            r4 = 2131755330(0x7f100142, float:1.9141536E38)
            goto L_0x004a
        L_0x0045:
            X.013 r5 = r8.A01
            r4 = 2131755329(0x7f100141, float:1.9141534E38)
        L_0x004a:
            int r0 = r6.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r0 = r6.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r7] = r0
            java.lang.String r4 = r5.A0J(r1, r4, r2)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32501gU.A37():void");
    }

    public final void A38() {
        AnonymousClass35w r0 = this.A04;
        if (r0 != null) {
            r0.A06(true);
        }
        AnonymousClass363 r02 = this.A03;
        if (r02 != null) {
            r02.A06(true);
            this.A03 = null;
        }
        AnonymousClass35w r2 = new AnonymousClass35w(this, this.A0T);
        this.A04 = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 150) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A05.A06()) {
            this.A05.A05(true);
            return;
        }
        Set set = this.A0R;
        Set set2 = this.A0T;
        if (!set.containsAll(set2) || !set2.containsAll(set)) {
            Afc(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0568);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        this.A0C = this.A0D.A04(this, "content-distribution-recipients-picker");
        this.A05 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape170S0100000_2_I0(this, 0), toolbar, this.A01);
        this.A0K = getIntent().getBooleanExtra("is_black_list", true);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        boolean z2 = this instanceof StatusRecipientsActivity;
        x2.A0B(this.A0K ? z2 ? R.string.str168b : this instanceof ProfilePhotoBlockListPickerActivity ? R.string.str14d0 : this instanceof AboutStatusBlockListPickerActivity ? R.string.str14c0 : this instanceof LastSeenBlockListPickerActivity ? R.string.str14ca : R.string.str0a2b : z2 ? R.string.str168c : 0);
        if (bundle != null) {
            List A082 = C16030sJ.A08(UserJid.class, bundle.getStringArrayList("selected_jids"));
            if (!A082.isEmpty()) {
                this.A0T.addAll(A082);
            }
        } else if (!this.A08.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11b6, R.string.str11b5);
        }
        View findViewById = findViewById(R.id.done);
        this.A02 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 0));
        if (this instanceof ProfilePhotoBlockListPickerActivity) {
            ProfilePhotoBlockListPickerActivity profilePhotoBlockListPickerActivity = (ProfilePhotoBlockListPickerActivity) this;
            profilePhotoBlockListPickerActivity.A00.A00().A0A(profilePhotoBlockListPickerActivity, new IDxObserverShape116S0100000_2_I1(profilePhotoBlockListPickerActivity, 125));
        } else if (this instanceof AboutStatusBlockListPickerActivity) {
            AboutStatusBlockListPickerActivity aboutStatusBlockListPickerActivity = (AboutStatusBlockListPickerActivity) this;
            aboutStatusBlockListPickerActivity.A00.A00().A0A(aboutStatusBlockListPickerActivity, new IDxObserverShape116S0100000_2_I1(aboutStatusBlockListPickerActivity, 123));
        } else if (this instanceof LastSeenBlockListPickerActivity) {
            LastSeenBlockListPickerActivity lastSeenBlockListPickerActivity = (LastSeenBlockListPickerActivity) this;
            lastSeenBlockListPickerActivity.A00.A00().A0A(lastSeenBlockListPickerActivity, new IDxObserverShape116S0100000_2_I1(lastSeenBlockListPickerActivity, 98));
        } else if (this instanceof GroupAddBlacklistPickerActivity) {
            GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
            groupAddBlacklistPickerActivity.A00.A00().A0A(groupAddBlacklistPickerActivity, new IDxObserverShape116S0100000_2_I1(groupAddBlacklistPickerActivity, 91));
        } else {
            A36();
        }
        findViewById(16908292).setVisibility(0);
        findViewById(R.id.init_contacts_progress).setVisibility(0);
        this.A0A.A02(this.A0O);
        this.A07.A02(this.A0N);
        this.A0E.A02(this.A0P);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new IDxEListenerShape269S0100000_2_I0(this, 0));
        this.A00.setVisible(!this.A0I.isEmpty());
        int i2 = R.string.str14c1;
        MenuItem icon2 = menu.add(0, R.id.menuitem_select_all, 0, R.string.str14c1).setIcon(R.drawable.ic_action_select_all);
        this.A01 = icon2;
        icon2.setShowAsAction(2);
        MenuItem menuItem = this.A01;
        if (this.A0T.size() == this.A0J.size()) {
            i2 = R.string.str18a0;
        }
        menuItem.setTitle(i2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A03(this.A0O);
        this.A07.A03(this.A0N);
        this.A0E.A03(this.A0P);
        this.A0C.A00();
        AnonymousClass35w r0 = this.A04;
        if (r0 != null) {
            r0.A06(true);
            this.A04 = null;
        }
        AnonymousClass363 r02 = this.A03;
        if (r02 != null) {
            r02.A06(true);
            this.A03 = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == R.id.menuitem_select_all) {
            Set set = this.A0T;
            if (set.size() != this.A0J.size()) {
                int i2 = 0;
                while (true) {
                    AnonymousClass2A8 r1 = this.A0M;
                    if (i2 >= r1.getCount()) {
                        break;
                    }
                    set.add(((C16010sH) r1.A00.get(i2)).A08(UserJid.class));
                    i2++;
                }
            } else {
                set.clear();
            }
            this.A0M.notifyDataSetChanged();
            A37();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            Set set2 = this.A0R;
            Set set3 = this.A0T;
            if (!set2.containsAll(set3) || !set3.containsAll(set2)) {
                Afc(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
                return true;
            }
            finish();
            return true;
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A05.A03(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0T;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", C16030sJ.A06(set));
        }
        this.A05.A04(bundle);
    }

    public boolean onSearchRequested() {
        this.A05.A02();
        return false;
    }
}
