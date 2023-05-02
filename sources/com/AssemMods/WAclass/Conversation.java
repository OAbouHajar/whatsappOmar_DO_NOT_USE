package com.AssemMods.WAclass;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.AssemMods.translator.Language;
import com.AssemMods.translator.Translator;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;

public class Conversation extends BaseSettingsActivity {
    /* access modifiers changed from: private */
    public static MentionableEntry mEntry;
    /* access modifiers changed from: private */
    public static ImageView mMessageTranslator;
    private static String mToLanguage;

    public static void _onCreate(final Activity activity) {
        mEntry = (MentionableEntry) activity.findViewById(yo.getID("entry", "id"));
        ImageView imageView = (ImageView) activity.findViewById(yo.getID("rmods_translator_id", "id"));
        mMessageTranslator = imageView;
        setIconColor(imageView);
        mEntry.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence.toString().trim().length() <= 0) {
                    Conversation.mMessageTranslator.setVisibility(8);
                } else if (!shp.getBoolean("yo_hide_msg_translator")) {
                    Conversation.mMessageTranslator.setVisibility(0);
                    Conversation.initTranslator(Conversation.mMessageTranslator, activity);
                }
            }
        });
    }

    public static void initBomber(Activity activity) {
        ImageButton imageButton = (ImageButton) activity.findViewById(yo.getID("message_bomber_id", "id"));
        if (imageButton == null) {
            return;
        }
        if (shp.getBoolean("hide_message_bomber")) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setOnClickListener(new Translator2(activity));
        }
    }

    /* access modifiers changed from: private */
    public static void initTranslator(ImageView imageView, Activity activity) {
        if (shp.getBooleanPriv("custom_language_".concat(yo.getCurr_sJid())) || !TextUtils.isEmpty(shp.getPrefString("select_language_".concat(yo.getCurr_sJid())))) {
            imageView.setOnClickListener(new Translator3(activity));
        } else {
            imageView.setOnClickListener(new Translator4(activity));
        }
    }

    static /* synthetic */ void lambda$initTranslator$0(final Activity activity, DialogInterface dialogInterface, int i2) {
        mToLanguage = Language.ENGLISH;
        switch (i2) {
            case 0:
                mToLanguage = Language.ARABIC;
                break;
            case 1:
                mToLanguage = Language.URDU;
                break;
            case 2:
                mToLanguage = Language.ENGLISH;
                break;
            case 3:
                mToLanguage = Language.FRENCH;
                break;
            case 4:
                mToLanguage = Language.GERMAN;
                break;
            case 5:
                mToLanguage = "id";
                break;
            case 6:
                mToLanguage = Language.GUJARATI;
                break;
            case 7:
                mToLanguage = Language.HINDI;
                break;
            case 8:
                mToLanguage = Language.ITALIAN;
                break;
            case 9:
                mToLanguage = Language.JAPANESE;
                break;
            case 10:
                mToLanguage = Language.KANNADA;
                break;
            case 11:
                mToLanguage = Language.TAMIL;
                break;
            case 12:
                mToLanguage = Language.TELUGU;
                break;
            case 13:
                mToLanguage = Language.BENGALI;
                break;
            case 14:
                mToLanguage = Language.MALAYALAM;
                break;
            case 15:
                mToLanguage = Language.MARATHI;
                break;
            case 16:
                mToLanguage = Language.NEPALI;
                break;
            case 17:
                mToLanguage = Language.PUNJABI;
                break;
            case 18:
                mToLanguage = Language.SPANISH;
                break;
            case 19:
                mToLanguage = Language.RUSSIAN;
                break;
            case 20:
                mToLanguage = Language.PORTUGUESE;
                break;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                mToLanguage = Language.TURKISH;
                break;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                mToLanguage = Language.VIETNAMESE;
                break;
        }
        new Translator(mToLanguage, mEntry.getText().toString().trim()).setTranslateListener(new Translator.TranslateListener() {
            public void onFailure(String str) {
                Toast.makeText(activity, str, 0).show();
            }

            public void onSuccess(String str) {
                Conversation.mEntry.setText(str);
                Conversation.mEntry.setSelection(Conversation.mEntry.getText().length());
            }
        });
        Toast.makeText(activity, "Translating...", 0).show();
    }

    static /* synthetic */ void lambda$initTranslator$1(Activity activity, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Choose your language");
        builder.setItems(new CharSequence[]{"Arabic", "Urdu", "English", "French", "German", "Indonesian", "Gujarati", "Hindi", "Italian", "Japanese", "Kannada", "Tamil", "Telugu", "Bengali", "Malayalam", "Marathi", "Nepali", "Punjabi", "Spanish", "Russian", "Portuguese", "Turkish", "Vietnamese"}, new Translator1(activity));
        builder.create().show();
    }

    static /* synthetic */ void lambda$initTranslator$2(final Activity activity, View view) {
        if (mEntry.getText().toString().trim().length() >= 1) {
            new Translator(shp.getPrefString("select_language_".concat(yo.getCurr_sJid())), mEntry.getText().toString().trim()).setTranslateListener(new Translator.TranslateListener() {
                public void onFailure(String str) {
                    Toast.makeText(activity, str, 0).show();
                }

                public void onSuccess(String str) {
                    Conversation.mEntry.setText(str);
                    Conversation.mEntry.setSelection(Conversation.mEntry.getText().length());
                }
            });
        }
        Toast.makeText(activity, "Translating...", 0).show();
    }

    private static void setIconColor(ImageView imageView) {
        if (imageView != null) {
            try {
                imageView.setColorFilter(others.getColor("ModChatBtnColor", ColorStore.getDefaultConversationEntryIconsColor()), PorterDuff.Mode.SRC_ATOP);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
