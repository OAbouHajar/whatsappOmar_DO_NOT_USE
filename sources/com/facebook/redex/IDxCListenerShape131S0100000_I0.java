package com.facebook.redex;

import X.AnonymousClass0ZS;
import X.C07290av;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;

public class IDxCListenerShape131S0100000_I0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape131S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        C07290av r0;
        switch (this.A01) {
            case 0:
                SearchView searchView = (SearchView) this.A00;
                if (view == searchView.A0h) {
                    searchView.A0I(false);
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                    searchAutoComplete.requestFocus();
                    searchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = searchView.A07;
                    if (onClickListener != null) {
                        onClickListener.onClick(searchView);
                        return;
                    }
                    return;
                } else if (view == searchView.A0e) {
                    searchView.A07();
                    return;
                } else if (view == searchView.A0g) {
                    searchView.A08();
                    return;
                } else if (view == searchView.A0i) {
                    SearchableInfo searchableInfo = searchView.A02;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(searchView.A0V);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                                searchView.getContext().startActivity(intent);
                                return;
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                Intent intent2 = searchView.A0U;
                                ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                                Intent intent3 = new Intent("android.intent.action.SEARCH");
                                intent3.setComponent(searchActivity2);
                                PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1073741824);
                                Bundle bundle = new Bundle();
                                Bundle bundle2 = searchView.A05;
                                if (bundle2 != null) {
                                    bundle.putParcelable("app_data", bundle2);
                                }
                                Intent intent4 = new Intent(intent2);
                                int i2 = 1;
                                Resources resources = searchView.getResources();
                                String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                                String str = null;
                                String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                if (searchableInfo.getVoiceMaxResults() != 0) {
                                    i2 = searchableInfo.getVoiceMaxResults();
                                }
                                intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                                intent4.putExtra("android.speech.extra.PROMPT", string2);
                                intent4.putExtra("android.speech.extra.LANGUAGE", string3);
                                intent4.putExtra("android.speech.extra.MAX_RESULTS", i2);
                                if (searchActivity2 != null) {
                                    str = searchActivity2.flattenToShortString();
                                }
                                intent4.putExtra("calling_package", str);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                searchView.getContext().startActivity(intent4);
                                return;
                            } else {
                                return;
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (view == searchView.A0k) {
                    searchView.A06();
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass0ZS r02 = ((Toolbar) this.A00).A0Q;
                if (r02 != null && (r0 = r02.A01) != null) {
                    r0.collapseActionView();
                    return;
                }
                return;
            default:
                ((Preference) this.A00).A0E(view);
                return;
        }
    }
}
