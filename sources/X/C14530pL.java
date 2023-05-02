package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaInAppBrowsingActivity;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.obwhatsapp.deeplink.DeepLinkActivity;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.report.ReportActivity;
import com.obwhatsapp.support.faq.FaqItemActivity;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.0pL  reason: invalid class name and case insensitive filesystem */
public class C14530pL extends C14540pM implements C14620pU {
    public C19980zJ A00;
    public C16040sK A01;
    public C23071Aj A02;
    public AnonymousClass15P A03;
    public C16190sc A04;
    public C16440t3 A05;
    public C14730pf A06;
    public C18370wa A07;
    public C49172Rk A08;
    public C15960sC A09;
    public C19490yW A0A;
    public C23061Ai A0B;
    public boolean A0C = true;
    public boolean A0D;
    public final Set A0E = new CopyOnWriteArraySet();

    public static Intent A0B(DeepLinkActivity deepLinkActivity) {
        return new Intent(deepLinkActivity, deepLinkActivity.A0c.A03().AEt());
    }

    public static AnonymousClass127 A0D(C16150sX r1, AnonymousClass1V8 r2) {
        r2.A00 = new AnonymousClass2SX();
        r2.A0B = (AnonymousClass1BJ) r1.AOm.get();
        r2.A0C = (C16760tb) r1.APV.get();
        r2.A0N = (C17200uh) r1.A52.get();
        r2.A0J = (C16000sG) r1.A4x.get();
        r2.A0L = (C16080sP) r1.AQ9.get();
        r2.A0F = (AnonymousClass01Y) r1.A1w.get();
        r2.A0K = (C17140ub) r1.A4y.get();
        r2.A0U = new C25781Lc();
        r2.A0I = (AnonymousClass19Y) r1.A4r.get();
        r2.A0S = (AnonymousClass013) r1.AR8.get();
        return (AnonymousClass127) r1.A3z.get();
    }

    public static AnonymousClass2DF A0K(C42821yj r0) {
        return ((AnonymousClass1yR) r0.A22).A00;
    }

    public static AnonymousClass20I A0L(MediaComposerFragment mediaComposerFragment) {
        return ((MediaComposerActivity) ((AnonymousClass29K) mediaComposerFragment.A0C())).A1S.A00(mediaComposerFragment.A00);
    }

    public static C15830rv A0M(Activity activity) {
        return C15830rv.A02(activity.getIntent().getStringExtra("jid"));
    }

    public static C16050sL A0N(Intent intent, String str) {
        C16050sL A052 = C16050sL.A05(intent.getStringExtra(str));
        AnonymousClass00B.A06(A052);
        return A052;
    }

    public static UserJid A0O(Intent intent, String str) {
        UserJid nullable = UserJid.getNullable(intent.getStringExtra(str));
        AnonymousClass00B.A06(nullable);
        return nullable;
    }

    public static String A0P(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("extra_referral_screen");
    }

    public static String A0Q(ReportActivity reportActivity) {
        return C28891Zc.A04(reportActivity.A0I, reportActivity.A0L.A04.A0J("business_activity_report_timestamp"));
    }

    public static AnonymousClass01J A0R(C49132Rg r2, C16150sX r3, C14530pL r4) {
        AnonymousClass01J r1 = r3.AP2;
        r4.A05 = (C16440t3) r1.get();
        r4.A0B = (C23061Ai) r3.AC0.get();
        r4.A01 = (C16040sK) r3.ADr.get();
        r4.A04 = (C16190sc) r3.A8R.get();
        r4.A08 = r2.A0K();
        r4.A06 = (C14730pf) r3.ANy.get();
        r4.A00 = (C19980zJ) r3.A0P.get();
        r4.A02 = (C23071Aj) r3.AQb.get();
        r4.A03 = (AnonymousClass15P) r3.A0b.get();
        r4.A0A = (C19490yW) r3.ALQ.get();
        r4.A09 = (C15960sC) r3.AKz.get();
        r4.A07 = C16150sX.A0d(r3);
        return r1;
    }

    public static AnonymousClass1UT A0S() {
        return new AnonymousClass1UT(C18450wi.A06("An operation is not implemented: ", "Not yet implemented"));
    }

    private void A0T() {
        getResources().getConfiguration().fontScale = getApplicationContext().getResources().getConfiguration().fontScale;
        getResources().updateConfiguration(getResources().getConfiguration(), getResources().getDisplayMetrics());
    }

