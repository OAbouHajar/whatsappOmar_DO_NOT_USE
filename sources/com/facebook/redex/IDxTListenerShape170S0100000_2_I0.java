package com.facebook.redex;

import X.AnonymousClass1V8;
import X.AnonymousClass266;
import X.AnonymousClass29S;
import X.C016807y;
import X.C101234ww;
import X.C18450wi;
import X.C32501gU;
import X.C40661uU;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.obwhatsapp.community.CommunityHomeActivity;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import com.obwhatsapp.storage.StorageUsageActivity;
import java.util.ArrayList;
import java.util.List;

public class IDxTListenerShape170S0100000_2_I0 implements C016807y {
    public Object A00;
    public final int A01;

    public IDxTListenerShape170S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean AVa(String str) {
        switch (this.A01) {
            case 0:
                C32501gU r1 = (C32501gU) this.A00;
                r1.A0G = str;
                ArrayList A02 = C40661uU.A02(r1.A01, str);
                r1.A0H = A02;
                if (A02.isEmpty()) {
                    r1.A0H = null;
                }
                C32501gU.A02(r1);
                return false;
            case 1:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return true;
                }
                businessApiHomeFragment.A03.A06(str);
                return true;
            case 2:
                BusinessDirectoryActivity businessDirectoryActivity = (BusinessDirectoryActivity) this.A00;
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A09;
                if (businessDirectoryContextualSearchFragment != null) {
                    businessDirectoryContextualSearchFragment.A06.A0M(str);
                }
                if (TextUtils.isEmpty(str)) {
                    businessDirectoryActivity.A3A();
                    return true;
                } else if (businessDirectoryActivity.A0E == null) {
                    return true;
                } else {
                    AnonymousClass266 r12 = businessDirectoryActivity.A08;
                    if (r12 != null) {
                        ObjectAnimator objectAnimator = r12.A02;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        ObjectAnimator objectAnimator2 = r12.A03;
                        if (objectAnimator2 != null) {
                            objectAnimator2.cancel();
                        }
                        ObjectAnimator objectAnimator3 = r12.A01;
                        if (objectAnimator3 != null) {
                            objectAnimator3.cancel();
                        }
                        ObjectAnimator objectAnimator4 = r12.A00;
                        if (objectAnimator4 != null) {
                            objectAnimator4.cancel();
                        }
                        r12.A04.clearAnimation();
                        r12.A05.clearAnimation();
                    }
                    businessDirectoryActivity.A0E.cancel();
                    return true;
                }
            case 3:
                C18450wi.A0H(str, 0);
                ((CatalogSearchViewModel) ((CatalogSearchFragment) this.A00).A0b.getValue()).A09(str);
                return true;
            case 4:
                C101234ww r2 = ((CommunityHomeActivity) this.A00).A0O.A02;
                List list = r2.A05;
                list.clear();
                ArrayList A022 = C40661uU.A02(r2.A02, str);
                C18450wi.A0B(A022);
                list.addAll(A022);
                r2.A04.run();
                return true;
            case 5:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                contactPickerFragment.A2B = str;
                ArrayList A023 = C40661uU.A02(contactPickerFragment.A1H, str);
                contactPickerFragment.A2J = A023;
                if (A023.isEmpty()) {
                    contactPickerFragment.A2J = null;
                }
                contactPickerFragment.A1N();
                return false;
            case 6:
                ((AnonymousClass1V8) this.A00).A3Y(str);
                return false;
            case 7:
                ((InviteNonWhatsAppContactPickerActivity) this.A00).A0K.A05(str);
                return false;
            case 8:
                ((GroupAdminPickerActivity) this.A00).A38(str);
                return false;
            case 9:
                return false;
            default:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0L = str;
                storageUsageActivity.A0N = C40661uU.A02(storageUsageActivity.A01, str);
                StorageUsageActivity.A03(storageUsageActivity, storageUsageActivity.A0M, (List) null, false);
                return false;
        }
    }

    public boolean AVb(String str) {
        String str2 = str;
        switch (this.A01) {
            case 1:
                BusinessApiHomeFragment businessApiHomeFragment = ((BusinessApiSearchActivity) this.A00).A03;
                if (businessApiHomeFragment == null) {
                    return false;
                }
                businessApiHomeFragment.A03.A06(str);
                return false;
            case 2:
                BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = ((BusinessDirectoryActivity) this.A00).A09;
                if (businessDirectoryContextualSearchFragment == null) {
                    return false;
                }
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = businessDirectoryContextualSearchFragment.A06;
                String trim = str.trim();
                if (TextUtils.isEmpty(trim)) {
                    return false;
                }
                businessDirectoryContextualSearchViewModel.A0O(trim, businessDirectoryContextualSearchViewModel.A05(str));
                return false;
            case 3:
                C18450wi.A0H(str, 0);
                ((CatalogSearchFragment) this.A00).A1F(str);
                return true;
            case 9:
                AnonymousClass29S r2 = (AnonymousClass29S) this.A00;
                r2.A0n = false;
                r2.A0L(r2.A02(), str2, Math.max(r2.A00(), 50000), true, true);
                return false;
            case 10:
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A00;
                storageUsageActivity.A0L = str;
                storageUsageActivity.A0N = C40661uU.A02(storageUsageActivity.A01, str);
                StorageUsageActivity.A03(storageUsageActivity, storageUsageActivity.A0M, (List) null, false);
                return false;
            default:
                return false;
        }
    }
}
