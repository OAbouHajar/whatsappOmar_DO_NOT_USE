package com.AssemMods.fakechat.utils;

import X.C005402i;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.AssemMods.fakechat.adapter.ChatRowAdapter;
import com.AssemMods.fakechat.adapter.ConversationRowAdapter;
import com.AssemMods.fakechat.database.DB;
import com.AssemMods.fakechat.model.Chat;
import com.AssemMods.fakechat.model.WhatsAppMessage;
import com.AssemMods.fakechat.preference.BaseSettingsActivity;
import java.util.ArrayList;
import java.util.List;

public class Conversations extends BaseSettingsActivity implements AdapterView.OnItemClickListener {
    private static int[] CONVERSATION_STATE = null;
    private static final int ID_MENU_DELETE = 1;
    private static final int ID_MENU_INSERT_AFTER = 4;
    private static final int ID_MENU_INSERT_BEFORE = 3;
    private static final int ID_MENU_MODIFY = 2;
    private static Handler createMessageHandler = new Handler() {
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            String string = data.getString("message");
            boolean z2 = data.getBoolean(AppUtils.HANDLER_FROMME_KEY);
            long j2 = data.getLong(AppUtils.HANDLER_TS_KEY);
            boolean z3 = data.getBoolean(AppUtils.HANDLER_READ_KEY);
            String keyId = Conversations.mActivity.mActualChat.getLastMessage().getKeyId();
            WhatsAppMessage whatsAppMessage = new WhatsAppMessage();
            whatsAppMessage.setData(string);
            whatsAppMessage.setFromMe(z2);
            whatsAppMessage.setTs(j2);
            whatsAppMessage.setReceivedTs(j2);
            whatsAppMessage.setStatus(z3 ? 5 : 4);
            String str = (j2 / 1000) + "-1";
            whatsAppMessage.setKeyId((j2 / 1000) + "-1");
            whatsAppMessage.setRemoteJid(Conversations.mActivity.mActualChat.getJid());
            Conversations.mActivity.addMessage(whatsAppMessage);
        }
    };
    /* access modifiers changed from: private */
    public static Conversations mActivity;
    private static Handler mModifyMessageHandler = new Handler() {
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            Conversations.mActivity.modifyMessage(data.getInt("id"), data.getString("message"), data.getLong(AppUtils.HANDLER_TS_KEY));
        }
    };
    /* access modifiers changed from: private */
    public Chat mActualChat;
    private ListView mChatListView;
    private int mChatPosition;
    private List<Chat> mChatRowsList;
    private ListView mConversationListView;
    private DB mDB;
    private boolean mError;
    private STATE mState;
    private TextView mTitle;

    private enum STATE {
        CHATS,
        CONVERSATION,
        SEARCH
    }

    static int[] CONVERSATION_STATE() {
        int[] iArr = CONVERSATION_STATE;
        if (iArr == null) {
            iArr = new int[STATE.values().length];
            try {
                iArr[STATE.CHATS.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e2.printStackTrace();
            }
            try {
                iArr[STATE.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
                e3.printStackTrace();
            }
            try {
                iArr[STATE.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
                e4.printStackTrace();
            }
            CONVERSATION_STATE = iArr;
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    /* access modifiers changed from: private */
    public void addMessage(WhatsAppMessage whatsAppMessage) {
        AppUtils.makeToast((Context) this, "Message created successfully");
        this.mDB.addMessage(whatsAppMessage);
        getConversation(this.mActualChat);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void askForMessageModified() {
        /*
            r11 = this;
            com.AssemMods.fakechat.utils.NewMessage r10 = new com.AssemMods.fakechat.utils.NewMessage
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            com.AssemMods.fakechat.model.WhatsAppMessage r2 = r0.getMessage(r1)
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            long r3 = r0.getMessagePreviousTs(r1)
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            long r5 = r0.getMessageNextTs(r1)
            android.os.Handler r9 = mModifyMessageHandler
            r7 = 0
            r8 = 0
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            android.view.Window r1 = r0.getWindow()
            r2 = -1
            r3 = -2
            r1.setLayout(r2, r3)
            android.view.Window r1 = r0.getWindow()
            java.lang.String r2 = "new_message_background"
            int r2 = com.AssemMods.fakechat.utils.Resources.getId(r2)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            java.lang.String r2 = "new_message_content_layout"
            int r3 = com.AssemMods.fakechat.utils.Resources.getId(r2)
            r4 = 8
            r1.addRule(r4, r3)
            int r3 = com.AssemMods.fakechat.utils.Resources.getId(r2)
            r4 = 5
            r1.addRule(r4, r3)
            int r3 = com.AssemMods.fakechat.utils.Resources.getId(r2)
            r4 = 7
            r1.addRule(r4, r3)
            int r2 = com.AssemMods.fakechat.utils.Resources.getId(r2)
            r3 = 6
            r1.addRule(r3, r2)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.AssemMods.fakechat.utils.Conversations.askForMessageModified():void");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void askForNewMessage(boolean r12) {
        /*
            r11 = this;
            com.AssemMods.fakechat.utils.NewMessage r10 = new com.AssemMods.fakechat.utils.NewMessage
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            com.AssemMods.fakechat.model.WhatsAppMessage r2 = r0.getMessage(r1)
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            long r3 = r0.getMessagePreviousTs(r1)
            com.AssemMods.fakechat.model.Chat r0 = r11.mActualChat
            int r1 = r11.mChatPosition
            long r5 = r0.getMessageNextTs(r1)
            android.os.Handler r9 = createMessageHandler
            r7 = 1
            r0 = r10
            r1 = r11
            r8 = r12
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r10.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.AssemMods.fakechat.utils.Conversations.askForNewMessage(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void confirmDeleteMessage() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(Resources.getString("delete_message_title"));
        builder.setMessage(Resources.getString("delete_message_conf"));
        builder.setPositiveButton(Resources.getString("delete_button"), new fakeConv1(this));
        builder.setNegativeButton(Resources.getString("cancel_button"), fakeConv2.INSTANCE);
        builder.show();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void deleteMessage(int i2) {
        this.mDB.deleteMessage(i2);
        AppUtils.makeToast((Context) this, Resources.getString("message_deleted_ok"));
        getConversation(this.mActualChat);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void getChats() {
        int i2 = 0;
        this.mChatRowsList = this.mDB.getContacts();
        while (this.mChatRowsList == null && i2 < 3) {
            i2++;
            this.mChatRowsList = this.mDB.getContacts();
        }
        if (this.mChatRowsList == null) {
            AppUtils.makeToast((Context) mActivity, Resources.getString("db_error"));
            this.mError = true;
            return;
        }
        mActivity.showChats();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void getConversation(Chat chat) {
        int i2 = 0;
        this.mActualChat.setMessages(this.mDB.getConversation(chat));
        while (this.mActualChat.getMessages() == null && i2 < 3) {
            i2++;
            this.mActualChat.setMessages(this.mDB.getConversation(chat));
        }
        if (this.mActualChat.getMessages() == null) {
            AppUtils.makeToast((Context) mActivity, Resources.getString("db_error"));
            this.mError = true;
            return;
        }
        mActivity.showConversation();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    /* access modifiers changed from: private */
    public void modifyMessage(int i2, String str, long j2) {
        AppUtils.makeToast((Context) this, Resources.getString("message_modified_ok"));
        this.mDB.modifyMessage(i2, str, j2);
        getConversation(this.mActualChat);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void showChats() {
        this.mChatListView.setAdapter(new ChatRowAdapter(this, this.mChatRowsList));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    private void showConversation() {
        this.mConversationListView.setVisibility(0);
        this.mChatListView.setVisibility(4);
        this.mConversationListView.setAdapter(new ConversationRowAdapter(this, this.mActualChat.getMessages()));
        ListView listView = this.mConversationListView;
        listView.setSelection(listView.getCount() - 1);
    }

    public Chat getContact(String str) {
        for (Chat next : this.mChatRowsList) {
            if (next.getJid().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public /* synthetic */ void lambda$confirmDeleteMessage$0$Conversations(DialogInterface dialogInterface, int i2) {
        deleteMessage(this.mActualChat.getMessageId(this.mChatPosition));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations, com.AssemMods.fakechat.preference.BaseSettingsActivity] */
    public void onBackPressed() {
        if (BaseSettingsActivity.mustRestart) {
            BaseSettingsActivity.restartHome();
        }
        if (this.mState == STATE.CONVERSATION && !this.mError) {
            this.mChatListView.setAdapter(new ChatRowAdapter(this, this.mChatRowsList));
            this.mChatListView.setSelection(0);
            this.mChatListView.setVisibility(0);
            this.mConversationListView.setVisibility(4);
            this.mState = STATE.CHATS;
            this.mTitle.setText(Resources.getString("chats_title"));
            this.mTitle.setTextSize(getResources().getDimension(Resources.getDimen("title_size_chats")));
        } else if (this.mState == STATE.SEARCH) {
            this.mState = STATE.CHATS;
        } else if (this.mError) {
            super.onBackPressed();
        } else {
            try {
                this.mDB.close();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            super.onBackPressed();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        if (this.mActualChat != null && this.mChatPosition >= 0) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                confirmDeleteMessage();
                BaseSettingsActivity.mustRestart = true;
            } else if (itemId == 2) {
                askForMessageModified();
                BaseSettingsActivity.mustRestart = true;
            } else if (itemId == 3) {
                askForNewMessage(true);
                BaseSettingsActivity.mustRestart = true;
            } else if (itemId == 4) {
                askForNewMessage(false);
                BaseSettingsActivity.mustRestart = true;
            }
        }
        this.mError = true;
        return true;
    }

    public void onContextMenuClosed(Menu menu) {
        getConversation(this.mActualChat);
        super.onContextMenuClosed(menu);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations, com.AssemMods.fakechat.preference.BaseSettingsActivity, X.00j, android.widget.AdapterView$OnItemClickListener] */
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        x2.A0I("Modify/Edit Chats");
        x2.A0M(true);
        x2.A0P(true);
        setContentView(Resources.getLayout("AssemMods_conversations_list"));
        mActivity = this;
        this.mChatListView = (ListView) findViewById(Resources.getId("chat_list_listview"));
        ListView listView = (ListView) findViewById(Resources.getId("conversations_list_listview"));
        this.mConversationListView = listView;
        listView.setVisibility(4);
        this.mConversationListView.setOnItemClickListener(this);
        try {
            this.mDB = DB.startDB();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        int i2 = 0;
        while (this.mDB == null && i2 < 3) {
            i2++;
            try {
                this.mDB = DB.startDB();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (this.mDB == null) {
            AppUtils.makeToast((Context) this, Resources.getString("db_error"));
            this.mError = true;
            return;
        }
        this.mState = STATE.CHATS;
        this.mChatRowsList = new ArrayList();
        TextView textView = (TextView) findViewById(Resources.getId("conversations_list_title"));
        this.mTitle = textView;
        textView.setTextSize(getResources().getDimension(Resources.getDimen("title_size_chats")));
        getChats();
        if (this.mDB == null) {
            AppUtils.makeToast((Context) this, Resources.getString("db_error"));
            this.mError = true;
            return;
        }
        this.mChatListView.setOnItemClickListener(this);
        registerForContextMenu(this.mConversationListView);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (this.mState == STATE.CONVERSATION) {
            this.mChatPosition = ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
            contextMenu.setHeaderTitle(Resources.getString("message_options_title"));
            contextMenu.add(0, 1, 0, Resources.getString("delete_message_option"));
            contextMenu.add(0, 2, 0, Resources.getString("modify_message_option"));
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.AssemMods.fakechat.utils.Conversations] */
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        int i3 = CONVERSATION_STATE()[this.mState.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                openContextMenu(view);
                return;
            } else if (i3 != 3) {
                return;
            }
        }
        Chat contact = getContact(((Chat) adapterView.getItemAtPosition(((ChatRowAdapter) this.mChatListView.getAdapter()).getRealPosition(i2))).getJid());
        this.mActualChat = contact;
        if (contact == null) {
            AppUtils.makeToast((Context) this, Resources.getString("error_lookingfor_contact"));
            return;
        }
        this.mState = STATE.CONVERSATION;
        this.mChatListView.setVisibility(4);
        this.mConversationListView.setVisibility(0);
        getConversation(this.mActualChat);
        this.mTitle.setText(this.mActualChat.getName());
        this.mTitle.setTextSize(getResources().getDimension(Resources.getDimen("title_size_conversation")));
    }
}
