package com.rahuljanagouda.statusstories.glideProgressBar;

import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

/**
 * Created by rahuljanagouda on 30/09/17.
 */

public final class NoOpRequestListener<A, B> implements RequestListener<A, B> {
    private static final RequestListener INSTANCE = new NoOpRequestListener();

    @SuppressWarnings("unchecked")
    public static <A, B> RequestListener<A, B> get() {
        return INSTANCE;
    }

    private NoOpRequestListener() {
    }

    @Override public boolean onException(Exception e, A a, Target<B> target, boolean b) {
        return false;
    }
    @Override public boolean onResourceReady(B b, A a, Target<B> target, boolean b2, boolean b1) {
        return false;
    }
}
