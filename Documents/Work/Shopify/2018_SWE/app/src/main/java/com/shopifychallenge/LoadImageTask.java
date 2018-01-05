package com.shopifychallenge;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoadImageTask extends AsyncTask<String, Void, Bitmap> {
    private Listener mListener;

    public LoadImageTask(Listener listener) {
        mListener = listener;
    }

    public interface Listener{
        void onImageLoaded(Bitmap bitmap);
        void onError();
    }

    @Override
    protected Bitmap doInBackground(String... args) {
        return getBitmapFromURL(args[0]);
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        if (bitmap != null) {
            mListener.onImageLoaded(bitmap);
        }
        else {
            mListener.onError();
        }
    }

    public Bitmap getBitmapFromURL (String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}