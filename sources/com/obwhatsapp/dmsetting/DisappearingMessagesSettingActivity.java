package com.obwhatsapp.dmsetting;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass2Z3;
import X.AnonymousClass2Z4;
import X.AnonymousClass391;
import X.C111495gL;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14750ph;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15820ru;
import X.C15830rv;
import X.C16000sG;
import X.C16030sJ;
import X.C17220uj;
import X.C18450wi;
import X.C18600wx;
import X.C19980zJ;
import X.C40491uD;
import X.C447725m;
import X.C45922Bq;
import X.C74653qt;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape133S0100000_2_I1;
import com.obwhatsapp.ListItemWithLeftIcon;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class DisappearingMessagesSettingActivity extends C111495gL {
    public int A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public C15800rs A03;
    public C18600wx A04;
    public AnonymousClass2Z3 A05;
    public AnonymousClass2Z4 A06;
    public C17220uj A07;

    public static /* synthetic */ void A02(DisappearingMessagesSettingActivity disappearingMessagesSettingActivity) {
        int i2 = disappearingMessagesSettingActivity.A00;
        Intent A09 = C13680ns.A09();
        C14750ph.A0r(disappearingMessagesSettingActivity, A09, i2);
        disappearingMessagesSettingActivity.startActivityForResult(A09, 100);
    }

    public static /* synthetic */ void A03(DisappearingMessagesSettingActivity disappearingMessagesSettingActivity) {
        C18600wx r0 = disappearingMessagesSettingActivity.A04;
        C18450wi.A0F(r0);
        Integer A042 = r0.A04();
        C18450wi.A0B(A042);
        int intValue = A042.intValue();
        AnonymousClass2Z3 r4 = disappearingMessagesSettingActivity.A05;
        if (r4 != null) {
            r4.A01((List) null, 1, intValue, 0, 0, disappearingMessagesSettingActivity.A00);
            AnonymousClass391 r2 = new AnonymousClass391(disappearingMessagesSettingActivity);
            r2.A0D = true;
            r2.A0F = true;
            r2.A0R = AnonymousClass000.A0u();
            r2.A0A = true;
            r2.A0I = A042;
            disappearingMessagesSettingActivity.startActivityForResult(r2.A00(), 1);
            return;
        }
        throw C18450wi.A03("ephemeralSettingLogger");
    }

    public final void A35(List list) {
        int i2;
        String quantityString;
        ListItemWithLeftIcon listItemWithLeftIcon = this.A01;
        if (listItemWithLeftIcon != null) {
            C15800rs r0 = this.A03;
            if (r0 != null) {
                C15810rt r3 = r0.A00;
                r3.A0C();
                ArrayList arrayList = r0.A01;
                synchronized (arrayList) {
                    Iterator it = arrayList.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        i2 += AnonymousClass000.A1Q(r3.A01(((C15820ru) it.next()).A01)) ? 1 : 0;
                    }
                }
                AnonymousClass2Z4 r6 = this.A06;
                C18450wi.A0F(r6);
                int i3 = 0;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C15830rv A0B = C13700nu.A0B(it2);
                        C15810rt r1 = r6.A05;
                        C16000sG r02 = r6.A04;
                        C18450wi.A0F(A0B);
                        if (C40491uD.A00(r02, r1, A0B) == 0) {
                            i3++;
                        }
                    }
                }
                int i4 = i2 + i3;
                if (i4 == 0) {
                    quantityString = getString(R.string.str0710);
                } else {
                    Resources resources = getResources();
                    Object[] A1b = C13680ns.A1b();
                    AnonymousClass000.A1M(A1b, i4, 0);
                    quantityString = resources.getQuantityString(R.plurals.plurals0038, i4, A1b);
                }
                C18450wi.A0E(quantityString);
                listItemWithLeftIcon.setDescription(quantityString);
                return;
            }
            throw C18450wi.A03("conversationsManager");
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i3;
        Intent intent2 = intent;
        int i5 = i2;
        super.onActivityResult(i5, i4, intent2);
        if (intent == null) {
            return;
        }
        if (i5 == 1) {
            int intExtra = intent2.getIntExtra("all_contacts_count", 0);
            C18600wx r0 = this.A04;
            C18450wi.A0F(r0);
            int i6 = r0.A05.A00().getInt("disappearing_mode_duration_for_chat_picker_int", 0);
            List A072 = C16030sJ.A07(intent2, C15830rv.class);
            C18600wx r02 = this.A04;
            C18450wi.A0F(r02);
            Integer A042 = r02.A04();
            C18450wi.A0B(A042);
            if (i4 == -1) {
                int intValue = A042.intValue();
                AnonymousClass2Z4 r9 = this.A06;
                C18450wi.A0F(r9);
                r9.A00(A072, i6, intValue, intExtra, this.A00);
                View view = this.A00;
                if (A072.size() > 0 && view != null) {
                    A35(A072);
                    return;
                }
                return;
            }
            int intValue2 = A042.intValue();
            AnonymousClass2Z3 r3 = this.A05;
            if (r3 != null) {
                r3.A01(A072, 2, intValue2, 0, intExtra, this.A00);
                return;
            }
            throw C18450wi.A03("ephemeralSettingLogger");
        } else if (i5 == 100 && i4 == -1) {
            int intExtra2 = intent2.getIntExtra("duration", 0);
            String string = intExtra2 == 0 ? getString(R.string.str0713) : C40491uD.A03(this, intExtra2, false, false);
            C18450wi.A0B(string);
            ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
            C18450wi.A0F(listItemWithLeftIcon);
            listItemWithLeftIcon.setDescription(string);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04c4);
        this.A00 = getIntent().getIntExtra("entry_point", 7);
        this.A02 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_default_messsage_timer_row);
        this.A01 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_chat_picker_row);
        View A052 = AnonymousClass00T.A05(this, R.id.toolbar);
        C18450wi.A0B(A052);
        Toolbar toolbar = (Toolbar) A052;
        toolbar.setNavigationIcon((Drawable) C447725m.A00(this, this.A01, R.drawable.ic_back));
        toolbar.setTitle((CharSequence) getString(R.string.str080f));
        toolbar.setBackgroundResource(R.color.color064b);
        toolbar.setNavigationOnClickListener(new IDxCListenerShape133S0100000_2_I1(this, 0));
        toolbar.A0C(this, R.style.style02e9);
        Aem(toolbar);
        View A053 = AnonymousClass00T.A05(this, R.id.dm_description);
        C18450wi.A0B(A053);
        String A042 = C18450wi.A04(this, R.string.str071a);
        C14870pt r7 = this.A05;
        C19980zJ r6 = this.A00;
        AnonymousClass01V r9 = this.A08;
        C17220uj r2 = this.A07;
        C18450wi.A0F(r2);
        C45922Bq.A08(this, r2.A05("chats", "about-disappearing-messages"), r6, r7, (TextEmojiLabel) A053, r9, A042);
        C18600wx r0 = this.A04;
        C18450wi.A0F(r0);
        Integer A043 = r0.A04();
        C18450wi.A0B(A043);
        int intValue = A043.intValue();
        String string = intValue == 0 ? getString(R.string.str0713) : C40491uD.A03(this, intValue, false, false);
        C18450wi.A0B(string);
        ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
        C18450wi.A0F(listItemWithLeftIcon);
        listItemWithLeftIcon.setDescription(string);
        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A02;
        if (listItemWithLeftIcon2 != null) {
            C13690nt.A19(listItemWithLeftIcon2, this, 1);
        }
        A35((List) null);
        ListItemWithLeftIcon listItemWithLeftIcon3 = this.A01;
        if (listItemWithLeftIcon3 != null) {
            C13690nt.A19(listItemWithLeftIcon3, this, 2);
        }
        int i2 = 1;
        if (this.A00 == 6) {
            i2 = 0;
        }
        AnonymousClass2Z3 r22 = this.A05;
        if (r22 != null) {
            C74653qt r1 = new C74653qt();
            r1.A00 = Integer.valueOf(i2);
            r1.A01 = C13690nt.A0W(r22.A01.A04().intValue());
            r22.A02.A06(r1);
            return;
        }
        throw C18450wi.A03("ephemeralSettingLogger");
    }
}
