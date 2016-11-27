package com.lugeek.notificationimage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(this);

        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            send1();
        } else if (v.getId() == R.id.btn2) {
            send2();
        } else if (v.getId() == R.id.btn3) {
            send3();
        }
    }

    private void send1() {
        String title = "😄标题标题标题";
        String content = "内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容";

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        PendingIntent pIntent = createPendingIntent(this, intent);
        builder.setContentIntent(pIntent);

        SpannableString stitle = new SpannableString(title);
        stitle.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4965")), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        builder.setContentTitle(stitle);

        builder.setContentText(content);

        builder.setColor(Color.TRANSPARENT);
        builder.setSmallIcon(R.drawable.small);

        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.large));

        builder.setTicker("ticker");

        builder.setWhen(System.currentTimeMillis());

        builder.setAutoCancel(true);

        builder.setPriority(NotificationCompat.PRIORITY_MAX);

        int defaults = 0;
        defaults |= Notification.DEFAULT_SOUND;
        defaults |= Notification.DEFAULT_VIBRATE;
        defaults |= Notification.DEFAULT_LIGHTS;
        builder.setDefaults(defaults);

        NotificationCompat.BigPictureStyle picStyle = new NotificationCompat.BigPictureStyle();
        picStyle.bigLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.large));
        picStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.bigpic));
        picStyle.setBigContentTitle(stitle);
        picStyle.setSummaryText(content);
        builder.setStyle(picStyle);

        Notification notification = builder.build();

        NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(2333, notification);

    }

    private void send2() {
        String title = "😄标题标题标题";
        String content = "内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容";

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        PendingIntent pIntent = createPendingIntent(this, intent);
        builder.setContentIntent(pIntent);

        SpannableString stitle = new SpannableString(title);
        stitle.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4965")), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        builder.setContentTitle(stitle);

        builder.setContentText(content);

        builder.setColor(Color.TRANSPARENT);
        builder.setSmallIcon(R.drawable.small);

        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.large));

        builder.setTicker("ticker");

        builder.setWhen(System.currentTimeMillis());

        builder.setAutoCancel(true);

        builder.setPriority(NotificationCompat.PRIORITY_MAX);

        int defaults = 0;
        defaults |= Notification.DEFAULT_SOUND;
        defaults |= Notification.DEFAULT_VIBRATE;
        defaults |= Notification.DEFAULT_LIGHTS;
        builder.setDefaults(defaults);

        NotificationCompat.BigPictureStyle picStyle = new NotificationCompat.BigPictureStyle();
        picStyle.bigLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.large));
        picStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.bigpic));
        picStyle.setBigContentTitle(stitle);
        picStyle.setSummaryText(content);
        builder.setStyle(picStyle);

        Notification notification = builder.build();
        notification = formatNotify(notification);

        NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(2333, notification);

    }

    private void send3() {
        String title = "😄标题标题标题";
        String content = "内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容内容";

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        PendingIntent pIntent = createPendingIntent(this, intent);
        builder.setContentIntent(pIntent);

        SpannableString stitle = new SpannableString(title);
        stitle.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4965")), 0, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        builder.setContentTitle(stitle);

        builder.setContentText(content);

        builder.setColor(Color.TRANSPARENT);
        builder.setSmallIcon(R.drawable.small);

        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.large));

        builder.setTicker("ticker");

        builder.setWhen(System.currentTimeMillis());

        builder.setAutoCancel(true);

        builder.setPriority(NotificationCompat.PRIORITY_MAX);

        int defaults = 0;
        defaults |= Notification.DEFAULT_SOUND;
        defaults |= Notification.DEFAULT_VIBRATE;
        defaults |= Notification.DEFAULT_LIGHTS;
        builder.setDefaults(defaults);

        RemoteViews remoteViews = new RemoteViews(this.getPackageName(), R.layout.notification_layout);
        builder.setCustomBigContentView(remoteViews);

        Notification notification = builder.build();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//            notification.bigContentView = remoteViews;
//        }


        NotificationManager manager = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(2333, notification);

    }

    private PendingIntent createPendingIntent(Context context, Intent intent) {
        //requestCode唯一标识Intent,若requestCode是同一个,则intent携带的extra数据将不会更新.
        int requestCode = (int) SystemClock.uptimeMillis();
        return PendingIntent.getActivity(context, requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * 格式化通知，通过系统RemoteView已封装的反射方法来设置通知中组件UI
     *
     * @param notification 待格式化的通知
     * @return 已格式化的通知
     */
    private Notification formatNotify(Notification notification) {
        Context mContext = this;
        //隐藏小图标
        int smallIconViewId = mContext.getResources().getIdentifier("right_icon", "id", android.R.class.getPackage().getName());
        if (smallIconViewId != 0) {
            if (notification.contentView != null) {
                notification.contentView.setViewVisibility(smallIconViewId, View.GONE);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (notification.headsUpContentView != null) {
                    notification.headsUpContentView.setViewVisibility(smallIconViewId, View.GONE);
                }
                if (notification.bigContentView != null) {
                    notification.bigContentView.setViewVisibility(smallIconViewId, View.GONE);
                }
            }
        }
        //设置通知内容为两行
        int textId = mContext.getResources().getIdentifier("text", "id", android.R.class.getPackage().getName());
        if (textId != 0) {
            if (notification.contentView != null) {
                notification.contentView.setBoolean(textId, "setSingleLine", false);
                notification.contentView.setInt(textId, "setMaxLines", 2);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (notification.headsUpContentView != null) {
                    notification.headsUpContentView.setBoolean(textId, "setSingleLine", false);
                    notification.headsUpContentView.setInt(textId, "setMaxLines", 2);
                }
                if (notification.bigContentView != null) {
                    notification.bigContentView.setBoolean(textId, "setSingleLine", false);
                    notification.bigContentView.setInt(textId, "setMaxLines", 2);
                }
            }
        }
        //设置通知标题的padding为0，满足两行显示的空间
        int line1Id = mContext.getResources().getIdentifier("line1", "id", android.R.class.getPackage().getName());
        if (line1Id != 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                if (notification.contentView != null) {
                    notification.contentView.setViewPadding(line1Id, 0, 0, 0, 0);
                }
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (notification.headsUpContentView != null) {
                    notification.headsUpContentView.setViewPadding(line1Id, 0, 0, 0, 0);
                }
                if (notification.bigContentView != null) {
                    notification.bigContentView.setViewPadding(line1Id, 0, 0, 0, 0);
                }
            }
        }
        //设置通知的标题和内容居中显示
        int llid = mContext.getResources().getIdentifier("notification_main_column", "id", android.R.class.getPackage().getName());
        if (llid != 0) {
            if (notification.contentView != null) {
                notification.contentView.setInt(llid, "setGravity", Gravity.CENTER_VERTICAL);
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if (notification.headsUpContentView != null) {
                    notification.headsUpContentView.setInt(llid, "setGravity", Gravity.CENTER_VERTICAL);
                }
                if (notification.bigContentView != null) {
                    notification.bigContentView.setInt(llid, "setGravity", Gravity.CENTER_VERTICAL);
                }
            }
        }

        return notification;
    }
}