    public static void A0U(Context context, Menu menu) {
        menu.add(0, R.id.menuitem_contactqr_share, 0, R.string.str0585).setIcon(AnonymousClass2SR.A02(context, R.drawable.ic_share, R.color.color071e)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_contactqr_revoke, 0, R.string.str057a);
    }

    public static void A0V(Context context, TextView textView, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new BulletSpan((int) context.getResources().getDimension(R.dimen.dimen06f4)), 0, spannableStringBuilder.length(), 0);
        textView.setText(spannableStringBuilder);
    }

    public static void A0W(Context context, Toolbar toolbar, AnonymousClass013 r5) {
        toolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A06(context.getResources().getDrawable(R.drawable.ic_back), context.getResources().getColor(R.color.color04ef)), r5));
    }

    public static void A0X(TextView textView, MessageDetailsActivity messageDetailsActivity, long j2) {
        textView.setText(C28961Zl.A01(messageDetailsActivity.A01, messageDetailsActivity.A05.A02(j2)));
    }

    public static void A0Y(C000900k r1) {
        C005402i x2 = r1.x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
    }

    public static void A0Z(C32501gU r1, C16150sX r2) {
        r1.A00 = new AnonymousClass2SX();
        r1.A0D = (C17200uh) r2.A52.get();
        r1.A09 = (C16000sG) r2.A4x.get();
        r1.A0B = (C16080sP) r2.AQ9.get();
        r1.A06 = (AnonymousClass01Y) r2.A1w.get();
        r1.A0F = new C25781Lc();
        r1.A07 = (AnonymousClass127) r2.A3z.get();
        r1.A08 = (AnonymousClass19Y) r2.A4r.get();
        r1.A0E = (AnonymousClass18R) r2.ABZ.get();
        r1.A0A = (C17140ub) r2.A4y.get();
    }

    public static void A0a(C49132Rg r1, C16150sX r2, C49302Si r3) {
        r3.A07 = (C15810rt) r2.A43.get();
        r3.A09 = (AnonymousClass11G) r2.ANN.get();
        r3.A0A = (C206711d) r2.AKp.get();
        r3.A05 = (C16000sG) r2.A4x.get();
        r3.A06 = (C16080sP) r2.AQ9.get();
        r3.A0H = (AnonymousClass1A9) r2.AE7.get();
        r3.A0B = (AnonymousClass1BQ) r2.A7f.get();
        r3.A0E = (C17020u3) r2.AMG.get();
        r3.A0F = (AnonymousClass1BU) r2.ANA.get();
        r3.A0I = C17270uo.A00(r2.A5z);
        r3.A04 = (C49332Sl) r1.A0c.get();
    }

    public static void A0b(C49132Rg r1, C16150sX r2, C14530pL r3, C16290sm r4) {
        r3.A0A = r4;
        r3.A05 = (C16440t3) r2.AP2.get();
        r3.A0B = (C23061Ai) r2.AC0.get();
        r3.A01 = (C16040sK) r2.ADr.get();
        r3.A04 = (C16190sc) r2.A8R.get();
        r3.A08 = r1.A0K();
        r3.A06 = (C14730pf) r2.ANy.get();
        r3.A00 = (C19980zJ) r2.A0P.get();
        r3.A02 = (C23071Aj) r2.AQb.get();
        r3.A03 = (AnonymousClass15P) r2.A0b.get();
        r3.A0A = (C19490yW) r2.ALQ.get();
        r3.A09 = (C15960sC) r2.AKz.get();
        r3.A07 = C16150sX.A0d(r2);
    }

    public static void A0c(C49132Rg r0, C16150sX r1, AnonymousClass2SL r2) {
        r2.A00 = (AnonymousClass2SO) r0.A0y.get();
        r2.A01 = (C24511Gf) r1.A3U.get();
        r2.A02 = (C17170ue) r1.A3W.get();
        r2.A04 = (AnonymousClass1KS) r1.AGl.get();
    }

    public static void A0d(C49132Rg r1, C16150sX r2, C45692Af r3) {
        r3.A0C = (AnonymousClass11K) r2.A7x.get();
        r3.A0B = (AnonymousClass17R) r2.A7v.get();
        r3.A0K = (C17020u3) r2.AMG.get();
        r3.A0L = (AnonymousClass1BU) r2.ANA.get();
        r3.A0I = (AnonymousClass18R) r2.ABZ.get();
        r3.A0N = C17270uo.A00(r2.A5z);
        r3.A09 = (C20270zm) r2.A5v.get();
        r3.A08 = r1.A0D();
        r3.A01 = (AnonymousClass2SQ) r1.A0l.get();
    }

    public static void A0e(C49132Rg r1, C16150sX r2, C45692Af r3) {
        r3.A00 = new AnonymousClass2SX();
        r3.A02 = (AnonymousClass10X) r2.ALc.get();
        r3.A0H = r1.A0I();
        r3.A0G = (C206711d) r2.AKp.get();
        r3.A0M = (C23631Ct) r2.ART.get();
        r3.A0D = (AnonymousClass17F) r2.AAo.get();
        r3.A04 = (C17140ub) r2.A4y.get();
        r3.A03 = (AnonymousClass127) r2.A3z.get();
        r3.A0E = (C16900tq) r2.AFT.get();
        r3.A05 = (C17030uP) r2.APp.get();
        r3.A0A = (AnonymousClass10C) r2.AN0.get();
        r3.A0F = (C19410yO) r2.A4T.get();
    }

    public static void A0f(C16150sX r1, WaInAppBrowsingActivity waInAppBrowsingActivity) {
        waInAppBrowsingActivity.A03 = (C17090uW) r1.ADM.get();
        waInAppBrowsingActivity.A04 = (C18030w2) r1.A6W.get();
    }

    public static void A0g(C16150sX r1, AnonymousClass127 r2, AnonymousClass1V8 r3) {
        r3.A0G = r2;
        r3.A0T = (AnonymousClass18R) r1.ABZ.get();
        r3.A0R = (C220516l) r1.A4u.get();
    }

    public static void A0h(C16150sX r1, C49362Sq r2) {
        r2.A05 = (AnonymousClass120) r1.A4z.get();
        r2.A07 = (C218115n) r1.AH2.get();
        r2.A09 = (AnonymousClass121) r1.AJY.get();
        r2.A04 = C16150sX.A0K(r1);
        r2.A03 = (AnonymousClass1L4) r1.A4K.get();
        r2.A08 = (C17020u3) r1.AMG.get();
        r2.A06 = (AnonymousClass152) r1.A51.get();
    }

    public static void A0i(C14550pN r1, AnonymousClass01D r2) {
        AnonymousClass1B9 r22 = (AnonymousClass1B9) r2.get();
        boolean z2 = true;
        if (!AnonymousClass1B9.A00(r1.A00)) {
            z2 = false;
        }
        r22.A05 = z2;
        r22.A04 = z2;
        r22.A03 = z2;
    }

    public static /* synthetic */ void A0k(C14530pL r4) {
        r4.A09.A0K().putBoolean("smb_client_viewed_eu_tos_update", true).apply();
        r4.A00.A06(r4, new Intent("android.intent.action.VIEW", r4.A02.A00(((SharedPreferences) r4.A09.A01.get()).getString("smb_eu_tos_update_url", (String) null))));
    }

    public static /* synthetic */ void A0m(C14530pL r4, Integer num) {
        Intent className = new Intent().setClassName(r4.getPackageName(), "com.obwhatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", 1);
        if (num.intValue() == 1) {
            r4.finish();
            r4.startActivity(className);
        }
    }

    public static void A0n(DeepLinkActivity deepLinkActivity) {
        deepLinkActivity.Ac1();
        deepLinkActivity.Afg(R.string.str0ba6);
        deepLinkActivity.A00.removeMessages(1);
    }

    public static void A0o(FaqItemActivity faqItemActivity) {
        faqItemActivity.A02 += System.currentTimeMillis() - faqItemActivity.A01;
        faqItemActivity.A01 = System.currentTimeMillis();
        faqItemActivity.setResult(-1, new Intent().putExtra("article_id", faqItemActivity.A00).putExtra("total_time_spent", faqItemActivity.A02));
    }

    private boolean A0p() {
        return getApplicationContext().getResources().getConfiguration().fontScale == getResources().getConfiguration().fontScale;
    }

    public static boolean A0q(Menu menu) {
        menu.add(0, 0, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        menu.add(0, 1, 0, R.string.str1368).setIcon(R.drawable.ic_action_refresh).setShowAsAction(1);
        return true;
    }

    public void A2m() {
    }

    public void A2n() {
    }

    public void A2o() {
    }

    public void A2p() {
    }

    public void A2q() {
    }

    public void A2r() {
    }

    public void A2s() {
    }

    public void A2t() {
    }

    @Deprecated
    public void A2u() {
    }

    public void A2v() {
    }

    public void A2w() {
        int A002 = this.A09.A00();
        C16040sK r0 = this.A01;
        r0.A0B();
        if (r0.A00 == null && A002 == 11 && !isFinishing()) {
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.obwhatsapp.migration.export.ui.ExportMigrationDataExportedActivity");
            intent.setFlags(33554432);
            startActivity(intent);
            finish();
        }
    }

    public void A2x() {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        C18360wZ r1 = (C18360wZ) this.A07;
        synchronized (r1) {
            Integer num = (Integer) r1.A00.A01();
            intValue = num != null ? num.intValue() : 0;
        }
        if (intValue != 1) {
            C18360wZ r2 = (C18360wZ) this.A07;
            synchronized (r2) {
                Integer num2 = (Integer) r2.A00.A01();
                intValue2 = num2 != null ? num2.intValue() : 0;
            }
            if (intValue2 != 4) {
                C18360wZ r22 = (C18360wZ) this.A07;
                synchronized (r22) {
                    Integer num3 = (Integer) r22.A00.A01();
                    intValue3 = num3 != null ? num3.intValue() : 0;
                }
                if (intValue3 != 3) {
                    C18360wZ r12 = (C18360wZ) this.A07;
                    synchronized (r12) {
                        Integer num4 = (Integer) r12.A00.A01();
                        intValue4 = num4 != null ? num4.intValue() : 0;
                    }
                    if (intValue4 == 0) {
                        ((C18360wZ) this.A07).A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 4));
                        return;
                    }
                    return;
                }
            }
        }
        Intent className = new Intent().setClassName(getPackageName(), "com.obwhatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
        className.putExtra("blocking_type", 1);
        finish();
        startActivity(className);
    }

    public void A2y() {
    }

    public void A2z(int i2) {
        super.onCreateDialog(i2);
    }

    public void A30(AnonymousClass2Su r3) {
        synchronized (this.A0E) {
            this.A0E.add(r3);
        }
    }

    public void A31(AnonymousClass2Su r3) {
        synchronized (this.A0E) {
            this.A0E.remove(r3);
        }
    }

    public void A32(boolean z2) {
        this.A0C = z2;
    }

    public boolean A33() {
        return false;
    }

    public boolean A34() {
        return this.A03.A04();
    }

    public /* synthetic */ AnonymousClass00F AFf() {
        return AnonymousClass01S.A03;
    }

    public void Agv(List list) {
        C14870pt r2;
        int i2;
        if (list.size() != 1) {
            boolean contains = list.contains(C34771kq.A00);
            r2 = this.A05;
            i2 = R.string.str150b;
            if (contains) {
                i2 = R.string.str150c;
            }
        } else if (!C16030sJ.A0Q((Jid) list.get(0))) {
            r2 = this.A05;
            i2 = R.string.str150a;
        } else {
            return;
        }
        r2.A09(i2, 1);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        synchronized (this.A0E) {
            for (AnonymousClass2Su r0 : this.A0E) {
                if (r0 != null) {
                    r0.AM4(intent, i2, i3);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (!A0p()) {
            A0T();
        }
        super.onCreate(bundle);
        C33871jK r2 = this.A0O;
        if (C33871jK.A02) {
            r2.A00 = (DialogFragment) r2.A01.AGM().A0B(C33871jK.A03);
        }
        this.A03.A00(this);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);
        others.paintHome(viewGroup, this);
        yo.H1(viewGroup, this);
        return true;
    }

    public void onDestroy() {
        this.A0E.clear();
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 82 || !this.A0D) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.A0D = true;
        }
        return super.onKeyLongPress(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.A0D = false;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void onResume() {
        super.onResume();
        if (!A34()) {
            return;
        }
        if (this.A03.A06()) {
            Intent className = new Intent().setClassName(getPackageName(), "com.obwhatsapp.authentication.AppAuthenticationActivity");
            className.setFlags(131072);
            Ag3(className, 202);
            overridePendingTransition(0, 0);
            return;
        }
        this.A03.A02(false);
    }

    public void onStart() {
        super.onStart();
        A2x();
        A2w();
    }
}
