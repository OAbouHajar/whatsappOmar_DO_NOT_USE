package com.obwhatsapp.yo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.AssemMods.translator.Language;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.yo.Trans.Translator;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.store.ColorStore;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;

public class ConvoTra extends BaseSettingsActivity {
    /* access modifiers changed from: private */
    public static MentionableEntry mEntry;
    /* access modifiers changed from: private */
    public static ImageView mMessageTranslator;
    private static String mToLanguage;

    public static void A00(final Conversation conversation) {
        mEntry = (MentionableEntry) conversation.findViewById(yo.getID("entry", "id"));
        ImageView imageView = (ImageView) conversation.findViewById(yo.getID("translator_ic_id", "id"));
        mMessageTranslator = imageView;
        A03(imageView);
        mEntry.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence.length() <= 0) {
                    ConvoTra.mMessageTranslator.setVisibility(8);
                } else if (!shp.getBoolean("hide_translation_icon")) {
                    ConvoTra.mMessageTranslator.setVisibility(0);
                    ConvoTra.init(ConvoTra.mMessageTranslator, conversation);
                }
            }
        });
    }

    public static void A03(ImageView imageView) {
        try {
            ImageView imageView2 = imageView;
            if (imageView2 != null) {
                Context context = imageView2.getContext();
                int defaultConversationEntryIconsColor = ColorStore.getDefaultConversationEntryIconsColor();
                if (!ColorStore.INM()) {
                    defaultConversationEntryIconsColor = others.getColor("ModChatBtnColor", defaultConversationEntryIconsColor);
                }
                imageView2.setColorFilter(defaultConversationEntryIconsColor, PorterDuff.Mode.SRC_ATOP);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static void init(ImageView imageView, Conversation conversation) {
        imageView.setOnClickListener(new ConvoTrans3(conversation));
    }

    static /* synthetic */ void lambda$initTranslator$1(Conversation conversation, View view) {
        if (mEntry.getText().toString().trim() == null || mEntry.getText().toString().trim().equals("") || mEntry.getText().toString().trim().length() < 1) {
            mEntry.setError(yo.getString("Type_reply_here"));
            return;
        }
        CharSequence[] charSequenceArr = {yo.getString("Arabic"), yo.getString("English"), yo.getString("French"), yo.getString("Spanish"), yo.getString("Italian"), yo.getString("Russian"), yo.getString("Portuguese"), yo.getString("Turkish"), yo.getString("Indonesian"), yo.getString("Hindi"), yo.getString("German"), yo.getString("Malay"), yo.getString("Urdu"), yo.getString("Vietnamese"), yo.getString("Gujarati"), yo.getString("Punjabi"), yo.getString("Tamil"), yo.getString("Bengali"), yo.getString("Marathi"), yo.getString("Telugu")};
        AlertDialog.Builder builder = new AlertDialog.Builder(conversation);
        builder.setTitle(yo.getString("Choose_your_language"));
        builder.setItems(charSequenceArr, new ConvoTrans2(conversation));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        builder.create().show();
    }

    static /* synthetic */ void lambda$null$0(final Conversation conversation, DialogInterface dialogInterface, int i2) {
        String str = Language.ENGLISH;
        switch (i2) {
            case 0:
                str = Language.ARABIC;
                break;
            case 2:
                str = Language.FRENCH;
                break;
            case 3:
                str = Language.SPANISH;
                break;
            case 4:
                str = Language.ITALIAN;
                break;
            case 5:
                str = Language.RUSSIAN;
                break;
            case 6:
                str = Language.PORTUGUESE;
                break;
            case 7:
                str = Language.TURKISH;
                break;
            case 8:
                str = "id";
                break;
            case 9:
                str = Language.HINDI;
                break;
            case 10:
                str = Language.GERMAN;
                break;
            case 11:
                str = "ms";
                break;
            case 12:
                str = Language.URDU;
                break;
            case 13:
                str = Language.VIETNAMESE;
                break;
            case 14:
                str = Language.GUJARATI;
                break;
            case 15:
                str = Language.PUNJABI;
                break;
            case 16:
                str = Language.TAMIL;
                break;
            case 17:
                str = Language.BENGALI;
                break;
            case 18:
                str = Language.MARATHI;
                break;
            case 19:
                str = Language.TELUGU;
                break;
        }
        mToLanguage = str;
        if (mEntry.getText().toString().trim() != null && mEntry.getText().toString().trim().length() >= 1) {
            new Translator(mToLanguage, mEntry.getText().toString().trim()).A01(new Translator.TranslateListener() {
                public void onFailure(String str) {
                    Toast.makeText(conversation, str, 0).show();
                }

                public void onSuccess(String str) {
                    MentionableEntry A02 = ConvoTra.mEntry;
                    A02.setText(str);
                    A02.setSelection(A02.getText().length());
                    ConvoTra.mMessageTranslator.setVisibility(8);
                }
            });
        }
        Toast.makeText(conversation, yo.getString("Translating"), 0).show();
    }
}
