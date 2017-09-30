package com.rahuljanagouda.statusstories.glideProgressBar;

import android.graphics.Bitmap;
import android.util.Log;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * Created by rahuljanagouda on 30/09/17.
 */

public class DelayBitmapTransformation extends BitmapTransformation {
    private final int delay;
    public DelayBitmapTransformation(int delay) {
        super((BitmapPool)null);
        this.delay = delay;
    }
    @Override protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int w, int h) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.i("DELAY", "Sleeping for " + delay + "ms was interrupted.", e);
        }
        return toTransform;
    }
    @Override public String getId() {
        return "";
    }
}
