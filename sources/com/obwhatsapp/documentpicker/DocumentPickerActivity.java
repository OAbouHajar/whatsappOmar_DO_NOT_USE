package com.obwhatsapp.documentpicker;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01V;
import X.AnonymousClass04A;
import X.AnonymousClass05J;
import X.AnonymousClass0SB;
import X.AnonymousClass1A9;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2GQ;
import X.AnonymousClass2JP;
import X.AnonymousClass2Sy;
import X.AnonymousClass2wn;
import X.AnonymousClass3DG;
import X.AnonymousClass3DN;
import X.C009804r;
import X.C05520Rw;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16320sq;
import X.C16620tM;
import X.C17200uh;
import X.C17250um;
import X.C18260wP;
import X.C18820xJ;
import X.C19610yi;
import X.C32241fu;
import X.C34201js;
import X.C434920f;
import X.C56762oT;
import X.C57322qu;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.AssemMods.AGMods;
import com.facebook.redex.IDxCListenerShape195S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape1S0110000_2_I1;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DocumentPickerActivity extends AnonymousClass2wn implements AnonymousClass04A {
    public int A00 = 0;
    public MenuItem A01;
    public View A02;
    public AnonymousClass05J A03;
    public C16000sG A04;
    public C16080sP A05;
    public AnonymousClass2Ao A06;
    public C17200uh A07;
    public AnonymousClass1B5 A08;
    public C19610yi A09;
    public AnonymousClass013 A0A;
    public C56762oT A0B;
    public C15830rv A0C;
    public AnonymousClass1A9 A0D;
    public AnonymousClass01D A0E;
    public AnonymousClass01D A0F;
    public String A0G;
    public ArrayList A0H;
    public List A0I;
    public List A0J;
    public boolean A0K;
    public final C009804r A0L = new AnonymousClass3DN(this);
    public final List A0M = AnonymousClass000.A0u();

    public class SendDocumentsConfirmationDialogFragment extends Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment {
        public C18260wP A00;
        public C16000sG A01;
        public C16080sP A02;
        public AnonymousClass01V A03;
        public C17250um A04;

        public static SendDocumentsConfirmationDialogFragment A01(C15830rv r4, ArrayList arrayList, int i2, boolean z2) {
            SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
            Bundle A0D = C13690nt.A0D();
            A0D.putString("jid", r4.getRawString());
            A0D.putParcelableArrayList("uri_list", arrayList);
            A0D.putInt("dialog_type", i2);
            A0D.putBoolean("finish_on_cancel", z2);
            sendDocumentsConfirmationDialogFragment.A0T(A0D);
            return sendDocumentsConfirmationDialogFragment;
        }

        public Dialog A1B(Bundle bundle) {
            String quantityString;
            String A08 = this.A02.A08(C16000sG.A00(this.A01, C15830rv.A02(A04().getString("jid"))));
            ArrayList parcelableArrayList = A04().getParcelableArrayList("uri_list");
            AnonymousClass00B.A06(parcelableArrayList);
            int i2 = A04().getInt("dialog_type");
            boolean z2 = A04().getBoolean("finish_on_cancel");
            AnonymousClass00B.A06(Boolean.valueOf(z2));
            String A042 = C18820xJ.A04((Uri) parcelableArrayList.get(0), this.A03);
            int size = parcelableArrayList.size();
            if (i2 == 0) {
                quantityString = A0J(R.string.str0532);
            } else {
                int i3 = R.string.str0531;
                int i4 = R.plurals.plurals0021;
                if (i2 == 2) {
                    i3 = R.string.str0a4b;
                    i4 = R.plurals.plurals00a8;
                }
                if (size != 1 || TextUtils.isEmpty(A042)) {
                    Resources A032 = A03();
                    Object[] objArr = new Object[2];
                    AnonymousClass000.A1M(objArr, size, 0);
                    objArr[1] = A08;
                    quantityString = A032.getQuantityString(i4, size, objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = A042;
                    quantityString = C13690nt.A0c(this, A08, objArr2, 1, i3);
                }
            }
            C32241fu A002 = C32241fu.A00(A0C());
            int i5 = R.string.str14e6;
            CharSequence A05 = AnonymousClass2Sy.A05(A0u(), this.A04, quantityString);
            if (i2 == 0) {
                A002.setTitle(A05);
                String A033 = AnonymousClass2GQ.A03(this.A02, C18820xJ.A02(this.A03, parcelableArrayList));
                Resources A034 = A03();
                int size2 = parcelableArrayList.size();
                Object[] A1b = C13680ns.A1b();
                A1b[0] = A033;
                A002.A06(A034.getQuantityString(R.plurals.plurals001f, size2, A1b));
                i5 = R.string.str14ef;
            } else {
                A002.A06(A05);
            }
            A002.setPositiveButton(i5, new IDxCListenerShape29S0200000_2_I1(parcelableArrayList, 16, this));
            A002.setNegativeButton(R.string.str0394, new IDxCListenerShape1S0110000_2_I1(this, 4, z2));
            return A002.create();
        }
    }

    public static /* synthetic */ void A02(DocumentPickerActivity documentPickerActivity) {
        if (documentPickerActivity.A0B.getCount() == 0) {
            if (documentPickerActivity.A0I == null) {
                C13680ns.A1I(documentPickerActivity, R.id.search_no_matches, 8);
                C13680ns.A1I(documentPickerActivity, R.id.progress, 0);
            } else {
                ArrayList arrayList = documentPickerActivity.A0H;
                if (arrayList == null || arrayList.isEmpty()) {
                    TextView A0N = C13680ns.A0N(documentPickerActivity, R.id.search_no_matches);
                    A0N.setVisibility(0);
                    A0N.setText(R.string.str0dea);
                } else {
                    TextView A0N2 = C13680ns.A0N(documentPickerActivity, R.id.search_no_matches);
                    A0N2.setVisibility(0);
                    A0N2.setText(C13680ns.A0d(documentPickerActivity, documentPickerActivity.A0G, C13680ns.A1b(), 0, R.string.str14a8));
                }
                C13680ns.A1I(documentPickerActivity, R.id.progress, 8);
            }
            C13680ns.A1I(documentPickerActivity, 16908292, 0);
            return;
        }
        C13680ns.A1I(documentPickerActivity, 16908292, 8);
    }

    public final int A36(C15830rv r8, List list) {
        boolean z2 = false;
        if (this.A07.A04(false) != 1) {
            z2 = true;
        }
        long A022 = C18820xJ.A02(this.A08, list) / SearchActionVerificationClientService.MS_TO_NS;
        if (z2 && A022 > 100) {
            return 0;
        }
        C16010sH A0A2 = this.A04.A0A(r8);
        return (C16030sJ.A0G(A0A2.A0E) || A0A2.A0J()) ? 2 : 1;
    }

    public final void A37() {
        Intent A022 = C13700nu.A02("android.intent.action.OPEN_DOCUMENT");
        A022.addCategory("android.intent.category.OPENABLE");
        A022.setType("*/*");
        A022.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        Ag3(A022, 1);
    }

    public final void A38(Uri uri) {
        C15830rv r5 = this.A0C;
        String stringExtra = getIntent().getStringExtra(FacebookFacade.RequestParameter.CAPTION);
        startActivityForResult(C13680ns.A09().setClassName(getPackageName(), "com.obwhatsapp.documentpicker.DocumentPreviewActivity").putExtra("jid", C16030sJ.A03(r5)).putExtra("uri", uri).putExtra(FacebookFacade.RequestParameter.CAPTION, stringExtra).putExtra("clear_message_after_send", !TextUtils.isEmpty(stringExtra)), 36);
    }

    public final void A39(C34201js r10) {
        List list = this.A0M;
        if (list.contains(r10)) {
            list.remove(r10);
            if (list.isEmpty()) {
                this.A03.A05();
            }
            this.A03.A06();
        } else {
            C14710pd r1 = this.A0C;
            C16620tM r2 = C16620tM.A02;
            int A032 = r1.A03(r2, 2614);
            if (list.size() >= A032) {
                A032 = this.A0C.A03(r2, 2693);
            }
            int size = list.size();
            int docSendLimit = AGMods.getDocSendLimit(A032);
            if (size >= docSendLimit) {
                C14870pt r22 = this.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, docSendLimit, 0);
                r22.A0H(getString(R.string.str1616, objArr), 0);
            } else {
                list.add(r10);
                this.A03.A06();
            }
        }
        if (!list.isEmpty()) {
            AnonymousClass01V r8 = this.A08;
            Resources resources = getResources();
            int size2 = list.size();
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1M(objArr2, list.size(), 0);
            AnonymousClass2JP.A00(this, r8, resources.getQuantityString(R.plurals.plurals00dc, size2, objArr2));
        }
        this.A0B.notifyDataSetChanged();
    }

    public final void A3A(Collection collection) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0u.add(Uri.fromFile(((C34201js) it.next()).A02));
        }
        int A36 = A36(this.A0C, A0u);
        if (A36 == 0 || !this.A0C.A0E(C16620tM.A02, 1750) || A0u.size() != 1) {
            C13680ns.A1J(SendDocumentsConfirmationDialogFragment.A01(this.A0C, A0u, A36, false), this);
        } else {
            A38((Uri) A0u.get(0));
        }
    }

    public AnonymousClass0SB APC(Bundle bundle, int i2) {
        return new C57322qu(this, this.A04, this.A0A, this.A0C);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r6.isEmpty() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ASs(X.AnonymousClass0SB r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.util.List r6 = (java.util.List) r6
            r4.A0I = r6
            android.view.MenuItem r3 = r4.A01
            r2 = 1
            if (r3 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x0012
            boolean r1 = r6.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r3.setVisible(r0)
        L_0x0016:
            java.lang.String r1 = r4.A0G
            X.2oT r0 = r4.A0B
            android.widget.Filter r0 = r0.getFilter()
            r0.filter(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x003a
            java.util.List r0 = r4.A0I
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003a
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x003a
        L_0x0035:
            r4.A0K = r2
            r4.A37()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.documentpicker.DocumentPickerActivity.ASs(X.0SB, java.lang.Object):void");
    }

    public void ASy(AnonymousClass0SB r1) {
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        C434920f.A03(this, R.color.color064b);
    }

    public void AYY(AnonymousClass05J r2) {
        super.AYY(r2);
        C434920f.A03(this, R.color.right_side);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        Uri uri;
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1) {
            if (i2 == 36 && i3 == -1) {
                setResult(i3, intent);
            } else {
                return;
            }
        } else if (i3 == -1) {
            ArrayList A0u = AnonymousClass000.A0u();
            ClipData clipData = intent.getClipData();
            boolean z2 = false;
            if (clipData != null) {
                for (int i4 = 0; i4 < clipData.getItemCount(); i4++) {
                    ClipData.Item itemAt = clipData.getItemAt(i4);
                    if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                        A0u.add(uri);
                    }
                }
            }
            if (A0u.isEmpty() && (data = intent.getData()) != null) {
                A0u.add(data);
            }
            if (!A0u.isEmpty()) {
                Iterator it = A0u.iterator();
                while (it.hasNext()) {
                    try {
                        grantUriPermission("com.obwhatsapp", (Uri) it.next(), 1);
                    } catch (SecurityException e2) {
                        Log.w("docpicker/permission ", e2);
                    }
                }
                int A36 = A36(this.A0C, A0u);
                if (A36 == 0 || !this.A0C.A0E(C16620tM.A02, 1750) || A0u.size() != 1) {
                    C15830rv r1 = this.A0C;
                    List list = this.A0I;
                    if (list == null || list.isEmpty()) {
                        z2 = true;
                    }
                    C13680ns.A1J(SendDocumentsConfirmationDialogFragment.A01(r1, A0u, A36, z2), this);
                    return;
                }
                A38((Uri) A0u.get(0));
                return;
            }
            return;
        } else if (i3 == 0) {
            List list2 = this.A0I;
            if (list2 != null && !list2.isEmpty()) {
                return;
            }
        } else {
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (C14550pN.A1Q(this)) {
            this.A0E.get();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str072a);
        boolean z2 = true;
        C13690nt.A0N(this).A0N(true);
        C15830rv A0M2 = C14530pL.A0M(this);
        AnonymousClass00B.A07(A0M2, "rawJid is not a valid chat jid string");
        this.A0C = A0M2;
        C15860rz r0 = this.A09;
        this.A00 = C13680ns.A0B(r0).getInt("document_picker_sort", this.A00);
        setContentView((int) R.layout.layout0238);
        this.A0B = new C56762oT(this);
        if (Build.VERSION.SDK_INT >= 19) {
            ADA().addHeaderView(getLayoutInflater().inflate(R.layout.layout0239, (ViewGroup) null, false));
        }
        A35(this.A0B);
        ADA().setOnItemClickListener(new IDxCListenerShape195S0100000_2_I1(this, 1));
        ADA().setOnItemLongClickListener(new AnonymousClass3DG(this));
        if (bundle == null || !bundle.getBoolean("system_picker_auto_started")) {
            z2 = false;
        }
        this.A0K = z2;
        new C05520Rw(this, AGy()).A02(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004c, code lost:
        if (r1 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            android.view.MenuInflater r1 = r4.getMenuInflater()
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
            r1.inflate(r0, r5)
            X.02i r0 = X.C13690nt.A0N(r4)
            android.content.Context r2 = r0.A02()
            r1 = 2131952016(0x7f130190, float:1.9540463E38)
            r0 = 0
            androidx.appcompat.widget.SearchView r3 = new androidx.appcompat.widget.SearchView
            r3.<init>(r2, r0, r1)
            r0 = 2131365991(0x7f0a1067, float:1.8351863E38)
            android.widget.TextView r1 = X.C13680ns.A0M(r3, r0)
            r0 = 2131100127(0x7f0601df, float:1.7812627E38)
            X.C13680ns.A0v(r4, r1, r0)
            r0 = 2131891364(0x7f1214a4, float:1.9417446E38)
            java.lang.String r0 = r4.getString(r0)
            r3.setQueryHint(r0)
            r1 = 4
            com.facebook.redex.IDxTListenerShape171S0100000_2_I1 r0 = new com.facebook.redex.IDxTListenerShape171S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A0B = r0
            r0 = 2131364661(0x7f0a0b35, float:1.8349165E38)
            android.view.MenuItem r2 = r5.findItem(r0)
            r4.A01 = r2
            java.util.List r0 = r4.A0I
            if (r0 == 0) goto L_0x004e
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r2.setVisible(r0)
            android.view.MenuItem r0 = r4.A01
            r0.setActionView(r3)
            android.view.MenuItem r1 = r4.A01
            r0 = 10
            r1.setShowAsAction(r0)
            android.view.MenuItem r2 = r4.A01
            r1 = 1
            com.facebook.redex.IDxEListenerShape270S0100000_2_I1 r0 = new com.facebook.redex.IDxEListenerShape270S0100000_2_I1
            r0.<init>(r4, r1)
            r2.setOnActionExpandListener(r0)
            r0 = 2131100126(0x7f0601de, float:1.7812625E38)
            int r2 = X.AnonymousClass00T.A00(r4, r0)
            android.view.MenuItem r0 = r4.A01
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A06(r0, r2)
            android.view.MenuItem r0 = r4.A01
            r0.setIcon(r1)
            r0 = 2131364673(0x7f0a0b41, float:1.834919E38)
            android.view.MenuItem r1 = r5.findItem(r0)
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r0, r2)
            r1.setIcon(r0)
            boolean r0 = super.onCreateOptionsMenu(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.documentpicker.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    public void onDestroy() {
        super.onDestroy();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A02(this.A02, this.A09);
            AnonymousClass2Ao r0 = this.A06;
            if (r0 != null) {
                r0.A00();
                this.A06 = null;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putInt;
        if (menuItem.getItemId() == R.id.menuitem_sort_by_name) {
            this.A00 = 0;
            putInt = this.A09.A0K().putInt("document_picker_sort", 0);
        } else if (menuItem.getItemId() == R.id.menuitem_sort_by_date) {
            this.A00 = 1;
            putInt = this.A09.A0K().putInt("document_picker_sort", 1);
        } else {
            if (menuItem.getItemId() == 16908332) {
                finish();
                return true;
            }
            return true;
        }
        putInt.apply();
        invalidateOptionsMenu();
        this.A0B.getFilter().filter(this.A0G);
        return true;
    }

    public void onPause() {
        super.onPause();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A07(this.A09);
            C14530pL.A0i(this, this.A0E);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_sort_by_name);
        MenuItem findItem2 = menu.findItem(R.id.menuitem_sort_by_date);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    public void onResume() {
        super.onResume();
        if (C14550pN.A1Q(this)) {
            boolean z2 = ((AnonymousClass1B9) this.A0E.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r15 = this.A0C;
                C14870pt r13 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A05;
                C17200uh r10 = this.A07;
                C16000sG r9 = this.A04;
                C16080sP r8 = this.A05;
                AnonymousClass013 r7 = this.A0A;
                AnonymousClass1B5 r6 = this.A08;
                C19610yi r5 = this.A09;
                AnonymousClass01D r4 = this.A0E;
                AnonymousClass01D r3 = this.A0F;
                View view2 = this.A02;
                AnonymousClass2Ao r1 = this.A06;
                C15860rz r25 = this.A09;
                C19610yi r24 = r5;
                AnonymousClass1B5 r23 = r6;
                C17200uh r22 = r10;
                AnonymousClass2Ao r21 = r1;
                C16080sP r20 = r8;
                C16000sG r19 = r9;
                C16040sK r18 = r12;
                C14870pt r17 = r13;
                View view3 = view2;
                View view4 = view;
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "document-picker-activity");
                this.A02 = (View) A002.first;
                this.A06 = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A09, this.A0E);
            }
            ((AnonymousClass1B9) this.A0E.get()).A01();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A0K);
    }

    public void startActivityForResult(Intent intent, int i2) {
        try {
            super.startActivityForResult(intent, i2);
        } catch (ActivityNotFoundException e2) {
            Log.e("docpicker/pick-from-doc-provider ", e2);
            this.A05.A09(R.string.str00a0, 0);
        }
    }
}
