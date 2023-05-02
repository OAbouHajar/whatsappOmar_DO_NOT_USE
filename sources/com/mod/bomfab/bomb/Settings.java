package com.mod.bomfab.bomb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.adrt.ADRTLogCatReader;
import com.mod.bomfab.utils.Tools;

public class Settings extends Activity {

    public static class Cfragment extends PreferenceFragment {
        public static SharedPreferences settings;
        private Preference resetDialogPreference;
        /* access modifiers changed from: private */
        public Intent startIntent;

        @Override
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(Tools.intXml("settings"));
            PreferenceManager.setDefaultValues(getActivity(), Tools.intXml("settings"), false);
            this.resetDialogPreference = getPreferenceScreen().findPreference("resetDialog");
            this.startIntent = getActivity().getIntent();
            this.resetDialogPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener(this) {
                private final Cfragment this$0;

                {
                    this.this$0 = r1;
                }

                static Cfragment access$0(AnonymousClass100000000 r1) {
                    return r1.this$0;
                }

                @Override
                public boolean onPreferenceChange(Preference preference, Object obj) {
                    this.this$0.getActivity().overridePendingTransition(0, 0);
                    this.this$0.startIntent.addFlags(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                    this.this$0.getActivity().finish();
                    this.this$0.getActivity().overridePendingTransition(0, 0);
                    this.this$0.startActivity(this.this$0.startIntent);
                    return false;
                }
            });
        }

        @Override
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return layoutInflater.inflate(Tools.intLayout("main_list"), viewGroup, false);
        }

        @Override
        public void onViewCreated(View view, Bundle bundle) {
            super.onViewCreated(view, bundle);
            try {
                ((ListView) view.findViewById(16908298)).setDivider(Tools.colorDrawable(Tools.intColor("color_transparent"), 0, PorterDuff.Mode.SRC_IN));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override
    public void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.aide.ui");
        super.onCreate(bundle);
        setContentView(Tools.intLayout("main_settings"));
        getFragmentManager().beginTransaction().replace(Tools.intId("mContent"), new Cfragment()).commit();
    }
}
