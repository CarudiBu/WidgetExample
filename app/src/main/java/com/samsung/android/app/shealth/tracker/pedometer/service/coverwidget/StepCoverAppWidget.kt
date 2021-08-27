package com.samsung.android.app.shealth.tracker.pedometer.service.coverwidget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.sec.android.app.shealth.R


class StepCoverAppWidget: AppWidgetProvider() {

    override fun onReceive(context: Context?, intent: Intent) {
        super.onReceive(context, intent)
    }

    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        appWidgetIds?.forEach { appWidgetId ->
            val views = RemoteViews(
                context?.packageName,
                R.layout.cover_widget_layout
            )

            appWidgetManager?.updateAppWidget(appWidgetId, views)

        }
    }
}