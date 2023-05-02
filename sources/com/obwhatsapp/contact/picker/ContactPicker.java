package com.obwhatsapp.contact.picker;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass050;
import X.AnonymousClass05J;
import X.AnonymousClass10X;
import X.AnonymousClass1ZD;
import X.AnonymousClass1ZR;
import X.AnonymousClass22U;
import X.AnonymousClass2AW;
import X.AnonymousClass68J;
import X.C14750ph;
import X.C15450qv;
import X.C15830rv;
import X.C16040sK;
import X.C16620tM;
import X.C16740tZ;
import X.C16760tb;
import X.C18900xR;
import X.C19760yx;
import X.C30931dC;
import X.C35541m6;
import X.C434920f;
import X.C49202Rp;
import X.C49212Rq;
import X.C49222Rr;
import X.C87664Ya;
import X.C99874uj;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import com.obwhatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.List;

public class ContactPicker extends C49202Rp implements C49212Rq, AnonymousClass1ZD, AnonymousClass2AW, C49222Rr, AnonymousClass68J {
    public C18900xR A00;
    public AnonymousClass10X A01;
    public C16760tb A02;
    public BaseSharedPreviewDialogFragment A03;
    public C99874uj A04;
    public ContactPickerFragment A05;
    public WhatsAppLibLoader A06;
    public C19760yx A07;

    public void A2S(int i2) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1V(i2);
        }
    }

    public ContactPickerFragment A39() {
        return new ContactPickerFragment();
    }

    public C99874uj ACf() {
        C99874uj r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C99874uj r02 = new C99874uj(this);
        this.A04 = r02;
        return r02;
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AQP(int i2) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1a.A00().edit().putInt("disappearing_mode_duration_for_chat_picker_int", i2).apply();
            contactPickerFragment.A01 = i2;
            ListAdapter adapter = contactPickerFragment.A0G.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            Log.i("contactpicker/notifyAdapter");
            contactPickerFragment.A0w.notifyDataSetChanged();
        }
    }

    public void AU5(String str) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null && contactPickerFragment.A2l && contactPickerFragment.A1d.A0E(C16620tM.A02, 691)) {
            contactPickerFragment.A1f(str);
        }
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        C434920f.A03(this, R.color.color064b);
    }

    public void AYY(AnonymousClass05J r2) {
        super.AYY(r2);
        C434920f.A03(this, R.color.right_side);
    }

    public void AdS(Bundle bundle, String str, List list) {
        Intent A032;
        boolean z2 = bundle.getBoolean("load_preview");
        AnonymousClass00B.A06(Boolean.valueOf(z2));
        C35541m6 r2 = null;
        String str2 = str;
        AnonymousClass1ZR A002 = z2 ? C87664Ya.A00(C30931dC.A01(str)) : null;
        boolean z3 = bundle.getBoolean("has_text_from_url");
        AnonymousClass00B.A06(Boolean.valueOf(z3));
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            r2 = contactPickerFragment.A1U;
        }
        this.A02.A0A(A002, r2, (C16740tZ) null, str2, list, (List) null, false, z3);
        ACf().A00.Agv(list);
        if (list.size() == 1) {
            A032 = new C14750ph().A0x(this, (C15830rv) list.get(0));
            AnonymousClass22U.A00(A032, "ContactPicker:getPostSendIntent");
        } else {
            A032 = C14750ph.A03(this);
        }
        startActivity(A032);
        finish();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null || !contactPickerFragment.A1p()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            C16040sK r0 = this.A01;
            r0.A0B();
            if (r0.A00 == null || !this.A09.A01()) {
                this.A05.A09(R.string.str08fd, 1);
                startActivity(C14750ph.A04(this));
            } else {
                if (C18900xR.A00()) {
                    Log.w("contactpicker/device-not-supported");
                    Afc(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                }
                if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                    setTitle(R.string.str1c43);
                }
                setContentView((int) R.layout.layout013d);
                if (C15450qv.A03()) {
                    getWindow().addFlags(Integer.MIN_VALUE);
                }
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) AGM().A0B("ContactPickerFragment");
                this.A05 = contactPickerFragment;
                if (contactPickerFragment == null) {
                    this.A05 = A39();
                    this.A05.A0T(ContactPickerFragment.A01(getIntent()));
                    AnonymousClass050 r2 = new AnonymousClass050(AGM());
                    r2.A0D(this.A05, "ContactPickerFragment", R.id.fragment);
                    r2.A03();
                    return;
                }
                return;
            }
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.A1B(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r2) {
        /*
            r1 = this;
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r1.A05
            if (r0 == 0) goto L_0x000b
            android.app.Dialog r0 = r0.A1B(r2)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.app.Dialog r0 = super.onCreateDialog(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.ContactPicker.onCreateDialog(int):android.app.Dialog");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A03;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A1C();
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A05;
            if (contactPickerFragment != null && contactPickerFragment.A1p()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0R.A02();
        return true;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A0R.A02();
        return true;
    }
}
