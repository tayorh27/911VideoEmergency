package com.call.a911videoemergency;

import com.call.a911videoemergency.util.QBResRequestExecutor;
import com.quickblox.sample.core.CoreApp;

/**
 * Created by sanniAdewale on 27/06/2017.
 */

public class App extends CoreApp {

    private static App instance;
    private QBResRequestExecutor qbResRequestExecutor;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication();
    }

    private void initApplication() {
        instance = this;
    }

    public synchronized QBResRequestExecutor getQbResRequestExecutor() {
        return qbResRequestExecutor == null
                ? qbResRequestExecutor = new QBResRequestExecutor()
                : qbResRequestExecutor;
    }
}
