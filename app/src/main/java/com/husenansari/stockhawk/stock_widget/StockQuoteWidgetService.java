package com.husenansari.stockhawk.stock_widget;

import android.content.Intent;
import android.widget.RemoteViewsService;


public class StockQuoteWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StockQuoteWidgetFactory(getApplicationContext(),intent);
    }
}
