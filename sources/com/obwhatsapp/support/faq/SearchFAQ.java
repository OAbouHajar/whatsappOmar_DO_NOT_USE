package com.obwhatsapp.support.faq;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15W;
import X.AnonymousClass1BY;
import X.AnonymousClass1KO;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y2;
import X.AnonymousClass1Y4;
import X.AnonymousClass39V;
import X.AnonymousClass3MK;
import X.C15910s6;
import X.C16490t9;
import X.C56622oE;
import X.C74853rD;
import X.C84884Mg;
import X.C93484jH;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SearchFAQ extends AnonymousClass1Y1 implements AnonymousClass1Y2 {
    public int A00;
    public AnonymousClass1KO A01;
    public C16490t9 A02;
    public AnonymousClass15W A03;
    public AnonymousClass1BY A04;
    public AnonymousClass39V A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public HashMap A0A;
    public HashSet A0B;
    public List A0C;

    public final void A36(int i2) {
        C74853rD r3 = new C74853rD();
        r3.A00 = Integer.valueOf(i2);
        r3.A01 = this.A07;
        r3.A02 = this.A01.A06();
        this.A05.Acl(new RunnableRunnableShape11S0200000_I0_9(this, 14, r3));
    }

    public final void A37(C84884Mg r9) {
        HashSet hashSet = this.A0B;
        String str = r9.A03;
        hashSet.add(str);
        String str2 = r9.A02;
        String str3 = r9.A01;
        long j2 = r9.A00;
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.obwhatsapp.support.faq.FaqItemActivity");
        intent.putExtra("title", str2);
        intent.putExtra("content", str3);
        intent.putExtra("url", str);
        intent.putExtra("article_id", j2);
        startActivityForResult(intent, 1);
        overridePendingTransition(R.anim.anim003e, R.anim.anim0040);
    }

    public void AW9(boolean z2) {
        A36(3);
        if (z2) {
            setResult(-1);
            finish();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            long longExtra = intent.getLongExtra("total_time_spent", 0);
            long longExtra2 = intent.getLongExtra("article_id", -1);
            HashMap hashMap = this.A0A;
            Long valueOf = Long.valueOf(longExtra2);
            if (hashMap.containsKey(valueOf)) {
                longExtra += ((Number) this.A0A.get(valueOf)).longValue();
            }
            this.A0A.put(valueOf, Long.valueOf(longExtra));
            TextUtils.join(", ", this.A0A.entrySet());
            Iterator it = this.A0A.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void onBackPressed() {
        A36(2);
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A05.A00();
    }

    public void onCreate(Bundle bundle) {
        Runnable runnable;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        int i2 = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("com.obwhatsapp.support.faq.SearchFAQ.usePaymentsFlow", false);
        setTitle(R.string.str14a3);
        x().A0N(true);
        setContentView((int) R.layout.layout0517);
        this.A0B = new HashSet();
        if (bundle != null) {
            String[] stringArray = bundle2.getStringArray("FaqItemsReadTitles");
            if (stringArray != null) {
                Collections.addAll(this.A0B, stringArray);
            }
            if (bundle2.containsKey("timeSpentPerArticle")) {
                HashMap hashMap = (HashMap) bundle2.getSerializable("timeSpentPerArticle");
                this.A0A = hashMap;
                hashMap.size();
            }
        }
        Intent intent = getIntent();
        this.A06 = intent.getStringExtra("com.obwhatsapp.support.faq.SearchFAQ.from");
        ArrayList arrayList = new ArrayList();
        if (this.A0A == null) {
            this.A0A = new HashMap();
        }
        int intExtra = intent.getIntExtra("com.obwhatsapp.support.faq.SearchFAQ.count", 0);
        this.A00 = intExtra;
        if (booleanExtra) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("payments_support_faqs");
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("payments_support_topics");
            Bundle bundleExtra = intent.getBundleExtra("describe_problem_bundle");
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C93484jH r0 = (C93484jH) it.next();
                arrayList.add(new C84884Mg(r0.A02, r0.A00, r0.A03, Long.parseLong(r0.A01)));
            }
            runnable = new RunnableRunnableShape2S0300000_I0_2(this, parcelableArrayListExtra2, bundleExtra, 18);
        } else {
            this.A07 = intent.getStringExtra("com.obwhatsapp.support.faq.SearchFAQ.problem");
            this.A08 = intent.getStringExtra("com.obwhatsapp.support.faq.SearchFAQ.status");
            this.A09 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.obwhatsapp.support.faq.SearchFAQ.additionalDetails");
            if (stringArrayExtra != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String split : stringArrayExtra) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2) {
                        arrayList2.add(new Pair(split2[0], split2[1]));
                    }
                }
                this.A0C = arrayList2;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.titles");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.descriptions");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.urls");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.ids");
            if (!(stringArrayListExtra == null || stringArrayListExtra2 == null || stringArrayListExtra3 == null || stringArrayListExtra4 == null)) {
                if (stringArrayListExtra.size() < intExtra) {
                    intExtra = stringArrayListExtra.size();
                }
                if (stringArrayListExtra2.size() < intExtra) {
                    intExtra = stringArrayListExtra2.size();
                }
                if (stringArrayListExtra3.size() < intExtra) {
                    intExtra = stringArrayListExtra3.size();
                }
                if (stringArrayListExtra4.size() < intExtra) {
                    intExtra = stringArrayListExtra4.size();
                }
                for (int i3 = 0; i3 < intExtra; i3++) {
                    long parseLong = Long.parseLong(stringArrayListExtra4.get(i3));
                    stringArrayListExtra.get(i3);
                    stringArrayListExtra3.get(i3);
                    arrayList.add(new C84884Mg(stringArrayListExtra.get(i3), stringArrayListExtra2.get(i3), stringArrayListExtra3.get(i3), parseLong));
                }
            }
            runnable = new RunnableRunnableShape11S0200000_I0_9(this, 13, intent);
        }
        C56622oE r8 = new C56622oE(this, this, arrayList);
        ListView ADA = ADA();
        LayoutInflater A012 = AnonymousClass01V.A01(this);
        AnonymousClass00B.A06(A012);
        ADA.addHeaderView(A012.inflate(R.layout.layout0518, (ViewGroup) null), (Object) null, false);
        A35(r8);
        registerForContextMenu(ADA);
        if (arrayList.size() == 1) {
            A37((C84884Mg) arrayList.get(0));
        }
        View findViewById = findViewById(R.id.bottom_button_container);
        AnonymousClass39V r02 = new AnonymousClass39V(ADA, findViewById, getResources().getDimensionPixelSize(R.dimen.dimen06f3));
        this.A05 = r02;
        r02.A00();
        this.A05.A02(this, new AnonymousClass3MK(this, runnable), (TextView) findViewById(R.id.does_not_match_button), getString(R.string.str072b), R.style.style0172);
        this.A05.A01.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(runnable, 23));
        if (AnonymousClass1Y4.A00(this.A06) && this.A06.A05(C15910s6.A0i)) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A36(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            HashSet hashSet = this.A0B;
            if (hashSet != null && hashSet.size() > 0) {
                bundle.putStringArray("FaqItemsReadTitles", (String[]) this.A0B.toArray(new String[0]));
            }
            HashMap hashMap = this.A0A;
            if (hashMap != null && hashMap.size() > 0) {
                bundle.putSerializable("timeSpentPerArticle", hashMap);
            }
        }
        super.onSaveInstanceState(bundle);
    }
}
