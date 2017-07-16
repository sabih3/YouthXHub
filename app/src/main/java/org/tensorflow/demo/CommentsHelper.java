package org.tensorflow.demo;

import android.content.Context;

/**
 * Created by sabih on 16-Jul-17.
 */

public class CommentsHelper {

    private static Context mContext;

    public static String TEXT_STAGE = "Lorem ipsum lorem ipsum \\n \\n Lorem ipsum lorem ipsum \\n \\n Lorem Lorem";


    public static String getFeed(Context context, String title) {
        mContext = context;
        String comments = "";
        if(title.equalsIgnoreCase("Art Room")){

            comments = context.getResources().getString(R.string.feed_art_room);
        }

        if(title.equalsIgnoreCase("meetingrooms and classrooms")){

            comments = context.getResources().getString(R.string.feed_meeting);
        }

        if(title.equalsIgnoreCase("multimedia")){

            comments = context.getResources().getString(R.string.feed_studio);
        }

        if(title.equalsIgnoreCase("library")){

            comments = context.getResources().getString(R.string.feed_lib);
        }

        if(title.equalsIgnoreCase("disruption lab")){

            comments = context.getResources().getString(R.string.feed_lab);
        }

        if(title.equalsIgnoreCase("stage")){

            comments = context.getResources().getString(R.string.feed_stage);
        }

        if(title.equalsIgnoreCase("kitchen")){

            comments = context.getResources().getString(R.string.feed_kitchen);
        }

        return comments;
    }
}
