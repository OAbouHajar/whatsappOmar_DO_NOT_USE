package com.facebook.redex;

import X.AnonymousClass1V8;
import X.AnonymousClass2DW;
import X.C016807y;
import X.C18450wi;
import X.C40661uU;
import X.C42391xi;
import X.C56772oU;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Filter;
import com.obwhatsapp.audiopicker.AudioPickerActivity;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import com.obwhatsapp.gallery.MediaGalleryActivity;
import com.obwhatsapp.group.GroupParticipantsSearchFragment;
import com.obwhatsapp.phonematching.CountryPicker;
import com.obwhatsapp.profile.WebImagePicker;
import java.util.ArrayList;

public class IDxTListenerShape171S0100000_2_I1 implements C016807y {
    public Object A00;
    public final int A01;

    public IDxTListenerShape171S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean AVa(String str) {
        Filter filter;
        switch (this.A01) {
            case 0:
                AudioPickerActivity audioPickerActivity = (AudioPickerActivity) this.A00;
                audioPickerActivity.A0M = str;
                audioPickerActivity.A0N = C40661uU.A02(audioPickerActivity.A01, str);
                audioPickerActivity.A0W().A00((Bundle) null, audioPickerActivity);
                return false;
            case 1:
                ((AnonymousClass1V8) this.A00).A3Y(str);
                return false;
            case 2:
                C18450wi.A0H(str, 0);
                ((CatalogSearchViewModel) ((CatalogSearchFragmentV2) this.A00).A0M.getValue()).A09(str);
                return true;
            case 3:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A00;
                phoneContactsSelector.A0T = str;
                ArrayList A02 = C40661uU.A02(phoneContactsSelector.A0P, str);
                phoneContactsSelector.A0U = A02;
                if (A02.isEmpty()) {
                    phoneContactsSelector.A0U = null;
                }
                PhoneContactsSelector.A03(phoneContactsSelector);
                return false;
            case 4:
                DocumentPickerActivity documentPickerActivity = (DocumentPickerActivity) this.A00;
                documentPickerActivity.A0G = str;
                documentPickerActivity.A0H = C40661uU.A02(documentPickerActivity.A0A, str);
                documentPickerActivity.A0B.getFilter().filter(documentPickerActivity.A0G);
                return false;
            case 5:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                if (TextUtils.equals(mediaGalleryActivity.A0p, str)) {
                    return false;
                }
                mediaGalleryActivity.A0p = str;
                mediaGalleryActivity.A0q = C40661uU.A02(mediaGalleryActivity.A01, str);
                AnonymousClass2DW A022 = MediaGalleryActivity.A02(mediaGalleryActivity);
                if (A022 == null) {
                    return false;
                }
                C42391xi r1 = mediaGalleryActivity.A0M;
                r1.A05(mediaGalleryActivity.A0q);
                r1.A04(str);
                A022.AWn(r1);
                return false;
            case 6:
                C56772oU r12 = ((GroupParticipantsSearchFragment) this.A00).A06;
                r12.A00 = str;
                if (!TextUtils.isEmpty(str)) {
                    filter = r12.getFilter();
                    break;
                } else {
                    r12.A01(r12.A02);
                    return false;
                }
            case 7:
                filter = ((CountryPicker) this.A00).A04.getFilter();
                break;
            default:
                return false;
        }
        filter.filter(str);
        return false;
    }

    public boolean AVb(String str) {
        switch (this.A01) {
            case 2:
                C18450wi.A0H(str, 0);
                ((CatalogSearchFragmentV2) this.A00).A1C(str);
                return true;
            case 8:
                ((WebImagePicker) this.A00).A37();
                return true;
            default:
                return false;
        }
    }
}
